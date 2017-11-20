
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.faults.v1_3.RequestErrorFaultDetailType;
import com.rightnow.ws.faults.v1_3.RequestErrorFaultType;
import com.rightnow.ws.faults.v1_3.ServerErrorFaultType;
import com.rightnow.ws.faults.v1_3.UnexpectedErrorFaultType;


/**
 * <p>BatchResponseItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BatchResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}CreateResponseMsg"/>
 *         &lt;element name="GetResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetResponseMsg"/>
 *         &lt;element name="UpdateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}UpdateResponseMsg"/>
 *         &lt;element name="DestroyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}DestroyResponseMsg"/>
 *         &lt;element name="QueryCSVResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryCSVResponseMsg"/>
 *         &lt;element name="QueryObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryObjectsResponseMsg"/>
 *         &lt;element name="ExecuteMarketingFlowResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}ExecuteMarketingFlowResponseMsg"/>
 *         &lt;element name="GetFileDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetFileDataResponseMsg"/>
 *         &lt;element name="ResetContactPasswordResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}ResetContactPasswordResponseMsg"/>
 *         &lt;element name="SendMailingToContactResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendMailingToContactResponseMsg"/>
 *         &lt;element name="GetMetaDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataResponseMsg"/>
 *         &lt;element name="TransferSubObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}TransferSubObjectsResponseMsg"/>
 *         &lt;element name="GetMetaDataForClassResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForClassResponseMsg"/>
 *         &lt;element name="GetMetaDataForOperationResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForOperationResponseMsg"/>
 *         &lt;element name="GetMetaDataLastChangeTimeResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataLastChangeTimeResponseMsg"/>
 *         &lt;element name="GetPrimaryClassNamesResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetPrimaryClassNamesResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDHierarchyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDHierarchyResponseMsg"/>
 *         &lt;element name="RunAnalyticsReportResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}RunAnalyticsReportResponseMsg"/>
 *         &lt;element name="SendIncidentResponseResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendIncidentResponseResponseMsg"/>
 *         &lt;element name="RequestErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}RequestErrorFaultType"/>
 *         &lt;element name="RequestErrorFaultDetail" type="{urn:faults.ws.rightnow.com/v1_3}RequestErrorFaultDetailType"/>
 *         &lt;element name="ServerErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}ServerErrorFaultType"/>
 *         &lt;element name="UnexpectedErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}UnexpectedErrorFaultType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponseItem", propOrder = {
    "createResponseMsg",
    "getResponseMsg",
    "updateResponseMsg",
    "destroyResponseMsg",
    "queryCSVResponseMsg",
    "queryObjectsResponseMsg",
    "executeMarketingFlowResponseMsg",
    "getFileDataResponseMsg",
    "resetContactPasswordResponseMsg",
    "sendMailingToContactResponseMsg",
    "getMetaDataResponseMsg",
    "transferSubObjectsResponseMsg",
    "getMetaDataForClassResponseMsg",
    "getMetaDataForOperationResponseMsg",
    "getMetaDataLastChangeTimeResponseMsg",
    "getPrimaryClassNamesResponseMsg",
    "getValuesForNamedIDResponseMsg",
    "getValuesForNamedIDHierarchyResponseMsg",
    "runAnalyticsReportResponseMsg",
    "sendIncidentResponseResponseMsg",
    "requestErrorFault",
    "requestErrorFaultDetail",
    "serverErrorFault",
    "unexpectedErrorFault"
})
public class BatchResponseItem {

    @XmlElement(name = "CreateResponseMsg")
    protected CreateResponseMsg createResponseMsg;
    @XmlElement(name = "GetResponseMsg")
    protected GetResponseMsg getResponseMsg;
    @XmlElement(name = "UpdateResponseMsg")
    protected UpdateResponseMsg updateResponseMsg;
    @XmlElement(name = "DestroyResponseMsg")
    protected DestroyResponseMsg destroyResponseMsg;
    @XmlElement(name = "QueryCSVResponseMsg")
    protected QueryCSVResponseMsg queryCSVResponseMsg;
    @XmlElement(name = "QueryObjectsResponseMsg")
    protected QueryObjectsResponseMsg queryObjectsResponseMsg;
    @XmlElement(name = "ExecuteMarketingFlowResponseMsg")
    protected ExecuteMarketingFlowResponseMsg executeMarketingFlowResponseMsg;
    @XmlElement(name = "GetFileDataResponseMsg")
    protected GetFileDataResponseMsg getFileDataResponseMsg;
    @XmlElement(name = "ResetContactPasswordResponseMsg")
    protected ResetContactPasswordResponseMsg resetContactPasswordResponseMsg;
    @XmlElement(name = "SendMailingToContactResponseMsg")
    protected SendMailingToContactResponseMsg sendMailingToContactResponseMsg;
    @XmlElement(name = "GetMetaDataResponseMsg")
    protected GetMetaDataResponseMsg getMetaDataResponseMsg;
    @XmlElement(name = "TransferSubObjectsResponseMsg")
    protected TransferSubObjectsResponseMsg transferSubObjectsResponseMsg;
    @XmlElement(name = "GetMetaDataForClassResponseMsg")
    protected GetMetaDataForClassResponseMsg getMetaDataForClassResponseMsg;
    @XmlElement(name = "GetMetaDataForOperationResponseMsg")
    protected GetMetaDataForOperationResponseMsg getMetaDataForOperationResponseMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeResponseMsg")
    protected GetMetaDataLastChangeTimeResponseMsg getMetaDataLastChangeTimeResponseMsg;
    @XmlElement(name = "GetPrimaryClassNamesResponseMsg")
    protected GetPrimaryClassNamesResponseMsg getPrimaryClassNamesResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDResponseMsg")
    protected GetValuesForNamedIDResponseMsg getValuesForNamedIDResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyResponseMsg")
    protected GetValuesForNamedIDHierarchyResponseMsg getValuesForNamedIDHierarchyResponseMsg;
    @XmlElement(name = "RunAnalyticsReportResponseMsg")
    protected RunAnalyticsReportResponseMsg runAnalyticsReportResponseMsg;
    @XmlElement(name = "SendIncidentResponseResponseMsg")
    protected SendIncidentResponseResponseMsg sendIncidentResponseResponseMsg;
    @XmlElement(name = "RequestErrorFault")
    protected RequestErrorFaultType requestErrorFault;
    @XmlElement(name = "RequestErrorFaultDetail")
    protected RequestErrorFaultDetailType requestErrorFaultDetail;
    @XmlElement(name = "ServerErrorFault")
    protected ServerErrorFaultType serverErrorFault;
    @XmlElement(name = "UnexpectedErrorFault")
    protected UnexpectedErrorFaultType unexpectedErrorFault;

    /**
     * ��ȡcreateResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreateResponseMsg }
     *     
     */
    public CreateResponseMsg getCreateResponseMsg() {
        return createResponseMsg;
    }

    /**
     * ����createResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreateResponseMsg }
     *     
     */
    public void setCreateResponseMsg(CreateResponseMsg value) {
        this.createResponseMsg = value;
    }

    /**
     * ��ȡgetResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetResponseMsg }
     *     
     */
    public GetResponseMsg getGetResponseMsg() {
        return getResponseMsg;
    }

    /**
     * ����getResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseMsg }
     *     
     */
    public void setGetResponseMsg(GetResponseMsg value) {
        this.getResponseMsg = value;
    }

    /**
     * ��ȡupdateResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public UpdateResponseMsg getUpdateResponseMsg() {
        return updateResponseMsg;
    }

    /**
     * ����updateResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public void setUpdateResponseMsg(UpdateResponseMsg value) {
        this.updateResponseMsg = value;
    }

    /**
     * ��ȡdestroyResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public DestroyResponseMsg getDestroyResponseMsg() {
        return destroyResponseMsg;
    }

    /**
     * ����destroyResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public void setDestroyResponseMsg(DestroyResponseMsg value) {
        this.destroyResponseMsg = value;
    }

    /**
     * ��ȡqueryCSVResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public QueryCSVResponseMsg getQueryCSVResponseMsg() {
        return queryCSVResponseMsg;
    }

    /**
     * ����queryCSVResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public void setQueryCSVResponseMsg(QueryCSVResponseMsg value) {
        this.queryCSVResponseMsg = value;
    }

    /**
     * ��ȡqueryObjectsResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public QueryObjectsResponseMsg getQueryObjectsResponseMsg() {
        return queryObjectsResponseMsg;
    }

    /**
     * ����queryObjectsResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public void setQueryObjectsResponseMsg(QueryObjectsResponseMsg value) {
        this.queryObjectsResponseMsg = value;
    }

    /**
     * ��ȡexecuteMarketingFlowResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public ExecuteMarketingFlowResponseMsg getExecuteMarketingFlowResponseMsg() {
        return executeMarketingFlowResponseMsg;
    }

    /**
     * ����executeMarketingFlowResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public void setExecuteMarketingFlowResponseMsg(ExecuteMarketingFlowResponseMsg value) {
        this.executeMarketingFlowResponseMsg = value;
    }

    /**
     * ��ȡgetFileDataResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public GetFileDataResponseMsg getGetFileDataResponseMsg() {
        return getFileDataResponseMsg;
    }

    /**
     * ����getFileDataResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public void setGetFileDataResponseMsg(GetFileDataResponseMsg value) {
        this.getFileDataResponseMsg = value;
    }

    /**
     * ��ȡresetContactPasswordResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public ResetContactPasswordResponseMsg getResetContactPasswordResponseMsg() {
        return resetContactPasswordResponseMsg;
    }

    /**
     * ����resetContactPasswordResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public void setResetContactPasswordResponseMsg(ResetContactPasswordResponseMsg value) {
        this.resetContactPasswordResponseMsg = value;
    }

    /**
     * ��ȡsendMailingToContactResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public SendMailingToContactResponseMsg getSendMailingToContactResponseMsg() {
        return sendMailingToContactResponseMsg;
    }

    /**
     * ����sendMailingToContactResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public void setSendMailingToContactResponseMsg(SendMailingToContactResponseMsg value) {
        this.sendMailingToContactResponseMsg = value;
    }

    /**
     * ��ȡgetMetaDataResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public GetMetaDataResponseMsg getGetMetaDataResponseMsg() {
        return getMetaDataResponseMsg;
    }

    /**
     * ����getMetaDataResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public void setGetMetaDataResponseMsg(GetMetaDataResponseMsg value) {
        this.getMetaDataResponseMsg = value;
    }

    /**
     * ��ȡtransferSubObjectsResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public TransferSubObjectsResponseMsg getTransferSubObjectsResponseMsg() {
        return transferSubObjectsResponseMsg;
    }

    /**
     * ����transferSubObjectsResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public void setTransferSubObjectsResponseMsg(TransferSubObjectsResponseMsg value) {
        this.transferSubObjectsResponseMsg = value;
    }

    /**
     * ��ȡgetMetaDataForClassResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public GetMetaDataForClassResponseMsg getGetMetaDataForClassResponseMsg() {
        return getMetaDataForClassResponseMsg;
    }

    /**
     * ����getMetaDataForClassResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public void setGetMetaDataForClassResponseMsg(GetMetaDataForClassResponseMsg value) {
        this.getMetaDataForClassResponseMsg = value;
    }

    /**
     * ��ȡgetMetaDataForOperationResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForOperationResponseMsg }
     *     
     */
    public GetMetaDataForOperationResponseMsg getGetMetaDataForOperationResponseMsg() {
        return getMetaDataForOperationResponseMsg;
    }

    /**
     * ����getMetaDataForOperationResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForOperationResponseMsg }
     *     
     */
    public void setGetMetaDataForOperationResponseMsg(GetMetaDataForOperationResponseMsg value) {
        this.getMetaDataForOperationResponseMsg = value;
    }

    /**
     * ��ȡgetMetaDataLastChangeTimeResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTimeResponseMsg() {
        return getMetaDataLastChangeTimeResponseMsg;
    }

    /**
     * ����getMetaDataLastChangeTimeResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeResponseMsg(GetMetaDataLastChangeTimeResponseMsg value) {
        this.getMetaDataLastChangeTimeResponseMsg = value;
    }

    /**
     * ��ȡgetPrimaryClassNamesResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetPrimaryClassNamesResponseMsg }
     *     
     */
    public GetPrimaryClassNamesResponseMsg getGetPrimaryClassNamesResponseMsg() {
        return getPrimaryClassNamesResponseMsg;
    }

    /**
     * ����getPrimaryClassNamesResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrimaryClassNamesResponseMsg }
     *     
     */
    public void setGetPrimaryClassNamesResponseMsg(GetPrimaryClassNamesResponseMsg value) {
        this.getPrimaryClassNamesResponseMsg = value;
    }

    /**
     * ��ȡgetValuesForNamedIDResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public GetValuesForNamedIDResponseMsg getGetValuesForNamedIDResponseMsg() {
        return getValuesForNamedIDResponseMsg;
    }

    /**
     * ����getValuesForNamedIDResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDResponseMsg(GetValuesForNamedIDResponseMsg value) {
        this.getValuesForNamedIDResponseMsg = value;
    }

    /**
     * ��ȡgetValuesForNamedIDHierarchyResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchyResponseMsg() {
        return getValuesForNamedIDHierarchyResponseMsg;
    }

    /**
     * ����getValuesForNamedIDHierarchyResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyResponseMsg(GetValuesForNamedIDHierarchyResponseMsg value) {
        this.getValuesForNamedIDHierarchyResponseMsg = value;
    }

    /**
     * ��ȡrunAnalyticsReportResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public RunAnalyticsReportResponseMsg getRunAnalyticsReportResponseMsg() {
        return runAnalyticsReportResponseMsg;
    }

    /**
     * ����runAnalyticsReportResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public void setRunAnalyticsReportResponseMsg(RunAnalyticsReportResponseMsg value) {
        this.runAnalyticsReportResponseMsg = value;
    }

    /**
     * ��ȡsendIncidentResponseResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendIncidentResponseResponseMsg }
     *     
     */
    public SendIncidentResponseResponseMsg getSendIncidentResponseResponseMsg() {
        return sendIncidentResponseResponseMsg;
    }

    /**
     * ����sendIncidentResponseResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendIncidentResponseResponseMsg }
     *     
     */
    public void setSendIncidentResponseResponseMsg(SendIncidentResponseResponseMsg value) {
        this.sendIncidentResponseResponseMsg = value;
    }

    /**
     * ��ȡrequestErrorFault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public RequestErrorFaultType getRequestErrorFault() {
        return requestErrorFault;
    }

    /**
     * ����requestErrorFault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public void setRequestErrorFault(RequestErrorFaultType value) {
        this.requestErrorFault = value;
    }

    /**
     * ��ȡrequestErrorFaultDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorFaultDetailType }
     *     
     */
    public RequestErrorFaultDetailType getRequestErrorFaultDetail() {
        return requestErrorFaultDetail;
    }

    /**
     * ����requestErrorFaultDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorFaultDetailType }
     *     
     */
    public void setRequestErrorFaultDetail(RequestErrorFaultDetailType value) {
        this.requestErrorFaultDetail = value;
    }

    /**
     * ��ȡserverErrorFault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public ServerErrorFaultType getServerErrorFault() {
        return serverErrorFault;
    }

    /**
     * ����serverErrorFault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public void setServerErrorFault(ServerErrorFaultType value) {
        this.serverErrorFault = value;
    }

    /**
     * ��ȡunexpectedErrorFault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public UnexpectedErrorFaultType getUnexpectedErrorFault() {
        return unexpectedErrorFault;
    }

    /**
     * ����unexpectedErrorFault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public void setUnexpectedErrorFault(UnexpectedErrorFaultType value) {
        this.unexpectedErrorFault = value;
    }

}
