package com.alex.yuza.misc;

import com.alex.yuza.utils.Variables.actionType;

/**********************************
 * Class used to store an action toward the CUCM
 * 
 * @author RATEL Alexandre
 **********************************/
public class ToDo
	{
	/**
	 * Variables
	 */
	actionType action;
	ItemToInject item;
	
	/***************
	 * Constructor
	 ***************/
	public ToDo(actionType action, ItemToInject item)
		{
		this.action = action;
		this.item = item;
		}
	
	public actionType getAction()
		{
		return action;
		}
	public void setAction(actionType action)
		{
		this.action = action;
		}
	public ItemToInject getItem()
		{
		return item;
		}
	public void setItem(ItemToInject item)
		{
		this.item = item;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

