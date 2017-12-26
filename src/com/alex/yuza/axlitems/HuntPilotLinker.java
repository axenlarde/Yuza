package com.alex.yuza.axlitems;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.HuntListMember;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.HuntList;
import com.alex.yuza.site.HuntPilot;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Hunt Pilot"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class HuntPilotLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	routePartitionName,
	alertingName,
	asciiAlertingName,
	huntListName;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntPilotLinker(String name, String routePartitionName) throws Exception
		{
		super(name);
		this.routePartitionName = routePartitionName;
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
		com.cisco.axl.api._10.RemoveHuntPilotReq deleteReq = new com.cisco.axl.api._10.RemoveHuntPilotReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeHuntPilot(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveHuntPilotReq deleteReq = new com.cisco.axl.api._8.RemoveHuntPilotReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeHuntPilot(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddHuntPilotReq req = new com.cisco.axl.api._10.AddHuntPilotReq();
		com.cisco.axl.api._10.XHuntPilot params = new com.cisco.axl.api._10.XHuntPilot();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Name
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		params.setDescription(description);
		
		params.setAlertingName(alertingName);
		params.setAsciiAlertingName(asciiAlertingName);
		params.setHuntListName(SimpleRequest.getUUIDV105(itemType.huntlist, huntListName));
		/************/
		
		req.setHuntPilot(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addHuntPilot(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddHuntPilotReq req = new com.cisco.axl.api._8.AddHuntPilotReq();
		com.cisco.axl.api._8.XHuntPilot params = new com.cisco.axl.api._8.XHuntPilot();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Name
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		params.setDescription(description);
		
		params.setAlertingName(alertingName);
		params.setAsciiAlertingName(asciiAlertingName);
		params.setHuntListName(SimpleRequest.getUUIDV85(itemType.huntlist, huntListName));
		/************/
		
		req.setHuntPilot(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addHuntPilot(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateHuntPilotReq req = new com.cisco.axl.api._10.UpdateHuntPilotReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateHuntPilot(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateHuntPilotReq req = new com.cisco.axl.api._8.UpdateHuntPilotReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateHuntPilot(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetHuntPilotReq req = new com.cisco.axl.api._10.GetHuntPilotReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetHuntPilotRes resp = Variables.getAXLConnectionToCUCMV105().getHuntPilot(req);//We send the request to the CUCM
		
		HuntPilot myHP = new HuntPilot(this.getName(), this.routePartitionName);
		myHP.setUUID(resp.getReturn().getHuntPilot().getUuid());
		//Has to be written
		
		return myHP;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetHuntPilotReq req = new com.cisco.axl.api._8.GetHuntPilotReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetHuntPilotRes resp = Variables.getAXLConnectionToCUCM().getHuntPilot(req);//We send the request to the CUCM
		
		HuntPilot myHP = new HuntPilot(this.getName(), this.routePartitionName);
		myHP.setUUID(resp.getReturn().getHuntPilot().getUuid());
		//Has to be written
		
		return myHP;
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

	public String getAlertingName()
		{
		return alertingName;
		}

	public void setAlertingName(String alertingName)
		{
		this.alertingName = alertingName;
		}

	public String getAsciiAlertingName()
		{
		return asciiAlertingName;
		}

	public void setAsciiAlertingName(String asciiAlertingName)
		{
		this.asciiAlertingName = asciiAlertingName;
		}

	public String getHuntListName()
		{
		return huntListName;
		}

	public void setHuntListName(String huntListName)
		{
		this.huntListName = huntListName;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

