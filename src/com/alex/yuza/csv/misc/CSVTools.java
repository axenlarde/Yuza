package com.alex.yuza.csv.misc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.alex.yuza.csv.analogs.CSVAnalogLine;
import com.alex.yuza.csv.didranges.CSVDIDRangesLine;
import com.alex.yuza.csv.huntlist.CSVHuntListLine;
import com.alex.yuza.csv.huntlist.CSVHuntListLinksLine;
import com.alex.yuza.csv.huntpilot.CSVHuntPilotLine;
import com.alex.yuza.csv.huntpilot.CSVHuntPilotLinksLine;
import com.alex.yuza.csv.linegroup.CSVLineGroupLine;
import com.alex.yuza.csv.linegroup.CSVLineGroupLinksLine;
import com.alex.yuza.csv.pickup.CSVPickupLine;
import com.alex.yuza.csv.pickup.CSVPickupLinksLine;
import com.alex.yuza.csv.user.CSVUserLine;
import com.alex.yuza.misc.DIDRange;
import com.alex.yuza.misc.DIDRangeManager;
import com.alex.yuza.misc.Site;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.Tester;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.xMLGear;
import com.alex.yuza.utils.xMLReader;
import com.alex.yuza.utils.Variables.gwType;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

/**********************************
 * Class used to store static method used to create CSV file
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVTools
	{
	
	/*******
	 * Method used to read the CSV template file content
	 * @throws Exception 
	 */
	public static ArrayList<ArrayList<String>> csvTemplateReader(String fileName) throws Exception
		{
		ArrayList<ArrayList<String>> headersList = new ArrayList<ArrayList<String>>();
		ArrayList<String[][]> result;
		ArrayList<String> listParams = new ArrayList<String>();
		listParams.add("rows");
		listParams.add("row");
		
		Variables.getLogger().info("Reading the file : "+fileName);
		String fileContent = xMLReader.fileRead(fileName);
		
		result = xMLGear.getResultListTab(fileContent, listParams);
		
		//We convert ArrayList<String[][]> into ArrayList<ArrayList<String>>
		for(String[][] tab : result)
			{
			ArrayList<String> list = new ArrayList<String>();
			for(String[] s : tab)
				{
				list.add(s[1]);
				}
			headersList.add(list);
			}
		
		return headersList;
		}
	
	
	/****************
	 * Method used to build the CSVLine list dedicated to user file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVUserLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		String csvSmartExport = UsefulMethod.getTargetOption("csvsmartexport");
		String csvMark = UsefulMethod.getTargetOption("csvmark");
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		int[] userInfos = CollectionTools.getMatcherInfo("cucm.userid");
		
		for(int i=0; i<lastIndex; i++)
			{
			String phone1 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);//Just to make the following easier
			
			try
				{
				String mac = "";
				try
					{
					mac = CollectionTools.getValueFromCollectionFile(i, "*C*cucm.mac", myWorkbook);
					}
				catch (EmptyValueException eve)
					{
					if(!((phone1.contains("DECT")) || (phone1.contains("JABBER"))))
						{
						Variables.getLogger().debug("The mac of the line "+(userInfos[2]+i+1)+" is empty, so we skip it");
						continue;//If the mac is empty, we skip it except if it is a DECT or a softphone
						}
					}
				
				//If it is a Voice gateway : we skip it
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(phone1.equals("FAX")) ||
						(phone1.equals("ANALOG")))
					{
					Variables.getLogger().debug("The user line "+(userInfos[2]+i+1)+" doesn't have to be processed, so we skip it");
					}
				else
					{
					//We check if the marker is present and if yes we does not process this entry
					try
						{
						if((csvSmartExport.equals("true")) &&
								(CollectionTools.getValueFromCollectionFile(i, "cnaf.done", myWorkbook).equals(csvMark)))
							{
							Variables.getLogger().debug("According to the marker, the user line "+(userInfos[2]+i+1)+" has already been processed previously, so we skip it");
							continue;
							}
						}
					catch (EmptyValueException eve)
						{
						//Nothing, it just means that the marker is not present
						}
					
					//We want to know if the MAC address is a correct one or if it is a DECT
					if((Tester.macValide(mac)) ||
							(phone1.contains("JABBER")) ||
							(phone1.contains("DECT")))
						{
						//We add a new CSVLine to the list
						myList.add(new CSVUserLine(csvFieldList, i, myWorkbook));
						Variables.getLogger().debug("New entry added for the line "+(userInfos[2]+i+1));
						}
					else
						{
						Variables.getLogger().info("Line "+(userInfos[2]+i+1)+" the following mac address seems not to be a good one : "+mac);
						//Has to be improved. We should do more than just write down the error in the log
						}
					}
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("Empty value found line "+(userInfos[2]+i+1)+" so we skip it : "+eve.getMessage());
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVUserLine arraylist line "+(userInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
			
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Analog file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVAnalogLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		String csvSmartExport = UsefulMethod.getTargetOption("csvsmartexport");
		String csvMark = UsefulMethod.getTargetOption("csvmark");
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		int[] userInfos = CollectionTools.getMatcherInfo("cucm.userid");
		
		for(int i=0; i<lastIndex; i++)
			{
			
			try
				{
				/**
				 * Here we are interested only by analog phones
				 */
				String phone1 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);//Just to make the following easier
				if((phone1.equals("FAX")) || (phone1.equals("ANALOG")))
					{
					//We check if the marker is present and if yes we does not process this entry
					try
						{
						if((csvSmartExport.equals("true")) &&
								(CollectionTools.getValueFromCollectionFile(i, "cnaf.done", myWorkbook).equals(csvMark)))
							{
							Variables.getLogger().debug("According to the marker, the user line "+(userInfos[2]+i+1)+" has already been processed previously, so we skip it");
							continue;
							}
						}
					catch (EmptyValueException eve)
						{
						//Nothing, it just means that the marker is not present
						}
					
					/**
					 * If it is an Audiocodes, we do not care about the mac address
					 * but if it is a VG2XX we need it
					 */
					
					gwType analogKind = UsefulMethod.convertGatewayType(CollectionTools.getValueFromCollectionFile(i, "cnaf.gatewayinfo", myWorkbook));
					int port = UsefulMethod.convertGatewayPort(CollectionTools.getValueFromCollectionFile(i, "cnaf.gatewayport", myWorkbook));
					
					if(analogKind.equals(gwType.vg))
						{
						//VG
						String mac = CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);
						if(Tester.macValide(mac))
							{
							//We add a new CSVLine to the list
							myList.add(new CSVAnalogLine(csvFieldList, i, gwType.vg, port, myWorkbook));
							Variables.getLogger().debug("New VG2XX added for the line "+(userInfos[2]+i+1));
							}
						else
							{
							Variables.getLogger().info("Line "+(userInfos[2]+i+1)+" the following mac address seems to be not a good one : "+mac);
							//Has to be improved. We should do more than just write down the error
							}
						}
					else
						{
						//Audiocodes
						myList.add(new CSVAnalogLine(csvFieldList, i, gwType.audiocodes, port, myWorkbook));
						Variables.getLogger().debug("New AudioCodes added for the line "+(userInfos[2]+i+1));
						}
					}
				else
					{
					Variables.getLogger().debug("The user line "+(userInfos[2]+i+1)+" doesn't have to be processed, so we skip it");
					}
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("Empty value found line "+(userInfos[2]+i+1)+" so we skip it : "+eve.getMessage());
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVAnalogLine arraylist line "+(userInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
			
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to pickup file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVPickupLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.pickupname", myWorkbook);
		int[] pickupInfos = CollectionTools.getMatcherInfo("cucm.pickupname");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				//We add a new CSVLine to the list
				myList.add(new CSVPickupLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Pickup entry added for the line "+(pickupInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVPickupLine arraylist for the line "+(pickupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to pickup Links file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVPickupLinksLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastPickupIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.pickupname", myWorkbook);
		int[] pickupInfos = CollectionTools.getMatcherInfo("cucm.pickupname");
		int lastUserIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastPickupIndex; i++)
			{		
			try
				{
				String pickupName = CollectionTools.getValueFromCollectionFile(i, "cucm.pickupname", myWorkbook);//To make the following easier
				
				//We first need to find the list of users to link to this pickup group
				ArrayList<Integer> userList = findItemsAssociatedToUsers(
						pickupName,
						"cucm.pickupuser",
						lastUserIndex,
						myWorkbook);
				
				if(userList.size()>0)
					{
					//We then add the first line
					myList.add(new CSVPickupLinksLine(csvFieldList, i, userList.get(0), true, myWorkbook));
					
					//And finally the others dedicated to the associated lines
					for(int y=1; y<userList.size(); y++)
						{
						myList.add(new CSVPickupLinksLine(csvFieldList, i, userList.get(y), false, myWorkbook));
						}
					
					Variables.getLogger().debug("New Links added for the Pickup Group "+pickupName+" line "+(pickupInfos[2]+i+1));
					}
				else
					{
					Variables.getLogger().debug("The Pickup Group "+pickupName+" has no associated user line "+(pickupInfos[2]+i+1));
					}
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVPickupLinksLine arraylist for the line "+(pickupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	
	/****************
	 * Method used to build the CSVLine list dedicated to Line Group Links file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVLGLinksLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastLGIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] pickupInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		int lastUserIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastLGIndex; i++)
			{		
			try
				{
				String lineGroupName = CollectionTools.getValueFromCollectionFile(i, "cucm.linegroupname", myWorkbook);//To make the following easier
				
				//We first need to find the list of users to link to this line Group
				ArrayList<Integer> userList = findItemsAssociatedToUsers(
						lineGroupName,
						"cucm.linegroupuser",
						lastUserIndex,
						myWorkbook);
				
				if(userList.size()>0)
					{
					//We then add the first line
					myList.add(new CSVLineGroupLinksLine(csvFieldList, i, userList.get(0), true, myWorkbook));
					
					//And finally the others dedicated to the associated lines
					for(int y=1; y<userList.size(); y++)
						{
						myList.add(new CSVLineGroupLinksLine(csvFieldList, i, userList.get(y), false, myWorkbook));
						}
					
					Variables.getLogger().debug("New Links added for the Line Group "+lineGroupName+" line "+(pickupInfos[2]+i+1));
					}
				else
					{
					Variables.getLogger().debug("The Line Group "+lineGroupName+" has no associated user line "+(pickupInfos[2]+i+1));
					}
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVLGLinksLine arraylist for the line "+(pickupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Hunt List Links file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVHLLinksLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastHLIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] hlInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		int lastUserIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastHLIndex; i++)
			{		
			try
				{
				myList.add(new CSVHuntListLinksLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Links added for the hunt list "+
						CollectionTools.getValueFromCollectionFile(i, "cucm.linegroupname", myWorkbook)+
						" line "+(hlInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVHLLinksLine arraylist for the line "+(hlInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Hunt Pilot Links file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVHPLinksLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastHPIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] hpInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		int lastUserIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastHPIndex; i++)
			{		
			try
				{
				myList.add(new CSVHuntPilotLinksLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Links added for the hunt pilot "+
						CollectionTools.getValueFromCollectionFile(i, "cucm.linegroupname", myWorkbook)+
						" line "+(hpInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVHPLinksLine arraylist for the line "+(hpInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Line Group file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVLineGroupLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] lineGroupInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		
		for(int i=0; i<lastIndex; i++)
			{			
			try
				{
				//We add a new CSVLine to the list
				myList.add(new CSVLineGroupLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Line Group entry added for the line "+(lineGroupInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVLineGroupLine arraylist for the line "+(lineGroupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Hunt List file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVHuntListLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] lineGroupInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		
		for(int i=0; i<lastIndex; i++)
			{			
			try
				{
				//We add a new CSVLine to the list
				myList.add(new CSVHuntListLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Pickup entry added for the line "+(lineGroupInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVHuntListLine arraylist for the line "+(lineGroupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to Hunt Pilot file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVHuntPilotLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] lineGroupInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		
		for(int i=0; i<lastIndex; i++)
			{			
			try
				{
				//We add a new CSVLine to the list
				myList.add(new CSVHuntPilotLine(csvFieldList, i, myWorkbook));
				Variables.getLogger().debug("New Pickup entry added for the line "+(lineGroupInfos[2]+i+1));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the CSVHuntPilotLine arraylist for the line "+(lineGroupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/****************
	 * Method used to build the CSVLine list dedicated to DID Ranges file
	 * @throws Exception 
	 */
	public static ArrayList<CSVLine> buildCSVDIDRangesLineList(ArrayList<CSVField> csvFieldList, Workbook myWorkbook) throws Exception
		{
		ArrayList<CSVLine> myList = new ArrayList<CSVLine>();
		
		ArrayList<DIDRange> myDIDRangeList = DIDRangeManager.getDIDRanges(false, myWorkbook);
		
		for(int i=0; i<myDIDRangeList.size(); i++)
			{
			myList.add(new CSVDIDRangesLine(myDIDRangeList.get(i), csvFieldList, i, myWorkbook));
			}
		
		return myList;
		}
	
	
	/****************
	 * Method used to write the headers down in the CSV file
	 * @throws IOException 
	 */
	public static void writeHeaders(ArrayList<ArrayList<String>> csvHeaders, BufferedWriter myBuffer) throws IOException
		{
		for(ArrayList<String> myList : csvHeaders)
			{
			StringBuffer line = new StringBuffer();
			for(String s : myList)
				{
				line.append(s);
				line.append(Variables.getCsvSeparator());
				}
			myBuffer.write(line.substring(0, line.length()-1)+Variables.getCsvLineReturn());//We remove the last separator and we write the line
			}
		}
	
	/****************
	 * Method used to write the csvLine content down in the CSV file
	 * @throws IOException 
	 */
	public static void writeCSVLines(ArrayList<CSVLine> csvLineList, BufferedWriter myBuffer) throws Exception
		{
		for(CSVLine line : csvLineList)
			{
			//We write the line
			line.write(myBuffer);
			}
		}
	
	/***
	 * Method used to convert raw header into CSVField
	 * 
	 * For instance convert [Line_callForwardBusyIntDest]:cucm.forwardbusyint into a CSVField
	 * with :
	 * - Name = [Line_callForwardBusyIntDest]
	 * - Value = cucm.forwardbusyint
	 * @throws Exception 
	 */
	public static ArrayList<CSVField> parseCSVHeaders(ArrayList<ArrayList<String>> csvHeaders) throws Exception
		{
		try
			{
			ArrayList<CSVField> myList = new ArrayList<CSVField>();
			for(String s : csvHeaders.get(csvHeaders.size()-1))//Here we keep just the last header row
				{
				String[] tab = s.split(":");
				myList.add(new CSVField(tab[0], tab[1]));
				}
			
			return myList;
			}
		catch (Exception e)
			{
			throw new Exception("Error while converting the headers into CSVField. Check if all the headers have got \":\" to be splittable : "+e.getMessage());
			}
		}
	
	/**
	 * Method used to modify the headers a bit to convert the last row into a real header.
	 * Indeed, currently it is made of values such as : [Line_callForwardBusyIntDest]:cucm.forwardbusyint
	 * We just want to what we gonne write into the csv file : [Line_callForwardBusyIntDest]
	 * @throws Exception 
	 */
	public static ArrayList<ArrayList<String>> cleanHeaders(ArrayList<ArrayList<String>> csvHeaders) throws Exception
		{
		try
			{
			int index = csvHeaders.size()-1;//To make the following easier put the last header row in an integer
			
			for(int i=0; i<csvHeaders.get(index).size(); i++)
				{
				String[] tab = csvHeaders.get(index).get(i).split(":");
				csvHeaders.get(index).set(i, tab[0]);
				}
			
			return csvHeaders;
			}
		catch (Exception e)
			{
			throw new Exception("Error while cleaning the CSV headers : "+e.getMessage());
			}
		}
	
	
	/*********
	 * Method used to write a mark in the csv file
	 * @throws Exception 
	 */
	public static void writeMarker(ArrayList<CSVLine> csvLineList, Workbook myWorkbook, String collectionFileName) throws Exception
		{
		String csvMark = UsefulMethod.getTargetOption("csvmark");
		
		if(UsefulMethod.getTargetOption("csvsmartexport").equals("true"))
			{
			int[] markInfos = CollectionTools.getMatcherInfo("cnaf.done");
			
			for(CSVLine l : csvLineList)
				{
				CollectionTools.writeStringInTheCollectionFile(collectionFileName, csvMark, markInfos[0], markInfos[1], markInfos[2]+l.getIndex(), myWorkbook);
				Variables.getLogger().debug("\""+csvMark+"\" has been added as a reminder for the user line "+( markInfos[2]+l.getIndex()+1));
				}
			}
		else
			{
			Variables.getLogger().debug("No mark have been requested to remember which line have already been exported");
			}
		}
	
	/**
	 * Method used to return the list of index of all
	 * the users associated to the Given item
	 * @throws Exception 
	 */
	private static ArrayList<Integer> findItemsAssociatedToUsers(String itemName, String lookFor, int lastUserIndex, Workbook myWorkbook) throws Exception
		{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		try
			{
			int[] userInfos = CollectionTools.getMatcherInfo("cucm.userid");
			
			for(int i=0; i<lastUserIndex; i++)
				{
				try
					{
					if(CollectionTools.getValueFromCollectionFile(i, lookFor, myWorkbook).equals(itemName))
						{
						myList.add(i);
						Variables.getLogger().debug("The user "+
								CollectionTools.getValueFromCollectionFile(i, "cucm.userid", myWorkbook)+
								" line "+(userInfos[2]+i+1)+
								" will be associated to the following item : "+itemName);
						}
					}
				catch (EmptyValueException e)
					{
					//Nothing
					}
				}
			}
		catch (Exception e)
			{
			throw e;
			}
		
		return myList;
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

