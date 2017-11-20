
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
import com.rightnow.ws.nullfields.v1_3.ServiceDispositionNullFields;


/**
 * <p>ServiceDisposition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServiceDisposition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_3}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_3}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DispositionHierarchy" type="{urn:base.ws.rightnow.com/v1_3}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ProductLinks" type="{urn:objects.ws.rightnow.com/v1_3}ServiceProductList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ServiceDispositionNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDisposition", propOrder = {
    "adminVisibleInterfaces",
    "descriptions",
    "displayOrder",
    "dispositionHierarchy",
    "name",
    "names",
    "parent",
    "productLinks",
    "validNullFields"
})
public class ServiceDispositionType
    extends RNObject
{

    @XmlElementRef(name = "AdminVisibleInterfaces", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDDeltaList> adminVisibleInterfaces;
    @XmlElementRef(name = "Descriptions", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<LabelListType> descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "DispositionHierarchy")
    protected NamedIDList dispositionHierarchy;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredListType names;
    @XmlElementRef(name = "Parent", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElementRef(name = "ProductLinks", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceProductListType> productLinks;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDispositionNullFields> validNullFields;

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
     * ��ȡdispositionHierarchy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getDispositionHierarchy() {
        return dispositionHierarchy;
    }

    /**
     * ����dispositionHierarchy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setDispositionHierarchy(NamedIDList value) {
        this.dispositionHierarchy = value;
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
     * ��ȡproductLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductListType }{@code >}
     *     
     */
    public JAXBElement<ServiceProductListType> getProductLinks() {
        return productLinks;
    }

    /**
     * ����productLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceProductListType }{@code >}
     *     
     */
    public void setProductLinks(JAXBElement<ServiceProductListType> value) {
        this.productLinks = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}
     *     
     */
    public JAXBElement<ServiceDispositionNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ServiceDispositionNullFields> value) {
        this.validNullFields = value;
    }

}
