package com.oracle.datago.controller;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Response;
import com.oracle.datago.service.faq.FaqService;
import com.rightnow.ws.base.v1_3.RNObject;

@Path("/faq")
@Singleton
public class FaqController {

	private static Logger logger = Logger.getLogger(FaqController.class);
	private FaqService faqService = new FaqService();
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFaqs(
			@QueryParam("q") String q,
			@QueryParam("productId") String productId,
			@QueryParam("categoryId") String categoryId) {

		logger.debug("q=" + q + ",productId=" + productId + ",categoryId=" + categoryId);
		Response response = new Response();
		response.setFaqs(faqService.getFaqs(q, productId, categoryId));
		return response;
	}
	
	@GET
	@Path("/filter")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RNObject> getFilters(@QueryParam("name") String name) {
		logger.debug(name);
		List<RNObject> filters = faqService.getFilters(name);
		return filters;
	}

}
