
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentGroupedSearchNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentGroupedSearchNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SearchOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SearchConstraints" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncludeRelatedSearches" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncludeSpellingSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentGroupedSearchNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class ContentGroupedSearchNullFields {

    @XmlAttribute(name = "SearchOrigin")
    protected Boolean searchOrigin;
    @XmlAttribute(name = "SearchConstraints")
    protected Boolean searchConstraints;
    @XmlAttribute(name = "IncludeRelatedSearches")
    protected Boolean includeRelatedSearches;
    @XmlAttribute(name = "IncludeSpellingSuggestions")
    protected Boolean includeSpellingSuggestions;

    /**
     * Gets the value of the searchOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSearchOrigin() {
        if (searchOrigin == null) {
            return false;
        } else {
            return searchOrigin;
        }
    }

    /**
     * Sets the value of the searchOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchOrigin(Boolean value) {
        this.searchOrigin = value;
    }

    /**
     * Gets the value of the searchConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSearchConstraints() {
        if (searchConstraints == null) {
            return false;
        } else {
            return searchConstraints;
        }
    }

    /**
     * Sets the value of the searchConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchConstraints(Boolean value) {
        this.searchConstraints = value;
    }

    /**
     * Gets the value of the includeRelatedSearches property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeRelatedSearches() {
        if (includeRelatedSearches == null) {
            return false;
        } else {
            return includeRelatedSearches;
        }
    }

    /**
     * Sets the value of the includeRelatedSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRelatedSearches(Boolean value) {
        this.includeRelatedSearches = value;
    }

    /**
     * Gets the value of the includeSpellingSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSpellingSuggestions() {
        if (includeSpellingSuggestions == null) {
            return false;
        } else {
            return includeSpellingSuggestions;
        }
    }

    /**
     * Sets the value of the includeSpellingSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSpellingSuggestions(Boolean value) {
        this.includeSpellingSuggestions = value;
    }

}
