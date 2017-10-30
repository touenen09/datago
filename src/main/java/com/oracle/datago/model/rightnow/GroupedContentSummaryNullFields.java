
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupedContentSummaryNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupedContentSummaryNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SummaryContents" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedContentSummaryNullFields", namespace = "urn:nullfields.ws.rightnow.com/v1")
public class GroupedContentSummaryNullFields {

    @XmlAttribute(name = "SummaryContents")
    protected Boolean summaryContents;

    /**
     * Gets the value of the summaryContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummaryContents() {
        if (summaryContents == null) {
            return false;
        } else {
            return summaryContents;
        }
    }

    /**
     * Sets the value of the summaryContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummaryContents(Boolean value) {
        this.summaryContents = value;
    }

}
