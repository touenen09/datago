
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceProductNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServiceProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CategoryLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="DispositionLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EndUserVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProductNullFields")
public class ServiceProductNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;
    @XmlAttribute(name = "CategoryLinks")
    protected Boolean categoryLinks;
    @XmlAttribute(name = "Descriptions")
    protected Boolean descriptions;
    @XmlAttribute(name = "DispositionLinks")
    protected Boolean dispositionLinks;
    @XmlAttribute(name = "EndUserVisibleInterfaces")
    protected Boolean endUserVisibleInterfaces;
    @XmlAttribute(name = "Parent")
    protected Boolean parent;

    /**
     * ��ȡadminVisibleInterfaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdminVisibleInterfaces() {
        if (adminVisibleInterfaces == null) {
            return false;
        } else {
            return adminVisibleInterfaces;
        }
    }

    /**
     * ����adminVisibleInterfaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminVisibleInterfaces(Boolean value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * ��ȡcategoryLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategoryLinks() {
        if (categoryLinks == null) {
            return false;
        } else {
            return categoryLinks;
        }
    }

    /**
     * ����categoryLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryLinks(Boolean value) {
        this.categoryLinks = value;
    }

    /**
     * ��ȡdescriptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDescriptions() {
        if (descriptions == null) {
            return false;
        } else {
            return descriptions;
        }
    }

    /**
     * ����descriptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptions(Boolean value) {
        this.descriptions = value;
    }

    /**
     * ��ȡdispositionLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDispositionLinks() {
        if (dispositionLinks == null) {
            return false;
        } else {
            return dispositionLinks;
        }
    }

    /**
     * ����dispositionLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispositionLinks(Boolean value) {
        this.dispositionLinks = value;
    }

    /**
     * ��ȡendUserVisibleInterfaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEndUserVisibleInterfaces() {
        if (endUserVisibleInterfaces == null) {
            return false;
        } else {
            return endUserVisibleInterfaces;
        }
    }

    /**
     * ����endUserVisibleInterfaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndUserVisibleInterfaces(Boolean value) {
        this.endUserVisibleInterfaces = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParent() {
        if (parent == null) {
            return false;
        } else {
            return parent;
        }
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParent(Boolean value) {
        this.parent = value;
    }

}
