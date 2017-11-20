
package com.rightnow.ws.messages.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>RNObjectsResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RNObjectsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjects" type="{urn:base.ws.rightnow.com/v1_3}RNObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNObjectsResult", propOrder = {
    "rnObjects"
})
public class RNObjectsResult {

    @XmlElement(name = "RNObjects")
    protected List<RNObject> rnObjects;

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

}
