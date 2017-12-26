package com.alex.yuza.user.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.Task;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to create temporary user items
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserCreation extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private SiteManagementWindow mySite;
	private ArrayList<ItemToInject> userItemToInjectList;
	private ArrayList<ItemToInject> userTemplateList;
	
	/****
	 * Constructor
	 */
	public UserCreation(SiteManagementWindow mySite, Workbook myWorkbook)
		{
		this.myWorkbook = myWorkbook;
		this.mySite = mySite;
		userItemToInjectList = new ArrayList<ItemToInject>();
		userTemplateList = new ArrayList<ItemToInject>();
		
		start();
		}
	
	/******
	 * Global Method used to inject the items
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
			CollectionFileChecker.checkForUserCreation(myWorkbook);//Has to be improved
			
			//templateUser file reading
			userTemplateList = TemplateUserReader.readUserTemplate(myWorkbook);
			
			//We build the list of users
			userItemToInjectList = UserTools.setTempUserList(myWorkbook, userTemplateList);
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("injectionquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if(answer == 0)//Injection asked
				{
				Task myTask = UserTools.prepareUserInjection(userItemToInjectList);		
				
				Variables.getLogger().info("User injection starts");
				myTask.proceed();//Injection;
				Variables.getLogger().info("User injection ended with success");
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("userinjectionsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			else
				{
				Variables.getLogger().debug("The user cancel the User injection");
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
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

