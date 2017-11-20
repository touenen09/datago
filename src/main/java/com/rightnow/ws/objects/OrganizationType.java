
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.OrganizationNullFields;


/**
 * <p>Organization complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{urn:objects.ws.rightnow.com/v1_3}TypedAddressList" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_3}Banner" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_3}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Industry" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_3}NoteList" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrganizationHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_3}OrganizationSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_3}OrganizationServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "addresses",
    "banner",
    "crmModules",
    "customFields",
    "externalReference",
    "fileAttachments",
    "industry",
    "login",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "numberOfEmployees",
    "organizationHierarchy",
    "parent",
    "salesSettings",
    "serviceSettings",
    "source",
    "validNullFields"
})
public class OrganizationType
    extends RNObject
{

    @XmlElementRef(name = "Addresses", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<TypedAddressListType> addresses;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BannerType> banner;
    @XmlElement(name = "CRMModules")
    protected CRMModulesType crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "ExternalReference", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalReference;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentCommonListType> fileAttachments;
    @XmlElementRef(name = "Industry", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> industry;
    @XmlElementRef(name = "Login", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "NameFurigana", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newPassword;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteListType> notes;
    @XmlElementRef(name = "NumberOfEmployees", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfEmployees;
    @XmlElement(name = "OrganizationHierarchy")
    protected NamedIDList organizationHierarchy;
    @XmlElementRef(name = "Parent", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElement(name = "SalesSettings")
    protected OrganizationSalesSettingsType salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected OrganizationServiceSettingsType serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationNullFields> validNullFields;

    /**
     * ��ȡaddresses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypedAddressListType }{@code >}
     *     
     */
    public JAXBElement<TypedAddressListType> getAddresses() {
        return addresses;
    }

    /**
     * ����addresses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypedAddressListType }{@code >}
     *     
     */
    public void setAddresses(JAXBElement<TypedAddressListType> value) {
        this.addresses = value;
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
     * ��ȡindustry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getIndustry() {
        return industry;
    }

    /**
     * ����industry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setIndustry(JAXBElement<NamedID> value) {
        this.industry = value;
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
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡnameFurigana���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameFurigana() {
        return nameFurigana;
    }

    /**
     * ����nameFurigana���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameFurigana(JAXBElement<String> value) {
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
     * ��ȡnumberOfEmployees���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * ����numberOfEmployees���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfEmployees(JAXBElement<Integer> value) {
        this.numberOfEmployees = value;
    }

    /**
     * ��ȡorganizationHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getOrganizationHierarchy() {
        return organizationHierarchy;
    }

    /**
     * ����organizationHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setOrganizationHierarchy(NamedIDList value) {
        this.organizationHierarchy = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setParent(JAXBElement<NamedIDHierarchy> value) {
        this.parent = value;
    }

    /**
     * ��ȡsalesSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSalesSettingsType }
     *     
     */
    public OrganizationSalesSettingsType getSalesSettings() {
        return salesSettings;
    }

    /**
     * ����salesSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSalesSettingsType }
     *     
     */
    public void setSalesSettings(OrganizationSalesSettingsType value) {
        this.salesSettings = value;
    }

    /**
     * ��ȡserviceSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrganizationServiceSettingsType }
     *     
     */
    public OrganizationServiceSettingsType getServiceSettings() {
        return serviceSettings;
    }

    /**
     * ����serviceSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceSettingsType }
     *     
     */
    public void setServiceSettings(OrganizationServiceSettingsType value) {
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
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationNullFields> value) {
        this.validNullFields = value;
    }

}
