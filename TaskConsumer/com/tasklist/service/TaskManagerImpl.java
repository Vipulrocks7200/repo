package com.tasklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.dao.TaskDAO;
import com.howtodoinjava.demo.model.TaskVO;

@Service
public class TaskManagerImpl implements TaskManager {

	@Autowired
	TaskDAO dao;
	
	public List<TaskVO> getAllTasks() 
	{
		return dao.getAllTasks();
	}

	public void addTasks(String task) {
		 dao.addTasks(task);
		
	}
	public void deleteTasks(String taskid)
	{
		 dao.deleteTasks(taskid);
		
	}
}
