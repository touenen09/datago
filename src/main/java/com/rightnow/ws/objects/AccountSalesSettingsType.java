
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.nullfields.v1_3.AccountSalesSettingsNullFields;


/**
 * <p>AccountSalesSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AccountSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultCurrency" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}AccountSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSalesSettings", propOrder = {
    "defaultCurrency",
    "territory",
    "validNullFields"
})
public class AccountSalesSettingsType {

    @XmlElement(name = "DefaultCurrency")
    protected NamedID defaultCurrency;
    @XmlElementRef(name = "Territory", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> territory;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountSalesSettingsNullFields> validNullFields;

    /**
     * ��ȡdefaultCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * ����defaultCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDefaultCurrency(NamedID value) {
        this.defaultCurrency = value;
    }

    /**
     * ��ȡterritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getTerritory() {
        return territory;
    }

    /**
     * ����territory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<NamedIDHierarchy> value) {
        this.territory = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<AccountSalesSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AccountSalesSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
