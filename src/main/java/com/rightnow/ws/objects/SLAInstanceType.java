
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.ActionEnum;
import com.rightnow.ws.base.v1_3.ID;
import com.rightnow.ws.base.v1_3.NamedID;


/**
 * <p>SLAInstance complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SLAInstance">
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
@XmlType(name = "SLAInstance", propOrder = {
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
    "stateOfSLA"
})
public class SLAInstanceType {

    @XmlElement(name = "ActiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "NameOfSLA")
    protected NamedID nameOfSLA;
    @XmlElement(name = "RemainingFromChat")
    protected Integer remainingFromChat;
    @XmlElement(name = "RemainingFromCSR")
    protected Integer remainingFromCSR;
    @XmlElement(name = "RemainingFromEmail")
    protected Integer remainingFromEmail;
    @XmlElement(name = "RemainingFromWeb")
    protected Integer remainingFromWeb;
    @XmlElement(name = "RemainingTotal")
    protected Integer remainingTotal;
    @XmlElement(name = "SLASet")
    protected Integer slaSet;
    @XmlElement(name = "StateOfSLA")
    protected NamedID stateOfSLA;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

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
     *     {@link NamedID }
     *     
     */
    public NamedID getNameOfSLA() {
        return nameOfSLA;
    }

    /**
     * ����nameOfSLA���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setNameOfSLA(NamedID value) {
        this.nameOfSLA = value;
    }

    /**
     * ��ȡremainingFromChat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromChat() {
        return remainingFromChat;
    }

    /**
     * ����remainingFromChat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromChat(Integer value) {
        this.remainingFromChat = value;
    }

    /**
     * ��ȡremainingFromCSR���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromCSR() {
        return remainingFromCSR;
    }

    /**
     * ����remainingFromCSR���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromCSR(Integer value) {
        this.remainingFromCSR = value;
    }

    /**
     * ��ȡremainingFromEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromEmail() {
        return remainingFromEmail;
    }

    /**
     * ����remainingFromEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromEmail(Integer value) {
        this.remainingFromEmail = value;
    }

    /**
     * ��ȡremainingFromWeb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromWeb() {
        return remainingFromWeb;
    }

    /**
     * ����remainingFromWeb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromWeb(Integer value) {
        this.remainingFromWeb = value;
    }

    /**
     * ��ȡremainingTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingTotal() {
        return remainingTotal;
    }

    /**
     * ����remainingTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingTotal(Integer value) {
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
