package com.alex.yuza.csv.user;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVField;
import com.alex.yuza.csv.misc.CSVLine;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to store one CSV Line
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVUserLine extends CSVLine
	{
	/**
	 * Variables
	 */
	private String phone1;
	private String phone2;
	private String phone3;
	
	/***************
	 * Constructor
	 ***************/
	public CSVUserLine(ArrayList<CSVField> myFieldList, int index,
			Workbook myWorkbook)
		{
		super(myFieldList, index, myWorkbook);
		
		phone1 = new String("");
		phone2 = new String("");
		phone3 = new String("");
		}

	/******
	 * Method used to fill and resolve the field of the CSVLine
	 * @throws Exception
	 */
	public void resolve() throws Exception
		{
		resolvePhones();//Used to resolve phone1, 2 and 3
		boolean mevo = false;
		boolean pickup = false;
		
		if(UsefulMethod.getTargetOption("csvpickupenable").equals("true"))pickup = true;
		
		try
			{
			if(CollectionTools.getValueFromCollectionFile(index, "cucm.voicemail", myWorkbook).equals("OUI"))mevo = true;
			}
		catch (EmptyValueException eve)
			{
			mevo = false;
			}
		
		for(CSVField f : myFieldList)
			{
			try
				{
				if(f.getName().equals("[departmentId]"))
					{
					f.setValue(CollectionTools.getValueFromCollectionFile(f.getValue(), myWorkbook));
					}
				else if(f.getName().equals("[profileId]"))
					{
					f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
					}
				else if(f.getName().equals("[User_param3]"))
					{
					/***************************************
					 * We need here to determine either :
					 * - if the user is not using jabber at all
					 * - using jabber in desk phone control mode
					 * - using jabber in softphone mode
					 */
					if((phone1+phone2+phone3).contains("JABBER_Pilotage"))
						{
						f.setValue("CUPC");
						}
					else if((phone1+phone2+phone3).contains("JABBER"))
						{
						f.setValue("Softphone");
						}
					else
						{
						f.setValue("Aucun");
						}
					}
				else if(f.getName().equals("[CUPS_QUICKCREATE_SELECT]"))
					{
					/***************************************
					 * We need here to determine if the user is using Jabber
					 */
					if((phone1+phone2+phone3).contains("JABBER"))
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						f.setValue("Aucun");
						}
					}
				else if(f.getName().equals("[Line_css]"))
					{
					f.setValue(resolveOtherValue("*LFCSS*cucm.othercallrestriction", f.getValue()));
					}
				else if(f.getName().equals("[Line_callForwardAllCss]"))
					{
					f.setValue(resolveOtherValue("*LFCSS*cucm.otherforwardrestriction", f.getValue()));
					}
				else if(f.getName().equals("[User_lineMaxNumCalls]"))
					{
					f.setValue(resolveOtherValue("cucm.othermaxcalls", f.getValue()));
					}
				else if(f.getName().equals("[CHOOSE_MEVOS_QUICKCREATE_SELECT]"))
					{
					/***
					 * We need to know if the user has got a voicemail
					 * and if yes we gonna set all the dependencies up
					 */
					
					if(mevo)
						{
						//We set the voicemail to true
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						f.setValue("Aucun");
						}
					}
				else if((f.getName().equals("[Line_callForwardBusyToVoiceMail]")) ||
						(f.getName().equals("[Line_callForwardBusyIntToVoiceMail]")) ||
						(f.getName().equals("[Line_callForwardNoAnswerToVoiceMail]")) ||
						(f.getName().equals("[Line_callForwardNoAnswerIntToVoiceMail]")) ||
						(f.getName().equals("[Line_callForwardNotRegisteredToVoiceMail]")) || 
						(f.getName().equals("[Line_callForwardNotRegisteredIntToVoiceMail]")))
					{
					/**
					 * A few problems to solve here :
					 * - If mevo is activated the default is to forward busy/noan/unr to mevo
					 * - But if something is set in the forward destination we have to override this default behavior
					 */
					if((!f.isDone()) && mevo)
						{
						f.setValue("Oui");
						}
					else
						{
						f.setValue("");
						}
					}
				else if((f.getName().equals("[Line_callForwardBusyDest]")) ||
						(f.getName().equals("[Line_callForwardBusyIntDest]")) ||
						(f.getName().equals("[Line_callForwardNoAnswerDest]")) ||
						(f.getName().equals("[Line_callForwardNoAnswerIntDest]")) ||
						(f.getName().equals("[Line_callForwardNotRegisteredDest]")) ||
						(f.getName().equals("[Line_callForwardNotRegisteredIntDest]")))
					{
					f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
					
					/**
					 * We have a problem to solve :
					 * - If a forward destination is set, we have to unset the relating forward to voicemail parameter
					 */
					
					//If we arrive here it means that "f" is not empty. Otherwise an Exception would have been raised
					String toModify = new String("");
					if(f.getName().equals("[Line_callForwardBusyDest]"))
						{
						toModify = "[Line_callForwardBusyToVoiceMail]";
						}
					else if(f.getName().equals("[Line_callForwardBusyIntDest]"))
						{
						toModify = "[Line_callForwardBusyIntToVoiceMail]";
						}
					else if(f.getName().equals("[Line_callForwardNoAnswerDest]"))
						{
						toModify = "[Line_callForwardNoAnswerToVoiceMail]";
						}
					else if(f.getName().equals("[Line_callForwardNoAnswerIntDest]"))
						{
						toModify = "[Line_callForwardNoAnswerIntToVoiceMail]";
						}
					else if(f.getName().equals("[Line_callForwardNotRegisteredDest]"))
						{
						toModify = "[Line_callForwardNotRegisteredToVoiceMail]";
						}
					else if(f.getName().equals("[Line_callForwardNotRegisteredIntDest]"))
						{
						toModify = "[Line_callForwardNotRegisteredIntToVoiceMail]";
						}
					
					if(!(toModify.equals("")))
						{
						for(CSVField myField : myFieldList)
							{
							if(myField.getName().equals(toModify))myField.setValue("");
							}
						}
					}
				else if(f.getName().equals("[Device_model]"))
					{
					/**
					 * If the user is using a JABBER or a DECT as primary device, we 
					 * do not have to create a device. It will be done by Kurmi. Si 
					 * we set this value to empty in this case
					 */
					if((phone1.contains("DECT")) || (phone1.contains("JABBER")))
						{
						f.setValue("");
						}
					else
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[Device_ciscoName]"))
					{
					/**
					 * If the user is using a JABBER or a DECT as primary device, we 
					 * do not have to create a device. It will be done by Kurmi. Si 
					 * we set this value to empty in this case
					 */
					if((phone1.contains("DECT")) || (phone1.contains("JABBER")))
						{
						f.setValue("");
						}
					else
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						f.setValue("SEP"+f.getValue());
						}
					}
				else if(f.getName().equals("[Device_product]"))
					{
					/**
					 * If the user is using a JABBER or a DECT as primary device, we 
					 * do not have to create a device. It will be done by Kurmi. Si 
					 * we set this value to empty in this case
					 */
					if((phone1.contains("DECT")) || (phone1.contains("JABBER")))
						{
						f.setValue("");
						}
					else
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[Device_expansionModule1]"))
					{
					if(phone1.contains("7915"))
						{
						f.setValue("7915 24-Button Line Expansion Module");
						}
					else
						{
						f.setValue("");
						}
					}
				else if(f.getName().equals("[QUICKCREATE_ACTIVATE_DEVICE]"))
					{
					if((phone1.contains("DECT")) || (phone1.contains("JABBER")))
						{
						f.setValue("Non");
						}
					else
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[Device_deviceKind]"))
					{
					if((phone1.contains("DECT")) || (phone1.contains("JABBER")))
						{
						f.setValue("");
						}
					else
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[User_param1]"))
					{
					if(phone1.contains("DECT"))
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype1", myWorkbook));
						}
					else if(phone2.contains("DECT"))
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype2", myWorkbook));
						}
					else if(phone3.contains("DECT"))
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype3", myWorkbook));
						}
					else
						{
						f.setValue("");
						}
					}
				else if(f.getName().equals("[Line_callPickupGroupName]"))
					{
					if(pickup)
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						f.setValue("");
						}
					}
				else if(f.getName().equals("[Device_phoneButtonTemplate]"))
					{
					if(phone1.contains("7962"))
						{
						f.setValue("7962G - 5 BLF");
						}
					else if(phone1.contains("7965"))
						{
						f.setValue("7965G - 5 BLF");
						}
					else
						{
						f.setValue("");
						}
					}
				else
					{
					if(!f.isDone())f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
					}
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("The field "+f.getName()+" seems to be empty. We then fill it with a blank value");
				f.setValue("");
				}
			}
		}
	
	/**
	 * Method used to determine the phones value
	 * @throws Exception 
	 */
	private void resolvePhones() throws Exception
		{
		try
			{
			phone1 = CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype1", myWorkbook);
			phone2 = CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype2", myWorkbook);
			phone3 = CollectionTools.getValueFromCollectionFile(index, "cucm.phonetype3", myWorkbook);
			}
		catch (EmptyValueException eve)
			{
			//We do nothing here
			}
		catch (Exception e)
			{
			throw new Exception(e);
			}
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

