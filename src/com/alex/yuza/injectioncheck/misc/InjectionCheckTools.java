package com.alex.yuza.injectioncheck.misc;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.pickup.CSVPickupLine;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PhoneLine;
import com.alex.yuza.misc.PhoneService;
import com.alex.yuza.sd.SpeedDial;
import com.alex.yuza.site.CallPickupGroup;
import com.alex.yuza.site.HuntList;
import com.alex.yuza.site.HuntPilot;
import com.alex.yuza.site.LineGroup;
import com.alex.yuza.user.Line;
import com.alex.yuza.user.Phone;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.gwType;
import com.alex.yuza.utils.Variables.itemType;

/**********************************
 * Class used to store static method about injeciton
 * checking
 * 
 * @author RATEL Alexandre
 **********************************/
public class InjectionCheckTools
	{
	
	/**
	 * Method used to build the phone injection list
	 */
	public static ArrayList<ItemToInject> setPhoneList(Workbook myWorkbook, ArrayList<ItemToInject> phoneTemplateList) throws Exception
		{
		ArrayList<ItemToInject> phoneItemToInjectList = new ArrayList<ItemToInject>();
		
		//To make the following easier, we prepare here the user template items
		Phone phoneTemplate = null;
		
		for(ItemToInject item : phoneTemplateList)
			{
			if(item.getType().equals(itemType.phone))
				{
				phoneTemplate = (Phone) item;
				}
			}
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		int[] infos = CollectionTools.getMatcherInfo("cucm.userid");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				/***************
				 * we have to create the Phone
				 * 
				 * We have to manage the following exception :
				 * - DECT
				 * - Jabber
				 * - VG2XX
				 * - Audiocodes
				 */
				String deviceName = "";
				String phone1 = "";
				String phone2 = "";
				String phone3 = "";
				
				/**
				 * Used to determine the phones value
				 */
				try
					{
					phone1 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);
					phone2 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype2", myWorkbook);
					phone3 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype3", myWorkbook);
					}
				catch (EmptyValueException eve)
					{
					//We do nothing here
					}
				
				try
					{
					deviceName = CollectionTools.getValueFromCollectionFile(i, phoneTemplate.getName(), myWorkbook);
					}
				catch (EmptyValueException eve)
					{
					if((phone1.equals("FAX")) || (phone1.equals("ANALOG")))
						{
						//Nothing
						}
					else
						{
						deviceName = "MAC_UNKNOWN";
						}
					}
				
				
				String lineNumber = CollectionTools.getValueFromCollectionFile(i, "cucm.linenumber", myWorkbook);
				String userID = CollectionTools.getValueFromCollectionFile(i, "*M*cucm.userid", myWorkbook);
				
				if((phone1.equals("FAX")) || (phone1.equals("ANALOG")))
					{
					try
						{
						//We need to know if it is a VG or an Audiocodes
						gwType type = UsefulMethod.convertGatewayType(CollectionTools.getValueFromCollectionFile(i, "cnaf.gatewayinfo", myWorkbook));
						
						if(type.equals(gwType.vg))
							{
							String mac = CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);
							int port = UsefulMethod.convertGatewayPort(CollectionTools.getValueFromCollectionFile(i, "cnaf.gatewayport", myWorkbook));
							
							deviceName = "AN"+mac.substring(2, mac.length())+"00"+port;
							}
						else
							{
							deviceName = "SEPEE"+lineNumber;
							}
						}
					catch (EmptyValueException eve)
						{
						deviceName = "MAC_UNKNOWN";
						}
					}
				
				if((phone1+phone2+phone3).contains("DECT"))
					{
					if(phone1.contains("DECT"))
						{
						deviceName = "SEPEE"+lineNumber;
						}
					else
						{
						//It means that the DECT is not the only phone for this user. So we add another phone
						Phone myPhone = new Phone("SEPEE"+lineNumber,
								"Line "+(i+infos[2]+1),
								"",
								"",
								"",
								"",
								"",
								"",
								new ArrayList<PhoneService>(),
								new ArrayList<PhoneLine>(),
								"",
								myWorkbook,
								new ArrayList<SpeedDial>());
						
						phoneItemToInjectList.add(myPhone);
						}
					}
				else if((phone1+phone2+phone3).contains("JABBER"))
					{
					if(phone1.equals("JABBER"))
						{
						deviceName = "CSF"+userID;
						}
					else if((phone2.equals("JABBER")) ||
							(phone3.equals("JABBER")))
						{
						//It means that the CSF is not the only phone for this user. So we add another phone
						Phone myPhone = new Phone("CSF"+userID,
								"Line "+(i+infos[2]+1),
								"",
								"",
								"",
								"",
								"",
								"",
								new ArrayList<PhoneService>(),
								new ArrayList<PhoneLine>(),
								"",
								myWorkbook,
								new ArrayList<SpeedDial>());
						
						phoneItemToInjectList.add(myPhone);
						}
					else
						{
						//It means that we are just talking about deskphone control. No CSF is needed here. So No need to check for its injection
						}
					}
				
				Phone myPhone = new Phone(deviceName,
						"Line "+(i+infos[2]+1),
						"",
						"",
						"",
						"",
						"",
						"",
						new ArrayList<PhoneService>(),
						new ArrayList<PhoneLine>(),
						"",
						myWorkbook,
						new ArrayList<SpeedDial>());
				
				phoneItemToInjectList.add(myPhone);
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the phone arraylist line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		Variables.getLogger().debug(phoneItemToInjectList.size()+" Items to check in the system : ");
		for(ItemToInject i : phoneItemToInjectList)
			{
			Variables.getLogger().debug("Item "+i.getName()+" of type "+i.getType().name());
			}
		
		return phoneItemToInjectList;
		}
	
	/**
	 * Method used to build the Call Pickup group injection list
	 */
	public static ArrayList<ItemToInject> setCPGList(Workbook myWorkbook) throws Exception
		{
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.pickupname", myWorkbook);
		int[] pickupInfos = CollectionTools.getMatcherInfo("cucm.pickupname");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				myList.add(new CallPickupGroup(CollectionTools.getValueFromCollectionFile(i, "cucm.pickupname", myWorkbook)));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Call Pickup Group check list, line : "+(pickupInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/**
	 * Method used to build the Line group injection list
	 */
	public static ArrayList<ItemToInject> setLGList(Workbook myWorkbook) throws Exception
		{
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] lgInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				myList.add(new LineGroup(CollectionTools.getValueFromCollectionFile(i, "cucm.linegroupname", myWorkbook)));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Line Group check list, line : "+(lgInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/**
	 * Method used to build the Hunt List injection list
	 */
	public static ArrayList<ItemToInject> setHLList(Workbook myWorkbook) throws Exception
		{
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
		int[] hlInfos = CollectionTools.getMatcherInfo("cucm.linegroupname");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				myList.add(new HuntList(CollectionTools.getValueFromCollectionFile(i, "cucm.linegroupname", myWorkbook)));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Hunt List check list, line : "+(hlInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/**
	 * Method used to build the Hunt Pilot injection list
	 */
	public static ArrayList<ItemToInject> setHPList(Workbook myWorkbook) throws Exception
		{
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.huntpilotnumber", myWorkbook);
		int[] hpInfos = CollectionTools.getMatcherInfo("cucm.huntpilotnumber");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				myList.add(new HuntPilot(CollectionTools.getValueFromCollectionFile(i, "cucm.huntpilotnumber", myWorkbook), "p_internalphone"));
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Hunt Pilot check list, line : "+(hpInfos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

