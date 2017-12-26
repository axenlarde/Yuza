package com.alex.yuza.misc;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.alex.yuza.site.VG2XX;
import com.alex.yuza.ui.NewSiteWindow;
import com.alex.yuza.utils.CheckValueFromServer;
import com.alex.yuza.utils.ClearFrenchString;
import com.alex.yuza.utils.Tester;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.gwType;

/**********************************
 * Class used to store static method used to work with the collection and template file
 * 
 * @author RATEL Alexandre
 **********************************/
public class CollectionTools
	{
	
	/****************************************
	 * Method used to return the pattern
	 * @throws Exception 
	 ****************************************/
	public static String doRegex(String pat, int currentRow, Workbook myWorkbook) throws Exception
		{
		StringBuffer regex = new StringBuffer("");
		
		pat = pat.replace("'", "");
		
		String delim = "+";
		String splitRegex = "(?<!\\\\)" + Pattern.quote(delim);//To activate \ as an escape character
		
		String[] param = pat.split(splitRegex);
		
		for(int i = 0; i<param.length; i++)
			{
			boolean match = false;
			for(String s : Variables.getMatcherList())
				{
				String[] tab = s.split(":");//Example : cucm.firstname:4:4:4+*
				//tab[0]=cucm.firstname  etc.
				
				if(Pattern.matches(".*"+tab[0]+".*", param[i]))
					{
					if(param[i].contains("*"))
						{
						regex.append(getValueWithRegex(param[i], tab[1], tab[2], tab[3], currentRow, myWorkbook));
						}
					else
						{
						regex.append(getValue(param[i], tab[1], tab[2], tab[3], currentRow, myWorkbook));
						}
					match = true;
					break;
					}
				}
			
			/**
			 * Special regex
			 */
			//Site
			if(Pattern.matches(".*site.cmg", param[i]))
				{
				regex.append(applyRegex(CollectionTools.getCurrentSite(myWorkbook).getCmg(), param[i]));
				match = true;
				}
			else if(Pattern.matches(".*site.department", param[i]))
				{
				regex.append(applyRegex(CollectionTools.getCurrentSite(myWorkbook).getDepartment(), param[i]));
				match = true;
				}
			else if(Pattern.matches(".*cucm.randomline", param[i]))
				{
				regex.append(applyRegex(getAvailableInsideNumber(), param[i]));
				match = true;
				}
			
			
			/***********/
			
			//Default
			if(!match)
				{
				regex.append(param[i]);
				}
			}
	
		return regex.toString();
		}
	
	/******************************************
	 * Method used to get a value from the collection file
	 * @throws Exception 
	 ******************************************/
	private static String getValue(String param, String sheet, String column, String row, int currentRow, Workbook myWorkbook) throws Exception,EmptyValueException
		{
		/**
		 * We get the Value from the collection file
		 */
		int sheetNumber, columnNumber, rowNumber;
		sheetNumber = Integer.parseInt(sheet);
		columnNumber = Integer.parseInt(column);
		rowNumber = getRowNumber(row, currentRow);
		
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheetNumber, columnNumber, rowNumber, myWorkbook);
		
		if(checkEmptyValue(value))throw new EmptyValueException("The requested parameters ("+param+") is empty row : "+(rowNumber+1));
		
		Variables.getLogger().debug("Value for "+param+" without regex : "+value);
		return value;
		}
	
	
	/******************************************
	 * Method used to get a value from the collection file
	 * and apply special regex
	 * @throws Exception 
	 ******************************************/
	private static String getValueWithRegex(String param, String sheet, String column, String row, int currentRow, Workbook myWorkbook) throws Exception,EmptyValueException
		{
		/**
		 * First we get the Value from the collection file
		 */
		int sheetNumber, columnNumber, rowNumber;
		sheetNumber = Integer.parseInt(sheet);
		columnNumber = Integer.parseInt(column);
		rowNumber = getRowNumber(row, currentRow);
		
		
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheetNumber, columnNumber, rowNumber, myWorkbook);
		
		if(checkEmptyValue(value))throw new EmptyValueException("The requested parameters ("+param+") is empty row : "+rowNumber);
		/*********************/
		
		/**
		 * Second we apply the regex
		 */
		Variables.getLogger().debug("Value before "+param+" regex : "+value);
		value = applyRegex(value, param);
		Variables.getLogger().debug("Value after applying "+param+" regex : "+value);
		/**********/
		
		return value;
		}
	
	/******************************************
	 * Method used to get a value from the collection file
	 * @throws Exception 
	 ******************************************/
	public static String getDirectValueFromCollectionFile(String param, int sheet, int column, int row, Workbook myWorkbook) throws Exception,EmptyValueException
		{
		/**
		 * We get the Value from the collection file
		 */
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheet, column, row, myWorkbook);
		
		if(checkEmptyValue(value))throw new EmptyValueException("The requested value is empty sheet : "+sheet+" row : "+row+" column : "+column);
		
		/**
		 * Second we apply the regex
		 */
		if((param != null) &&
				(!param.equals("")) &&
				(param.contains("*")))
			{
			Variables.getLogger().debug("Value before "+param+" regex : "+value);
			value = applyRegex(value, param);
			Variables.getLogger().debug("Value after applying "+param+" regex : "+value);
			}
		/**********/
		
		Variables.getLogger().debug("Value got from the collection file sheet : "+sheet+" row : "+row+" column : "+column+" value : "+value);
		return value;
		}
	
	private static String getValueFromExcelFile(int sheetNumber, int columnNumber, int rowNumber, Workbook myWorkbook) throws Exception
		{
		try
			{
			Row row = myWorkbook.getSheetAt(sheetNumber).getRow(rowNumber);
			if(row == null)return "";
			
			Cell cell = row.getCell(columnNumber);
			if(cell == null)return "";
			
			switch (cell.getCellType())
				{
			    case Cell.CELL_TYPE_STRING:return cell.getRichStringCellValue().getString();
			    case Cell.CELL_TYPE_NUMERIC:
			        if (DateUtil.isCellDateFormatted(cell))
			        	{
			            return cell.getDateCellValue().toString();
			        	}
			        else
			        	{
			            return String.valueOf((long)cell.getNumericCellValue());
			        	}
			    case Cell.CELL_TYPE_BOOLEAN:
			    	if(cell.getBooleanCellValue())
			    		{
			    		return "true";
			    		}
			    	else
			    		{
			    		return "false";
			    		}
			    case Cell.CELL_TYPE_FORMULA:
			        {
			        switch (cell.getCachedFormulaResultType())
				        {
				        case Cell.CELL_TYPE_STRING:return cell.getRichStringCellValue().getString();
				        case Cell.CELL_TYPE_NUMERIC:
				            if (DateUtil.isCellDateFormatted(cell))
				            	{
				                return cell.getDateCellValue().toString();
				            	}
				            else
				            	{
				                return String.valueOf((long)cell.getNumericCellValue());
				            	}
				        case Cell.CELL_TYPE_BOOLEAN:
				        	if(cell.getBooleanCellValue())
				        		{
				        		return "true";
				        		}
				        	else
				        		{
				        		return "false";
				        		}
				        default:return cell.toString();
				        }
			        }
			    default:return cell.toString();
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			throw e;
			}
		}
		
	
	/****
	 * Return the row to target to get a value from the collection file
	 */
	private static int getRowNumber(String row, int currentRow) throws Exception
		{
		int rowNumber;
		
		if(row.contains("-"))
			{
			rowNumber = currentRow+Integer.parseInt(row.split("-")[0]);
			
			//We check if we are out of range
			int limit;
			if(row.split("-")[1].equals("*"))
				{
				limit = Integer.parseInt(UsefulMethod.getTargetOption("maxdataprocessed"));
				}
			else
				{
				limit = Integer.parseInt(row.split("-")[1]);
				}
			
			if(rowNumber>limit)
				{
				throw new Exception("The requested value is out of range");
				}
			}
		else
			{
			rowNumber = Integer.parseInt(row);
			}
		
		return rowNumber;
		}
			
			
	/**
	 * Return "true" if the value from the collection file is empty
	 */
	private static boolean checkEmptyValue(String value)
		{
		/************************
		 * If the value is empty or contains #, it maybe means that we reach the end of the collection file
		 */
		if((Pattern.matches("^$", value)) || (value.contains("#")))
			{
			return true;
			}
		else
			{
			return false;
			}
		/***********************/
		}
			
	/****
	 * Method used to apply a regex to a value	
	 * @throws Exception 
	 */
	private static String applyRegex(String newValue, String param) throws Exception
		{
		try
			{
			/*********
			 * Number before
			 **/
			if(Pattern.matches("\\*\\d+\\*.*", param))
				{
				int number = howMany("\\*\\d+\\*", param);
				if(newValue.length() >= number)
					{
					newValue = newValue.substring(0, number);
					}
				}
			/**
			 * End number before
			 *************/
			
			/*********
			 * Number after
			 **/
			if(Pattern.matches(".*\\*\\d+\\*", param))
				{
				int number = howMany("\\*\\d+\\*", param);
				if(newValue.length() >= number)
					{
					newValue = newValue.substring(newValue.length()-number, newValue.length());
					}
				}
			/**
			 * End number after
			 *************/
			
			/*************
			 * Majuscule
			 **/
			if(Pattern.matches(".*\\*M\\*.*", param))
				{
				newValue = newValue.toUpperCase();
				}
			if(Pattern.matches(".*\\*\\d+M\\*.*", param))
				{
				int majuscule = howMany("\\*\\d+M\\*", param);
				if(newValue.length() >= majuscule)
					{
					String temp = newValue.substring(0, majuscule);
					temp = temp.toUpperCase();
					newValue = temp+newValue.substring(majuscule,newValue.length());
					}
				}
			/**
			 * End majuscule
			 ****************/
			
			/*************
			 * Minuscule
			 **/
			if(Pattern.matches(".*\\*m\\*.*", param))
				{
				newValue = newValue.toLowerCase();
				}
			if(Pattern.matches(".*\\*\\d+m\\*.*", param))
				{
				int minuscule = howMany("\\*\\d+m\\*", param);
				if(newValue.length() >= minuscule)
					{
					String temp = newValue.substring(0, minuscule);
					temp = temp.toLowerCase();
					newValue = temp+newValue.substring(minuscule,newValue.length());
					}
				}
			/**
			 * End minuscule
			 ****************/
			
			/*************
			 * Split
			 **/
			if(Pattern.matches(".*\\*\\d+S.+\\*.*", param))
				{
				int split = howMany("\\*\\d+S.+\\*", param);
				String splitter = getSplitter("\\*\\d+S.+\\*", param);
				newValue = newValue.split(splitter)[split-1];
				}
			/**
			 * End Split
			 ****************/
			
			/*************
			 * Replace
			 **/
			if(Pattern.matches(".*\\*\".+\"R\".*\"\\*.*", param))
				{
				String pattern = null;
				String replaceBy = null;
				Pattern begin = Pattern.compile("\".+\"R");
				Matcher mBegin = begin.matcher(param);
				Pattern end = Pattern.compile("R\".*\"");
				Matcher mEnd = end.matcher(param);
				
				if(mBegin.find())
					{
					String str = mBegin.group();
					str = str.substring(0,str.length()-1);//We remove the "R"
					str = str.replace("\"", "");
					pattern = str;
					}
				if(mEnd.find())
					{
					String str = mEnd.group();
					str = str.substring(1,str.length());//We remove the "R"
					str = str.replace("\"", "");
					replaceBy = str;
					}
				if((pattern != null) && (replaceBy != null))
					{
					newValue = newValue.replace(pattern, replaceBy);
					}
				}
			/**
			 * End Replace
			 ****************/
			
			/*************
			 * Clear French Char
			 **/
			if(Pattern.matches(".*\\*C\\*.*", param))
				{
				newValue = ClearFrenchString.translate(newValue);
				}
			/**
			 * End Clear French Char
			 ****************/
			
			/*************
			 * Check if the given userID exist in the CUCM
			 **/
			if(Pattern.matches(".*\\*CRUserID\\*.*", param))
				{
				if(UsefulMethod.getTargetOption("csvuseridcheckenable").equals("true"))
					{
					newValue = CheckValueFromServer.checkAndReplaceUserID(newValue);
					} 
				}
			/**
			 * End
			 ****************/
			
			/*************
			 * Convert values into CUCM acceptable ones
			 * 
			 * For instance : "7962" into "cisco 7962" etc...
			 **/
			if(Pattern.matches(".*\\*LFPhone\\*.*", param))
				{
				newValue = UsefulMethod.findPhoneType(newValue);
				}
			if(Pattern.matches(".*\\*LFProfile\\*.*", param))
				{
				newValue = UsefulMethod.findProfileName(newValue);
				}
			if(Pattern.matches(".*\\*LFCSS\\*.*", param))
				{
				newValue = UsefulMethod.findCSSName(newValue);
				}
			if(Pattern.matches(".*\\*LFPBT\\*.*", param))
				{
				newValue = UsefulMethod.findPBTName(newValue);
				}
			if(Pattern.matches(".*\\*LFPNN\\*.*", param))
				{
				newValue = UsefulMethod.findPickupNotificationName(newValue);
				}
			if(Pattern.matches(".*\\*LFLGDT\\*.*", param))
				{
				newValue = UsefulMethod.findLGDistributionName(newValue);
				}
			/**
			 * End Convert values into CUCM acceptable ones
			 ****************/
			
			
			/**************************************/
			return newValue;
			}
		catch(Exception exc)
			{
			throw new Exception("An issue occured while applying the regex : "+exc.getMessage());
			}
		}
	
	/**
	 * Method used to return a number present in a regex
	 * 
	 * for instance : *1M* return 1
	 */
	private static int howMany(String regex, String param) throws Exception
		{
		Pattern p = Pattern.compile(regex);
		Pattern pChiffre = Pattern.compile("\\d+");
		Matcher m = p.matcher(param);
		
		if(m.find())
			{
			Matcher mChiffre = pChiffre.matcher(m.group());
			if(mChiffre.find())
				{
				return Integer.parseInt(mChiffre.group());
				}
			}
		return 0;
		}
	
	/**
	 * Method used to find and return 
	 * Character used to split
	 */
	private static String getSplitter(String regex, String param) throws Exception
		{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(param);
		
		if(m.find())
			{
			String temp = m.group().replace("*", "");
			return temp.split("S")[1];
			}
		throw new Exception();
		}
	
	/********
	 * Method used to get a single value from the excel file
	 * @throws Exception 
	 */
	public static String getValueFromCollectionFile(String pattern, Workbook myWorkbook) throws Exception
		{
		return doRegex(pattern, 0, myWorkbook);
		}
	
	/********
	 * Method used to get a single value from the excel file
	 * @throws Exception 
	 */
	public static String getValueFromCollectionFile(int row, String pattern, Workbook myWorkbook) throws Exception
		{
		return doRegex(pattern, row, myWorkbook);
		}
	
	/**
	 * Method used to get the last "non empty" value in
	 * a given column
	 * @throws Exception 
	 */
	public static int getTheLastIndexOfAColumn(String matcher, Workbook myWorkbook) throws Exception
		{
		Variables.getLogger().debug("Last reachable index research started for the column "+matcher);
		int i=0;
		while(true)
			{
			try
				{
				CollectionTools.getValueFromCollectionFile(i, matcher, myWorkbook);//If the value is empty an exception will be raised
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("Last reachable index found is "+i+" for the column "+matcher);
				return i;
				}
			catch (Exception e)
				{
				throw new Exception("Error while searching the last reachable index of the column "+matcher+" : "+e.getMessage());
				}
			i++;
			}
		}
	
	/**************
	 * Method used to return the workbook site
	 * @throws Exception 
	 */
	public static Site getCurrentSite(Workbook myWorkbook) throws Exception
		{
		String siteName, certi, siteType, cmg, department;
		siteName = CollectionTools.getValueFromCollectionFile("cucm.sitedescription", myWorkbook);
		siteType = CollectionTools.getValueFromCollectionFile("cnaf.siteType", myWorkbook);
		
		for(Site s : Variables.getSiteList())
			{
			if(siteName.contains(s.getName()))return s;
			}
		
		Variables.getLogger().debug("No matching site have been found. We then ask the user what to do");
		
		NewSiteWindow nsw = new NewSiteWindow(null, siteName);
		
		certi = nsw.getCerti();
		cmg = nsw.getCmg();
		department = nsw.getDepartment();
		
		nsw.dispose();
		
		Site myNewSite = new Site(siteName,
				certi,
				UsefulMethod.convertStringToSiteType(siteType),
				cmg,
				department);
		
		Variables.getLogger().debug("New site : "+siteName+" "+certi+" "+siteType+" "+cmg+" "+department);
		
		//We then add the new site to the XML file
		UsefulMethod.writeNewSite(myNewSite);
		
		return myNewSite;
		}
	
	/*************
	 * Method used to get a free non did number
	 * from the CUCM
	 */
	public static String getAvailableInsideNumber() throws Exception
		{
		if(Variables.getInsideNumberList() == null)
			{
			try
				{
				ArrayList<String> myUsedNumberList = new ArrayList<String>();
				ArrayList<String> myAvailableNumberList = new ArrayList<String>();
				
				String[] tab = UsefulMethod.getTargetOption("insidenumberrange").split(":");
				String firstNumber = tab[0];
				String lastNumber = tab[1];
				
				int currentNum = Integer.parseInt(firstNumber);
				int lastNum = Integer.parseInt(lastNumber);
				
				List<Object> SQLResp = SimpleRequest.doSQLQuery("select dnorpattern from numplan where tkpatternusage='2' and dnorpattern between '"+firstNumber+"' and '"+lastNumber+"'");
				
				for(Object o : SQLResp)
					{
					Element rowElement = (Element) o;
					NodeList list = rowElement.getChildNodes();
					
					for(int i = 0; i< list.getLength(); i++)
						{
						if(list.item(i).getNodeName().equals("dnorpattern"))myUsedNumberList.add(list.item(i).getTextContent());
						}
					}
				
				while(currentNum < lastNum)
					{
					if(!(myUsedNumberList.contains(Integer.toString(currentNum))))
						{
						myAvailableNumberList.add(Integer.toString(currentNum));
						}
					currentNum++;
					}
				
				Variables.setInsideNumberList(myAvailableNumberList);
				}
			catch(Exception e)
				{
				throw new Exception("Error while trying to get an available number from the CUCM : "+e.getMessage());
				}
			}
		
		String availableNumber = Variables.getInsideNumberList().get(0);
		Variables.getInsideNumberList().remove(0);
		return availableNumber;
		}
	
	/**
	 * Method used to write a simple string in the
	 * collection file without caring about the font
	 * @throws Exception 
	 */
	public synchronized static void writeStringInTheCollectionFile(String fileName, String stringValue, int sheet, int column, int row, Workbook wW)
		{
		try
			{
			//Workbook wW = WorkbookFactory.create(new FileInputStream(fileName));
			Sheet s = wW.getSheetAt(sheet);
			Cell c = s.getRow(row).getCell(column);
			
			if(c == null)
				{
				c = s.getRow(row).createCell(column);
				c.setCellType(Cell.CELL_TYPE_STRING);
				}
			
			c.setCellValue(stringValue);
			
			FileOutputStream output = new FileOutputStream(fileName);
			wW.write(output);
			output.close();
			wW.close();
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("Error while writing in the excel file", e);
			}
		}
	
	/**
	 * Method which return as an integer array the sheet, column and row number
	 * of a specified matcher
	 * 
	 * tab[0] : sheet number
	 * tab[1] : column number
	 * tab[2] : row number
	 * @throws Exception 
	 */
	public static int[] getMatcherInfo(String matcher) throws Exception
		{
		int[] matcherInfos = new int[3];  
		
		try
			{
			for(String s : Variables.getMatcherList())
				{
				String[] tab = s.split(":");//As a reminder a matcher is : cucm.firstname:4:4:4+*
				if(tab[0].equals(matcher))
					{
					matcherInfos[0] = Integer.parseInt(tab[1]);//Sheet number
					matcherInfos[1] = Integer.parseInt(tab[2]);//Column number
					
					//Row number
					if(tab[3].contains("-"))
						{
						String[] row = tab[3].split("-");
						matcherInfos[2] = Integer.parseInt(row[0]);
						}
					else
						{
						matcherInfos[1] = Integer.parseInt(tab[3]);
						}
					
					return matcherInfos;
					}
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			throw new Exception("Error while looking for a matcher infos");
			}
		
		throw new Exception("No matcher found");
		}
	
	/******************
	 * Method used to return the list of available gateway in 
	 * the collection file
	 */
	public static ArrayList<Gateway> findGatewaysFromCollectionFile(Workbook myWorkbook) throws Exception
		{
		ArrayList<Gateway> myList = new ArrayList<Gateway>();
		
		try
			{
			/**
			 * First we need to find how many gateway there are in the collection file
			 */
			int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cnaf.voicegatewaytype", myWorkbook);
			int[] gatewayInfos = CollectionTools.getMatcherInfo("cnaf.voicegatewaytype");
			int lastUserIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
			
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					String ip = CollectionTools.getValueFromCollectionFile(i, "cnaf.voicegatewayip", myWorkbook);
					int macIndex = getTheMacOfTheGateway(ip, lastUserIndex, myWorkbook);
					String type = CollectionTools.getValueFromCollectionFile(i, "cnaf.voicegatewaytype", myWorkbook);
					gwType gwtype = UsefulMethod.convertGatewayType(type);
					
					if(gwtype.equals(gwType.vg))
						{
						//VG
						
						//We check if the MAC address at this index is not empty or false
						if(Tester.macValide(CollectionTools.getValueFromCollectionFile(macIndex, "cucm.mac", myWorkbook)))
							{
							myList.add(new Gateway(gwtype,
									type,
									ip,
									macIndex));
							
							Variables.getLogger().debug("New gateway added : "+
									" Type : "+gwtype.name()+
									" Modele : "+type+
									" IP : "+ip+
									" MacIndex : "+macIndex);
							}
						else
							{
							throw new EmptyValueException("The mac address is incorrect");
							}
						}
					else
						{
						//Audiocodes
						myList.add(new Gateway(gwtype,
								type,
								ip));
						
						Variables.getLogger().debug("New gateway added : "+
								" Type : "+gwtype.name()+
								" Modele : "+type+
								" IP : "+ip);
						}
					}
				catch(EmptyValueException exc)
					{
					Variables.getLogger().debug("A value was empty for the gateway (Maybe the Mac address) line : "+(gatewayInfos[2]+i+1)+
							" : "+exc.getMessage());
					}
				}
			}
		catch (Exception e)
			{
			Variables.getLogger().error("",e);
			throw new Exception("Error while discovering the list of Gateway to create : "+e);
			}
		
		Variables.getLogger().debug(myList.size()+" gateway with MAC address found in the collection file");
		
		return myList;
		}
	
	/**
	 * Method used to find the MAC address of the gateway
	 * @throws Exception 
	 */
	private static int getTheMacOfTheGateway(String ip, int lastIndex, Workbook myWorkbook) throws Exception
		{
		Variables.getLogger().debug("We start to look for the index of the Mac address of the following ip "+ip);
		int[] infos = CollectionTools.getMatcherInfo("cnaf.gatewayinfo");
		
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				if(CollectionTools.getValueFromCollectionFile(i, "cnaf.gatewayinfo", myWorkbook).contains(ip))
					{
					Variables.getLogger().debug("Mac address found for the ip \""+ip+"\" line : "+(infos[2]+i+1));
					return i;
					}
				}
			catch (EmptyValueException e)
				{
				//Nothing
				}
			}
		
		throw new EmptyValueException("No mac address found for the following ip : "+ip);
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

