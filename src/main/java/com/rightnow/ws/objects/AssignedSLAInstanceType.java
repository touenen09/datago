
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.ID;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.nullfields.v1_3.AssignedSLAInstanceNullFields;


/**
 * <p>AssignedSLAInstance complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AssignedSLAInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="NameOfSLA" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="RemainingFromChat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromCSR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromEmail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromWeb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SLASet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StateOfSLA" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AssignedSLAInstanceNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedSLAInstance", propOrder = {
    "activeDate",
    "expireDate",
    "id",
    "nameOfSLA",
    "remainingFromChat",
    "remainingFromCSR",
    "remainingFromEmail",
    "remainingFromWeb",
    "remainingTotal",
    "slaSet",
    "stateOfSLA",
    "validNullFields"
})
public class AssignedSLAInstanceType {

    @XmlElement(name = "ActiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "NameOfSLA", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> nameOfSLA;
    @XmlElementRef(name = "RemainingFromChat", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remainingFromChat;
    @XmlElementRef(name = "RemainingFromCSR", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remainingFromCSR;
    @XmlElementRef(name = "RemainingFromEmail", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remainingFromEmail;
    @XmlElementRef(name = "RemainingFromWeb", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remainingFromWeb;
    @XmlElementRef(name = "RemainingTotal", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remainingTotal;
    @XmlElement(name = "SLASet")
    protected Integer slaSet;
    @XmlElement(name = "StateOfSLA")
    protected NamedID stateOfSLA;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AssignedSLAInstanceNullFields> validNullFields;

    /**
     * ��ȡactiveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * ����activeDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * ��ȡnameOfSLA���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getNameOfSLA() {
        return nameOfSLA;
    }

    /**
     * ����nameOfSLA���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setNameOfSLA(JAXBElement<NamedID> value) {
        this.nameOfSLA = value;
    }

    /**
     * ��ȡremainingFromChat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemainingFromChat() {
        return remainingFromChat;
    }

    /**
     * ����remainingFromChat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemainingFromChat(JAXBElement<Integer> value) {
        this.remainingFromChat = value;
    }

    /**
     * ��ȡremainingFromCSR���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemainingFromCSR() {
        return remainingFromCSR;
    }

    /**
     * ����remainingFromCSR���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemainingFromCSR(JAXBElement<Integer> value) {
        this.remainingFromCSR = value;
    }

    /**
     * ��ȡremainingFromEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemainingFromEmail() {
        return remainingFromEmail;
    }

    /**
     * ����remainingFromEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemainingFromEmail(JAXBElement<Integer> value) {
        this.remainingFromEmail = value;
    }

    /**
     * ��ȡremainingFromWeb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemainingFromWeb() {
        return remainingFromWeb;
    }

    /**
     * ����remainingFromWeb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemainingFromWeb(JAXBElement<Integer> value) {
        this.remainingFromWeb = value;
    }

    /**
     * ��ȡremainingTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemainingTotal() {
        return remainingTotal;
    }

    /**
     * ����remainingTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemainingTotal(JAXBElement<Integer> value) {
        this.remainingTotal = value;
    }

    /**
     * ��ȡslaSet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSLASet() {
        return slaSet;
    }

    /**
     * ����slaSet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSLASet(Integer value) {
        this.slaSet = value;
    }

    /**
     * ��ȡstateOfSLA���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStateOfSLA() {
        return stateOfSLA;
    }

    /**
     * ����stateOfSLA���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStateOfSLA(NamedID value) {
        this.stateOfSLA = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstanceNullFields }{@code >}
     *     
     */
    public JAXBElement<AssignedSLAInstanceNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssignedSLAInstanceNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AssignedSLAInstanceNullFields> value) {
        this.validNullFields = value;
    }

}
