
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.AnalyticsReportType;


/**
 * <p>RunAnalyticsReportMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RunAnalyticsReportMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalyticsReport" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReport"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnRawResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableMTOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunAnalyticsReportMsg", propOrder = {
    "analyticsReport",
    "limit",
    "start",
    "delimiter",
    "returnRawResult",
    "disableMTOM"
})
public class RunAnalyticsReportMsg {

    @XmlElement(name = "AnalyticsReport", required = true)
    protected AnalyticsReportType analyticsReport;
    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "Start")
    protected Integer start;
    @XmlElement(name = "Delimiter")
    protected String delimiter;
    @XmlElement(name = "ReturnRawResult")
    protected Boolean returnRawResult;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * ��ȡanalyticsReport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReportType }
     *     
     */
    public AnalyticsReportType getAnalyticsReport() {
        return analyticsReport;
    }

    /**
     * ����analyticsReport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReportType }
     *     
     */
    public void setAnalyticsReport(AnalyticsReportType value) {
        this.analyticsReport = value;
    }

    /**
     * ��ȡlimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * ����limit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * ��ȡdelimiter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * ����delimiter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * ��ȡreturnRawResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRawResult() {
        return returnRawResult;
    }

    /**
     * ����returnRawResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRawResult(Boolean value) {
        this.returnRawResult = value;
    }

    /**
     * ��ȡdisableMTOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMTOM() {
        return disableMTOM;
    }

    /**
     * ����disableMTOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMTOM(Boolean value) {
        this.disableMTOM = value;
    }

}
