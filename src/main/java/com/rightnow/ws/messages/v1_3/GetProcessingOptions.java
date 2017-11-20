
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetProcessingOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FetchAllNames" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "GetProcessingOptions", propOrder = {
    "fetchAllNames",
    "returnExpandedSoapFaults"
})
public class GetProcessingOptions {

    @XmlElement(name = "FetchAllNames")
    protected boolean fetchAllNames;
    @XmlElement(name = "ReturnExpandedSoapFaults")
    protected Boolean returnExpandedSoapFaults;

    /**
     * ��ȡfetchAllNames���Ե�ֵ��
     * 
     */
    public boolean isFetchAllNames() {
        return fetchAllNames;
    }

    /**
     * ����fetchAllNames���Ե�ֵ��
     * 
     */
    public void setFetchAllNames(boolean value) {
        this.fetchAllNames = value;
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
