
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.nullfields.v1_3.MailMessageNullFields;


/**
 * <p>MailMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BCC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="Body" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageBody" minOccurs="0"/>
 *         &lt;element name="CC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentList" minOccurs="0"/>
 *         &lt;element name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromMailbox" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Headers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Options" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageOptions" minOccurs="0"/>
 *         &lt;element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageStatus" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailMessageNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessage", propOrder = {
    "bcc",
    "body",
    "cc",
    "fileAttachments",
    "friendlyFromAddress",
    "fromMailbox",
    "headers",
    "options",
    "replyToAddress",
    "status",
    "subject",
    "to",
    "validNullFields"
})
public class MailMessageType {

    @XmlElement(name = "BCC")
    protected MailMessageRecipientsType bcc;
    @XmlElement(name = "Body")
    protected MailMessageBodyType body;
    @XmlElement(name = "CC")
    protected MailMessageRecipientsType cc;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentListType> fileAttachments;
    @XmlElement(name = "FriendlyFromAddress")
    protected String friendlyFromAddress;
    @XmlElement(name = "FromMailbox")
    protected NamedID fromMailbox;
    @XmlElement(name = "Headers")
    protected List<String> headers;
    @XmlElement(name = "Options")
    protected MailMessageOptionsType options;
    @XmlElement(name = "ReplyToAddress")
    protected String replyToAddress;
    @XmlElement(name = "Status")
    protected MailMessageStatusType status;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "To")
    protected MailMessageRecipientsType to;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailMessageNullFields> validNullFields;

    /**
     * ��ȡbcc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public MailMessageRecipientsType getBCC() {
        return bcc;
    }

    /**
     * ����bcc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public void setBCC(MailMessageRecipientsType value) {
        this.bcc = value;
    }

    /**
     * ��ȡbody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageBodyType }
     *     
     */
    public MailMessageBodyType getBody() {
        return body;
    }

    /**
     * ����body���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageBodyType }
     *     
     */
    public void setBody(MailMessageBodyType value) {
        this.body = value;
    }

    /**
     * ��ȡcc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public MailMessageRecipientsType getCC() {
        return cc;
    }

    /**
     * ����cc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public void setCC(MailMessageRecipientsType value) {
        this.cc = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentListType> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentListType }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentListType> value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡfriendlyFromAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyFromAddress() {
        return friendlyFromAddress;
    }

    /**
     * ����friendlyFromAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyFromAddress(String value) {
        this.friendlyFromAddress = value;
    }

    /**
     * ��ȡfromMailbox���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getFromMailbox() {
        return fromMailbox;
    }

    /**
     * ����fromMailbox���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setFromMailbox(NamedID value) {
        this.fromMailbox = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<String>();
        }
        return this.headers;
    }

    /**
     * ��ȡoptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageOptionsType }
     *     
     */
    public MailMessageOptionsType getOptions() {
        return options;
    }

    /**
     * ����options���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageOptionsType }
     *     
     */
    public void setOptions(MailMessageOptionsType value) {
        this.options = value;
    }

    /**
     * ��ȡreplyToAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * ����replyToAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToAddress(String value) {
        this.replyToAddress = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageStatusType }
     *     
     */
    public MailMessageStatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageStatusType }
     *     
     */
    public void setStatus(MailMessageStatusType value) {
        this.status = value;
    }

    /**
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * ��ȡto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public MailMessageRecipientsType getTo() {
        return to;
    }

    /**
     * ����to���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageRecipientsType }
     *     
     */
    public void setTo(MailMessageRecipientsType value) {
        this.to = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailMessageNullFields }{@code >}
     *     
     */
    public JAXBElement<MailMessageNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailMessageNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailMessageNullFields> value) {
        this.validNullFields = value;
    }

}
