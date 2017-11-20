
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.OpportunityNullFields;


/**
 * <p>Opportunity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClosedValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CostOfSale" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadRejectReason" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LostTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManagerCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagerValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_3}OpportunityContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_3}OpportunityContact" minOccurs="0"/>
 *         &lt;element name="Quotes" type="{urn:objects.ws.rightnow.com/v1_3}QuoteList" minOccurs="0"/>
 *         &lt;element name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeValue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StageWithStrategy" type="{urn:objects.ws.rightnow.com/v1_3}StageWithStrategy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survey" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TerritoryHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinLossReason" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OpportunityNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "accountHierarchy",
    "assignedToAccount",
    "banner",
    "campaign",
    "closedTime",
    "closedValue",
    "costOfSale",
    "customFields",
    "fileAttachments",
    "forecastCloseDate",
    "initialContactDate",
    "_interface",
    "leadRejectDateTime",
    "leadRejectDescription",
    "leadRejectReason",
    "lostTime",
    "managerCommit",
    "managerValue",
    "name",
    "notes",
    "organization",
    "otherContacts",
    "primaryContact",
    "quotes",
    "recallTime",
    "returnValue",
    "salesRepresentativeCommit",
    "salesRepresentativeValue",
    "source",
    "stageWithStrategy",
    "statusWithType",
    "summary",
    "survey",
    "territory",
    "territoryHierarchy",
    "winLossDescription",
    "winLossReason",
    "validNullFields"
})
public class OpportunityType
    extends RNObject
{

    @XmlElementRef(name = "AccountHierarchy", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> accountHierarchy;
    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> assignedToAccount;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BannerType> banner;
    @XmlElementRef(name = "Campaign", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> campaign;
    @XmlElementRef(name = "ClosedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closedTime;
    @XmlElementRef(name = "ClosedValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> closedValue;
    @XmlElementRef(name = "CostOfSale", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> costOfSale;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonListType> fileAttachments;
    @XmlElementRef(name = "ForecastCloseDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> forecastCloseDate;
    @XmlElementRef(name = "InitialContactDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialContactDate;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElementRef(name = "LeadRejectDateTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> leadRejectDateTime;
    @XmlElementRef(name = "LeadRejectDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadRejectDescription;
    @XmlElementRef(name = "LeadRejectReason", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> leadRejectReason;
    @XmlElementRef(name = "LostTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lostTime;
    @XmlElement(name = "ManagerCommit")
    protected Boolean managerCommit;
    @XmlElementRef(name = "ManagerValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> managerValue;
    @XmlElementRef(name = "Name", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteListType> notes;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "OtherContacts", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityContactListType> otherContacts;
    @XmlElementRef(name = "PrimaryContact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityContactType> primaryContact;
    @XmlElementRef(name = "Quotes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<QuoteListType> quotes;
    @XmlElementRef(name = "RecallTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recallTime;
    @XmlElementRef(name = "ReturnValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> returnValue;
    @XmlElement(name = "SalesRepresentativeCommit")
    protected Boolean salesRepresentativeCommit;
    @XmlElementRef(name = "SalesRepresentativeValue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> salesRepresentativeValue;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StageWithStrategy")
    protected StageWithStrategyType stageWithStrategy;
    @XmlElement(name = "StatusWithType")
    protected StatusWithTypeType statusWithType;
    @XmlElementRef(name = "Summary", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "Survey", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> survey;
    @XmlElementRef(name = "Territory", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> territory;
    @XmlElementRef(name = "TerritoryHierarchy", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> territoryHierarchy;
    @XmlElementRef(name = "WinLossDescription", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> winLossDescription;
    @XmlElementRef(name = "WinLossReason", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> winLossReason;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityNullFields> validNullFields;

    /**
     * ��ȡaccountHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * ����accountHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setAccountHierarchy(JAXBElement<NamedIDList> value) {
        this.accountHierarchy = value;
    }

    /**
     * ��ȡassignedToAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * ����assignedToAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setAssignedToAccount(JAXBElement<NamedIDHierarchy> value) {
        this.assignedToAccount = value;
    }

    /**
     * ��ȡbanner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BannerType }{@code >}
     *     
     */
    public JAXBElement<BannerType> getBanner() {
        return banner;
    }

    /**
     * ����banner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BannerType }{@code >}
     *     
     */
    public void setBanner(JAXBElement<BannerType> value) {
        this.banner = value;
    }

    /**
     * ��ȡcampaign���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCampaign() {
        return campaign;
    }

    /**
     * ����campaign���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<NamedID> value) {
        this.campaign = value;
    }

    /**
     * ��ȡclosedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getClosedTime() {
        return closedTime;
    }

    /**
     * ����closedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setClosedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.closedTime = value;
    }

    /**
     * ��ȡclosedValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getClosedValue() {
        return closedValue;
    }

    /**
     * ����closedValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setClosedValue(JAXBElement<MonetaryValueType> value) {
        this.closedValue = value;
    }

    /**
     * ��ȡcostOfSale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getCostOfSale() {
        return costOfSale;
    }

    /**
     * ����costOfSale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setCostOfSale(JAXBElement<MonetaryValueType> value) {
        this.costOfSale = value;
    }

    /**
     * ��ȡcustomFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * ����customFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonListType> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonListType> value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡforecastCloseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getForecastCloseDate() {
        return forecastCloseDate;
    }

    /**
     * ����forecastCloseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setForecastCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.forecastCloseDate = value;
    }

    /**
     * ��ȡinitialContactDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialContactDate() {
        return initialContactDate;
    }

    /**
     * ����initialContactDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialContactDate(JAXBElement<XMLGregorianCalendar> value) {
        this.initialContactDate = value;
    }

    /**
     * ��ȡinterface���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getInterface() {
        return _interface;
    }

    /**
     * ����interface���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setInterface(NamedID value) {
        this._interface = value;
    }

    /**
     * ��ȡleadRejectDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLeadRejectDateTime() {
        return leadRejectDateTime;
    }

    /**
     * ����leadRejectDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLeadRejectDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.leadRejectDateTime = value;
    }

    /**
     * ��ȡleadRejectDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeadRejectDescription() {
        return leadRejectDescription;
    }

    /**
     * ����leadRejectDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeadRejectDescription(JAXBElement<String> value) {
        this.leadRejectDescription = value;
    }

    /**
     * ��ȡleadRejectReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getLeadRejectReason() {
        return leadRejectReason;
    }

    /**
     * ����leadRejectReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setLeadRejectReason(JAXBElement<NamedID> value) {
        this.leadRejectReason = value;
    }

    /**
     * ��ȡlostTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLostTime() {
        return lostTime;
    }

    /**
     * ����lostTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLostTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lostTime = value;
    }

    /**
     * ��ȡmanagerCommit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagerCommit() {
        return managerCommit;
    }

    /**
     * ����managerCommit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerCommit(Boolean value) {
        this.managerCommit = value;
    }

    /**
     * ��ȡmanagerValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getManagerValue() {
        return managerValue;
    }

    /**
     * ����managerValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setManagerValue(JAXBElement<MonetaryValueType> value) {
        this.managerValue = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * ��ȡnotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteListType }{@code >}
     *     
     */
    public JAXBElement<NoteListType> getNotes() {
        return notes;
    }

    /**
     * ����notes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteListType }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteListType> value) {
        this.notes = value;
    }

    /**
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = value;
    }

    /**
     * ��ȡotherContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactListType }{@code >}
     *     
     */
    public JAXBElement<OpportunityContactListType> getOtherContacts() {
        return otherContacts;
    }

    /**
     * ����otherContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactListType }{@code >}
     *     
     */
    public void setOtherContacts(JAXBElement<OpportunityContactListType> value) {
        this.otherContacts = value;
    }

    /**
     * ��ȡprimaryContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactType }{@code >}
     *     
     */
    public JAXBElement<OpportunityContactType> getPrimaryContact() {
        return primaryContact;
    }

    /**
     * ����primaryContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityContactType }{@code >}
     *     
     */
    public void setPrimaryContact(JAXBElement<OpportunityContactType> value) {
        this.primaryContact = value;
    }

    /**
     * ��ȡquotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteListType }{@code >}
     *     
     */
    public JAXBElement<QuoteListType> getQuotes() {
        return quotes;
    }

    /**
     * ����quotes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteListType }{@code >}
     *     
     */
    public void setQuotes(JAXBElement<QuoteListType> value) {
        this.quotes = value;
    }

    /**
     * ��ȡrecallTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecallTime() {
        return recallTime;
    }

    /**
     * ����recallTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecallTime(JAXBElement<XMLGregorianCalendar> value) {
        this.recallTime = value;
    }

    /**
     * ��ȡreturnValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getReturnValue() {
        return returnValue;
    }

    /**
     * ����returnValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setReturnValue(JAXBElement<MonetaryValueType> value) {
        this.returnValue = value;
    }

    /**
     * ��ȡsalesRepresentativeCommit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesRepresentativeCommit() {
        return salesRepresentativeCommit;
    }

    /**
     * ����salesRepresentativeCommit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeCommit(Boolean value) {
        this.salesRepresentativeCommit = value;
    }

    /**
     * ��ȡsalesRepresentativeValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getSalesRepresentativeValue() {
        return salesRepresentativeValue;
    }

    /**
     * ����salesRepresentativeValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setSalesRepresentativeValue(JAXBElement<MonetaryValueType> value) {
        this.salesRepresentativeValue = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * ��ȡstageWithStrategy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StageWithStrategyType }
     *     
     */
    public StageWithStrategyType getStageWithStrategy() {
        return stageWithStrategy;
    }

    /**
     * ����stageWithStrategy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StageWithStrategyType }
     *     
     */
    public void setStageWithStrategy(StageWithStrategyType value) {
        this.stageWithStrategy = value;
    }

    /**
     * ��ȡstatusWithType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StatusWithTypeType }
     *     
     */
    public StatusWithTypeType getStatusWithType() {
        return statusWithType;
    }

    /**
     * ����statusWithType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StatusWithTypeType }
     *     
     */
    public void setStatusWithType(StatusWithTypeType value) {
        this.statusWithType = value;
    }

    /**
     * ��ȡsummary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * ����summary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * ��ȡsurvey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSurvey() {
        return survey;
    }

    /**
     * ����survey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSurvey(JAXBElement<NamedID> value) {
        this.survey = value;
    }

    /**
     * ��ȡterritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getTerritory() {
        return territory;
    }

    /**
     * ����territory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<NamedIDHierarchy> value) {
        this.territory = value;
    }

    /**
     * ��ȡterritoryHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getTerritoryHierarchy() {
        return territoryHierarchy;
    }

    /**
     * ����territoryHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setTerritoryHierarchy(JAXBElement<NamedIDList> value) {
        this.territoryHierarchy = value;
    }

    /**
     * ��ȡwinLossDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWinLossDescription() {
        return winLossDescription;
    }

    /**
     * ����winLossDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWinLossDescription(JAXBElement<String> value) {
        this.winLossDescription = value;
    }

    /**
     * ��ȡwinLossReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getWinLossReason() {
        return winLossReason;
    }

    /**
     * ����winLossReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setWinLossReason(JAXBElement<NamedID> value) {
        this.winLossReason = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}
     *     
     */
    public JAXBElement<OpportunityNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OpportunityNullFields> value) {
        this.validNullFields = value;
    }

}
