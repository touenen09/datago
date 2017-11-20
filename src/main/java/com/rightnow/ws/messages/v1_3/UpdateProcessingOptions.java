
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateProcessingOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpdateProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppressExternalEvents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SuppressRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReturnExpandedSoapFaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProcessingOptions", propOrder = {
    "suppressExternalEvents",
    "suppressRules",
    "returnExpandedSoapFaults"
})
public class UpdateProcessingOptions {

    @XmlElement(name = "SuppressExternalEvents")
    protected boolean suppressExternalEvents;
    @XmlElement(name = "SuppressRules")
    protected boolean suppressRules;
    @XmlElement(name = "ReturnExpandedSoapFaults")
    protected Boolean returnExpandedSoapFaults;

    /**
     * ��ȡsuppressExternalEvents���Ե�ֵ��
     * 
     */
    public boolean isSuppressExternalEvents() {
        return suppressExternalEvents;
    }

    /**
     * ����suppressExternalEvents���Ե�ֵ��
     * 
     */
    public void setSuppressExternalEvents(boolean value) {
        this.suppressExternalEvents = value;
    }

    /**
     * ��ȡsuppressRules���Ե�ֵ��
     * 
     */
    public boolean isSuppressRules() {
        return suppressRules;
    }

    /**
     * ����suppressRules���Ե�ֵ��
     * 
     */
    public void setSuppressRules(boolean value) {
        this.suppressRules = value;
    }

    /**
     * ��ȡreturnExpandedSoapFaults���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnExpandedSoapFaults() {
        return returnExpandedSoapFaults;
    }

    /**
     * ����returnExpandedSoapFaults���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnExpandedSoapFaults(Boolean value) {
        this.returnExpandedSoapFaults = value;
    }

}
