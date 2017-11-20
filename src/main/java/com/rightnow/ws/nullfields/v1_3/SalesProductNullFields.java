
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SalesProductNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SalesProductNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Folder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Schedules" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ServiceProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductNullFields")
public class SalesProductNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;
    @XmlAttribute(name = "Descriptions")
    protected Boolean descriptions;
    @XmlAttribute(name = "Folder")
    protected Boolean folder;
    @XmlAttribute(name = "PartNumber")
    protected Boolean partNumber;
    @XmlAttribute(name = "Schedules")
    protected Boolean schedules;
    @XmlAttribute(name = "ServiceProduct")
    protected Boolean serviceProduct;

    /**
     * ��ȡadminVisibleInterfaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdminVisibleInterfaces() {
        if (adminVisibleInterfaces == null) {
            return false;
        } else {
            return adminVisibleInterfaces;
        }
    }

    /**
     * ����adminVisibleInterfaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminVisibleInterfaces(Boolean value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * ��ȡdescriptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDescriptions() {
        if (descriptions == null) {
            return false;
        } else {
            return descriptions;
        }
    }

    /**
     * ����descriptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptions(Boolean value) {
        this.descriptions = value;
    }

    /**
     * ��ȡfolder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFolder() {
        if (folder == null) {
            return false;
        } else {
            return folder;
        }
    }

    /**
     * ����folder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolder(Boolean value) {
        this.folder = value;
    }

    /**
     * ��ȡpartNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPartNumber() {
        if (partNumber == null) {
            return false;
        } else {
            return partNumber;
        }
    }

    /**
     * ����partNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartNumber(Boolean value) {
        this.partNumber = value;
    }

    /**
     * ��ȡschedules���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSchedules() {
        if (schedules == null) {
            return false;
        } else {
            return schedules;
        }
    }

    /**
     * ����schedules���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchedules(Boolean value) {
        this.schedules = value;
    }

    /**
     * ��ȡserviceProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isServiceProduct() {
        if (serviceProduct == null) {
            return false;
        } else {
            return serviceProduct;
        }
    }

    /**
     * ����serviceProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceProduct(Boolean value) {
        this.serviceProduct = value;
    }

}
