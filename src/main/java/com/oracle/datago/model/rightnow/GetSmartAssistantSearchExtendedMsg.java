
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmartAssistantSearchExtendedMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartAssistantSearchExtendedMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartAssistantSearch" type="{urn:knowledge.ws.rightnow.com/v1}SmartAssistantSearch"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartAssistantSearchExtendedMsg", namespace = "urn:messages.ws.rightnow.com/v1", propOrder = {
    "smartAssistantSearch"
})
public class GetSmartAssistantSearchExtendedMsg {

    @XmlElement(name = "SmartAssistantSearch", required = true)
    protected SmartAssistantSearch smartAssistantSearch;

    /**
     * Gets the value of the smartAssistantSearch property.
     * 
     * @return
     *     possible object is
     *     {@link SmartAssistantSearch }
     *     
     */
    public SmartAssistantSearch getSmartAssistantSearch() {
        return smartAssistantSearch;
    }

    /**
     * Sets the value of the smartAssistantSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartAssistantSearch }
     *     
     */
    public void setSmartAssistantSearch(SmartAssistantSearch value) {
        this.smartAssistantSearch = value;
    }

}
