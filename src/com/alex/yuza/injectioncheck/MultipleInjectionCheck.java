package com.alex.yuza.injectioncheck;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.Site;
import com.alex.yuza.site.misc.SiteCreation;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.siteType;

/**********************************
 * Class used to check several site in the same time
 * 
 * @author RATEL Alexandre
 **********************************/
public class MultipleInjectionCheck extends Thread
	{
	/**
	 * Variables
	 */
	private String sourceDirectory;
	private ArrayList<String> siteList;

	
	/***************
	 * Constructor
	 ***************/
	public MultipleInjectionCheck()
		{
		super();
		start();
		}
	
	
	
	public void run()
		{
		try
			{
			/*********
			 * Get the sites list
			 */
			sourceDirectory = UsefulMethod.getCollectionFilesDirectory();
			siteList = UsefulMethod.getSiteList(sourceDirectory);
			/********/
			
			/****
			 * Sites inspection
			 */
			sitesInspection();
			/*******/
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e.getMessage(),e);
			JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		}
	
	/**
	 * Used to inspect a list of site
	 */
	private void sitesInspection()
		{
		if((siteList == null) || (siteList.size() == 0))
			{
			Variables.getLogger().info("No site found in the sites list");
			}
		else
			{
			Variables.getLogger().info(siteList.size()+" sites found in the sites list");
			
			for(String s : siteList)
				{
				siteInspection(s);
				System.gc();
				}
			}
		}
	
	
	/***********************
	 * Used to inspect one site
	 */
	private void siteInspection(String siteFileName)
		{
		FileInputStream myStream = null;
		Workbook myWorkbook = null;
		
		try
			{
			Variables.getLogger().info("Processing site file : "+siteFileName);
			
			myStream = new FileInputStream(siteFileName);
			myWorkbook = WorkbookFactory.create(myStream);
			
			//We set the site type
			siteType currentType = UsefulMethod.convertStringToSiteType(CollectionTools.getValueFromCollectionFile("cnaf.siteType", myWorkbook));
			
			//We get the current site
			Site currentSite = CollectionTools.getCurrentSite(myWorkbook);
			
			/********************
			 * We now launch a site inspection site by site
			 */
			InjectionCheck myInjectionCheck = null;
			
			if(Variables.isCUCMReachable())
				{
				//We launch the site injection
				myInjectionCheck = new InjectionCheck(siteFileName,
						myWorkbook,
						currentSite.getName());
				
				while(true)
					{
					if(myInjectionCheck.getState().equals(Thread.State.TERMINATED))
						{
						break;
						}
					else
						{
						this.sleep(300);
						}
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			/******/
			}
		catch (Exception exc)
			{
			exc.printStackTrace();
			}
		finally
			{
			try
				{
				if(myStream != null)myStream.close();
				if(myWorkbook != null)myWorkbook.close();
				
				myWorkbook = null;
				myStream = null;
				}
			catch (IOException ioe)
				{
				ioe.printStackTrace();
				}
			}
		}
	
	
	
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

