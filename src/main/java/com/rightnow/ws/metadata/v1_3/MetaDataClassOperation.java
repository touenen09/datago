
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.RNObjectType;


/**
 * <p>MetaDataClassOperation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataClassOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:generic.ws.rightnow.com/v1_3}RNObjectType"/>
 *         &lt;element name="Operations" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataOperationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataClassOperation", propOrder = {
    "name",
    "operations"
})
public class MetaDataClassOperation {

    @XmlElement(name = "Name", required = true)
    protected RNObjectType name;
    @XmlElement(name = "Operations")
    protected MetaDataOperationList operations;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setName(RNObjectType value) {
        this.name = value;
    }

    /**
     * ��ȡoperations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataOperationList }
     *     
     */
    public MetaDataOperationList getOperations() {
        return operations;
    }

    /**
     * ����operations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataOperationList }
     *     
     */
    public void setOperations(MetaDataOperationList value) {
        this.operations = value;
    }

}
