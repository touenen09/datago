
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BannerNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BannerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ImportanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BannerNullFields")
public class BannerNullFields {

    @XmlAttribute(name = "ImportanceFlag")
    protected Boolean importanceFlag;
    @XmlAttribute(name = "Text")
    protected Boolean text;

    /**
     * ��ȡimportanceFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isImportanceFlag() {
        if (importanceFlag == null) {
            return false;
        } else {
            return importanceFlag;
        }
    }

    /**
     * ����importanceFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportanceFlag(Boolean value) {
        this.importanceFlag = value;
    }

    /**
     * ��ȡtext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isText() {
        if (text == null) {
            return false;
        } else {
            return text;
        }
    }

    /**
     * ����text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setText(Boolean value) {
        this.text = value;
    }

}
