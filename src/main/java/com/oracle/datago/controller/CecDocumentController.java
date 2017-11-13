package com.oracle.datago.controller;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Document;
import com.oracle.datago.model.Response;
import com.oracle.datago.service.solr.DocumentService;

@Path("/cec_document")
@Singleton
public class CecDocumentController {

	private static Logger logger = Logger.getLogger(CecDocumentController.class);
	private DocumentService documentService = new DocumentService();

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDocuments(@QueryParam("q") String q) {
		logger.debug(q);
		Response response = new Response();
		List<Document> documents = documentService.getDocuments(q);
		response.setDocuments(documents);
		return response;
	}

}
