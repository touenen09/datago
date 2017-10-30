
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupedSearchResponseNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupedSearchResponseNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="GroupedSummaries" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedSearchResponseNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class GroupedSearchResponseNullFields {

    @XmlAttribute(name = "GroupedSummaries")
    protected Boolean groupedSummaries;

    /**
     * Gets the value of the groupedSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGroupedSummaries() {
        if (groupedSummaries == null) {
            return false;
        } else {
            return groupedSummaries;
        }
    }

    /**
     * Sets the value of the groupedSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupedSummaries(Boolean value) {
        this.groupedSummaries = value;
    }

}
