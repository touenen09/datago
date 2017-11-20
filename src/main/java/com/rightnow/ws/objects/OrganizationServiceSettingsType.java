
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_3.OrganizationServiceSettingsNullFields;


/**
 * <p>OrganizationServiceSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrganizationServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_3}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}OrganizationServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceSettings", propOrder = {
    "slaInstances",
    "validNullFields"
})
public class OrganizationServiceSettingsType {

    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SLAInstanceListType> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganizationServiceSettingsNullFields> validNullFields;

    /**
     * ��ȡslaInstances���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}
     *     
     */
    public JAXBElement<SLAInstanceListType> getSLAInstances() {
        return slaInstances;
    }

    /**
     * ����slaInstances���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}
     *     
     */
    public void setSLAInstances(JAXBElement<SLAInstanceListType> value) {
        this.slaInstances = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationServiceSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
