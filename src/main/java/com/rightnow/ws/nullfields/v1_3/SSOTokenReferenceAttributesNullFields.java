
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SSOTokenReferenceAttributesNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SSOTokenReferenceAttributesNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Revoked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Used" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSOTokenReferenceAttributesNullFields")
public class SSOTokenReferenceAttributesNullFields {

    @XmlAttribute(name = "Revoked")
    protected Boolean revoked;
    @XmlAttribute(name = "Used")
    protected Boolean used;

    /**
     * ��ȡrevoked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRevoked() {
        if (revoked == null) {
            return false;
        } else {
            return revoked;
        }
    }

    /**
     * ����revoked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevoked(Boolean value) {
        this.revoked = value;
    }

    /**
     * ��ȡused���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsed() {
        if (used == null) {
            return false;
        } else {
            return used;
        }
    }

    /**
     * ����used���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsed(Boolean value) {
        this.used = value;
    }

}
