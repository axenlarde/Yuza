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
 * Class used to delete temporary user items
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserDeletion extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private SiteManagementWindow mySite;
	private ArrayList<ItemToInject> userItemToDeleteList;
	private ArrayList<ItemToInject> userTemplateList;
	
	/****
	 * Constructor
	 */
	public UserDeletion(SiteManagementWindow mySite, Workbook myWorkbook)
		{
		this.myWorkbook = myWorkbook;
		this.mySite = mySite;
		userItemToDeleteList = new ArrayList<ItemToInject>();
		userTemplateList = new ArrayList<ItemToInject>();
		
		start();
		}
	
	/******
	 * Global Method used to delete the items
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
			userItemToDeleteList = UserTools.setTempUserDeleteList(myWorkbook, userTemplateList);
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("deletionquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if(answer == 0)//Injection asked
				{
				Task myTask = UserTools.prepareUserDeletion(userItemToDeleteList);		
				
				Variables.getLogger().info("User deletion starts");
				myTask.proceed();//Deletion;
				Variables.getLogger().info("User deletion ended with success");
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("userdeletionsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			else
				{
				Variables.getLogger().debug("The user cancel the User deletion");
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

