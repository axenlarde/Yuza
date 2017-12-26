package com.alex.yuza.site;

//import jxl.Workbook;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.HuntListLinker;
import com.alex.yuza.axlitems.LineGroupLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.HuntListMember;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.LineGroupMember;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Hunt List"
 * 
 * @author RATEL Alexandre
 **********************************/

public class HuntList extends ItemToInject
	{
	/**
	 * Variables
	 */
	private HuntListLinker myHuntList;
	private String description,
	callManagerGroupName,
	routeListEnabled,
	voiceMailUsage;
	
	private ArrayList<HuntListMember> lgList;
	
	private int index;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntList(String name, Workbook myWorkbook,
			String description,
			String callManagerGroupName, String routeListEnabled,
			String voiceMailUsage, ArrayList<HuntListMember> lgList) throws Exception
		{
		super(itemType.huntlist, name, myWorkbook);
		this.description = description;
		this.callManagerGroupName = callManagerGroupName;
		this.routeListEnabled = routeListEnabled;
		this.voiceMailUsage = voiceMailUsage;
		this.lgList = lgList;
		
		myHuntList = new HuntListLinker(name);
		
		this.index = 0;
		}

	public HuntList(String name) throws Exception
		{
		super(itemType.huntlist, name);
		myHuntList = new HuntListLinker(name);
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
		return myHuntList.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myHuntList.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myHuntList.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			HuntList myHL = (HuntList) myHuntList.get();
			this.UUID = myHL.getUUID();
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
		callManagerGroupName = CollectionTools.getValueFromCollectionFile(index, callManagerGroupName, myWorkbook);
		routeListEnabled = CollectionTools.getValueFromCollectionFile(index, routeListEnabled, myWorkbook);
		voiceMailUsage = CollectionTools.getValueFromCollectionFile(index, voiceMailUsage, myWorkbook);
		
		for(HuntListMember hl : lgList)
			{
			hl.resolve(index, myWorkbook);
			}
		
		myHuntList.setCallManagerGroupName(callManagerGroupName);
		myHuntList.setDescription(description);
		myHuntList.setLgList(lgList);
		myHuntList.setName(name);
		myHuntList.setRouteListEnabled(routeListEnabled);
		myHuntList.setVoiceMailUsage(voiceMailUsage);
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public String getRouteListEnabled()
		{
		return routeListEnabled;
		}

	public void setRouteListEnabled(String routeListEnabled)
		{
		this.routeListEnabled = routeListEnabled;
		}

	public String getVoiceMailUsage()
		{
		return voiceMailUsage;
		}

	public void setVoiceMailUsage(String voiceMailUsage)
		{
		this.voiceMailUsage = voiceMailUsage;
		}

	public ArrayList<HuntListMember> getLgList()
		{
		return lgList;
		}

	public void setLgList(ArrayList<HuntListMember> lgList)
		{
		this.lgList = lgList;
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

