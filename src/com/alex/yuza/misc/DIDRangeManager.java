package com.alex.yuza.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.formula.functions.BooleanFunction;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.site.misc.SiteTools;
import com.alex.yuza.ui.DIDSuffixDialog;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Classe used to store static method 
 * for DID range managing
 * 
 * @author RATEL Alexandre
 **********************************/
public class DIDRangeManager
	{
	
	/**
	 * Method used to return a list of
	 * the DID ranges sufix
	 * 
	 * For instance :
	 * First DID : +33478635580	Last DID : +33478635589
	 * First DID : +33478635480	Last DID : +33478635489
	 * return 558X and 548X
	 * 
	 * We will maybe ask the user the range because it could be hard
	 * to guess it and to transform it into a CUCM regex
	 * @throws Exception 
	 */
	public static ArrayList<DIDRange> getDIDRanges(boolean smartProcess, Workbook myWorkbook) throws Exception
		{
		ArrayList<DIDRange> myRange = new ArrayList<DIDRange>();
		String behavior = UsefulMethod.getTargetOption("sitedidrangebehavior");
		
		int i=0;
		try
			{
			while(true)
				{
				String firstDID, lastDID;
				ArrayList<String> suffixPatterns = new ArrayList<String>();
				firstDID = CollectionTools.getValueFromCollectionFile(i, "cnaf.firstsda", myWorkbook);
				lastDID = CollectionTools.getValueFromCollectionFile(i, "cnaf.lastsda", myWorkbook);
				
				/***************************************************
				 * We ask the suffix to the user using a dialog
				 * 
				 * Later we should try to guess it using an algorithm
				 */
				if(smartProcess)
					{
					if(behavior.equals("auto"))
						{
						//here we are going to find the did range prefix using an algorithm
						suffixPatterns.add(SiteTools.guessSuffixPattern(firstDID.substring(firstDID.length()-4,firstDID.length()),
								lastDID.substring(firstDID.length()-4,firstDID.length())));
						}
					else
						{
						//suffixPattern = (String) JOptionPane.showInputDialog(null,LanguageManagement.getString("didpatternuserquestion")+firstDID+" "+lastDID,"",JOptionPane.PLAIN_MESSAGE, null, null, null);
						
						//I need a more complexe window to ask the user the suffixe and in addition to be able
						//to add more than one suffixe
						DIDSuffixDialog myDIDDialog = new DIDSuffixDialog(null, firstDID, lastDID);
						suffixPatterns = myDIDDialog.getSuffixPatterns();
						myDIDDialog.dispose();
						}
					}
				else
					{
					suffixPatterns.add("XXXX");
					}
				/*************/
				
				if((suffixPatterns == null) || (suffixPatterns.size() == 0))
					{
					JOptionPane.showMessageDialog(null,LanguageManagement.getString("didpatternusercancel"),"",JOptionPane.INFORMATION_MESSAGE);
					break;
					}
				else
					{
					for(String s : suffixPatterns)
						{
						//I should check the "pattern" content. Indeed, it should only contain : 0-9 [] X . 
						if((s != null) && (!s.equals("")))
							{
							myRange.add(new DIDRange(firstDID, lastDID, s));
							Variables.getLogger().debug("New pattern found related to the following DID range : "+firstDID+" "+lastDID+" "+s);
							}
						}
					i++;
					}
				}
			}
		catch (Exception e)
			{
			Variables.getLogger().debug("End of DID ranges : "+e.getMessage());
			}
		
		return myRange;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

