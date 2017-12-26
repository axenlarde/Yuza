package com.alex.yuza.site;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.RegionLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.RelatedRegionDetail;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Region"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Region extends ItemToInject
	{
	/**
	 * Variables
	 */
	private RegionLinker myRegion;
	private String defaultCodec;
	
	private ArrayList<RelatedRegionDetail> g711RegionList;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Region( String name,
			String defaultCodec, ArrayList<RelatedRegionDetail> g711RegionList, Workbook myWorkbook) throws Exception
		{
		super(itemType.region, name, myWorkbook);
		myRegion = new RegionLinker(name);
		this.defaultCodec = defaultCodec;
		this.g711RegionList = g711RegionList;
		
		/**
		 * We set the item parameters
		 */
		myRegion.setName(this.getName());
		myRegion.setDefaultCodec(defaultCodec);
		myRegion.setG711RegionList(g711RegionList);
		/*********/
		}

	public Region(String name) throws Exception
		{
		super(itemType.region, name);
		myRegion = new RegionLinker(name);
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
		return myRegion.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myRegion.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myRegion.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Region myR = (Region) myRegion.get();
			this.UUID = myR.getUUID();
			
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
		//Has to be written for further uses
		}
	

	public String getDefaultCodec()
		{
		return defaultCodec;
		}

	public void setDefaultCodec(String defaultCodec)
		{
		this.defaultCodec = defaultCodec;
		}

	public ArrayList<RelatedRegionDetail> getG711RegionList()
		{
		return g711RegionList;
		}

	public void setG711RegionList(ArrayList<RelatedRegionDetail> g711RegionList)
		{
		this.g711RegionList = g711RegionList;
		}

	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

