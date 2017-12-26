package com.alex.yuza.site;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.TranslationPatternLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Translation Pattern"
 * 
 * @author RATEL Alexandre
 **********************************/

public class TranslationPattern extends ItemToInject
	{
	/**
	 * Variables
	 */
	private TranslationPatternLinker myTranslationPattern;
	private String usage,//Translation
	provideOutsideDialtone,//True
	description,
	routePartitionName,
	callingSearchSpaceName,
	patternUrgency,
	useCallingPartyPhoneMask,
	calledPartyTransformationMask,
	callingPartyTransformationMask,
	digitDiscardInstructionName;

	
	/***************
	 * Constructor
	 * @throws Exception
	 ***************/
	public TranslationPattern(String name,
			String description,
			String routePartitionName, String callingSearchSpaceName,
			String patternUrgency, String useCallingPartyPhoneMask,
			String calledPartyTransformationMask,
			String callingPartyTransformationMask,
			String digitDiscardInstructionName, Workbook myWorkbook) throws Exception
		{
		super(itemType.translationpattern, name, myWorkbook);
		myTranslationPattern = new TranslationPatternLinker(name,routePartitionName);
		this.usage = "Translation";
		this.provideOutsideDialtone = "true";
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.callingSearchSpaceName = callingSearchSpaceName;
		this.patternUrgency = patternUrgency;
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		this.calledPartyTransformationMask = calledPartyTransformationMask;
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public TranslationPattern(String name, String routePartitionName) throws Exception
		{
		super(itemType.translationpattern, name);
		myTranslationPattern = new TranslationPatternLinker(name, routePartitionName);
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
		return myTranslationPattern.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myTranslationPattern.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myTranslationPattern.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			TranslationPattern myTP = (TranslationPattern) myTranslationPattern.get();
			this.UUID = myTP.getUUID();
			
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
	 * @throws Exception 
	 */
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getValueFromCollectionFile(this.name, myWorkbook);
		this.description = CollectionTools.getValueFromCollectionFile(this.description, myWorkbook);
		this.routePartitionName = CollectionTools.getValueFromCollectionFile(this.routePartitionName, myWorkbook);
		this.callingSearchSpaceName = CollectionTools.getValueFromCollectionFile(this.callingSearchSpaceName, myWorkbook);
		this.patternUrgency = CollectionTools.getValueFromCollectionFile(this.patternUrgency, myWorkbook);
		this.useCallingPartyPhoneMask = CollectionTools.getValueFromCollectionFile(this.useCallingPartyPhoneMask, myWorkbook);
		this.callingPartyTransformationMask = CollectionTools.getValueFromCollectionFile(this.callingPartyTransformationMask, myWorkbook);
		this.calledPartyTransformationMask = CollectionTools.getValueFromCollectionFile(this.calledPartyTransformationMask, myWorkbook);
		this.digitDiscardInstructionName = CollectionTools.getValueFromCollectionFile(this.digitDiscardInstructionName, myWorkbook);
		
		/**
		 * We set the item parameters
		 */
		myTranslationPattern.setName(this.getName());
		myTranslationPattern.setRoutePartitionName(routePartitionName);
		myTranslationPattern.setCalledPartyTransformationMask(calledPartyTransformationMask);
		myTranslationPattern.setCallingSearchSpaceName(callingSearchSpaceName);
		myTranslationPattern.setDescription(description);
		myTranslationPattern.setDigitDiscardInstructionName(digitDiscardInstructionName);
		myTranslationPattern.setPatternUrgency(patternUrgency);
		myTranslationPattern.setProvideOutsideDialtone(provideOutsideDialtone);
		myTranslationPattern.setUsage(usage);
		myTranslationPattern.setUseCallingPartyPhoneMask(useCallingPartyPhoneMask);
		myTranslationPattern.setCallingPartyTransformationMask(callingPartyTransformationMask);
		/*********/
		}
	

	public String getUsage()
		{
		return usage;
		}

	public void setUsage(String usage)
		{
		this.usage = usage;
		}

	public String getProvideOutsideDialtone()
		{
		return provideOutsideDialtone;
		}

	public void setProvideOutsideDialtone(String provideOutsideDialtone)
		{
		this.provideOutsideDialtone = provideOutsideDialtone;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getRoutePartitionName()
		{
		return routePartitionName;
		}

	public void setRoutePartitionName(String routePartitionName)
		{
		this.routePartitionName = routePartitionName;
		}

	public String getCallingSearchSpaceName()
		{
		return callingSearchSpaceName;
		}

	public void setCallingSearchSpaceName(String callingSearchSpaceName)
		{
		this.callingSearchSpaceName = callingSearchSpaceName;
		}

	public String getPatternUrgency()
		{
		return patternUrgency;
		}

	public void setPatternUrgency(String patternUrgency)
		{
		this.patternUrgency = patternUrgency;
		}

	public String getUseCallingPartyPhoneMask()
		{
		return useCallingPartyPhoneMask;
		}

	public void setUseCallingPartyPhoneMask(String useCallingPartyPhoneMask)
		{
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		}

	public String getCalledPartyTransformationMask()
		{
		return calledPartyTransformationMask;
		}

	public void setCalledPartyTransformationMask(
			String calledPartyTransformationMask)
		{
		this.calledPartyTransformationMask = calledPartyTransformationMask;
		}

	public String getDigitDiscardInstructionName()
		{
		return digitDiscardInstructionName;
		}

	public void setDigitDiscardInstructionName(String digitDiscardInstructionName)
		{
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public String getCallingPartyTransformationMask()
		{
		return callingPartyTransformationMask;
		}

	public void setCallingPartyTransformationMask(
			String callingPartyTransformationMask)
		{
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		}

	

	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

