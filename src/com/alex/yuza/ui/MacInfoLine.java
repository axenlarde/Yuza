package com.alex.yuza.ui;

import com.alex.yuza.maccollection.ToScan;
import com.alex.yuza.utils.Variables.statusType;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

/**********************************
 * Class used to display one line of the 
 * Scan progress window
 * 
 * @author RATEL Alexandre
 **********************************/
public class MacInfoLine extends JPanel
	{
	/**
	 * Variables
	 */
	private ToScan myScan;
	private JLabel userID;
	private JLabel status;
	
	/***************
	 * Constructor
	 ***************/
	public MacInfoLine(ToScan myScan, Color c)
		{
		super();
		this.myScan = myScan;
		
		userID = new JLabel(myScan.getUserID());
		status = new JLabel(myScan.getStatus().name());
		
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		
		this.add(userID);
		this.add(Box.createHorizontalGlue());
		this.add(status);
		
		setBackgroundColor(c);
		}
	
	/***************
	 * Set background color
	 */
	public void setBackgroundColor(Color c)
		{
		this.setBackground(c);
		userID.setBackground(c);
		status.setBackground(c);
		}
	
	
	public void update()
		{
		status.setText(myScan.getStatus().name());
		
		if(myScan.getStatus().equals(statusType.duplicate))
			{
			this.setBackgroundColor(Color.RED);
			userID.setForeground(Color.WHITE);
			status.setForeground(Color.WHITE);
			}
		
		this.repaint();
		}
	
	public JLabel getStatus()
		{
		return status;
		}
	public void setStatus(JLabel status)
		{
		this.status = status;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

