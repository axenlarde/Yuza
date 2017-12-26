package com.alex.yuza.user;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.UserLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Device Pool"
 * 
 * @author RATEL Alexandre
 **********************************/

public class User extends ItemToInject
	{
	/**
	 * Variables
	 */
	private UserLinker myUser;
	private String lastname,//Name is the userID
	firstname,
	pin;
	
	private ArrayList<String> deviceList;
	private ArrayList<String> UDPList;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public User(String name,
			ArrayList<String> deviceList,
			ArrayList<String> UDPList,
			String lastname,
			String firstname,
			String pin,
			Workbook myWorkbook) throws Exception
		{
		super(itemType.user, name, myWorkbook);
		myUser = new UserLinker(name);
		this.deviceList = deviceList;
		this.UDPList = UDPList;
		this.lastname = lastname;
		this.firstname = firstname;
		this.pin = pin;
		}

	public User(String name) throws Exception
		{
		super(itemType.user, name);
		myUser = new UserLinker(name);
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
		return myUser.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myUser.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myUser.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			User myU = (User) myUser.get();
			this.UUID = myU.getUUID();
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
		lastname = CollectionTools.getValueFromCollectionFile(index, lastname, myWorkbook);
		firstname = CollectionTools.getValueFromCollectionFile(index, firstname, myWorkbook);
		pin = CollectionTools.getValueFromCollectionFile(index, pin, myWorkbook);
		
		//Devices
		for(int i=0; i<deviceList.size(); i++)
			{
			deviceList.set(i, CollectionTools.getValueFromCollectionFile(index, deviceList.get(i), myWorkbook));
			}
		
		//UDP
		for(int i=0; i<UDPList.size(); i++)
			{
			UDPList.set(i, CollectionTools.getValueFromCollectionFile(index, UDPList.get(i), myWorkbook));
			}
		
		/**
		 * We set the item parameters
		 */
		myUser.setName(this.getName());
		myUser.setFirstname(firstname);
		myUser.setLastname(lastname);
		myUser.setDeviceList(deviceList);
		myUser.setUDPList(UDPList);
		myUser.setPin(pin);
		/*********/
		}

	public String getLastname()
		{
		return lastname;
		}

	public void setLastname(String lastname)
		{
		this.lastname = lastname;
		}

	public String getFirstname()
		{
		return firstname;
		}

	public void setFirstname(String firstname)
		{
		this.firstname = firstname;
		}

	public ArrayList<String> getDeviceList()
		{
		return deviceList;
		}

	public void setDeviceList(ArrayList<String> deviceList)
		{
		this.deviceList = deviceList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public ArrayList<String> getUDPList()
		{
		return UDPList;
		}

	public void setUDPList(ArrayList<String> uDPList)
		{
		UDPList = uDPList;
		}

	public String getPin()
		{
		return pin;
		}

	public void setPin(String pin)
		{
		this.pin = pin;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

