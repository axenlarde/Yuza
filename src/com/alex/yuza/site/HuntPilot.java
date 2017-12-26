package com.alex.yuza.site;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.HuntPilotLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Hunt Pilot"
 * 
 * @author RATEL Alexandre
 **********************************/

public class HuntPilot extends ItemToInject
	{
	/**
	 * Variables
	 */
	private HuntPilotLinker myHuntPilot;
	private String description,
	routePartitionName,
	alertingName,
	asciiAlertingName,
	huntListName;
	
	private int index;


	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntPilot(String name, Workbook myWorkbook,
			String description, String routePartitionName, String alertingName,
			String asciiAlertingName, String huntListName) throws Exception
		{
		super(itemType.huntpilot, name, myWorkbook);
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.alertingName = alertingName;
		this.asciiAlertingName = asciiAlertingName;
		this.huntListName = huntListName;
		
		myHuntPilot = new HuntPilotLinker(name, routePartitionName);
		
		this.index = 0;
		}

	public HuntPilot(String name, String routePartitionName) throws Exception
		{
		super(itemType.huntpilot, name);
		myHuntPilot = new HuntPilotLinker(name, routePartitionName);
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
		return myHuntPilot.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myHuntPilot.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myHuntPilot.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			HuntPilot myHP = (HuntPilot) myHuntPilot.get();
			this.UUID = myHP.getUUID();
			//Has to be enhanced
			
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
		+UUID;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		description = CollectionTools.getValueFromCollectionFile(index, description, myWorkbook);
		routePartitionName = CollectionTools.getValueFromCollectionFile(index, routePartitionName, myWorkbook);
		alertingName = CollectionTools.getValueFromCollectionFile(index, alertingName, myWorkbook);
		asciiAlertingName = CollectionTools.getValueFromCollectionFile(index, asciiAlertingName, myWorkbook);
		huntListName = CollectionTools.getValueFromCollectionFile(index, huntListName, myWorkbook);
		
		myHuntPilot.setAlertingName(alertingName);
		myHuntPilot.setAsciiAlertingName(asciiAlertingName);
		myHuntPilot.setDescription(description);
		myHuntPilot.setHuntListName(huntListName);
		myHuntPilot.setName(name);
		myHuntPilot.setRoutePartitionName(routePartitionName);
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

