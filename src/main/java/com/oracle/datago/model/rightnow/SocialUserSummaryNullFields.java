
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialUserSummaryNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialUserSummaryNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AvatarURL" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialUserSummaryNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class SocialUserSummaryNullFields {

    @XmlAttribute(name = "DisplayName")
    protected Boolean displayName;
    @XmlAttribute(name = "AvatarURL")
    protected Boolean avatarURL;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayName() {
        if (displayName == null) {
            return false;
        } else {
            return displayName;
        }
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the avatarURL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAvatarURL() {
        if (avatarURL == null) {
            return false;
        } else {
            return avatarURL;
        }
    }

    /**
     * Sets the value of the avatarURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvatarURL(Boolean value) {
        this.avatarURL = value;
    }

}
