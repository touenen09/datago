
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartAssistantSuggestionsNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAssistantSuggestionsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Filters" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="KeyValueItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAssistantSuggestionsNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class SmartAssistantSuggestionsNullFields {

    @XmlAttribute(name = "Filters")
    protected Boolean filters;
    @XmlAttribute(name = "KeyValueItems")
    protected Boolean keyValueItems;
    @XmlAttribute(name = "Limit")
    protected Boolean limit;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilters() {
        if (filters == null) {
            return false;
        } else {
            return filters;
        }
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilters(Boolean value) {
        this.filters = value;
    }

    /**
     * Gets the value of the keyValueItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeyValueItems() {
        if (keyValueItems == null) {
            return false;
        } else {
            return keyValueItems;
        }
    }

    /**
     * Sets the value of the keyValueItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyValueItems(Boolean value) {
        this.keyValueItems = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLimit() {
        if (limit == null) {
            return false;
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimit(Boolean value) {
        this.limit = value;
    }

}
