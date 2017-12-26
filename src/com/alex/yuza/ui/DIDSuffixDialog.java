package com.alex.yuza.ui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;

/**********************************
 * This dialog aims to ask the user the suffixes needed
 * to create a new translation pattern 
 * 
 * @author RATEL Alexandre
 **********************************/
public class DIDSuffixDialog extends JDialog implements ActionListener
	{
	/**
	 * Variables
	 */
	private String question, firstDID, lastDID;
	private ArrayList<String> suffixPatterns;
	
	private JLabel questionLabel;
	private JButton addASuffixInput, submit, cancel;
	private ArrayList<SuffixInputPanel> suffixInputList;
	private JPanel questionPanel, main, inputPanel, rightPanel, submitPanel;
	
	
	/***************
	 * Constructor
	 ***************/
	public DIDSuffixDialog(JFrame owner, String firstDID, String lastDID)
		{
		super(owner, true);
		this.firstDID = firstDID;
		this.lastDID = lastDID;
		
		suffixPatterns = new ArrayList<String>();
		suffixInputList = new ArrayList<SuffixInputPanel>();
		suffixInputList.add(new SuffixInputPanel());//We add the first input field because we need at least one
		
		build();
		}
	
	/**
	 * Used to build the dialog
	 */
	private void build()
		{
		questionLabel = new JLabel(" "+LanguageManagement.getString("didpatternuserquestion")+firstDID+" "+lastDID+" ");
		addASuffixInput = new JButton("+");
		submit = new JButton(LanguageManagement.getString("button2"));
		cancel = new JButton(LanguageManagement.getString("button3"));
		questionPanel = new JPanel();
		main = new JPanel();
		inputPanel = new JPanel();
		rightPanel = new JPanel();
		submitPanel = new JPanel();
		
		//Disposition
		new Centrer(this);
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		this.questionPanel.setLayout(new BoxLayout(questionPanel,BoxLayout.X_AXIS));
		this.main.setLayout(new BoxLayout(main,BoxLayout.X_AXIS));
		this.inputPanel.setLayout(new BoxLayout(inputPanel,BoxLayout.Y_AXIS));
		this.rightPanel.setLayout(new FlowLayout());
		this.submitPanel.setLayout(new BoxLayout(submitPanel,BoxLayout.X_AXIS));
		
		//Disposition
		questionPanel.add(questionLabel);
		fillSuffixInputPanel(inputPanel);
		rightPanel.add(addASuffixInput);
		main.add(Box.createHorizontalGlue());
		main.add(inputPanel);
		main.add(rightPanel);
		main.add(Box.createHorizontalGlue());
		submitPanel.add(Box.createHorizontalGlue());
		submitPanel.add(submit);
		submitPanel.add(cancel);
		submitPanel.add(Box.createHorizontalGlue());
		this.getContentPane().add(new JLabel(" "));
		this.getContentPane().add(questionPanel);
		this.getContentPane().add(new JLabel(" "));
		this.getContentPane().add(main);
		this.getContentPane().add(Box.createVerticalGlue());
		this.getContentPane().add(new JLabel(" "));
		this.getContentPane().add(submitPanel);
		
		//Action
		addASuffixInput.addActionListener(this);
		submit.addActionListener(this);
		cancel.addActionListener(this);
		
		//Misc
		this.pack();
		this.setVisible(true);
		}
	
	/**************
	 * Method used to fill the suffix input panel
	 */
	private void fillSuffixInputPanel(JPanel panel)
		{
		panel.removeAll();
		for(SuffixInputPanel p : suffixInputList)
			{
			panel.add(p);
			}
		
		panel.revalidate();
		panel.repaint();
		this.pack();
		}
	
	/******
	 * AIms to fill the arrayList of suffix with
	 * what is inside the textField
	 */
	private void harvestResult()
		{
		for(SuffixInputPanel p : suffixInputList)
			{
			String s = p.getSuffix();
			if((s != null)||(!s.equals("")))suffixPatterns.add(s);
			}
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.addASuffixInput)
			{
			suffixInputList.add(new SuffixInputPanel());
			fillSuffixInputPanel(inputPanel);
			Variables.getLogger().debug("New input field added");
			}
		else if(evt.getSource() == this.submit)
			{
			harvestResult();
			this.setVisible(false);
			}
		else if(evt.getSource() == this.cancel)
			{
			suffixPatterns.clear();
			this.setVisible(false);
			}
		}

	/*******
	 * Getter
	 */
	public ArrayList<String> getSuffixPatterns()
		{
		return suffixPatterns;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

