
package com.rightnow.ws.messages.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSubscribableObjectsResponseMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetSubscribableObjectsResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscribableObjects" type="{urn:messages.ws.rightnow.com/v1_3}SubscribableObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscribableObjectsResponseMsg", propOrder = {
    "subscribableObjects"
})
public class GetSubscribableObjectsResponseMsg {

    @XmlElement(name = "SubscribableObjects")
    protected List<SubscribableObject> subscribableObjects;

    /**
     * Gets the value of the subscribableObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribableObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribableObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribableObject }
     * 
     * 
     */
    public List<SubscribableObject> getSubscribableObjects() {
        if (subscribableObjects == null) {
            subscribableObjects = new ArrayList<SubscribableObject>();
        }
        return this.subscribableObjects;
    }

}
