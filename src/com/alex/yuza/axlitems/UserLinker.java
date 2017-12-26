package com.alex.yuza.axlitems;

import java.util.ArrayList;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.user.User;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "User"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String lastname,//Name is the userID
	firstname,
	pin;
	
	private ArrayList<String> deviceList;
	private ArrayList<String> UDPList;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public UserLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public void doInitVersion85() throws Exception
		{
		//If needed
		}
	
	public void doInitVersion105() throws Exception
		{
		//If needed
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.RemoveUserReq deleteUserReq = new com.cisco.axl.api._10.RemoveUserReq();
		
		deleteUserReq.setUuid((SimpleRequest.getUUIDV105(itemType.user, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeUser(deleteUserReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveUserReq deleteUserReq = new com.cisco.axl.api._8.RemoveUserReq();
		
		deleteUserReq.setUuid((SimpleRequest.getUUIDV85(itemType.user, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeUser(deleteUserReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddUserReq req = new com.cisco.axl.api._10.AddUserReq();
		com.cisco.axl.api._10.XUser params = new com.cisco.axl.api._10.XUser();
		
		/**
		 * We set the item parameters
		 */
		params.setUserid(this.getName());//Name
		params.setFirstName(this.firstname);
		params.setLastName(this.lastname);
		params.setPin(this.pin);
		
		if(deviceList.size() > 0)
			{
			com.cisco.axl.api._10.XUser.AssociatedDevices myDevices = new com.cisco.axl.api._10.XUser.AssociatedDevices();
			
			for(String s : deviceList)
				{
				myDevices.getDevice().add(s);
				}
			
			params.setAssociatedDevices(myDevices);
			}
		
		if(UDPList.size() > 0)
			{
			com.cisco.axl.api._10.XUser.PhoneProfiles myUDPs = new com.cisco.axl.api._10.XUser.PhoneProfiles();
			
			for(String udp : UDPList)
				{
				//myUDPs.getProfileName().add(SimpleRequest.getUUIDV105(itemType.udp, udp));
				}
			
			params.setPhoneProfiles(myUDPs);
			}
		/************/
		
		req.setUser(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addUser(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddUserReq req = new com.cisco.axl.api._8.AddUserReq();
		com.cisco.axl.api._8.XUser params = new com.cisco.axl.api._8.XUser();
		
		/**
		 * We set the item parameters
		 */
		params.setUserid(this.getName());//Name
		params.setFirstName(this.firstname);
		params.setLastName(this.lastname);
		params.setPin(this.pin);
		
		if(deviceList.size() > 0)
			{
			com.cisco.axl.api._8.XUser.AssociatedDevices myDevices = new com.cisco.axl.api._8.XUser.AssociatedDevices();
			
			for(String s : deviceList)
				{
				myDevices.getDevice().add(s);
				}
			
			params.setAssociatedDevices(myDevices);
			}
		
		if(UDPList.size() > 0)
			{
			com.cisco.axl.api._8.XUser.PhoneProfiles myUDPs = new com.cisco.axl.api._8.XUser.PhoneProfiles();
			
			for(String udp : UDPList)
				{
				//myUDPs.getProfileName().add(SimpleRequest.getUUIDV85(itemType.udp, udp));
				}
			
			params.setPhoneProfiles(myUDPs);
			}
		/************/
		
		req.setUser(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addUser(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateUserReq req = new com.cisco.axl.api._10.UpdateUserReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setUserid(this.getName());
		req.setPin(this.pin);
		
		if(deviceList.size() > 0)
			{
			com.cisco.axl.api._10.UpdateUserReq.AssociatedDevices myDevices = new com.cisco.axl.api._10.UpdateUserReq.AssociatedDevices();
			
			for(String s : deviceList)
				{
				myDevices.getDevice().add(s);
				}
			
			req.setAssociatedDevices(myDevices);
			}
		
		if(UDPList.size() > 0)
			{
			com.cisco.axl.api._10.UpdateUserReq.PhoneProfiles myUDPs = new com.cisco.axl.api._10.UpdateUserReq.PhoneProfiles();
			
			for(String udp : UDPList)
				{
				myUDPs.getProfileName().add(SimpleRequest.getUUIDV105(itemType.udp, udp));
				}
			
			req.setPhoneProfiles(myUDPs);
			}
		
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateUser(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateUserReq req = new com.cisco.axl.api._8.UpdateUserReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setUserid(this.getName());
		req.setPin(this.pin);
		
		if(deviceList.size() > 0)
			{
			com.cisco.axl.api._8.UpdateUserReq.AssociatedDevices myDevices = new com.cisco.axl.api._8.UpdateUserReq.AssociatedDevices();
			
			for(String s : deviceList)
				{
				myDevices.getDevice().add(s);
				}
			
			req.setAssociatedDevices(myDevices);
			}
		
		if(UDPList.size() > 0)
			{
			com.cisco.axl.api._8.UpdateUserReq.PhoneProfiles myUDPs = new com.cisco.axl.api._8.UpdateUserReq.PhoneProfiles();
			
			for(String udp : UDPList)
				{
				myUDPs.getProfileName().add(SimpleRequest.getUUIDV85(itemType.udp, udp));
				}
			
			req.setPhoneProfiles(myUDPs);
			}
		
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateUser(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetUserReq req = new com.cisco.axl.api._10.GetUserReq();
		
		/******************
		 * We set the item parameters
		 */
		req.setUserid(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetUserRes resp = Variables.getAXLConnectionToCUCMV105().getUser(req);//We send the request to the CUCM
		
		User myU = new User(this.getName());
		myU.setUUID(resp.getReturn().getUser().getUuid());
		
		return myU;//Return a User
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetUserReq req = new com.cisco.axl.api._8.GetUserReq();
		
		/******************
		 * We set the item parameters
		 */
		req.setUserid(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetUserRes resp = Variables.getAXLConnectionToCUCM().getUser(req);//We send the request to the CUCM
		
		User myU = new User(this.getName());
		myU.setUUID(resp.getReturn().getUser().getUuid());
		
		return myU;//Return a User
		}
	/****************/

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

