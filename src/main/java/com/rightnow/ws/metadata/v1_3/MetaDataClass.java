
package com.rightnow.ws.metadata.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.RNObjectType;


/**
 * <p>MetaDataClass complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataAttributeList" minOccurs="0"/>
 *         &lt;element name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanDestroy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanGet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DerivedFrom" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsMenu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType"/>
 *         &lt;element name="Relationships" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupportedEvents" type="{urn:metadata.ws.rightnow.com/v1_3}SubscriptionEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataClass", propOrder = {
    "attributes",
    "canCreate",
    "canDestroy",
    "canGet",
    "canUpdate",
    "derivedFrom",
    "description",
    "isMenu",
    "label",
    "metaDataLink",
    "name",
    "relationships",
    "supportedEvents"
})
public class MetaDataClass {

    @XmlElement(name = "Attributes")
    protected MetaDataAttributeList attributes;
    @XmlElement(name = "CanCreate")
    protected boolean canCreate;
    @XmlElement(name = "CanDestroy")
    protected boolean canDestroy;
    @XmlElement(name = "CanGet")
    protected boolean canGet;
    @XmlElement(name = "CanUpdate")
    protected boolean canUpdate;
    @XmlElement(name = "DerivedFrom")
    protected RNObjectType derivedFrom;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "IsMenu")
    protected boolean isMenu;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "MetaDataLink", required = true)
    protected String metaDataLink;
    @XmlElement(name = "Name", required = true)
    protected RNObjectType name;
    @XmlElement(name = "Relationships")
    protected List<MetaDataRelationship> relationships;
    @XmlElement(name = "SupportedEvents")
    protected SubscriptionEvents supportedEvents;

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public MetaDataAttributeList getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public void setAttributes(MetaDataAttributeList value) {
        this.attributes = value;
    }

    /**
     * ��ȡcanCreate���Ե�ֵ��
     * 
     */
    public boolean isCanCreate() {
        return canCreate;
    }

    /**
     * ����canCreate���Ե�ֵ��
     * 
     */
    public void setCanCreate(boolean value) {
        this.canCreate = value;
    }

    /**
     * ��ȡcanDestroy���Ե�ֵ��
     * 
     */
    public boolean isCanDestroy() {
        return canDestroy;
    }

    /**
     * ����canDestroy���Ե�ֵ��
     * 
     */
    public void setCanDestroy(boolean value) {
        this.canDestroy = value;
    }

    /**
     * ��ȡcanGet���Ե�ֵ��
     * 
     */
    public boolean isCanGet() {
        return canGet;
    }

    /**
     * ����canGet���Ե�ֵ��
     * 
     */
    public void setCanGet(boolean value) {
        this.canGet = value;
    }

    /**
     * ��ȡcanUpdate���Ե�ֵ��
     * 
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }

    /**
     * ����canUpdate���Ե�ֵ��
     * 
     */
    public void setCanUpdate(boolean value) {
        this.canUpdate = value;
    }

    /**
     * ��ȡderivedFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * ����derivedFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setDerivedFrom(RNObjectType value) {
        this.derivedFrom = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡisMenu���Ե�ֵ��
     * 
     */
    public boolean isIsMenu() {
        return isMenu;
    }

    /**
     * ����isMenu���Ե�ֵ��
     * 
     */
    public void setIsMenu(boolean value) {
        this.isMenu = value;
    }

    /**
     * ��ȡlabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * ����label���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * ��ȡmetaDataLink���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataLink() {
        return metaDataLink;
    }

    /**
     * ����metaDataLink���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataLink(String value) {
        this.metaDataLink = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setName(RNObjectType value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataRelationship }
     * 
     * 
     */
    public List<MetaDataRelationship> getRelationships() {
        if (relationships == null) {
            relationships = new ArrayList<MetaDataRelationship>();
        }
        return this.relationships;
    }

    /**
     * ��ȡsupportedEvents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvents }
     *     
     */
    public SubscriptionEvents getSupportedEvents() {
        return supportedEvents;
    }

    /**
     * ����supportedEvents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvents }
     *     
     */
    public void setSupportedEvents(SubscriptionEvents value) {
        this.supportedEvents = value;
    }

}
