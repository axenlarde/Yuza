package com.alex.yuza.site;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.CallPickupGroupLinker;
import com.alex.yuza.axlitems.LineGroupLinker;
import com.alex.yuza.misc.CallPickupGroupMember;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.LineGroupMember;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Call Pickup Group"
 * 
 * @author RATEL Alexandre
 **********************************/

public class CallPickupGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private CallPickupGroupLinker myCallPickupGroup;
	private String pattern,
	description,
	routePartitionName,
	pickupNotification,
	pickupNotificationTimer,
	callingPartyInfo,
	calledPartyInfo;
	
	private ArrayList<CallPickupGroupMember> lineList;
	
	private int index;
	
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallPickupGroup(String name, Workbook myWorkbook,
			String pattern, String description, String routePartitionName,
			String pickupNotification, String pickupNotificationTimer,
			String callingPartyInfo, String calledPartyInfo,
			ArrayList<CallPickupGroupMember> lineList) throws Exception
		{
		super(itemType.callpickupgroup, name, myWorkbook);
		this.pattern = pattern;
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.pickupNotification = pickupNotification;
		this.pickupNotificationTimer = pickupNotificationTimer;
		this.callingPartyInfo = callingPartyInfo;
		this.calledPartyInfo = calledPartyInfo;
		this.lineList = lineList;
		myCallPickupGroup = new CallPickupGroupLinker(name);
		
		index = 0;
		}

	public CallPickupGroup(String name) throws Exception
		{
		super(itemType.callpickupgroup, name);
		myCallPickupGroup = new CallPickupGroupLinker(name);
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
		return myCallPickupGroup.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myCallPickupGroup.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myCallPickupGroup.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			CallPickupGroup myCPG = (CallPickupGroup) myCallPickupGroup.get();
			this.UUID = myCPG.getUUID();
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
		pickupNotification = CollectionTools.getValueFromCollectionFile(index, pickupNotification, myWorkbook);
		pickupNotificationTimer = CollectionTools.getValueFromCollectionFile(index, pickupNotificationTimer, myWorkbook);
		callingPartyInfo = CollectionTools.getValueFromCollectionFile(index, callingPartyInfo, myWorkbook);
		calledPartyInfo = CollectionTools.getValueFromCollectionFile(index, calledPartyInfo, myWorkbook);
		
		for(CallPickupGroupMember cpg : lineList)
			{
			cpg.resolve(index, myWorkbook);
			}
		
		myCallPickupGroup.setCalledPartyInfo(calledPartyInfo);
		myCallPickupGroup.setCallingPartyInfo(callingPartyInfo);
		myCallPickupGroup.setDescription(description);
		myCallPickupGroup.setLineList(lineList);
		myCallPickupGroup.setPattern(pattern);
		myCallPickupGroup.setPickupNotification(pickupNotification);
		myCallPickupGroup.setPickupNotificationTimer(pickupNotificationTimer);
		myCallPickupGroup.setRoutePartitionName(routePartitionName);
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

	public String getPickupNotification()
		{
		return pickupNotification;
		}

	public void setPickupNotification(String pickupNotification)
		{
		this.pickupNotification = pickupNotification;
		}

	public String getPickupNotificationTimer()
		{
		return pickupNotificationTimer;
		}

	public void setPickupNotificationTimer(String pickupNotificationTimer)
		{
		this.pickupNotificationTimer = pickupNotificationTimer;
		}

	public String getCallingPartyInfo()
		{
		return callingPartyInfo;
		}

	public void setCallingPartyInfo(String callingPartyInfo)
		{
		this.callingPartyInfo = callingPartyInfo;
		}

	public String getCalledPartyInfo()
		{
		return calledPartyInfo;
		}

	public void setCalledPartyInfo(String calledPartyInfo)
		{
		this.calledPartyInfo = calledPartyInfo;
		}

	public ArrayList<CallPickupGroupMember> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<CallPickupGroupMember> lineList)
		{
		this.lineList = lineList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
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

