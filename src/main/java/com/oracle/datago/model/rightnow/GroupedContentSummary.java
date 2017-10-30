
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupedContentSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupedContentSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentType" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="NumberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummaryContents" type="{urn:knowledge.ws.rightnow.com/v1}SummaryContentList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}GroupedContentSummaryNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedContentSummary", propOrder = {
    "contentType",
    "numberOfResults",
    "displayOrder",
    "summaryContents",
    "validNullFields"
})
public class GroupedContentSummary {

    @XmlElement(name = "ContentType")
    protected NamedID contentType;
    @XmlElement(name = "NumberOfResults")
    protected Integer numberOfResults;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "SummaryContents", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<SummaryContentList> summaryContents;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class)
    protected JAXBElement<GroupedContentSummaryNullFields> validNullFields;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setContentType(NamedID value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the summaryContents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}
     *     
     */
    public JAXBElement<SummaryContentList> getSummaryContents() {
        return summaryContents;
    }

    /**
     * Sets the value of the summaryContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}
     *     
     */
    public void setSummaryContents(JAXBElement<SummaryContentList> value) {
        this.summaryContents = ((JAXBElement<SummaryContentList> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupedContentSummaryNullFields }{@code >}
     *     
     */
    public JAXBElement<GroupedContentSummaryNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupedContentSummaryNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<GroupedContentSummaryNullFields> value) {
        this.validNullFields = ((JAXBElement<GroupedContentSummaryNullFields> ) value);
    }

}
