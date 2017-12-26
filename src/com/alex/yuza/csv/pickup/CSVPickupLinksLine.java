package com.alex.yuza.csv.pickup;

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
public class CSVPickupLinksLine extends CSVLine
	{
	/**
	 * Variables
	 */
	private int indexUser;
	private boolean firstLine;
	
	/***************
	 * Constructor
	 ***************/
	public CSVPickupLinksLine(ArrayList<CSVField> myFieldList, int indexPickup, int indexUser, boolean firstLine,
			Workbook myWorkbook)
		{
		super(myFieldList, indexPickup, myWorkbook);
		this.indexUser = indexUser;
		this.firstLine = firstLine;
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
				if(((f.getName().equals("[COMPONENT_equipmentId]")) ||
						(f.getName().equals("[COMPONENT_auxiliaryId]")) ||
						(f.getName().equals("[COMPONENT_name]"))) && !firstLine)
					{
					f.setValue("");
					}
				else if(f.getName().equals("[DEST_directoryNumber]"))
					{
					f.setValue(CollectionTools.getValueFromCollectionFile(indexUser, f.getValue(), myWorkbook));
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

