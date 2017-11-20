
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDDeltaList;
import com.rightnow.ws.base.v1_3.NamedIDHierarchyList;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.AnswerNullFields;


/**
 * <p>Answer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccessLevels" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="AdminLastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AnswerType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedSibling" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_3}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="Categories" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="CommonAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentSharedList" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentAnswerList" minOccurs="0"/>
 *         &lt;element name="GuidedAssistance" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="LastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionInList" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Products" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedAnswers" type="{urn:objects.ws.rightnow.com/v1_3}AnswerRelatedAnswerList" minOccurs="0"/>
 *         &lt;element name="SiblingAnswers" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AnswerNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
    "accessLevels",
    "adminLastAccessTime",
    "answerType",
    "assignedSibling",
    "assignedTo",
    "banner",
    "categories",
    "commonAttachments",
    "customFields",
    "expiresDate",
    "fileAttachments",
    "guidedAssistance",
    "keywords",
    "language",
    "lastAccessTime",
    "lastNotificationTime",
    "name",
    "nextNotificationTime",
    "notes",
    "originalReferenceNumber",
    "positionInList",
    "products",
    "publishOnDate",
    "question",
    "relatedAnswers",
    "siblingAnswers",
    "solution",
    "statusWithType",
    "summary",
    "updatedByAccount",
    "url",
    "validNullFields"
})
public class AnswerType
    extends RNObject
{

    @XmlElementRef(name = "AccessLevels", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> accessLevels;
    @XmlElementRef(name = "AdminLastAccessTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> adminLastAccessTime;
    @XmlElement(name = "AnswerType")
    protected NamedID answerType;
    @XmlElementRef(name = "AssignedSibling", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> assignedSibling;
    @XmlElement(name = "AssignedTo")
    protected GroupAccountType assignedTo;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BannerType> banner;
    @XmlElementRef(name = "Categories", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> categories;
    @XmlElementRef(name = "CommonAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentSharedListType> commonAttachments;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "ExpiresDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiresDate;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentAnswerListType> fileAttachments;
    @XmlElementRef(name = "GuidedAssistance", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> guidedAssistance;
    @XmlElementRef(name = "Keywords", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElement(name = "Language")
    protected NamedID language;
    @XmlElementRef(name = "LastAccessTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAccessTime;
    @XmlElementRef(name = "LastNotificationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastNotificationTime;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "NextNotificationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextNotificationTime;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteListType> notes;
    @XmlElementRef(name = "OriginalReferenceNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalReferenceNumber;
    @XmlElement(name = "PositionInList")
    protected NamedID positionInList;
    @XmlElementRef(name = "Products", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> products;
    @XmlElementRef(name = "PublishOnDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> publishOnDate;
    @XmlElementRef(name = "Question", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> question;
    @XmlElementRef(name = "RelatedAnswers", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerRelatedAnswerListType> relatedAnswers;
    @XmlElementRef(name = "SiblingAnswers", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDList> siblingAnswers;
    @XmlElementRef(name = "Solution", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solution;
    @XmlElement(name = "StatusWithType")
    protected StatusWithTypeType statusWithType;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElementRef(name = "UpdatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> updatedByAccount;
    @XmlElementRef(name = "URL", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerNullFields> validNullFields;

    /**
     * ��ȡaccessLevels���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getAccessLevels() {
        return accessLevels;
    }

    /**
     * ����accessLevels���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setAccessLevels(JAXBElement<NamedIDDeltaList> value) {
        this.accessLevels = value;
    }

    /**
     * ��ȡadminLastAccessTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdminLastAccessTime() {
        return adminLastAccessTime;
    }

    /**
     * ����adminLastAccessTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdminLastAccessTime(JAXBElement<XMLGregorianCalendar> value) {
        this.adminLastAccessTime = value;
    }

    /**
     * ��ȡanswerType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getAnswerType() {
        return answerType;
    }

    /**
     * ����answerType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setAnswerType(NamedID value) {
        this.answerType = value;
    }

    /**
     * ��ȡassignedSibling���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAssignedSibling() {
        return assignedSibling;
    }

    /**
     * ����assignedSibling���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAssignedSibling(JAXBElement<NamedID> value) {
        this.assignedSibling = value;
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
     * ��ȡcategories���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getCategories() {
        return categories;
    }

    /**
     * ����categories���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setCategories(JAXBElement<NamedIDHierarchyList> value) {
        this.categories = value;
    }

    /**
     * ��ȡcommonAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentSharedListType> getCommonAttachments() {
        return commonAttachments;
    }

    /**
     * ����commonAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedListType }{@code >}
     *     
     */
    public void setCommonAttachments(JAXBElement<FileAttachmentSharedListType> value) {
        this.commonAttachments = value;
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
     * ��ȡexpiresDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiresDate() {
        return expiresDate;
    }

    /**
     * ����expiresDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiresDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiresDate = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentAnswerListType> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerListType }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentAnswerListType> value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡguidedAssistance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getGuidedAssistance() {
        return guidedAssistance;
    }

    /**
     * ����guidedAssistance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setGuidedAssistance(JAXBElement<NamedID> value) {
        this.guidedAssistance = value;
    }

    /**
     * ��ȡkeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * ����keywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setLanguage(NamedID value) {
        this.language = value;
    }

    /**
     * ��ȡlastAccessTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * ����lastAccessTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAccessTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAccessTime = value;
    }

    /**
     * ��ȡlastNotificationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastNotificationTime() {
        return lastNotificationTime;
    }

    /**
     * ����lastNotificationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastNotificationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastNotificationTime = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡnextNotificationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextNotificationTime() {
        return nextNotificationTime;
    }

    /**
     * ����nextNotificationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextNotificationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.nextNotificationTime = value;
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
     * ��ȡoriginalReferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    /**
     * ����originalReferenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalReferenceNumber(JAXBElement<String> value) {
        this.originalReferenceNumber = value;
    }

    /**
     * ��ȡpositionInList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getPositionInList() {
        return positionInList;
    }

    /**
     * ����positionInList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setPositionInList(NamedID value) {
        this.positionInList = value;
    }

    /**
     * ��ȡproducts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getProducts() {
        return products;
    }

    /**
     * ����products���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setProducts(JAXBElement<NamedIDHierarchyList> value) {
        this.products = value;
    }

    /**
     * ��ȡpublishOnDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPublishOnDate() {
        return publishOnDate;
    }

    /**
     * ����publishOnDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPublishOnDate(JAXBElement<XMLGregorianCalendar> value) {
        this.publishOnDate = value;
    }

    /**
     * ��ȡquestion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestion() {
        return question;
    }

    /**
     * ����question���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestion(JAXBElement<String> value) {
        this.question = value;
    }

    /**
     * ��ȡrelatedAnswers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerListType }{@code >}
     *     
     */
    public JAXBElement<AnswerRelatedAnswerListType> getRelatedAnswers() {
        return relatedAnswers;
    }

    /**
     * ����relatedAnswers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerListType }{@code >}
     *     
     */
    public void setRelatedAnswers(JAXBElement<AnswerRelatedAnswerListType> value) {
        this.relatedAnswers = value;
    }

    /**
     * ��ȡsiblingAnswers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public JAXBElement<NamedIDList> getSiblingAnswers() {
        return siblingAnswers;
    }

    /**
     * ����siblingAnswers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}
     *     
     */
    public void setSiblingAnswers(JAXBElement<NamedIDList> value) {
        this.siblingAnswers = value;
    }

    /**
     * ��ȡsolution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolution() {
        return solution;
    }

    /**
     * ����solution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolution(JAXBElement<String> value) {
        this.solution = value;
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
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * ����summary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * ��ȡupdatedByAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getUpdatedByAccount() {
        return updatedByAccount;
    }

    /**
     * ����updatedByAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setUpdatedByAccount(JAXBElement<NamedID> value) {
        this.updatedByAccount = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}
     *     
     */
    public JAXBElement<AnswerNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AnswerNullFields> value) {
        this.validNullFields = value;
    }

}
