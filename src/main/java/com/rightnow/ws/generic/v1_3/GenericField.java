
package com.rightnow.ws.generic.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GenericField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GenericField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataValue" type="{urn:generic.ws.rightnow.com/v1_3}DataValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataType" type="{urn:generic.ws.rightnow.com/v1_3}DataTypeEnum" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericField", propOrder = {
    "dataValue"
})
public class GenericField {

    @XmlElement(name = "DataValue", required = true, nillable = true)
    protected DataValue dataValue;
    @XmlAttribute(name = "dataType")
    protected DataTypeEnum dataType;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * ��ȡdataValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DataValue }
     *     
     */
    public DataValue getDataValue() {
        return dataValue;
    }

    /**
     * ����dataValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DataValue }
     *     
     */
    public void setDataValue(DataValue value) {
        this.dataValue = value;
    }

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
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
