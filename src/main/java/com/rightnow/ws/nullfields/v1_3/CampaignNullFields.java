
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CampaignNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CampaignNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ActualCost" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ActualLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ActualOpportunities" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ActualSales" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Budget" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CampaignStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CampaignEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpectedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpectedLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpectedOpportunities" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpectedSales" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Folder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ObjectivesSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignNullFields")
public class CampaignNullFields {

    @XmlAttribute(name = "ActualCost")
    protected Boolean actualCost;
    @XmlAttribute(name = "ActualLeads")
    protected Boolean actualLeads;
    @XmlAttribute(name = "ActualOpportunities")
    protected Boolean actualOpportunities;
    @XmlAttribute(name = "ActualSales")
    protected Boolean actualSales;
    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "Budget")
    protected Boolean budget;
    @XmlAttribute(name = "CampaignStartTime")
    protected Boolean campaignStartTime;
    @XmlAttribute(name = "CampaignEndTime")
    protected Boolean campaignEndTime;
    @XmlAttribute(name = "ExpectedCost")
    protected Boolean expectedCost;
    @XmlAttribute(name = "ExpectedLeads")
    protected Boolean expectedLeads;
    @XmlAttribute(name = "ExpectedOpportunities")
    protected Boolean expectedOpportunities;
    @XmlAttribute(name = "ExpectedSales")
    protected Boolean expectedSales;
    @XmlAttribute(name = "Folder")
    protected Boolean folder;
    @XmlAttribute(name = "ObjectivesSummary")
    protected Boolean objectivesSummary;

    /**
     * ��ȡactualCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActualCost() {
        if (actualCost == null) {
            return false;
        } else {
            return actualCost;
        }
    }

    /**
     * ����actualCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualCost(Boolean value) {
        this.actualCost = value;
    }

    /**
     * ��ȡactualLeads���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActualLeads() {
        if (actualLeads == null) {
            return false;
        } else {
            return actualLeads;
        }
    }

    /**
     * ����actualLeads���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualLeads(Boolean value) {
        this.actualLeads = value;
    }

    /**
     * ��ȡactualOpportunities���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActualOpportunities() {
        if (actualOpportunities == null) {
            return false;
        } else {
            return actualOpportunities;
        }
    }

    /**
     * ����actualOpportunities���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualOpportunities(Boolean value) {
        this.actualOpportunities = value;
    }

    /**
     * ��ȡactualSales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActualSales() {
        if (actualSales == null) {
            return false;
        } else {
            return actualSales;
        }
    }

    /**
     * ����actualSales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualSales(Boolean value) {
        this.actualSales = value;
    }

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
     * ��ȡbudget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBudget() {
        if (budget == null) {
            return false;
        } else {
            return budget;
        }
    }

    /**
     * ����budget���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBudget(Boolean value) {
        this.budget = value;
    }

    /**
     * ��ȡcampaignStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaignStartTime() {
        if (campaignStartTime == null) {
            return false;
        } else {
            return campaignStartTime;
        }
    }

    /**
     * ����campaignStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaignStartTime(Boolean value) {
        this.campaignStartTime = value;
    }

    /**
     * ��ȡcampaignEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCampaignEndTime() {
        if (campaignEndTime == null) {
            return false;
        } else {
            return campaignEndTime;
        }
    }

    /**
     * ����campaignEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampaignEndTime(Boolean value) {
        this.campaignEndTime = value;
    }

    /**
     * ��ȡexpectedCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpectedCost() {
        if (expectedCost == null) {
            return false;
        } else {
            return expectedCost;
        }
    }

    /**
     * ����expectedCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpectedCost(Boolean value) {
        this.expectedCost = value;
    }

    /**
     * ��ȡexpectedLeads���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpectedLeads() {
        if (expectedLeads == null) {
            return false;
        } else {
            return expectedLeads;
        }
    }

    /**
     * ����expectedLeads���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpectedLeads(Boolean value) {
        this.expectedLeads = value;
    }

    /**
     * ��ȡexpectedOpportunities���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpectedOpportunities() {
        if (expectedOpportunities == null) {
            return false;
        } else {
            return expectedOpportunities;
        }
    }

    /**
     * ����expectedOpportunities���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpectedOpportunities(Boolean value) {
        this.expectedOpportunities = value;
    }

    /**
     * ��ȡexpectedSales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpectedSales() {
        if (expectedSales == null) {
            return false;
        } else {
            return expectedSales;
        }
    }

    /**
     * ����expectedSales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpectedSales(Boolean value) {
        this.expectedSales = value;
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
     * ��ȡobjectivesSummary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isObjectivesSummary() {
        if (objectivesSummary == null) {
            return false;
        } else {
            return objectivesSummary;
        }
    }

    /**
     * ����objectivesSummary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjectivesSummary(Boolean value) {
        this.objectivesSummary = value;
    }

}
