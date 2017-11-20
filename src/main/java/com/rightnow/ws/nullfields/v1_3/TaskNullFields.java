
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaskNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="DueTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TaskType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskNullFields")
public class TaskNullFields {

    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "CompletedTime")
    protected Boolean completedTime;
    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "DueTime")
    protected Boolean dueTime;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "PercentComplete")
    protected Boolean percentComplete;
    @XmlAttribute(name = "PlannedCompletionTime")
    protected Boolean plannedCompletionTime;
    @XmlAttribute(name = "Priority")
    protected Boolean priority;
    @XmlAttribute(name = "StartTime")
    protected Boolean startTime;
    @XmlAttribute(name = "TaskType")
    protected Boolean taskType;

    /**
     * ��ȡassignedToAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedToAccount() {
        if (assignedToAccount == null) {
            return false;
        } else {
            return assignedToAccount;
        }
    }

    /**
     * ����assignedToAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedToAccount(Boolean value) {
        this.assignedToAccount = value;
    }

    /**
     * ��ȡcompletedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompletedTime() {
        if (completedTime == null) {
            return false;
        } else {
            return completedTime;
        }
    }

    /**
     * ����completedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletedTime(Boolean value) {
        this.completedTime = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContact() {
        if (contact == null) {
            return false;
        } else {
            return contact;
        }
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * ��ȡdueTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDueTime() {
        if (dueTime == null) {
            return false;
        } else {
            return dueTime;
        }
    }

    /**
     * ����dueTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDueTime(Boolean value) {
        this.dueTime = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡnotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * ����notes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * ��ȡpercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPercentComplete() {
        if (percentComplete == null) {
            return false;
        } else {
            return percentComplete;
        }
    }

    /**
     * ����percentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentComplete(Boolean value) {
        this.percentComplete = value;
    }

    /**
     * ��ȡplannedCompletionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPlannedCompletionTime() {
        if (plannedCompletionTime == null) {
            return false;
        } else {
            return plannedCompletionTime;
        }
    }

    /**
     * ����plannedCompletionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCompletionTime(Boolean value) {
        this.plannedCompletionTime = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPriority() {
        if (priority == null) {
            return false;
        } else {
            return priority;
        }
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStartTime() {
        if (startTime == null) {
            return false;
        } else {
            return startTime;
        }
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * ��ȡtaskType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTaskType() {
        if (taskType == null) {
            return false;
        } else {
            return taskType;
        }
    }

    /**
     * ����taskType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskType(Boolean value) {
        this.taskType = value;
    }

}
