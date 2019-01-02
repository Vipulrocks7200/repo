package com.tasklist.model;

import java.io.Serializable;

public class TaskVO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String taskName;

	@Override
	public String toString() {
		return "TaskVO [id=" + id + ", taskname=" + taskName
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}



}