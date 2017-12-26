package com.alex.yuza.utils;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.alex.yuza.misc.Site;
import com.alex.yuza.misc.ValueMatcher;
import com.alex.yuza.misc.storedUUID;
import com.alex.yuza.ui.MainWindow;
import com.cisco.axlapiservice.AXLPort;

/**********************************
 * Class aims to contains static variables
 * 
 * @author RATEL Alexandre
 **********************************/
public class Variables
	{
	/**
	 * Variables
	 */
	//Enum
	/***
	 * itemType :
	 * Is used to give a type to the request ready to be injected
	 * This way we can manage or sort them more easily
	 * 
	 * The order is important here, indeed, it will define later
	 * how the items are injected
	 */
	public enum itemType
		{
		location,
		region,
		srstreference,
		devicepool,
		commondeviceconfig,
		conferencebridge,
		mediaressourcegroup,
		mediaressourcegrouplist,
		partition,
		callingsearchspace,
		trunksip,
		vg,
		routegroup,
		translationpattern,
		physicallocation,
		devicemobilityinfo,
		devicemobilitygroup,
		datetimesetting,
		callmanagergroup,
		phone,
		udp,
		user,
		line,
		telecasterservice,
		siptrunksecurityprofile,
		sipprofile,
		phonetemplatename,
		linegroup,
		huntlist,
		huntpilot,
		callpickupgroup};
	
	/********************************************
	 * statusType :
	 * Is used to set the status of a request as followed :
	 * - init : the request has to be built
	 * - waiting : The request is ready to be injected. We gonna reach this status after the request has been built or has been deleted
	 * - processing : The injection or the deletion of the request is currently under progress
	 * - disabled : The request has not to be injected
	 * - injected : The request has been injected with success
	 * - error : Something went wrong and an exception has been thrown
	 ***************************************/
	public enum statusType
		{
		injected,
		duplicate,
		error,
		processing,
		waiting,
		disabled,
		init,
		done
		};
	
	/********************************************
	 * siteType :
	 * Is used to set the site type.
	 * Depending of the type, some items could be injected
	 * and some others not
	 * 
	 * CNAF dependent
	 ***************************************/
	public enum siteType
		{
		type1,
		type2,
		type3
		};
	
	/********************************************
	 * siteType :
	 * Is used to set the cucm AXL version used for the injection
	 ***************************************/
	public enum cucmAXLVersion
		{
		version70,
		version71,
		version80,
		version85,
		version90,
		version91,
		version100,
		version105
		};
		
	/********************************************
	 * actionType :
	 * Is used to set the type of action is going to do a 
	 ***************************************/
	public enum actionType
		{
		inject,
		delete,
		update
		};
		
	/********************************************
	 * CSVType :
	 * Is used to set the type of the csv file about
	 * to be created
	 ***************************************/
	public enum csvType
		{
		user,
		pickup,
		pickuplinks,
		linegroup,
		linegrouplinks,
		huntlist,
		huntlistlinks,
		huntpilot,
		huntpilotlinks,
		didranges,
		analogs
		};
		
	/********************************************
	 * SDType :
	 * Is used to set the type of the Speed dial :
	 * - simple SD
	 * - BLF
	 ***************************************/
	public enum sdType
		{
		sd,
		blf,
		};
		
	/********************************************
	 * GatewayType :
	 * Is used to set the type of a Gateway :
	 * - vg
	 * - audiocodes
	 ***************************************/
	public enum gwType
		{
		vg,
		audiocodes,
		};
	
	//Misc
	private static String softwareName;
	private static String softwareVersion;
	private static cucmAXLVersion CUCMVersion;
	private static Logger logger;
	private static ArrayList<String[][]> tabConfig;
	private static ArrayList<Site> siteList;
	private static eMailSender eMSender;
	private static String mainConfigFileDirectory;
	private static String configFileName;
	private static String matcherFileName;
	private static String ccmTemplateFileName;
	private static String userTemplateFileName;
	private static String siteListFileName;
	private static String languageFileName;
	private static String phoneMatchersFileName;
	private static String cssMatchersFileName;
	private static String profileMatchersFileName;
	private static String pBTMatchersFileName;
	private static String pickupNotificationMatchersFileName;
	private static String lGDistributionMatchersFileName;
	private static String csvUserHeadersFileName;
	private static String csvPickupHeadersFileName;
	private static String csvPickupLinksHeadersFileName;
	private static String csvLineGroupHeadersFileName;
	private static String csvLineGroupLinksHeadersFileName;
	private static String csvHuntListHeadersFileName;
	private static String csvHuntListLinksHeadersFileName;
	private static String csvHuntPilotHeadersFileName;
	private static String csvHuntPilotLinksHeadersFileName;
	private static String csvDIDRangesHeadersFileName;
	private static String csvAnalogHeadersFileName;
	private static String csvOutputFileName;
	private static ArrayList<String> matcherList;
	private static ArrayList<ValueMatcher> phoneMatcherList;
	private static ArrayList<ValueMatcher> cssMatcherList;
	private static ArrayList<ValueMatcher> profileMatcherList;
	private static ArrayList<ValueMatcher> PBTMatcherList;
	private static ArrayList<ValueMatcher> pickupNotificationMatcherList;
	private static ArrayList<ValueMatcher> lGDistributionMatcherList;
	private static ArrayList<storedUUID> uuidList;
	private static MainWindow mainWindow;
	private static String csvSeparator;
	private static String csvLineReturn;
	private static boolean CUCMReachable;
	private static ArrayList<String> insideNumberList;
	
	//Langage management
	public enum language{english,french};
	private static ArrayList<ArrayList<String[][]>> languageContentList;
	
	//AXL
    private static boolean ldapSyncStatus;
    private static com.cisco.axlapiservice.AXLPort AXLConnectionToCUCM;//Connection to CUCM version 8
    private static com.cisco.axlapiservice10.AXLPort AXLConnectionToCUCMV105;//Connection to CUCM version 10
	
	/***************
	 * Constructor
	 ***************/
	public Variables()
		{
		CUCMReachable = true;
		mainConfigFileDirectory = ".\\config\\";
		configFileName = new String(mainConfigFileDirectory+"configFile.xml");
		matcherFileName = new String(mainConfigFileDirectory+"matchers.xml");
		ccmTemplateFileName = new String(mainConfigFileDirectory+"templateCCM.xml");
		userTemplateFileName = new String(mainConfigFileDirectory+"templateUser.xml");
		siteListFileName = new String(mainConfigFileDirectory+"siteList.xml");
		languageFileName = new String(mainConfigFileDirectory+"languages.xml");
		phoneMatchersFileName = new String(mainConfigFileDirectory+"phoneMatchers.xml");
		cssMatchersFileName = new String(mainConfigFileDirectory+"cssMatchers.xml");
		profileMatchersFileName = new String(mainConfigFileDirectory+"profileMatchers.xml");
		pBTMatchersFileName = new String(mainConfigFileDirectory+"phoneButtonTemplateMatchers.xml");
		pickupNotificationMatchersFileName = new String(mainConfigFileDirectory+"pickupNotificationMatchers.xml");
		lGDistributionMatchersFileName = new String(mainConfigFileDirectory+"lgDistributionMatchers.xml");
		csvUserHeadersFileName = new String(mainConfigFileDirectory+"templateCSVUser.xml");
		csvPickupHeadersFileName = new String(mainConfigFileDirectory+"templateCSVPickup.xml");
		csvPickupLinksHeadersFileName = new String(mainConfigFileDirectory+"templateCSVPickupLinks.xml");
		csvLineGroupHeadersFileName = new String(mainConfigFileDirectory+"templateCSVLineGroup.xml");
		csvLineGroupLinksHeadersFileName = new String(mainConfigFileDirectory+"templateCSVLineGroupLinks.xml");
		csvHuntListHeadersFileName = new String(mainConfigFileDirectory+"templateCSVHuntList.xml");
		csvHuntListLinksHeadersFileName = new String(mainConfigFileDirectory+"templateCSVHuntListLinks.xml");
		csvHuntPilotHeadersFileName = new String(mainConfigFileDirectory+"templateCSVHuntPilot.xml");
		csvHuntPilotLinksHeadersFileName = new String(mainConfigFileDirectory+"templateCSVHuntPilotLinks.xml");
		csvDIDRangesHeadersFileName = new String(mainConfigFileDirectory+"templateCSVDIDRanges.xml");
		csvAnalogHeadersFileName = new String(mainConfigFileDirectory+"templateCSVAnalogs.xml");
		csvOutputFileName = new String("CSVToInject");
		ldapSyncStatus = true;//Temporary
		uuidList = new ArrayList<storedUUID>();
		csvLineReturn = "\r\n";
		}

	public static String getSoftwareName()
		{
		return softwareName;
		}

	public static void setSoftwareName(String softwareName)
		{
		Variables.softwareName = softwareName;
		}

	public static String getSoftwareVersion()
		{
		return softwareVersion;
		}

	public static void setSoftwareVersion(String softwareVersion)
		{
		Variables.softwareVersion = softwareVersion;
		}

	public static cucmAXLVersion getCUCMVersion()
		{
		return UsefulMethod.getAXLVersionFromTheCUCM();
		}

	public static void setCUCMVersion(cucmAXLVersion cUCMVersion)
		{
		CUCMVersion = cUCMVersion;
		}

	public static Logger getLogger()
		{
		return logger;
		}

	public static void setLogger(Logger logger)
		{
		Variables.logger = logger;
		}

	public static ArrayList<String[][]> getTabConfig()
		{
		return tabConfig;
		}

	public static void setTabConfig(ArrayList<String[][]> tabConfig)
		{
		Variables.tabConfig = tabConfig;
		}

	public static ArrayList<Site> getSiteList()
		{
		return siteList;
		}

	public static void setSiteList(ArrayList<Site> siteList)
		{
		Variables.siteList = siteList;
		}

	public static eMailSender geteMSender()
		{
		return eMSender;
		}

	public static void seteMSender(eMailSender eMSender)
		{
		Variables.eMSender = eMSender;
		}

	public static String getConfigFileName()
		{
		return configFileName;
		}

	public static void setConfigFileName(String configFileName)
		{
		Variables.configFileName = configFileName;
		}

	public static String getMatcherFileName()
		{
		return matcherFileName;
		}

	public static void setMatcherFileName(String matcherFileName)
		{
		Variables.matcherFileName = matcherFileName;
		}

	public static String getCcmTemplateFileName()
		{
		return ccmTemplateFileName;
		}

	public static void setCcmTemplateFileName(String ccmTemplateFileName)
		{
		Variables.ccmTemplateFileName = ccmTemplateFileName;
		}

	public static String getUserTemplateFileName()
		{
		return userTemplateFileName;
		}

	public static void setUserTemplateFileName(String userTemplateFileName)
		{
		Variables.userTemplateFileName = userTemplateFileName;
		}

	public static String getSiteListFileName()
		{
		return siteListFileName;
		}

	public static void setSiteListFileName(String siteListFileName)
		{
		Variables.siteListFileName = siteListFileName;
		}

	public static String getLanguageFileName()
		{
		return languageFileName;
		}

	public static void setLanguageFileName(String languageFileName)
		{
		Variables.languageFileName = languageFileName;
		}

	public static String getPhoneMatchersFileName()
		{
		return phoneMatchersFileName;
		}

	public static void setPhoneMatchersFileName(String phoneMatchersFileName)
		{
		Variables.phoneMatchersFileName = phoneMatchersFileName;
		}

	public static ArrayList<String> getMatcherList()
		{
		return matcherList;
		}

	public static void setMatcherList(ArrayList<String> matcherList)
		{
		Variables.matcherList = matcherList;
		}

	public static ArrayList<storedUUID> getUuidList()
		{
		return uuidList;
		}

	public static void setUuidList(ArrayList<storedUUID> uuidList)
		{
		Variables.uuidList = uuidList;
		}

	public static MainWindow getMainWindow()
		{
		return mainWindow;
		}

	public static void setMainWindow(MainWindow mainWindow)
		{
		Variables.mainWindow = mainWindow;
		}

	public static ArrayList<ArrayList<String[][]>> getLanguageContentList()
		{
		return languageContentList;
		}

	public static void setLanguageContentList(
			ArrayList<ArrayList<String[][]>> languageContentList)
		{
		Variables.languageContentList = languageContentList;
		}

	public static boolean isLdapSyncStatus()
		{
		return ldapSyncStatus;
		}

	public static void setLdapSyncStatus(boolean ldapSyncStatus)
		{
		Variables.ldapSyncStatus = ldapSyncStatus;
		}

	public static String getCssMatchersFileName()
		{
		return cssMatchersFileName;
		}

	public static void setCssMatchersFileName(String cssMatchersFileName)
		{
		Variables.cssMatchersFileName = cssMatchersFileName;
		}

	public static String getCsvSeparator()
		{
		return csvSeparator;
		}

	public static void setCsvSeparator(String csvSeparator)
		{
		Variables.csvSeparator = csvSeparator;
		}

	public static String getCsvOutputFileName()
		{
		return csvOutputFileName;
		}

	public static void setCsvOutputFileName(String csvOutputFileName)
		{
		Variables.csvOutputFileName = csvOutputFileName;
		}

	public static String getCsvLineReturn()
		{
		return csvLineReturn;
		}

	public static void setCsvLineReturn(String csvLineReturn)
		{
		Variables.csvLineReturn = csvLineReturn;
		}

	public static String getProfileMatchersFileName()
		{
		return profileMatchersFileName;
		}

	public static void setProfileMatchersFileName(String profileMatchersFileName)
		{
		Variables.profileMatchersFileName = profileMatchersFileName;
		}

	public static boolean isCUCMReachable()
		{
		return CUCMReachable;
		}

	public static void setCUCMReachable(boolean cUCMReachable)
		{
		CUCMReachable = cUCMReachable;
		}

	public static ArrayList<String> getInsideNumberList()
		{
		return insideNumberList;
		}

	public static void setInsideNumberList(ArrayList<String> insideNumberList)
		{
		Variables.insideNumberList = insideNumberList;
		}

	public static String getpBTMatchersFileName()
		{
		return pBTMatchersFileName;
		}

	public static void setpBTMatchersFileName(String pBTMatchersFileName)
		{
		Variables.pBTMatchersFileName = pBTMatchersFileName;
		}

	public static ArrayList<ValueMatcher> getPhoneMatcherList()
		{
		return phoneMatcherList;
		}

	public static void setPhoneMatcherList(ArrayList<ValueMatcher> phoneMatcherList)
		{
		Variables.phoneMatcherList = phoneMatcherList;
		}

	public static ArrayList<ValueMatcher> getCssMatcherList()
		{
		return cssMatcherList;
		}

	public static void setCssMatcherList(ArrayList<ValueMatcher> cssMatcherList)
		{
		Variables.cssMatcherList = cssMatcherList;
		}

	public static ArrayList<ValueMatcher> getProfileMatcherList()
		{
		return profileMatcherList;
		}

	public static void setProfileMatcherList(
			ArrayList<ValueMatcher> profileMatcherList)
		{
		Variables.profileMatcherList = profileMatcherList;
		}

	public static ArrayList<ValueMatcher> getPBTMatcherList()
		{
		return PBTMatcherList;
		}

	public static void setPBTMatcherList(ArrayList<ValueMatcher> pBTMatcherList)
		{
		PBTMatcherList = pBTMatcherList;
		}

	public static String getCsvPickupHeadersFileName()
		{
		return csvPickupHeadersFileName;
		}

	public static void setCsvPickupHeadersFileName(String csvPickupHeadersFileName)
		{
		Variables.csvPickupHeadersFileName = csvPickupHeadersFileName;
		}

	public static String getCsvUserHeadersFileName()
		{
		return csvUserHeadersFileName;
		}

	public static void setCsvUserHeadersFileName(String csvUserHeadersFileName)
		{
		Variables.csvUserHeadersFileName = csvUserHeadersFileName;
		}

	public static String getCsvLineGroupHeadersFileName()
		{
		return csvLineGroupHeadersFileName;
		}

	public static void setCsvLineGroupHeadersFileName(
			String csvLineGroupHeadersFileName)
		{
		Variables.csvLineGroupHeadersFileName = csvLineGroupHeadersFileName;
		}

	public static String getCsvHuntListHeadersFileName()
		{
		return csvHuntListHeadersFileName;
		}

	public static void setCsvHuntListHeadersFileName(
			String csvHuntListHeadersFileName)
		{
		Variables.csvHuntListHeadersFileName = csvHuntListHeadersFileName;
		}

	public static String getCsvHuntPilotHeadersFileName()
		{
		return csvHuntPilotHeadersFileName;
		}

	public static void setCsvHuntPilotHeadersFileName(
			String csvHuntPilotHeadersFileName)
		{
		Variables.csvHuntPilotHeadersFileName = csvHuntPilotHeadersFileName;
		}

	public static String getPickupNotificationMatchersFileName()
		{
		return pickupNotificationMatchersFileName;
		}

	public static void setPickupNotificationMatchersFileName(
			String pickupNotificationMatchersFileName)
		{
		Variables.pickupNotificationMatchersFileName = pickupNotificationMatchersFileName;
		}

	public static ArrayList<ValueMatcher> getPickupNotificationMatcherList()
		{
		return pickupNotificationMatcherList;
		}

	public static void setPickupNotificationMatcherList(
			ArrayList<ValueMatcher> pickupNotificationMatcherList)
		{
		Variables.pickupNotificationMatcherList = pickupNotificationMatcherList;
		}

	public static String getlGDistributionMatchersFileName()
		{
		return lGDistributionMatchersFileName;
		}

	public static void setlGDistributionMatchersFileName(
			String lGDistributionMatchersFileName)
		{
		Variables.lGDistributionMatchersFileName = lGDistributionMatchersFileName;
		}

	public static ArrayList<ValueMatcher> getlGDistributionMatcherList()
		{
		return lGDistributionMatcherList;
		}

	public static void setlGDistributionMatcherList(
			ArrayList<ValueMatcher> lGDistributionMatcherList)
		{
		Variables.lGDistributionMatcherList = lGDistributionMatcherList;
		}

	public static String getMainConfigFileDirectory()
		{
		return mainConfigFileDirectory;
		}

	public static void setMainConfigFileDirectory(String mainConfigFileDirectory)
		{
		Variables.mainConfigFileDirectory = mainConfigFileDirectory;
		}

	public static String getCsvPickupLinksHeadersFileName()
		{
		return csvPickupLinksHeadersFileName;
		}

	public static void setCsvPickupLinksHeadersFileName(
			String csvPickupLinksHeadersFileName)
		{
		Variables.csvPickupLinksHeadersFileName = csvPickupLinksHeadersFileName;
		}

	public static String getCsvLineGroupLinksHeadersFileName()
		{
		return csvLineGroupLinksHeadersFileName;
		}

	public static void setCsvLineGroupLinksHeadersFileName(
			String csvLineGroupLinksHeadersFileName)
		{
		Variables.csvLineGroupLinksHeadersFileName = csvLineGroupLinksHeadersFileName;
		}

	public static String getCsvHuntListLinksHeadersFileName()
		{
		return csvHuntListLinksHeadersFileName;
		}

	public static void setCsvHuntListLinksHeadersFileName(
			String csvHuntListLinksHeadersFileName)
		{
		Variables.csvHuntListLinksHeadersFileName = csvHuntListLinksHeadersFileName;
		}

	public static String getCsvHuntPilotLinksHeadersFileName()
		{
		return csvHuntPilotLinksHeadersFileName;
		}

	public static void setCsvHuntPilotLinksHeadersFileName(
			String csvHuntPilotLinksHeadersFileName)
		{
		Variables.csvHuntPilotLinksHeadersFileName = csvHuntPilotLinksHeadersFileName;
		}

	public static String getCsvDIDRangesHeadersFileName()
		{
		return csvDIDRangesHeadersFileName;
		}

	public static void setCsvDIDRangesHeadersFileName(
			String csvDIDRangesHeadersFileName)
		{
		Variables.csvDIDRangesHeadersFileName = csvDIDRangesHeadersFileName;
		}

	public static String getCsvAnalogHeadersFileName()
		{
		return csvAnalogHeadersFileName;
		}

	public static void setCsvAnalogHeadersFileName(String csvAnalogHeadersFileName)
		{
		Variables.csvAnalogHeadersFileName = csvAnalogHeadersFileName;
		}

	public static com.cisco.axlapiservice10.AXLPort getAXLConnectionToCUCMV105()
		{
		return AXLConnectionToCUCMV105;
		}

	public static void setAXLConnectionToCUCMV105(
			com.cisco.axlapiservice10.AXLPort aXLConnectionToCUCMV105)
		{
		AXLConnectionToCUCMV105 = aXLConnectionToCUCMV105;
		}

	public static com.cisco.axlapiservice.AXLPort getAXLConnectionToCUCM()
		{
		return AXLConnectionToCUCM;
		}

	public static void setAXLConnectionToCUCM(
			com.cisco.axlapiservice.AXLPort aXLConnectionToCUCM)
		{
		AXLConnectionToCUCM = aXLConnectionToCUCM;
		}

	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

