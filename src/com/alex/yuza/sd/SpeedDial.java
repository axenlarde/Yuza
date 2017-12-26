package com.alex.yuza.sd;

import com.alex.yuza.utils.Variables.sdType;

/**********************************
 * Class used to store a speed dial or BLF item
 * 
 * @author RATEL Alexandre
 **********************************/
public class SpeedDial
	{
	/**
	 * Variables
	 */
	private String number, label, asciiLabel, partition;
	private int index;
	private boolean pickup;
	private sdType type;
	
	/***************
	 * Constructor
	 * for speed dial
	 ***************/
	public SpeedDial(String number, String label, String asciiLabel, int index,
			sdType type)
		{
		this.number = number;
		this.label = label;
		this.asciiLabel = asciiLabel;
		this.index = index;
		this.pickup = false;
		this.partition = "";
		this.type = type;
		}
	
	/***************
	 * Constructor
	 * for BLF
	 ***************/
	public SpeedDial(String number, String label, String asciiLabel, int index, boolean pickup, String partition,
			sdType type)
		{
		this.number = number;
		this.label = label;
		this.asciiLabel = asciiLabel;
		this.index = index;
		this.pickup = pickup;
		this.partition = partition;
		this.type = type;
		}
	
	public String getNumber()
		{
		return number;
		}
	public void setNumber(String number)
		{
		this.number = number;
		}
	public String getLabel()
		{
		return label;
		}
	public void setLabel(String label)
		{
		this.label = label;
		}
	public int getIndex()
		{
		return index;
		}
	public void setIndex(int index)
		{
		this.index = index;
		}
	public boolean isPickup()
		{
		return pickup;
		}
	public void setPickup(boolean pickup)
		{
		this.pickup = pickup;
		}
	public sdType getType()
		{
		return type;
		}
	public void setType(sdType type)
		{
		this.type = type;
		}
	public String getAsciiLabel()
		{
		return asciiLabel;
		}

	public void setAsciiLabel(String asciiLabel)
		{
		this.asciiLabel = asciiLabel;
		}

	public String getPartition()
		{
		return partition;
		}

	public void setPartition(String partition)
		{
		this.partition = partition;
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

