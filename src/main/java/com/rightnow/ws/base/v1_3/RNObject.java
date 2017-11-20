
package com.rightnow.ws.base.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.objects.AccountType;
import com.rightnow.ws.objects.AnalyticsReportType;
import com.rightnow.ws.objects.AnswerType;
import com.rightnow.ws.objects.AssetStatusType;
import com.rightnow.ws.objects.AssetType;
import com.rightnow.ws.objects.CampaignType;
import com.rightnow.ws.objects.ChannelTypeType;
import com.rightnow.ws.objects.ConfigurationType;
import com.rightnow.ws.objects.ContactType;
import com.rightnow.ws.objects.CountryType;
import com.rightnow.ws.objects.EventSubscriptionType;
import com.rightnow.ws.objects.HolidayType;
import com.rightnow.ws.objects.IncidentType;
import com.rightnow.ws.objects.MailboxType;
import com.rightnow.ws.objects.MessageBaseType;
import com.rightnow.ws.objects.OpportunityStatusType;
import com.rightnow.ws.objects.OpportunityType;
import com.rightnow.ws.objects.OrganizationType;
import com.rightnow.ws.objects.PurchasedProductType;
import com.rightnow.ws.objects.SSOTokenReferenceType;
import com.rightnow.ws.objects.SalesProductType;
import com.rightnow.ws.objects.SalesTerritoryType;
import com.rightnow.ws.objects.ServiceCategoryType;
import com.rightnow.ws.objects.ServiceDispositionType;
import com.rightnow.ws.objects.ServiceProductType;
import com.rightnow.ws.objects.SiteInterfaceType;
import com.rightnow.ws.objects.StandardContentType;
import com.rightnow.ws.objects.TaskType;
import com.rightnow.ws.objects.VariableType;
import com.rightnow.ws.generic.v1_3.GenericObject;


/**
 * <p>RNObject complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RNObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_3}ID" minOccurs="0"/>
 *         &lt;element name="LookupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNObject", propOrder = {
    "id",
    "lookupName",
    "createdTime",
    "updatedTime"
})
@XmlSeeAlso({
    GenericObject.class,
    AccountType.class,
    ConfigurationType.class,
    AnalyticsReportType.class,
    MessageBaseType.class,
    AssetType.class,
    SSOTokenReferenceType.class,
    CountryType.class,
    OrganizationType.class,
    ServiceCategoryType.class,
    SalesProductType.class,
    HolidayType.class,
    ChannelTypeType.class,
    SalesTerritoryType.class,
    TaskType.class,
    CampaignType.class,
    ServiceDispositionType.class,
    VariableType.class,
    SiteInterfaceType.class,
    ServiceProductType.class,
    AssetStatusType.class,
    EventSubscriptionType.class,
    PurchasedProductType.class,
    OpportunityType.class,
    MailboxType.class,
    ContactType.class,
    AnswerType.class,
    OpportunityStatusType.class,
    StandardContentType.class,
    IncidentType.class
})
public class RNObject {

    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "LookupName")
    protected String lookupName;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * ��ȡlookupName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupName() {
        return lookupName;
    }

    /**
     * ����lookupName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupName(String value) {
        this.lookupName = value;
    }

    /**
     * ��ȡcreatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * ����createdTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * ��ȡupdatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * ����updatedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
