package com.alex.yuza.user;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

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
 * Class used to define an item of type "Phone"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Phone extends ItemToInject
	{
	/**
	 * Variables
	 */
	private PhoneLinker myPhone;
	private String description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneButtonTemplate,
	phoneCss,
	devicePool,
	location,
	enableExtensionMobility;
	
	private ArrayList<PhoneService> serviceList;
	private ArrayList<PhoneLine> lineList;
	private ArrayList<SpeedDial> sdList;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Phone(String name,
			String description, String productType,
			String protocol, String phoneButtonTemplate,
			String phoneCss, String devicePool, String location,
			ArrayList<PhoneService> serviceList,
			ArrayList<PhoneLine> lineList,
			String enableExtensionMobility,
			Workbook myWorkbook,
			ArrayList<SpeedDial> sdList) throws Exception
		{
		super(itemType.phone, name, myWorkbook);
		myPhone = new PhoneLinker(name);
		this.description = description;
		this.productType = productType;
		this.phoneClass = "Phone";
		this.protocol = protocol;
		this.protocolSide = "User";
		this.phoneButtonTemplate = phoneButtonTemplate;
		this.phoneCss = phoneCss;
		this.devicePool = devicePool;
		this.location = location;
		this.serviceList = serviceList;
		this.lineList = lineList;
		this.sdList = sdList;
		this.enableExtensionMobility = enableExtensionMobility;
		}

	public Phone(String name) throws Exception
		{
		super(itemType.phone, name);
		myPhone = new PhoneLinker(name);
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
		return myPhone.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myPhone.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myPhone.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Phone myPh = (Phone) myPhone.get();
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
		name = CollectionTools.getValueFromCollectionFile(index, name, myWorkbook);
		description = CollectionTools.getValueFromCollectionFile(index, description, myWorkbook);
		devicePool = CollectionTools.getValueFromCollectionFile(index, devicePool, myWorkbook);
		enableExtensionMobility = CollectionTools.getValueFromCollectionFile(index, enableExtensionMobility, myWorkbook);
		location = CollectionTools.getValueFromCollectionFile(index, location, myWorkbook);
		phoneButtonTemplate = CollectionTools.getValueFromCollectionFile(index, phoneButtonTemplate, myWorkbook);
		productType = CollectionTools.getValueFromCollectionFile(index, productType, myWorkbook);
		phoneCss = CollectionTools.getValueFromCollectionFile(index, phoneCss, myWorkbook);
		protocol = CollectionTools.getValueFromCollectionFile(index, protocol, myWorkbook);
		
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
		myPhone.setName(this.getName());
		myPhone.setDescription(this.description);
		myPhone.setDevicePool(this.devicePool);
		myPhone.setEnableExtensionMobility(this.enableExtensionMobility);
		myPhone.setLineList(this.lineList);
		myPhone.setLocation(this.location);
		myPhone.setPhoneButtonTemplate(this.phoneButtonTemplate);
		myPhone.setPhoneClass(this.phoneClass);
		myPhone.setProductType(this.productType);
		myPhone.setPhoneCss(this.phoneCss);
		myPhone.setProtocol(this.protocol);
		myPhone.setProtocolSide(this.protocolSide);
		myPhone.setServiceList(this.serviceList);
		myPhone.setSdList(sdList);
		/*********/
		}
	
	public PhoneLinker getMyPhone()
		{
		return myPhone;
		}

	public void setMyPhone(PhoneLinker myPhone)
		{
		this.myPhone = myPhone;
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

	public String getPhoneButtonTemplate()
		{
		return phoneButtonTemplate;
		}

	public void setPhoneButtonTemplate(String phoneButtonTemplate)
		{
		this.phoneButtonTemplate = phoneButtonTemplate;
		}

	public String getPhoneCss()
		{
		return phoneCss;
		}

	public void setPhoneCss(String phoneCss)
		{
		this.phoneCss = phoneCss;
		}

	public String getDevicePool()
		{
		return devicePool;
		}

	public void setDevicePool(String devicePool)
		{
		this.devicePool = devicePool;
		}

	public String getLocation()
		{
		return location;
		}

	public void setLocation(String location)
		{
		this.location = location;
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

	public String getEnableExtensionMobility()
		{
		return enableExtensionMobility;
		}

	public void setEnableExtensionMobility(String enableExtensionMobility)
		{
		this.enableExtensionMobility = enableExtensionMobility;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
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

