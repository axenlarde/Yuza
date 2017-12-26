package com.alex.yuza.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**********************************
 * This class is a simple panel allowing the user
 * to enter a suffix input
 * 
 * @author RATEL Alexandre
 **********************************/
public class SuffixInputPanel extends JPanel
	{
	/**
	 * Variables
	 */
	private JTextField suffixInput;

	/***************
	 * Constructor
	 ***************/
	public SuffixInputPanel()
		{
		super();
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		this.setPreferredSize(new Dimension(300,25));
		suffixInput = new JTextField();
		//suffixInput.setMaximumSize(new Dimension(0, 25));
		suffixInput.setColumns(40);
		this.add(suffixInput);
		this.add(Box.createHorizontalGlue());
		}

	/*****
	 * Used to get the content of the textField
	 */
	public String getSuffix()
		{
		return suffixInput.getText();
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

