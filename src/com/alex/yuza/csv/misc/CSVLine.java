package com.alex.yuza.csv.misc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to define a CSV line
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class CSVLine implements CSVLineImpl
	{
	/*****
	 * Variables
	 */
	protected ArrayList<CSVField> myFieldList;
	protected int index;
	private boolean toWrite;
	protected Workbook myWorkbook;
	
	/***************
	 * Constructor
	 ***************/
	public CSVLine(ArrayList<CSVField> myFieldList, int index,
			Workbook myWorkbook)
		{
		this.myFieldList = new ArrayList<CSVField>();
		this.index = index;
		this.myWorkbook = myWorkbook;
		toWrite = true;
		
		//Here we make a local copy of the FieldList
		for(CSVField f : myFieldList)
			{
			this.myFieldList.add(new CSVField(f.getName(), f.getValue()));
			}
		}
	
	/*************
	 * Write the line in the provided file
	 * @throws IOException 
	 */
	public void write(BufferedWriter myBuffer) throws Exception
		{
		if(toWrite)
			{
			StringBuffer line = new StringBuffer();
			
			for(CSVField f : myFieldList)
				{
				if(f.isToWrite())
					{
					line.append(f.getValue());
					}
				else
					{
					line.append("");
					}
				line.append(Variables.getCsvSeparator());
				}
			myBuffer.write(line.substring(0, line.length()-1)+Variables.getCsvLineReturn());//We remove the last separator and we write the line
			}
		}
	
	/*******
	 * Method used to resolve other value case
	 * @throws Exception 
	 */
	protected String resolveOtherValue(String patternOther, String pattern) throws Exception
		{
		try
			{
			String s = CollectionTools.getValueFromCollectionFile(index, patternOther, myWorkbook);
			//If we reach this point, it means that the value is not empty
			return s;
			}
		catch (EmptyValueException e)
			{
			//If we reach this point, it means that the value is empty
			return CollectionTools.getValueFromCollectionFile(index, pattern, myWorkbook);
			}
		}
	
	public int getIndex()
		{
		return index;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

