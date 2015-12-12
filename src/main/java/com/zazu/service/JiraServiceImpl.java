package com.zazu.service;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zazu.util.PropertyRetriever;

@Path("/jira")
public class JiraServiceImpl implements JiraService {

	@Inject
	private PropertyRetriever propertyRetriever;

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/subtask")
	public Response createSubTask() {

		return Response.ok().status(200).entity("").build();

	}

}
