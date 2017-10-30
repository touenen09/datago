
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGroupedContentResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchGroupedContentResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupedSearchResponse" type="{urn:knowledge.ws.rightnow.com/v1}GroupedSearchResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGroupedContentResponseMsg", namespace = "urn:messages.ws.rightnow.com/v1", propOrder = {
    "groupedSearchResponse"
})
public class SearchGroupedContentResponseMsg {

    @XmlElement(name = "GroupedSearchResponse", required = true)
    protected GroupedSearchResponse groupedSearchResponse;

    /**
     * Gets the value of the groupedSearchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GroupedSearchResponse }
     *     
     */
    public GroupedSearchResponse getGroupedSearchResponse() {
        return groupedSearchResponse;
    }

    /**
     * Sets the value of the groupedSearchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedSearchResponse }
     *     
     */
    public void setGroupedSearchResponse(GroupedSearchResponse value) {
        this.groupedSearchResponse = value;
    }

}
