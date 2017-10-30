
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentSearchConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSearchConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SortOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSortOptions" minOccurs="0"/>
 *         &lt;element name="Filters" type="{urn:knowledge.ws.rightnow.com/v1}DomainContentFilterList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}ContentSearchConstraintsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSearchConstraints", propOrder = {
    "limit",
    "start",
    "sortOptions",
    "filters",
    "validNullFields"
})
public class ContentSearchConstraints {

    @XmlElementRef(name = "Limit", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> limit;
    @XmlElementRef(name = "Start", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> start;
    @XmlElementRef(name = "SortOptions", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentSortOptions> sortOptions;
    @XmlElementRef(name = "Filters", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<DomainContentFilterList> filters;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<ContentSearchConstraintsNullFields> validNullFields;

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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStart(JAXBElement<Integer> value) {
        this.start = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentSortOptions }{@code >}
     *     
     */
    public JAXBElement<ContentSortOptions> getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentSortOptions }{@code >}
     *     
     */
    public void setSortOptions(JAXBElement<ContentSortOptions> value) {
        this.sortOptions = ((JAXBElement<ContentSortOptions> ) value);
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainContentFilterList }{@code >}
     *     
     */
    public JAXBElement<DomainContentFilterList> getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainContentFilterList }{@code >}
     *     
     */
    public void setFilters(JAXBElement<DomainContentFilterList> value) {
        this.filters = ((JAXBElement<DomainContentFilterList> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentSearchConstraintsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContentSearchConstraintsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentSearchConstraintsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContentSearchConstraintsNullFields> value) {
        this.validNullFields = ((JAXBElement<ContentSearchConstraintsNullFields> ) value);
    }

}
