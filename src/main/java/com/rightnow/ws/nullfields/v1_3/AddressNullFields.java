
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AddressNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Street" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressNullFields")
public class AddressNullFields {

    @XmlAttribute(name = "City")
    protected Boolean city;
    @XmlAttribute(name = "Country")
    protected Boolean country;
    @XmlAttribute(name = "PostalCode")
    protected Boolean postalCode;
    @XmlAttribute(name = "StateOrProvince")
    protected Boolean stateOrProvince;
    @XmlAttribute(name = "Street")
    protected Boolean street;

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCity() {
        if (city == null) {
            return false;
        } else {
            return city;
        }
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCity(Boolean value) {
        this.city = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCountry() {
        if (country == null) {
            return false;
        } else {
            return country;
        }
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountry(Boolean value) {
        this.country = value;
    }

    /**
     * ��ȡpostalCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPostalCode() {
        if (postalCode == null) {
            return false;
        } else {
            return postalCode;
        }
    }

    /**
     * ����postalCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostalCode(Boolean value) {
        this.postalCode = value;
    }

    /**
     * ��ȡstateOrProvince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStateOrProvince() {
        if (stateOrProvince == null) {
            return false;
        } else {
            return stateOrProvince;
        }
    }

    /**
     * ����stateOrProvince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStateOrProvince(Boolean value) {
        this.stateOrProvince = value;
    }

    /**
     * ��ȡstreet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStreet() {
        if (street == null) {
            return false;
        } else {
            return street;
        }
    }

    /**
     * ����street���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreet(Boolean value) {
        this.street = value;
    }

}
