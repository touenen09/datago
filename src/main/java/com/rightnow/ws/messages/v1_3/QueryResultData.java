
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.faults.v1_3.RNFault;


/**
 * <p>QueryResultData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryResultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjectsResult" type="{urn:messages.ws.rightnow.com/v1_3}RNObjectsResult"/>
 *         &lt;element name="Paging" type="{urn:messages.ws.rightnow.com/v1_3}PagingResponse"/>
 *         &lt;element name="Fault" type="{urn:faults.ws.rightnow.com/v1_3}RNFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResultData", propOrder = {
    "rnObjectsResult",
    "paging",
    "fault"
})
public class QueryResultData {

    @XmlElement(name = "RNObjectsResult", required = true)
    protected RNObjectsResult rnObjectsResult;
    @XmlElement(name = "Paging", required = true)
    protected PagingResponse paging;
    @XmlElement(name = "Fault")
    protected RNFault fault;

    /**
     * ��ȡrnObjectsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectsResult }
     *     
     */
    public RNObjectsResult getRNObjectsResult() {
        return rnObjectsResult;
    }

    /**
     * ����rnObjectsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectsResult }
     *     
     */
    public void setRNObjectsResult(RNObjectsResult value) {
        this.rnObjectsResult = value;
    }

    /**
     * ��ȡpaging���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PagingResponse }
     *     
     */
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * ����paging���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PagingResponse }
     *     
     */
    public void setPaging(PagingResponse value) {
        this.paging = value;
    }

    /**
     * ��ȡfault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNFault }
     *     
     */
    public RNFault getFault() {
        return fault;
    }

    /**
     * ����fault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNFault }
     *     
     */
    public void setFault(RNFault value) {
        this.fault = value;
    }

}
