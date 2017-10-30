
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmartAssistantSuggestionsExtendedMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartAssistantSuggestionsExtendedMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartAssistantSuggestions" type="{urn:knowledge.ws.rightnow.com/v1}SmartAssistantSuggestions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartAssistantSuggestionsExtendedMsg", namespace = "urn:messages.ws.rightnow.com/v1", propOrder = {
    "smartAssistantSuggestions"
})
public class GetSmartAssistantSuggestionsExtendedMsg {

    @XmlElement(name = "SmartAssistantSuggestions", required = true)
    protected SmartAssistantSuggestions smartAssistantSuggestions;

    /**
     * Gets the value of the smartAssistantSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link SmartAssistantSuggestions }
     *     
     */
    public SmartAssistantSuggestions getSmartAssistantSuggestions() {
        return smartAssistantSuggestions;
    }

    /**
     * Sets the value of the smartAssistantSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartAssistantSuggestions }
     *     
     */
    public void setSmartAssistantSuggestions(SmartAssistantSuggestions value) {
        this.smartAssistantSuggestions = value;
    }

}
