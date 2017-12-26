package com.alex.yuza.utils;

import java.util.ArrayList;

/**********************************
 * Class aims to manage langage
 * 
 * @author RATEL Alexandre
 **********************************/
public class LanguageManagement
	{
	/**
	 * Variables
	 */
	
	
	
	/**
	 * Static method aims to return the good
	 * String according to the current language
	 */
	public static String getString(String name)
		{
		try
			{
			String currentLanguage = UsefulMethod.getTargetOption("language");
			
			for(ArrayList<String[][]> myList : Variables.getLanguageContentList())
				{
				if(myList.get(0)[0][1].equals(currentLanguage))
					{
					for(String[][] myTab : myList)
						{
						for(int i = 0; i< myTab.length; i++)
							{
							if(myTab[i][0].equals(name))return myTab[i][1];
							}
						}
					}
				}
			}
		catch (Exception exc)
			{
			exc.printStackTrace();
			}
		Variables.getLogger().error("No value found for : "+name);
		return "No Value Found";
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

