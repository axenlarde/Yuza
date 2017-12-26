package com.alex.yuza.maccollection;

import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to store the informations about
 * Mac to collect
 * 
 * @author RATEL Alexandre
 **********************************/
public class ToScan
	{
	/**
	 * Variables
	 */
	private String desc, mac, userID;
	private int index;
	private statusType status;
	
	/***************
	 * Constructor
	 ***************/
	public ToScan(String desc, String userID, int index)
		{
		this.desc = desc;
		this.mac = null;
		this.userID = userID;
		this.index = index;
		this.status = statusType.waiting;
		}
	
	public String getDesc()
		{
		return desc;
		}
	public void setDesc(String desc)
		{
		this.desc = desc;
		}
	public String getMac()
		{
		return mac;
		}
	public void setMac(String mac)
		{
		this.mac = mac;
		}
	public int getIndex()
		{
		return index;
		}
	public void setIndex(int index)
		{
		this.index = index;
		}
	public statusType getStatus()
		{
		return status;
		}
	public void setStatus(statusType status)
		{
		this.status = status;
		}
	public String getUserID()
		{
		return userID;
		}
	public void setUserID(String userID)
		{
		this.userID = userID;
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

