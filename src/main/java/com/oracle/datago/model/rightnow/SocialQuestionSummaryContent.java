
package com.oracle.datago.model.rightnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialQuestionSummaryContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialQuestionSummaryContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}SummaryContent">
 *       &lt;sequence>
 *         &lt;element name="CreatedBySocialUser" type="{urn:knowledge.ws.rightnow.com/v1}SocialUserSummary" minOccurs="0"/>
 *         &lt;element name="NumberOfComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfBestAnswers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialQuestionSummaryContent", propOrder = {
    "createdBySocialUser",
    "numberOfComments",
    "numberOfBestAnswers"
})
public class SocialQuestionSummaryContent
    extends SummaryContent
{

    @XmlElement(name = "CreatedBySocialUser")
    protected SocialUserSummary createdBySocialUser;
    @XmlElement(name = "NumberOfComments")
    protected Integer numberOfComments;
    @XmlElement(name = "NumberOfBestAnswers")
    protected Integer numberOfBestAnswers;

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
     * Gets the value of the numberOfComments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    /**
     * Sets the value of the numberOfComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfComments(Integer value) {
        this.numberOfComments = value;
    }

    /**
     * Gets the value of the numberOfBestAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBestAnswers() {
        return numberOfBestAnswers;
    }

    /**
     * Sets the value of the numberOfBestAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBestAnswers(Integer value) {
        this.numberOfBestAnswers = value;
    }

}
