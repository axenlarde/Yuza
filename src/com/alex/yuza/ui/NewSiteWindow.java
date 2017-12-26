package com.alex.yuza.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to display a window aims to ask
 * the user the informations needed to create 
 * a new site
 * 
 * @author RATEL Alexandre
 **********************************/
public class NewSiteWindow extends JDialog implements ActionListener, WindowListener
	{
	/**
	 * Variables
	 */
	private JButton ok;
	private JTextField certiTF, cmgTF, departmentTF;
	private JLabel questionLabel, certiLabel, certiExampleLabel, cmgLabel, cmgExampleLabel, departmentLabel, departmentExampleLabel;
	private JPanel main, header, questions, buttons;
	
	
	/*******
	 * Constructor
	 */
	public NewSiteWindow(JFrame myWindow, String siteName)
		{
		super(myWindow, true);
		this.setTitle(LanguageManagement.getString("newsitewindowtitle")+siteName);
		
		certiTF = new JTextField(LanguageManagement.getString("example")+" : AMICAM");
		cmgTF = new JTextField(LanguageManagement.getString("example")+" : CMG-S1S5");
		departmentTF = new JTextField(LanguageManagement.getString("example")+" : /Nationale/CNEDI/CNEDIRA/"+siteName);
		ok = new JButton(LanguageManagement.getString("button2"));
		questionLabel = new JLabel(LanguageManagement.getString("newsitewindowquestion"));
		certiLabel = new JLabel("Certi : ");
		certiExampleLabel = new JLabel(" ");
		cmgLabel = new JLabel("Call Manager Group : ");
		cmgExampleLabel = new JLabel(" ");
		departmentLabel = new JLabel("Kurmi Department : ");
		departmentExampleLabel = new JLabel(" ");
		main = new JPanel();
		header = new JPanel();
		questions = new JPanel();
		buttons = new JPanel();
		
		//Disposition
		new Centrer(this);
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
		header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));
		questions.setLayout(new GridLayout(6, 2));
		buttons.setLayout(new BoxLayout(buttons,BoxLayout.X_AXIS));
		
		//Association
		header.add(questionLabel);
		header.add(Box.createHorizontalGlue());
		
		questions.add(certiLabel);
		questions.add(certiTF);
		questions.add(certiExampleLabel);
		questions.add(new JLabel(" "));
		questions.add(cmgLabel);
		questions.add(cmgTF);
		questions.add(cmgExampleLabel);
		questions.add(new JLabel(" "));
		questions.add(departmentLabel);
		questions.add(departmentTF);
		questions.add(departmentExampleLabel);
		questions.add(new JLabel(" "));
		
		buttons.add(Box.createHorizontalGlue());
		buttons.add(ok);
		buttons.add(Box.createHorizontalGlue());
		
		main.add(header);
		main.add(new JLabel(" "));
		main.add(questions);
		main.add(buttons);
		
		this.getContentPane().add(main);
		
		//Listener
		this.addWindowListener(this);
		ok.addActionListener(this);
		
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//Dimension
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		}
	
	
	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == ok)
			{
			isCloseable();
			}
		}
	
	/******
	 * Method used to know if
	 * we can procedd and close the window
	 */
	private void isCloseable()
		{
		if(checkContent())
			{
			Variables.getLogger().info("The user exit the window willfully");
			this.setVisible(false);
			}
		else
			{
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("newsitewindowwarning"),"",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	
	/********
	 * Method used to know if the window textField
	 * have been filled
	 */
	private boolean checkContent()
		{
		if((certiTF.getText().equals("")) ||
				(cmgTF.getText().equals("")) ||
				(departmentTF.getText().equals("")))
			{
			return false;
			}
		else
			{
			return true;
			}
		}
	
	
	public String getCerti() throws Exception
		{
		if(certiTF.getText().equals(""))
			{
			throw new Exception(LanguageManagement.getString("newsitewindowwarning"));
			}
		else
			{
			return certiTF.getText();
			}
		}

	public String getCmg() throws Exception
		{
		if(cmgTF.getText().equals(""))
			{
			throw new Exception(LanguageManagement.getString("newsitewindowwarning"));
			}
		else
			{
			return cmgTF.getText();
			}
		}

	public String getDepartment() throws Exception
		{
		if(departmentTF.getText().equals(""))
			{
			throw new Exception(LanguageManagement.getString("newsitewindowwarning"));
			}
		else
			{
			return departmentTF.getText();
			}
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
		
		}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent arg0)
		{
		this.setVisible(false);
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

