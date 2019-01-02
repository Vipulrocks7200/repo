package com.tasklist.service;

import java.util.List;

import com.howtodoinjava.demo.model.TaskVO;

public interface TaskManager 
{
	public List<TaskVO> getAllTasks();
	public void addTasks(String task);
	public void deleteTasks(String taskid);
}
