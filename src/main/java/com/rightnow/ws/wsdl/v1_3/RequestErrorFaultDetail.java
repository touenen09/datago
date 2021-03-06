
package com.rightnow.ws.wsdl.v1_3;

import javax.xml.ws.WebFault;
import com.rightnow.ws.faults.v1_3.RequestErrorFaultDetailType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RequestErrorFaultDetail", targetNamespace = "urn:faults.ws.rightnow.com/v1_3")
public class RequestErrorFaultDetail
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RequestErrorFaultDetailType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RequestErrorFaultDetail(String message, RequestErrorFaultDetailType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RequestErrorFaultDetail(String message, RequestErrorFaultDetailType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.rightnow.ws.faults.v1_3.RequestErrorFaultDetailType
     */
    public RequestErrorFaultDetailType getFaultInfo() {
        return faultInfo;
    }

}
