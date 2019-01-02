package com.tasklist.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.TaskVO;

@Repository
@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class TaskDAOImpl implements TaskDAO {

	public List<TaskVO> getAllTasks() 
	{
		List<TaskVO> tasks = new ArrayList<TaskVO>();
		HttpResponse<String> response=null;
		try {
			response = Unirest.get("http://localhost:9080/TaskTest/getAllTasks")
					  .header("cache-control", "no-cache")
					  .header("authorization", "Basic dGVzdDp0ZXN0QDEyMw==")
					  .asString();
			ObjectMapper mapper = new ObjectMapper();
			tasks = mapper.readValue(response.getBody(), new TypeReference<List<TaskVO>>(){});
			} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tasks;
	}

	public void addTasks(String task) {
		try {
			HttpResponse<String> response = Unirest.post("http://localhost:9080/TaskTest/addTask")
					  .header("content-type", "application/json")
					  .header("cache-control", "no-cache")
					  .header("authorization", "Basic dGVzdDp0ZXN0QDEyMw==")
					  .body("{\n\"taskName\" : \""+task+"\"\n}")
					  .asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteTasks(String taskid) {
		
		try {
			HttpResponse<String> response = Unirest.delete("http://localhost:9080/TaskTest/deleteTask/"+taskid+"")
					  .header("content-type", "application/json")
					  .header("authorization", "Basic dGVzdDp0ZXN0QDEyMw==")
					  .header("cache-control", "no-cache")
					  .asString();
			System.out.println(response.getBody());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}