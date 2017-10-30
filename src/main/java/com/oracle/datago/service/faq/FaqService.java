package com.oracle.datago.service.faq;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Faq;
import com.oracle.datago.model.SessionToken;
import com.oracle.datago.model.rightnow.ClientInfoHeader;
import com.oracle.datago.model.rightnow.RequestErrorFault;
import com.oracle.datago.model.rightnow.RightNowKnowledgePort;
import com.oracle.datago.model.rightnow.RightNowKnowledgeService;
import com.oracle.datago.model.rightnow.SearchResponse;
import com.oracle.datago.model.rightnow.ServerErrorFault;
import com.oracle.datago.model.rightnow.SummaryContent;
import com.oracle.datago.model.rightnow.SummaryContentList;
import com.oracle.datago.model.rightnow.UnexpectedErrorFault;
import com.oracle.datago.util.Config;
//import com.sun.xml.ws.developer.WSBindingProvider;

public class FaqService {

	private static Logger logger = Logger.getLogger(FaqService.class);
	private RightNowKnowledgeService service;
	private HeaderHandlerResolver handlerResolver;
	private RightNowKnowledgePort port;
	private ClientInfoHeader header;
	// for simplicity this demo uses a shared session token
	private SessionToken sessionToken;
	private Boolean init = false;

	public List<Faq> getFaqs(String q) {
		List<Faq> out = new LinkedList<Faq>();
		if (!init) {
			this.init();
		}
		try {
			String sessionToken = this.getSessionToken();
			SearchResponse searchContent = port.searchContent(sessionToken, q, null, null, null, null, null, null, null, null, header);
			logger.info("TotalResults is " + searchContent.getTotalResults());
			JAXBElement<SummaryContentList> summaryContents = searchContent.getSummaryContents();
			if (summaryContents != null) {
				SummaryContentList value = summaryContents.getValue();
				if (value != null) {
					List<SummaryContent> summaryContentList = value.getSummaryContentList();
					if (summaryContentList != null) {
						for (SummaryContent content : summaryContentList) {
							Faq faq = new Faq();
							faq.setId(content.getID().getId());
							faq.setTitle(content.getTitle());
							faq.setUrl(Config.getValue("faq.url") + content.getID().getId());
							out.add(faq);
						}
					}
				}
			}
		} catch (RequestErrorFault e) {
			e.printStackTrace();
		} catch (ServerErrorFault e) {
			e.printStackTrace();
		} catch (UnexpectedErrorFault e) {
			e.printStackTrace();
		}
		return out;
	}

	private synchronized void init() {
		if (!init) {
			service = new RightNowKnowledgeService();
			handlerResolver = new HeaderHandlerResolver();
			service.setHandlerResolver(handlerResolver);
			port = service.getRightNowKnowledgePort();
			header = new ClientInfoHeader();
			header.setAppID(Config.getValue("faq.appid"));
			init = true;
		}
	}
	
	private String getSessionToken() {
		if (this.isTokenValid(sessionToken)) {
			return sessionToken.getToken();
		}
		synchronized (this) {
			if (this.isTokenValid(sessionToken)) {
				return sessionToken.getToken();
			}
			try {
				String token = port.startInteraction(Config.getValue("faq.appid"), Config.getValue("faq.sessionip"), null, null, header);
				sessionToken = new SessionToken();
				sessionToken.setToken(token);
				sessionToken.setCreateTime(new Date().getTime());
				sessionToken.setExpiresIn(Integer.parseInt(Config.getValue("faq.session.expiresin")));
				logger.info("got new token " + sessionToken.getToken());
			} catch (RequestErrorFault e) {
				e.printStackTrace();
			} catch (ServerErrorFault e) {
				e.printStackTrace();
			} catch (UnexpectedErrorFault e) {
				e.printStackTrace();
			}
		}
		return sessionToken.getToken();
	}
	
	private Boolean isTokenValid(SessionToken sessionToken) {
		if (sessionToken != null) {
			if (new Date().getTime() - sessionToken.getCreateTime() < sessionToken.getExpiresIn() * 1000) {
				logger.info("token is valid " + sessionToken.getToken());
				return true;
			}
		}
		logger.info("token has expired");
		return false;
	}

	public static void main(String[] args) {
		new FaqService().getFaqs("データ");
	}

}
