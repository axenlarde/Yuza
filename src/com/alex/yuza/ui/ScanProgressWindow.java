package com.alex.yuza.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import com.alex.yuza.maccollection.ToScan;
import com.alex.yuza.maccollection.misc.MacCollection;
import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to display Mac collection progress
 * 
 * @author RATEL Alexandre
 **********************************/
public class ScanProgressWindow extends JFrame implements WindowListener
	{
	/**
	 * Variables
	 */
	private ArrayList<ToScan> toScanList;
	private ArrayList<MacInfoLine> myLineList;
	private int totalToScan;
	private MacCollection myCollection;
	private final String[] spinner = {".",".",".","..","..","..","...","...","...","....","....","....","...","...","...","..","..",".."};
	private int spinnerIndex;
	
	private JPanel header;
	private JPanel center;
	private JPanel footer;
	private JLabel status;
	private JLabel count;
	private JLabel percentage;
	private JLabel loader;
	private JProgressBar progress;
	private JScrollPane scrollbar;
	
	/***************
	 * Constructor
	 ***************/
	public ScanProgressWindow(ArrayList<ToScan> toScanList, MacCollection myCollection)
			throws HeadlessException
		{
		super(LanguageManagement.getString("maccollectiontitle"));
		this.toScanList = toScanList;
		totalToScan = toScanList.size();
		this.myCollection = myCollection;
		spinnerIndex = 0;
		
		header = new JPanel();
		center = new JPanel();
		scrollbar = new JScrollPane(center);
		footer = new JPanel();
		count = new JLabel("0/0 ");
		status = new JLabel(LanguageManagement.getString("maccollectionstatusinprogress"));
		loader = new JLabel("");
		percentage = new JLabel("  0% ");
		progress = new JProgressBar(0, totalToScan);
		
		
		//Dimension
		this.setSize(new Dimension(400,300));
		this.setResizable(false);
		
		//Disposition
		new Centrer(this);
		this.setBounds(this.getX()+100, this.getY()-100, this.getWidth(), this.getHeight());//We push the widow a bit in the upper right corner
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));
		center.setLayout(new BoxLayout(center,BoxLayout.Y_AXIS));
		footer.setLayout(new BoxLayout(footer,BoxLayout.X_AXIS));
		
		//Association
		header.add(status);
		header.add(new JLabel(" "));
		header.add(loader);
		header.add(Box.createHorizontalGlue());
		header.add(count);
		this.getContentPane().add(header);
		
		//Center will be managed later
		this.getContentPane().add(scrollbar);
		
		footer.add(progress);
		//footer.add(Box.createHorizontalGlue());
		footer.add(percentage);
		this.getContentPane().add(footer);
		
		//Events
		this.addWindowListener(this);
		
		//Misc
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		/*******
		 * Init
		 */
		init();
		/*********/
		}
	
	/******
	 * Method used to initialize the window content
	 */
	private void init()
		{
		myLineList = new ArrayList<MacInfoLine>();
		for(int i=0; i<toScanList.size(); i++)
			{
			myLineList.add(new MacInfoLine(toScanList.get(i), (i%2==0)?Color.WHITE:Color.LIGHT_GRAY));
			}
		
		this.center.removeAll();
		for(JPanel p : myLineList)
			{
			this.center.add(p);
			}
		
		this.repaint();
		this.validate();
		
		Variables.getLogger().debug("Scan Progress Window launched with "+myLineList.size()+" line to display");
		}

	/********
	 * Method used to update the overall informations displayed
	 */
	public void update()
		{
		/**
		 * We update the loader
		 */
		if(spinnerIndex>=spinner.length)spinnerIndex=0;
		loader.setText(spinner[spinnerIndex]);
		spinnerIndex++;
		
		/**
		 * We update here the line list
		 */
		for(MacInfoLine m : myLineList)
			{
			m.update();
			}
		
		/**
		 * We update here the counter
		 */
		//First we get the total of the collected MAC
		int done = 0;
		for(ToScan ts : toScanList)
			{
			if(ts.getStatus().equals(statusType.done))done++;
			}
		count.setText(done+"/"+totalToScan+" ");
		
		
		/**
		 * We finally update here the progress bar and the percentage
		 */
		//Progress bar
		progress.setValue(done);
		
		//percentage
		percentage.setText(((int)((((float)done)/(float)totalToScan)*100F))+"% ");
		}
	
	/*****
	 * Method used to update the loader appearance
	 */
	private void updateLoader()
		{
		
		}
	
	/********
	 * Method used to update the window to inform
	 * the user that the collection process is finished
	 */
	public void finished()
		{
		status.setText(LanguageManagement.getString("maccollectionstatusfinished"));
		JOptionPane.showMessageDialog(null,LanguageManagement.getString("maccollectionmessagefinished"), "",JOptionPane.INFORMATION_MESSAGE);
		}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent arg0)
		{
		myCollection.endOfCollection();
		Variables.getLogger().info("The user exit the window willfully");
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

