package com.alex.yuza.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/************************************
 * Class aims to convert XML file 
 * in String content
 * 
 * @author RATEL Alexandre
 */
public class xMLReader
	{
	/****************
	 * Variables
	 ****************/
	
	/**************************************************
	 * Method used to get XML file content and put it
	 * in a String
	 **************************************************/
	public static String fileRead(String fileName) throws IOException, FileNotFoundException
		{
		String template = new String("");
		Variables.getLogger().info("File name = "+fileName);
		FileReader monFichier = new FileReader(fileName);
		BufferedReader tampon = new BufferedReader(monFichier);
		
		//lecture du fichier
		while(true)
			{
			String ligne = tampon.readLine();
			if(ligne == null)
				{
				break;
				}
			template += ligne;
			}
		Variables.getLogger().info("File content : "+template);
		Variables.getLogger().info("Finished reading");
		tampon.close();
		monFichier.close();
		
		return template;
		}
	
	/*2013*//*RATEL Alexandre 8)*/
	}
