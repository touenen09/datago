
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGroupedContentMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchGroupedContentMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentGroupedSearch" type="{urn:knowledge.ws.rightnow.com/v1}ContentGroupedSearch"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGroupedContentMsg", namespace = "urn:messages.ws.rightnow.com/v1", propOrder = {
    "contentGroupedSearch"
})
public class SearchGroupedContentMsg {

    @XmlElement(name = "ContentGroupedSearch", required = true)
    protected ContentGroupedSearch contentGroupedSearch;

    /**
     * Gets the value of the contentGroupedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ContentGroupedSearch }
     *     
     */
    public ContentGroupedSearch getContentGroupedSearch() {
        return contentGroupedSearch;
    }

    /**
     * Sets the value of the contentGroupedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentGroupedSearch }
     *     
     */
    public void setContentGroupedSearch(ContentGroupedSearch value) {
        this.contentGroupedSearch = value;
    }

}
