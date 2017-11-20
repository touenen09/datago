
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductNotificationList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProductNotificationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductNotificationList" type="{urn:objects.ws.rightnow.com/v1_3}ProductNotification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductNotificationList", propOrder = {
    "productNotificationList"
})
public class ProductNotificationListType {

    @XmlElement(name = "ProductNotificationList")
    protected List<ProductNotificationType> productNotificationList;

    /**
     * Gets the value of the productNotificationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productNotificationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductNotificationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductNotificationType }
     * 
     * 
     */
    public List<ProductNotificationType> getProductNotificationList() {
        if (productNotificationList == null) {
            productNotificationList = new ArrayList<ProductNotificationType>();
        }
        return this.productNotificationList;
    }

}
