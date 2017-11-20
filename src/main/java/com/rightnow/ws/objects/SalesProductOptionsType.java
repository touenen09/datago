
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SalesProductOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SalesProductOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSalesProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsServiceProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductOptions", propOrder = {
    "disabled",
    "hasSerialNumber",
    "isSalesProduct",
    "isServiceProduct"
})
public class SalesProductOptionsType {

    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "HasSerialNumber")
    protected Boolean hasSerialNumber;
    @XmlElement(name = "IsSalesProduct")
    protected Boolean isSalesProduct;
    @XmlElement(name = "IsServiceProduct")
    protected Boolean isServiceProduct;

    /**
     * ��ȡdisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * ����disabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * ��ȡhasSerialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSerialNumber() {
        return hasSerialNumber;
    }

    /**
     * ����hasSerialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSerialNumber(Boolean value) {
        this.hasSerialNumber = value;
    }

    /**
     * ��ȡisSalesProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesProduct() {
        return isSalesProduct;
    }

    /**
     * ����isSalesProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesProduct(Boolean value) {
        this.isSalesProduct = value;
    }

    /**
     * ��ȡisServiceProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceProduct() {
        return isServiceProduct;
    }

    /**
     * ����isServiceProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceProduct(Boolean value) {
        this.isServiceProduct = value;
    }

}
