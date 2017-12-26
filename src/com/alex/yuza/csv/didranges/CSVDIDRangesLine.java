package com.alex.yuza.csv.didranges;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVField;
import com.alex.yuza.csv.misc.CSVLine;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.DIDRange;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to store one CSV Line
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVDIDRangesLine extends CSVLine
	{
	/**
	 * Variables
	 */
	private DIDRange myDIDRange; 
	
	/***************
	 * Constructor
	 ***************/
	public CSVDIDRangesLine(DIDRange myDIDRange, ArrayList<CSVField> myFieldList, int index,
			Workbook myWorkbook)
		{
		super(myFieldList, index, myWorkbook);
		
		this.myDIDRange = myDIDRange;
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
				if(f.getName().equals("[COMPONENT_firstNumber]"))
					{
					f.setValue((CollectionTools.getValueFromCollectionFile(index, "cucm.internalprefix", myWorkbook))+
							myDIDRange.getFirstDID().substring(myDIDRange.getFirstDID().length()-4, myDIDRange.getFirstDID().length()));
					}
				else if(f.getName().equals("[COMPONENT_lastNumber]"))
					{
					f.setValue((CollectionTools.getValueFromCollectionFile(index, "cucm.internalprefix", myWorkbook))+
							myDIDRange.getLastDID().substring(myDIDRange.getLastDID().length()-4, myDIDRange.getLastDID().length()));
					}
				else if(f.getName().equals("[COMPONENT_externalNum]"))
					{
					f.setValue((myDIDRange.getFirstDID().substring(0, myDIDRange.getFirstDID().length()-4))+
							myDIDRange.getPattern());
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

