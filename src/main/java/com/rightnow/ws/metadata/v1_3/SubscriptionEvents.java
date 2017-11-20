
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubscriptionEvents complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubscriptionEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Create" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Update" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Destroy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionEvents", propOrder = {
    "create",
    "update",
    "destroy"
})
public class SubscriptionEvents {

    @XmlElement(name = "Create")
    protected boolean create;
    @XmlElement(name = "Update")
    protected boolean update;
    @XmlElement(name = "Destroy")
    protected boolean destroy;

    /**
     * ��ȡcreate���Ե�ֵ��
     * 
     */
    public boolean isCreate() {
        return create;
    }

    /**
     * ����create���Ե�ֵ��
     * 
     */
    public void setCreate(boolean value) {
        this.create = value;
    }

    /**
     * ��ȡupdate���Ե�ֵ��
     * 
     */
    public boolean isUpdate() {
        return update;
    }

    /**
     * ����update���Ե�ֵ��
     * 
     */
    public void setUpdate(boolean value) {
        this.update = value;
    }

    /**
     * ��ȡdestroy���Ե�ֵ��
     * 
     */
    public boolean isDestroy() {
        return destroy;
    }

    /**
     * ����destroy���Ե�ֵ��
     * 
     */
    public void setDestroy(boolean value) {
        this.destroy = value;
    }

}
