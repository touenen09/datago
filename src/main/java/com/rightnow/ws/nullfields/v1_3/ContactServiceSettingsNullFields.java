
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactServiceSettingsNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AnswerNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CategoryNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProductNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettingsNullFields")
public class ContactServiceSettingsNullFields {

    @XmlAttribute(name = "AnswerNotifications")
    protected Boolean answerNotifications;
    @XmlAttribute(name = "CategoryNotifications")
    protected Boolean categoryNotifications;
    @XmlAttribute(name = "ProductNotifications")
    protected Boolean productNotifications;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;

    /**
     * ��ȡanswerNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnswerNotifications() {
        if (answerNotifications == null) {
            return false;
        } else {
            return answerNotifications;
        }
    }

    /**
     * ����answerNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerNotifications(Boolean value) {
        this.answerNotifications = value;
    }

    /**
     * ��ȡcategoryNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategoryNotifications() {
        if (categoryNotifications == null) {
            return false;
        } else {
            return categoryNotifications;
        }
    }

    /**
     * ����categoryNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryNotifications(Boolean value) {
        this.categoryNotifications = value;
    }

    /**
     * ��ȡproductNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProductNotifications() {
        if (productNotifications == null) {
            return false;
        } else {
            return productNotifications;
        }
    }

    /**
     * ����productNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductNotifications(Boolean value) {
        this.productNotifications = value;
    }

    /**
     * ��ȡslaInstances���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstances() {
        if (slaInstances == null) {
            return false;
        } else {
            return slaInstances;
        }
    }

    /**
     * ����slaInstances���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstances(Boolean value) {
        this.slaInstances = value;
    }

}
