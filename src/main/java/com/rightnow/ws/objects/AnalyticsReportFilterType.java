
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.NamedID;


/**
 * <p>AnalyticsReportFilter complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AnalyticsReportFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportSearchFilter">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_3}AnalyticsReportFilterAttributes" minOccurs="0"/>
 *         &lt;element name="DataType" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsReportFilter", propOrder = {
    "attributes",
    "dataType",
    "prompt"
})
public class AnalyticsReportFilterType
    extends AnalyticsReportSearchFilterType
{

    @XmlElement(name = "Attributes")
    protected AnalyticsReportFilterAttributesType attributes;
    @XmlElement(name = "DataType")
    protected NamedID dataType;
    @XmlElement(name = "Prompt")
    protected String prompt;

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReportFilterAttributesType }
     *     
     */
    public AnalyticsReportFilterAttributesType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReportFilterAttributesType }
     *     
     */
    public void setAttributes(AnalyticsReportFilterAttributesType value) {
        this.attributes = value;
    }

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDataType(NamedID value) {
        this.dataType = value;
    }

    /**
     * ��ȡprompt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * ����prompt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

}
