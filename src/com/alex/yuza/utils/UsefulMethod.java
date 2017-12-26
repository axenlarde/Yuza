package com.alex.yuza.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.misc.Site;
import com.alex.yuza.misc.ValueMatcher;
import com.alex.yuza.utils.Variables.cucmAXLVersion;
import com.alex.yuza.utils.Variables.siteType;
import com.alex.yuza.utils.Variables.gwType;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.xml.ws.BindingProvider;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.log4j.Level;


/**********************************
 * Class used to store the useful static methods
 * 
 * @author RATEL Alexandre
 **********************************/
public class UsefulMethod
	{
	
	/***************************************
	 * Method used to get a specific value
	 * in the user preference XML File
	 ***************************************/
	public synchronized static String getTargetOption(String node) throws Exception
		{
		for(int i=0;i<Variables.getTabConfig().get(0).length; i++)
			{
			if(Variables.getTabConfig().get(0)[i][0].compareTo(node)==0)
				{
				return Variables.getTabConfig().get(0)[i][1];
				}
			}
		
		/***********
		 * If this point is reached, the option looked for was not found
		 */
		throw new Exception("Option \""+node+"\" not found"); 
		}
	/*************************/
	
	
	
	/************************
	 * Check if java version
	 * is correct
	 ***********************/
	public static void checkJavaVersion()
		{
		try
			{
			String jVer = new String(System.getProperty("java.version"));
			Variables.getLogger().info("Detected JRE version : "+jVer);
			
			/*Temp
			 * 
			 * Here below we deactivate the JRE detection
			 * */
			
			if(jVer.contains("1.6"))
				{
				Variables.getLogger().info("JRE detection : Current version is "+jVer);
				
				/*
				if(Integer.parseInt(jVer.substring(6,8))<16)
					{
					Variables.getLogger().info("JRE version is not compatible. The application will now exit. system.exit(0)");
					System.exit(0);
					}*/
				}
			
			/*Temp*/
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().info("ERROR : It has not been possible to detect JRE version",exc);
			}
		}
	/***********************/
	
	
	/************
	 * Method used to read a configuration file
	 * @throws Exception 
	 */
	public static ArrayList<String> readFile(String param, String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading the file : "+fileName);
			file = xMLReader.fileRead(fileName);
			
			listParams.add(param);
			
			return xMLGear.getResultList(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("ERROR : The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the "+fileName+" file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read a configuration file
	 * @throws Exception 
	 */
	public static ArrayList<String[][]> readFileTab(String param, String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading of the "+param+" file : "+fileName);
			file = xMLReader.fileRead(fileName);
			
			listParams.add(param);
			return xMLGear.getResultListTab(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the "+param+" file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read a configuration file
	 * @throws Exception 
	 */
	public static ArrayList<ArrayList<String[][]>> readLanguageFile(String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading of the language file : "+fileName);
			file = xMLReader.fileRead(fileName);
			
			listParams.add("language");
			return xMLGear.getResultListTabExt(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read the site list file
	 * @throws Exception 
	 */
	public static ArrayList<Site> readSiteFile(String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		ArrayList<String[][]> result;
		ArrayList<Site> mySiteList = new ArrayList<Site>();
		
		try
			{
			Variables.getLogger().info("Reading of the list file : "+fileName);
			file = xMLReader.fileRead(fileName);
			
			listParams.add("sites");
			listParams.add("site");
			result = xMLGear.getResultListTab(file, listParams);
			
			//We create an ArrayList containing all the site
			for(String[][] tab : result)
				{
				mySiteList.add(new Site(UsefulMethod.getItemByName("name", tab),
						UsefulMethod.getItemByName("certi", tab),
						convertStringToSiteType(UsefulMethod.getItemByName("type", tab)),
						UsefulMethod.getItemByName("cmg", tab),
						UsefulMethod.getItemByName("department", tab)));
				}
			
			return mySiteList;
			}
		catch(FileNotFoundException fnfexc)
			{
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			throw new Exception("ERROR with the "+fileName+" file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read the phoneMatcher file
	 * @throws Exception 
	 */
	public static ArrayList<ValueMatcher> readValueMatcherFile(ArrayList<String> listParams, String fileName) throws Exception
		{
		String file;
		ArrayList<String[][]> result;
		ArrayList<ValueMatcher> myMatcherList = new ArrayList<ValueMatcher>();
		
		try
			{
			Variables.getLogger().info("Reading the valueMatcher file : "+fileName);
			file = xMLReader.fileRead(fileName);
			
			result = xMLGear.getResultListTab(file, listParams);
			
			for(String[][] tab : result)
				{
				myMatcherList.add(new ValueMatcher(UsefulMethod.getItemByName("match", tab), UsefulMethod.getItemByName("replaceby", tab)));
				}
			
			return myMatcherList;
			}
		catch(FileNotFoundException fnfexc)
			{
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			throw new Exception("Error with the "+fileName+" file : "+exc.getMessage());
			}
		}
	
	
	/*****
	 * Method used to get the current type of site used
	 */
	public static synchronized int getCurrentSiteTypeNumber(siteType type)
		{
		if(type.equals(siteType.type1))
			{
			//Type 1
			return 0;
			}
		else if(type.equals(siteType.type2))
			{
			//Type 2
			return 1;
			}
		else
			{
			//Type 3
			return 2;
			}
		}

	/******
	 * Method used to initialize the AXL Connection to the CUCM
	 */
	public static synchronized void initAXLConnectionToCUCM() throws Exception
		{
		try
			{
			if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
				{
				com.cisco.axlapiservice.AXLAPIService axlService = new com.cisco.axlapiservice.AXLAPIService();
				com.cisco.axlapiservice.AXLPort axlPort = axlService.getAXLPort();
				
				// Set the URL, user, and password on the JAX-WS client
				String validatorUrl = "https://"+UsefulMethod.getTargetOption("axlhost")+":"+UsefulMethod.getTargetOption("axlport")+"/axl/";
				
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UsefulMethod.getTargetOption("axlusername"));
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UsefulMethod.getTargetOption("axlpassword"));
				
				Variables.setAXLConnectionToCUCM(axlPort);
				}
			else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
				{
				com.cisco.axlapiservice10.AXLAPIService axlService = new com.cisco.axlapiservice10.AXLAPIService();
				com.cisco.axlapiservice10.AXLPort axlPort = axlService.getAXLPort();
				
				// Set the URL, user, and password on the JAX-WS client
				String validatorUrl = "https://"+UsefulMethod.getTargetOption("axlhost")+":"+UsefulMethod.getTargetOption("axlport")+"/axl/";
				
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UsefulMethod.getTargetOption("axlusername"));
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UsefulMethod.getTargetOption("axlpassword"));
				
				Variables.setAXLConnectionToCUCMV105(axlPort);
				}
			else
				{
				//Default version 8.5
				
				com.cisco.axlapiservice.AXLAPIService axlService = new com.cisco.axlapiservice.AXLAPIService();
				com.cisco.axlapiservice.AXLPort axlPort = axlService.getAXLPort();	
				            
				
				// Set the URL, user, and password on the JAX-WS client
				String validatorUrl = "https://"+UsefulMethod.getTargetOption("axlhost")+":"+UsefulMethod.getTargetOption("axlport")+"/axl/";
				
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UsefulMethod.getTargetOption("axlusername"));
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UsefulMethod.getTargetOption("axlpassword"));
				
				Variables.setAXLConnectionToCUCM(axlPort);
				}
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e);
			throw new Exception(e);
			}
		}
	
	/**
	 * Method used when the application failed to 
	 * initialize
	 */
	public static void failedToInit(Exception exc)
		{
		exc.printStackTrace();
		JOptionPane.showMessageDialog(null,"Application failed to init :\r\n"+exc.getMessage()+"\r\nThe software will now exit","ERROR",JOptionPane.ERROR_MESSAGE);
		Variables.getLogger().error(exc.getMessage());
		Variables.getLogger().error("Application failed to init : System.exit(0)");
		System.exit(0);
		}
	
	/**
	 * Initialization of the internal variables from
	 * what we read in the configuration file
	 * @throws Exception 
	 */
	public static void initInternalVariables() throws Exception
		{
		/***********
		 * Logger
		 */
		String level = UsefulMethod.getTargetOption("log4j");
		if(level.compareTo("DEBUG")==0)
			{
			Variables.getLogger().setLevel(Level.DEBUG);
			}
		else if (level.compareTo("INFO")==0)
			{
			Variables.getLogger().setLevel(Level.INFO);
			}
		else if (level.compareTo("ERROR")==0)
			{
			Variables.getLogger().setLevel(Level.ERROR);
			}
		else
			{
			//Default level is INFO
			Variables.getLogger().setLevel(Level.INFO);
			}
		Variables.getLogger().info("Log level found in the configuration file : "+Variables.getLogger().getLevel().toString());
		/*************/
		
		/*************
		 * CSV
		 */
		Variables.setCsvSeparator(UsefulMethod.getTargetOption("csvseparator"));
		/***************/
		
		/************
		 * Etc...
		 */
		//Has to be written
		/*************/
		}
	
	/**
	 * Method used to get the collection file name
	 */
	public static String getCollectionFilePath() throws Exception
		{
		JFileChooser fcSource = new JFileChooser();
		
		String baseDirectory = UsefulMethod.getTargetOption("basedirectory");
		
		if((baseDirectory.equals("")) || (baseDirectory == null))
			{
			fcSource.setCurrentDirectory(new File("."));
			}
		else
			{
			fcSource.setCurrentDirectory(new File(baseDirectory));
			}
		
		ArrayList<String> allowedExtensionList = new ArrayList<String>();
		allowedExtensionList.add("xls");
		//allowedExtensionList.add("xlsx");
		
		EasyFileFilter myFilter = new EasyFileFilter(allowedExtensionList);
		fcSource.setFileFilter(myFilter);
		
		fcSource.setDialogTitle(LanguageManagement.getString("instruction1"));//Ask to provide the collection file
		int resultat = fcSource.showDialog(fcSource, LanguageManagement.getString("button1"));//To set the "select" button
		if(resultat == fcSource.APPROVE_OPTION)
			{
			Variables.getLogger().info("Collection file selected : "+fcSource.getSelectedFile().toString());
			
			return fcSource.getSelectedFile().toString();
			}
		else
			{
			throw new Exception("The collection file has to be given");
			}
		}
	
	/**
	 * Method used to get the collection file name
	 */
	public static String getCollectionFilesDirectory() throws Exception
		{
		JFileChooser fcSource = new JFileChooser();
		
		String baseDirectory = UsefulMethod.getTargetOption("basedirectory");
		
		if((baseDirectory.equals("")) || (baseDirectory == null))
			{
			fcSource.setCurrentDirectory(new File("."));
			}
		else
			{
			fcSource.setCurrentDirectory(new File(baseDirectory));
			}
		
		fcSource.setDialogTitle(LanguageManagement.getString("instruction2"));//Ask to provide the collection file
		fcSource.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int resultat = fcSource.showDialog(fcSource, LanguageManagement.getString("button1"));//To set the "select" button
		if(resultat == fcSource.APPROVE_OPTION)
			{
			Variables.getLogger().info("Directory selected : "+fcSource.getSelectedFile().toString());
			
			return fcSource.getSelectedFile().toString();
			}
		else
			{
			throw new Exception("The directory has to be given");
			}
		}
	
	
	/**
	 * Method which convert a string into siteType
	 */
	public static synchronized siteType convertStringToSiteType(String type)
		{
		if(type.contains("1"))
			{
			return siteType.type1;
			}
		else if(type.contains("3"))
			{
			return siteType.type3;
			}
		else
			{
			//Default : 2
			return siteType.type2;
			}
		}
	
	/**
	 * Method which convert a string into cucmAXLVersion
	 */
	public static cucmAXLVersion convertStringToCUCMAXLVersion(String version)
		{
		if(version.contains("8.0"))
			{
			return cucmAXLVersion.version80;
			}
		else if(version.contains("10.5"))
			{
			return cucmAXLVersion.version105;
			}
		else
			{
			//Default : 8.5
			return cucmAXLVersion.version85;
			}
		}
	
	
	/**************
	 * Method aims to get a template item value by giving its name
	 * @throws Exception 
	 *************/
	public static String getItemByName(String name, String[][] itemDetails) throws Exception
		{
		for(int i=0; i<itemDetails.length; i++)
			{
			if(itemDetails[i][0].equals(name))
				{
				return itemDetails[i][1];
				}
			}
		throw new Exception("Item not found : "+name);
		}
	
	/**
	 * Method used to initialize the connection to the CUCM
	 * @throws Exception 
	 * @throws Exception 
	 */
	public static void initAXL() throws Exception
		{
		try
			{
			if((Variables.getAXLConnectionToCUCM() == null) && (Variables.getAXLConnectionToCUCMV105() == null))
				{
				UsefulMethod.disableSecurity();//We first turned off security
				UsefulMethod.initAXLConnectionToCUCM();
				
				Variables.getLogger().debug("WSDL Initialization done");
				
				/**
				 * We now check if the CUCM is reachable by asking him its version
				 */
				SimpleRequest.getCUCMVersion();
				
				Variables.setCUCMReachable(true);
				}
			else
				{
				//The connection has already been initialized so we have nothing to do
				}
			}
		catch (Exception e)
			{
			Variables.setCUCMReachable(false);
			throw new Exception("The CUCM is maybe unreachable : "+e.getMessage());
			}
		}
	
	/**********************************************************
	 * Method used to disable security in order to accept any
	 * certificate without trusting it
	 */
	public static void disableSecurity()
		{
		try
        	{
            X509TrustManager xtm = new HttpsTrustManager();
            TrustManager[] mytm = { xtm };
            SSLContext ctx = SSLContext.getInstance("SSL");
            ctx.init(null, mytm, null);
            SSLSocketFactory sf = ctx.getSocketFactory();

            HttpsURLConnection.setDefaultSSLSocketFactory(sf);
            
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier()
            	{
                public boolean verify(String hostname, SSLSession session)
                	{
                    return true;
                	}
            	}
            );
        	}
        catch (Exception e)
        	{
            e.printStackTrace();
        	}
		}
	
	/**
	 * Method used to convert a String network mask into an integer one
	 * 
	 * For instance :
	 * Convert 255.255.255.0 into 24
	 * Convert 255.255.240.0 into 20
	 */
	public static synchronized String convertStringMaskToIntMask(String mask)
		{
		//We check if mask is a long or a CIDR one
		if(!Tester.IPValide(mask))return mask;
		
		SubnetUtils subnet = new SubnetUtils("192.168.1.0", mask.trim());
		return subnet.getInfo().getCidrSignature().split("/")[1];
		}
	
	/**********
	 * Method used to convert a phone type from the collection file
	 * into a phone type expected by the CUCM
	 */
	public static synchronized String findPhoneType(String phoneType) throws Exception
		{
		for(ValueMatcher myPhone : Variables.getPhoneMatcherList())
			{
			if(phoneType.contains(myPhone.getCollectionName()))
				{
				Variables.getLogger().debug(phoneType+" convert into : "+myPhone.getConvertName());
				return myPhone.getConvertName();
				}
			}
		throw new Exception("Phone type "+phoneType+" not found");
		}
	
	/***************
	 * Method used to convert a css name from the collection file
	 * into a css name expected by the CUCM
	 * @throws Exception 
	 */
	public static synchronized String findCSSName(String CSSName) throws Exception
		{
		for(ValueMatcher myCss : Variables.getCssMatcherList())
			{
			if(CSSName.equals(myCss.getCollectionName()))
				{
				Variables.getLogger().debug(CSSName+" convert into : "+myCss.getConvertName());
				return myCss.getConvertName();
				}
			}
		throw new Exception("CSS "+CSSName+" not found");
		}
	
	/***************
	 * Method used to convert a profile name from the collection file
	 * into a profile name expected by the CSV
	 * @throws Exception 
	 */
	public static synchronized String findProfileName(String profileName) throws Exception
		{
		for(ValueMatcher myProfile : Variables.getProfileMatcherList())
			{
			if(profileName.equals(myProfile.getCollectionName()))
				{
				Variables.getLogger().debug(profileName+" convert into : "+myProfile.getConvertName());
				return myProfile.getConvertName();
				}
			}
		throw new Exception("Profile "+profileName+" not found");
		}
	
	/***************
	 * Method used to find a Phone Button template name from a value in the collection file
	 * @throws Exception 
	 */
	public static synchronized String findPBTName(String pBTName) throws Exception
		{
		for(ValueMatcher myPBT : Variables.getPBTMatcherList())
			{
			if(pBTName.contains(myPBT.getCollectionName()))
				{
				Variables.getLogger().debug(pBTName+" convert into : "+myPBT.getConvertName());
				return myPBT.getConvertName();
				}
			}
		throw new Exception("Phone button Template "+pBTName+" not found");
		}
	
	/***************
	 * Method used to find a Pickup Notification Type from a value in the collection file
	 * @throws Exception 
	 */
	public static synchronized String findPickupNotificationName(String pNName) throws Exception
		{
		for(ValueMatcher myPNN : Variables.getPickupNotificationMatcherList())
			{
			if(pNName.contains(myPNN.getCollectionName()))
				{
				Variables.getLogger().debug(pNName+" convert into : "+myPNN.getConvertName());
				return myPNN.getConvertName();
				}
			}
		throw new Exception("Pickup Notification "+pNName+" not found");
		}
	
	/***************
	 * Method used to find a Line Group Distribution name from a value in the collection file
	 * @throws Exception 
	 */
	public static synchronized String findLGDistributionName(String lGDName) throws Exception
		{
		for(ValueMatcher myLGDN : Variables.getlGDistributionMatcherList())
			{
			if(lGDName.contains(myLGDN.getCollectionName()))
				{
				Variables.getLogger().debug(lGDName+" convert into : "+myLGDN.getConvertName());
				return myLGDN.getConvertName();
				}
			}
		throw new Exception("Line Group Distribution "+lGDName+" not found");
		}
	
	/***************
	 * Method used to convert a profile name from the collection file
	 * into a profile name expected by the CSV
	 * @throws Exception 
	 */
	public static synchronized String findCodecBandwidth(String codec) throws Exception
		{
		if(codec.equals("G.711"))
			{
			return "64";
			}
		else if(codec.equals("G.729"))
			{
			return "10";
			}
		
		throw new Exception("Profile "+codec+" not found");
		}
	
	/*******************
	 * Method used to write a new site into the xml file
	 * 
	 * If the writing failed, we just write the error in the log
	 * file. The user will not be warned
	 */
	public static void writeNewSite(Site myNewSite)
		{
		File mySiteFile = null;
		FileWriter myFileWriter = null;
		BufferedWriter myBuffer = null;
		
		try
			{
			Variables.getSiteList().add(myNewSite);
			
			mySiteFile = new File(Variables.getSiteListFileName());
			myFileWriter = new FileWriter(mySiteFile, false);
			myBuffer = new BufferedWriter(myFileWriter);
			
			myBuffer.write("<xml>\r\n");
			myBuffer.write("	<sites>\r\n");
			
			for(Site s : Variables.getSiteList())
				{
				myBuffer.write("		<site>\r\n");
				myBuffer.write("			<name>"+s.getName()+"</name>\r\n");
				myBuffer.write("			<certi>"+s.getCerti()+"</certi>\r\n");
				myBuffer.write("			<type>"+s.getType().name()+"</type>\r\n");
				myBuffer.write("			<cmg>"+s.getCmg()+"</cmg>\r\n");
				myBuffer.write("			<department>"+s.getDepartment()+"</department>\r\n");
				myBuffer.write("		</site>\r\n");
				}
			
			myBuffer.write("	</sites>\r\n");
			myBuffer.write("</xml>\r\n");
			}
		catch(Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("Error while writing a new site in the XML site file : "+e.getMessage());
			}
		finally
			{
			try
				{
				myBuffer.flush();
				myBuffer.close();
				myFileWriter.close();
				}
			catch(Exception exc)
				{
				Variables.getLogger().error("Something went bad while trying to close the file : "+exc.getMessage());
				}
			}
		}
	
	/********************************************
	 * Method used to init the class eMailsender
	 * @throws Exception 
	 ********************************************/
	public synchronized static void initEMailServer() throws Exception
		{
		Variables.seteMSender(new eMailSender(UsefulMethod.getTargetOption("smtpemailport"),
				 UsefulMethod.getTargetOption("smtpemailprotocol"),
				 UsefulMethod.getTargetOption("smtpemailserver"),
				 UsefulMethod.getTargetOption("smtpemail"),
				 UsefulMethod.getTargetOption("smtpemailpassword")));
		}
	
	/**
	 * Method used to send an email to the admin group
	 */
	public synchronized static void sendEmailToTheAdminList(String desc, String siteName, String content)
		{
		try
			{
			String adminEmails = UsefulMethod.getTargetOption("smtpemailadmin");
			
			String subject = LanguageManagement.getString("emailreportsubject")+siteName;
			String eMailDesc = desc+" - "+siteName;
			
			if(adminEmails.contains(";"))
				{
				//There are many emails to send
				String[] adminList = adminEmails.split(";");
				for(String s : adminList)
					{
					Variables.geteMSender().send(s,
							subject,
							content,
							eMailDesc);
					}
				}
			else
				{
				//There is only one email to send
				Variables.geteMSender().send(adminEmails,
						subject,
						content,
						eMailDesc);
				}
			
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("emailsentsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("",e);
			Variables.getLogger().error("Failed to send emails to the admin list : "+e.getMessage());
			}
		}
	
	
	/**
	 * Method used to convert a string containing a gateway type into
	 * a gwType object
	 */
	public static synchronized gwType convertGatewayType(String type)
		{
		if((type.contains("VG")) || (type.contains("vg")))
			{
			return gwType.vg;
			}
		else
			{
			return gwType.audiocodes;
			}
		}
	
	/**
	 * Method used to convert a string containing a port number into
	 * an integer
	 */
	public static synchronized int convertGatewayPort(String port)
		{
		if(port.contains("1"))
			{
			return 1;
			}
		else if(port.contains("2"))
			{
			return 2;
			}
		else if(port.contains("3"))
			{
			return 3;
			}
		else
			{
			//Default 0
			return 0;
			}
		}
	
	/******
	 * Used to fill the site list
	 */
	public static ArrayList<String> getSiteList(String sourceDirectory)
		{
		ArrayList<String> siteList = new ArrayList<String>();
		
		try
			{
			File directory = new File(sourceDirectory);
			for(File f : directory.listFiles())
				{
				if(f.getName().contains(".xls"))
					{
					siteList.add(f.getPath());
					Variables.getLogger().debug("The following file has been found in the directory : "+f.getPath());
					}
				else
					{
					//Ignore
					}
				}
			
			Variables.getLogger().debug(siteList.size()+" collection file found in the directory");
			}
		catch (Exception exc)
			{
			exc.printStackTrace();
			}
		
		return siteList;
		}
	
	/*********
	 * Method used to delete all the existing CSV file beginning with "CSVTinject_"
	 * and ending with "_ALL.csv"
	 */
	public static void deletePreviousCSVFiles(String sourceDirectory)
		{
		boolean fileDeleted = false;
		
		try
			{
			File directory = new File(sourceDirectory);
			
			Variables.getLogger().debug("Multiple file deletion begins");
			
			String deletionPattern = Variables.getCsvOutputFileName()+".*_ALL\\.csv";
			Variables.getLogger().debug("Pattern used to find the file to delete : "+deletionPattern);
			
			for(File f : directory.listFiles())
				{
				if(Pattern.matches(deletionPattern, f.getName()))
					{
					String fName = f.getName();
					f.delete();
					Variables.getLogger().debug("The following file has been deleted : "+fName);
					fileDeleted = true;
					}
				}
			
			if(!fileDeleted)
				{
				Variables.getLogger().debug("No file has been deleted");
				}
			
			Variables.getLogger().debug("Multiple file deletion ends");
			}
		catch(Exception exc)
			{
			Variables.getLogger().error("ERROR while deleting the csv file : "+exc.getMessage());
			}
		}
	
	/**
	 * Method used to find the file name from a file path
	 * For intance :
	 * C:\JAVAELILEX\YUZA\Maquette_CNAF_TA_FichierCollecteDonneesTelephonie_v1.7_mac.xls
	 * gives :
	 * Maquette_CNAF_TA_FichierCollecteDonneesTelephonie_v1.7_mac.xls
	 */
	public static String extractFileName(String fullFilePath)
		{
		String[] tab =  fullFilePath.split("\\\\");
		return tab[tab.length-1];
		}
	
	/***
	 * Method used to get the AXL version from the CUCM
	 * We contact the CUCM using a very basic request and therefore get the version
	 */
	public static cucmAXLVersion getAXLVersionFromTheCUCM()
		{
		/**
		 * In this method version we just read the version from the configuration file
		 * This has to be improved to match the method description
		 **/
		cucmAXLVersion AXLVersion = cucmAXLVersion.version85;//Default value 85
		
		try
			{
			AXLVersion = cucmAXLVersion.valueOf("version"+getTargetOption("axlversion"));
			}
		catch (Exception e)
			{
			Variables.getLogger().error("ERROR : "+e.getMessage(),e);
			}
		
		return AXLVersion;
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

