package com.alex.yuza.utils;

import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.utils.Variables.itemType;

/**********************************
 * Class used to host static method aims to 
 * check if a value exist in the given server
 * 
 * @author RATEL Alexandre
 **********************************/
public class CheckValueFromServer
	{
	
	/**
	 * Method used to check if a user exist in the CUCM using case insensitive method
	 * 
	 * If the user exist but with a different case we return the corrected value
	 */
	public static String checkAndReplaceUserID(String userID) throws Exception
		{
		try
			{
			/**********************
			 * Initialization of the AXL connection
			 */
			if(Variables.getAXLConnectionToCUCM() == null)
				{
				UsefulMethod.initAXL();
				}
			/*********************/
			
			/***
			 * First we need to know if the given userID exist in the CUCM
			 * 
			 * If not, an exception will be raised and managed at an upper level
			 */
			com.cisco.axl.api._8.GetUserReq req = new com.cisco.axl.api._8.GetUserReq();
			req.setUserid(userID);
			com.cisco.axl.api._8.RUser returnedTags = new com.cisco.axl.api._8.RUser();
			returnedTags.setUserid("");
			req.setReturnedTags(returnedTags);
			com.cisco.axl.api._8.GetUserRes resp = Variables.getAXLConnectionToCUCM().getUser(req);//We send the request to the CUCM
			String cucmUserID = resp.getReturn().getUser().getUserid();
			
			//If yes, we check if the case is correct and if there is a case issue, we return a corrected value 
			if(userID.equals(cucmUserID))
				{
				return userID;
				}
			else
				{
				Variables.getLogger().info("A case issue has been found regarding the user \""+userID+"\", the corrected value is \""+cucmUserID+"\"");
				return cucmUserID;
				}
			}
		catch(Exception e)
			{
			Variables.getLogger().error("An error occures while checking if the user was existing in the CUCM : "+e.getMessage());
			}
		
		return userID;//Default behavior
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

