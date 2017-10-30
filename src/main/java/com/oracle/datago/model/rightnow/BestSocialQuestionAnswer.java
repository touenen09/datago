
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BestSocialQuestionAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestSocialQuestionAnswer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1}ID" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BestAnswerType" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="SocialQuestionComment" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="SocialUser" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}BestSocialQuestionAnswerNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestSocialQuestionAnswer", namespace = "urn:objects.ws.rightnow.com/v1", propOrder = {
    "id",
    "createdTime",
    "bestAnswerType",
    "socialQuestionComment",
    "socialUser",
    "validNullFields"
})
public class BestSocialQuestionAnswer {

    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "BestAnswerType")
    protected NamedID bestAnswerType;
    @XmlElement(name = "SocialQuestionComment")
    protected NamedID socialQuestionComment;
    @XmlElementRef(name = "SocialUser", namespace = "urn:objects.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> socialUser;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<BestSocialQuestionAnswerNullFields> validNullFields;
    @XmlAttribute
    protected ActionEnum action;

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
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the bestAnswerType property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getBestAnswerType() {
        return bestAnswerType;
    }

    /**
     * Sets the value of the bestAnswerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setBestAnswerType(NamedID value) {
        this.bestAnswerType = value;
    }

    /**
     * Gets the value of the socialQuestionComment property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSocialQuestionComment() {
        return socialQuestionComment;
    }

    /**
     * Sets the value of the socialQuestionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSocialQuestionComment(NamedID value) {
        this.socialQuestionComment = value;
    }

    /**
     * Gets the value of the socialUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSocialUser() {
        return socialUser;
    }

    /**
     * Sets the value of the socialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSocialUser(JAXBElement<NamedID> value) {
        this.socialUser = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerNullFields }{@code >}
     *     
     */
    public JAXBElement<BestSocialQuestionAnswerNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<BestSocialQuestionAnswerNullFields> value) {
        this.validNullFields = ((JAXBElement<BestSocialQuestionAnswerNullFields> ) value);
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
