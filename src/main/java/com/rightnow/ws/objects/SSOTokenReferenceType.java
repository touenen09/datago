
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.nullfields.v1_3.SSOTokenReferenceNullFields;


/**
 * <p>SSOTokenReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SSOTokenReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}SSOTokenReferenceAttributes" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ExpiresTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IssuedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SSOProvider" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="SSOTokenType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="TokenHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}SSOTokenReferenceNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSOTokenReference", propOrder = {
    "attributes",
    "comment",
    "account",
    "expiresTime",
    "issuedTime",
    "ssoProvider",
    "ssoTokenType",
    "tokenHash",
    "validNullFields"
})
public class SSOTokenReferenceType
    extends RNObject
{

    @XmlElement(name = "Attributes")
    protected SSOTokenReferenceAttributesType attributes;
    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "Account")
    protected NamedID account;
    @XmlElement(name = "ExpiresTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiresTime;
    @XmlElementRef(name = "IssuedTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> issuedTime;
    @XmlElement(name = "SSOProvider")
    protected NamedID ssoProvider;
    @XmlElement(name = "SSOTokenType")
    protected NamedID ssoTokenType;
    @XmlElement(name = "TokenHash")
    protected String tokenHash;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SSOTokenReferenceNullFields> validNullFields;

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SSOTokenReferenceAttributesType }
     *     
     */
    public SSOTokenReferenceAttributesType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SSOTokenReferenceAttributesType }
     *     
     */
    public void setAttributes(SSOTokenReferenceAttributesType value) {
        this.attributes = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * ����comment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * ��ȡaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getAccount() {
        return account;
    }

    /**
     * ����account���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setAccount(NamedID value) {
        this.account = value;
    }

    /**
     * ��ȡexpiresTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresTime() {
        return expiresTime;
    }

    /**
     * ����expiresTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresTime(XMLGregorianCalendar value) {
        this.expiresTime = value;
    }

    /**
     * ��ȡissuedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIssuedTime() {
        return issuedTime;
    }

    /**
     * ����issuedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIssuedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.issuedTime = value;
    }

    /**
     * ��ȡssoProvider���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSSOProvider() {
        return ssoProvider;
    }

    /**
     * ����ssoProvider���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSSOProvider(NamedID value) {
        this.ssoProvider = value;
    }

    /**
     * ��ȡssoTokenType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSSOTokenType() {
        return ssoTokenType;
    }

    /**
     * ����ssoTokenType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSSOTokenType(NamedID value) {
        this.ssoTokenType = value;
    }

    /**
     * ��ȡtokenHash���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenHash() {
        return tokenHash;
    }

    /**
     * ����tokenHash���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenHash(String value) {
        this.tokenHash = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SSOTokenReferenceNullFields }{@code >}
     *     
     */
    public JAXBElement<SSOTokenReferenceNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SSOTokenReferenceNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SSOTokenReferenceNullFields> value) {
        this.validNullFields = value;
    }

}
