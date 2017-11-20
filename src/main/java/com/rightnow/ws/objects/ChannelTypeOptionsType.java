
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChannelTypeOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelTypeOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Incoming" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Monitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Outgoing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTypeOptions", propOrder = {
    "contactVisibility",
    "incoming",
    "monitoring",
    "outgoing",
    "subscription"
})
public class ChannelTypeOptionsType {

    @XmlElement(name = "ContactVisibility")
    protected Boolean contactVisibility;
    @XmlElement(name = "Incoming")
    protected Boolean incoming;
    @XmlElement(name = "Monitoring")
    protected Boolean monitoring;
    @XmlElement(name = "Outgoing")
    protected Boolean outgoing;
    @XmlElement(name = "Subscription")
    protected Boolean subscription;

    /**
     * ��ȡcontactVisibility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactVisibility() {
        return contactVisibility;
    }

    /**
     * ����contactVisibility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactVisibility(Boolean value) {
        this.contactVisibility = value;
    }

    /**
     * ��ȡincoming���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncoming() {
        return incoming;
    }

    /**
     * ����incoming���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncoming(Boolean value) {
        this.incoming = value;
    }

    /**
     * ��ȡmonitoring���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoring() {
        return monitoring;
    }

    /**
     * ����monitoring���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoring(Boolean value) {
        this.monitoring = value;
    }

    /**
     * ��ȡoutgoing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutgoing() {
        return outgoing;
    }

    /**
     * ����outgoing���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutgoing(Boolean value) {
        this.outgoing = value;
    }

    /**
     * ��ȡsubscription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscription() {
        return subscription;
    }

    /**
     * ����subscription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscription(Boolean value) {
        this.subscription = value;
    }

}
