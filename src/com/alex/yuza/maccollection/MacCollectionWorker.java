package com.alex.yuza.maccollection;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.maccollection.misc.MacTools;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.utils.Tester;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to collect the Mac Address
 * 
 * @author RATEL Alexandre
 **********************************/
public class MacCollectionWorker extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<ToScan> toScanList;
	private boolean stop;
	private int waitingTime;
	private Workbook wW;
	private String collectionFileName;
	
	
	/***************
	 * Constructor
	 ***************/
	public MacCollectionWorker(ArrayList<ToScan> toScanList, int waitingTime, Workbook wW, String collectionFileName)
		{
		super();
		this.toScanList = toScanList;
		this.stop = false;
		this.waitingTime = waitingTime;
		this.wW = wW;
		this.collectionFileName = collectionFileName;
		
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
				for(ToScan item : toScanList)
					{
					if(!((item.getStatus().equals(statusType.done)) ||
							(item.getStatus().equals(statusType.duplicate))))
						{
						item.setStatus(statusType.processing);
						
						//We collect the mac address here
						String mac = MacTools.getMacFromCUCM(item.getUserID());
						
						//We check if the collected mac is correct
						if(Tester.macValide(mac))
							{
							Variables.getLogger().debug("The MAC address \""+mac+"\" has been collected for the user : "+item.getUserID());
							
							//We set the item value
							item.setMac(mac);
							item.setStatus(statusType.done);
							
							//Then I write the collected Mac address in the collection file
							int[] macInfos = CollectionTools.getMatcherInfo("cucm.mac");
							
							CollectionTools.writeStringInTheCollectionFile(collectionFileName, mac, macInfos[0], macInfos[1], macInfos[2]+item.getIndex(), wW);
							done++;
							
							Variables.getLogger().debug("The MAC address \""+mac+"\" has been written in the collection file");
							}
						else
							{
							item.setStatus(statusType.waiting);
							}
						}
					else
						{
						done++;
						Variables.getLogger().debug("The MAC address of the following user is still missing : "+item.getUserID());
						}
					}
				if(done == toScanList.size())
					{
					stop = true;
					}
				else
					{
					Variables.getLogger().debug("Mac collection process : "+done+"\\"+toScanList.size());
					sleep(waitingTime);
					}
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error(e);
			Variables.getLogger().error("Error while collecting the Mac Addresses : "+e.getMessage());
			}
		
		Variables.getLogger().info("Mac Collection finished");
		}
	
	/**
	 * Method used to stop the thread
	 */
	public void terminate()
		{
		this.stop = true;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

