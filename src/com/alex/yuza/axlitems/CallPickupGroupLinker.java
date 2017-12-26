package com.alex.yuza.axlitems;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.CallPickupGroupMember;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.CallPickupGroup;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Call Pickpup Group"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class CallPickupGroupLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String pattern,
	description,
	routePartitionName,
	pickupNotification,
	pickupNotificationTimer,
	callingPartyInfo,
	calledPartyInfo;
	
	private ArrayList<CallPickupGroupMember> lineList;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallPickupGroupLinker(String name) throws Exception
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
		com.cisco.axl.api._10.RemoveCallPickupGroupReq deleteReq = new com.cisco.axl.api._10.RemoveCallPickupGroupReq();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeCallPickupGroup(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveCallPickupGroupReq deleteReq = new com.cisco.axl.api._8.RemoveCallPickupGroupReq();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeCallPickupGroup(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddCallPickupGroupReq req = new com.cisco.axl.api._10.AddCallPickupGroupReq();
		com.cisco.axl.api._10.XCallPickupGroup params = new com.cisco.axl.api._10.XCallPickupGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setPattern(pattern);
		params.setDescription(description);
		params.setPickupNotification(pickupNotification);
		params.setPickupNotificationTimer(pickupNotificationTimer);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._10.XCallPickupGroup.CallInfoForPickupNotification myNotif = new com.cisco.axl.api._10.XCallPickupGroup.CallInfoForPickupNotification();
		myNotif.setCalledPartyInfo(calledPartyInfo);
		myNotif.setCallingPartyInfo(callingPartyInfo);
		params.setCallInfoForPickupNotification(myNotif);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._10.XCallPickupGroup.Members membersList = new com.cisco.axl.api._10.XCallPickupGroup.Members();
		
		for(CallPickupGroupMember cpg : lineList)
			{
			com.cisco.axl.api._10.XPickupGroupMember myMember = new com.cisco.axl.api._10.XPickupGroupMember();
			com.cisco.axl.api._10.XPickupGroupMember.PickupDnAndPartition line = new com.cisco.axl.api._10.XPickupGroupMember.PickupDnAndPartition();
			line.setDnPattern(cpg.getNumber());
			line.setRoutePartitionName(SimpleRequest.getUUIDV105(itemType.partition, cpg.getPartition()));
			myMember.setPickupDnAndPartition(line);
			myMember.setPriority(Integer.toString(cpg.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setCallPickupGroup(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addCallPickupGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddCallPickupGroupReq req = new com.cisco.axl.api._8.AddCallPickupGroupReq();
		com.cisco.axl.api._8.XCallPickupGroup params = new com.cisco.axl.api._8.XCallPickupGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setPattern(pattern);
		params.setDescription(description);
		params.setPickupNotification(pickupNotification);
		params.setPickupNotificationTimer(pickupNotificationTimer);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._8.XCallPickupGroup.CallInfoForPickupNotification myNotif = new com.cisco.axl.api._8.XCallPickupGroup.CallInfoForPickupNotification();
		myNotif.setCalledPartyInfo(calledPartyInfo);
		myNotif.setCallingPartyInfo(callingPartyInfo);
		params.setCallInfoForPickupNotification(myNotif);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._8.XCallPickupGroup.Members membersList = new com.cisco.axl.api._8.XCallPickupGroup.Members();
		
		for(CallPickupGroupMember cpg : lineList)
			{
			com.cisco.axl.api._8.XPickupGroupMember myMember = new com.cisco.axl.api._8.XPickupGroupMember();
			com.cisco.axl.api._8.XPickupGroupMember.PickupDnAndPartition line = new com.cisco.axl.api._8.XPickupGroupMember.PickupDnAndPartition();
			line.setDnPattern(cpg.getNumber());
			line.setRoutePartitionName(SimpleRequest.getUUIDV85(itemType.partition, cpg.getPartition()));
			myMember.setPickupDnAndPartition(line);
			myMember.setPriority(Integer.toString(cpg.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setCallPickupGroup(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addCallPickupGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateCallPickupGroupReq req = new com.cisco.axl.api._10.UpdateCallPickupGroupReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateCallPickupGroup(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateCallPickupGroupReq req = new com.cisco.axl.api._8.UpdateCallPickupGroupReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateCallPickupGroup(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetCallPickupGroupReq req = new com.cisco.axl.api._10.GetCallPickupGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetCallPickupGroupRes resp = Variables.getAXLConnectionToCUCMV105().getCallPickupGroup(req);//We send the request to the CUCM
		
		CallPickupGroup myCPG = new CallPickupGroup(this.getName());
		myCPG.setUUID(resp.getReturn().getCallPickupGroup().getUuid());
		//Has to be written
		
		return myCPG;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetCallPickupGroupReq req = new com.cisco.axl.api._8.GetCallPickupGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetCallPickupGroupRes resp = Variables.getAXLConnectionToCUCM().getCallPickupGroup(req);//We send the request to the CUCM
		
		CallPickupGroup myCPG = new CallPickupGroup(this.getName());
		myCPG.setUUID(resp.getReturn().getCallPickupGroup().getUuid());
		//Has to be written
		
		return myCPG;
		}
	/****************/
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getRoutePartitionName()
		{
		return routePartitionName;
		}

	public void setRoutePartitionName(String routePartitionName)
		{
		this.routePartitionName = routePartitionName;
		}

	public String getPickupNotification()
		{
		return pickupNotification;
		}

	public void setPickupNotification(String pickupNotification)
		{
		this.pickupNotification = pickupNotification;
		}

	public String getPickupNotificationTimer()
		{
		return pickupNotificationTimer;
		}

	public void setPickupNotificationTimer(String pickupNotificationTimer)
		{
		this.pickupNotificationTimer = pickupNotificationTimer;
		}

	public String getCallingPartyInfo()
		{
		return callingPartyInfo;
		}

	public void setCallingPartyInfo(String callingPartyInfo)
		{
		this.callingPartyInfo = callingPartyInfo;
		}

	public String getCalledPartyInfo()
		{
		return calledPartyInfo;
		}

	public void setCalledPartyInfo(String calledPartyInfo)
		{
		this.calledPartyInfo = calledPartyInfo;
		}

	public ArrayList<CallPickupGroupMember> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<CallPickupGroupMember> lineList)
		{
		this.lineList = lineList;
		}

	public String getPattern()
		{
		return pattern;
		}

	public void setPattern(String pattern)
		{
		this.pattern = pattern;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

