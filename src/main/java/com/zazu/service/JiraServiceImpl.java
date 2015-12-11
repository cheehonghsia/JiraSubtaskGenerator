package com.zazu.service;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zazu.model.Subtask;

@Path("/jira")
public class JiraServiceImpl implements JiraService {

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/subtask")
	public Response createSubTask(List<Subtask> subtasks) {
		
		return Response.ok().status(200).entity("").build();

	}

}
