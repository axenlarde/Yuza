package com.alex.yuza.axlitems;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.LineGroupMember;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.LineGroup;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "LineGroup"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class LineGroupLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String distributionAlgorithm,
	rnaReversionTimeOut,
	huntAlgorithmNoAnswer,
	huntAlgorithmBusy,
	huntAlgorithmNotAvailable;
	
	private ArrayList<LineGroupMember> lineList;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LineGroupLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeLineGroup(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeLineGroup(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddLineGroupReq req = new com.cisco.axl.api._10.AddLineGroupReq();
		com.cisco.axl.api._10.XLineGroup params = new com.cisco.axl.api._10.XLineGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDistributionAlgorithm(distributionAlgorithm);
		params.setHuntAlgorithmBusy(huntAlgorithmBusy);
		params.setHuntAlgorithmNoAnswer(huntAlgorithmNoAnswer);
		params.setHuntAlgorithmNotAvailable(huntAlgorithmNotAvailable);
		params.setRnaReversionTimeOut(rnaReversionTimeOut);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._10.XLineGroup.Members membersList = new com.cisco.axl.api._10.XLineGroup.Members();
		
		for(LineGroupMember l : lineList)
			{
			com.cisco.axl.api._10.XLineGroupMember myMember = new com.cisco.axl.api._10.XLineGroupMember();
			com.cisco.axl.api._10.XDirn number = new com.cisco.axl.api._10.XDirn();
			number.setPattern(l.getNumber());
			number.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, l.getPartition())));
			myMember.setDirectoryNumber(number);
			myMember.setLineSelectionOrder(Integer.toString(l.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setLineGroup(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addLineGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddLineGroupReq req = new com.cisco.axl.api._8.AddLineGroupReq();
		com.cisco.axl.api._8.XLineGroup params = new com.cisco.axl.api._8.XLineGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDistributionAlgorithm(distributionAlgorithm);
		params.setHuntAlgorithmBusy(huntAlgorithmBusy);
		params.setHuntAlgorithmNoAnswer(huntAlgorithmNoAnswer);
		params.setHuntAlgorithmNotAvailable(huntAlgorithmNotAvailable);
		params.setRnaReversionTimeOut(rnaReversionTimeOut);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._8.XLineGroup.Members membersList = new com.cisco.axl.api._8.XLineGroup.Members();
		
		for(LineGroupMember l : lineList)
			{
			com.cisco.axl.api._8.XLineGroupMember myMember = new com.cisco.axl.api._8.XLineGroupMember();
			com.cisco.axl.api._8.XDirn number = new com.cisco.axl.api._8.XDirn();
			number.setPattern(l.getNumber());
			number.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, l.getPartition())));
			myMember.setDirectoryNumber(number);
			myMember.setLineSelectionOrder(Integer.toString(l.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setLineGroup(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addLineGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateRoutePartitionReq req = new com.cisco.axl.api._10.UpdateRoutePartitionReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateRoutePartition(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateRoutePartitionReq req = new com.cisco.axl.api._8.UpdateRoutePartitionReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateRoutePartition(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetLineGroupReq req = new com.cisco.axl.api._10.GetLineGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetLineGroupRes resp = Variables.getAXLConnectionToCUCMV105().getLineGroup(req);//We send the request to the CUCM
		
		LineGroup myLG = new LineGroup(this.getName());
		myLG.setUUID(resp.getReturn().getLineGroup().getUuid());
		//Has to be written
		
		return myLG;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetLineGroupReq req = new com.cisco.axl.api._8.GetLineGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetLineGroupRes resp = Variables.getAXLConnectionToCUCM().getLineGroup(req);//We send the request to the CUCM
		
		LineGroup myLG = new LineGroup(this.getName());
		myLG.setUUID(resp.getReturn().getLineGroup().getUuid());
		//Has to be written
		
		return myLG;
		}
	/****************/

	public String getDistributionAlgorithm()
		{
		return distributionAlgorithm;
		}

	public void setDistributionAlgorithm(String distributionAlgorithm)
		{
		this.distributionAlgorithm = distributionAlgorithm;
		}

	public String getRnaReversionTimeOut()
		{
		return rnaReversionTimeOut;
		}

	public void setRnaReversionTimeOut(String rnaReversionTimeOut)
		{
		this.rnaReversionTimeOut = rnaReversionTimeOut;
		}

	public String getHuntAlgorithmNoAnswer()
		{
		return huntAlgorithmNoAnswer;
		}

	public void setHuntAlgorithmNoAnswer(String huntAlgorithmNoAnswer)
		{
		this.huntAlgorithmNoAnswer = huntAlgorithmNoAnswer;
		}

	public String getHuntAlgorithmBusy()
		{
		return huntAlgorithmBusy;
		}

	public void setHuntAlgorithmBusy(String huntAlgorithmBusy)
		{
		this.huntAlgorithmBusy = huntAlgorithmBusy;
		}

	public String getHuntAlgorithmNotAvailable()
		{
		return huntAlgorithmNotAvailable;
		}

	public void setHuntAlgorithmNotAvailable(String huntAlgorithmNotAvailable)
		{
		this.huntAlgorithmNotAvailable = huntAlgorithmNotAvailable;
		}

	public ArrayList<LineGroupMember> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<LineGroupMember> lineList)
		{
		this.lineList = lineList;
		}

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

