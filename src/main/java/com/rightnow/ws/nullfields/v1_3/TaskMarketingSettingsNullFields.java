
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskMarketingSettingsNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TaskMarketingSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Campaign" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Document" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Mailing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Survey" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMarketingSettingsNullFields")
public class TaskMarketingSettingsNullFields {

    @XmlAttribute(name = "Campaign")
    protected Boolean campaign;
    @XmlAttribute(name = "Document")
    protected Boolean document;
    @XmlAttribute(name = "Mailing")
    protected Boolean mailing;
    @XmlAttribute(name = "Survey")
    protected Boolean survey;

    /**
     * ��ȡcampaign���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaign() {
        if (campaign == null) {
            return false;
        } else {
            return campaign;
        }
    }

    /**
     * ����campaign���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaign(Boolean value) {
        this.campaign = value;
    }

    /**
     * ��ȡdocument���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDocument() {
        if (document == null) {
            return false;
        } else {
            return document;
        }
    }

    /**
     * ����document���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocument(Boolean value) {
        this.document = value;
    }

    /**
     * ��ȡmailing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMailing() {
        if (mailing == null) {
            return false;
        } else {
            return mailing;
        }
    }

    /**
     * ����mailing���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailing(Boolean value) {
        this.mailing = value;
    }

    /**
     * ��ȡsurvey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSurvey() {
        if (survey == null) {
            return false;
        } else {
            return survey;
        }
    }

    /**
     * ����survey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurvey(Boolean value) {
        this.survey = value;
    }

}
