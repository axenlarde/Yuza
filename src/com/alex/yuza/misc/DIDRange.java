package com.alex.yuza.misc;

/**********************************
 * Class used to store a DID range
 * 
 * @author RATEL Alexandre
 **********************************/
public class DIDRange
	{
	/**
	 * Variables
	 */
	String firstDID,lastDID,pattern;

	/***************
	 * Constructor
	 ***************/
	public DIDRange(String firstDID, String lastDID, String pattern)
		{
		this.firstDID = firstDID;
		this.lastDID = lastDID;
		this.pattern = pattern;
		}

	
	public String getFirstDID()
		{
		return firstDID;
		}

	public void setFirstDID(String firstDID)
		{
		this.firstDID = firstDID;
		}

	public String getLastDID()
		{
		return lastDID;
		}

	public void setLastDID(String lastDID)
		{
		this.lastDID = lastDID;
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

