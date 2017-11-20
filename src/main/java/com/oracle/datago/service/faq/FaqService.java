package com.oracle.datago.service.faq;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import com.oracle.datago.model.Faq;
import com.oracle.datago.model.SessionToken;
import com.oracle.datago.model.rightnow.ClientInfoHeader;
import com.oracle.datago.model.rightnow.ContentFilterList;
import com.oracle.datago.model.rightnow.ID;
import com.oracle.datago.model.rightnow.NamedIDHierarchy;
import com.oracle.datago.model.rightnow.RequestErrorFault;
import com.oracle.datago.model.rightnow.RightNowKnowledgePort;
import com.oracle.datago.model.rightnow.RightNowKnowledgeService;
import com.oracle.datago.model.rightnow.SearchResponse;
import com.oracle.datago.model.rightnow.ServerErrorFault;
import com.oracle.datago.model.rightnow.ServiceCategoryContentFilter;
import com.oracle.datago.model.rightnow.ServiceProductContentFilter;
import com.oracle.datago.model.rightnow.SummaryContent;
import com.oracle.datago.model.rightnow.SummaryContentList;
import com.oracle.datago.model.rightnow.UnexpectedErrorFault;
import com.oracle.datago.util.Config;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.messages.v1_3.QueryResultData;
import com.rightnow.ws.messages.v1_3.RNObjectsResult;
import com.rightnow.ws.wsdl.v1_3.RightNowSyncPort;
import com.rightnow.ws.wsdl.v1_3.RightNowSyncService;
//import com.sun.xml.ws.developer.WSBindingProvider;

public class FaqService {

	private static Logger logger = Logger.getLogger(FaqService.class);
	private RightNowKnowledgeService service;
	private RightNowSyncService syncService;
	private HeaderHandlerResolver handlerResolver;
	private RightNowKnowledgePort port;
	private RightNowSyncPort syncPort;
	private ClientInfoHeader header;
	private com.rightnow.ws.messages.v1_3.ClientInfoHeader syncHeader;
	// for simplicity this demo uses a shared session token
	private SessionToken sessionToken;
	private Boolean init = false;
	private final static String QUERY_PRODUCT = "SELECT ServiceProduct FROM ServiceProduct";
	private final static String QUERY_CATEGORY = "SELECT ServiceCategory FROM ServiceCategory";

	public List<Faq> getFaqs(String q, String productId, String categoryId) {
		List<Faq> out = new LinkedList<Faq>();
		if (!init) {
			this.init();
		}
		try {
			String sessionToken = this.getSessionToken();
			ContentFilterList filters = buildFilter(productId, categoryId);
			SearchResponse searchContent = port.searchContent(sessionToken, q, filters, null, null, null, null, null, null, null, header);
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

	public List<RNObject> getFilters(String name) {
		List<RNObject> out = new LinkedList<RNObject>();

		if (!init) {
			this.init();
		}
		try {
			String query = QUERY_PRODUCT;
			if (name.equals("category")) {
				query = QUERY_CATEGORY;
			}

			List<QueryResultData> resultList = syncPort.queryObjects(query, null, null, syncHeader);
			logger.info("TotalResults is " + resultList.size());

			if (!resultList.isEmpty()) {
				QueryResultData queryResultData = resultList.get(0);
				if (queryResultData != null) {
					RNObjectsResult objectsResult = queryResultData.getRNObjectsResult();
					if (objectsResult != null) {
						out = objectsResult.getRNObjects();
					}
				}
			}
		} catch (com.rightnow.ws.wsdl.v1_3.RequestErrorFault e) {
			e.printStackTrace();
		} catch (com.rightnow.ws.wsdl.v1_3.ServerErrorFault e) {
			e.printStackTrace();
		} catch (com.rightnow.ws.wsdl.v1_3.UnexpectedErrorFault e) {
			e.printStackTrace();
		}
		return out;
	}

	private synchronized void init() {
		if (!init) {
			handlerResolver = new HeaderHandlerResolver();

			service = new RightNowKnowledgeService();
			service.setHandlerResolver(handlerResolver);
			port = service.getRightNowKnowledgePort();
			header = new ClientInfoHeader();
			header.setAppID(Config.getValue("faq.appid"));

			syncService = new RightNowSyncService();
			syncService.setHandlerResolver(handlerResolver);
			syncPort = syncService.getRightNowSyncPort();
			syncHeader = new com.rightnow.ws.messages.v1_3.ClientInfoHeader();
			syncHeader.setAppID(Config.getValue("faq.appid"));

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

	private ContentFilterList buildFilter(String productId, String categoryId) {
		ContentFilterList filters = new ContentFilterList();
		ServiceProductContentFilter serviceProduct = new ServiceProductContentFilter();
		ServiceCategoryContentFilter serviceCategory = new ServiceCategoryContentFilter();
		NamedIDHierarchy nObj = new NamedIDHierarchy();
		ID idObj = new ID();

		// product
		if (productId != null && !productId.equals("")) {
			idObj.setId(Long.valueOf(productId));
			nObj.setID(idObj);
			serviceProduct.setServiceProduct(nObj);
			filters.getContentFilterList().add(serviceProduct);
		}

		// category
		if (categoryId != null && !categoryId.equals("")) {
			idObj.setId(Long.valueOf(categoryId));
			nObj.setID(idObj);
			serviceCategory.setServiceCategory(nObj);
			filters.getContentFilterList().add(serviceCategory);
		}

		return filters;
	}

	public static void main(String[] args) {
		new FaqService().getFilters("category");
	}

}
