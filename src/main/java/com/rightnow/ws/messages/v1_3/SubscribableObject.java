
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.metadata.v1_3.SubscriptionEvents;


/**
 * <p>SubscribableObject complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubscribableObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObject" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject"/>
 *         &lt;element name="SupportedEvents" type="{urn:metadata.ws.rightnow.com/v1_3}SubscriptionEvents"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribableObject", propOrder = {
    "rnObject",
    "supportedEvents"
})
public class SubscribableObject {

    @XmlElement(name = "RNObject", required = true)
    protected GenericObject rnObject;
    @XmlElement(name = "SupportedEvents", required = true)
    protected SubscriptionEvents supportedEvents;

    /**
     * ��ȡrnObject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getRNObject() {
        return rnObject;
    }

    /**
     * ����rnObject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setRNObject(GenericObject value) {
        this.rnObject = value;
    }

    /**
     * ��ȡsupportedEvents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvents }
     *     
     */
    public SubscriptionEvents getSupportedEvents() {
        return supportedEvents;
    }

    /**
     * ����supportedEvents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvents }
     *     
     */
    public void setSupportedEvents(SubscriptionEvents value) {
        this.supportedEvents = value;
    }

}
