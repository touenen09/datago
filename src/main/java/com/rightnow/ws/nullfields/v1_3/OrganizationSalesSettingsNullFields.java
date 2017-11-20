
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrganizationSalesSettingsNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OrganizationSalesSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SalesAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TotalRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSalesSettingsNullFields")
public class OrganizationSalesSettingsNullFields {

    @XmlAttribute(name = "SalesAccount")
    protected Boolean salesAccount;
    @XmlAttribute(name = "TotalRevenue")
    protected Boolean totalRevenue;

    /**
     * ��ȡsalesAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesAccount() {
        if (salesAccount == null) {
            return false;
        } else {
            return salesAccount;
        }
    }

    /**
     * ����salesAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesAccount(Boolean value) {
        this.salesAccount = value;
    }

    /**
     * ��ȡtotalRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTotalRevenue() {
        if (totalRevenue == null) {
            return false;
        } else {
            return totalRevenue;
        }
    }

    /**
     * ����totalRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalRevenue(Boolean value) {
        this.totalRevenue = value;
    }

}
