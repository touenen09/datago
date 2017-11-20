
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AccountNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EmailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Emails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Manager" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Phones" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNullFields")
public class AccountNullFields {

    @XmlAttribute(name = "DisplayName")
    protected Boolean displayName;
    @XmlAttribute(name = "EmailNotification")
    protected Boolean emailNotification;
    @XmlAttribute(name = "Emails")
    protected Boolean emails;
    @XmlAttribute(name = "Manager")
    protected Boolean manager;
    @XmlAttribute(name = "NewPassword")
    protected Boolean newPassword;
    @XmlAttribute(name = "Phones")
    protected Boolean phones;
    @XmlAttribute(name = "Profile")
    protected Boolean profile;
    @XmlAttribute(name = "Signature")
    protected Boolean signature;

    /**
     * ��ȡdisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayName() {
        if (displayName == null) {
            return false;
        } else {
            return displayName;
        }
    }

    /**
     * ����displayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * ��ȡemailNotification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailNotification() {
        if (emailNotification == null) {
            return false;
        } else {
            return emailNotification;
        }
    }

    /**
     * ����emailNotification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailNotification(Boolean value) {
        this.emailNotification = value;
    }

    /**
     * ��ȡemails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmails() {
        if (emails == null) {
            return false;
        } else {
            return emails;
        }
    }

    /**
     * ����emails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmails(Boolean value) {
        this.emails = value;
    }

    /**
     * ��ȡmanager���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManager() {
        if (manager == null) {
            return false;
        } else {
            return manager;
        }
    }

    /**
     * ����manager���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManager(Boolean value) {
        this.manager = value;
    }

    /**
     * ��ȡnewPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNewPassword() {
        if (newPassword == null) {
            return false;
        } else {
            return newPassword;
        }
    }

    /**
     * ����newPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPassword(Boolean value) {
        this.newPassword = value;
    }

    /**
     * ��ȡphones���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPhones() {
        if (phones == null) {
            return false;
        } else {
            return phones;
        }
    }

    /**
     * ����phones���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhones(Boolean value) {
        this.phones = value;
    }

    /**
     * ��ȡprofile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProfile() {
        if (profile == null) {
            return false;
        } else {
            return profile;
        }
    }

    /**
     * ����profile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfile(Boolean value) {
        this.profile = value;
    }

    /**
     * ��ȡsignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSignature() {
        if (signature == null) {
            return false;
        } else {
            return signature;
        }
    }

    /**
     * ����signature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignature(Boolean value) {
        this.signature = value;
    }

}
