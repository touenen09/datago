package com.oracle.datago.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Response;
import com.oracle.datago.service.oaa.SuggestService;

@Path("/suggest")
@Singleton
public class SuggestController {

	private static Logger logger = Logger.getLogger(SuggestController.class);
	private SuggestService suggestService = new SuggestService();
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDocuments(@QueryParam("q") String q) {
		logger.debug(q);
		Response response = new Response();
		response.setSuggests(suggestService.getSuggests(q));
		return response;
	}

}
