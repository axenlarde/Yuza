package com.alex.yuza.misc;

/**
 * @author "Alexandre RATEL"
 *
 * Class used to represent an auto correction error
 */
public class AutoCorrectError extends ErrorTemplate
	{
	/**
	 * Variables
	 */
	private int errorLine;
	private String usedToCompare;
	
	/**
	 * Constructor
	 */
	public AutoCorrectError(int errorLine, String errorDesc, String advice, boolean warning)
		{
		super(errorDesc,advice,warning);
		this.errorLine = errorLine;
		
		usedToCompare = new String(errorLine+errorDesc);
		}
	
	public int getErrorLine()
		{
		return errorLine;
		}

	public void setErrorLine(int errorLine)
		{
		this.errorLine = errorLine;
		}

	public String getUsedToCompare()
		{
		return usedToCompare;
		}

	public void setUsedToCompare(String usedToCompare)
		{
		this.usedToCompare = usedToCompare;
		}
	
	
	
	
	/*2014*//*AR 8)*/
	}
