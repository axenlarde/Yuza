package com.alex.yuza.axlitems.misc;

import com.alex.yuza.misc.ItemToInject;

/**********************************
 * Interface of an AXLItem
 * 
 * @author RATEL Alexandre
 **********************************/
public interface AXLItemLinkerImpl
	{
	/**
	 * Injection
	 */
	public String inject() throws Exception; //Return the UUID of the injected item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public String doInjectVersion85() throws Exception;
	public String doInjectVersion105() throws Exception;
	/**************/
	
	
	
	
	/***********
	 * Deletion
	 */
	public void delete() throws Exception; //Delete the item in the CUCM
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public void doDeleteVersion85() throws Exception;
	public void doDeleteVersion105() throws Exception;
	/***************/
	
	/***********
	 * Initialization
	 */
	public void init() throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public void doInitVersion85() throws Exception;
	public void doInitVersion105() throws Exception;
	/***************/
	
	/***********
	 * Update
	 */
	public void update() throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public void doUpdateVersion85() throws Exception;
	public void doUpdateVersion105() throws Exception;
	/***************/
	
	/***********
	 * Get
	 */
	public ItemToInject get() throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public ItemToInject doGetVersion85() throws Exception;
	public ItemToInject doGetVersion105() throws Exception;
	/***************/
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

