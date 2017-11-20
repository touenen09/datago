
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InheritOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InheritOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InheritContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritStaffAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritOptions", propOrder = {
    "inheritContact",
    "inheritOrganization",
    "inheritStaffAssignment"
})
public class InheritOptionsType {

    @XmlElement(name = "InheritContact")
    protected Boolean inheritContact;
    @XmlElement(name = "InheritOrganization")
    protected Boolean inheritOrganization;
    @XmlElement(name = "InheritStaffAssignment")
    protected Boolean inheritStaffAssignment;

    /**
     * ��ȡinheritContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritContact() {
        return inheritContact;
    }

    /**
     * ����inheritContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritContact(Boolean value) {
        this.inheritContact = value;
    }

    /**
     * ��ȡinheritOrganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritOrganization() {
        return inheritOrganization;
    }

    /**
     * ����inheritOrganization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritOrganization(Boolean value) {
        this.inheritOrganization = value;
    }

    /**
     * ��ȡinheritStaffAssignment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritStaffAssignment() {
        return inheritStaffAssignment;
    }

    /**
     * ����inheritStaffAssignment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritStaffAssignment(Boolean value) {
        this.inheritStaffAssignment = value;
    }

}
