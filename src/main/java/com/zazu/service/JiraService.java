package com.zazu.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.zazu.model.Subtask;

public interface JiraService {
	
	public Response createSubTask(List<Subtask> subtasks);

}
