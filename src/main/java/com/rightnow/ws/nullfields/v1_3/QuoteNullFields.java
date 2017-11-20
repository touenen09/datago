
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuoteNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QuoteNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdjustedTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfferEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfferStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PriceSchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SentTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Template" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteNullFields")
public class QuoteNullFields {

    @XmlAttribute(name = "AdjustedTotal")
    protected Boolean adjustedTotal;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "LineItems")
    protected Boolean lineItems;
    @XmlAttribute(name = "OfferEndTime")
    protected Boolean offerEndTime;
    @XmlAttribute(name = "OfferStartTime")
    protected Boolean offerStartTime;
    @XmlAttribute(name = "PriceSchedule")
    protected Boolean priceSchedule;
    @XmlAttribute(name = "SentTime")
    protected Boolean sentTime;
    @XmlAttribute(name = "SentTo")
    protected Boolean sentTo;
    @XmlAttribute(name = "Status")
    protected Boolean status;
    @XmlAttribute(name = "Template")
    protected Boolean template;
    @XmlAttribute(name = "Total")
    protected Boolean total;

    /**
     * ��ȡadjustedTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedTotal() {
        if (adjustedTotal == null) {
            return false;
        } else {
            return adjustedTotal;
        }
    }

    /**
     * ����adjustedTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedTotal(Boolean value) {
        this.adjustedTotal = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * ����comment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡlineItems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLineItems() {
        if (lineItems == null) {
            return false;
        } else {
            return lineItems;
        }
    }

    /**
     * ����lineItems���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItems(Boolean value) {
        this.lineItems = value;
    }

    /**
     * ��ȡofferEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOfferEndTime() {
        if (offerEndTime == null) {
            return false;
        } else {
            return offerEndTime;
        }
    }

    /**
     * ����offerEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferEndTime(Boolean value) {
        this.offerEndTime = value;
    }

    /**
     * ��ȡofferStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOfferStartTime() {
        if (offerStartTime == null) {
            return false;
        } else {
            return offerStartTime;
        }
    }

    /**
     * ����offerStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferStartTime(Boolean value) {
        this.offerStartTime = value;
    }

    /**
     * ��ȡpriceSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPriceSchedule() {
        if (priceSchedule == null) {
            return false;
        } else {
            return priceSchedule;
        }
    }

    /**
     * ����priceSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceSchedule(Boolean value) {
        this.priceSchedule = value;
    }

    /**
     * ��ȡsentTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSentTime() {
        if (sentTime == null) {
            return false;
        } else {
            return sentTime;
        }
    }

    /**
     * ����sentTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentTime(Boolean value) {
        this.sentTime = value;
    }

    /**
     * ��ȡsentTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSentTo() {
        if (sentTo == null) {
            return false;
        } else {
            return sentTo;
        }
    }

    /**
     * ����sentTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentTo(Boolean value) {
        this.sentTo = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStatus() {
        if (status == null) {
            return false;
        } else {
            return status;
        }
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * ��ȡtemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTemplate() {
        if (template == null) {
            return false;
        } else {
            return template;
        }
    }

    /**
     * ����template���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplate(Boolean value) {
        this.template = value;
    }

    /**
     * ��ȡtotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTotal() {
        if (total == null) {
            return false;
        } else {
            return total;
        }
    }

    /**
     * ����total���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotal(Boolean value) {
        this.total = value;
    }

}
