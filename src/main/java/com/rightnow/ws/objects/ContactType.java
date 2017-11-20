
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
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.ContactNullFields;


/**
 * <p>Contact complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:objects.ws.rightnow.com/v1_3}Address" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="ChannelUsernames" type="{urn:objects.ws.rightnow.com/v1_3}ChannelUsernameList" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_3}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_3}EmailList" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_3}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="OpenIDAccounts" type="{urn:objects.ws.rightnow.com/v1_3}ContactOpenIDAccountList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="PasswordEmailExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_3}PhoneList" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}ContactServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ContactNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "address",
    "banner",
    "channelUsernames",
    "contactType",
    "crmModules",
    "customFields",
    "disabled",
    "emails",
    "externalReference",
    "fileAttachments",
    "login",
    "marketingSettings",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "openIDAccounts",
    "organization",
    "passwordEmailExpirationTime",
    "passwordExpirationTime",
    "phones",
    "salesSettings",
    "serviceSettings",
    "source",
    "title",
    "validNullFields"
})
public class ContactType
    extends RNObject
{

    @XmlElementRef(name = "Address", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> address;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BannerType> banner;
    @XmlElementRef(name = "ChannelUsernames", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelUsernameListType> channelUsernames;
    @XmlElementRef(name = "ContactType", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> contactType;
    @XmlElement(name = "CRMModules")
    protected CRMModulesType crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailListType> emails;
    @XmlElementRef(name = "ExternalReference", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalReference;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonListType> fileAttachments;
    @XmlElementRef(name = "Login", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElement(name = "MarketingSettings")
    protected ContactMarketingSettingsType marketingSettings;
    @XmlElement(name = "Name")
    protected PersonNameType name;
    @XmlElement(name = "NameFurigana")
    protected PersonNameType nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteListType> notes;
    @XmlElement(name = "OpenIDAccounts")
    protected ContactOpenIDAccountListType openIDAccounts;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PasswordEmailExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordEmailExpirationTime;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElementRef(name = "Phones", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneListType> phones;
    @XmlElement(name = "SalesSettings")
    protected ContactSalesSettingsType salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected ContactServiceSettingsType serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElementRef(name = "Title", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactNullFields> validNullFields;

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AddressType> value) {
        this.address = value;
    }

    /**
     * ��ȡbanner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BannerType }{@code >}
     *     
     */
    public JAXBElement<BannerType> getBanner() {
        return banner;
    }

    /**
     * ����banner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BannerType }{@code >}
     *     
     */
    public void setBanner(JAXBElement<BannerType> value) {
        this.banner = value;
    }

    /**
     * ��ȡchannelUsernames���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameListType }{@code >}
     *     
     */
    public JAXBElement<ChannelUsernameListType> getChannelUsernames() {
        return channelUsernames;
    }

    /**
     * ����channelUsernames���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameListType }{@code >}
     *     
     */
    public void setChannelUsernames(JAXBElement<ChannelUsernameListType> value) {
        this.channelUsernames = value;
    }

    /**
     * ��ȡcontactType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContactType() {
        return contactType;
    }

    /**
     * ����contactType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContactType(JAXBElement<NamedID> value) {
        this.contactType = value;
    }

    /**
     * ��ȡcrmModules���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CRMModulesType }
     *     
     */
    public CRMModulesType getCRMModules() {
        return crmModules;
    }

    /**
     * ����crmModules���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CRMModulesType }
     *     
     */
    public void setCRMModules(CRMModulesType value) {
        this.crmModules = value;
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
     * ��ȡexternalReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalReference() {
        return externalReference;
    }

    /**
     * ����externalReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalReference(JAXBElement<String> value) {
        this.externalReference = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonListType> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonListType> value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡlogin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * ����login���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
    }

    /**
     * ��ȡmarketingSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactMarketingSettingsType }
     *     
     */
    public ContactMarketingSettingsType getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * ����marketingSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMarketingSettingsType }
     *     
     */
    public void setMarketingSettings(ContactMarketingSettingsType value) {
        this.marketingSettings = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setName(PersonNameType value) {
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
     * ��ȡnotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteListType }{@code >}
     *     
     */
    public JAXBElement<NoteListType> getNotes() {
        return notes;
    }

    /**
     * ����notes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteListType }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteListType> value) {
        this.notes = value;
    }

    /**
     * ��ȡopenIDAccounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactOpenIDAccountListType }
     *     
     */
    public ContactOpenIDAccountListType getOpenIDAccounts() {
        return openIDAccounts;
    }

    /**
     * ����openIDAccounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactOpenIDAccountListType }
     *     
     */
    public void setOpenIDAccounts(ContactOpenIDAccountListType value) {
        this.openIDAccounts = value;
    }

    /**
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = value;
    }

    /**
     * ��ȡpasswordEmailExpirationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    /**
     * ����passwordEmailExpirationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordEmailExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordEmailExpirationTime = value;
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
     * ��ȡsalesSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactSalesSettingsType }
     *     
     */
    public ContactSalesSettingsType getSalesSettings() {
        return salesSettings;
    }

    /**
     * ����salesSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSalesSettingsType }
     *     
     */
    public void setSalesSettings(ContactSalesSettingsType value) {
        this.salesSettings = value;
    }

    /**
     * ��ȡserviceSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactServiceSettingsType }
     *     
     */
    public ContactServiceSettingsType getServiceSettings() {
        return serviceSettings;
    }

    /**
     * ����serviceSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactServiceSettingsType }
     *     
     */
    public void setServiceSettings(ContactServiceSettingsType value) {
        this.serviceSettings = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactNullFields> value) {
        this.validNullFields = value;
    }

}
