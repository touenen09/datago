
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>EventSubscription complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EventSubscription">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="EndPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="IntegrationUser" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectShape" type="{urn:base.ws.rightnow.com/v1_3}RNObject" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSubscription", propOrder = {
    "endPoint",
    "eventType",
    "integrationUser",
    "name",
    "objectShape",
    "status"
})
public class EventSubscriptionType
    extends RNObject
{

    @XmlElement(name = "EndPoint")
    protected String endPoint;
    @XmlElement(name = "EventType")
    protected NamedID eventType;
    @XmlElement(name = "IntegrationUser")
    protected NamedID integrationUser;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ObjectShape")
    protected RNObject objectShape;
    @XmlElement(name = "Status")
    protected NamedID status;

    /**
     * ��ȡendPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * ����endPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    /**
     * ��ȡeventType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getEventType() {
        return eventType;
    }

    /**
     * ����eventType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setEventType(NamedID value) {
        this.eventType = value;
    }

    /**
     * ��ȡintegrationUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getIntegrationUser() {
        return integrationUser;
    }

    /**
     * ����integrationUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setIntegrationUser(NamedID value) {
        this.integrationUser = value;
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
     * ��ȡobjectShape���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getObjectShape() {
        return objectShape;
    }

    /**
     * ����objectShape���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setObjectShape(RNObject value) {
        this.objectShape = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStatus(NamedID value) {
        this.status = value;
    }

}
