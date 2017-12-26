package com.alex.yuza.axlitems.misc;

import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.cucmAXLVersion;

/**********************************
 * Class used to define an AXLItem
 * 
 * An AXLItem is intent to link the CUCM AXL API with the
 * software. Indeed the AXL API is evaluating version after version
 * and the AXLItem should be modified as less as possible
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class AXLItemLinker implements AXLItemLinkerImpl
	{
	/**
	 * Variables
	 */
	protected String name;
	
	
	/**
	 * Constructor
	 * @throws Exception 
	 */
	public AXLItemLinker(String name) throws Exception
		{
		this.name = name;
		init();
		}
	
	/****
	 * We initialize here what is needed
	 */
	public void init() throws Exception
		{
		if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
			{
			doInitVersion85();
			}
		else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
			{
			doInitVersion105();
			}
		else
			{
			throw new Exception("Unsupported AXL Version");
			}
		}
	
	
	/**
	 * Used to define the injection process for this item
	 */
	public String inject() throws Exception
		{
		if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
			{
			return doInjectVersion85();
			}
		else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
			{
			return doInjectVersion105();
			}
		else
			{
			throw new Exception("Unsupported AXL Version");
			}
		}

	/**
	 * Used to define the deletion process for this item
	 */
	public void delete() throws Exception
		{
		if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
			{
			doDeleteVersion85();
			}
		else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
			{
			doDeleteVersion105();
			}
		else
			{
			throw new Exception("Unsupported AXL Version");	
			}
		}
	
	/**
	 * Used to define the update process for this item
	 */
	public void update() throws Exception
		{
		if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
			{
			doUpdateVersion85();
			}
		else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
			{
			doUpdateVersion105();
			}
		else
			{
			throw new Exception("Unsupported AXL Version");
			}
		}
	
	public ItemToInject get() throws Exception
		{
		if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
			{
			return doGetVersion85();
			}
		else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
			{
			return doGetVersion105();
			}
		else
			{
			throw new Exception("Unsupported AXL Version");
			}
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

