
package com.oracle.datago.model.rightnow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupedSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupedSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:knowledge.ws.rightnow.com/v1}ContentRequestStatus" minOccurs="0"/>
 *         &lt;element name="GroupedSummaries" type="{urn:knowledge.ws.rightnow.com/v1}GroupedContentSummaryList" minOccurs="0"/>
 *         &lt;element name="SimilarSearches" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpellingSuggestions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}GroupedSearchResponseNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedSearchResponse", propOrder = {
    "status",
    "groupedSummaries",
    "similarSearches",
    "spellingSuggestions",
    "totalResults",
    "validNullFields"
})
public class GroupedSearchResponse {

    @XmlElement(name = "Status")
    protected ContentRequestStatus status;
    @XmlElementRef(name = "GroupedSummaries", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<GroupedContentSummaryList> groupedSummaries;
    @XmlElement(name = "SimilarSearches")
    protected List<String> similarSearches;
    @XmlElement(name = "SpellingSuggestions")
    protected List<String> spellingSuggestions;
    @XmlElement(name = "TotalResults")
    protected Integer totalResults;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<GroupedSearchResponseNullFields> validNullFields;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRequestStatus }
     *     
     */
    public ContentRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRequestStatus }
     *     
     */
    public void setStatus(ContentRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the groupedSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupedContentSummaryList }{@code >}
     *     
     */
    public JAXBElement<GroupedContentSummaryList> getGroupedSummaries() {
        return groupedSummaries;
    }

    /**
     * Sets the value of the groupedSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupedContentSummaryList }{@code >}
     *     
     */
    public void setGroupedSummaries(JAXBElement<GroupedContentSummaryList> value) {
        this.groupedSummaries = ((JAXBElement<GroupedContentSummaryList> ) value);
    }

    /**
     * Gets the value of the similarSearches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the similarSearches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimilarSearches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSimilarSearches() {
        if (similarSearches == null) {
            similarSearches = new ArrayList<String>();
        }
        return this.similarSearches;
    }

    /**
     * Gets the value of the spellingSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellingSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpellingSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpellingSuggestions() {
        if (spellingSuggestions == null) {
            spellingSuggestions = new ArrayList<String>();
        }
        return this.spellingSuggestions;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalResults(Integer value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupedSearchResponseNullFields }{@code >}
     *     
     */
    public JAXBElement<GroupedSearchResponseNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupedSearchResponseNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<GroupedSearchResponseNullFields> value) {
        this.validNullFields = ((JAXBElement<GroupedSearchResponseNullFields> ) value);
    }

}
