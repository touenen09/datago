
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.IncidentResponseType;


/**
 * <p>SendIncidentResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SendIncidentResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncidentResponse" type="{urn:objects.ws.rightnow.com/v1_3}IncidentResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendIncidentResponseMsg", propOrder = {
    "incidentResponse"
})
public class SendIncidentResponseMsg {

    @XmlElement(name = "IncidentResponse", required = true)
    protected IncidentResponseType incidentResponse;

    /**
     * ��ȡincidentResponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IncidentResponseType }
     *     
     */
    public IncidentResponseType getIncidentResponse() {
        return incidentResponse;
    }

    /**
     * ����incidentResponse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentResponseType }
     *     
     */
    public void setIncidentResponse(IncidentResponseType value) {
        this.incidentResponse = value;
    }

}
