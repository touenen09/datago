
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedIDDeltaList;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.nullfields.v1_3.ServiceProductNullFields;


/**
 * <p>ServiceProduct complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServiceProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="CategoryLinks" type="{urn:objects.ws.rightnow.com/v1_3}ServiceCategoryList" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_3}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DispositionLinks" type="{urn:objects.ws.rightnow.com/v1_3}ServiceDispositionList" minOccurs="0"/>
 *         &lt;element name="EndUserVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ProductHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ServiceProductNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProduct", propOrder = {
    "adminVisibleInterfaces",
    "categoryLinks",
    "descriptions",
    "displayOrder",
    "dispositionLinks",
    "endUserVisibleInterfaces",
    "name",
    "names",
    "parent",
    "productHierarchy",
    "validNullFields"
})
public class ServiceProductType
    extends RNObject
{

    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElementRef(name = "CategoryLinks", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCategoryListType> categoryLinks;
    @XmlElementRef(name = "Descriptions", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<LabelListType> descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "DispositionLinks", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDispositionListType> dispositionLinks;
    @XmlElementRef(name = "EndUserVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> endUserVisibleInterfaces;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredListType names;
    @XmlElementRef(name = "Parent", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElement(name = "ProductHierarchy")
    protected NamedIDList productHierarchy;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceProductNullFields> validNullFields;

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
     * ��ȡcategoryLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCategoryListType }{@code >}
     *     
     */
    public JAXBElement<ServiceCategoryListType> getCategoryLinks() {
        return categoryLinks;
    }

    /**
     * ����categoryLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCategoryListType }{@code >}
     *     
     */
    public void setCategoryLinks(JAXBElement<ServiceCategoryListType> value) {
        this.categoryLinks = value;
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
     * ��ȡdispositionLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionListType }{@code >}
     *     
     */
    public JAXBElement<ServiceDispositionListType> getDispositionLinks() {
        return dispositionLinks;
    }

    /**
     * ����dispositionLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionListType }{@code >}
     *     
     */
    public void setDispositionLinks(JAXBElement<ServiceDispositionListType> value) {
        this.dispositionLinks = value;
    }

    /**
     * ��ȡendUserVisibleInterfaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getEndUserVisibleInterfaces() {
        return endUserVisibleInterfaces;
    }

    /**
     * ����endUserVisibleInterfaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setEndUserVisibleInterfaces(JAXBElement<NamedIDDeltaList> value) {
        this.endUserVisibleInterfaces = value;
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
     * ��ȡproductHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getProductHierarchy() {
        return productHierarchy;
    }

    /**
     * ����productHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setProductHierarchy(NamedIDList value) {
        this.productHierarchy = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductNullFields }{@code >}
     *     
     */
    public JAXBElement<ServiceProductNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ServiceProductNullFields> value) {
        this.validNullFields = value;
    }

}
