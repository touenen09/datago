
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.MailMessageStatusType;


/**
 * <p>MailMessageSendResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailMessageSendResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailMessageStatus" type="{urn:objects.ws.rightnow.com/v1_3}MailMessageStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailMessageSendResponseMsg", propOrder = {
    "mailMessageStatus"
})
public class MailMessageSendResponseMsg {

    @XmlElement(name = "MailMessageStatus", required = true)
    protected MailMessageStatusType mailMessageStatus;

    /**
     * ��ȡmailMessageStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MailMessageStatusType }
     *     
     */
    public MailMessageStatusType getMailMessageStatus() {
        return mailMessageStatus;
    }

    /**
     * ����mailMessageStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MailMessageStatusType }
     *     
     */
    public void setMailMessageStatus(MailMessageStatusType value) {
        this.mailMessageStatus = value;
    }

}
