package com.alex.yuza.misc;

import java.lang.reflect.Field;

import com.alex.yuza.utils.UsefulMethod;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

/**********************************
 * Class used to store Phone Line parameters
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhoneLine
	{
	/***
	 * Variables
	 */
	private String description,
	lineLabel,
	asciiLineLabel,
	lineDisplay,
	lineDisplayAscii,
	alertingName,
	alertingNameAscii,
	externalPhoneNumberMask,
	lineNumber,
	routePartition,
	lineCSS;
	
	private int lineIndex;
	
	/***************
	 * Constructor
	 ***************/
	public PhoneLine(String description, String lineLabel,
			String asciiLineLabel, String lineDisplay, String lineDisplayAscii,
			String alertingName, String alertingNameAscii,
			String externalPhoneNumberMask, String lineNumber,
			String routePartition, String lineCSS, int lineIndex)
		{
		this.description = description;
		this.lineLabel = lineLabel;
		this.asciiLineLabel = asciiLineLabel;
		this.lineDisplay = lineDisplay;
		this.lineDisplayAscii = lineDisplayAscii;
		this.alertingName = alertingName;
		this.alertingNameAscii = alertingNameAscii;
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		this.lineNumber = lineNumber;
		this.routePartition = routePartition;
		this.lineCSS = lineCSS;
		this.lineIndex = lineIndex;
		}

	/******
	 * Method used to resolve the line variables
	 * 
	 * In this case, "resolve" means apply regex variables
	 * For instance : cucm.firstname becomes "alexandre"
	 * @throws Exception 
	 */
	public void resolve(Workbook myWorkbook, int index) throws Exception
		{
		lineLabel = CollectionTools.getValueFromCollectionFile(index, lineLabel, myWorkbook);
		asciiLineLabel = CollectionTools.getValueFromCollectionFile(index, asciiLineLabel, myWorkbook);
		lineDisplay = CollectionTools.getValueFromCollectionFile(index, lineDisplay, myWorkbook);
		lineDisplayAscii = CollectionTools.getValueFromCollectionFile(index, lineDisplayAscii, myWorkbook);
		externalPhoneNumberMask = CollectionTools.getValueFromCollectionFile(index, externalPhoneNumberMask, myWorkbook);
		lineNumber = CollectionTools.getValueFromCollectionFile(index, lineNumber, myWorkbook);
		routePartition = CollectionTools.getValueFromCollectionFile(index, routePartition, myWorkbook);
		lineCSS = CollectionTools.getValueFromCollectionFile(index, lineCSS, myWorkbook);
		}

	public String getLineLabel()
		{
		return lineLabel;
		}

	public void setLineLabel(String lineLabel)
		{
		this.lineLabel = lineLabel;
		}

	public String getAsciiLineLabel()
		{
		return asciiLineLabel;
		}

	public void setAsciiLineLabel(String asciiLineLabel)
		{
		this.asciiLineLabel = asciiLineLabel;
		}

	public String getLineDisplay()
		{
		return lineDisplay;
		}

	public void setLineDisplay(String lineDisplay)
		{
		this.lineDisplay = lineDisplay;
		}

	public String getLineDisplayAscii()
		{
		return lineDisplayAscii;
		}

	public void setLineDisplayAscii(String lineDisplayAscii)
		{
		this.lineDisplayAscii = lineDisplayAscii;
		}

	public String getExternalPhoneNumberMask()
		{
		return externalPhoneNumberMask;
		}

	public void setExternalPhoneNumberMask(String externalPhoneNumberMask)
		{
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		}

	public String getLineNumber()
		{
		return lineNumber;
		}

	public void setLineNumber(String lineNumber)
		{
		this.lineNumber = lineNumber;
		}

	public String getRoutePartition()
		{
		return routePartition;
		}

	public void setRoutePartition(String routePartition)
		{
		this.routePartition = routePartition;
		}

	public int getLineIndex()
		{
		return lineIndex;
		}

	public void setLineIndex(int lineIndex)
		{
		this.lineIndex = lineIndex;
		}

	public String getLineCSS()
		{
		return lineCSS;
		}

	public void setLineCSS(String lineCSS)
		{
		this.lineCSS = lineCSS;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getAlertingName()
		{
		return alertingName;
		}

	public void setAlertingName(String alertingName)
		{
		this.alertingName = alertingName;
		}

	public String getAlertingNameAscii()
		{
		return alertingNameAscii;
		}

	public void setAlertingNameAscii(String alertingNameAscii)
		{
		this.alertingNameAscii = alertingNameAscii;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

