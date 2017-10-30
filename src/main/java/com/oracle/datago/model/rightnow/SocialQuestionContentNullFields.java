
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionContentNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionContentNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CreatedBySocialUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BestSocialQuestionAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Body" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BodyContentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ContentLastUpdatedBySocialUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionContentNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class SocialQuestionContentNullFields {

    @XmlAttribute(name = "CreatedBySocialUser")
    protected Boolean createdBySocialUser;
    @XmlAttribute(name = "BestSocialQuestionAnswers")
    protected Boolean bestSocialQuestionAnswers;
    @XmlAttribute(name = "Body")
    protected Boolean body;
    @XmlAttribute(name = "BodyContentType")
    protected Boolean bodyContentType;
    @XmlAttribute(name = "Category")
    protected Boolean category;
    @XmlAttribute(name = "ContentLastUpdatedBySocialUser")
    protected Boolean contentLastUpdatedBySocialUser;
    @XmlAttribute(name = "Language")
    protected Boolean language;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "Subject")
    protected Boolean subject;

    /**
     * Gets the value of the createdBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreatedBySocialUser() {
        if (createdBySocialUser == null) {
            return false;
        } else {
            return createdBySocialUser;
        }
    }

    /**
     * Sets the value of the createdBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedBySocialUser(Boolean value) {
        this.createdBySocialUser = value;
    }

    /**
     * Gets the value of the bestSocialQuestionAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBestSocialQuestionAnswers() {
        if (bestSocialQuestionAnswers == null) {
            return false;
        } else {
            return bestSocialQuestionAnswers;
        }
    }

    /**
     * Sets the value of the bestSocialQuestionAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestSocialQuestionAnswers(Boolean value) {
        this.bestSocialQuestionAnswers = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBody() {
        if (body == null) {
            return false;
        } else {
            return body;
        }
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBody(Boolean value) {
        this.body = value;
    }

    /**
     * Gets the value of the bodyContentType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBodyContentType() {
        if (bodyContentType == null) {
            return false;
        } else {
            return bodyContentType;
        }
    }

    /**
     * Sets the value of the bodyContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBodyContentType(Boolean value) {
        this.bodyContentType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategory() {
        if (category == null) {
            return false;
        } else {
            return category;
        }
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory(Boolean value) {
        this.category = value;
    }

    /**
     * Gets the value of the contentLastUpdatedBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContentLastUpdatedBySocialUser() {
        if (contentLastUpdatedBySocialUser == null) {
            return false;
        } else {
            return contentLastUpdatedBySocialUser;
        }
    }

    /**
     * Sets the value of the contentLastUpdatedBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentLastUpdatedBySocialUser(Boolean value) {
        this.contentLastUpdatedBySocialUser = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLanguage() {
        if (language == null) {
            return false;
        } else {
            return language;
        }
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguage(Boolean value) {
        this.language = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSubject() {
        if (subject == null) {
            return false;
        } else {
            return subject;
        }
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubject(Boolean value) {
        this.subject = value;
    }

}
