
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.ID;


/**
 * <p>ExecuteMarketingFlowMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExecuteMarketingFlowMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="CampaignID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="EntryPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteMarketingFlowMsg", propOrder = {
    "contactID",
    "campaignID",
    "entryPoint"
})
public class ExecuteMarketingFlowMsg {

    @XmlElement(name = "ContactID", required = true)
    protected ID contactID;
    @XmlElement(name = "CampaignID", required = true)
    protected ID campaignID;
    @XmlElement(name = "EntryPoint", required = true)
    protected String entryPoint;

    /**
     * ��ȡcontactID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getContactID() {
        return contactID;
    }

    /**
     * ����contactID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setContactID(ID value) {
        this.contactID = value;
    }

    /**
     * ��ȡcampaignID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getCampaignID() {
        return campaignID;
    }

    /**
     * ����campaignID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setCampaignID(ID value) {
        this.campaignID = value;
    }

    /**
     * ��ȡentryPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * ����entryPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
    }

}
