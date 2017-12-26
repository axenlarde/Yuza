package com.alex.yuza.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.alex.yuza.csv.misc.MultipleCSVCreation;
import com.alex.yuza.injectioncheck.MultipleInjectionCheck;
import com.alex.yuza.site.misc.MultipleSiteCreation;
import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.LanguageManagement;

/**********************************
 * Class aims to be the main User interface widow
 * 
 * @author RATEL Alexandre
 **********************************/
public class MainWindow extends JFrame implements ActionListener,WindowListener
	{
	/**
	 * Variables
	 */
	private JMenuBar myMenuBar;
	private JMenu action;
	private JMenuItem newSite;
	private JMenu newMultipleSite;
	private JMenuItem newMultipleSiteInjection;
	private JMenuItem newMultipleSiteCSV;
	private JMenuItem newMultipleSiteInspection;
	private JMenuItem exit;
	private JMenu misc;
	private JMenuItem help;
	private JMenuItem about;
	private JPanel main;
	private JScrollPane sp;
	private JTextArea consoleLog;
	private int rows;
	
	private MultipleSiteCreation myMSC;
	private MultipleCSVCreation myMCSV;
	private MultipleInjectionCheck myMIC;
	
	/**
	 * Constructor
	 * @throws Exception 
	 */
	public MainWindow() throws Exception
		{
		super(Variables.getSoftwareName()+" - "+Variables.getSoftwareVersion());
		myMenuBar = new JMenuBar();
		action = new JMenu(LanguageManagement.getString("menuaction"));
		newSite = new JMenuItem(LanguageManagement.getString("menunewsite"));
		newMultipleSite = new JMenu(LanguageManagement.getString("menunewmultiplesite"));
		newMultipleSiteInjection = new JMenuItem(LanguageManagement.getString("menunewmultiplesiteinjection"));
		newMultipleSiteCSV = new JMenuItem(LanguageManagement.getString("menunewmultiplesitecsv"));
		newMultipleSiteInspection = new JMenuItem(LanguageManagement.getString("menunewmultiplesiteinspection"));
		exit = new JMenuItem(LanguageManagement.getString("menuexit"));
		misc = new JMenu(LanguageManagement.getString("menumisc"));
		help = new JMenuItem(LanguageManagement.getString("menuhelp"));
		about = new JMenuItem(LanguageManagement.getString("menuabout"));
		main = new JPanel();
		rows = 2;
		
		//TextArea
		consoleLog = new JTextArea("",5,40);
		//consoleLog.setPreferredSize(dimInfo);
		consoleLog.setLineWrap(true);
		consoleLog.setEditable(false);
		consoleLog.setCaretPosition(consoleLog.getDocument().getLength());
		sp = new JScrollPane(consoleLog);
		//sp.setPreferredSize(dimInfo);
		
		//Dimension
		this.setSize(new Dimension(600,300));
		this.setResizable(false);
		
		//Disposition
		new Centrer(this);
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		main.setLayout(new BoxLayout(main,BoxLayout.X_AXIS));
		
		//Association
		newMultipleSite.add(newMultipleSiteInjection);
		newMultipleSite.add(newMultipleSiteCSV);
		newMultipleSite.add(newMultipleSiteInspection);
		action.add(newSite);
		action.add(newMultipleSite);
		action.add(exit);
		misc.add(help);
		misc.add(about);
		myMenuBar.add(action);
		myMenuBar.add(misc);
		this.setJMenuBar(myMenuBar);
		main.add(sp);
		this.getContentPane().add(main);
		
		//Events
		this.addWindowListener(this);
		newSite.addActionListener(this);
		newMultipleSiteInjection.addActionListener(this);
		newMultipleSiteCSV.addActionListener(this);
		newMultipleSiteInspection.addActionListener(this);
		exit.addActionListener(this);
		help.addActionListener(this);
		about.addActionListener(this);
		
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		}
	
	/*********
	 * Method used to add text in the
	 * logs window
	 */
	public void displayLogs(String log)
		{
		rows++;
		consoleLog.insert(log+"\r\n",consoleLog.getDocument().getLength());
		consoleLog.setRows(rows);
		}

	/**
	 * Used to manage action
	 */
	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.newSite)
			{
			Variables.getLogger().info("New site button pressed");
			new SiteManagementWindow();
			}
		else if(evt.getSource() == this.newMultipleSiteInjection)
			{
			if((myMSC == null) || (myMSC.getState().equals(Thread.State.TERMINATED)))
				{
				Variables.getLogger().info("New Multiple site Injection button pressed");
				myMSC = new MultipleSiteCreation();
				}
			else
				{
				Variables.getLogger().debug("Site injection already in progress");
				}
			}
		else if(evt.getSource() == this.newMultipleSiteCSV)
			{
			if((myMCSV == null) || (myMCSV.getState().equals(Thread.State.TERMINATED)))
				{
				Variables.getLogger().info("New Multiple site CSV button pressed");
				new MultipleCSVCreation();
				}
			else
				{
				Variables.getLogger().debug("CSV creation already in progress");
				}
			}
		else if(evt.getSource() == this.newMultipleSiteInspection)
			{
			if((myMIC == null) || (myMIC.getState().equals(Thread.State.TERMINATED)))
				{
				Variables.getLogger().info("New Multiple site Inspection button pressed");
				myMIC = new MultipleInjectionCheck();
				}
			else
				{
				Variables.getLogger().debug("Site inspection already in progress");
				}
			}
		else if(evt.getSource() == this.exit)
			{
			Variables.getLogger().info("Exit pressed");
			Variables.getLogger().info("The user exit the application willfully");
			System.exit(0);
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
		Variables.getLogger().info("The user exit the application willfully");
		System.exit(0);
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
	
	/*2015*//*RATEL Alexandre 8)*/
	}

