
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OpportunityNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OpportunityNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CostOfSale" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LostTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ManagerValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OtherContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Quotes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SalesRepresentativeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Territory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityNullFields")
public class OpportunityNullFields {

    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "ClosedTime")
    protected Boolean closedTime;
    @XmlAttribute(name = "ClosedValue")
    protected Boolean closedValue;
    @XmlAttribute(name = "CostOfSale")
    protected Boolean costOfSale;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "ForecastCloseDate")
    protected Boolean forecastCloseDate;
    @XmlAttribute(name = "InitialContactDate")
    protected Boolean initialContactDate;
    @XmlAttribute(name = "LeadRejectDateTime")
    protected Boolean leadRejectDateTime;
    @XmlAttribute(name = "LeadRejectDescription")
    protected Boolean leadRejectDescription;
    @XmlAttribute(name = "LeadRejectReason")
    protected Boolean leadRejectReason;
    @XmlAttribute(name = "LostTime")
    protected Boolean lostTime;
    @XmlAttribute(name = "ManagerValue")
    protected Boolean managerValue;
    @XmlAttribute(name = "Name")
    protected Boolean name;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "OtherContacts")
    protected Boolean otherContacts;
    @XmlAttribute(name = "PrimaryContact")
    protected Boolean primaryContact;
    @XmlAttribute(name = "Quotes")
    protected Boolean quotes;
    @XmlAttribute(name = "RecallTime")
    protected Boolean recallTime;
    @XmlAttribute(name = "ReturnValue")
    protected Boolean returnValue;
    @XmlAttribute(name = "SalesRepresentativeValue")
    protected Boolean salesRepresentativeValue;
    @XmlAttribute(name = "Summary")
    protected Boolean summary;
    @XmlAttribute(name = "Territory")
    protected Boolean territory;
    @XmlAttribute(name = "WinLossDescription")
    protected Boolean winLossDescription;
    @XmlAttribute(name = "WinLossReason")
    protected Boolean winLossReason;

    /**
     * ��ȡassignedToAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedToAccount() {
        if (assignedToAccount == null) {
            return false;
        } else {
            return assignedToAccount;
        }
    }

    /**
     * ����assignedToAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedToAccount(Boolean value) {
        this.assignedToAccount = value;
    }

    /**
     * ��ȡbanner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBanner() {
        if (banner == null) {
            return false;
        } else {
            return banner;
        }
    }

    /**
     * ����banner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanner(Boolean value) {
        this.banner = value;
    }

    /**
     * ��ȡclosedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedTime() {
        if (closedTime == null) {
            return false;
        } else {
            return closedTime;
        }
    }

    /**
     * ����closedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedTime(Boolean value) {
        this.closedTime = value;
    }

    /**
     * ��ȡclosedValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedValue() {
        if (closedValue == null) {
            return false;
        } else {
            return closedValue;
        }
    }

    /**
     * ����closedValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedValue(Boolean value) {
        this.closedValue = value;
    }

    /**
     * ��ȡcostOfSale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCostOfSale() {
        if (costOfSale == null) {
            return false;
        } else {
            return costOfSale;
        }
    }

    /**
     * ����costOfSale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostOfSale(Boolean value) {
        this.costOfSale = value;
    }

    /**
     * ��ȡfileAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * ����fileAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * ��ȡforecastCloseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForecastCloseDate() {
        if (forecastCloseDate == null) {
            return false;
        } else {
            return forecastCloseDate;
        }
    }

    /**
     * ����forecastCloseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastCloseDate(Boolean value) {
        this.forecastCloseDate = value;
    }

    /**
     * ��ȡinitialContactDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInitialContactDate() {
        if (initialContactDate == null) {
            return false;
        } else {
            return initialContactDate;
        }
    }

    /**
     * ����initialContactDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialContactDate(Boolean value) {
        this.initialContactDate = value;
    }

    /**
     * ��ȡleadRejectDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDateTime() {
        if (leadRejectDateTime == null) {
            return false;
        } else {
            return leadRejectDateTime;
        }
    }

    /**
     * ����leadRejectDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDateTime(Boolean value) {
        this.leadRejectDateTime = value;
    }

    /**
     * ��ȡleadRejectDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDescription() {
        if (leadRejectDescription == null) {
            return false;
        } else {
            return leadRejectDescription;
        }
    }

    /**
     * ����leadRejectDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDescription(Boolean value) {
        this.leadRejectDescription = value;
    }

    /**
     * ��ȡleadRejectReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectReason() {
        if (leadRejectReason == null) {
            return false;
        } else {
            return leadRejectReason;
        }
    }

    /**
     * ����leadRejectReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectReason(Boolean value) {
        this.leadRejectReason = value;
    }

    /**
     * ��ȡlostTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLostTime() {
        if (lostTime == null) {
            return false;
        } else {
            return lostTime;
        }
    }

    /**
     * ����lostTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLostTime(Boolean value) {
        this.lostTime = value;
    }

    /**
     * ��ȡmanagerValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManagerValue() {
        if (managerValue == null) {
            return false;
        } else {
            return managerValue;
        }
    }

    /**
     * ����managerValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerValue(Boolean value) {
        this.managerValue = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isName() {
        if (name == null) {
            return false;
        } else {
            return name;
        }
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * ��ȡnotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * ����notes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * ��ȡorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * ����organization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * ��ȡotherContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtherContacts() {
        if (otherContacts == null) {
            return false;
        } else {
            return otherContacts;
        }
    }

    /**
     * ����otherContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherContacts(Boolean value) {
        this.otherContacts = value;
    }

    /**
     * ��ȡprimaryContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimaryContact() {
        if (primaryContact == null) {
            return false;
        } else {
            return primaryContact;
        }
    }

    /**
     * ����primaryContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryContact(Boolean value) {
        this.primaryContact = value;
    }

    /**
     * ��ȡquotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuotes() {
        if (quotes == null) {
            return false;
        } else {
            return quotes;
        }
    }

    /**
     * ����quotes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuotes(Boolean value) {
        this.quotes = value;
    }

    /**
     * ��ȡrecallTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecallTime() {
        if (recallTime == null) {
            return false;
        } else {
            return recallTime;
        }
    }

    /**
     * ����recallTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallTime(Boolean value) {
        this.recallTime = value;
    }

    /**
     * ��ȡreturnValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnValue() {
        if (returnValue == null) {
            return false;
        } else {
            return returnValue;
        }
    }

    /**
     * ����returnValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnValue(Boolean value) {
        this.returnValue = value;
    }

    /**
     * ��ȡsalesRepresentativeValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesRepresentativeValue() {
        if (salesRepresentativeValue == null) {
            return false;
        } else {
            return salesRepresentativeValue;
        }
    }

    /**
     * ����salesRepresentativeValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeValue(Boolean value) {
        this.salesRepresentativeValue = value;
    }

    /**
     * ��ȡsummary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummary() {
        if (summary == null) {
            return false;
        } else {
            return summary;
        }
    }

    /**
     * ����summary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummary(Boolean value) {
        this.summary = value;
    }

    /**
     * ��ȡterritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTerritory() {
        if (territory == null) {
            return false;
        } else {
            return territory;
        }
    }

    /**
     * ����territory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritory(Boolean value) {
        this.territory = value;
    }

    /**
     * ��ȡwinLossDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossDescription() {
        if (winLossDescription == null) {
            return false;
        } else {
            return winLossDescription;
        }
    }

    /**
     * ����winLossDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossDescription(Boolean value) {
        this.winLossDescription = value;
    }

    /**
     * ��ȡwinLossReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossReason() {
        if (winLossReason == null) {
            return false;
        } else {
            return winLossReason;
        }
    }

    /**
     * ����winLossReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossReason(Boolean value) {
        this.winLossReason = value;
    }

}
