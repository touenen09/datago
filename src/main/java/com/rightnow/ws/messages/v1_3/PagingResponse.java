
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PagingResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PagingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingResponse", propOrder = {
    "returnedCount",
    "startIndex",
    "queryHandle"
})
public class PagingResponse {

    @XmlElement(name = "ReturnedCount")
    protected int returnedCount;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "QueryHandle", required = true)
    protected String queryHandle;

    /**
     * ��ȡreturnedCount���Ե�ֵ��
     * 
     */
    public int getReturnedCount() {
        return returnedCount;
    }

    /**
     * ����returnedCount���Ե�ֵ��
     * 
     */
    public void setReturnedCount(int value) {
        this.returnedCount = value;
    }

    /**
     * ��ȡstartIndex���Ե�ֵ��
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * ����startIndex���Ե�ֵ��
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * ��ȡqueryHandle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryHandle() {
        return queryHandle;
    }

    /**
     * ����queryHandle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryHandle(String value) {
        this.queryHandle = value;
    }

}
