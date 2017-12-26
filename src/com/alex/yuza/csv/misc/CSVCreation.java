package com.alex.yuza.csv.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.analogs.CSVAnalogCreation;
import com.alex.yuza.csv.didranges.CSVDIDRangesCreation;
import com.alex.yuza.csv.huntlist.CSVHuntListCreation;
import com.alex.yuza.csv.huntlist.CSVHuntListLinksCreation;
import com.alex.yuza.csv.huntpilot.CSVHuntPilotCreation;
import com.alex.yuza.csv.huntpilot.CSVHuntPilotLinksCreation;
import com.alex.yuza.csv.linegroup.CSVLineGroupCreation;
import com.alex.yuza.csv.linegroup.CSVLineGroupLinksCreation;
import com.alex.yuza.csv.pickup.CSVPickupCreation;
import com.alex.yuza.csv.pickup.CSVPickupLinksCreation;
import com.alex.yuza.csv.user.CSVUserCreation;
import com.alex.yuza.csv.user.CSVUserLine;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to manage CSV File Creation :
 * - User
 * - Pickup
 * - Etc...
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVCreation extends Thread
	{
	/**
	 * Variables
	 */
	protected Workbook myWorkbook;
	protected ArrayList<ArrayList<String>> csvHeaders;
	protected ArrayList<CSVField> csvFieldList;
	protected ArrayList<CSVUserLine> csvLineList;
	protected String collectionFileName;
	protected String siteName;
	protected boolean newFile, unique;
	
	public CSVCreation(Workbook myWorkbook, String siteName, String collectionFileName, boolean newFile, boolean unique)
		{
		this.myWorkbook = myWorkbook;
		this.collectionFileName = collectionFileName;
		this.siteName = siteName;
		this.newFile = newFile;
		this.unique = unique;
		
		start();
		}
	
	/******
	 * Global Method used to create the CSV
	 */
	public void run()
		{
		Object[] options = { LanguageManagement.getString("yes"), LanguageManagement.getString("no")};
		int answer = 1;
		/*******
		 * Splash window
		 * Used to make the user waiting
		 */
		WaitingWindow mySplashWindow = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			String siteDescription = siteName+" - "+UsefulMethod.extractFileName(collectionFileName);
			
			answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("csvcreationquestion"),siteDescription,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if(answer == 0)//Injection asked
				{
				Variables.getLogger().info("CSV File creation starts");
				
				//User
				new CSVUserCreation(myWorkbook, Variables.getCsvUserHeadersFileName(), siteName, collectionFileName, newFile, unique);
				
				//Analog
				if(UsefulMethod.getTargetOption("csvanalogenable").equals("true"))
					{
					new CSVAnalogCreation(myWorkbook, Variables.getCsvAnalogHeadersFileName(), siteName, collectionFileName, newFile, unique);
					}
				
				//DID Ranges
				if(UsefulMethod.getTargetOption("csvdidrangesenable").equals("true"))
					{
					new CSVDIDRangesCreation(myWorkbook, Variables.getCsvDIDRangesHeadersFileName(), siteName, newFile, unique);
					}
				
				//Pickup
				if(UsefulMethod.getTargetOption("csvpickupenable").equals("true"))
					{
					new CSVPickupCreation(myWorkbook, Variables.getCsvPickupHeadersFileName(), siteName, newFile, unique);
					new CSVPickupLinksCreation(myWorkbook, Variables.getCsvPickupLinksHeadersFileName(), siteName, newFile, unique);
					}
				
				//Line Group
				if(UsefulMethod.getTargetOption("csvlinegroupenable").equals("true"))
					{
					new CSVLineGroupCreation(myWorkbook, Variables.getCsvLineGroupHeadersFileName(), siteName, newFile, unique);
					new CSVLineGroupLinksCreation(myWorkbook, Variables.getCsvLineGroupLinksHeadersFileName(), siteName, newFile, unique);
					
					new CSVHuntListCreation(myWorkbook, Variables.getCsvHuntListHeadersFileName(), siteName, newFile, unique);
					new CSVHuntListLinksCreation(myWorkbook, Variables.getCsvHuntListLinksHeadersFileName(), siteName, newFile, unique);
					
					new CSVHuntPilotCreation(myWorkbook, Variables.getCsvHuntPilotHeadersFileName(), siteName, newFile, unique);
					new CSVHuntPilotLinksCreation(myWorkbook, Variables.getCsvHuntPilotLinksHeadersFileName(), siteName, newFile, unique);
					}
				}
			else
				{
				Variables.getLogger().debug("The user cancel the CSV creation");
				}
			/*********************/
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e.getMessage(),e);
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("injectionerror")+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		
		mySplashWindow.close();
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

