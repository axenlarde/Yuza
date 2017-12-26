package com.alex.yuza.axlitems;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.HuntListMember;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.LineGroupMember;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.HuntList;
import com.alex.yuza.site.LineGroup;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Hunt List"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class HuntListLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	callManagerGroupName,
	routeListEnabled,
	voiceMailUsage;
	
	private ArrayList<HuntListMember> lgList;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntListLinker(String name) throws Exception
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
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeHuntList(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeHuntList(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddHuntListReq req = new com.cisco.axl.api._10.AddHuntListReq();
		com.cisco.axl.api._10.XHuntList params = new com.cisco.axl.api._10.XHuntList();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		params.setRouteListEnabled(routeListEnabled);
		params.setVoiceMailUsage(voiceMailUsage);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._10.XHuntList.Members membersList = new com.cisco.axl.api._10.XHuntList.Members();
		
		for(HuntListMember hl : lgList)
			{
			com.cisco.axl.api._10.XHuntListMember myMember = new com.cisco.axl.api._10.XHuntListMember();
			myMember.setLineGroupName(new JAXBElement(new QName("lineGroupName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.huntlist, hl.getLineGroupName())));
			myMember.setSelectionOrder(Integer.toString(hl.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setHuntList(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addHuntList(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddHuntListReq req = new com.cisco.axl.api._8.AddHuntListReq();
		com.cisco.axl.api._8.XHuntList params = new com.cisco.axl.api._8.XHuntList();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		params.setRouteListEnabled(routeListEnabled);
		params.setVoiceMailUsage(voiceMailUsage);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._8.XHuntList.Members membersList = new com.cisco.axl.api._8.XHuntList.Members();
		
		for(HuntListMember hl : lgList)
			{
			com.cisco.axl.api._8.XHuntListMember myMember = new com.cisco.axl.api._8.XHuntListMember();
			myMember.setLineGroupName(new JAXBElement(new QName("lineGroupName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.huntlist, hl.getLineGroupName())));
			myMember.setSelectionOrder(Integer.toString(hl.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setHuntList(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addHuntList(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateHuntListReq req = new com.cisco.axl.api._10.UpdateHuntListReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateHuntList(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateHuntListReq req = new com.cisco.axl.api._8.UpdateHuntListReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateHuntList(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetHuntListReq req = new com.cisco.axl.api._10.GetHuntListReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetHuntListRes resp = Variables.getAXLConnectionToCUCMV105().getHuntList(req);//We send the request to the CUCM
		
		HuntList myHL = new HuntList(this.getName());
		myHL.setUUID(resp.getReturn().getHuntList().getUuid());
		//Has to be written
		
		return myHL;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetHuntListReq req = new com.cisco.axl.api._8.GetHuntListReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetHuntListRes resp = Variables.getAXLConnectionToCUCM().getHuntList(req);//We send the request to the CUCM
		
		HuntList myHL = new HuntList(this.getName());
		myHL.setUUID(resp.getReturn().getHuntList().getUuid());
		//Has to be written
		
		return myHL;
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

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public String getRouteListEnabled()
		{
		return routeListEnabled;
		}

	public void setRouteListEnabled(String routeListEnabled)
		{
		this.routeListEnabled = routeListEnabled;
		}

	public String getVoiceMailUsage()
		{
		return voiceMailUsage;
		}

	public void setVoiceMailUsage(String voiceMailUsage)
		{
		this.voiceMailUsage = voiceMailUsage;
		}

	public ArrayList<HuntListMember> getLgList()
		{
		return lgList;
		}

	public void setLgList(ArrayList<HuntListMember> lgList)
		{
		this.lgList = lgList;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

