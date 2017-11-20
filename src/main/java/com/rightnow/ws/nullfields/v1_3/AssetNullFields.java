
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssetNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AssetNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InstalledDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PurchasedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RetiredDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StatusWithType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetNullFields")
public class AssetNullFields {

    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "Description")
    protected Boolean description;
    @XmlAttribute(name = "InstalledDate")
    protected Boolean installedDate;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Price")
    protected Boolean price;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "PurchasedDate")
    protected Boolean purchasedDate;
    @XmlAttribute(name = "RetiredDate")
    protected Boolean retiredDate;
    @XmlAttribute(name = "SerialNumber")
    protected Boolean serialNumber;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;
    @XmlAttribute(name = "StatusWithType")
    protected Boolean statusWithType;

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContact() {
        if (contact == null) {
            return false;
        } else {
            return contact;
        }
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDescription() {
        if (description == null) {
            return false;
        } else {
            return description;
        }
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * ��ȡinstalledDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstalledDate() {
        if (installedDate == null) {
            return false;
        } else {
            return installedDate;
        }
    }

    /**
     * ����installedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstalledDate(Boolean value) {
        this.installedDate = value;
    }

    /**
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrice() {
        if (price == null) {
            return false;
        } else {
            return price;
        }
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrice(Boolean value) {
        this.price = value;
    }

    /**
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * ��ȡpurchasedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPurchasedDate() {
        if (purchasedDate == null) {
            return false;
        } else {
            return purchasedDate;
        }
    }

    /**
     * ����purchasedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasedDate(Boolean value) {
        this.purchasedDate = value;
    }

    /**
     * ��ȡretiredDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetiredDate() {
        if (retiredDate == null) {
            return false;
        } else {
            return retiredDate;
        }
    }

    /**
     * ����retiredDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetiredDate(Boolean value) {
        this.retiredDate = value;
    }

    /**
     * ��ȡserialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSerialNumber() {
        if (serialNumber == null) {
            return false;
        } else {
            return serialNumber;
        }
    }

    /**
     * ����serialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerialNumber(Boolean value) {
        this.serialNumber = value;
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

    /**
     * ��ȡstatusWithType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStatusWithType() {
        if (statusWithType == null) {
            return false;
        } else {
            return statusWithType;
        }
    }

    /**
     * ����statusWithType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusWithType(Boolean value) {
        this.statusWithType = value;
    }

}
