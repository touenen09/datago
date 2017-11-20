
package com.rightnow.ws.metadata.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetaDataOperationList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataOperationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataOperationList" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataOperationList", propOrder = {
    "metaDataOperationList"
})
public class MetaDataOperationList {

    @XmlElement(name = "MetaDataOperationList")
    protected List<MetaDataOperation> metaDataOperationList;

    /**
     * Gets the value of the metaDataOperationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataOperationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataOperationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataOperation }
     * 
     * 
     */
    public List<MetaDataOperation> getMetaDataOperationList() {
        if (metaDataOperationList == null) {
            metaDataOperationList = new ArrayList<MetaDataOperation>();
        }
        return this.metaDataOperationList;
    }

}
