
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartAssistantSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAssistantSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Filters" type="{urn:knowledge.ws.rightnow.com/v1}ContentFilterList" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SmartAssistantSearchNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAssistantSearch", propOrder = {
    "sessionToken",
    "subject",
    "body",
    "filters",
    "securityOptions",
    "limit",
    "validNullFields"
})
public class SmartAssistantSearch {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Body", required = true)
    protected String body;
    @XmlElementRef(name = "Filters", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentFilterList> filters;
    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;
    @XmlElementRef(name = "Limit", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> limit;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SmartAssistantSearchNullFields> validNullFields;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}
     *     
     */
    public JAXBElement<ContentFilterList> getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}
     *     
     */
    public void setFilters(JAXBElement<ContentFilterList> value) {
        this.filters = ((JAXBElement<ContentFilterList> ) value);
    }

    /**
     * Gets the value of the securityOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public ContentSecurityOptions getSecurityOptions() {
        return securityOptions;
    }

    /**
     * Sets the value of the securityOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public void setSecurityOptions(ContentSecurityOptions value) {
        this.securityOptions = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLimit(JAXBElement<Integer> value) {
        this.limit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSearchNullFields }{@code >}
     *     
     */
    public JAXBElement<SmartAssistantSearchNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSearchNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SmartAssistantSearchNullFields> value) {
        this.validNullFields = ((JAXBElement<SmartAssistantSearchNullFields> ) value);
    }

}
