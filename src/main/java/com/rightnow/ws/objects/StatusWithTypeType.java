
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;


/**
 * <p>StatusWithType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StatusWithType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="StatusType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWithType", propOrder = {
    "status",
    "statusType"
})
public class StatusWithTypeType {

    @XmlElement(name = "Status")
    protected NamedID status;
    @XmlElement(name = "StatusType")
    protected NamedID statusType;

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

    /**
     * ��ȡstatusType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStatusType() {
        return statusType;
    }

    /**
     * ����statusType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStatusType(NamedID value) {
        this.statusType = value;
    }

}