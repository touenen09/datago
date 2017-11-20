
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MailMessageOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailMessageOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HonorMarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HonorGlobalSuppressionList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeOECustomHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageOptions", propOrder = {
    "honorMarketingOptIn",
    "honorGlobalSuppressionList",
    "includeOECustomHeaders"
})
public class MailMessageOptionsType {

    @XmlElement(name = "HonorMarketingOptIn")
    protected Boolean honorMarketingOptIn;
    @XmlElement(name = "HonorGlobalSuppressionList")
    protected Boolean honorGlobalSuppressionList;
    @XmlElement(name = "IncludeOECustomHeaders")
    protected Boolean includeOECustomHeaders;

    /**
     * ��ȡhonorMarketingOptIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHonorMarketingOptIn() {
        return honorMarketingOptIn;
    }

    /**
     * ����honorMarketingOptIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHonorMarketingOptIn(Boolean value) {
        this.honorMarketingOptIn = value;
    }

    /**
     * ��ȡhonorGlobalSuppressionList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHonorGlobalSuppressionList() {
        return honorGlobalSuppressionList;
    }

    /**
     * ����honorGlobalSuppressionList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHonorGlobalSuppressionList(Boolean value) {
        this.honorGlobalSuppressionList = value;
    }

    /**
     * ��ȡincludeOECustomHeaders���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOECustomHeaders() {
        return includeOECustomHeaders;
    }

    /**
     * ����includeOECustomHeaders���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOECustomHeaders(Boolean value) {
        this.includeOECustomHeaders = value;
    }

}
