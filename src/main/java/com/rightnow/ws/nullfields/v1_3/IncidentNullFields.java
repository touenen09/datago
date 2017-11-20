
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IncidentNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IncidentNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Asset" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BilledMinutes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ChatQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Disposition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OtherContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Queue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstance" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentNullFields")
public class IncidentNullFields {

    @XmlAttribute(name = "Asset")
    protected Boolean asset;
    @XmlAttribute(name = "BilledMinutes")
    protected Boolean billedMinutes;
    @XmlAttribute(name = "Category")
    protected Boolean category;
    @XmlAttribute(name = "Channel")
    protected Boolean channel;
    @XmlAttribute(name = "ChatQueue")
    protected Boolean chatQueue;
    @XmlAttribute(name = "Disposition")
    protected Boolean disposition;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Language")
    protected Boolean language;
    @XmlAttribute(name = "Mailbox")
    protected Boolean mailbox;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "OtherContacts")
    protected Boolean otherContacts;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "Queue")
    protected Boolean queue;
    @XmlAttribute(name = "Severity")
    protected Boolean severity;
    @XmlAttribute(name = "SLAInstance")
    protected Boolean slaInstance;
    @XmlAttribute(name = "Subject")
    protected Boolean subject;

    /**
     * ��ȡasset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAsset() {
        if (asset == null) {
            return false;
        } else {
            return asset;
        }
    }

    /**
     * ����asset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsset(Boolean value) {
        this.asset = value;
    }

    /**
     * ��ȡbilledMinutes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBilledMinutes() {
        if (billedMinutes == null) {
            return false;
        } else {
            return billedMinutes;
        }
    }

    /**
     * ����billedMinutes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBilledMinutes(Boolean value) {
        this.billedMinutes = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategory() {
        if (category == null) {
            return false;
        } else {
            return category;
        }
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory(Boolean value) {
        this.category = value;
    }

    /**
     * ��ȡchannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChannel() {
        if (channel == null) {
            return false;
        } else {
            return channel;
        }
    }

    /**
     * ����channel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChannel(Boolean value) {
        this.channel = value;
    }

    /**
     * ��ȡchatQueue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChatQueue() {
        if (chatQueue == null) {
            return false;
        } else {
            return chatQueue;
        }
    }

    /**
     * ����chatQueue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatQueue(Boolean value) {
        this.chatQueue = value;
    }

    /**
     * ��ȡdisposition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisposition() {
        if (disposition == null) {
            return false;
        } else {
            return disposition;
        }
    }

    /**
     * ����disposition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition(Boolean value) {
        this.disposition = value;
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
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLanguage() {
        if (language == null) {
            return false;
        } else {
            return language;
        }
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguage(Boolean value) {
        this.language = value;
    }

    /**
     * ��ȡmailbox���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailbox() {
        if (mailbox == null) {
            return false;
        } else {
            return mailbox;
        }
    }

    /**
     * ����mailbox���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailbox(Boolean value) {
        this.mailbox = value;
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
     * ��ȡotherContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtherContacts() {
        if (otherContacts == null) {
            return false;
        } else {
            return otherContacts;
        }
    }

    /**
     * ����otherContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherContacts(Boolean value) {
        this.otherContacts = value;
    }

    /**
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * ��ȡqueue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueue() {
        if (queue == null) {
            return false;
        } else {
            return queue;
        }
    }

    /**
     * ����queue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueue(Boolean value) {
        this.queue = value;
    }

    /**
     * ��ȡseverity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSeverity() {
        if (severity == null) {
            return false;
        } else {
            return severity;
        }
    }

    /**
     * ����severity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeverity(Boolean value) {
        this.severity = value;
    }

    /**
     * ��ȡslaInstance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstance() {
        if (slaInstance == null) {
            return false;
        } else {
            return slaInstance;
        }
    }

    /**
     * ����slaInstance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstance(Boolean value) {
        this.slaInstance = value;
    }

    /**
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSubject() {
        if (subject == null) {
            return false;
        } else {
            return subject;
        }
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubject(Boolean value) {
        this.subject = value;
    }

}
