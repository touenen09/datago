
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
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.IncidentNullFields;


/**
 * <p>Incident complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Incident">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Asset" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_3}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="BilledMinutes" type="{urn:objects.ws.rightnow.com/v1_3}TimeBilledList" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ChatQueue" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disposition" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentIncidentList" minOccurs="0"/>
 *         &lt;element name="InitialResponseDueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InitialSolutionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LastResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastSurveyScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Mailbox" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="MilestoneInstances" type="{urn:objects.ws.rightnow.com/v1_3}IncidentMilestoneInstanceList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_3}IncidentContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_3}IncidentContact" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Queue" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseEmailAddressType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ResponseInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SLAInstance" type="{urn:objects.ws.rightnow.com/v1_3}AssignedSLAInstance" minOccurs="0"/>
 *         &lt;element name="SmartSenseCustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SmartSenseStaff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Threads" type="{urn:objects.ws.rightnow.com/v1_3}ThreadList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}IncidentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incident", propOrder = {
    "asset",
    "assignedTo",
    "banner",
    "billedMinutes",
    "category",
    "channel",
    "chatQueue",
    "closedTime",
    "createdByAccount",
    "customFields",
    "disposition",
    "fileAttachments",
    "initialResponseDueTime",
    "initialSolutionTime",
    "_interface",
    "language",
    "lastResponseTime",
    "lastSurveyScore",
    "mailbox",
    "mailing",
    "milestoneInstances",
    "organization",
    "otherContacts",
    "primaryContact",
    "product",
    "queue",
    "referenceNumber",
    "resolutionInterval",
    "responseEmailAddressType",
    "responseInterval",
    "severity",
    "slaInstance",
    "smartSenseCustomer",
    "smartSenseStaff",
    "source",
    "statusWithType",
    "subject",
    "threads",
    "validNullFields"
})
public class IncidentType
    extends RNObject
{

    @XmlElementRef(name = "Asset", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> asset;
    @XmlElement(name = "AssignedTo")
    protected GroupAccountType assignedTo;
    @XmlElement(name = "Banner")
    protected BannerType banner;
    @XmlElementRef(name = "BilledMinutes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeBilledListType> billedMinutes;
    @XmlElementRef(name = "Category", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> category;
    @XmlElementRef(name = "Channel", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> channel;
    @XmlElementRef(name = "ChatQueue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> chatQueue;
    @XmlElementRef(name = "ClosedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closedTime;
    @XmlElementRef(name = "CreatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> createdByAccount;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "Disposition", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> disposition;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentIncidentListType> fileAttachments;
    @XmlElementRef(name = "InitialResponseDueTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialResponseDueTime;
    @XmlElementRef(name = "InitialSolutionTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> initialSolutionTime;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElementRef(name = "Language", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> language;
    @XmlElementRef(name = "LastResponseTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastResponseTime;
    @XmlElementRef(name = "LastSurveyScore", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lastSurveyScore;
    @XmlElementRef(name = "Mailbox", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> mailbox;
    @XmlElementRef(name = "Mailing", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> mailing;
    @XmlElementRef(name = "MilestoneInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentMilestoneInstanceListType> milestoneInstances;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "OtherContacts", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentContactListType> otherContacts;
    @XmlElement(name = "PrimaryContact")
    protected IncidentContactType primaryContact;
    @XmlElementRef(name = "Product", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> product;
    @XmlElementRef(name = "Queue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> queue;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElementRef(name = "ResolutionInterval", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> resolutionInterval;
    @XmlElement(name = "ResponseEmailAddressType")
    protected NamedID responseEmailAddressType;
    @XmlElementRef(name = "ResponseInterval", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> responseInterval;
    @XmlElementRef(name = "Severity", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> severity;
    @XmlElementRef(name = "SLAInstance", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssignedSLAInstanceType> slaInstance;
    @XmlElementRef(name = "SmartSenseCustomer", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> smartSenseCustomer;
    @XmlElementRef(name = "SmartSenseStaff", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> smartSenseStaff;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StatusWithType")
    protected StatusWithTypeType statusWithType;
    @XmlElementRef(name = "Subject", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElement(name = "Threads")
    protected ThreadListType threads;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<IncidentNullFields> validNullFields;

    /**
     * ��ȡasset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAsset() {
        return asset;
    }

    /**
     * ����asset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAsset(JAXBElement<NamedID> value) {
        this.asset = value;
    }

    /**
     * ��ȡassignedTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GroupAccountType }
     *     
     */
    public GroupAccountType getAssignedTo() {
        return assignedTo;
    }

    /**
     * ����assignedTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAccountType }
     *     
     */
    public void setAssignedTo(GroupAccountType value) {
        this.assignedTo = value;
    }

    /**
     * ��ȡbanner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BannerType }
     *     
     */
    public BannerType getBanner() {
        return banner;
    }

    /**
     * ����banner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BannerType }
     *     
     */
    public void setBanner(BannerType value) {
        this.banner = value;
    }

    /**
     * ��ȡbilledMinutes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeBilledListType }{@code >}
     *     
     */
    public JAXBElement<TimeBilledListType> getBilledMinutes() {
        return billedMinutes;
    }

    /**
     * ����billedMinutes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeBilledListType }{@code >}
     *     
     */
    public void setBilledMinutes(JAXBElement<TimeBilledListType> value) {
        this.billedMinutes = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setCategory(JAXBElement<NamedIDHierarchy> value) {
        this.category = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getChannel() {
        return channel;
    }

    /**
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setChannel(JAXBElement<NamedID> value) {
        this.channel = value;
    }

    /**
     * ��ȡchatQueue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getChatQueue() {
        return chatQueue;
    }

    /**
     * ����chatQueue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setChatQueue(JAXBElement<NamedID> value) {
        this.chatQueue = value;
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
     * ��ȡcreatedByAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCreatedByAccount() {
        return createdByAccount;
    }

    /**
     * ����createdByAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCreatedByAccount(JAXBElement<NamedID> value) {
        this.createdByAccount = value;
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
     * ��ȡdisposition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getDisposition() {
        return disposition;
    }

    /**
     * ����disposition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setDisposition(JAXBElement<NamedIDHierarchy> value) {
        this.disposition = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentIncidentListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentIncidentListType> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentIncidentListType }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentIncidentListType> value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡinitialResponseDueTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialResponseDueTime() {
        return initialResponseDueTime;
    }

    /**
     * ����initialResponseDueTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialResponseDueTime(JAXBElement<XMLGregorianCalendar> value) {
        this.initialResponseDueTime = value;
    }

    /**
     * ��ȡinitialSolutionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInitialSolutionTime() {
        return initialSolutionTime;
    }

    /**
     * ����initialSolutionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInitialSolutionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.initialSolutionTime = value;
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
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<NamedID> value) {
        this.language = value;
    }

    /**
     * ��ȡlastResponseTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastResponseTime() {
        return lastResponseTime;
    }

    /**
     * ����lastResponseTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastResponseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastResponseTime = value;
    }

    /**
     * ��ȡlastSurveyScore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastSurveyScore() {
        return lastSurveyScore;
    }

    /**
     * ����lastSurveyScore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastSurveyScore(JAXBElement<Integer> value) {
        this.lastSurveyScore = value;
    }

    /**
     * ��ȡmailbox���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getMailbox() {
        return mailbox;
    }

    /**
     * ����mailbox���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setMailbox(JAXBElement<NamedID> value) {
        this.mailbox = value;
    }

    /**
     * ��ȡmailing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getMailing() {
        return mailing;
    }

    /**
     * ����mailing���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setMailing(JAXBElement<NamedID> value) {
        this.mailing = value;
    }

    /**
     * ��ȡmilestoneInstances���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceListType }{@code >}
     *     
     */
    public JAXBElement<IncidentMilestoneInstanceListType> getMilestoneInstances() {
        return milestoneInstances;
    }

    /**
     * ����milestoneInstances���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceListType }{@code >}
     *     
     */
    public void setMilestoneInstances(JAXBElement<IncidentMilestoneInstanceListType> value) {
        this.milestoneInstances = value;
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
     *     {@link JAXBElement }{@code <}{@link IncidentContactListType }{@code >}
     *     
     */
    public JAXBElement<IncidentContactListType> getOtherContacts() {
        return otherContacts;
    }

    /**
     * ����otherContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentContactListType }{@code >}
     *     
     */
    public void setOtherContacts(JAXBElement<IncidentContactListType> value) {
        this.otherContacts = value;
    }

    /**
     * ��ȡprimaryContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IncidentContactType }
     *     
     */
    public IncidentContactType getPrimaryContact() {
        return primaryContact;
    }

    /**
     * ����primaryContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentContactType }
     *     
     */
    public void setPrimaryContact(IncidentContactType value) {
        this.primaryContact = value;
    }

    /**
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getProduct() {
        return product;
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setProduct(JAXBElement<NamedIDHierarchy> value) {
        this.product = value;
    }

    /**
     * ��ȡqueue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getQueue() {
        return queue;
    }

    /**
     * ����queue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setQueue(JAXBElement<NamedID> value) {
        this.queue = value;
    }

    /**
     * ��ȡreferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * ����referenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * ��ȡresolutionInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResolutionInterval() {
        return resolutionInterval;
    }

    /**
     * ����resolutionInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResolutionInterval(JAXBElement<Integer> value) {
        this.resolutionInterval = value;
    }

    /**
     * ��ȡresponseEmailAddressType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getResponseEmailAddressType() {
        return responseEmailAddressType;
    }

    /**
     * ����responseEmailAddressType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setResponseEmailAddressType(NamedID value) {
        this.responseEmailAddressType = value;
    }

    /**
     * ��ȡresponseInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResponseInterval() {
        return responseInterval;
    }

    /**
     * ����responseInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResponseInterval(JAXBElement<Integer> value) {
        this.responseInterval = value;
    }

    /**
     * ��ȡseverity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSeverity() {
        return severity;
    }

    /**
     * ����severity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSeverity(JAXBElement<NamedID> value) {
        this.severity = value;
    }

    /**
     * ��ȡslaInstance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstanceType }{@code >}
     *     
     */
    public JAXBElement<AssignedSLAInstanceType> getSLAInstance() {
        return slaInstance;
    }

    /**
     * ����slaInstance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstanceType }{@code >}
     *     
     */
    public void setSLAInstance(JAXBElement<AssignedSLAInstanceType> value) {
        this.slaInstance = value;
    }

    /**
     * ��ȡsmartSenseCustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSmartSenseCustomer() {
        return smartSenseCustomer;
    }

    /**
     * ����smartSenseCustomer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSmartSenseCustomer(JAXBElement<Integer> value) {
        this.smartSenseCustomer = value;
    }

    /**
     * ��ȡsmartSenseStaff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSmartSenseStaff() {
        return smartSenseStaff;
    }

    /**
     * ����smartSenseStaff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSmartSenseStaff(JAXBElement<Integer> value) {
        this.smartSenseStaff = value;
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
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * ��ȡthreads���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ThreadListType }
     *     
     */
    public ThreadListType getThreads() {
        return threads;
    }

    /**
     * ����threads���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadListType }
     *     
     */
    public void setThreads(ThreadListType value) {
        this.threads = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}
     *     
     */
    public JAXBElement<IncidentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<IncidentNullFields> value) {
        this.validNullFields = value;
    }

}
