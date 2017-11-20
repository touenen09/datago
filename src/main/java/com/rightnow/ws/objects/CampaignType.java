
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.RNObject;
import com.rightnow.ws.nullfields.v1_3.CampaignNullFields;


/**
 * <p>Campaign complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Campaign">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_3}RNObject">
 *       &lt;sequence>
 *         &lt;element name="ActualCost" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="ActualLeads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActualOpportunities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActualSales" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Budget" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CampaignStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CampaignEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ExpectedCost" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="ExpectedLeads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpectedOpportunities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpectedSales" type="{urn:objects.ws.rightnow.com/v1_3}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Flow" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_3}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="IsSingleExecute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectivesSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByAccount" type="{urn:base.ws.rightnow.com/v1_3}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}CampaignNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campaign", propOrder = {
    "actualCost",
    "actualLeads",
    "actualOpportunities",
    "actualSales",
    "assignedToAccount",
    "budget",
    "campaignStartTime",
    "campaignEndTime",
    "createdByAccount",
    "expectedCost",
    "expectedLeads",
    "expectedOpportunities",
    "expectedSales",
    "flow",
    "folder",
    "_interface",
    "isSingleExecute",
    "name",
    "objectivesSummary",
    "updatedByAccount",
    "validNullFields"
})
public class CampaignType
    extends RNObject
{

    @XmlElementRef(name = "ActualCost", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> actualCost;
    @XmlElementRef(name = "ActualLeads", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actualLeads;
    @XmlElementRef(name = "ActualOpportunities", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actualOpportunities;
    @XmlElementRef(name = "ActualSales", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> actualSales;
    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> assignedToAccount;
    @XmlElementRef(name = "Budget", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> budget;
    @XmlElementRef(name = "CampaignStartTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> campaignStartTime;
    @XmlElementRef(name = "CampaignEndTime", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> campaignEndTime;
    @XmlElementRef(name = "CreatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> createdByAccount;
    @XmlElementRef(name = "ExpectedCost", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> expectedCost;
    @XmlElementRef(name = "ExpectedLeads", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expectedLeads;
    @XmlElementRef(name = "ExpectedOpportunities", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expectedOpportunities;
    @XmlElementRef(name = "ExpectedSales", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryValueType> expectedSales;
    @XmlElement(name = "Flow")
    protected NamedID flow;
    @XmlElementRef(name = "Folder", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchy> folder;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElement(name = "IsSingleExecute")
    protected Boolean isSingleExecute;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "ObjectivesSummary", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectivesSummary;
    @XmlElementRef(name = "UpdatedByAccount", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> updatedByAccount;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<CampaignNullFields> validNullFields;

    /**
     * ��ȡactualCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getActualCost() {
        return actualCost;
    }

    /**
     * ����actualCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setActualCost(JAXBElement<MonetaryValueType> value) {
        this.actualCost = value;
    }

    /**
     * ��ȡactualLeads���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActualLeads() {
        return actualLeads;
    }

    /**
     * ����actualLeads���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActualLeads(JAXBElement<Integer> value) {
        this.actualLeads = value;
    }

    /**
     * ��ȡactualOpportunities���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActualOpportunities() {
        return actualOpportunities;
    }

    /**
     * ����actualOpportunities���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActualOpportunities(JAXBElement<Integer> value) {
        this.actualOpportunities = value;
    }

    /**
     * ��ȡactualSales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getActualSales() {
        return actualSales;
    }

    /**
     * ����actualSales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setActualSales(JAXBElement<MonetaryValueType> value) {
        this.actualSales = value;
    }

    /**
     * ��ȡassignedToAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * ����assignedToAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setAssignedToAccount(JAXBElement<NamedIDHierarchy> value) {
        this.assignedToAccount = value;
    }

    /**
     * ��ȡbudget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getBudget() {
        return budget;
    }

    /**
     * ����budget���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setBudget(JAXBElement<MonetaryValueType> value) {
        this.budget = value;
    }

    /**
     * ��ȡcampaignStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCampaignStartTime() {
        return campaignStartTime;
    }

    /**
     * ����campaignStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCampaignStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.campaignStartTime = value;
    }

    /**
     * ��ȡcampaignEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCampaignEndTime() {
        return campaignEndTime;
    }

    /**
     * ����campaignEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCampaignEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.campaignEndTime = value;
    }

    /**
     * ��ȡcreatedByAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCreatedByAccount() {
        return createdByAccount;
    }

    /**
     * ����createdByAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCreatedByAccount(JAXBElement<NamedID> value) {
        this.createdByAccount = value;
    }

    /**
     * ��ȡexpectedCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getExpectedCost() {
        return expectedCost;
    }

    /**
     * ����expectedCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setExpectedCost(JAXBElement<MonetaryValueType> value) {
        this.expectedCost = value;
    }

    /**
     * ��ȡexpectedLeads���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpectedLeads() {
        return expectedLeads;
    }

    /**
     * ����expectedLeads���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpectedLeads(JAXBElement<Integer> value) {
        this.expectedLeads = value;
    }

    /**
     * ��ȡexpectedOpportunities���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpectedOpportunities() {
        return expectedOpportunities;
    }

    /**
     * ����expectedOpportunities���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpectedOpportunities(JAXBElement<Integer> value) {
        this.expectedOpportunities = value;
    }

    /**
     * ��ȡexpectedSales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public JAXBElement<MonetaryValueType> getExpectedSales() {
        return expectedSales;
    }

    /**
     * ����expectedSales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}
     *     
     */
    public void setExpectedSales(JAXBElement<MonetaryValueType> value) {
        this.expectedSales = value;
    }

    /**
     * ��ȡflow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getFlow() {
        return flow;
    }

    /**
     * ����flow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setFlow(NamedID value) {
        this.flow = value;
    }

    /**
     * ��ȡfolder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getFolder() {
        return folder;
    }

    /**
     * ����folder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setFolder(JAXBElement<NamedIDHierarchy> value) {
        this.folder = value;
    }

    /**
     * ��ȡinterface���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getInterface() {
        return _interface;
    }

    /**
     * ����interface���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setInterface(NamedID value) {
        this._interface = value;
    }

    /**
     * ��ȡisSingleExecute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSingleExecute() {
        return isSingleExecute;
    }

    /**
     * ����isSingleExecute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSingleExecute(Boolean value) {
        this.isSingleExecute = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡobjectivesSummary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectivesSummary() {
        return objectivesSummary;
    }

    /**
     * ����objectivesSummary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectivesSummary(JAXBElement<String> value) {
        this.objectivesSummary = value;
    }

    /**
     * ��ȡupdatedByAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getUpdatedByAccount() {
        return updatedByAccount;
    }

    /**
     * ����updatedByAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setUpdatedByAccount(JAXBElement<NamedID> value) {
        this.updatedByAccount = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CampaignNullFields }{@code >}
     *     
     */
    public JAXBElement<CampaignNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CampaignNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<CampaignNullFields> value) {
        this.validNullFields = value;
    }

}
