package com.alex.yuza.injectioncheck;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.injectioncheck.misc.InjectionCheckTools;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.user.Phone;
import com.alex.yuza.user.misc.TemplateUserReader;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to check the injection of the user's items
 * 
 * @author RATEL Alexandre
 **********************************/
public class InjectionCheck extends Thread
	{
	/**************
	 * Variables
	 */
	private Workbook myWorkbook;
	private String siteName;
	private ArrayList<ItemToInject> itemToCheckList;
	private ArrayList<ItemToInject> userTemplateList;
	private String collectionFileName;
	
	/***************
	 * Constructor
	 */
	public InjectionCheck(String collectionFileName, Workbook myWorkbook, String siteName)
		{
		this.myWorkbook = myWorkbook;
		this.siteName = siteName;
		itemToCheckList = new ArrayList<ItemToInject>();
		userTemplateList = new ArrayList<ItemToInject>();
		this.collectionFileName = collectionFileName;
		
		start();
		}
	
	/******
	 * Global Method used to inject the items
	 */
	public void run()
		{
		/**************
		 * Splash window
		 * Used to make the user waiting
		 */
		WaitingWindow mySplashWindow = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			Object[] options = { LanguageManagement.getString("yes"), LanguageManagement.getString("no")};
			int answer = 1;
			
			/***************
			 * Init
			 */
			//Collection file checking
			CollectionFileChecker.checkForUserCreation(myWorkbook);//Has to be improved
			
			//templateUser file reading
			userTemplateList = TemplateUserReader.readUserTemplate(myWorkbook);
			
			//We build the list of phones
			itemToCheckList = InjectionCheckTools.setPhoneList(myWorkbook, userTemplateList);
			
			//We build the call pickup group list
			itemToCheckList.addAll(InjectionCheckTools.setCPGList(myWorkbook));
			
			//We build the Line group list
			itemToCheckList.addAll(InjectionCheckTools.setLGList(myWorkbook));
			
			//We build the Hunt List list
			itemToCheckList.addAll(InjectionCheckTools.setHLList(myWorkbook));
			
			//We build the Hunt Pilot list
			itemToCheckList.addAll(InjectionCheckTools.setHPList(myWorkbook));
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Inspection
			 */
			String siteDescription = siteName+" - "+UsefulMethod.extractFileName(collectionFileName);
			
			answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("checkquestion"),siteDescription,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if(answer == 0)//Injection asked
				{
				/**********************
				 * Initialization of the AXL connection
				 */
				UsefulMethod.initAXL();
				/*********************/
				
				Variables.getLogger().info("System check starts");
				for(ItemToInject i : itemToCheckList)
					{
					i.build();
					}
				
				Variables.getLogger().info("System check ended with success");
				
				String report = buildReport();
				Variables.getLogger().info("System check report : "+report);
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("checksuccess")+report,siteName,JOptionPane.INFORMATION_MESSAGE);
				
				//Email
				answer = 1;
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("checkresultemailquestion"),siteName,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				
				if(answer == 0)//Email asked
					{
					UsefulMethod.sendEmailToTheAdminList("",
							siteName,
							LanguageManagement.getString("emailreportsystemcheck")+
							siteDescription+
							report);
					}
				}
			else
				{
				Variables.getLogger().debug("The user cancel the Phone injection");
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
	 * Build the report
	 */
	public String buildReport()
		{
		StringBuffer report = new StringBuffer(); 
		
		int InjectedPhones = 0;
		int InjectedCPG = 0;
		int InjectedLG = 0;
		int InjectedHL = 0;
		int InjectedHP = 0;
		int TotalPhones = 0;
		int TotalCPG = 0;
		int TotalLG = 0;
		int TotalHL = 0;
		int TotalHP = 0;
		
		for(ItemToInject i : itemToCheckList)
			{
			if(i.getType().equals(itemType.phone))
				{
				if(i.getStatus().equals(statusType.injected))
					{
					InjectedPhones++;
					}
				TotalPhones++;
				}
			else if(i.getType().equals(itemType.callpickupgroup))
				{
				if(i.getStatus().equals(statusType.injected))
					{
					InjectedCPG++;
					}
				TotalCPG++;
				}
			else if(i.getType().equals(itemType.linegroup))
				{
				if(i.getStatus().equals(statusType.injected))
					{
					InjectedLG++;
					}
				TotalLG++;
				}
			else if(i.getType().equals(itemType.huntlist))
				{
				if(i.getStatus().equals(statusType.injected))
					{
					InjectedHL++;
					}
				TotalHL++;
				}
			else if(i.getType().equals(itemType.huntpilot))
				{
				if(i.getStatus().equals(statusType.injected))
					{
					InjectedHP++;
					}
				TotalHP++;
				}
			}
		
		report.append("\r\n"+LanguageManagement.getString("checkresult")+"\r\n\r\n"+
				"	Phones : "+InjectedPhones+"/"+TotalPhones+"\r\n"+
				"	Call Pickup group : "+InjectedCPG+"/"+TotalCPG+"\r\n"+
				"	Line Group : "+InjectedLG+"/"+TotalLG+"\r\n"+
				"	Hunt List : "+InjectedHL+"/"+TotalHL+"\r\n"+
				"	Hunt Pilot : "+InjectedHP+"/"+TotalHP+"\r\n");
		
		if((InjectedPhones+InjectedCPG+InjectedLG+InjectedHL+InjectedHP) != itemToCheckList.size())
			{
			report.append(LanguageManagement.getString("checkresultmissing")); 
			//We then display what it is still to inject
			for(ItemToInject i : itemToCheckList)
				{
				if(!i.getStatus().equals(statusType.injected))
					{
					if(i.getType().equals(itemType.phone))
						{
						report.append("\r\n - "+i.getType().name()+" : "+i.getName()+" : "+((Phone)i).getDescription());
						}
					else
						{
						report.append("\r\n - "+i.getType().name()+" : "+i.getName());
						}
					}
				}
			}
		
		return report.toString();
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

