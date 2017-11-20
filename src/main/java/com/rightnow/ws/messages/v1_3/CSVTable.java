
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CSVTable complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CSVTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Columns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rows" type="{urn:messages.ws.rightnow.com/v1_3}CSVRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTable", propOrder = {
    "name",
    "columns",
    "rows"
})
public class CSVTable {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Columns")
    protected String columns;
    @XmlElement(name = "Rows")
    protected CSVRow rows;

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

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumns(String value) {
        this.columns = value;
    }

    /**
     * ��ȡrows���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CSVRow }
     *     
     */
    public CSVRow getRows() {
        return rows;
    }

    /**
     * ����rows���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRow }
     *     
     */
    public void setRows(CSVRow value) {
        this.rows = value;
    }

}
