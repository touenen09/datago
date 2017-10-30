
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentGroupedSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentGroupedSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InteractionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchOrigin" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="SearchConstraints" type="{urn:knowledge.ws.rightnow.com/v1}ContentSearchConstraintsList" minOccurs="0"/>
 *         &lt;element name="IncludeRelatedSearches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeSpellingSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *         &lt;element name="Results" type="{urn:knowledge.ws.rightnow.com/v1}GroupedSearchResponse" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}ContentGroupedSearchNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentGroupedSearch", propOrder = {
    "interactionToken",
    "searchTerms",
    "searchOrigin",
    "searchConstraints",
    "includeRelatedSearches",
    "includeSpellingSuggestions",
    "securityOptions",
    "results",
    "validNullFields"
})
public class ContentGroupedSearch {

    @XmlElement(name = "InteractionToken")
    protected String interactionToken;
    @XmlElement(name = "SearchTerms")
    protected String searchTerms;
    @XmlElementRef(name = "SearchOrigin", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<NamedID> searchOrigin;
    @XmlElementRef(name = "SearchConstraints", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentSearchConstraintsList> searchConstraints;
    @XmlElementRef(name = "IncludeRelatedSearches", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Boolean> includeRelatedSearches;
    @XmlElementRef(name = "IncludeSpellingSuggestions", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Boolean> includeSpellingSuggestions;
    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;
    @XmlElement(name = "Results")
    protected GroupedSearchResponse results;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentGroupedSearchNullFields> validNullFields;

    /**
     * Gets the value of the interactionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionToken() {
        return interactionToken;
    }

    /**
     * Sets the value of the interactionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionToken(String value) {
        this.interactionToken = value;
    }

    /**
     * Gets the value of the searchTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the value of the searchOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSearchOrigin() {
        return searchOrigin;
    }

    /**
     * Sets the value of the searchOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSearchOrigin(JAXBElement<NamedID> value) {
        this.searchOrigin = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the searchConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentSearchConstraintsList }{@code >}
     *     
     */
    public JAXBElement<ContentSearchConstraintsList> getSearchConstraints() {
        return searchConstraints;
    }

    /**
     * Sets the value of the searchConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentSearchConstraintsList }{@code >}
     *     
     */
    public void setSearchConstraints(JAXBElement<ContentSearchConstraintsList> value) {
        this.searchConstraints = ((JAXBElement<ContentSearchConstraintsList> ) value);
    }

    /**
     * Gets the value of the includeRelatedSearches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludeRelatedSearches() {
        return includeRelatedSearches;
    }

    /**
     * Sets the value of the includeRelatedSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludeRelatedSearches(JAXBElement<Boolean> value) {
        this.includeRelatedSearches = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the includeSpellingSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludeSpellingSuggestions() {
        return includeSpellingSuggestions;
    }

    /**
     * Sets the value of the includeSpellingSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludeSpellingSuggestions(JAXBElement<Boolean> value) {
        this.includeSpellingSuggestions = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link GroupedSearchResponse }
     *     
     */
    public GroupedSearchResponse getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedSearchResponse }
     *     
     */
    public void setResults(GroupedSearchResponse value) {
        this.results = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentGroupedSearchNullFields }{@code >}
     *     
     */
    public JAXBElement<ContentGroupedSearchNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentGroupedSearchNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContentGroupedSearchNullFields> value) {
        this.validNullFields = ((JAXBElement<ContentGroupedSearchNullFields> ) value);
    }

}
