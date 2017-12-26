package com.alex.yuza.misc;

import com.alex.yuza.utils.Variables.siteType;

/**********************************
 * Class used to store a site
 * 
 * @author RATEL Alexandre
 **********************************/
public class Site
	{
	/********
	 * Variables
	 */
	private String name, certi, cmg, department;
	private siteType type;
	
	
	/***************
	 * Constructor
	 ***************/
	public Site(String name, String certi, siteType type, String cmg, String department)
		{
		this.name = name;
		this.certi = certi;
		this.cmg = cmg;
		this.type = type;
		this.department = department;
		}


	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}


	public String getCerti()
		{
		return certi;
		}

	public void setCerti(String certi)
		{
		this.certi = certi;
		}


	public String getCmg()
		{
		return cmg;
		}

	public void setCmg(String cmg)
		{
		this.cmg = cmg;
		}

	public String getDepartment()
		{
		return department;
		}

	public void setDepartment(String department)
		{
		this.department = department;
		}
	
	public siteType getType()
		{
		return type;
		}
	
	public void setType(siteType type)
		{
		this.type = type;
		}
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

