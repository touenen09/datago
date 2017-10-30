
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestSocialQuestionAnswerNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestSocialQuestionAnswerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SocialUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestSocialQuestionAnswerNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class BestSocialQuestionAnswerNullFields {

    @XmlAttribute(name = "SocialUser")
    protected Boolean socialUser;

    /**
     * Gets the value of the socialUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSocialUser() {
        if (socialUser == null) {
            return false;
        } else {
            return socialUser;
        }
    }

    /**
     * Sets the value of the socialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSocialUser(Boolean value) {
        this.socialUser = value;
    }

}
