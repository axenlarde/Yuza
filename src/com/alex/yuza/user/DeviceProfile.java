package com.alex.yuza.user;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.DeviceProfileLinker;
import com.alex.yuza.axlitems.PhoneLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PhoneLine;
import com.alex.yuza.misc.PhoneService;
import com.alex.yuza.sd.SpeedDial;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Device Profile"
 * 
 * @author RATEL Alexandre
 **********************************/

public class DeviceProfile extends ItemToInject
	{
	/**
	 * Variables
	 */
	private DeviceProfileLinker myUDP;
	private String description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneButtonTemplate;
	
	private ArrayList<PhoneService> serviceList;
	private ArrayList<PhoneLine> lineList;
	private ArrayList<SpeedDial> sdList;
	
	private int index;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public DeviceProfile(String name, Workbook myWorkbook,
			String description, String productType,
			String protocol,
			String phoneButtonTemplate,
			ArrayList<PhoneService> serviceList,
			ArrayList<PhoneLine> lineList,
			ArrayList<SpeedDial> sdList) throws Exception
		{
		super(itemType.udp, name, myWorkbook);
		myUDP = new DeviceProfileLinker(name);
		this.description = description;
		this.productType = productType;
		this.phoneClass = "Device Profile";
		this.protocol = protocol;
		this.protocolSide = "User";
		this.phoneButtonTemplate = phoneButtonTemplate;
		this.serviceList = serviceList;
		this.lineList = lineList;
		this.sdList = sdList;
		}

	public DeviceProfile(String name) throws Exception
		{
		super(itemType.udp, name);
		myUDP = new DeviceProfileLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{		
		return myUDP.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myUDP.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myUDP.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			DeviceProfile myPh = (DeviceProfile) myUDP.get();
			this.UUID = myPh.getUUID();
			//Etc...
			//Has to be written
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "
		+UUID;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getValueFromCollectionFile(index, this.name, myWorkbook);
		this.description = CollectionTools.getValueFromCollectionFile(index, this.description, myWorkbook);
		this.phoneClass = CollectionTools.getValueFromCollectionFile(index, this.phoneClass, myWorkbook);
		this.productType = CollectionTools.getValueFromCollectionFile(index, this.productType, myWorkbook);
		this.protocol = CollectionTools.getValueFromCollectionFile(index, this.protocol, myWorkbook);
		this.protocolSide = CollectionTools.getValueFromCollectionFile(index, this.protocolSide, myWorkbook);
		this.phoneButtonTemplate = CollectionTools.getValueFromCollectionFile(index, this.phoneButtonTemplate, myWorkbook);
		/*******
		 * Temp
		 */
		if(productType.contains("7937"))
			{
			protocol = "SCCP";
			}
		/****************/
		
		//Line
		for(PhoneLine myLine : lineList)
			{
			myLine.resolve(myWorkbook, index);
			}
		
		//Service
		for(PhoneService myService : serviceList)
			{
			myService.resolve(myWorkbook);
			}
		
		/**
		 * We set the item parameters
		 */
		myUDP.setName(this.getName());
		myUDP.setDescription(this.description);
		myUDP.setLineList(this.lineList);
		myUDP.setPhoneClass(this.phoneClass);
		myUDP.setProductType(this.productType);
		myUDP.setProtocol(this.protocol);
		myUDP.setProtocolSide(this.protocolSide);
		myUDP.setServiceList(this.serviceList);
		myUDP.setSdList(this.sdList);
		myUDP.setPhoneButtonTemplate(phoneButtonTemplate);
		/*********/
		}

	public DeviceProfileLinker getMyUDP()
		{
		return myUDP;
		}

	public void setMyUDP(DeviceProfileLinker myUDP)
		{
		this.myUDP = myUDP;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getProductType()
		{
		return productType;
		}

	public void setProductType(String productType)
		{
		this.productType = productType;
		}

	public String getPhoneClass()
		{
		return phoneClass;
		}

	public void setPhoneClass(String phoneClass)
		{
		this.phoneClass = phoneClass;
		}

	public String getProtocol()
		{
		return protocol;
		}

	public void setProtocol(String protocol)
		{
		this.protocol = protocol;
		}

	public String getProtocolSide()
		{
		return protocolSide;
		}

	public void setProtocolSide(String protocolSide)
		{
		this.protocolSide = protocolSide;
		}

	public ArrayList<PhoneService> getServiceList()
		{
		return serviceList;
		}

	public void setServiceList(ArrayList<PhoneService> serviceList)
		{
		this.serviceList = serviceList;
		}

	public ArrayList<PhoneLine> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<PhoneLine> lineList)
		{
		this.lineList = lineList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public String getPhoneButtonTemplate()
		{
		return phoneButtonTemplate;
		}

	public void setPhoneButtonTemplate(String phoneButtonTemplate)
		{
		this.phoneButtonTemplate = phoneButtonTemplate;
		}

	public ArrayList<SpeedDial> getSdList()
		{
		return sdList;
		}

	public void setSdList(ArrayList<SpeedDial> sdList)
		{
		this.sdList = sdList;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

