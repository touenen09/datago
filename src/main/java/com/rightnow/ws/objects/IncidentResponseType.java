
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IncidentResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IncidentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Incident" type="{urn:objects.ws.rightnow.com/v1_3}Incident" minOccurs="0"/>
 *         &lt;element name="CC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *         &lt;element name="BCC" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageRecipients" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentResponse", propOrder = {
    "incident",
    "cc",
    "bcc"
})
public class IncidentResponseType {

    @XmlElement(name = "Incident")
    protected IncidentType incident;
    @XmlElement(name = "CC")
    protected MailMessageRecipientsType cc;
    @XmlElement(name = "BCC")
    protected MailMessageRecipientsType bcc;

    /**
     * ��ȡincident���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IncidentType }
     *     
     */
    public IncidentType getIncident() {
        return incident;
    }

    /**
     * ����incident���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentType }
     *     
     */
    public void setIncident(IncidentType value) {
        this.incident = value;
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

}
