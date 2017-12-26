package com.alex.yuza.maccollection;

import java.util.ArrayList;

import com.alex.yuza.ui.ScanProgressWindow;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to check the MAC collection progress and then :
 * - Update the ScanProgressWindow with any headway
 * - We check duplicates in the toScanList and display them
 * - anything else ...
 * 
 * @author RATEL Alexandre
 **********************************/
public class ScanProgressChecker extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<ToScan> toScanList;
	private ScanProgressWindow myWindow;
	private int refreshPeriod;//Set the refresh period of the window
	private boolean stop;
	
	/***************
	 * Constructor
	 ***************/
	public ScanProgressChecker(ArrayList<ToScan> toScanList,
			ScanProgressWindow myWindow, int refreshPeriod)
		{
		super();
		this.toScanList = toScanList;
		this.myWindow = myWindow;
		this.refreshPeriod = refreshPeriod;
		stop = false;
		
		start();
		}


	public void run()
		{
		int done;//Used to know when all the mac addresses have been collected
		
		try
			{
			while(!stop)
				{
				done = 0;
				for(ToScan ts : toScanList)
					{
					if((ts.getStatus().equals(statusType.done)) ||
							(ts.getStatus().equals(statusType.duplicate)))
						{
						done++;
						}
					}
				
				//Here we check for duplicates
				for(int i=0; i<toScanList.size() ;i++)
					{
					for(int j=i+1; j<toScanList.size() ;j++)
						{
						if((toScanList.get(i).getMac() != null) &&
								(toScanList.get(j).getMac() != null))
							{
							if(!((toScanList.get(i).getStatus().equals(statusType.duplicate)) &&
								(toScanList.get(j).getStatus().equals(statusType.duplicate))))
								{
								if(toScanList.get(j).getMac().equals(toScanList.get(i).getMac()))
									{
									toScanList.get(i).setStatus(statusType.duplicate);
									toScanList.get(j).setStatus(statusType.duplicate);
									Variables.getLogger().debug("Duplicate found : "+toScanList.get(i).getUserID()+" and "+toScanList.get(j).getUserID()+" about the Mac address : "+toScanList.get(i).getMac());
									}
								}
							}
						}
					}
				
				
				myWindow.update();//We update here the progress window
				
				if(done == toScanList.size())
					{
					myWindow.finished();
					stop = true;
					}
				else
					{
					sleep(refreshPeriod);
					}
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}
		}
	
	/********
	 * Method used to terminate the thread
	 */
	public void terminate()
		{
		this.stop = true;
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

