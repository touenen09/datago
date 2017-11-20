
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelRequiredList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LabelRequiredList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelList" type="{urn:objects.ws.rightnow.com/v1_3}LabelRequired" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelRequiredList", propOrder = {
    "labelList"
})
public class LabelRequiredListType {

    @XmlElement(name = "LabelList")
    protected List<LabelRequiredType> labelList;

    /**
     * Gets the value of the labelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelRequiredType }
     * 
     * 
     */
    public List<LabelRequiredType> getLabelList() {
        if (labelList == null) {
            labelList = new ArrayList<LabelRequiredType>();
        }
        return this.labelList;
    }

}
