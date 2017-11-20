
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AccountOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanModifyEmailSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForcePasswordChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InfrequentUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermanentlyDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StaffAssignmentDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ViewsReportsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VirtualAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOptions", propOrder = {
    "accountLocked",
    "canModifyEmailSignature",
    "forcePasswordChange",
    "infrequentUser",
    "passwordNeverExpires",
    "permanentlyDisabled",
    "staffAssignmentDisabled",
    "viewsReportsDisabled",
    "virtualAccount"
})
public class AccountOptionsType {

    @XmlElement(name = "AccountLocked")
    protected Boolean accountLocked;
    @XmlElement(name = "CanModifyEmailSignature")
    protected Boolean canModifyEmailSignature;
    @XmlElement(name = "ForcePasswordChange")
    protected Boolean forcePasswordChange;
    @XmlElement(name = "InfrequentUser")
    protected Boolean infrequentUser;
    @XmlElement(name = "PasswordNeverExpires")
    protected Boolean passwordNeverExpires;
    @XmlElement(name = "PermanentlyDisabled")
    protected Boolean permanentlyDisabled;
    @XmlElement(name = "StaffAssignmentDisabled")
    protected Boolean staffAssignmentDisabled;
    @XmlElement(name = "ViewsReportsDisabled")
    protected Boolean viewsReportsDisabled;
    @XmlElement(name = "VirtualAccount")
    protected Boolean virtualAccount;

    /**
     * ��ȡaccountLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * ����accountLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLocked(Boolean value) {
        this.accountLocked = value;
    }

    /**
     * ��ȡcanModifyEmailSignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanModifyEmailSignature() {
        return canModifyEmailSignature;
    }

    /**
     * ����canModifyEmailSignature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanModifyEmailSignature(Boolean value) {
        this.canModifyEmailSignature = value;
    }

    /**
     * ��ȡforcePasswordChange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcePasswordChange() {
        return forcePasswordChange;
    }

    /**
     * ����forcePasswordChange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePasswordChange(Boolean value) {
        this.forcePasswordChange = value;
    }

    /**
     * ��ȡinfrequentUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfrequentUser() {
        return infrequentUser;
    }

    /**
     * ����infrequentUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfrequentUser(Boolean value) {
        this.infrequentUser = value;
    }

    /**
     * ��ȡpasswordNeverExpires���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordNeverExpires() {
        return passwordNeverExpires;
    }

    /**
     * ����passwordNeverExpires���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordNeverExpires(Boolean value) {
        this.passwordNeverExpires = value;
    }

    /**
     * ��ȡpermanentlyDisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentlyDisabled() {
        return permanentlyDisabled;
    }

    /**
     * ����permanentlyDisabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentlyDisabled(Boolean value) {
        this.permanentlyDisabled = value;
    }

    /**
     * ��ȡstaffAssignmentDisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaffAssignmentDisabled() {
        return staffAssignmentDisabled;
    }

    /**
     * ����staffAssignmentDisabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffAssignmentDisabled(Boolean value) {
        this.staffAssignmentDisabled = value;
    }

    /**
     * ��ȡviewsReportsDisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewsReportsDisabled() {
        return viewsReportsDisabled;
    }

    /**
     * ����viewsReportsDisabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewsReportsDisabled(Boolean value) {
        this.viewsReportsDisabled = value;
    }

    /**
     * ��ȡvirtualAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualAccount() {
        return virtualAccount;
    }

    /**
     * ����virtualAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualAccount(Boolean value) {
        this.virtualAccount = value;
    }

}
