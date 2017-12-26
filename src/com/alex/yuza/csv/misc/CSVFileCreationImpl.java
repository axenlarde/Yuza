package com.alex.yuza.csv.misc;

import java.io.BufferedWriter;

/**********************************
 * Interface used to define compulsory
 * method to implement for a CSV creation
 * 
 * @author RATEL Alexandre
 **********************************/
public interface CSVFileCreationImpl
	{
	
	public void init() throws Exception;
	public void create(BufferedWriter myBuffer) throws Exception;
	
	/*2015*//*RATEL Alexandre 8)*/
	}

