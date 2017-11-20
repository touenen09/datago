
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>ChannelType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}ChannelTypeOptions" minOccurs="0"/>
 *         &lt;element name="ContactVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequiredList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelType", propOrder = {
    "attributes",
    "contactVisibility",
    "displayOrder",
    "name",
    "names"
})
public class ChannelTypeType
    extends RNObject
{

    @XmlElement(name = "Attributes")
    protected ChannelTypeOptionsType attributes;
    @XmlElement(name = "ContactVisibility")
    protected Boolean contactVisibility;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredListType names;

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChannelTypeOptionsType }
     *     
     */
    public ChannelTypeOptionsType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTypeOptionsType }
     *     
     */
    public void setAttributes(ChannelTypeOptionsType value) {
        this.attributes = value;
    }

    /**
     * ��ȡcontactVisibility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactVisibility() {
        return contactVisibility;
    }

    /**
     * ����contactVisibility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactVisibility(Boolean value) {
        this.contactVisibility = value;
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

}
