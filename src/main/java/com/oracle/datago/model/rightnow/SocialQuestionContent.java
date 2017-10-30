
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}Content">
 *       &lt;sequence>
 *         &lt;element name="CreatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="BestSocialQuestionAnswers" type="{urn:objects.ws.rightnow.com/v1}BestSocialQuestionAnswerList" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyContentType" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ContentLastUpdatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="RatingAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1}SocialQuestionStatuses" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedBySocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SocialQuestionContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionContent", propOrder = {
    "createdBySocialUser",
    "bestSocialQuestionAnswers",
    "body",
    "bodyContentType",
    "category",
    "contentLastUpdatedBySocialUser",
    "language",
    "product",
    "ratingAdjustment",
    "statusWithType",
    "subject",
    "updatedBySocialUser",
    "validNullFields"
})
public class SocialQuestionContent
    extends Content
{

    @XmlElementRef(name = "CreatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> createdBySocialUser;
    @XmlElementRef(name = "BestSocialQuestionAnswers", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<BestSocialQuestionAnswerList> bestSocialQuestionAnswers;
    @XmlElementRef(name = "Body", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<String> body;
    @XmlElementRef(name = "BodyContentType", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> bodyContentType;
    @XmlElementRef(name = "Category", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedIDHierarchy> category;
    @XmlElementRef(name = "ContentLastUpdatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> contentLastUpdatedBySocialUser;
    @XmlElementRef(name = "Language", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> language;
    @XmlElementRef(name = "Product", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedIDHierarchy> product;
    @XmlElement(name = "RatingAdjustment")
    protected Integer ratingAdjustment;
    @XmlElement(name = "StatusWithType")
    protected SocialQuestionStatuses statusWithType;
    @XmlElementRef(name = "Subject", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "UpdatedBySocialUser", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> updatedBySocialUser;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SocialQuestionContentNullFields> validNullFields;

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
     * Gets the value of the bestSocialQuestionAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerList }{@code >}
     *     
     */
    public JAXBElement<BestSocialQuestionAnswerList> getBestSocialQuestionAnswers() {
        return bestSocialQuestionAnswers;
    }

    /**
     * Sets the value of the bestSocialQuestionAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerList }{@code >}
     *     
     */
    public void setBestSocialQuestionAnswers(JAXBElement<BestSocialQuestionAnswerList> value) {
        this.bestSocialQuestionAnswers = ((JAXBElement<BestSocialQuestionAnswerList> ) value);
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setCategory(JAXBElement<NamedIDHierarchy> value) {
        this.category = ((JAXBElement<NamedIDHierarchy> ) value);
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<NamedID> value) {
        this.language = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setProduct(JAXBElement<NamedIDHierarchy> value) {
        this.product = ((JAXBElement<NamedIDHierarchy> ) value);
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
     * Gets the value of the statusWithType property.
     * 
     * @return
     *     possible object is
     *     {@link SocialQuestionStatuses }
     *     
     */
    public SocialQuestionStatuses getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialQuestionStatuses }
     *     
     */
    public void setStatusWithType(SocialQuestionStatuses value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link SocialQuestionContentNullFields }{@code >}
     *     
     */
    public JAXBElement<SocialQuestionContentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocialQuestionContentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SocialQuestionContentNullFields> value) {
        this.validNullFields = ((JAXBElement<SocialQuestionContentNullFields> ) value);
    }

}
