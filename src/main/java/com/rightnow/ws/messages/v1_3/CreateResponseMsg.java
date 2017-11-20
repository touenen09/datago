
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CreateResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjectsResult" type="{urn:messages.ws.rightnow.com/v1_3}RNObjectsResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateResponseMsg", propOrder = {
    "rnObjectsResult"
})
public class CreateResponseMsg {

    @XmlElement(name = "RNObjectsResult", required = true)
    protected RNObjectsResult rnObjectsResult;

    /**
     * ��ȡrnObjectsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectsResult }
     *     
     */
    public RNObjectsResult getRNObjectsResult() {
        return rnObjectsResult;
    }

    /**
     * ����rnObjectsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectsResult }
     *     
     */
    public void setRNObjectsResult(RNObjectsResult value) {
        this.rnObjectsResult = value;
    }

}
