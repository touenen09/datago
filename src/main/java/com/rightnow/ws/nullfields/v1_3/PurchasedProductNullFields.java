
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PurchasedProductNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PurchasedProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Campaign" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FinalizedByAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LicenseEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LicenseStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Opportunity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PurchaseTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SalesProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasedProductNullFields")
public class PurchasedProductNullFields {

    @XmlAttribute(name = "Campaign")
    protected Boolean campaign;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "FinalizedByAccount")
    protected Boolean finalizedByAccount;
    @XmlAttribute(name = "LicenseEndTime")
    protected Boolean licenseEndTime;
    @XmlAttribute(name = "LicenseStartTime")
    protected Boolean licenseStartTime;
    @XmlAttribute(name = "Mailing")
    protected Boolean mailing;
    @XmlAttribute(name = "Opportunity")
    protected Boolean opportunity;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Price")
    protected Boolean price;
    @XmlAttribute(name = "PurchaseTime")
    protected Boolean purchaseTime;
    @XmlAttribute(name = "SalesProduct")
    protected Boolean salesProduct;
    @XmlAttribute(name = "SerialNumber")
    protected Boolean serialNumber;

    /**
     * ��ȡcampaign���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaign() {
        if (campaign == null) {
            return false;
        } else {
            return campaign;
        }
    }

    /**
     * ����campaign���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaign(Boolean value) {
        this.campaign = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * ����comment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

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
     * ��ȡfinalizedByAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinalizedByAccount() {
        if (finalizedByAccount == null) {
            return false;
        } else {
            return finalizedByAccount;
        }
    }

    /**
     * ����finalizedByAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalizedByAccount(Boolean value) {
        this.finalizedByAccount = value;
    }

    /**
     * ��ȡlicenseEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLicenseEndTime() {
        if (licenseEndTime == null) {
            return false;
        } else {
            return licenseEndTime;
        }
    }

    /**
     * ����licenseEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseEndTime(Boolean value) {
        this.licenseEndTime = value;
    }

    /**
     * ��ȡlicenseStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLicenseStartTime() {
        if (licenseStartTime == null) {
            return false;
        } else {
            return licenseStartTime;
        }
    }

    /**
     * ����licenseStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseStartTime(Boolean value) {
        this.licenseStartTime = value;
    }

    /**
     * ��ȡmailing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailing() {
        if (mailing == null) {
            return false;
        } else {
            return mailing;
        }
    }

    /**
     * ����mailing���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailing(Boolean value) {
        this.mailing = value;
    }

    /**
     * ��ȡopportunity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOpportunity() {
        if (opportunity == null) {
            return false;
        } else {
            return opportunity;
        }
    }

    /**
     * ����opportunity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpportunity(Boolean value) {
        this.opportunity = value;
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
     * ��ȡpurchaseTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPurchaseTime() {
        if (purchaseTime == null) {
            return false;
        } else {
            return purchaseTime;
        }
    }

    /**
     * ����purchaseTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseTime(Boolean value) {
        this.purchaseTime = value;
    }

    /**
     * ��ȡsalesProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesProduct() {
        if (salesProduct == null) {
            return false;
        } else {
            return salesProduct;
        }
    }

    /**
     * ����salesProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesProduct(Boolean value) {
        this.salesProduct = value;
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

}
