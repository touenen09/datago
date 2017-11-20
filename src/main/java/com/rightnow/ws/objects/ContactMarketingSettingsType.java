
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDDeltaList;
import com.rightnow.ws.nullfields.v1_3.ContactMarketingSettingsNullFields;


/**
 * <p>ContactMarketingSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactMarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLists" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ContactMarketingSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettings", propOrder = {
    "contactLists",
    "emailFormat",
    "marketingOptIn",
    "marketingOrganizationName",
    "marketingOrganizationNameAlt",
    "surveyOptIn",
    "validNullFields"
})
public class ContactMarketingSettingsType {

    @XmlElementRef(name = "ContactLists", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> contactLists;
    @XmlElementRef(name = "EmailFormat", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> emailFormat;
    @XmlElementRef(name = "MarketingOptIn", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> marketingOptIn;
    @XmlElementRef(name = "MarketingOrganizationName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingOrganizationName;
    @XmlElementRef(name = "MarketingOrganizationNameAlt", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingOrganizationNameAlt;
    @XmlElementRef(name = "SurveyOptIn", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> surveyOptIn;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactMarketingSettingsNullFields> validNullFields;

    /**
     * ��ȡcontactLists���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getContactLists() {
        return contactLists;
    }

    /**
     * ����contactLists���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setContactLists(JAXBElement<NamedIDDeltaList> value) {
        this.contactLists = value;
    }

    /**
     * ��ȡemailFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getEmailFormat() {
        return emailFormat;
    }

    /**
     * ����emailFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setEmailFormat(JAXBElement<NamedID> value) {
        this.emailFormat = value;
    }

    /**
     * ��ȡmarketingOptIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * ����marketingOptIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMarketingOptIn(JAXBElement<Boolean> value) {
        this.marketingOptIn = value;
    }

    /**
     * ��ȡmarketingOrganizationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOrganizationName() {
        return marketingOrganizationName;
    }

    /**
     * ����marketingOrganizationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOrganizationName(JAXBElement<String> value) {
        this.marketingOrganizationName = value;
    }

    /**
     * ��ȡmarketingOrganizationNameAlt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOrganizationNameAlt() {
        return marketingOrganizationNameAlt;
    }

    /**
     * ����marketingOrganizationNameAlt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOrganizationNameAlt(JAXBElement<String> value) {
        this.marketingOrganizationNameAlt = value;
    }

    /**
     * ��ȡsurveyOptIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSurveyOptIn() {
        return surveyOptIn;
    }

    /**
     * ����surveyOptIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSurveyOptIn(JAXBElement<Boolean> value) {
        this.surveyOptIn = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactMarketingSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactMarketingSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
