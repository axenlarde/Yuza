package com.alex.yuza.maccollection.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.maccollection.MacCollectionWorker;
import com.alex.yuza.maccollection.ScanProgressChecker;
import com.alex.yuza.maccollection.ToScan;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.ui.ScanProgressWindow;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to manage the mac collection
 * 
 * @author RATEL Alexandre
 **********************************/
public class MacCollection extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private SiteManagementWindow mySite;
	private ArrayList<ToScan> toScanList;
	private MacCollectionWorker myWorker;
	private ScanProgressWindow myScanProgressWindow;
	private ScanProgressChecker myScanProgressChecker;
	private String collectionFileName;
	
	/****
	 * Constructor
	 */
	public MacCollection(SiteManagementWindow mySite, Workbook myWorkbook, String collectionFileName)
		{
		this.myWorkbook = myWorkbook;
		this.mySite = mySite;
		toScanList = new ArrayList<ToScan>();
		this.collectionFileName = collectionFileName;
		
		start();
		}
	
	/******
	 * Global Method used to launch the mac collection
	 */
	public void run()
		{
		/*******
		 * Splash window
		 * Used to make the user waiting
		 */
		WaitingWindow mySplashWindow = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			/**********************
			 * Initialization of the AXL connection
			 */
			UsefulMethod.initAXL();
			/*********************/
			
			Object[] options = { LanguageManagement.getString("yes"), LanguageManagement.getString("no")};
			int answer = 1;
			
			/***************
			 * Init
			 */
			//Collection file checking
			CollectionFileChecker.checkForMacCollection(myWorkbook);//Has to be improved
			
			//We build the list of mac to collect
			toScanList = MacTools.setMacToCollectList(myWorkbook);
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("maccollectionquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if(answer == 0)//Injection asked
				{
				Variables.getLogger().info("Mac Collection started");
				
				//we launch the mac collection process
				myWorker = new MacCollectionWorker(toScanList, Integer.parseInt(UsefulMethod.getTargetOption("checkfreq")), myWorkbook, collectionFileName);
				myScanProgressWindow = new ScanProgressWindow(toScanList, this);
				myScanProgressChecker = new ScanProgressChecker(toScanList, myScanProgressWindow, 100);
				
				}
			else
				{
				Variables.getLogger().debug("The user cancel the Mac Collection");
				}
			/*********************/
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error(e);
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("injectionerror")+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		
		mySplashWindow.close();
		}
	
	/**
	 * Method used to stop the Mac Collection process
	 */
	public void endOfCollection()
		{
		myWorker.terminate();
		myScanProgressChecker.terminate();
		
		/**
		 * We want to launch the garbage cleaner but before, 
		 * we need to be sure these threads are terminated
		 * so we wait for
		 */
		try
			{
			myWorker.join();
			myWorker = null;
			
			myScanProgressChecker.join();
			myScanProgressChecker = null;
			
			System.gc();//Run Garbage Collector
			Variables.getLogger().debug("System Garbage Collector launched");
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

