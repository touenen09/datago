
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.ID;


/**
 * <p>SendMailingToContactMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SendMailingToContactMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="MailingID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IncidentID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="OpportunityID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="ChatID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailingToContactMsg", propOrder = {
    "contactID",
    "mailingID",
    "scheduledTime",
    "incidentID",
    "opportunityID",
    "chatID"
})
public class SendMailingToContactMsg {

    @XmlElement(name = "ContactID", required = true)
    protected ID contactID;
    @XmlElement(name = "MailingID", required = true)
    protected ID mailingID;
    @XmlElement(name = "ScheduledTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "IncidentID", required = true, nillable = true)
    protected ID incidentID;
    @XmlElement(name = "OpportunityID", required = true, nillable = true)
    protected ID opportunityID;
    @XmlElement(name = "ChatID")
    protected ID chatID;

    /**
     * ��ȡcontactID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getContactID() {
        return contactID;
    }

    /**
     * ����contactID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setContactID(ID value) {
        this.contactID = value;
    }

    /**
     * ��ȡmailingID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getMailingID() {
        return mailingID;
    }

    /**
     * ����mailingID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setMailingID(ID value) {
        this.mailingID = value;
    }

    /**
     * ��ȡscheduledTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * ����scheduledTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * ��ȡincidentID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getIncidentID() {
        return incidentID;
    }

    /**
     * ����incidentID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setIncidentID(ID value) {
        this.incidentID = value;
    }

    /**
     * ��ȡopportunityID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getOpportunityID() {
        return opportunityID;
    }

    /**
     * ����opportunityID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setOpportunityID(ID value) {
        this.opportunityID = value;
    }

    /**
     * ��ȡchatID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getChatID() {
        return chatID;
    }

    /**
     * ����chatID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setChatID(ID value) {
        this.chatID = value;
    }

}
