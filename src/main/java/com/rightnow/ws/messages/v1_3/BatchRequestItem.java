
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatchRequestItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BatchRequestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreateMsg" type="{urn:messages.ws.rightnow.com/v1_3}CreateMsg"/>
 *           &lt;element name="GetMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMsg"/>
 *           &lt;element name="UpdateMsg" type="{urn:messages.ws.rightnow.com/v1_3}UpdateMsg"/>
 *           &lt;element name="DestroyMsg" type="{urn:messages.ws.rightnow.com/v1_3}DestroyMsg"/>
 *           &lt;element name="QueryCSVMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryMsg"/>
 *           &lt;element name="QueryObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryObjectsMsg"/>
 *           &lt;element name="ExecuteMarketingFlowMsg" type="{urn:messages.ws.rightnow.com/v1_3}ExecuteMarketingFlowMsg"/>
 *           &lt;element name="GetFileDataMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetFileDataMsg"/>
 *           &lt;element name="ResetContactPasswordMsg" type="{urn:messages.ws.rightnow.com/v1_3}ResetContactPasswordMsg"/>
 *           &lt;element name="SendMailingToContactMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendMailingToContactMsg"/>
 *           &lt;element name="TransferSubObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_3}TransferSubObjectsMsg"/>
 *           &lt;element name="GetMetaDataMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataMsg"/>
 *           &lt;element name="GetMetaDataForClassMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForClassMsg"/>
 *           &lt;element name="GetMetaDataForOperationMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForOperationMsg"/>
 *           &lt;element name="GetMetaDataLastChangeTimeMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataLastChangeTimeMsg"/>
 *           &lt;element name="GetPrimaryClassNamesMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetPrimaryClassNamesMsg"/>
 *           &lt;element name="GetValuesForNamedIDMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDMsg"/>
 *           &lt;element name="GetValuesForNamedIDHierarchyMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDHierarchyMsg"/>
 *           &lt;element name="RunAnalyticsReportMsg" type="{urn:messages.ws.rightnow.com/v1_3}RunAnalyticsReportMsg"/>
 *           &lt;element name="SendIncidentResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendIncidentResponseMsg"/>
 *         &lt;/choice>
 *         &lt;element name="CommitAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreserveChainID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRequestItem", propOrder = {
    "createMsg",
    "getMsg",
    "updateMsg",
    "destroyMsg",
    "queryCSVMsg",
    "queryObjectsMsg",
    "executeMarketingFlowMsg",
    "getFileDataMsg",
    "resetContactPasswordMsg",
    "sendMailingToContactMsg",
    "transferSubObjectsMsg",
    "getMetaDataMsg",
    "getMetaDataForClassMsg",
    "getMetaDataForOperationMsg",
    "getMetaDataLastChangeTimeMsg",
    "getPrimaryClassNamesMsg",
    "getValuesForNamedIDMsg",
    "getValuesForNamedIDHierarchyMsg",
    "runAnalyticsReportMsg",
    "sendIncidentResponseMsg",
    "commitAfter",
    "preserveChainID"
})
public class BatchRequestItem {

    @XmlElement(name = "CreateMsg")
    protected CreateMsg createMsg;
    @XmlElement(name = "GetMsg")
    protected GetMsg getMsg;
    @XmlElement(name = "UpdateMsg")
    protected UpdateMsg updateMsg;
    @XmlElement(name = "DestroyMsg")
    protected DestroyMsg destroyMsg;
    @XmlElement(name = "QueryCSVMsg")
    protected QueryMsg queryCSVMsg;
    @XmlElement(name = "QueryObjectsMsg")
    protected QueryObjectsMsg queryObjectsMsg;
    @XmlElement(name = "ExecuteMarketingFlowMsg")
    protected ExecuteMarketingFlowMsg executeMarketingFlowMsg;
    @XmlElement(name = "GetFileDataMsg")
    protected GetFileDataMsg getFileDataMsg;
    @XmlElement(name = "ResetContactPasswordMsg")
    protected ResetContactPasswordMsg resetContactPasswordMsg;
    @XmlElement(name = "SendMailingToContactMsg")
    protected SendMailingToContactMsg sendMailingToContactMsg;
    @XmlElement(name = "TransferSubObjectsMsg")
    protected TransferSubObjectsMsg transferSubObjectsMsg;
    @XmlElement(name = "GetMetaDataMsg")
    protected GetMetaDataMsg getMetaDataMsg;
    @XmlElement(name = "GetMetaDataForClassMsg")
    protected GetMetaDataForClassMsg getMetaDataForClassMsg;
    @XmlElement(name = "GetMetaDataForOperationMsg")
    protected GetMetaDataForOperationMsg getMetaDataForOperationMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeMsg")
    protected GetMetaDataLastChangeTimeMsg getMetaDataLastChangeTimeMsg;
    @XmlElement(name = "GetPrimaryClassNamesMsg")
    protected GetPrimaryClassNamesMsg getPrimaryClassNamesMsg;
    @XmlElement(name = "GetValuesForNamedIDMsg")
    protected GetValuesForNamedIDMsg getValuesForNamedIDMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyMsg")
    protected GetValuesForNamedIDHierarchyMsg getValuesForNamedIDHierarchyMsg;
    @XmlElement(name = "RunAnalyticsReportMsg")
    protected RunAnalyticsReportMsg runAnalyticsReportMsg;
    @XmlElement(name = "SendIncidentResponseMsg")
    protected SendIncidentResponseMsg sendIncidentResponseMsg;
    @XmlElement(name = "CommitAfter")
    protected Boolean commitAfter;
    @XmlElement(name = "PreserveChainID")
    protected Boolean preserveChainID;

    /**
     * ��ȡcreateMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreateMsg }
     *     
     */
    public CreateMsg getCreateMsg() {
        return createMsg;
    }

    /**
     * ����createMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMsg }
     *     
     */
    public void setCreateMsg(CreateMsg value) {
        this.createMsg = value;
    }

    /**
     * ��ȡgetMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMsg }
     *     
     */
    public GetMsg getGetMsg() {
        return getMsg;
    }

    /**
     * ����getMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMsg }
     *     
     */
    public void setGetMsg(GetMsg value) {
        this.getMsg = value;
    }

    /**
     * ��ȡupdateMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UpdateMsg }
     *     
     */
    public UpdateMsg getUpdateMsg() {
        return updateMsg;
    }

    /**
     * ����updateMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMsg }
     *     
     */
    public void setUpdateMsg(UpdateMsg value) {
        this.updateMsg = value;
    }

    /**
     * ��ȡdestroyMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DestroyMsg }
     *     
     */
    public DestroyMsg getDestroyMsg() {
        return destroyMsg;
    }

    /**
     * ����destroyMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyMsg }
     *     
     */
    public void setDestroyMsg(DestroyMsg value) {
        this.destroyMsg = value;
    }

    /**
     * ��ȡqueryCSVMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryMsg }
     *     
     */
    public QueryMsg getQueryCSVMsg() {
        return queryCSVMsg;
    }

    /**
     * ����queryCSVMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMsg }
     *     
     */
    public void setQueryCSVMsg(QueryMsg value) {
        this.queryCSVMsg = value;
    }

    /**
     * ��ȡqueryObjectsMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public QueryObjectsMsg getQueryObjectsMsg() {
        return queryObjectsMsg;
    }

    /**
     * ����queryObjectsMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public void setQueryObjectsMsg(QueryObjectsMsg value) {
        this.queryObjectsMsg = value;
    }

    /**
     * ��ȡexecuteMarketingFlowMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public ExecuteMarketingFlowMsg getExecuteMarketingFlowMsg() {
        return executeMarketingFlowMsg;
    }

    /**
     * ����executeMarketingFlowMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public void setExecuteMarketingFlowMsg(ExecuteMarketingFlowMsg value) {
        this.executeMarketingFlowMsg = value;
    }

    /**
     * ��ȡgetFileDataMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataMsg }
     *     
     */
    public GetFileDataMsg getGetFileDataMsg() {
        return getFileDataMsg;
    }

    /**
     * ����getFileDataMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataMsg }
     *     
     */
    public void setGetFileDataMsg(GetFileDataMsg value) {
        this.getFileDataMsg = value;
    }

    /**
     * ��ȡresetContactPasswordMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public ResetContactPasswordMsg getResetContactPasswordMsg() {
        return resetContactPasswordMsg;
    }

    /**
     * ����resetContactPasswordMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public void setResetContactPasswordMsg(ResetContactPasswordMsg value) {
        this.resetContactPasswordMsg = value;
    }

    /**
     * ��ȡsendMailingToContactMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public SendMailingToContactMsg getSendMailingToContactMsg() {
        return sendMailingToContactMsg;
    }

    /**
     * ����sendMailingToContactMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public void setSendMailingToContactMsg(SendMailingToContactMsg value) {
        this.sendMailingToContactMsg = value;
    }

    /**
     * ��ȡtransferSubObjectsMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public TransferSubObjectsMsg getTransferSubObjectsMsg() {
        return transferSubObjectsMsg;
    }

    /**
     * ����transferSubObjectsMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public void setTransferSubObjectsMsg(TransferSubObjectsMsg value) {
        this.transferSubObjectsMsg = value;
    }

    /**
     * ��ȡgetMetaDataMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public GetMetaDataMsg getGetMetaDataMsg() {
        return getMetaDataMsg;
    }

    /**
     * ����getMetaDataMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public void setGetMetaDataMsg(GetMetaDataMsg value) {
        this.getMetaDataMsg = value;
    }

    /**
     * ��ȡgetMetaDataForClassMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public GetMetaDataForClassMsg getGetMetaDataForClassMsg() {
        return getMetaDataForClassMsg;
    }

    /**
     * ����getMetaDataForClassMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public void setGetMetaDataForClassMsg(GetMetaDataForClassMsg value) {
        this.getMetaDataForClassMsg = value;
    }

    /**
     * ��ȡgetMetaDataForOperationMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForOperationMsg }
     *     
     */
    public GetMetaDataForOperationMsg getGetMetaDataForOperationMsg() {
        return getMetaDataForOperationMsg;
    }

    /**
     * ����getMetaDataForOperationMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForOperationMsg }
     *     
     */
    public void setGetMetaDataForOperationMsg(GetMetaDataForOperationMsg value) {
        this.getMetaDataForOperationMsg = value;
    }

    /**
     * ��ȡgetMetaDataLastChangeTimeMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTimeMsg() {
        return getMetaDataLastChangeTimeMsg;
    }

    /**
     * ����getMetaDataLastChangeTimeMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeMsg(GetMetaDataLastChangeTimeMsg value) {
        this.getMetaDataLastChangeTimeMsg = value;
    }

    /**
     * ��ȡgetPrimaryClassNamesMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetPrimaryClassNamesMsg }
     *     
     */
    public GetPrimaryClassNamesMsg getGetPrimaryClassNamesMsg() {
        return getPrimaryClassNamesMsg;
    }

    /**
     * ����getPrimaryClassNamesMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrimaryClassNamesMsg }
     *     
     */
    public void setGetPrimaryClassNamesMsg(GetPrimaryClassNamesMsg value) {
        this.getPrimaryClassNamesMsg = value;
    }

    /**
     * ��ȡgetValuesForNamedIDMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public GetValuesForNamedIDMsg getGetValuesForNamedIDMsg() {
        return getValuesForNamedIDMsg;
    }

    /**
     * ����getValuesForNamedIDMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public void setGetValuesForNamedIDMsg(GetValuesForNamedIDMsg value) {
        this.getValuesForNamedIDMsg = value;
    }

    /**
     * ��ȡgetValuesForNamedIDHierarchyMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchyMsg() {
        return getValuesForNamedIDHierarchyMsg;
    }

    /**
     * ����getValuesForNamedIDHierarchyMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyMsg(GetValuesForNamedIDHierarchyMsg value) {
        this.getValuesForNamedIDHierarchyMsg = value;
    }

    /**
     * ��ȡrunAnalyticsReportMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public RunAnalyticsReportMsg getRunAnalyticsReportMsg() {
        return runAnalyticsReportMsg;
    }

    /**
     * ����runAnalyticsReportMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public void setRunAnalyticsReportMsg(RunAnalyticsReportMsg value) {
        this.runAnalyticsReportMsg = value;
    }

    /**
     * ��ȡsendIncidentResponseMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SendIncidentResponseMsg }
     *     
     */
    public SendIncidentResponseMsg getSendIncidentResponseMsg() {
        return sendIncidentResponseMsg;
    }

    /**
     * ����sendIncidentResponseMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SendIncidentResponseMsg }
     *     
     */
    public void setSendIncidentResponseMsg(SendIncidentResponseMsg value) {
        this.sendIncidentResponseMsg = value;
    }

    /**
     * ��ȡcommitAfter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitAfter() {
        return commitAfter;
    }

    /**
     * ����commitAfter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitAfter(Boolean value) {
        this.commitAfter = value;
    }

    /**
     * ��ȡpreserveChainID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreserveChainID() {
        return preserveChainID;
    }

    /**
     * ����preserveChainID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveChainID(Boolean value) {
        this.preserveChainID = value;
    }

}
