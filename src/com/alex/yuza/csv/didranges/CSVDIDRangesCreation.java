package com.alex.yuza.csv.didranges;

import java.io.BufferedWriter;
import org.apache.poi.ss.usermodel.Workbook;
import com.alex.yuza.csv.misc.CSVFileCreation;
import com.alex.yuza.csv.misc.CSVTools;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.utils.Variables.csvType;

/**********************************
 * Class used to create a CSVFile dedicated to DID Ranges
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVDIDRangesCreation extends CSVFileCreation
	{
	/**
	 * Variables
	 */
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CSVDIDRangesCreation(Workbook myWorkbook, String csvFileName, String siteName, boolean newFile, boolean unique) throws Exception
		{
		super(myWorkbook, csvType.didranges, csvFileName, siteName, newFile, unique);
		}

	
	/**
	 * We put here what is specific to this kind of CSV initialization
	 */
	public void init() throws Exception
		{
		//From the workbook we create a list of CSVLine
		csvLineList = CSVTools.buildCSVDIDRangesLineList(csvFieldList, myWorkbook);
		}
	
	/**
	 * We put here what is specific to this kind of CSV creation
	 */
	public void create(BufferedWriter myBuffer) throws Exception
		{
		//Nothing
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

