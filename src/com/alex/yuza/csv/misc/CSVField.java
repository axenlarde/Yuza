package com.alex.yuza.csv.misc;


/**********************************
 * Class used to store a CSV Field
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVField
	{
	/**
	 * Variables
	 */
	private String name;
	private String value;
	private boolean toWrite;
	private boolean done;
	
	/***************
	 * Constructor
	 ***************/
	public CSVField(String name, String value)
		{
		this.name = name;
		this.value = value;
		toWrite = true;
		done = false;
		}
	
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public String getValue()
		{
		return value;
		}
	public void setValue(String value)
		{
		this.value = value;
		done = true;//This simply means that the value has already been set once
		}
	public boolean isDone()
		{
		return done;
		}
	public void setDone(boolean done)
		{
		this.done = done;
		}
	public boolean isToWrite()
		{
		return toWrite;
		}
	public void setToWrite(boolean toWrite)
		{
		this.toWrite = toWrite;
		}
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

