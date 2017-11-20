
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.IncidentType;


/**
 * <p>SendIncidentResponseResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SendIncidentResponseResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Incident" type="{urn:objects.ws.rightnow.com/v1_3}Incident"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendIncidentResponseResponseMsg", propOrder = {
    "incident"
})
public class SendIncidentResponseResponseMsg {

    @XmlElement(name = "Incident", required = true)
    protected IncidentType incident;

    /**
     * ��ȡincident���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IncidentType }
     *     
     */
    public IncidentType getIncident() {
        return incident;
    }

    /**
     * ����incident���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentType }
     *     
     */
    public void setIncident(IncidentType value) {
        this.incident = value;
    }

}
