
package com.alex.yuza.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

import com.alex.yuza.utils.Centrer;
import com.alex.yuza.utils.LanguageManagement;


/*********************************************
 * Class used to display the preparation status
 *********************************************/
public class WaitingWindow extends JWindow
	{
	/**
	 * Variables
	 */
	//Contenu
	private JLabel titre;
	private JLabel avancement;
	private JLabel sarlSize;
	private JPanel info;
	private JPanel loader;
	
	/**
	 * Constructeur
	 */
	public WaitingWindow(String waitingText)
		{
		titre = new JLabel(" "+waitingText);
		avancement = new JLabel("");
		sarlSize = new JLabel("");
		info  = new JPanel();
		loader  = new JPanel();
		
		Font f = new Font("Serif", Font.BOLD, 14);
		titre.setFont(f);
		avancement.setFont(f);
		sarlSize.setFont(f);
		
		//Colors
		this.getContentPane().setBackground(Color.BLACK);
		info.setBackground(Color.BLACK);
		loader.setBackground(Color.BLACK);
		titre.setForeground(Color.WHITE);
		avancement.setForeground(Color.WHITE);
		sarlSize.setForeground(Color.WHITE);
		
		//Positionnement
		this.setSize(new Dimension(650,50));
		new Centrer(this);
		this.setBounds(this.getX(), this.getY()-250, this.getWidth(), this.getHeight());//We push the widow a bit upper
		
		//Layout
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.X_AXIS));
		info.setLayout(new BoxLayout(info,BoxLayout.Y_AXIS));
		loader.setLayout(new BoxLayout(loader,BoxLayout.X_AXIS));
		
		//Disposition
		info.add(Box.createHorizontalGlue());
		info.add(titre);
		info.add(avancement);
		info.add(sarlSize);
		info.add(Box.createHorizontalGlue());
		
		//loader.add(new JLabel(" "));
		loader.add(Box.createVerticalGlue());
		loader.add(new JLabel(new ImageIcon(getClass().getResource("/art/ballLoader.gif"))));
		loader.add(Box.createVerticalGlue());
		//loader.add(new JLabel(" "));
		
		this.getContentPane().add(info);
		this.getContentPane().add(Box.createHorizontalGlue());
		this.getContentPane().add(loader);
		
		//Affichage de la fen�tre
		this.setVisible(true);
		
		this.toFront();
		}
	
	public void close()
		{
		this.dispose();
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}
