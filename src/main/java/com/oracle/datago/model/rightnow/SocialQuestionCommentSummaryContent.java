
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionCommentSummaryContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionCommentSummaryContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}SummaryContent">
 *       &lt;sequence>
 *         &lt;element name="CreatedBySocialUser" type="{urn:knowledge.ws.rightnow.com/v1}SocialUserSummary" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionCommentSummaryContent", propOrder = {
    "createdBySocialUser",
    "rating"
})
public class SocialQuestionCommentSummaryContent
    extends SummaryContent
{

    @XmlElement(name = "CreatedBySocialUser")
    protected SocialUserSummary createdBySocialUser;
    @XmlElement(name = "Rating")
    protected Integer rating;

    /**
     * Gets the value of the createdBySocialUser property.
     * 
     * @return
     *     possible object is
     *     {@link SocialUserSummary }
     *     
     */
    public SocialUserSummary getCreatedBySocialUser() {
        return createdBySocialUser;
    }

    /**
     * Sets the value of the createdBySocialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialUserSummary }
     *     
     */
    public void setCreatedBySocialUser(SocialUserSummary value) {
        this.createdBySocialUser = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRating(Integer value) {
        this.rating = value;
    }

}
