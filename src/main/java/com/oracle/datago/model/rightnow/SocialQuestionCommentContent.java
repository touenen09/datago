
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionCommentContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionCommentContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}Content">
 *       &lt;sequence>
 *         &lt;element name="CreatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyContentType" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="ContentLastUpdatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="RatingAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SocialQuestion" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="SocialQuestionCommentHierarchy" type="{urn:base.ws.rightnow.com/v1}NamedIDList" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1}SocialQuestionCommentStatuses" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="UpdatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SocialQuestionCommentContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionCommentContent", propOrder = {
    "createdBySocialUser",
    "body",
    "bodyContentType",
    "contentLastUpdatedBySocialUser",
    "parent",
    "ratingAdjustment",
    "socialQuestion",
    "socialQuestionCommentHierarchy",
    "statusWithType",
    "type",
    "updatedBySocialUser",
    "validNullFields"
})
public class SocialQuestionCommentContent
    extends Content
{

    @XmlElementRef(name = "CreatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> createdBySocialUser;
    @XmlElementRef(name = "Body", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<String> body;
    @XmlElementRef(name = "BodyContentType", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> bodyContentType;
    @XmlElementRef(name = "ContentLastUpdatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> contentLastUpdatedBySocialUser;
    @XmlElementRef(name = "Parent", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedIDHierarchy> parent;
    @XmlElement(name = "RatingAdjustment")
    protected Integer ratingAdjustment;
    @XmlElement(name = "SocialQuestion")
    protected NamedID socialQuestion;
    @XmlElement(name = "SocialQuestionCommentHierarchy")
    protected NamedIDList socialQuestionCommentHierarchy;
    @XmlElement(name = "StatusWithType")
    protected SocialQuestionCommentStatuses statusWithType;
    @XmlElement(name = "Type")
    protected NamedID type;
    @XmlElementRef(name = "UpdatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> updatedBySocialUser;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SocialQuestionCommentContentNullFields> validNullFields;

    /**
     * Gets the value of the createdBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCreatedBySocialUser() {
        return createdBySocialUser;
    }

    /**
     * Sets the value of the createdBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCreatedBySocialUser(JAXBElement<NamedID> value) {
        this.createdBySocialUser = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBody(JAXBElement<String> value) {
        this.body = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bodyContentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getBodyContentType() {
        return bodyContentType;
    }

    /**
     * Sets the value of the bodyContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setBodyContentType(JAXBElement<NamedID> value) {
        this.bodyContentType = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the contentLastUpdatedBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContentLastUpdatedBySocialUser() {
        return contentLastUpdatedBySocialUser;
    }

    /**
     * Sets the value of the contentLastUpdatedBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContentLastUpdatedBySocialUser(JAXBElement<NamedID> value) {
        this.contentLastUpdatedBySocialUser = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the parent property.
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
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setParent(JAXBElement<NamedIDHierarchy> value) {
        this.parent = ((JAXBElement<NamedIDHierarchy> ) value);
    }

    /**
     * Gets the value of the ratingAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingAdjustment() {
        return ratingAdjustment;
    }

    /**
     * Sets the value of the ratingAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingAdjustment(Integer value) {
        this.ratingAdjustment = value;
    }

    /**
     * Gets the value of the socialQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSocialQuestion() {
        return socialQuestion;
    }

    /**
     * Sets the value of the socialQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSocialQuestion(NamedID value) {
        this.socialQuestion = value;
    }

    /**
     * Gets the value of the socialQuestionCommentHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getSocialQuestionCommentHierarchy() {
        return socialQuestionCommentHierarchy;
    }

    /**
     * Sets the value of the socialQuestionCommentHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setSocialQuestionCommentHierarchy(NamedIDList value) {
        this.socialQuestionCommentHierarchy = value;
    }

    /**
     * Gets the value of the statusWithType property.
     * 
     * @return
     *     possible object is
     *     {@link SocialQuestionCommentStatuses }
     *     
     */
    public SocialQuestionCommentStatuses getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialQuestionCommentStatuses }
     *     
     */
    public void setStatusWithType(SocialQuestionCommentStatuses value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setType(NamedID value) {
        this.type = value;
    }

    /**
     * Gets the value of the updatedBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getUpdatedBySocialUser() {
        return updatedBySocialUser;
    }

    /**
     * Sets the value of the updatedBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setUpdatedBySocialUser(JAXBElement<NamedID> value) {
        this.updatedBySocialUser = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SocialQuestionCommentContentNullFields }{@code >}
     *     
     */
    public JAXBElement<SocialQuestionCommentContentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocialQuestionCommentContentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SocialQuestionCommentContentNullFields> value) {
        this.validNullFields = ((JAXBElement<SocialQuestionCommentContentNullFields> ) value);
    }

}
