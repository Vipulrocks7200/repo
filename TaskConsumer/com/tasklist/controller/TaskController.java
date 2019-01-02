package com.tasklist.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtodoinjava.demo.model.TaskVO;
import com.howtodoinjava.demo.service.TaskManager;

@Controller
@RequestMapping("/tasks-module")
public class TaskController 
{
	@Autowired
	TaskManager manager;

	@RequestMapping(value = "/getAllTasks", method = RequestMethod.GET)
	public String getAllTasks(Model model)
	{
		
		model.addAttribute("tasks", manager.getAllTasks());
		return "taskListDisplay";
	}
	@RequestMapping(value = "/addTask",method = RequestMethod.POST)
	public String addTask(@RequestParam("taskname") String taskname)
	{
		System.out.println(taskname);
		manager.addTasks(taskname);
		return "addTask";
	}
	
	@RequestMapping(value = "/deleteTask",method = RequestMethod.POST)
	public String deleteTask(@RequestParam("taskid") String taskid)
	{
		System.out.println(taskid);
		manager.deleteTasks(taskid);
		return "deleteTask";
	}
	
	
	
}