
package com.rightnow.ws.faults.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestErrorFaultDetailType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestErrorFaultDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:faults.ws.rightnow.com/v1_3}RNFault">
 *       &lt;sequence>
 *         &lt;element name="FailedItemIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestErrorFaultDetailType", propOrder = {
    "failedItemIndex"
})
public class RequestErrorFaultDetailType
    extends RNFault
{

    @XmlElement(name = "FailedItemIndex")
    protected Integer failedItemIndex;

    /**
     * ��ȡfailedItemIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedItemIndex() {
        return failedItemIndex;
    }

    /**
     * ����failedItemIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedItemIndex(Integer value) {
        this.failedItemIndex = value;
    }

}
