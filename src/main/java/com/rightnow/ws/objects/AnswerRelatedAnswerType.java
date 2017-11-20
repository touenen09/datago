
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.ActionEnum;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.nullfields.v1_3.AnswerRelatedAnswerNullFields;


/**
 * <p>AnswerRelatedAnswer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AnswerRelatedAnswer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearnedStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManualStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SimilarityStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ToAnswer" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AnswerRelatedAnswerNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_3}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerRelatedAnswer", propOrder = {
    "learnedStrength",
    "manualStrength",
    "similarityStrength",
    "toAnswer",
    "validNullFields"
})
public class AnswerRelatedAnswerType {

    @XmlElement(name = "LearnedStrength")
    protected Integer learnedStrength;
    @XmlElementRef(name = "ManualStrength", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> manualStrength;
    @XmlElement(name = "SimilarityStrength")
    protected Integer similarityStrength;
    @XmlElement(name = "ToAnswer")
    protected NamedID toAnswer;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerRelatedAnswerNullFields> validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * ��ȡlearnedStrength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnedStrength() {
        return learnedStrength;
    }

    /**
     * ����learnedStrength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnedStrength(Integer value) {
        this.learnedStrength = value;
    }

    /**
     * ��ȡmanualStrength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManualStrength() {
        return manualStrength;
    }

    /**
     * ����manualStrength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManualStrength(JAXBElement<Integer> value) {
        this.manualStrength = value;
    }

    /**
     * ��ȡsimilarityStrength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimilarityStrength() {
        return similarityStrength;
    }

    /**
     * ����similarityStrength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimilarityStrength(Integer value) {
        this.similarityStrength = value;
    }

    /**
     * ��ȡtoAnswer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getToAnswer() {
        return toAnswer;
    }

    /**
     * ����toAnswer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setToAnswer(NamedID value) {
        this.toAnswer = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerNullFields }{@code >}
     *     
     */
    public JAXBElement<AnswerRelatedAnswerNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AnswerRelatedAnswerNullFields> value) {
        this.validNullFields = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
