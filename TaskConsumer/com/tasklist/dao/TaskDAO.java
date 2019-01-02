package com.tasklist.dao;

import java.util.List;

import com.howtodoinjava.demo.model.TaskVO;


public interface TaskDAO 
{
	public List<TaskVO> getAllTasks();
	public void addTasks(String task);
	public void deleteTasks(String taskid);
}