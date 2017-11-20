
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MailboxIncomingEmailSettingsNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailboxIncomingEmailSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ForceReplyBetweenLines" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForwardRejectMessageAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxIncomingEmailSettingsNullFields")
public class MailboxIncomingEmailSettingsNullFields {

    @XmlAttribute(name = "ForceReplyBetweenLines")
    protected Boolean forceReplyBetweenLines;
    @XmlAttribute(name = "ForwardRejectMessageAddress")
    protected Boolean forwardRejectMessageAddress;
    @XmlAttribute(name = "IsEnabled")
    protected Boolean isEnabled;

    /**
     * ��ȡforceReplyBetweenLines���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceReplyBetweenLines() {
        if (forceReplyBetweenLines == null) {
            return false;
        } else {
            return forceReplyBetweenLines;
        }
    }

    /**
     * ����forceReplyBetweenLines���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceReplyBetweenLines(Boolean value) {
        this.forceReplyBetweenLines = value;
    }

    /**
     * ��ȡforwardRejectMessageAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForwardRejectMessageAddress() {
        if (forwardRejectMessageAddress == null) {
            return false;
        } else {
            return forwardRejectMessageAddress;
        }
    }

    /**
     * ����forwardRejectMessageAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardRejectMessageAddress(Boolean value) {
        this.forwardRejectMessageAddress = value;
    }

    /**
     * ��ȡisEnabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEnabled() {
        if (isEnabled == null) {
            return false;
        } else {
            return isEnabled;
        }
    }

    /**
     * ����isEnabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

}
