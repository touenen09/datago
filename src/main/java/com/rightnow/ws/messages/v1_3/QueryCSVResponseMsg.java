
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryCSVResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryCSVResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTableSet" type="{urn:messages.ws.rightnow.com/v1_3}CSVTableSet" minOccurs="0"/>
 *         &lt;element name="FileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCSVResponseMsg", propOrder = {
    "csvTableSet",
    "fileData"
})
public class QueryCSVResponseMsg {

    @XmlElement(name = "CSVTableSet")
    protected CSVTableSet csvTableSet;
    @XmlElement(name = "FileData")
    protected byte[] fileData;

    /**
     * ��ȡcsvTableSet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CSVTableSet }
     *     
     */
    public CSVTableSet getCSVTableSet() {
        return csvTableSet;
    }

    /**
     * ����csvTableSet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTableSet }
     *     
     */
    public void setCSVTableSet(CSVTableSet value) {
        this.csvTableSet = value;
    }

    /**
     * ��ȡfileData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * ����fileData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

}
