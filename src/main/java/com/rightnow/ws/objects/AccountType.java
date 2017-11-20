
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.AccountNullFields;


/**
 * <p>Account complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}AccountOptions" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailNotification" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_3}EmailList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_3}PersonFullName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_3}PhoneList" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}AccountSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}AccountServiceSettings" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffGroup" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AccountNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountHierarchy",
    "attributes",
    "country",
    "customFields",
    "displayName",
    "displayOrder",
    "emailNotification",
    "emails",
    "login",
    "manager",
    "name",
    "nameFurigana",
    "newPassword",
    "notificationPending",
    "passwordExpirationTime",
    "phones",
    "profile",
    "salesSettings",
    "serviceSettings",
    "signature",
    "staffGroup",
    "validNullFields"
})
public class AccountType
    extends RNObject
{

    @XmlElement(name = "AccountHierarchy")
    protected NamedIDList accountHierarchy;
    @XmlElement(name = "Attributes")
    protected AccountOptionsType attributes;
    @XmlElement(name = "Country")
    protected NamedID country;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DisplayName", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "EmailNotification", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> emailNotification;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailListType> emails;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElementRef(name = "Manager", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> manager;
    @XmlElement(name = "Name")
    protected PersonFullNameType name;
    @XmlElement(name = "NameFurigana")
    protected PersonNameType nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElement(name = "NotificationPending")
    protected Boolean notificationPending;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElementRef(name = "Phones", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneListType> phones;
    @XmlElementRef(name = "Profile", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> profile;
    @XmlElement(name = "SalesSettings")
    protected AccountSalesSettingsType salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected AccountServiceSettingsType serviceSettings;
    @XmlElementRef(name = "Signature", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signature;
    @XmlElement(name = "StaffGroup")
    protected NamedID staffGroup;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountNullFields> validNullFields;

    /**
     * ��ȡaccountHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * ����accountHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setAccountHierarchy(NamedIDList value) {
        this.accountHierarchy = value;
    }

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountOptionsType }
     *     
     */
    public AccountOptionsType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOptionsType }
     *     
     */
    public void setAttributes(AccountOptionsType value) {
        this.attributes = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCountry(NamedID value) {
        this.country = value;
    }

    /**
     * ��ȡcustomFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * ����customFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * ��ȡdisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * ����displayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * ��ȡdisplayOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * ����displayOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * ��ȡemailNotification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getEmailNotification() {
        return emailNotification;
    }

    /**
     * ����emailNotification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setEmailNotification(JAXBElement<NamedID> value) {
        this.emailNotification = value;
    }

    /**
     * ��ȡemails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailListType }{@code >}
     *     
     */
    public JAXBElement<EmailListType> getEmails() {
        return emails;
    }

    /**
     * ����emails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailListType }{@code >}
     *     
     */
    public void setEmails(JAXBElement<EmailListType> value) {
        this.emails = value;
    }

    /**
     * ��ȡlogin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * ����login���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * ��ȡmanager���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getManager() {
        return manager;
    }

    /**
     * ����manager���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setManager(JAXBElement<NamedIDHierarchy> value) {
        this.manager = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PersonFullNameType }
     *     
     */
    public PersonFullNameType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PersonFullNameType }
     *     
     */
    public void setName(PersonFullNameType value) {
        this.name = value;
    }

    /**
     * ��ȡnameFurigana���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getNameFurigana() {
        return nameFurigana;
    }

    /**
     * ����nameFurigana���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setNameFurigana(PersonNameType value) {
        this.nameFurigana = value;
    }

    /**
     * ��ȡnewPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewPassword() {
        return newPassword;
    }

    /**
     * ����newPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewPassword(JAXBElement<String> value) {
        this.newPassword = value;
    }

    /**
     * ��ȡnotificationPending���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationPending() {
        return notificationPending;
    }

    /**
     * ����notificationPending���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationPending(Boolean value) {
        this.notificationPending = value;
    }

    /**
     * ��ȡpasswordExpirationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    /**
     * ����passwordExpirationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordExpirationTime = value;
    }

    /**
     * ��ȡphones���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneListType }{@code >}
     *     
     */
    public JAXBElement<PhoneListType> getPhones() {
        return phones;
    }

    /**
     * ����phones���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneListType }{@code >}
     *     
     */
    public void setPhones(JAXBElement<PhoneListType> value) {
        this.phones = value;
    }

    /**
     * ��ȡprofile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getProfile() {
        return profile;
    }

    /**
     * ����profile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setProfile(JAXBElement<NamedID> value) {
        this.profile = value;
    }

    /**
     * ��ȡsalesSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountSalesSettingsType }
     *     
     */
    public AccountSalesSettingsType getSalesSettings() {
        return salesSettings;
    }

    /**
     * ����salesSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSalesSettingsType }
     *     
     */
    public void setSalesSettings(AccountSalesSettingsType value) {
        this.salesSettings = value;
    }

    /**
     * ��ȡserviceSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountServiceSettingsType }
     *     
     */
    public AccountServiceSettingsType getServiceSettings() {
        return serviceSettings;
    }

    /**
     * ����serviceSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountServiceSettingsType }
     *     
     */
    public void setServiceSettings(AccountServiceSettingsType value) {
        this.serviceSettings = value;
    }

    /**
     * ��ȡsignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignature() {
        return signature;
    }

    /**
     * ����signature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignature(JAXBElement<String> value) {
        this.signature = value;
    }

    /**
     * ��ȡstaffGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStaffGroup() {
        return staffGroup;
    }

    /**
     * ����staffGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStaffGroup(NamedID value) {
        this.staffGroup = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public JAXBElement<AccountNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AccountNullFields> value) {
        this.validNullFields = value;
    }

}
