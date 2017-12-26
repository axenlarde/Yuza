package com.alex.yuza.csv.linegroup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVFileCreation;
import com.alex.yuza.csv.misc.CSVTools;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.csvType;

/**********************************
 * Class used to create a CSVFile dedicated to Line Group injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVLineGroupCreation extends CSVFileCreation
	{
	/**
	 * Variables
	 */
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CSVLineGroupCreation(Workbook myWorkbook, String csvFileName, String siteName, boolean newFile, boolean unique) throws Exception
		{
		super(myWorkbook, csvType.linegroup, csvFileName, siteName, newFile, unique);
		}

	
	/**
	 * We put here what is specific to this kind of CSV initialization
	 */
	public void init() throws Exception
		{
		//From the workbook we create a list of CSVLine
		csvLineList = CSVTools.buildCSVLineGroupLineList(csvFieldList, myWorkbook);
		}
	
	/**
	 * We put here what is specific to this kind of CSV creation
	 */
	public void create(BufferedWriter myBuffer) throws Exception
		{
		//Nothing to do here
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

