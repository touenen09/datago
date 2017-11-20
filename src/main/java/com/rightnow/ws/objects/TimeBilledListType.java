
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeBilledList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TimeBilledList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeBilledList" type="{urn:objects.ws.rightnow.com/v1_3}TimeBilled" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeBilledList", propOrder = {
    "timeBilledList"
})
public class TimeBilledListType {

    @XmlElement(name = "TimeBilledList")
    protected List<TimeBilledType> timeBilledList;

    /**
     * Gets the value of the timeBilledList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeBilledList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeBilledList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeBilledType }
     * 
     * 
     */
    public List<TimeBilledType> getTimeBilledList() {
        if (timeBilledList == null) {
            timeBilledList = new ArrayList<TimeBilledType>();
        }
        return this.timeBilledList;
    }

}
