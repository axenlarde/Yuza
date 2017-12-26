package com.alex.yuza.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alex.yuza.csv.misc.CSVCreation;
import com.alex.yuza.maccollection.misc.MacCollection;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.Site;
import com.alex.yuza.sd.misc.SdCreation;
import com.alex.yuza.site.misc.SiteCreation;
import com.alex.yuza.site.misc.SiteDeletion;
import com.alex.yuza.site.misc.SiteTools;
import com.alex.yuza.user.misc.PhoneCreation;
import com.alex.yuza.user.misc.UserCreation;
import com.alex.yuza.user.misc.UserDeletion;
import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables.siteType;
import com.alex.yuza.injectioncheck.InjectionCheck;

/**********************************
 * Class aims to be the site management User interface
 * 
 * @author RATEL Alexandre
 **********************************/
public class SiteManagementWindow extends JFrame implements ActionListener,WindowListener
	{
	/**
	 * Variables
	 */
	private JMenuBar myMenuBar;
	private JMenu action;
	private JMenuItem siteInjection;
	private JMenuItem siteDeletion;
	private JMenuItem tempPhoneInjection;
	private JMenuItem tempUserInjection;
	private JMenuItem macCollection;
	private JMenuItem tempDataDeletion;
	private JMenuItem exportToCSV;
	private JMenuItem injectSD;
	private JMenuItem systemCheck;
	private JMenuItem exit;
	private JMenu misc;
	private JMenuItem help;
	private JMenuItem about;
	private JPanel main;
	private JPanel siteInfo;
	private JLabel siteNameLabel;
	private JLabel userCount;
	private JLabel analogCount;
	private JLabel cpgCount;
	private JLabel lgCount;
	
	private Workbook myWorkbook;
	private siteType currentType;
    private Site currentSite;
    private String sitePrefix;
    private String siteDesc;
    private String collectionFileName;
    
    private SiteCreation mySiteCreation;
    private SiteDeletion mySiteDeletion;
    private PhoneCreation myPhoneCreation;
    private UserCreation myUserCreation;
    private MacCollection myMacCollection;
    private UserDeletion myUserDeletion;
    private CSVCreation myCSVCreation;
    private SdCreation mySDCreation;
    private InjectionCheck myCheck;
	/*******************************/
    
    
    
    
	/**
	 * Constructor
	 */
	public SiteManagementWindow()
		{
		super();
		myMenuBar = new JMenuBar();
		action = new JMenu(LanguageManagement.getString("menuaction"));
		siteInjection = new JMenuItem(LanguageManagement.getString("menusiteinjection"));
		siteDeletion = new JMenuItem(LanguageManagement.getString("menusitedeletion"));
		tempPhoneInjection = new JMenuItem(LanguageManagement.getString("menutempphoneinjection"));
		tempUserInjection = new JMenuItem(LanguageManagement.getString("menutempuserinjection"));
		macCollection = new JMenuItem(LanguageManagement.getString("menumaccollection"));
		tempDataDeletion = new JMenuItem(LanguageManagement.getString("menutempdatadeletion"));
		exportToCSV = new JMenuItem(LanguageManagement.getString("menuexporttocsv"));
		systemCheck = new JMenuItem(LanguageManagement.getString("menusystemcheck"));
		injectSD = new JMenuItem(LanguageManagement.getString("menuinjectsd"));
		exit = new JMenuItem(LanguageManagement.getString("menuexit"));
		misc = new JMenu(LanguageManagement.getString("menumisc"));
		help = new JMenuItem(LanguageManagement.getString("menuhelp"));
		about = new JMenuItem(LanguageManagement.getString("menuabout"));
		main = new JPanel();
		siteInfo = new JPanel();
		siteNameLabel = new JLabel("");
		userCount = new JLabel("");
		analogCount = new JLabel("");
		cpgCount = new JLabel("");
		lgCount = new JLabel("");
		
		//Dimension
		this.setSize(new Dimension(600,300));
		this.setResizable(false);
		
		//Disposition
		new Centrer(this);
		this.setBounds(this.getX()+50, this.getY()+50, this.getWidth(), this.getHeight());//We push the widow a bit in the right down corner
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		main.setLayout(new BoxLayout(main,BoxLayout.X_AXIS));
		siteInfo.setLayout(new BoxLayout(siteInfo,BoxLayout.Y_AXIS));
		
		//Association
		action.add(siteInjection);
		action.add(siteDeletion);
		action.add(tempPhoneInjection);
		action.add(tempUserInjection);
		action.add(macCollection);
		action.add(tempDataDeletion);
		action.add(exportToCSV);
		action.add(injectSD);
		action.add(systemCheck);
		action.add(exit);
		misc.add(help);
		misc.add(about);
		myMenuBar.add(action);
		myMenuBar.add(misc);
		this.setJMenuBar(myMenuBar);
		
		siteInfo.add(new JLabel(" "));
		siteInfo.add(siteNameLabel);
		siteInfo.add(userCount);
		siteInfo.add(analogCount);
		siteInfo.add(cpgCount);
		siteInfo.add(lgCount);
		
		this.getContentPane().add(siteInfo);
		this.getContentPane().add(main);
		
		//Events
		this.addWindowListener(this);
		siteInjection.addActionListener(this);
		siteDeletion.addActionListener(this);
		tempPhoneInjection.addActionListener(this);
		tempUserInjection.addActionListener(this);
		macCollection.addActionListener(this);
		tempDataDeletion.addActionListener(this);
		exportToCSV.addActionListener(this);
		injectSD.addActionListener(this);
		systemCheck.addActionListener(this);
		exit.addActionListener(this);
		help.addActionListener(this);
		about.addActionListener(this);
		
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		/****
		 * Initialization
		 */
		init();
		/***************/
		}

	/**********
	 * Method used to init the site creation
	 */
	private void init()
		{
		try
			{
			//We ask the user the collection file
			collectionFileName = UsefulMethod.getCollectionFilePath();
			
			myWorkbook = WorkbookFactory.create(new FileInputStream(collectionFileName));
			
			//We set the site type
			currentType = UsefulMethod.convertStringToSiteType(CollectionTools.getValueFromCollectionFile("cnaf.siteType", myWorkbook));
			
			//We get the current site
			currentSite = CollectionTools.getCurrentSite(myWorkbook);
			
			sitePrefix = CollectionTools.getValueFromCollectionFile("cucm.sitename", myWorkbook);
			siteDesc = CollectionTools.getValueFromCollectionFile("cucm.sitedescription", myWorkbook);
			this.setTitle(sitePrefix+" - "+siteDesc);
			
			siteNameLabel.setText(sitePrefix+" - "+siteDesc);
			
			/***
			 * User count
			 */
			int user = 0, analog = 0;
			int indexMax = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
			for(int i=0; i<indexMax; i++)
				{
				String phone1 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);
				if((phone1.equals("FAX")) || (phone1.equals("ANALOG")))
					{
					analog++;
					}
				else
					{
					user++;
					}
				}
			userCount.setText(LanguageManagement.getString("usercount")+user);
			analogCount.setText(LanguageManagement.getString("analogcount")+analog);
			
			/**
			 * Call pickup Group
			 */
			int cpg = CollectionTools.getTheLastIndexOfAColumn("cucm.pickupname", myWorkbook);
			cpgCount.setText(LanguageManagement.getString("cpgcount")+cpg);
			
			/**
			 * Line Group
			 */
			int lg = CollectionTools.getTheLastIndexOfAColumn("cucm.linegroupname", myWorkbook);
			lgCount.setText(LanguageManagement.getString("lgcount")+lg);
			
			
			//We display the user interface
			this.setVisible(true);
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error(e);
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("errordiscovery")+" : "+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
			this.dispose();
			}
		}
	
	
	/**
	 * Used to manage action
	 */
	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.siteInjection)
			{
			Variables.getLogger().info("Site injection pressed");
			if(Variables.isCUCMReachable())
				{
				if((mySiteCreation == null) || (mySiteCreation.getState().equals(Thread.State.TERMINATED)))
					{
					mySiteCreation = new SiteCreation(collectionFileName,
							myWorkbook,
							this.getCurrentSite().getName(),
							UsefulMethod.getCurrentSiteTypeNumber(this.getCurrentSite().getType()));
					}
				else
					{
					Variables.getLogger().debug("Site creation already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.siteDeletion)
			{
			Variables.getLogger().info("Site deletion pressed");
			if(Variables.isCUCMReachable())
				{
				if((mySiteDeletion == null) || (mySiteDeletion.getState().equals(Thread.State.TERMINATED)))
					{
					mySiteDeletion = new SiteDeletion(collectionFileName,
							myWorkbook,
							this.getCurrentSite().getName(),
							UsefulMethod.getCurrentSiteTypeNumber(this.getCurrentSite().getType()));
					}
				else
					{
					Variables.getLogger().debug("Site deletion already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.tempPhoneInjection)
			{
			Variables.getLogger().info("Temp phone injection pressed");
			if(Variables.isCUCMReachable())
				{
				if((myPhoneCreation == null) || (myPhoneCreation.getState().equals(Thread.State.TERMINATED)))
					{
					myPhoneCreation = new PhoneCreation(this, myWorkbook);
					}
				else
					{
					Variables.getLogger().debug("Temporary phone injection already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.tempUserInjection)
			{
			Variables.getLogger().info("Temp user injection pressed");
			if(Variables.isCUCMReachable())
				{
				if((myUserCreation == null) || (myUserCreation.getState().equals(Thread.State.TERMINATED)))
					{
					myUserCreation = new UserCreation(this, myWorkbook);
					}
				else
					{
					Variables.getLogger().debug("Temporary user already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.macCollection)
			{
			Variables.getLogger().info("Mac Collection pressed");
			if(Variables.isCUCMReachable())
				{
				if((myMacCollection == null) || (myMacCollection.getState().equals(Thread.State.TERMINATED)))
					{
					myMacCollection = new MacCollection(this, myWorkbook, collectionFileName);
					}
				else
					{
					Variables.getLogger().debug("MAC Collection already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.tempDataDeletion)
			{
			Variables.getLogger().info("Delete temporary data pressed");
			if(Variables.isCUCMReachable())
				{
				if((myUserDeletion == null) || (myUserDeletion.getState().equals(Thread.State.TERMINATED)))
					{
					myUserDeletion = new UserDeletion(this, myWorkbook);
					}
				else
					{
					Variables.getLogger().debug("Deletion already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.exportToCSV)
			{
			Variables.getLogger().info("Export to CSV pressed");
			if((myCSVCreation == null) || (myCSVCreation.getState().equals(Thread.State.TERMINATED)))
				{
				myCSVCreation = new CSVCreation(myWorkbook, siteDesc, collectionFileName, true, false);
				}
			else
				{
				Variables.getLogger().debug("CSV creation already in progress");
				}
			}
		else if(evt.getSource() == this.injectSD)
			{
			Variables.getLogger().info("Speed Dial and BLF injection pressed");
			if(Variables.isCUCMReachable())
				{
				if((mySDCreation == null) || (mySDCreation.getState().equals(Thread.State.TERMINATED)))
					{
					mySDCreation = new SdCreation(this, myWorkbook);
					}
				else
					{
					Variables.getLogger().debug("Speed Dial and BLF injection already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.systemCheck)
			{
			Variables.getLogger().info("System check");
			if(Variables.isCUCMReachable())
				{
				if((myCheck == null) || (myCheck.getState().equals(Thread.State.TERMINATED)))
					{
					myCheck = new InjectionCheck(collectionFileName,
							myWorkbook,
							this.getCurrentSite().getName());
					}
				else
					{
					Variables.getLogger().debug("System check already in progress");
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		else if(evt.getSource() == this.exit)
			{
			Variables.getLogger().info("Exit pressed");
			Variables.getLogger().info("The user exit the application willfully");
			this.dispose();
			}
		else if(evt.getSource() == this.help)
			{
			Variables.getLogger().info("Help pressed");
			//has to be enhanced
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("help"),"",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(evt.getSource() == this.about)
			{
			Variables.getLogger().info("About pressed");
			//has to be enhanced
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("about")+"\r\nVersion : "+Variables.getSoftwareVersion(),"",JOptionPane.INFORMATION_MESSAGE);
			}
		}

	
	public void windowActivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public void windowClosed(WindowEvent arg0)
		{
		Variables.getLogger().info("The user exit the window willfully");
		}

	public void windowClosing(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public void windowDeactivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public void windowDeiconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public void windowIconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public void windowOpened(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	public Site getCurrentSite()
		{
		return currentSite;
		}

	public void setCurrentSite(Site currentSite)
		{
		this.currentSite = currentSite;
		}

	public siteType getCurrentType()
		{
		return currentType;
		}

	public void setCurrentType(siteType currentType)
		{
		this.currentType = currentType;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

