
package com.rightnow.ws.metadata.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.RNObjectType;


/**
 * <p>MetaDataRelationship complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MyCardinality" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataCardinalityEnum"/>
 *         &lt;element name="MyKeyAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MyKeyType" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataKeyTypeEnum"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Navigability" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataNavigabilityEnum"/>
 *         &lt;element name="OtherClassCardinality" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataCardinalityEnum"/>
 *         &lt;element name="OtherClassKeyAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherClassKeyType" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataKeyTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherClassName" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataRelationship", propOrder = {
    "myCardinality",
    "myKeyAttributes",
    "myKeyType",
    "name",
    "navigability",
    "otherClassCardinality",
    "otherClassKeyAttributes",
    "otherClassKeyType",
    "otherClassName"
})
public class MetaDataRelationship {

    @XmlElement(name = "MyCardinality", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataCardinalityEnum myCardinality;
    @XmlElement(name = "MyKeyAttributes")
    protected List<String> myKeyAttributes;
    @XmlElement(name = "MyKeyType", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataKeyTypeEnum myKeyType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Navigability", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataNavigabilityEnum navigability;
    @XmlElement(name = "OtherClassCardinality", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataCardinalityEnum otherClassCardinality;
    @XmlElement(name = "OtherClassKeyAttributes")
    protected List<String> otherClassKeyAttributes;
    @XmlElement(name = "OtherClassKeyType")
    @XmlSchemaType(name = "string")
    protected List<MetaDataKeyTypeEnum> otherClassKeyType;
    @XmlElement(name = "OtherClassName", required = true)
    protected RNObjectType otherClassName;

    /**
     * ��ȡmyCardinality���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataCardinalityEnum }
     *     
     */
    public MetaDataCardinalityEnum getMyCardinality() {
        return myCardinality;
    }

    /**
     * ����myCardinality���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataCardinalityEnum }
     *     
     */
    public void setMyCardinality(MetaDataCardinalityEnum value) {
        this.myCardinality = value;
    }

    /**
     * Gets the value of the myKeyAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the myKeyAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMyKeyAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMyKeyAttributes() {
        if (myKeyAttributes == null) {
            myKeyAttributes = new ArrayList<String>();
        }
        return this.myKeyAttributes;
    }

    /**
     * ��ȡmyKeyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataKeyTypeEnum }
     *     
     */
    public MetaDataKeyTypeEnum getMyKeyType() {
        return myKeyType;
    }

    /**
     * ����myKeyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataKeyTypeEnum }
     *     
     */
    public void setMyKeyType(MetaDataKeyTypeEnum value) {
        this.myKeyType = value;
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
     * ��ȡnavigability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataNavigabilityEnum }
     *     
     */
    public MetaDataNavigabilityEnum getNavigability() {
        return navigability;
    }

    /**
     * ����navigability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataNavigabilityEnum }
     *     
     */
    public void setNavigability(MetaDataNavigabilityEnum value) {
        this.navigability = value;
    }

    /**
     * ��ȡotherClassCardinality���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataCardinalityEnum }
     *     
     */
    public MetaDataCardinalityEnum getOtherClassCardinality() {
        return otherClassCardinality;
    }

    /**
     * ����otherClassCardinality���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataCardinalityEnum }
     *     
     */
    public void setOtherClassCardinality(MetaDataCardinalityEnum value) {
        this.otherClassCardinality = value;
    }

    /**
     * Gets the value of the otherClassKeyAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherClassKeyAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherClassKeyAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherClassKeyAttributes() {
        if (otherClassKeyAttributes == null) {
            otherClassKeyAttributes = new ArrayList<String>();
        }
        return this.otherClassKeyAttributes;
    }

    /**
     * Gets the value of the otherClassKeyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherClassKeyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherClassKeyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataKeyTypeEnum }
     * 
     * 
     */
    public List<MetaDataKeyTypeEnum> getOtherClassKeyType() {
        if (otherClassKeyType == null) {
            otherClassKeyType = new ArrayList<MetaDataKeyTypeEnum>();
        }
        return this.otherClassKeyType;
    }

    /**
     * ��ȡotherClassName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getOtherClassName() {
        return otherClassName;
    }

    /**
     * ����otherClassName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setOtherClassName(RNObjectType value) {
        this.otherClassName = value;
    }

}
