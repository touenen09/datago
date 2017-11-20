
package com.rightnow.ws.messages.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>UpdateMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpdateMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjects" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded"/>
 *         &lt;element name="ProcessingOptions" type="{urn:messages.ws.rightnow.com/v1_3}UpdateProcessingOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMsg", propOrder = {
    "rnObjects",
    "processingOptions"
})
public class UpdateMsg {

    @XmlElement(name = "RNObjects", required = true)
    protected List<RNObject> rnObjects;
    @XmlElement(name = "ProcessingOptions")
    protected UpdateProcessingOptions processingOptions;

    /**
     * Gets the value of the rnObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rnObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRNObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getRNObjects() {
        if (rnObjects == null) {
            rnObjects = new ArrayList<RNObject>();
        }
        return this.rnObjects;
    }

    /**
     * ��ȡprocessingOptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UpdateProcessingOptions }
     *     
     */
    public UpdateProcessingOptions getProcessingOptions() {
        return processingOptions;
    }

    /**
     * ����processingOptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProcessingOptions }
     *     
     */
    public void setProcessingOptions(UpdateProcessingOptions value) {
        this.processingOptions = value;
    }

}
