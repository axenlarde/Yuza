package com.alex.yuza.misc;

/**
 * @author "Alexandre RATEL"
 *
 * Class used to represent an auto correction error
 */
public abstract class ErrorTemplate
	{
	/**
	 * Variables
	 */
	protected String errorDesc;
	protected String advice;
	protected boolean warning;
	
	/**
	 * Constructor
	 */
	public ErrorTemplate(String errorDesc, String advice, boolean warning)
		{
		this.errorDesc = errorDesc;
		this.advice = advice;
		this.warning = warning;
		}

	
	public String getErrorDesc()
		{
		return errorDesc;
		}

	public void setErrorDesc(String errorDesc)
		{
		this.errorDesc = errorDesc;
		}

	public boolean isWarning()
		{
		return warning;
		}

	public void setWarning(boolean warning)
		{
		this.warning = warning;
		}
	
	public String getAdvice()
		{
		return advice;
		}
	
	public void setAdvice(String advice)
		{
		this.advice = advice;
		}
	
	
	
	/*2014*//*AR 8)*/
	}
