package com.alex.yuza.user;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.LineLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Line"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Line extends ItemToInject
	{
	/**
	 * Variables
	 */
	private LineLinker myLine;
	private String description,
	routePartitionName,
	usage,
	alertingName,
	asciiAlertingName,
	shareLineAppearanceCssName;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Line(String name, String description,
			String routePartitionName, String alertingName,
			String asciiAlertingName, String shareLineAppearanceCssName, Workbook myWorkbook, int index) throws Exception
		{
		super(itemType.line, name, myWorkbook);
		myLine = new LineLinker(name,routePartitionName);
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.usage = "Device";
		this.alertingName = alertingName;
		this.asciiAlertingName = asciiAlertingName;
		this.shareLineAppearanceCssName = shareLineAppearanceCssName;
		this.index = index;
		}

	public Line(String name, String routePartitionName) throws Exception
		{
		super(itemType.line, name);
		myLine = new LineLinker(name,routePartitionName);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{	
		return myLine.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myLine.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myLine.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Line myL = (Line) myLine.get();
			this.UUID = myL.getUUID();
			//Etc...
			//Has to be written
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "
		+routePartitionName+" "
		+UUID;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name, myWorkbook);
		description = CollectionTools.getValueFromCollectionFile(index, description, myWorkbook);
		routePartitionName = CollectionTools.getValueFromCollectionFile(index, routePartitionName, myWorkbook);
		alertingName = CollectionTools.getValueFromCollectionFile(index, alertingName, myWorkbook);
		asciiAlertingName = CollectionTools.getValueFromCollectionFile(index, asciiAlertingName, myWorkbook);
		shareLineAppearanceCssName = CollectionTools.getValueFromCollectionFile(index, shareLineAppearanceCssName, myWorkbook);
		
		/**
		 * We set the item parameters
		 */
		myLine.setName(name);//It is the line number
		myLine.setDescription(description);
		myLine.setRoutePartitionName(routePartitionName);
		myLine.setAlertingName(alertingName);
		myLine.setAsciiAlertingName(asciiAlertingName);
		myLine.setShareLineAppearanceCssName(shareLineAppearanceCssName);
		myLine.setUsage(usage);
		/*********/
		}

	public LineLinker getMyLine()
		{
		return myLine;
		}

	public void setMyLine(LineLinker myLine)
		{
		this.myLine = myLine;
		}

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

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	

	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

