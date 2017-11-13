
package com.oracle.datago.model.rightnow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RightNowKnowledgeService", targetNamespace = "urn:wsdl.ws.rightnow.com/v1", wsdlLocation = "http://rnowgse00537-jp.rightnowdemo.com/cgi-bin/rnowgse00537_jp.cfg/services/kf_soap?wsdl")
public class RightNowKnowledgeService
    extends Service
{

    private final static URL RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.oracle.datago.model.rightnow.RightNowKnowledgeService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.oracle.datago.model.rightnow.RightNowKnowledgeService.class.getResource(".");
            url = new URL(baseUrl, "http://rnowgse00537-jp.rightnowdemo.com/cgi-bin/rnowgse00537_jp.cfg/services/kf_soap?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://rnowgse00537-jp.rightnowdemo.com/cgi-bin/rnowgse00537_jp.cfg/services/kf_soap?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION = url;
    }

    public RightNowKnowledgeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RightNowKnowledgeService() {
        super(RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION, new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgeService"));
    }

    /**
     * 
     * @return
     *     returns RightNowKnowledgePort
     */
    @WebEndpoint(name = "RightNowKnowledgePort")
    public RightNowKnowledgePort getRightNowKnowledgePort() {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgePort"), RightNowKnowledgePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RightNowKnowledgePort
     */
    @WebEndpoint(name = "RightNowKnowledgePort")
    public RightNowKnowledgePort getRightNowKnowledgePort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgePort"), RightNowKnowledgePort.class, features);
    }

}
