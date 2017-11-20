
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactMarketingSettingsNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactMarketingSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ContactLists" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettingsNullFields")
public class ContactMarketingSettingsNullFields {

    @XmlAttribute(name = "ContactLists")
    protected Boolean contactLists;
    @XmlAttribute(name = "EmailFormat")
    protected Boolean emailFormat;
    @XmlAttribute(name = "MarketingOptIn")
    protected Boolean marketingOptIn;
    @XmlAttribute(name = "MarketingOrganizationName")
    protected Boolean marketingOrganizationName;
    @XmlAttribute(name = "MarketingOrganizationNameAlt")
    protected Boolean marketingOrganizationNameAlt;
    @XmlAttribute(name = "SurveyOptIn")
    protected Boolean surveyOptIn;

    /**
     * ��ȡcontactLists���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactLists() {
        if (contactLists == null) {
            return false;
        } else {
            return contactLists;
        }
    }

    /**
     * ����contactLists���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactLists(Boolean value) {
        this.contactLists = value;
    }

    /**
     * ��ȡemailFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailFormat() {
        if (emailFormat == null) {
            return false;
        } else {
            return emailFormat;
        }
    }

    /**
     * ����emailFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFormat(Boolean value) {
        this.emailFormat = value;
    }

    /**
     * ��ȡmarketingOptIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOptIn() {
        if (marketingOptIn == null) {
            return false;
        } else {
            return marketingOptIn;
        }
    }

    /**
     * ����marketingOptIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * ��ȡmarketingOrganizationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationName() {
        if (marketingOrganizationName == null) {
            return false;
        } else {
            return marketingOrganizationName;
        }
    }

    /**
     * ����marketingOrganizationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationName(Boolean value) {
        this.marketingOrganizationName = value;
    }

    /**
     * ��ȡmarketingOrganizationNameAlt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationNameAlt() {
        if (marketingOrganizationNameAlt == null) {
            return false;
        } else {
            return marketingOrganizationNameAlt;
        }
    }

    /**
     * ����marketingOrganizationNameAlt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationNameAlt(Boolean value) {
        this.marketingOrganizationNameAlt = value;
    }

    /**
     * ��ȡsurveyOptIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSurveyOptIn() {
        if (surveyOptIn == null) {
            return false;
        } else {
            return surveyOptIn;
        }
    }

    /**
     * ����surveyOptIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurveyOptIn(Boolean value) {
        this.surveyOptIn = value;
    }

}
