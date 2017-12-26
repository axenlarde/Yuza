package com.alex.yuza.misc;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

/**********************************
 * Class used to store a phone service
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhoneService
	{
	/**
	 * Variables
	 */
	private String name, urlName;

	/***************
	 * Constructor
	 ***************/
	public PhoneService(String name, String urlName)
		{
		this.name = name;
		this.urlName = urlName;
		}
	
	/******
	 * Method used to resolve the service variables
	 * 
	 * In this case, "resolve" means apply regex variables
	 * For instance : cucm.firstname becomes "alexandre"
	 * @throws Exception 
	 */
	public void resolve(Workbook myWorkbook) throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(name, myWorkbook);
		urlName = CollectionTools.getValueFromCollectionFile(urlName, myWorkbook);
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getUrlName()
		{
		return urlName;
		}

	public void setUrlName(String urlName)
		{
		this.urlName = urlName;
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

