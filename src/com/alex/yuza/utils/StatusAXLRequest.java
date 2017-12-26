
package com.alex.yuza.utils;

import javax.xml.soap.SOAPMessage;

import com.alex.yuza.utils.Variables.statusType;

/****************************************************
 *Class used to store the AXL request and its answer
 ****************************************************/
public class StatusAXLRequest
	{
	/*************
	 * Variables
	 *************/
	//Request
	private String axlRequestName;
	private String axlDeleteRequestName;
	private String axlRequestDesc;
	
	//Answer
	private statusType axlAnswerStatus;
	private String axlAnswerDesc;
	private String uid;
	
	//MultiThreading management
	private boolean process;
	
	//AXL
	protected SOAPMessage soapMessage;
	
	//HTTPS
	protected String httpsMessage;
	
	//Divers
	protected int indexExcel;
	protected int indexUserList;
	
	/***************
	 * Constructor
	 ***************/
	public StatusAXLRequest(String axlRequestName, String axlDeleteRequestName, String axlRequestDesc)
		{
		this.axlRequestName = axlRequestName;
		this.axlRequestDesc = axlRequestDesc;
		this.axlDeleteRequestName = axlDeleteRequestName;
		axlAnswerStatus = statusType.waiting;
		axlAnswerDesc = new String("Action non traitée");
		uid = new String();
		process = true;
		this.soapMessage = null;
		this.httpsMessage = null;
		this.indexExcel = 1;
		}
	
	public StatusAXLRequest(String axlRequestName, String axlDeleteRequestName, String axlRequestDesc, String UID)
		{
		this.axlRequestName = axlRequestName;
		this.axlRequestDesc = axlRequestDesc;
		this.axlDeleteRequestName = axlDeleteRequestName;
		axlAnswerStatus = statusType.waiting;
		axlAnswerDesc = new String("Action non traitée");
		this.uid = UID;
		process = true;
		this.soapMessage = null;
		this.httpsMessage = null;
		this.indexExcel = 1;
		}
	
	public StatusAXLRequest(String axlRequestName, String axlDeleteRequestName, String axlRequestDesc, int indexExcel)
		{
		this.axlRequestName = axlRequestName;
		this.axlRequestDesc = axlRequestDesc;
		this.axlDeleteRequestName = axlDeleteRequestName;
		axlAnswerStatus = statusType.init;
		axlAnswerDesc = new String("Action non traitée");
		uid = new String();
		process = true;
		this.soapMessage = null;
		this.httpsMessage = null;
		this.indexExcel = indexExcel;
		}
	

	public String getAxlRequestName()
		{
		return axlRequestName;
		}

	public void setAxlRequestName(String axlRequestName)
		{
		this.axlRequestName = axlRequestName;
		}

	public String getAxlRequestDesc()
		{
		return axlRequestDesc;
		}

	public void setAxlRequestDesc(String axlRequestDesc)
		{
		this.axlRequestDesc = axlRequestDesc;
		}

	public statusType getAxlAnswerStatus()
		{
		return axlAnswerStatus;
		}

	public void setAxlAnswerStatus(statusType axlAnswerStatus)
		{
		this.axlAnswerStatus = axlAnswerStatus;
		}

	public String getAxlAnswerDesc()
		{
		return axlAnswerDesc;
		}

	public void setAxlAnswerDesc(String axlAnswerDesc)
		{
		this.axlAnswerDesc = axlAnswerDesc;
		}

	public String getUid()
		{
		return uid;
		}

	public void setUid(String uid)
		{
		this.uid = uid;
		}

	public String getAxlDeleteRequestName()
		{
		return axlDeleteRequestName;
		}

	public void setAxlDeleteRequestName(String axlDeleteRequestName)
		{
		this.axlDeleteRequestName = axlDeleteRequestName;
		}

	public boolean getProcess()
		{
		return process;
		}

	public void setProcess(boolean process)
		{
		this.process = process;
		}

	public SOAPMessage getSoapMessage()
		{
		return soapMessage;
		}

	public void setSoapMessage(SOAPMessage soapMessage)
		{
		this.soapMessage = soapMessage;
		}

	public int getIndexExcel()
		{
		return indexExcel;
		}
	
	public void setHttpsMessage(String httpsMessage)
		{
		this.httpsMessage = httpsMessage;
		}
	
	public String getHttpsMessage()
		{
		return httpsMessage;
		}

	public int getIndexUserList()
		{
		return indexUserList;
		}
	
	
	
	/*2012*//*RATEL Alexandre 8)*/
	}
