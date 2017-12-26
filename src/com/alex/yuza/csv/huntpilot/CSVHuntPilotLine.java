package com.alex.yuza.csv.huntpilot;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVField;
import com.alex.yuza.csv.misc.CSVLine;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to store one CSV Line
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVHuntPilotLine extends CSVLine
	{
	/**
	 * Variables
	 */
	
	/***************
	 * Constructor
	 ***************/
	public CSVHuntPilotLine(ArrayList<CSVField> myFieldList, int index,
			Workbook myWorkbook)
		{
		super(myFieldList, index, myWorkbook);
		}

	/******
	 * Method used to fill and resolve the field of the CSVLine
	 * @throws Exception
	 */
	public void resolve() throws Exception
		{
		for(CSVField f : myFieldList)
			{
			try
				{
				if(f.getName().equals("[COMPONENT_huntForwardMaxHuntDuration]"))
					{
					f.setValue(resolveOtherValue("cucm.linegroupotheroveralltimer", f.getValue()));
					}
				else
					{
					if(!f.isDone())f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
					}
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("The field "+f.getName()+" seems to be empty. We then fill it with a blank value");
				f.setValue("");
				}
			}
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

