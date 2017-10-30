
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartAssistantSuggestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAssistantSuggestions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filters" type="{urn:knowledge.ws.rightnow.com/v1}ContentFilterList" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *         &lt;element name="KeyValueItems" type="{urn:knowledge.ws.rightnow.com/v1}KeyValueItemList" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SmartAssistantSuggestionsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAssistantSuggestions", propOrder = {
    "sessionToken",
    "detailedDescription",
    "summary",
    "filters",
    "securityOptions",
    "keyValueItems",
    "limit",
    "validNullFields"
})
public class SmartAssistantSuggestions {

    @XmlElement(name = "SessionToken")
    protected String sessionToken;
    @XmlElement(name = "DetailedDescription")
    protected String detailedDescription;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElementRef(name = "Filters", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentFilterList> filters;
    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;
    @XmlElementRef(name = "KeyValueItems", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<KeyValueItemList> keyValueItems;
    @XmlElementRef(name = "Limit", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> limit;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SmartAssistantSuggestionsNullFields> validNullFields;

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
     * Gets the value of the detailedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * Sets the value of the detailedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedDescription(String value) {
        this.detailedDescription = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
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
     * Gets the value of the keyValueItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KeyValueItemList }{@code >}
     *     
     */
    public JAXBElement<KeyValueItemList> getKeyValueItems() {
        return keyValueItems;
    }

    /**
     * Sets the value of the keyValueItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KeyValueItemList }{@code >}
     *     
     */
    public void setKeyValueItems(JAXBElement<KeyValueItemList> value) {
        this.keyValueItems = ((JAXBElement<KeyValueItemList> ) value);
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
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsNullFields }{@code >}
     *     
     */
    public JAXBElement<SmartAssistantSuggestionsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SmartAssistantSuggestionsNullFields> value) {
        this.validNullFields = ((JAXBElement<SmartAssistantSuggestionsNullFields> ) value);
    }

}
