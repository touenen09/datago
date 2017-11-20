
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedIDDeltaList;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.generic.v1_3.GenericObject;
import com.rightnow.ws.nullfields.v1_3.SalesProductNullFields;


/**
 * <p>SalesProduct complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SalesProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}SalesProductOptions" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_3}GenericObject" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_3}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcludeFromOfferAdvisor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespondCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Schedules" type="{urn:objects.ws.rightnow.com/v1_3}SalesProductScheduleList" minOccurs="0"/>
 *         &lt;element name="ServiceProduct" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}SalesProductNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProduct", propOrder = {
    "acceptCount",
    "adminVisibleInterfaces",
    "attributes",
    "customFields",
    "descriptions",
    "displayOrder",
    "excludeFromOfferAdvisor",
    "folder",
    "name",
    "names",
    "partNumber",
    "respondCount",
    "schedules",
    "serviceProduct",
    "validNullFields"
})
public class SalesProductType
    extends RNObject
{

    @XmlElement(name = "AcceptCount")
    protected Integer acceptCount;
    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElement(name = "Attributes")
    protected SalesProductOptionsType attributes;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "Descriptions", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<LabelListType> descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ExcludeFromOfferAdvisor")
    protected Boolean excludeFromOfferAdvisor;
    @XmlElementRef(name = "Folder", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> folder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredListType names;
    @XmlElementRef(name = "PartNumber", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumber;
    @XmlElement(name = "RespondCount")
    protected Integer respondCount;
    @XmlElementRef(name = "Schedules", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesProductScheduleListType> schedules;
    @XmlElementRef(name = "ServiceProduct", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> serviceProduct;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesProductNullFields> validNullFields;

    /**
     * ��ȡacceptCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptCount() {
        return acceptCount;
    }

    /**
     * ����acceptCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptCount(Integer value) {
        this.acceptCount = value;
    }

    /**
     * ��ȡadminVisibleInterfaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getAdminVisibleInterfaces() {
        return adminVisibleInterfaces;
    }

    /**
     * ����adminVisibleInterfaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setAdminVisibleInterfaces(JAXBElement<NamedIDDeltaList> value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SalesProductOptionsType }
     *     
     */
    public SalesProductOptionsType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SalesProductOptionsType }
     *     
     */
    public void setAttributes(SalesProductOptionsType value) {
        this.attributes = value;
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
     * ��ȡdescriptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabelListType }{@code >}
     *     
     */
    public JAXBElement<LabelListType> getDescriptions() {
        return descriptions;
    }

    /**
     * ����descriptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabelListType }{@code >}
     *     
     */
    public void setDescriptions(JAXBElement<LabelListType> value) {
        this.descriptions = value;
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
     * ��ȡexcludeFromOfferAdvisor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromOfferAdvisor() {
        return excludeFromOfferAdvisor;
    }

    /**
     * ����excludeFromOfferAdvisor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromOfferAdvisor(Boolean value) {
        this.excludeFromOfferAdvisor = value;
    }

    /**
     * ��ȡfolder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getFolder() {
        return folder;
    }

    /**
     * ����folder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setFolder(JAXBElement<NamedIDHierarchy> value) {
        this.folder = value;
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
     * ��ȡnames���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LabelRequiredListType }
     *     
     */
    public LabelRequiredListType getNames() {
        return names;
    }

    /**
     * ����names���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRequiredListType }
     *     
     */
    public void setNames(LabelRequiredListType value) {
        this.names = value;
    }

    /**
     * ��ȡpartNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumber() {
        return partNumber;
    }

    /**
     * ����partNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumber(JAXBElement<String> value) {
        this.partNumber = value;
    }

    /**
     * ��ȡrespondCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRespondCount() {
        return respondCount;
    }

    /**
     * ����respondCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRespondCount(Integer value) {
        this.respondCount = value;
    }

    /**
     * ��ȡschedules���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleListType }{@code >}
     *     
     */
    public JAXBElement<SalesProductScheduleListType> getSchedules() {
        return schedules;
    }

    /**
     * ����schedules���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesProductScheduleListType }{@code >}
     *     
     */
    public void setSchedules(JAXBElement<SalesProductScheduleListType> value) {
        this.schedules = value;
    }

    /**
     * ��ȡserviceProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getServiceProduct() {
        return serviceProduct;
    }

    /**
     * ����serviceProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setServiceProduct(JAXBElement<NamedIDHierarchy> value) {
        this.serviceProduct = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}
     *     
     */
    public JAXBElement<SalesProductNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SalesProductNullFields> value) {
        this.validNullFields = value;
    }

}
