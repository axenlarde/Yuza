package com.alex.yuza.csv.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVFileCreation;
import com.alex.yuza.csv.misc.CSVLine;
import com.alex.yuza.csv.misc.CSVTools;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.EmptyListException;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.csvType;

/**********************************
 * Class used to create a CSVFile dedicated to user injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVUserCreation extends CSVFileCreation
	{
	/**
	 * Variables
	 */
	private String collectionFileName;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CSVUserCreation(Workbook myWorkbook, String csvFileName, String siteName, String collectionFileName, boolean newFile, boolean unique) throws Exception
		{
		super(myWorkbook, csvType.user, csvFileName, siteName, newFile, unique);
		this.collectionFileName = collectionFileName;
		}

	
	/**
	 * We put here what is specific to this kind of CSV initialization
	 */
	public void init() throws Exception
		{
		try
			{
			//We check the collection file content
			CollectionFileChecker.checkForUserCSVCreation(myWorkbook);
			
			//From the workbook we create a list of CSVLine
			csvLineList = CSVTools.buildCSVUserLineList(csvFieldList, myWorkbook);
			}
		catch (EmptyListException ele)
			{
			//We warn the user with a message only for the user csv file creation
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("csvusercreationnodata"),"",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	
	/**
	 * We put here what is specific to this kind of CSV creation
	 */
	public void create(BufferedWriter myBuffer) throws Exception
		{
		/***********
		 * Then we write a marker in the collection file. 
		 * The goal here is to be able to know which row has already been written in a csv file.
		 * Indeed we do not want to generate already generated rows 
		 */
		CSVTools.writeMarker(csvLineList, myWorkbook, collectionFileName);
		/******************/
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

