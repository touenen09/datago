
package com.rightnow.ws.wsdl.v1_3;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.rightnow.ws.objects.AnalyticsReportType;
import com.rightnow.ws.objects.IncidentResponseType;
import com.rightnow.ws.objects.IncidentType;
import com.rightnow.ws.base.v1_3.ID;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDWithParent;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.RNObjectType;
import com.rightnow.ws.messages.v1_3.BatchRequestItem;
import com.rightnow.ws.messages.v1_3.BatchResponseItem;
import com.rightnow.ws.messages.v1_3.CSVTableSet;
import com.rightnow.ws.messages.v1_3.ClientInfoHeader;
import com.rightnow.ws.messages.v1_3.CreateProcessingOptions;
import com.rightnow.ws.messages.v1_3.DestroyProcessingOptions;
import com.rightnow.ws.messages.v1_3.GetProcessingOptions;
import com.rightnow.ws.messages.v1_3.QueryResultData;
import com.rightnow.ws.messages.v1_3.RNObjectsResult;
import com.rightnow.ws.messages.v1_3.SubscribableObject;
import com.rightnow.ws.messages.v1_3.UpdateProcessingOptions;
import com.rightnow.ws.metadata.v1_3.MetaDataClass;
import com.rightnow.ws.metadata.v1_3.MetaDataClassOperation;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RightNowSyncPort", targetNamespace = "urn:wsdl.ws.rightnow.com/v1_3")
@XmlSeeAlso({
    com.rightnow.ws.objects.ObjectFactory.class,
    com.rightnow.ws.base.v1_3.ObjectFactory.class,
    com.rightnow.ws.faults.v1_3.ObjectFactory.class,
    com.rightnow.ws.generic.v1_3.ObjectFactory.class,
    com.rightnow.ws.messages.v1_3.ObjectFactory.class,
    com.rightnow.ws.metadata.v1_3.ObjectFactory.class,
    com.rightnow.ws.nullfields.v1_3.ObjectFactory.class
})
public interface RightNowSyncPort {


    /**
     * 
     * @param requestHeader
     * @param incidentResponse
     * @return
     *     returns com.rightnow.ws.objects.IncidentType
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "SendIncidentResponse", action = "SendIncidentResponse")
    @WebResult(name = "Incident", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "SendIncidentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.SendIncidentResponseMsg")
    @ResponseWrapper(localName = "SendIncidentResponseResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.SendIncidentResponseResponseMsg")
    public IncidentType sendIncidentResponse(
        @WebParam(name = "IncidentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        IncidentResponseType incidentResponse,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param processingOptions
     * @param requestHeader
     * @param rnObjects
     * @return
     *     returns com.rightnow.ws.messages.v1_3.RNObjectsResult
     * @throws RequestErrorFaultDetail
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "Create", action = "Create")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.CreateMsg")
    @ResponseWrapper(localName = "CreateResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.CreateResponseMsg")
    public RNObjectsResult create(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        CreateProcessingOptions processingOptions,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param processingOptions
     * @param requestHeader
     * @param rnObjects
     * @return
     *     returns com.rightnow.ws.messages.v1_3.RNObjectsResult
     * @throws RequestErrorFaultDetail
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "Get", action = "Get")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "Get", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMsg")
    @ResponseWrapper(localName = "GetResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetResponseMsg")
    public RNObjectsResult get(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        GetProcessingOptions processingOptions,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param processingOptions
     * @param requestHeader
     * @param rnObjects
     * @throws RequestErrorFaultDetail
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "Update", action = "Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.UpdateMsg")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.UpdateResponseMsg")
    public void update(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        UpdateProcessingOptions processingOptions,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param processingOptions
     * @param requestHeader
     * @param rnObjects
     * @throws RequestErrorFaultDetail
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "Destroy", action = "Destroy")
    @RequestWrapper(localName = "Destroy", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.DestroyMsg")
    @ResponseWrapper(localName = "DestroyResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.DestroyResponseMsg")
    public void destroy(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        DestroyProcessingOptions processingOptions,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param returnRawResult
     * @param delimiter
     * @param query
     * @param fileData
     * @param pageSize
     * @param requestHeader
     * @param disableMTOM
     * @param csvTableSet
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "QueryCSV", action = "QueryCSV")
    @RequestWrapper(localName = "QueryCSV", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.QueryMsg")
    @ResponseWrapper(localName = "QueryCSVResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.QueryCSVResponseMsg")
    public void queryCSV(
        @WebParam(name = "Query", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String query,
        @WebParam(name = "PageSize", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Integer pageSize,
        @WebParam(name = "Delimiter", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String delimiter,
        @WebParam(name = "ReturnRawResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Boolean returnRawResult,
        @WebParam(name = "DisableMTOM", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Boolean disableMTOM,
        @WebParam(name = "CSVTableSet", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", mode = WebParam.Mode.OUT)
        Holder<CSVTableSet> csvTableSet,
        @WebParam(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", mode = WebParam.Mode.OUT)
        Holder<byte[]> fileData,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param objectTemplates
     * @param query
     * @param pageSize
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.messages.v1_3.QueryResultData>
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "QueryObjects", action = "QueryObjects")
    @WebResult(name = "Result", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "QueryObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.QueryObjectsMsg")
    @ResponseWrapper(localName = "QueryObjectsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.QueryObjectsResponseMsg")
    public List<QueryResultData> queryObjects(
        @WebParam(name = "Query", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String query,
        @WebParam(name = "ObjectTemplates", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> objectTemplates,
        @WebParam(name = "PageSize", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Integer pageSize,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param analyticsReport
     * @param returnRawResult
     * @param delimiter
     * @param fileData
     * @param limit
     * @param start
     * @param requestHeader
     * @param disableMTOM
     * @param csvTableSet
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "RunAnalyticsReport", action = "RunAnalyticsReport")
    @RequestWrapper(localName = "RunAnalyticsReport", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.RunAnalyticsReportMsg")
    @ResponseWrapper(localName = "RunAnalyticsReportResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.RunAnalyticsReportResponseMsg")
    public void runAnalyticsReport(
        @WebParam(name = "AnalyticsReport", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        AnalyticsReportType analyticsReport,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Integer limit,
        @WebParam(name = "Start", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Integer start,
        @WebParam(name = "Delimiter", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String delimiter,
        @WebParam(name = "ReturnRawResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Boolean returnRawResult,
        @WebParam(name = "DisableMTOM", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Boolean disableMTOM,
        @WebParam(name = "CSVTableSet", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", mode = WebParam.Mode.OUT)
        Holder<CSVTableSet> csvTableSet,
        @WebParam(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", mode = WebParam.Mode.OUT)
        Holder<byte[]> fileData,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param contactID
     * @param campaignID
     * @param requestHeader
     * @param entryPoint
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "ExecuteMarketingFlow", action = "ExecuteMarketingFlow")
    @RequestWrapper(localName = "ExecuteMarketingFlow", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ExecuteMarketingFlowMsg")
    @ResponseWrapper(localName = "ExecuteMarketingFlowResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ExecuteMarketingFlowResponseMsg")
    public void executeMarketingFlow(
        @WebParam(name = "ContactID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID contactID,
        @WebParam(name = "CampaignID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID campaignID,
        @WebParam(name = "EntryPoint", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String entryPoint,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param rnObject
     * @param requestHeader
     * @param disableMTOM
     * @param fileID
     * @return
     *     returns byte[]
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetFileData", action = "GetFileData")
    @WebResult(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetFileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetFileDataMsg")
    @ResponseWrapper(localName = "GetFileDataResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetFileDataResponseMsg")
    public byte[] getFileData(
        @WebParam(name = "RNObject", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        RNObject rnObject,
        @WebParam(name = "FileID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID fileID,
        @WebParam(name = "DisableMTOM", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        Boolean disableMTOM,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param contactID
     * @param requestHeader
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "ResetContactPassword", action = "ResetContactPassword")
    @RequestWrapper(localName = "ResetContactPassword", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ResetContactPasswordMsg")
    @ResponseWrapper(localName = "ResetContactPasswordResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ResetContactPasswordResponseMsg")
    public void resetContactPassword(
        @WebParam(name = "ContactID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID contactID,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param opportunityID
     * @param scheduledTime
     * @param chatID
     * @param contactID
     * @param requestHeader
     * @param mailingID
     * @param incidentID
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "SendMailingToContact", action = "SendMailingToContact")
    @RequestWrapper(localName = "SendMailingToContact", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.SendMailingToContactMsg")
    @ResponseWrapper(localName = "SendMailingToContactResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.SendMailingToContactResponseMsg")
    public void sendMailingToContact(
        @WebParam(name = "ContactID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID contactID,
        @WebParam(name = "MailingID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID mailingID,
        @WebParam(name = "ScheduledTime", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        XMLGregorianCalendar scheduledTime,
        @WebParam(name = "IncidentID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID incidentID,
        @WebParam(name = "OpportunityID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID opportunityID,
        @WebParam(name = "ChatID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        ID chatID,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param destinationRNObject
     * @param sourceRNObjects
     * @param requestHeader
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "TransferSubObjects", action = "TransferSubObjects")
    @RequestWrapper(localName = "TransferSubObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.TransferSubObjectsMsg")
    @ResponseWrapper(localName = "TransferSubObjectsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.TransferSubObjectsResponseMsg")
    public void transferSubObjects(
        @WebParam(name = "DestinationRNObject", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        RNObject destinationRNObject,
        @WebParam(name = "SourceRNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> sourceRNObjects,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.messages.v1_3.SubscribableObject>
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "GetSubscribableObjects", action = "GetSubscribableObjects")
    @WebResult(name = "SubscribableObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetSubscribableObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetSubscribableObjectsMsg")
    @ResponseWrapper(localName = "GetSubscribableObjectsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetSubscribableObjectsResponseMsg")
    public List<SubscribableObject> getSubscribableObjects(
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param batchRequestItem
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.messages.v1_3.BatchResponseItem>
     * @throws RequestErrorFaultDetail
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "Batch", action = "Batch")
    @WebResult(name = "BatchResponseItem", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "Batch", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.BatchMsg")
    @ResponseWrapper(localName = "BatchResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.BatchResponseMsg")
    public List<BatchResponseItem> batch(
        @WebParam(name = "BatchRequestItem", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<BatchRequestItem> batchRequestItem,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @param rnObjects
     * @return
     *     returns com.rightnow.ws.messages.v1_3.RNObjectsResult
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "ConvertGenericToObject", action = "ConvertGenericToObject")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "ConvertGenericToObject", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ConvertObjectMsg")
    @ResponseWrapper(localName = "ConvertGenericToObjectResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ConvertObjectResponseMsg")
    public RNObjectsResult convertGenericToObject(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @param rnObjects
     * @return
     *     returns com.rightnow.ws.messages.v1_3.RNObjectsResult
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "ConvertObjectToGeneric", action = "ConvertObjectToGeneric")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "ConvertObjectToGeneric", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ConvertObjectMsg")
    @ResponseWrapper(localName = "ConvertObjectToGenericResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.ConvertObjectResponseMsg")
    public RNObjectsResult convertObjectToGeneric(
        @WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObject> rnObjects,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.metadata.v1_3.MetaDataClass>
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "GetMetaData", action = "GetMetaData")
    @WebResult(name = "MetaDataClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetMetaData", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataMsg")
    @ResponseWrapper(localName = "GetMetaDataResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataResponseMsg")
    public List<MetaDataClass> getMetaData(
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param metaDataLink
     * @param className
     * @param requestHeader
     * @param qualifiedClassName
     * @return
     *     returns java.util.List<com.rightnow.ws.metadata.v1_3.MetaDataClass>
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetMetaDataForClass", action = "GetMetaDataForClass")
    @WebResult(name = "MetaDataClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetMetaDataForClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataForClassMsg")
    @ResponseWrapper(localName = "GetMetaDataForClassResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataForClassResponseMsg")
    public List<MetaDataClass> getMetaDataForClass(
        @WebParam(name = "ClassName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<String> className,
        @WebParam(name = "QualifiedClassName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObjectType> qualifiedClassName,
        @WebParam(name = "MetaDataLink", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<String> metaDataLink,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param className
     * @param requestHeader
     * @param qualifiedClassName
     * @param operation
     * @return
     *     returns java.util.List<com.rightnow.ws.metadata.v1_3.MetaDataClassOperation>
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetMetaDataForOperation", action = "GetMetaDataForOperation")
    @WebResult(name = "MetaDataClassOperation", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetMetaDataForOperation", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataForOperationMsg")
    @ResponseWrapper(localName = "GetMetaDataForOperationResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataForOperationResponseMsg")
    public List<MetaDataClassOperation> getMetaDataForOperation(
        @WebParam(name = "Operation", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<String> operation,
        @WebParam(name = "ClassName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<String> className,
        @WebParam(name = "QualifiedClassName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        List<RNObjectType> qualifiedClassName,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetMetaDataLastChangeTime", action = "GetMetaDataLastChangeTime")
    @WebResult(name = "LastChangeDateTime", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetMetaDataLastChangeTime", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataLastChangeTimeMsg")
    @ResponseWrapper(localName = "GetMetaDataLastChangeTimeResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetMetaDataLastChangeTimeResponseMsg")
    public XMLGregorianCalendar getMetaDataLastChangeTime(
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.generic.v1_3.RNObjectType>
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetPrimaryClassNames", action = "GetPrimaryClassNames")
    @WebResult(name = "PrimaryClassName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetPrimaryClassNames", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetPrimaryClassNamesMsg")
    @ResponseWrapper(localName = "GetPrimaryClassNamesResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetPrimaryClassNamesResponseMsg")
    public List<RNObjectType> getPrimaryClassNames(
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param fieldName
     * @param requestHeader
     * @param packageName
     * @return
     *     returns java.util.List<com.rightnow.ws.base.v1_3.NamedID>
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetValuesForNamedID", action = "GetValuesForNamedID")
    @WebResult(name = "Entry", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetValuesForNamedID", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetValuesForNamedIDMsg")
    @ResponseWrapper(localName = "GetValuesForNamedIDResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetValuesForNamedIDResponseMsg")
    public List<NamedID> getValuesForNamedID(
        @WebParam(name = "PackageName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String packageName,
        @WebParam(name = "FieldName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String fieldName,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param fieldName
     * @param requestHeader
     * @return
     *     returns java.util.List<com.rightnow.ws.base.v1_3.NamedIDWithParent>
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "GetValuesForNamedIDHierarchy", action = "GetValuesForNamedIDHierarchy")
    @WebResult(name = "Entry", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
    @RequestWrapper(localName = "GetValuesForNamedIDHierarchy", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetValuesForNamedIDHierarchyMsg")
    @ResponseWrapper(localName = "GetValuesForNamedIDHierarchyResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", className = "com.rightnow.ws.messages.v1_3.GetValuesForNamedIDHierarchyResponseMsg")
    public List<NamedIDWithParent> getValuesForNamedIDHierarchy(
        @WebParam(name = "FieldName", targetNamespace = "urn:messages.ws.rightnow.com/v1_3")
        String fieldName,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1_3", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

}
