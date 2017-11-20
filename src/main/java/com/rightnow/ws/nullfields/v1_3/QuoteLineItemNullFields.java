
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuoteLineItemNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QuoteLineItemNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdjustedDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedPartNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdjustedTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineItemNullFields")
public class QuoteLineItemNullFields {

    @XmlAttribute(name = "AdjustedDescription")
    protected Boolean adjustedDescription;
    @XmlAttribute(name = "AdjustedName")
    protected Boolean adjustedName;
    @XmlAttribute(name = "AdjustedPartNumber")
    protected Boolean adjustedPartNumber;
    @XmlAttribute(name = "AdjustedPrice")
    protected Boolean adjustedPrice;
    @XmlAttribute(name = "AdjustedTotal")
    protected Boolean adjustedTotal;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "Product")
    protected Boolean product;

    /**
     * ��ȡadjustedDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedDescription() {
        if (adjustedDescription == null) {
            return false;
        } else {
            return adjustedDescription;
        }
    }

    /**
     * ����adjustedDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedDescription(Boolean value) {
        this.adjustedDescription = value;
    }

    /**
     * ��ȡadjustedName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedName() {
        if (adjustedName == null) {
            return false;
        } else {
            return adjustedName;
        }
    }

    /**
     * ����adjustedName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedName(Boolean value) {
        this.adjustedName = value;
    }

    /**
     * ��ȡadjustedPartNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedPartNumber() {
        if (adjustedPartNumber == null) {
            return false;
        } else {
            return adjustedPartNumber;
        }
    }

    /**
     * ����adjustedPartNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedPartNumber(Boolean value) {
        this.adjustedPartNumber = value;
    }

    /**
     * ��ȡadjustedPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustedPrice() {
        if (adjustedPrice == null) {
            return false;
        } else {
            return adjustedPrice;
        }
    }

    /**
     * ����adjustedPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedPrice(Boolean value) {
        this.adjustedPrice = value;
    }

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
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

}
