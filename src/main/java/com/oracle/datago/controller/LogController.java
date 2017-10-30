package com.oracle.datago.controller;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Log;
import com.oracle.datago.service.LogService;
import javax.servlet.http.HttpServletRequest;

@Path("/log")
@Singleton
public class LogController {

	private static Logger logger = Logger.getLogger(LogController.class);
	private LogService logService = new LogService();

	@POST
	@Path("/")
	public void log(Log log, @Context HttpServletRequest request) {
		logger.debug("log controller");
		logService.saveLog(log);
	}

}
