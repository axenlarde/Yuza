package com.alex.yuza.main;


import java.util.ArrayList;

import org.apache.log4j.Level;
import com.alex.yuza.ui.MainWindow;
import com.alex.yuza.utils.InitLogging;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Main Class
 * 
 * @author RATEL Alexandre
 **********************************/
public class Main
	{
	/***********
	 * Variables
	 */
	
	
	/***************
	 * Constructor
	 ***************/
	public Main()
		{
		//Set the software name
		Variables.setSoftwareName("YUZA");
		//Set the software version
		Variables.setSoftwareVersion("2.0");
		
		/****************
		 * Initialization of the logging
		 */
		Variables.setLogger(InitLogging.init(Variables.getSoftwareName()+"_LogFile.txt"));
		Variables.getLogger().info("\r\n");
		Variables.getLogger().info("#### Entering application");
		Variables.getLogger().info("## Welcome to : "+Variables.getSoftwareName()+" version "+Variables.getSoftwareVersion());
		Variables.getLogger().info("## Author : RATEL Alexandre : 2015");
		/*******/
		
		/******
		 * Initialization of the variables
		 */
		new Variables();
		/************/
		
		/**********
		 * We check if the java version is compatible
		 */
		UsefulMethod.checkJavaVersion();
		/***************/
		
		/**********************
		 * Reading of the configuration file
		 */
		try
			{
			//Config file reading
			Variables.setTabConfig(UsefulMethod.readFileTab("config", Variables.getConfigFileName()));
			}
		catch(Exception exc)
			{
			UsefulMethod.failedToInit(exc);
			}
		/********************/
		
		/*****************
		 * Setting of the inside variables from what we read in the configuration file
		 */
		try
			{
			UsefulMethod.initInternalVariables();
			}
		catch(Exception exc)
			{
			Variables.getLogger().error(exc.getMessage());
			Variables.getLogger().setLevel(Level.INFO);
			}
		/*********************/
		
		/****************
		 * Init email server
		 */
		try
			{
			UsefulMethod.initEMailServer();
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("Failed to Init eMail server : "+e.getMessage());
			}
		/*************/
		
		/**************************************
		 * We read the input files to get the parameters
		 */
		try
			{
			ArrayList<String> listParams = new ArrayList<String>();
			
			//Language
			Variables.setLanguageContentList(UsefulMethod.readLanguageFile(Variables.getLanguageFileName()));
			
			//Matcher file reading
			Variables.setMatcherList(UsefulMethod.readFile("matchers", Variables.getMatcherFileName()));
			
			//Site list file reading
			Variables.setSiteList(UsefulMethod.readSiteFile(Variables.getSiteListFileName()));
			
			//Phone matching file reading
			listParams.add("phones");
			listParams.add("phone");
			Variables.setPhoneMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getPhoneMatchersFileName()));
			listParams.clear();
			
			//CSS matching file reading
			listParams.add("csss");
			listParams.add("css");
			Variables.setCssMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getCssMatchersFileName()));
			listParams.clear();
			
			//Profile matching file reading
			listParams.add("profiles");
			listParams.add("profile");
			Variables.setProfileMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getProfileMatchersFileName()));
			listParams.clear();
			
			//Phone button template matching file reading
			listParams.add("phones");
			listParams.add("phone");
			Variables.setPBTMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getpBTMatchersFileName()));
			listParams.clear();
			
			//Pickup notification matching file reading
			listParams.add("notifications");
			listParams.add("notification");
			Variables.setPickupNotificationMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getPickupNotificationMatchersFileName()));
			listParams.clear();
			
			//Pickup notification matching file reading
			listParams.add("distributions");
			listParams.add("distribution");
			Variables.setlGDistributionMatcherList(UsefulMethod.readValueMatcherFile(listParams, Variables.getlGDistributionMatchersFileName()));
			listParams.clear();
			}
		catch(Exception exc)
			{
			UsefulMethod.failedToInit(exc);
			}
		/********************/
		
		/*******************
		 * Start main user interface
		 */
		try
			{
			Variables.getLogger().info("Launching Main Window");
			Variables.setMainWindow(new MainWindow());
			}
		catch (Exception exc)
			{
			UsefulMethod.failedToInit(exc);
			}
		/******************/
		
		//End of the main class
		}
	
	
	

	/****************************************/
	public static void main(String[] args)
		{
		new Main();
		}
	/*2015*//*RATEL Alexandre 8)*/

	
	}

