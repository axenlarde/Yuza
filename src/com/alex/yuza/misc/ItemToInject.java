package com.alex.yuza.misc;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;
import com.alex.yuza.misc.ErrorTemplate;

/**********************************
 * Interface aims to define one item to inject
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class ItemToInject implements ItemToInjectImpl
	{
	/**********
	 * Variables
	 */
	protected itemType type;
	protected String UUID;
	protected String name;
	protected Workbook myWorkbook;
	protected statusType status;
	protected ArrayList<ErrorTemplate> errorList;
	
	/***************
	 * Constructor
	 ***************/
	public ItemToInject(itemType type, String name, Workbook myWorkbook)
		{
		this.type = type;
		this.name = name;
		this.UUID = "";
		this.myWorkbook = myWorkbook;
		this.status = statusType.init;
		}
	
	public ItemToInject(itemType type, String name)
		{
		this.type = type;
		this.name = name;
		this.UUID = "";
		this.status = statusType.init;
		}
	
	/****
	 * Method used to launch the build process :
	 * - Prepare the request for injection
	 * - Check if the item already exist and if yes get the UUID
	 */
	public void build() throws Exception
		{
		try
			{
			doBuild();
			}
		catch (Exception e)
			{
			this.status = statusType.error;
			throw e;
			}
		}
	
	
	/**
	 * Method used to launch the injection process
	 * @throws Exception 
	 */
	public void inject() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" of type "+this.getType().name()+" injection process begin");
		
		if(this.status.equals(statusType.waiting))
			{
			try
				{
				this.UUID = doInject();//Item successfully injected
				Variables.getLogger().info("Item "+this.getName()+" successfuly injected");
				this.status = statusType.injected;
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				throw e;
				}
			}
		else if(this.status.equals(statusType.init))
			{
			throw new Exception("Item "+this.getName()+" was not ready for the injection : build it first");
			}
		else
			{
			Variables.getLogger().info("Not to inject : "+this.getName()+" Status : "+this.getStatus().name());
			}
		}
	
	/**
	 * Method used to launch the deletion process
	 * @throws Exception 
	 */
	public void delete() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" deletion process begin");
		
		//If we got the UUID we can proceed
		if((!this.UUID.equals(""))&&(this.UUID != null)&&(this.status.equals(statusType.injected)))
			{
			try
				{
				doDelete();
				this.status = statusType.waiting;//Item successfully deleted
				Variables.getLogger().info("Item "+this.getName()+" deleted successfully");
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				throw e;
				}
			}
		else
			{
			Variables.getLogger().info("The item "+this.getName()+" of type "+this.getType().name()+" can't be deleted because it doesn't exist in the CUCM");
			}
		}
	
	/**
	 * Method used to launch the deletion process
	 * @throws Exception 
	 */
	public void update() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" update process begin");
		
		//If we got the UUID we can proceed
		if((!this.UUID.equals(""))&&(this.UUID != null)&&(this.status.equals(statusType.injected)))
			{
			try
				{
				doUpdate();//Item successfully updated
				Variables.getLogger().info("Item "+this.getName()+" updated successfully");
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				throw e;
				}
			}
		else
			{
			Variables.getLogger().info("The item "+this.getName()+" of type "+this.getType().name()+" can't be updated because it doesn't exist in the CUCM");
			}
		}
	
	
	public itemType getType()
		{
		return type;
		}
	public void setType(itemType type)
		{
		this.type = type;
		}
	public String getUUID()
		{
		return UUID;
		}
	public void setUUID(String uUID)
		{
		UUID = uUID;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public ArrayList<ErrorTemplate> getErrorList()
		{
		return errorList;
		}
	public void setErrorList(ArrayList<ErrorTemplate> errorList)
		{
		this.errorList = errorList;
		}
	public statusType getStatus()
		{
		return status;
		}
	public void setStatus(statusType status)
		{
		this.status = status;
		}
	
	
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

