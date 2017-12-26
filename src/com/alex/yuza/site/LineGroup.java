package com.alex.yuza.site;

//import jxl.Workbook;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.LineGroupLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.LineGroupMember;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "LineGroup"
 * 
 * @author RATEL Alexandre
 **********************************/

public class LineGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private LineGroupLinker myLineGroup;
	private String distributionAlgorithm,
	rnaReversionTimeOut,
	huntAlgorithmNoAnswer,
	huntAlgorithmBusy,
	huntAlgorithmNotAvailable;
	
	private ArrayList<LineGroupMember> lineList;
	
	private int index;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LineGroup(String name, Workbook myWorkbook,
			String distributionAlgorithm,
			String rnaReversionTimeOut, String huntAlgorithmNoAnswer,
			String huntAlgorithmBusy, String huntAlgorithmNotAvailable,
			ArrayList<LineGroupMember> lineList) throws Exception
		{
		super(itemType.linegroup, name, myWorkbook);
		this.myLineGroup = new LineGroupLinker(name);
		this.distributionAlgorithm = distributionAlgorithm;
		this.rnaReversionTimeOut = rnaReversionTimeOut;
		this.huntAlgorithmNoAnswer = huntAlgorithmNoAnswer;
		this.huntAlgorithmBusy = huntAlgorithmBusy;
		this.huntAlgorithmNotAvailable = huntAlgorithmNotAvailable;
		this.lineList = lineList;
		
		index = 0;
		}

	public LineGroup(String name) throws Exception
		{
		super(itemType.linegroup, name);
		myLineGroup = new LineGroupLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myLineGroup.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myLineGroup.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myLineGroup.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			LineGroup myLG = (LineGroup) myLineGroup.get();
			this.UUID = myLG.getUUID();
			//Has to be enhanced
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "
		+UUID;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		distributionAlgorithm = CollectionTools.getValueFromCollectionFile(index, distributionAlgorithm, myWorkbook);
		rnaReversionTimeOut = CollectionTools.getValueFromCollectionFile(index, rnaReversionTimeOut, myWorkbook);
		huntAlgorithmNoAnswer = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmNoAnswer, myWorkbook);
		huntAlgorithmBusy = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmBusy, myWorkbook);
		huntAlgorithmNotAvailable = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmNotAvailable, myWorkbook);
		
		for(LineGroupMember l : lineList)
			{
			l.resolve(index, myWorkbook);
			}
		
		myLineGroup.setDistributionAlgorithm(distributionAlgorithm);
		myLineGroup.setRnaReversionTimeOut(rnaReversionTimeOut);
		myLineGroup.setHuntAlgorithmBusy(huntAlgorithmBusy);
		myLineGroup.setHuntAlgorithmNoAnswer(huntAlgorithmNoAnswer);
		myLineGroup.setHuntAlgorithmNotAvailable(huntAlgorithmNotAvailable);
		myLineGroup.setLineList(lineList);
		}

	public String getDistributionAlgorithm()
		{
		return distributionAlgorithm;
		}

	public void setDistributionAlgorithm(String distributionAlgorithm)
		{
		this.distributionAlgorithm = distributionAlgorithm;
		}

	public String getRnaReversionTimeOut()
		{
		return rnaReversionTimeOut;
		}

	public void setRnaReversionTimeOut(String rnaReversionTimeOut)
		{
		this.rnaReversionTimeOut = rnaReversionTimeOut;
		}

	public String getHuntAlgorithmNoAnswer()
		{
		return huntAlgorithmNoAnswer;
		}

	public void setHuntAlgorithmNoAnswer(String huntAlgorithmNoAnswer)
		{
		this.huntAlgorithmNoAnswer = huntAlgorithmNoAnswer;
		}

	public String getHuntAlgorithmBusy()
		{
		return huntAlgorithmBusy;
		}

	public void setHuntAlgorithmBusy(String huntAlgorithmBusy)
		{
		this.huntAlgorithmBusy = huntAlgorithmBusy;
		}

	public String getHuntAlgorithmNotAvailable()
		{
		return huntAlgorithmNotAvailable;
		}

	public void setHuntAlgorithmNotAvailable(String huntAlgorithmNotAvailable)
		{
		this.huntAlgorithmNotAvailable = huntAlgorithmNotAvailable;
		}

	public ArrayList<LineGroupMember> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<LineGroupMember> lineList)
		{
		this.lineList = lineList;
		}

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

