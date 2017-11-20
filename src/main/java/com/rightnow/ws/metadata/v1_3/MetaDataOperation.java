
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetaDataOperation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeUsage" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataAttributeUsageList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataOperation", propOrder = {
    "attributeUsage",
    "name"
})
public class MetaDataOperation {

    @XmlElement(name = "AttributeUsage")
    protected MetaDataAttributeUsageList attributeUsage;
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * ��ȡattributeUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAttributeUsageList }
     *     
     */
    public MetaDataAttributeUsageList getAttributeUsage() {
        return attributeUsage;
    }

    /**
     * ����attributeUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAttributeUsageList }
     *     
     */
    public void setAttributeUsage(MetaDataAttributeUsageList value) {
        this.attributeUsage = value;
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

}
