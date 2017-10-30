
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialUserSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialUserSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1}ID" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvatarURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:knowledge.ws.rightnow.com/v1}SocialUserStatusesSummary" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SocialUserSummaryNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialUserSummary", propOrder = {
    "id",
    "displayName",
    "avatarURL",
    "statusWithType",
    "validNullFields"
})
public class SocialUserSummary {

    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "DisplayName", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "AvatarURL", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<String> avatarURL;
    @XmlElement(name = "StatusWithType")
    protected SocialUserStatusesSummary statusWithType;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SocialUserSummaryNullFields> validNullFields;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the displayName property.
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
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the avatarURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvatarURL() {
        return avatarURL;
    }

    /**
     * Sets the value of the avatarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvatarURL(JAXBElement<String> value) {
        this.avatarURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusWithType property.
     * 
     * @return
     *     possible object is
     *     {@link SocialUserStatusesSummary }
     *     
     */
    public SocialUserStatusesSummary getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialUserStatusesSummary }
     *     
     */
    public void setStatusWithType(SocialUserStatusesSummary value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SocialUserSummaryNullFields }{@code >}
     *     
     */
    public JAXBElement<SocialUserSummaryNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocialUserSummaryNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SocialUserSummaryNullFields> value) {
        this.validNullFields = ((JAXBElement<SocialUserSummaryNullFields> ) value);
    }

}
