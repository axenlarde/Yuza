package com.alex.yuza.maccollection.misc;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.maccollection.ToScan;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.user.DeviceProfile;
import com.alex.yuza.user.User;
import com.alex.yuza.utils.Tester;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;

/**********************************
 * Class used to store static method about
 * the mac colleciton process
 * 
 * @author RATEL Alexandre
 **********************************/
public class MacTools
	{
	
	/**
	 * Method used to create the list of mac address to collect
	 * @throws Exception 
	 */
	public static ArrayList<ToScan> setMacToCollectList(Workbook myWorkbook) throws Exception
		{
		ArrayList<ToScan> myList = new ArrayList<ToScan>();
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				/**
				 * If the device is Analog or a softphone, we do not need to get the Mac address
				 */
				
				try
					{
					String mac = CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);
					if(Tester.macValide(mac))
						{
						Variables.getLogger().debug("Mac address already known line "+(i+1)+" "+mac+" so we skip it");
						continue;
						}
					else
						{
						Variables.getLogger().debug("Bad mac address line "+i+1+" so we can proceed");
						}
					}
				catch (EmptyValueException eve)
					{
					Variables.getLogger().debug("Mac address empty line "+(i+1)+" so we can proceed");
					}
				
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("JABBER")) ||
						(CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook).contains("DECT")))
					{
					Variables.getLogger().debug("The user line "+(i+1)+" doesn't have to be processed (Analog, softphone or DECT), so we skip it");
					}
				else
					{
					/***********
					 * Here we create the ToScan object and add it to
					 * the list
					 */
					myList.add(new ToScan(CollectionTools.getValueFromCollectionFile(i, "*M*cucm.userid", myWorkbook)+
							"-"+
							CollectionTools.getValueFromCollectionFile(i, "*LFPhone*cucm.phonetype1", myWorkbook),
							CollectionTools.getValueFromCollectionFile(i, "cucm.userid", myWorkbook),
							i
							));
					}
				}
			catch (EmptyValueException eve)
				{
				//Nothing
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Mac Collection arraylist : "+e.getMessage());
				}
			}
		
		return myList;
		}
	
	/**
	 * Method used to get the MAC address of the phone where the given UDP is logged
	 * 
	 * To do that, it will send sql request to the CUCM
	 * @throws Exception 
	 */
	public static String getMacFromCUCM(String userID) throws Exception
		{
		String request = new String("select d.name as device from enduser u,device p,device d,extensionmobilitydynamic em where em.fkdevice=d.pkid and em.fkdevice_currentloginprofile=p.pkid and em.fkenduser=u.pkid" +
				" and u.userid='"+userID+"'");
		
		String deeperRequest = new String("select distinct d.name as device from enduser u,device p,device d,extensionmobilitydynamic em where em.fkdevice=d.pkid and em.fkenduser_lastlogin=u.pkid" +
				" and u.userid='"+userID+"'");
		
		List<Object> SQLResp = SimpleRequest.doSQLQuery(request);
		
		if(SQLResp.size() != 0)
			{
			for(Object o : SQLResp)
				{
				Element rowElement = (Element) o;
				NodeList list = rowElement.getChildNodes();
				
				for(int i = 0; i< list.getLength(); i++)
					{
					if(list.item(i).getNodeName().equals("device"))return list.item(i).getTextContent().replace("SEP", "");
					}
				}
			}
		else
			{
			List<Object> deeperSQLResp = SimpleRequest.doSQLQuery(deeperRequest);
			
			for(Object o : deeperSQLResp)
				{
				Element rowElement = (Element) o;
				NodeList list = rowElement.getChildNodes();
				
				for(int i = 0; i< list.getLength(); i++)
					{
					if(list.item(i).getNodeName().equals("device"))return list.item(i).getTextContent().replace("SEP", "");
					}
				}
			}
		
		return null;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

