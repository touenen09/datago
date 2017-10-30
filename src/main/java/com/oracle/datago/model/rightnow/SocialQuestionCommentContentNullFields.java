
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionCommentContentNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionCommentContentNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CreatedBySocialUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Body" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BodyContentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ContentLastUpdatedBySocialUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionCommentContentNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class SocialQuestionCommentContentNullFields {

    @XmlAttribute(name = "CreatedBySocialUser")
    protected Boolean createdBySocialUser;
    @XmlAttribute(name = "Body")
    protected Boolean body;
    @XmlAttribute(name = "BodyContentType")
    protected Boolean bodyContentType;
    @XmlAttribute(name = "ContentLastUpdatedBySocialUser")
    protected Boolean contentLastUpdatedBySocialUser;
    @XmlAttribute(name = "Parent")
    protected Boolean parent;

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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParent() {
        if (parent == null) {
            return false;
        } else {
            return parent;
        }
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParent(Boolean value) {
        this.parent = value;
    }

}
