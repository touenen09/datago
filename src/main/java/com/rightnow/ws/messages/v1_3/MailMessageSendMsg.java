
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.MailMessageType;


/**
 * <p>MailMessageSendMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailMessageSendMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailMessage" type="{urn:objects.ws.rightnow.com/v1_3}MailMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageSendMsg", propOrder = {
    "mailMessage"
})
public class MailMessageSendMsg {

    @XmlElement(name = "MailMessage", required = true)
    protected MailMessageType mailMessage;

    /**
     * ��ȡmailMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageType }
     *     
     */
    public MailMessageType getMailMessage() {
        return mailMessage;
    }

    /**
     * ����mailMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageType }
     *     
     */
    public void setMailMessage(MailMessageType value) {
        this.mailMessage = value;
    }

}
