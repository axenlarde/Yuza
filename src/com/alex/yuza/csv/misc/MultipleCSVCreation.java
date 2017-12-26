package com.alex.yuza.csv.misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.Site;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class aims to manage a multiple 
 * CSV creation process
 * 
 * @author RATEL Alexandre
 **********************************/
public class MultipleCSVCreation extends Thread
	{
	/**
	 * Variables
	 */
	private String sourceDirectory;
	private ArrayList<String> siteList;
	
	/***************
	 * Constructor
	 ***************/
	public MultipleCSVCreation()
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
			 * Sites injection
			 */
			cSVCreation();
			/*******/
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e.getMessage(),e);
			JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		}
	
	
	
	
	
	/**
	 * Used to inject a list of site
	 */
	private void cSVCreation()
		{
		if((siteList == null) || (siteList.size() == 0))
			{
			Variables.getLogger().info("No site found in the sites list");
			}
		else
			{
			Variables.getLogger().info(siteList.size()+" sites found in the sites list");
			
			/*******
			 * We first need to delete all the existing file related to a previous
			 * multiple csv creation 
			 */
			UsefulMethod.deletePreviousCSVFiles(sourceDirectory);
			
			/*****
			 * We use this boolean to create a unique CSV file for
			 * all the site.
			 * 
			 * So it has to be "true" only once
			 */
			boolean b = true;
			boolean unique = false;
			try
				{
				if(UsefulMethod.getTargetOption("csvmultipleuniquefile").equals("true"))unique = true;
				}
			catch (Exception exc)
				{
				Variables.getLogger().error("ERROR : "+exc.getMessage(),exc);
				}
			
			for(String s : siteList)
				{
				oneCSVCreation(s,b,unique);
				
				if(unique)b = false;
				
				System.gc();
				}
			}
		}
	
	/********
	 * Used to inject one site
	 */
	private void oneCSVCreation(String siteFileName, boolean newFile, boolean unique)
		{
		FileInputStream myStream = null;
		Workbook myWorkbook = null;
		
		try
			{
			Variables.getLogger().info("Processing site file : "+siteFileName);
			
			myStream = new FileInputStream(siteFileName);
			myWorkbook = WorkbookFactory.create(myStream);
			
			//We get the current site
			Site currentSite = CollectionTools.getCurrentSite(myWorkbook);
			
			/**
			 * We now launch a CSV creation site by site
			 */
			CSVCreation myCSVCreation = null;
			
			//We launch the CSV creation
			myCSVCreation = new CSVCreation(myWorkbook,
					currentSite.getName(),
					siteFileName,
					newFile,
					unique);
			
			while(true)
				{
				if(myCSVCreation.getState().equals(Thread.State.TERMINATED))
					{
					break;
					}
				else
					{
					this.sleep(300);
					}
				}
			/******/
			}
		catch (Exception exc)
			{
			Variables.getLogger().error("ERROR : exc.getMessage()",exc);
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

