package com.alex.yuza.axlitems;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.DevicePool;
import com.alex.yuza.user.Line;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.cisco.axl.api._8.XFkType;


/**********************************
 * Is the AXLItem design to link the item "Line"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class LineLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	routePartitionName,
	usage,
	alertingName,
	asciiAlertingName,
	shareLineAppearanceCssName;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LineLinker(String name, String routePartitionName) throws Exception
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
		//First we get the UUID of the line
		com.cisco.axl.api._10.GetLineReq req = new com.cisco.axl.api._10.GetLineReq();
		req.setPattern(this.name);
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(req);//We send the request to the CUCM
		
		//Then we delete the line
		com.cisco.axl.api._10.RemoveLineReq deleteReq = new com.cisco.axl.api._10.RemoveLineReq();
		deleteReq.setUuid(resp.getReturn().getLine().getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse response = Variables.getAXLConnectionToCUCMV105().removeLine(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		//First we get the UUID of the line
		com.cisco.axl.api._8.GetLineReq req = new com.cisco.axl.api._8.GetLineReq();
		req.setPattern(this.name);
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM().getLine(req);//We send the request to the CUCM
		
		//Then we delete the line
		com.cisco.axl.api._8.RemoveLineReq deleteReq = new com.cisco.axl.api._8.RemoveLineReq();
		deleteReq.setUuid(resp.getReturn().getLine().getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse response = Variables.getAXLConnectionToCUCM().removeLine(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddLineReq req = new com.cisco.axl.api._10.AddLineReq();
		com.cisco.axl.api._10.XLine params = new com.cisco.axl.api._10.XLine();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.name);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setAlertingName(this.alertingName);
		params.setAsciiAlertingName(this.asciiAlertingName);
		params.setShareLineAppearanceCssName(new JAXBElement(new QName("shareLineAppearanceCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.shareLineAppearanceCssName)));
		/************/
		
		req.setLine(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addLine(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddLineReq req = new com.cisco.axl.api._8.AddLineReq();
		com.cisco.axl.api._8.XLine params = new com.cisco.axl.api._8.XLine();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.name);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setAlertingName(this.alertingName);
		params.setAsciiAlertingName(this.asciiAlertingName);
		params.setShareLineAppearanceCssName(new JAXBElement(new QName("shareLineAppearanceCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.shareLineAppearanceCssName)));
		/************/
		
		req.setLine(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addLine(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateLineReq req = new com.cisco.axl.api._10.UpdateLineReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.name);
		
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateLine(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateLineReq req = new com.cisco.axl.api._8.UpdateLineReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.name);
		
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateLine(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetLineReq req = new com.cisco.axl.api._10.GetLineReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(req);//We send the request to the CUCM
		
		Line myLine = new Line(this.getName(),this.getRoutePartitionName());
		myLine.setUUID(resp.getReturn().getLine().getUuid());
		//etc..
		//Has to be written
		
		return myLine;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetLineReq req = new com.cisco.axl.api._8.GetLineReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM().getLine(req);//We send the request to the CUCM
		
		Line myLine = new Line(this.getName(),this.getRoutePartitionName());
		myLine.setUUID(resp.getReturn().getLine().getUuid());
		//etc..
		//Has to be written
		
		return myLine;//Return a location
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

	public String getUsage()
		{
		return usage;
		}

	public void setUsage(String usage)
		{
		this.usage = usage;
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

	public String getShareLineAppearanceCssName()
		{
		return shareLineAppearanceCssName;
		}

	public void setShareLineAppearanceCssName(String shareLineAppearanceCssName)
		{
		this.shareLineAppearanceCssName = shareLineAppearanceCssName;
		}

	

	

	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

