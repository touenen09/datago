
package com.oracle.datago.model.rightnow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentSearchConstraintsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSearchConstraintsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentSearchConstraintsList" type="{urn:knowledge.ws.rightnow.com/v1}ContentSearchConstraints" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSearchConstraintsList", propOrder = {
    "contentSearchConstraintsList"
})
public class ContentSearchConstraintsList {

    @XmlElement(name = "ContentSearchConstraintsList")
    protected List<ContentSearchConstraints> contentSearchConstraintsList;

    /**
     * Gets the value of the contentSearchConstraintsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSearchConstraintsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSearchConstraintsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentSearchConstraints }
     * 
     * 
     */
    public List<ContentSearchConstraints> getContentSearchConstraintsList() {
        if (contentSearchConstraintsList == null) {
            contentSearchConstraintsList = new ArrayList<ContentSearchConstraints>();
        }
        return this.contentSearchConstraintsList;
    }

}
