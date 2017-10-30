package com.oracle.datago.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Response;
import com.oracle.datago.service.faq.FaqService;

@Path("/faq")
@Singleton
public class FaqController {

	private static Logger logger = Logger.getLogger(FaqController.class);
	private FaqService faqService = new FaqService();
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFaqs(@QueryParam("q") String q) {
		logger.debug(q);
		Response response = new Response();
		response.setFaqs(faqService.getFaqs(q));
		return response;
	}

}
