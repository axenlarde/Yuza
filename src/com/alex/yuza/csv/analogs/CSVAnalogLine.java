package com.alex.yuza.csv.analogs;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.csv.misc.CSVField;
import com.alex.yuza.csv.misc.CSVLine;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.gwType;

/**********************************
 * Class used to store one CSV Line
 * 
 * @author RATEL Alexandre
 **********************************/
public class CSVAnalogLine extends CSVLine
	{
	/**
	 * Variables
	 */
	private gwType type;
	private int port;
	
	/***************
	 * Constructor
	 ***************/
	public CSVAnalogLine(ArrayList<CSVField> myFieldList, int index, gwType type, int port,
			Workbook myWorkbook)
		{
		super(myFieldList, index, myWorkbook);
		
		this.type = type;
		this.port = port;
		}

	/******
	 * Method used to fill and resolve the field of the CSVLine
	 * @throws Exception
	 */
	public void resolve() throws Exception
		{
		String mac = "";
		if(type.equals(gwType.vg))
			{
			mac = CollectionTools.getValueFromCollectionFile(index, "cucm.mac", myWorkbook);
			//"mac" in case of an Audiocodes is empty
			}
		
		String lineNumber = CollectionTools.getValueFromCollectionFile(index, "cucm.linenumber", myWorkbook);
		String gwInfo = CollectionTools.getValueFromCollectionFile(index, "cnaf.gatewayinfo", myWorkbook);
		
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
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue("AGENT");
						}
					else
						{
						//Audiocodes
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[Line_css]"))
					{
					f.setValue(resolveOtherValue("*LFCSS*cucm.othercallrestriction", f.getValue()));
					}
				else if((f.getName().equals("[Line_callForwardAllCss]")) ||
						(f.getName().equals("[Line_callForwardBusyCss]")) ||
						(f.getName().equals("[Line_callForwardBusyIntCss]")) || 
						(f.getName().equals("[Line_callForwardNoAnswerCss]")) || 
						(f.getName().equals("[Line_callForwardNoAnswerIntCss]")) || 
						(f.getName().equals("[Line_callForwardNotRegisteredCss]")) || 
						(f.getName().equals("[Line_callForwardNotRegisteredIntCss]")))
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
				else if(f.getName().equals("[Device_ciscoName]"))
					{
					/**
					 * If it is a VG2XX, the "name" has to be of this kind : AND989028BA0000
					 * But if it is an Audiocodes, it has to be like that : SEPEE+cucm.linenumber
					 * 
					 * Normally, mac and line number have been already checked as non empty
					 * in a previous step. So we do not check them again, we just use them as they are
					 */
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue("AN"+mac.substring(2, mac.length())+"00"+port);
						}
					else
						{
						//Audiocodes
						f.setValue("SEPEE"+lineNumber);
						}
					}
				else if(f.getName().equals("[Device_vgDomainName]"))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						//Audiocodes
						f.setValue("");
						}
					}
				else if((f.getName().equals("[Device_model]")) || 
						(f.getName().equals("[Device_product]")))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						//Audiocodes
						f.setValue("Third-party SIP Device (Basic)");
						}
					}
				else if(f.getName().equals("[Device_deviceKind]"))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						if(gwInfo.contains("VG204"))
							{
							f.setValue("VG204 SCCP");
							}
						else
							{
							f.setValue("VG202 SCCP");
							}
						}
					else
						{
						//Audiocodes
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
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
					if(type.equals(gwType.vg))
						{
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					else
						{
						f.setValue("");
						}
					}
				else if((f.getName().equals("[Device_numSlot]")) ||
						(f.getName().equals("[Device_numSubUnit]")))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue("0");
						}
					else
						{
						//Audiocodes
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
						}
					}
				else if(f.getName().equals("[Device_numPort]"))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue(Integer.toString(port));
						}
					else
						{
						//Audiocodes
						f.setValue("");
						}
					}
				else if(f.getName().equals("[Device_digestUserId]"))
					{
					if(type.equals(gwType.vg))
						{
						//VG
						f.setValue("");
						}
					else
						{
						//Audiocodes
						f.setValue(CollectionTools.getValueFromCollectionFile(index, f.getValue(), myWorkbook));
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
	
	/*2015*//*RATEL Alexandre 8)*/
	}

