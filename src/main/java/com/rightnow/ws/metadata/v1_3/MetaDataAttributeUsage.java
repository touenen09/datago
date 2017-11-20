
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.DataTypeEnum;


/**
 * <p>MetaDataAttributeUsage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttributeUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{urn:generic.ws.rightnow.com/v1_3}DataTypeEnum"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usage" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttributeUsage", propOrder = {
    "dataType",
    "path",
    "usage"
})
public class MetaDataAttributeUsage {

    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataTypeEnum dataType;
    @XmlElement(name = "Path", required = true)
    protected String path;
    @XmlElement(name = "Usage", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usage;

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * ��ȡpath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * ����path���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * ��ȡusage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsage() {
        return usage;
    }

    /**
     * ����usage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsage(MetaDataUsageEnum value) {
        this.usage = value;
    }

}
