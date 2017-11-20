
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
import com.rightnow.ws.nullfields.v1_3.TaskNullFields;


/**
 * <p>Task complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Inherit" type="{urn:objects.ws.rightnow.com/v1_3}InheritOptions" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Priority" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}TaskServiceSettings" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_3}StatusWithType" minOccurs="0"/>
 *         &lt;element name="TaskTemplate" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="TaskType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}TaskNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "assignedToAccount",
    "completedTime",
    "contact",
    "customFields",
    "dueTime",
    "fileAttachments",
    "inherit",
    "marketingSettings",
    "name",
    "notes",
    "organization",
    "percentComplete",
    "plannedCompletionTime",
    "priority",
    "salesSettings",
    "serviceSettings",
    "startTime",
    "statusWithType",
    "taskTemplate",
    "taskType",
    "validNullFields"
})
public class TaskType
    extends RNObject
{

    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> assignedToAccount;
    @XmlElementRef(name = "CompletedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> completedTime;
    @XmlElementRef(name = "Contact", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DueTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueTime;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonListType> fileAttachments;
    @XmlElement(name = "Inherit")
    protected InheritOptionsType inherit;
    @XmlElement(name = "MarketingSettings")
    protected TaskMarketingSettingsType marketingSettings;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteListType> notes;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PercentComplete", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> percentComplete;
    @XmlElementRef(name = "PlannedCompletionTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedCompletionTime;
    @XmlElementRef(name = "Priority", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> priority;
    @XmlElement(name = "SalesSettings")
    protected TaskSalesSettingsType salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected TaskServiceSettingsType serviceSettings;
    @XmlElementRef(name = "StartTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StatusWithType")
    protected StatusWithTypeType statusWithType;
    @XmlElement(name = "TaskTemplate")
    protected NamedID taskTemplate;
    @XmlElementRef(name = "TaskType", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> taskType;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskNullFields> validNullFields;

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
     * ��ȡcompletedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCompletedTime() {
        return completedTime;
    }

    /**
     * ����completedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCompletedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.completedTime = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContact(JAXBElement<NamedID> value) {
        this.contact = value;
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
     * ��ȡdueTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueTime() {
        return dueTime;
    }

    /**
     * ����dueTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueTime(JAXBElement<XMLGregorianCalendar> value) {
        this.dueTime = value;
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
     * ��ȡinherit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InheritOptionsType }
     *     
     */
    public InheritOptionsType getInherit() {
        return inherit;
    }

    /**
     * ����inherit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InheritOptionsType }
     *     
     */
    public void setInherit(InheritOptionsType value) {
        this.inherit = value;
    }

    /**
     * ��ȡmarketingSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaskMarketingSettingsType }
     *     
     */
    public TaskMarketingSettingsType getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * ����marketingSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMarketingSettingsType }
     *     
     */
    public void setMarketingSettings(TaskMarketingSettingsType value) {
        this.marketingSettings = value;
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
     * ��ȡpercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPercentComplete() {
        return percentComplete;
    }

    /**
     * ����percentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPercentComplete(JAXBElement<Integer> value) {
        this.percentComplete = value;
    }

    /**
     * ��ȡplannedCompletionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedCompletionTime() {
        return plannedCompletionTime;
    }

    /**
     * ����plannedCompletionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedCompletionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedCompletionTime = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getPriority() {
        return priority;
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setPriority(JAXBElement<NamedID> value) {
        this.priority = value;
    }

    /**
     * ��ȡsalesSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaskSalesSettingsType }
     *     
     */
    public TaskSalesSettingsType getSalesSettings() {
        return salesSettings;
    }

    /**
     * ����salesSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSalesSettingsType }
     *     
     */
    public void setSalesSettings(TaskSalesSettingsType value) {
        this.salesSettings = value;
    }

    /**
     * ��ȡserviceSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaskServiceSettingsType }
     *     
     */
    public TaskServiceSettingsType getServiceSettings() {
        return serviceSettings;
    }

    /**
     * ����serviceSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaskServiceSettingsType }
     *     
     */
    public void setServiceSettings(TaskServiceSettingsType value) {
        this.serviceSettings = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
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
     * ��ȡtaskTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getTaskTemplate() {
        return taskTemplate;
    }

    /**
     * ����taskTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setTaskTemplate(NamedID value) {
        this.taskTemplate = value;
    }

    /**
     * ��ȡtaskType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getTaskType() {
        return taskType;
    }

    /**
     * ����taskType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setTaskType(JAXBElement<NamedID> value) {
        this.taskType = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public JAXBElement<TaskNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<TaskNullFields> value) {
        this.validNullFields = value;
    }

}
