
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StandardContentUsage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StandardContentUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChatText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChatURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncidentText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RuleText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContentUsage", propOrder = {
    "chatText",
    "chatURL",
    "incidentText",
    "ruleText"
})
public class StandardContentUsageType {

    @XmlElement(name = "ChatText")
    protected Boolean chatText;
    @XmlElement(name = "ChatURL")
    protected Boolean chatURL;
    @XmlElement(name = "IncidentText")
    protected Boolean incidentText;
    @XmlElement(name = "RuleText")
    protected Boolean ruleText;

    /**
     * ��ȡchatText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatText() {
        return chatText;
    }

    /**
     * ����chatText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatText(Boolean value) {
        this.chatText = value;
    }

    /**
     * ��ȡchatURL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatURL() {
        return chatURL;
    }

    /**
     * ����chatURL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatURL(Boolean value) {
        this.chatURL = value;
    }

    /**
     * ��ȡincidentText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidentText() {
        return incidentText;
    }

    /**
     * ����incidentText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidentText(Boolean value) {
        this.incidentText = value;
    }

    /**
     * ��ȡruleText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleText() {
        return ruleText;
    }

    /**
     * ����ruleText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleText(Boolean value) {
        this.ruleText = value;
    }

}
