package com.alex.yuza.csv.misc;

import java.io.BufferedWriter;

/**********************************
 * Interface used to define a CSV Line
 * 
 * @author RATEL Alexandre
 **********************************/
public interface CSVLineImpl
	{
	
	public void resolve() throws Exception;
	
	public void write(BufferedWriter myBuffer) throws Exception;
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

