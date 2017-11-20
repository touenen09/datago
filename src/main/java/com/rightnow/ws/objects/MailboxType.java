
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.nullfields.v1_3.MailboxNullFields;


/**
 * <p>Mailbox complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Mailbox">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="IncomingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_3}MailboxIncomingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutgoingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_3}MailboxOutgoingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}MailboxNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mailbox", propOrder = {
    "incomingEmailSettings",
    "_interface",
    "isDefault",
    "name",
    "outgoingEmailSettings",
    "type",
    "validNullFields"
})
@XmlSeeAlso({
    ServiceMailboxType.class,
    MarketingMailboxType.class
})
public class MailboxType
    extends RNObject
{

    @XmlElementRef(name = "IncomingEmailSettings", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxIncomingEmailSettingsType> incomingEmailSettings;
    @XmlElementRef(name = "Interface", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> _interface;
    @XmlElementRef(name = "IsDefault", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDefault;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "OutgoingEmailSettings", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxOutgoingEmailSettingsType> outgoingEmailSettings;
    @XmlElementRef(name = "Type", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> type;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MailboxNullFields> validNullFields;

    /**
     * ��ȡincomingEmailSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsType }{@code >}
     *     
     */
    public JAXBElement<MailboxIncomingEmailSettingsType> getIncomingEmailSettings() {
        return incomingEmailSettings;
    }

    /**
     * ����incomingEmailSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsType }{@code >}
     *     
     */
    public void setIncomingEmailSettings(JAXBElement<MailboxIncomingEmailSettingsType> value) {
        this.incomingEmailSettings = value;
    }

    /**
     * ��ȡinterface���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getInterface() {
        return _interface;
    }

    /**
     * ����interface���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setInterface(JAXBElement<NamedID> value) {
        this._interface = value;
    }

    /**
     * ��ȡisDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDefault() {
        return isDefault;
    }

    /**
     * ����isDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDefault(JAXBElement<Boolean> value) {
        this.isDefault = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡoutgoingEmailSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsType }{@code >}
     *     
     */
    public JAXBElement<MailboxOutgoingEmailSettingsType> getOutgoingEmailSettings() {
        return outgoingEmailSettings;
    }

    /**
     * ����outgoingEmailSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsType }{@code >}
     *     
     */
    public void setOutgoingEmailSettings(JAXBElement<MailboxOutgoingEmailSettingsType> value) {
        this.outgoingEmailSettings = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setType(JAXBElement<NamedID> value) {
        this.type = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailboxNullFields }{@code >}
     *     
     */
    public JAXBElement<MailboxNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailboxNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<MailboxNullFields> value) {
        this.validNullFields = value;
    }

}
