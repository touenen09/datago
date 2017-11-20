
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CSVTableSet complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CSVTableSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTables" type="{urn:messages.ws.rightnow.com/v1_3}CSVTables" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTableSet", propOrder = {
    "csvTables"
})
public class CSVTableSet {

    @XmlElement(name = "CSVTables")
    protected CSVTables csvTables;

    /**
     * ��ȡcsvTables���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CSVTables }
     *     
     */
    public CSVTables getCSVTables() {
        return csvTables;
    }

    /**
     * ����csvTables���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTables }
     *     
     */
    public void setCSVTables(CSVTables value) {
        this.csvTables = value;
    }

}
