package com.alex.yuza.misc;

/**********************************
 * Interface design to force to define the following method
 * 
 * @author RATEL Alexandre
 **********************************/
public interface ItemToInjectImpl
	{
	public void doBuild() throws Exception; //Used to prepare the item for the injection by gathering the needed UUID from the CUCM
	
	public String doInject() throws Exception; //Return the UUID of the injected item
	
	public void doDelete() throws Exception; //Delete the item in the CUCM
	
	public void doUpdate() throws Exception; //Update the item in the CUCM
	
	public boolean isExisting() throws Exception; //Update the item in the CUCM
	
	public String getInfo(); //Update the item in the CUCM
	
	public void resolve() throws Exception; //Update the item in the CUCM
	
	/*2015*//*RATEL Alexandre 8)*/
	}

