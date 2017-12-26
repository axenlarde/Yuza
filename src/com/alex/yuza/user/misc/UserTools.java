package com.alex.yuza.user.misc;

import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PhoneLine;
import com.alex.yuza.misc.PhoneService;
import com.alex.yuza.misc.Task;
import com.alex.yuza.misc.ToDo;
import com.alex.yuza.sd.SpeedDial;
import com.alex.yuza.sd.misc.SdTools;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.user.DeviceProfile;
import com.alex.yuza.user.Line;
import com.alex.yuza.user.Phone;
import com.alex.yuza.user.User;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.actionType;
import com.alex.yuza.utils.Variables.itemType;

/**********************************
 * Class used to store static method
 * used for the site injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserTools
	{
	
	/**
	 * Method used to build the user injection list
	 */
	public static ArrayList<ItemToInject> setTempUserList(Workbook myWorkbook, ArrayList<ItemToInject> UserTemplateList) throws Exception
		{
		ArrayList<ItemToInject> userItemToInjectList = new ArrayList<ItemToInject>();
		
		//To make the following easier, we prepare here the user template items
		DeviceProfile UDPTemplate = null;
		User UserTemplate = null;
		
		for(ItemToInject item : UserTemplateList)
			{
			if(item.getType().equals(itemType.udp))
				{
				UDPTemplate = (DeviceProfile) item;
				}
			else if(item.getType().equals(itemType.user))
				{
				UserTemplate = (User) item;
				}
			}
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		int[] infos = CollectionTools.getMatcherInfo("cucm.userid");
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				/**
				 * If the device is Analog or a softphone, we do not need to get the Mac address
				 * 
				 * so we do not need to inject temporary user item for these cases.
				 */
				
				/*
				try
					{
					String mac = CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);
					Variables.getLogger().debug("Mac address already known line "+(i+1)+" "+mac+" so we skip it");
					continue;
					}
				catch (Exception e)
					{
					Variables.getLogger().debug("Mac address empty line "+(i+1)+" so we can proceed");
					}*/
				
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("JABBER")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("DECT")))
					{
					Variables.getLogger().debug("The user line "+(infos[2]+i+1)+" doesn't have to be processed (Analog, softphone or DECT), so we skip it");
					}
				else
					{
					/***********
					 * First we have to create the line
					 */
					ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
					
					for(int y=0; y<UDPTemplate.getLineList().size(); y++)
						{
						PhoneLine l = UDPTemplate.getLineList().get(y);
						String lineNumber = CollectionTools.getValueFromCollectionFile(UDPTemplate.getLineList().get(y).getLineNumber(), myWorkbook);
						
						Line myLine = new Line(lineNumber,
								l.getDescription(),
								l.getRoutePartition(),
								l.getAlertingName(),
								l.getAlertingNameAscii(),
								l.getLineCSS(),
								myWorkbook,
								i);
						
						myLine.resolve();
						
						userItemToInjectList.add(myLine);
						
						lineList.add(new PhoneLine(l.getDescription(),
								l.getLineLabel(),
								l.getAsciiLineLabel(),
								l.getLineDisplay(),
								l.getLineDisplayAscii(),
								l.getAlertingName(),
								l.getAlertingNameAscii(),
								l.getExternalPhoneNumberMask(),
								lineNumber,
								l.getRoutePartition(),
								l.getLineCSS(),
								y+1));
						}
					
					/***************
					 * Second we have to create the Device Profile
					 */
					DeviceProfile myUDP = new DeviceProfile(UDPTemplate.getName(),
							myWorkbook,
							UDPTemplate.getDescription(),
							UDPTemplate.getProductType(),
							UDPTemplate.getProtocol(),
							UDPTemplate.getPhoneButtonTemplate(),
							UDPTemplate.getServiceList(),
							lineList,
							UDPTemplate.getSdList());
					
					myUDP.setIndex(i);
					myUDP.resolve();
					
					userItemToInjectList.add(myUDP);
					
					/****************
					 * Finally we need to create users
					 */
					ArrayList<String> deviceList = new ArrayList<String>();
					ArrayList<String> UDPList = new ArrayList<String>();
					
					for(String d : UserTemplate.getDeviceList())
						{
						deviceList.add(new String(d));
						}
					for(String udp : UserTemplate.getUDPList())
						{
						UDPList.add(new String(udp));
						}
					
					User myUser = new User(UserTemplate.getName(),
							deviceList,
							UDPList,
							UserTemplate.getLastname(),
							UserTemplate.getFirstname(),
							UserTemplate.getPin(),
							myWorkbook);
					
					myUser.setIndex(i);
					myUser.resolve();
					
					userItemToInjectList.add(myUser);
					}
				}
			catch (EmptyValueException eve)
				{
				//Nothing
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the temporary user arraylist line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		
		return userItemToInjectList;
		}
	
	/**
	 * Method used to build the phone injection list
	 */
	public static ArrayList<ItemToInject> setTempPhoneList(Workbook myWorkbook, ArrayList<ItemToInject> phoneTemplateList) throws Exception
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
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("JABBER")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("DECT")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook).equals("")))
					{
					Variables.getLogger().debug("The user line "+(infos[2]+i+1)+" doesn't have to be processed (Analog, softphone or DECT), so we skip it");
					}
				else
					{
					/***********
					 * First we have to create the line
					 */
					ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
					
					for(int y=0; y<phoneTemplate.getLineList().size(); y++)
						{
						PhoneLine l = phoneTemplate.getLineList().get(y);
						String lineNumber = CollectionTools.getValueFromCollectionFile(phoneTemplate.getLineList().get(y).getLineNumber(), myWorkbook);
						
						Line myLine = new Line(lineNumber,
								l.getDescription(),
								l.getRoutePartition(),
								l.getAlertingName(),
								l.getAlertingNameAscii(),
								l.getLineCSS(),
								myWorkbook,
								i);
						
						myLine.resolve();
						
						phoneItemToInjectList.add(myLine);
						
						lineList.add(new PhoneLine(l.getDescription(),
								l.getLineLabel(),
								l.getAsciiLineLabel(),
								l.getLineDisplay(),
								l.getLineDisplayAscii(),
								l.getAlertingName(),
								l.getAlertingNameAscii(),
								l.getExternalPhoneNumberMask(),
								lineNumber,
								l.getRoutePartition(),
								l.getLineCSS(),
								y+1));
						}
					
					/***************
					 * Second we have to create the Phone
					 */
					Phone myPhone = new Phone(phoneTemplate.getName(),
							phoneTemplate.getDescription(),
							phoneTemplate.getProductType(),
							phoneTemplate.getProtocol(),
							phoneTemplate.getPhoneButtonTemplate(),
							phoneTemplate.getPhoneCss(),
							phoneTemplate.getDevicePool(),
							phoneTemplate.getLocation(),
							phoneTemplate.getServiceList(),
							lineList,
							phoneTemplate.getEnableExtensionMobility(),
							myWorkbook,
							phoneTemplate.getSdList());
					
					myPhone.setIndex(i);
					myPhone.resolve();
					
					phoneItemToInjectList.add(myPhone);
					}
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the temporary phone arraylist line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		return phoneItemToInjectList;
		}
	
	/**
	 * Method used to build the user deletion list
	 */
	public static ArrayList<ItemToInject> setTempUserDeleteList(Workbook myWorkbook, ArrayList<ItemToInject> UserTemplateList) throws Exception
		{
		ArrayList<ItemToInject> userItemToDeleteList = new ArrayList<ItemToInject>();
		
		//To make the following easier, we prepare here the user template items
		DeviceProfile UDPTemplate = null;
		Phone PhoneTemplate = null;
		
		for(ItemToInject item : UserTemplateList)
			{
			if(item.getType().equals(itemType.udp))
				{
				UDPTemplate = (DeviceProfile) item;
				}
			else if(item.getType().equals(itemType.phone))
				{
				PhoneTemplate = (Phone) item;
				}
			}
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				/**
				 * If the device is Analog or a softphone, we do not need to get the Mac address
				 * Same if we already have the mac address in the collection file
				 * 
				 * so we do not need to inject temporary user item for these cases.
				 */
				//If the mac is empty, an exception will be raised and this user will be skipped
				try
					{
					String mac = CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);
					}
				catch (Exception e)
					{
					//If we reach this point it means that the mac was empty, so we skip this user
					Variables.getLogger().debug("Mac address unkown line "+(i+1)+" it is indeed unwise to delete the data for this user, so we skip it");
					continue;
					}
				
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("JABBER")))
					{
					Variables.getLogger().debug("The user line "+(i+1)+" doesn't have to be processed, so we skip it");
					}
				else
					{
					String udpName = CollectionTools.getValueFromCollectionFile(i, UDPTemplate.getName(), myWorkbook);//To make the following easier
					String phoneName = CollectionTools.getValueFromCollectionFile(i, PhoneTemplate.getName(), myWorkbook);//To make the following easier
					
					/***********
					 * First we have to get both line, the one from the device profile
					 * and the one from the device where the UDP is logged
					 */
					com.cisco.axl.api._8.GetDeviceProfileReq UDPReq = new com.cisco.axl.api._8.GetDeviceProfileReq();
					UDPReq.setName(udpName);
					com.cisco.axl.api._8.GetDeviceProfileRes UDPResp = Variables.getAXLConnectionToCUCM().getDeviceProfile(UDPReq);//We send the request to the CUCM
					
					com.cisco.axl.api._8.GetPhoneReq PhoneReq = new com.cisco.axl.api._8.GetPhoneReq();
					PhoneReq.setName(phoneName);
					com.cisco.axl.api._8.GetPhoneRes PhoneResp = Variables.getAXLConnectionToCUCM().getPhone(PhoneReq);//We send the request to the CUCM
					
					//Here we just care about the number, the partition and the index. Indeed it is just to delete it
					String uDPLineNumber = UDPResp.getReturn().getDeviceProfile().getLines().getLine().get(0).getDirn().getPattern();
					String uDPPartition = UDPResp.getReturn().getDeviceProfile().getLines().getLine().get(0).getDirn().getRoutePartitionName().getValue();
					String phoneLineNumber = PhoneResp.getReturn().getPhone().getLines().getLine().get(0).getDirn().getPattern();
					String phonePartition = PhoneResp.getReturn().getPhone().getLines().getLine().get(0).getDirn().getRoutePartitionName().getValue();
					
					/***************
					 * Second we have to create the Device Profile and the phone to delete
					 */
					//UDP
					DeviceProfile myUDP = new DeviceProfile(udpName,
							myWorkbook,
							"",
							"",
							"",
							"",
							new ArrayList<PhoneService>(),
							new ArrayList<PhoneLine>(),
							new ArrayList<SpeedDial>());
					
					userItemToDeleteList.add(myUDP);
					
					//Phone
					Phone myPhone = new Phone(phoneName,
							"",
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
					
					userItemToDeleteList.add(myPhone);
					
					/***************
					 * Third we have to create the lines to delete
					 * (the lines currently associated to the devices)
					 */
					//UDP
					Line myUDPLine = new Line(uDPLineNumber,
							"",
							uDPPartition,
							"",
							"",
							"",
							myWorkbook,
							i);
					
					userItemToDeleteList.add(myUDPLine);
					
					//Phone
					Line myPhoneLine = new Line(phoneLineNumber,
							"",
							phonePartition,
							"",
							"",
							"",
							myWorkbook,
							i);
					
					userItemToDeleteList.add(myPhoneLine);
					
					/****************
					 * Finally we need to create the user to delete
					 */
					//We don't care about the user, we don't have to delete it here
					}
				}
			catch (EmptyValueException eve)
				{
				//Nothing
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the temporary user deletion arraylist : "+e.getMessage());
				}
			}
		
		return userItemToDeleteList;
		}
	
	/**
	 * Method used to remove duplicate from a user list
	 */
	private static ArrayList<UserData> removeUserDuplicate(ArrayList<UserData> myUserList)
		{
		for(int j = 0; j<myUserList.size(); j++)
			{
			for(int k = (j+1); k<myUserList.size(); k++)
				{
				if(myUserList.get(j).equals(myUserList.get(k)))
					{
					myUserList.remove(k);
					k--;
					}
				}
			}
		
		return myUserList;
		}
	
	
	/************
	 * Method used to prepare a user injection
	 */
	public static synchronized Task prepareUserInjection(ArrayList<ItemToInject> UserItemToInjectList) throws Exception
		{
		Variables.getLogger().info("User injection preparation process begin");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		for(ItemToInject item : UserItemToInjectList)
			{
			if(item.getType().equals(itemType.user))
				{
				Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an update todo");
				myList.add(new ToDo(actionType.update, item));
				}
			else
				{
				Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an inject todo");
				myList.add(new ToDo(actionType.inject, item));
				}
			}
		
		Variables.getLogger().info("User injection preparation process end");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	/************
	 * Method used to prepare a phone injection
	 */
	public static synchronized Task preparePhoneInjection(ArrayList<ItemToInject> PhoneItemToInjectList) throws Exception
		{
		Variables.getLogger().info("P injection preparation process begin");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		for(ItemToInject item : PhoneItemToInjectList)
			{
			Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an inject todo");
			myList.add(new ToDo(actionType.inject, item));
			}
		
		Variables.getLogger().info("User injection preparation process end");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	/************
	 * Method used to prepare a user deletion
	 */
	public static synchronized Task prepareUserDeletion(ArrayList<ItemToInject> UserItemToDeleteList) throws Exception
		{
		Variables.getLogger().info("User deletion preparation process begin");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		for(ItemToInject item : UserItemToDeleteList)
			{
			Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as a delete todo");
			myList.add(new ToDo(actionType.delete, item));
			}
		
		Variables.getLogger().info("User deletion preparation process end");
		
		//The deletion task is ready
		return new Task(myList);
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

