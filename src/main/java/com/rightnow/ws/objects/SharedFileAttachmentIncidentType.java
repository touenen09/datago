
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>SharedFileAttachmentIncident complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SharedFileAttachmentIncident">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentIncident">
 *       &lt;sequence>
 *         &lt;element name="AttachmentOwner" type="{urn:base.ws.rightnow.com/v1_3}RNObject"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedFileAttachmentIncident", propOrder = {
    "attachmentOwner"
})
public class SharedFileAttachmentIncidentType
    extends FileAttachmentIncidentType
{

    @XmlElement(name = "AttachmentOwner", required = true)
    protected RNObject attachmentOwner;

    /**
     * ��ȡattachmentOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getAttachmentOwner() {
        return attachmentOwner;
    }

    /**
     * ����attachmentOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setAttachmentOwner(RNObject value) {
        this.attachmentOwner = value;
    }

}
