package com.alex.yuza.csv.misc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.user.CSVUserLine;
import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.csvType;

/**********************************
 * Class used to manage a CSV File creation
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class CSVFileCreation implements CSVFileCreationImpl
	{
	/**
	 * Variables
	 */
	protected Workbook myWorkbook;
	private String siteName;
	protected ArrayList<ArrayList<String>> csvHeaders;
	protected ArrayList<CSVField> csvFieldList;
	protected ArrayList<CSVLine> csvLineList;
	protected String csvFileName;
	protected csvType type;
	protected boolean newFile, unique;
	
	public CSVFileCreation(Workbook myWorkbook,
			csvType type,
			String csvFileName,
			String siteName,
			boolean newFile,
			boolean unique) throws Exception
		{
		this.myWorkbook = myWorkbook;
		this.siteName = siteName;
		this.type = type;
		this.csvFileName = csvFileName;
		this.newFile = newFile;
		this.unique = unique;
		
		go();
		}
	
	/******
	 * Global Method used to create the CSV
	 * @throws Exception 
	 */
	public void go() throws Exception
		{
		try
			{
			/***************
			 * Init
			 */
			//We read the csv template to create the csv header list
			csvHeaders = CSVTools.csvTemplateReader(csvFileName);
			
			//We read the headers to create an arraylist of CSVField
			csvFieldList = CSVTools.parseCSVHeaders(csvHeaders);
			
			/**
			 * We modify the headers a bit to convert the last row into a real header.
			 * Indeed, currently it is made of values such as : [Line_callForwardBusyIntDest]:cucm.forwardbusyint
			 * We just want to keep [Line_callForwardBusyIntDest]
			 */
			csvHeaders = CSVTools.cleanHeaders(csvHeaders);
			
			//Additional initialization tasks
			init();
			
			
			//We resolve all the CSV line
			for(CSVLine c : csvLineList)
				{
				c.resolve();
				}
			/**
			 * End Init 
			 ***************/
			
			/******************
			 * CSV creation
			 * 
			 * We don't care here if the site is not existing
			 */
			//we check if there is something to create
			if(csvLineList.size()>0)
				{
				Variables.getLogger().info("CSV "+type.name()+" creation starts");
				File myCSVFile = null;
				FileWriter myFileWriter = null;
				BufferedWriter myBuffer = null;
				
				try
					{
					/**
					 * According to the boolean "unique" we create a unique file with always the same same
					 * 
					 * In addition according to the boolean "newFile" we either create a brand new CSV file
					 * or just tail the existing one
					 */
					if(unique)
						{
						myCSVFile = new File(".\\"+Variables.getCsvOutputFileName()+"_"+type.name().toUpperCase()+"_ALL.csv");
						}
					else
						{
						myCSVFile = new File(".\\"+Variables.getCsvOutputFileName()+"_"+type.name().toUpperCase()+"_"+siteName+".csv");
						}
					
					boolean fileExist = myCSVFile.exists();
					
					myFileWriter = new FileWriter(myCSVFile, !newFile);
					myBuffer = new BufferedWriter(myFileWriter);
					
					/**
					 * According to the boolean "newFile", we will write the header 
					 * only if it is a new File. If not, we just tail the content line
					 */
					if(newFile)
						{
						CSVTools.writeHeaders(csvHeaders, myBuffer);
						}
					else if(!fileExist)
						{
						CSVTools.writeHeaders(csvHeaders, myBuffer);
						}
					
					//We write the CSV lines
					CSVTools.writeCSVLines(csvLineList, myBuffer);
					
					//Additional writting task
					create(myBuffer);
					
					Variables.getLogger().info("CSV creation ends with success");
					
					JOptionPane.showMessageDialog(null,LanguageManagement.getString("csvcreationsuccess")+type.name(),siteName,JOptionPane.INFORMATION_MESSAGE);
					}
				catch (Exception e)
					{
					Variables.getLogger().error("",e);
					Variables.getLogger().error("Something went bad while writing the file : "+e.getMessage());
					}
				finally
					{
					try
						{
						myBuffer.flush();
						myBuffer.close();
						myFileWriter.close();
						}
					catch(Exception exc)
						{
						Variables.getLogger().error("Something went bad while trying to close the file : "+exc.getMessage());
						}
					}
				}
			else
				{
				//There is no data for the CSV creation
				Variables.getLogger().info("There is no data for the "+type.name()+" CSV. The file will not be created");
				}
			/*********************/
			}
		catch (Exception e)
			{
			throw e;
			}
		
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

