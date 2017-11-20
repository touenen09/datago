
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.nullfields.v1_3.OrganizationSalesSettingsNullFields;


/**
 * <p>OrganizationSalesSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrganizationSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TotalRevenue" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSalesSettings", propOrder = {
    "acquiredDate",
    "salesAccount",
    "totalRevenue",
    "validNullFields"
})
public class OrganizationSalesSettingsType {

    @XmlElementRef(name = "AcquiredDate", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> acquiredDate;
    @XmlElementRef(name = "SalesAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> salesAccount;
    @XmlElementRef(name = "TotalRevenue", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> totalRevenue;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationSalesSettingsNullFields> validNullFields;

    /**
     * ��ȡacquiredDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcquiredDate() {
        return acquiredDate;
    }

    /**
     * ����acquiredDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcquiredDate(JAXBElement<XMLGregorianCalendar> value) {
        this.acquiredDate = value;
    }

    /**
     * ��ȡsalesAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getSalesAccount() {
        return salesAccount;
    }

    /**
     * ����salesAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setSalesAccount(JAXBElement<NamedIDHierarchy> value) {
        this.salesAccount = value;
    }

    /**
     * ��ȡtotalRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * ����totalRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setTotalRevenue(JAXBElement<MonetaryValueType> value) {
        this.totalRevenue = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationSalesSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationSalesSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
