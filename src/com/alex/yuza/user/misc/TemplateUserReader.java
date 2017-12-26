package com.alex.yuza.user.misc;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PhoneLine;
import com.alex.yuza.misc.PhoneService;
import com.alex.yuza.sd.SpeedDial;
import com.alex.yuza.site.DevicePool;
import com.alex.yuza.site.Location;
import com.alex.yuza.user.DeviceProfile;
import com.alex.yuza.user.Phone;
import com.alex.yuza.user.User;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.xMLGear;
import com.alex.yuza.utils.xMLReader;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.sdType;

/**********************************
 * Class used to read the User template
 * 
 * @author RATEL Alexandre
 **********************************/
public class TemplateUserReader
	{
	/**************
	 * Variables
	 */
	
	/*********************
	 * Static method used to read the CUCM Template 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> readUserTemplate(Workbook myWorkbook) throws Exception
		{
		try
			{
			Variables.getLogger().info("Reading the User Template file : "+Variables.getCcmTemplateFileName());
			String fileContent = xMLReader.fileRead(Variables.getUserTemplateFileName());
			
			ArrayList<String> listParams = new ArrayList<String>();
			listParams.add("items");
			
			//We get here the list of the items we want to process
			ArrayList<String[][]> templateUserContent = xMLGear.getResultListTab(fileContent, listParams);
			
			//And here we get the detail
			ArrayList<ArrayList<String[][]>> templateUserContentDetail = xMLGear.getResultListTabExt(fileContent, listParams);
			
			//We are interested only by the type of site define in the collection file
			String[][] tab = templateUserContent.get(0);
			ArrayList<String[][]> detail = templateUserContentDetail.get(0);
			
			//We initialize the Item to Inject List
			ArrayList<ItemToInject> UserTemplateList = new ArrayList<ItemToInject>();
			
			/******
			 * For each item we check if we have to process it.
			 * If yes we create the suitable item object and 
			 * we add it to the list of items to inject
			 */
			for(int i=0; i<tab.length; i++)
				{
				for(itemType item : itemType.values())
					{
					if(tab[i][0].equals(item.name()))
						{
						ItemToInject myItem = createItem(item, detail.get(i), myWorkbook);
						if(myItem != null)UserTemplateList.add(myItem);
						}
					}
				}
			
			return UserTemplateList;
			}
		catch(Exception e)
			{
			e.printStackTrace();
			throw new Exception("ERROR while reading the CCM Template file : "+e.getMessage());
			}
		}
	
	/**
	 * Method used to create Item
	 * 
	 * For the users, opposite of the CUCM items, we create here an item
	 * without resolving the "template". For instance, 'DP_'+cucm.sitename will stay 'DP_'+cucm.sitename
	 * 
	 * @throws Exception 
	 */
	private static ItemToInject createItem(itemType type, String[][] itemDetails, Workbook myWorkbook) throws Exception
		{
		if(type.equals(itemType.phone))
			{
			//Line
			PhoneLine myLine = new PhoneLine(UsefulMethod.getItemByName("linedescription", itemDetails),
					UsefulMethod.getItemByName("linetextlabel", itemDetails),
					UsefulMethod.getItemByName("linetextlabel", itemDetails),
					UsefulMethod.getItemByName("display", itemDetails),
					UsefulMethod.getItemByName("display", itemDetails),
					UsefulMethod.getItemByName("alertingname", itemDetails),
					UsefulMethod.getItemByName("alertingname", itemDetails),
					UsefulMethod.getItemByName("externalphonemask", itemDetails),
					UsefulMethod.getItemByName("linenumber", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("cssline", itemDetails),
					1);
			
			ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
			lineList.add(myLine);
			
			//Phone Services
			ArrayList<PhoneService> myServiceList = new ArrayList<PhoneService>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("service"))
					{
					String[] tab = s[1].split(":");
					myServiceList.add(new PhoneService(tab[0], tab[1]));
					}
				}
			
			//Speed Dial and BLF
			ArrayList<SpeedDial> mySDList = new ArrayList<SpeedDial>();
			mySDList.add(new SpeedDial("",
					UsefulMethod.getItemByName("sdlabel", itemDetails),
					UsefulMethod.getItemByName("sdlabel", itemDetails),
					1,
					false,
					UsefulMethod.getItemByName("sdpartition", itemDetails),
					sdType.sd));
			
			//Phone
			return new Phone(UsefulMethod.getItemByName("devicename", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("producttype", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("buttontemplate", itemDetails),
					UsefulMethod.getItemByName("cssdevice", itemDetails),
					UsefulMethod.getItemByName("devicepool", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					myServiceList,
					lineList,
					"true",
					myWorkbook,
					mySDList);
			}
		else if(type.equals(itemType.udp))
			{
			//Line
			PhoneLine myLine = new PhoneLine(UsefulMethod.getItemByName("linedescription", itemDetails),
					UsefulMethod.getItemByName("linetextlabel", itemDetails),
					UsefulMethod.getItemByName("linetextlabel", itemDetails),
					UsefulMethod.getItemByName("display", itemDetails),
					UsefulMethod.getItemByName("display", itemDetails),
					UsefulMethod.getItemByName("alertingname", itemDetails),
					UsefulMethod.getItemByName("alertingname", itemDetails),
					UsefulMethod.getItemByName("externalphonemask", itemDetails),
					UsefulMethod.getItemByName("linenumber", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("cssline", itemDetails),
					1);
			
			ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
			lineList.add(myLine);
			
			//Phone Service
			ArrayList<PhoneService> myServiceList = new ArrayList<PhoneService>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("service"))
					{
					String[] tab = s[1].split(":");
					myServiceList.add(new PhoneService(tab[0], tab[1]));
					}
				}
			
			//Speed Dial and BLF
			ArrayList<SpeedDial> mySDList = new ArrayList<SpeedDial>();
			mySDList.add(new SpeedDial("",
					UsefulMethod.getItemByName("sdlabel", itemDetails),
					UsefulMethod.getItemByName("sdlabel", itemDetails),
					1,
					false,
					UsefulMethod.getItemByName("sdpartition", itemDetails),
					sdType.sd));
			
			//Device Profile
			return new DeviceProfile(UsefulMethod.getItemByName("devicename", itemDetails),
					myWorkbook,
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("producttype", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("buttontemplate", itemDetails),
					myServiceList,
					lineList,
					mySDList);
			}
		else if(type.equals(itemType.user))
			{
			//device list
			ArrayList<String> deviceList = new ArrayList<String>();
			ArrayList<String> UDPList = new ArrayList<String>();
			UDPList.add(UsefulMethod.getItemByName("udpname", itemDetails));
			
			return new User(UsefulMethod.getItemByName("userid", itemDetails),
					deviceList,
					UDPList,
					UsefulMethod.getItemByName("lastname", itemDetails),
					UsefulMethod.getItemByName("firstname", itemDetails),
					UsefulMethod.getItemByName("pin", itemDetails),
					myWorkbook);
			}
		
		//etc...
		throw new Exception("No item type found : "+type.name());
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

