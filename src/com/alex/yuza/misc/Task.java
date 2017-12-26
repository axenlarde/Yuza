package com.alex.yuza.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.actionType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to store a list of todo
 * 
 * It also allowed to launch the task
 * 
 * @author RATEL Alexandre
 **********************************/
public class Task
	{
	/**
	 * Variables
	 */
	private ArrayList<ToDo> todoList;
	private statusType status;
	
	/***************
	 * Constructor
	 ***************/
	public Task(ArrayList<ToDo> todoList)
		{
		this.todoList = todoList;
		this.status = statusType.init;
		}
	
	/*************
	 * Method used to execute all
	 * the todo in the list
	 * @throws Exception 
	 */
	public void proceed() throws Exception
		{
		try
			{
			//Build
			Variables.getLogger().info("Begining of the build process");
			for(ToDo myToDo : todoList)
				{
				myToDo.getItem().build();
				}
			Variables.getLogger().info("End of the build process");
			
			//Execution
			for(ToDo myToDo : todoList)
				{
				if(myToDo.getAction().equals(actionType.inject))
					{
					myToDo.getItem().inject();
					}
				else if(myToDo.getAction().equals(actionType.delete))
					{
					myToDo.getItem().delete();
					}
				else if(myToDo.getAction().equals(actionType.update))
					{
					myToDo.getItem().update();
					}
				}
			}
		catch (Exception e)
			{
			throw e;
			}
		}

	public ArrayList<ToDo> getTodoList()
		{
		return todoList;
		}

	public void setTodoList(ArrayList<ToDo> todoList)
		{
		this.todoList = todoList;
		}

	public statusType getStatus()
		{
		return status;
		}

	public void setStatus(statusType status)
		{
		this.status = status;
		}
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

