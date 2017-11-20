
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.rightnow.ws.base.v1_3.NamedID;
import com.rightnow.ws.base.v1_3.NamedIDDeltaList;
import com.rightnow.ws.base.v1_3.NamedIDHierarchy;
import com.rightnow.ws.base.v1_3.NamedIDHierarchyList;
import com.rightnow.ws.base.v1_3.NamedIDList;
import com.rightnow.ws.nullfields.v1_3.AccountNullFields;
import com.rightnow.ws.nullfields.v1_3.AccountSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.AddressNullFields;
import com.rightnow.ws.nullfields.v1_3.AnswerNotificationNullFields;
import com.rightnow.ws.nullfields.v1_3.AnswerNullFields;
import com.rightnow.ws.nullfields.v1_3.AnswerRelatedAnswerNullFields;
import com.rightnow.ws.nullfields.v1_3.AssetNullFields;
import com.rightnow.ws.nullfields.v1_3.AssignedSLAInstanceNullFields;
import com.rightnow.ws.nullfields.v1_3.BannerNullFields;
import com.rightnow.ws.nullfields.v1_3.CampaignNullFields;
import com.rightnow.ws.nullfields.v1_3.CategoryNotificationNullFields;
import com.rightnow.ws.nullfields.v1_3.ChannelUsernameNullFields;
import com.rightnow.ws.nullfields.v1_3.ContactMarketingSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.ContactNullFields;
import com.rightnow.ws.nullfields.v1_3.ContactSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.ContactServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.CountryNullFields;
import com.rightnow.ws.nullfields.v1_3.GroupAccountNullFields;
import com.rightnow.ws.nullfields.v1_3.HolidayNullFields;
import com.rightnow.ws.nullfields.v1_3.IncidentNullFields;
import com.rightnow.ws.nullfields.v1_3.LabelNullFields;
import com.rightnow.ws.nullfields.v1_3.MailMessageNullFields;
import com.rightnow.ws.nullfields.v1_3.MailMessageRecipientsNullFields;
import com.rightnow.ws.nullfields.v1_3.MailboxIncomingEmailSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.MailboxNullFields;
import com.rightnow.ws.nullfields.v1_3.MailboxOutgoingEmailSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.MonetaryValueNullFields;
import com.rightnow.ws.nullfields.v1_3.NoteNullFields;
import com.rightnow.ws.nullfields.v1_3.OpportunityContactNullFields;
import com.rightnow.ws.nullfields.v1_3.OpportunityNullFields;
import com.rightnow.ws.nullfields.v1_3.OrganizationNullFields;
import com.rightnow.ws.nullfields.v1_3.OrganizationSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.OrganizationServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.PersonNameNullFields;
import com.rightnow.ws.nullfields.v1_3.ProductNotificationNullFields;
import com.rightnow.ws.nullfields.v1_3.PurchasedProductNullFields;
import com.rightnow.ws.nullfields.v1_3.QuoteLineItemNullFields;
import com.rightnow.ws.nullfields.v1_3.QuoteNullFields;
import com.rightnow.ws.nullfields.v1_3.SSOTokenReferenceAttributesNullFields;
import com.rightnow.ws.nullfields.v1_3.SSOTokenReferenceNullFields;
import com.rightnow.ws.nullfields.v1_3.SalesProductNullFields;
import com.rightnow.ws.nullfields.v1_3.SalesProductScheduleNullFields;
import com.rightnow.ws.nullfields.v1_3.SalesTerritoryNullFields;
import com.rightnow.ws.nullfields.v1_3.ServiceCategoryNullFields;
import com.rightnow.ws.nullfields.v1_3.ServiceDispositionNullFields;
import com.rightnow.ws.nullfields.v1_3.ServiceProductNullFields;
import com.rightnow.ws.nullfields.v1_3.StageWithStrategyNullFields;
import com.rightnow.ws.nullfields.v1_3.StandardContentContentValueNullFields;
import com.rightnow.ws.nullfields.v1_3.StandardContentNullFields;
import com.rightnow.ws.nullfields.v1_3.TaskMarketingSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.TaskNullFields;
import com.rightnow.ws.nullfields.v1_3.TaskSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.TaskServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_3.ThreadNullFields;
import com.rightnow.ws.nullfields.v1_3.TimeBilledNullFields;
import com.rightnow.ws.nullfields.v1_3.VariableNullFields;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.datago.model.rightnow.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AssignedSLAInstance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssignedSLAInstance");
    private final static QName _Phone_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Phone");
    private final static QName _EventSubscription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "EventSubscription");
    private final static QName _PurchasedProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PurchasedProduct");
    private final static QName _IncidentContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentContact");
    private final static QName _OpportunityContactDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OpportunityContactDelta");
    private final static QName _OrganizationSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OrganizationSalesSettings");
    private final static QName _ServiceProductDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceProductDelta");
    private final static QName _Variable_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Variable");
    private final static QName _FileAttachmentIncidentList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentIncidentList");
    private final static QName _NoteList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NoteList");
    private final static QName _ThreadList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ThreadList");
    private final static QName _OpportunityContactList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OpportunityContactList");
    private final static QName _SiteInterface_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SiteInterface");
    private final static QName _SalesProductSchedule_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesProductSchedule");
    private final static QName _ContactSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactSalesSettings");
    private final static QName _TimeBilledList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TimeBilledList");
    private final static QName _TypedAddressList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TypedAddressList");
    private final static QName _OpportunityStatus_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OpportunityStatus");
    private final static QName _Incident_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Incident");
    private final static QName _SLAInstance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SLAInstance");
    private final static QName _MailMessageBody_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailMessageBody");
    private final static QName _MailMessage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailMessage");
    private final static QName _EmailList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "EmailList");
    private final static QName _Contact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Contact");
    private final static QName _FileAttachmentShared_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentShared");
    private final static QName _IncidentContactDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentContactDelta");
    private final static QName _LabelRequired_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LabelRequired");
    private final static QName _AccountSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccountSalesSettings");
    private final static QName _Task_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Task");
    private final static QName _OpportunityContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OpportunityContact");
    private final static QName _ServiceDisposition_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceDisposition");
    private final static QName _StageWithStrategy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StageWithStrategy");
    private final static QName _ContactOpenIDAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactOpenIDAccount");
    private final static QName _FileAttachmentList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentList");
    private final static QName _ProductNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ProductNotificationList");
    private final static QName _SalesProductOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesProductOptions");
    private final static QName _ProvinceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ProvinceList");
    private final static QName _CRMModules_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CRMModules");
    private final static QName _Province_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Province");
    private final static QName _FileAttachmentIncident_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentIncident");
    private final static QName _CategoryNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CategoryNotificationList");
    private final static QName _Organization_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Organization");
    private final static QName _AccountOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccountOptions");
    private final static QName _AnalyticsReportSearchFilter_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnalyticsReportSearchFilter");
    private final static QName _ContactServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactServiceSettings");
    private final static QName _FileAttachmentCommon_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentCommon");
    private final static QName _AnswerRelatedAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnswerRelatedAnswerList");
    private final static QName _TaskServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TaskServiceSettings");
    private final static QName _TaskMarketingSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TaskMarketingSettings");
    private final static QName _ContactMarketingSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactMarketingSettings");
    private final static QName _ChannelType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChannelType");
    private final static QName _Banner_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Banner");
    private final static QName _Thread_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Thread");
    private final static QName _PhoneList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PhoneList");
    private final static QName _Asset_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Asset");
    private final static QName _StatusWithType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StatusWithType");
    private final static QName _Account_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Account");
    private final static QName _AnalyticsReport_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnalyticsReport");
    private final static QName _Address_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Address");
    private final static QName _PersonFullName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PersonFullName");
    private final static QName _AnswerRelatedAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnswerRelatedAnswer");
    private final static QName _IncidentMilestoneInstanceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentMilestoneInstanceList");
    private final static QName _Country_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Country");
    private final static QName _InheritOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InheritOptions");
    private final static QName _AnalyticsReportFilter_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnalyticsReportFilter");
    private final static QName _OrganizationServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OrganizationServiceSettings");
    private final static QName _IncidentContactList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentContactList");
    private final static QName _ProductNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ProductNotification");
    private final static QName _Opportunity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Opportunity");
    private final static QName _ChannelTypeOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChannelTypeOptions");
    private final static QName _MailMessageRecipients_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailMessageRecipients");
    private final static QName _ServiceProductList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceProductList");
    private final static QName _ChannelUsernameList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChannelUsernameList");
    private final static QName _AssetStatus_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssetStatus");
    private final static QName _SalesProductScheduleList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesProductScheduleList");
    private final static QName _ServiceProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceProduct");
    private final static QName _MailMessageOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailMessageOptions");
    private final static QName _StringFileAttachment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StringFileAttachment");
    private final static QName _Answer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Answer");
    private final static QName _Quote_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Quote");
    private final static QName _MailMessageStatus_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailMessageStatus");
    private final static QName _MailboxIncomingEmailSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailboxIncomingEmailSettings");
    private final static QName _StandardContentUsage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StandardContentUsage");
    private final static QName _SLAInstanceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SLAInstanceList");
    private final static QName _StandardContent_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StandardContent");
    private final static QName _CategoryNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CategoryNotification");
    private final static QName _LabelRequiredList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LabelRequiredList");
    private final static QName _StandardContentAttributes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StandardContentAttributes");
    private final static QName _PersonName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PersonName");
    private final static QName _MessageContentType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MessageContentType");
    private final static QName _MenuAssignableAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MenuAssignableAccount");
    private final static QName _AccountServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccountServiceSettings");
    private final static QName _AccessControlAbility_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccessControlAbility");
    private final static QName _MarketingMailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MarketingMailbox");
    private final static QName _SharedFileAttachmentIncident_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SharedFileAttachmentIncident");
    private final static QName _AnalyticsReportColumn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnalyticsReportColumn");
    private final static QName _Email_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Email");
    private final static QName _AnalyticsReportFilterAttributes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnalyticsReportFilterAttributes");
    private final static QName _SalesTerritory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesTerritory");
    private final static QName _FileAttachmentSharedList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentSharedList");
    private final static QName _FileAttachment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachment");
    private final static QName _SharedFileAttachmentCommon_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SharedFileAttachmentCommon");
    private final static QName _ContactOpenIDAccountList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactOpenIDAccountList");
    private final static QName _Label_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Label");
    private final static QName _Campaign_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Campaign");
    private final static QName _AnswerNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnswerNotificationList");
    private final static QName _ServiceDispositionDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceDispositionDelta");
    private final static QName _ServiceCategoryDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceCategoryDelta");
    private final static QName _ServiceCategoryList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceCategoryList");
    private final static QName _LabelList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LabelList");
    private final static QName _FileAttachmentAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentAnswerList");
    private final static QName _Mailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Mailbox");
    private final static QName _AccessControlPermission_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccessControlPermission");
    private final static QName _AssetSLAInstance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssetSLAInstance");
    private final static QName _ServiceCategory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceCategory");
    private final static QName _AnswerNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnswerNotification");
    private final static QName _SalesProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesProduct");
    private final static QName _TimeBilled_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TimeBilled");
    private final static QName _IncidentResponse_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentResponse");
    private final static QName _Holiday_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Holiday");
    private final static QName _MailboxOutgoingEmailSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailboxOutgoingEmailSettings");
    private final static QName _ChannelUsername_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChannelUsername");
    private final static QName _AssetSLAInstanceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssetSLAInstanceList");
    private final static QName _QuoteLineItem_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "QuoteLineItem");
    private final static QName _SSOTokenReferenceAttributes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SSOTokenReferenceAttributes");
    private final static QName _StandardContentContentValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StandardContentContentValue");
    private final static QName _MonetaryValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MonetaryValue");
    private final static QName _AccessControlRoleSet_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccessControlRoleSet");
    private final static QName _QuoteList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "QuoteList");
    private final static QName _ServiceMailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceMailbox");
    private final static QName _InterfaceValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InterfaceValue");
    private final static QName _TypedAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TypedAddress");
    private final static QName _GroupAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "GroupAccount");
    private final static QName _Configuration_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Configuration");
    private final static QName _AccessLevelType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccessLevelType");
    private final static QName _TaskSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TaskSalesSettings");
    private final static QName _StandardContentContentValueList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StandardContentContentValueList");
    private final static QName _MessageBase_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MessageBase");
    private final static QName _FileAttachmentAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentAnswer");
    private final static QName _IncidentMilestoneInstance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncidentMilestoneInstance");
    private final static QName _Note_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Note");
    private final static QName _SharedFileAttachmentAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SharedFileAttachmentAnswer");
    private final static QName _SharedFileAttachmentShared_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SharedFileAttachmentShared");
    private final static QName _FileAttachmentCommonList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachmentCommonList");
    private final static QName _QuoteLineItemList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "QuoteLineItemList");
    private final static QName _ServiceDispositionList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ServiceDispositionList");
    private final static QName _SSOTokenReference_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SSOTokenReference");
    private final static QName _InterfaceValueList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InterfaceValueList");
    private final static QName _AssetStatuses_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssetStatuses");
    private final static QName _ContactMarketingSettingsTypeContactLists_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactLists");
    private final static QName _ContactMarketingSettingsTypeMarketingOrganizationNameAlt_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MarketingOrganizationNameAlt");
    private final static QName _ContactMarketingSettingsTypeMarketingOptIn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MarketingOptIn");
    private final static QName _ContactMarketingSettingsTypeSurveyOptIn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SurveyOptIn");
    private final static QName _ContactMarketingSettingsTypeValidNullFields_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ValidNullFields");
    private final static QName _ContactMarketingSettingsTypeEmailFormat_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "EmailFormat");
    private final static QName _ContactMarketingSettingsTypeMarketingOrganizationName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MarketingOrganizationName");
    private final static QName _OrganizationServiceSettingsTypeSLAInstances_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SLAInstances");
    private final static QName _AssignedSLAInstanceTypeNameOfSLA_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NameOfSLA");
    private final static QName _AssignedSLAInstanceTypeRemainingTotal_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RemainingTotal");
    private final static QName _AssignedSLAInstanceTypeRemainingFromCSR_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RemainingFromCSR");
    private final static QName _AssignedSLAInstanceTypeRemainingFromWeb_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RemainingFromWeb");
    private final static QName _AssignedSLAInstanceTypeRemainingFromChat_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RemainingFromChat");
    private final static QName _AssignedSLAInstanceTypeRemainingFromEmail_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RemainingFromEmail");
    private final static QName _SalesProductScheduleTypeComment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Comment");
    private final static QName _SalesProductScheduleTypeScheduleEndDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ScheduleEndDate");
    private final static QName _ContactServiceSettingsTypeAnswerNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AnswerNotifications");
    private final static QName _ContactServiceSettingsTypeCategoryNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CategoryNotifications");
    private final static QName _ContactServiceSettingsTypeProductNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ProductNotifications");
    private final static QName _ServiceCategoryTypeDescriptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Descriptions");
    private final static QName _ServiceCategoryTypeEndUserVisibleInterfaces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "EndUserVisibleInterfaces");
    private final static QName _ServiceCategoryTypeParent_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Parent");
    private final static QName _ServiceCategoryTypeAdminVisibleInterfaces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdminVisibleInterfaces");
    private final static QName _ServiceCategoryTypeProductLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ProductLinks");
    private final static QName _IncidentTypeClosedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ClosedTime");
    private final static QName _IncidentTypeLastSurveyScore_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LastSurveyScore");
    private final static QName _IncidentTypeMilestoneInstances_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MilestoneInstances");
    private final static QName _IncidentTypeLanguage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Language");
    private final static QName _IncidentTypeInitialSolutionTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InitialSolutionTime");
    private final static QName _IncidentTypeQueue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Queue");
    private final static QName _IncidentTypeCategory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Category");
    private final static QName _IncidentTypeLastResponseTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LastResponseTime");
    private final static QName _IncidentTypeInitialResponseDueTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InitialResponseDueTime");
    private final static QName _IncidentTypeChatQueue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChatQueue");
    private final static QName _IncidentTypeFileAttachments_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FileAttachments");
    private final static QName _IncidentTypeProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Product");
    private final static QName _IncidentTypeSmartSenseStaff_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SmartSenseStaff");
    private final static QName _IncidentTypeResolutionInterval_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ResolutionInterval");
    private final static QName _IncidentTypeOtherContacts_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OtherContacts");
    private final static QName _IncidentTypeBilledMinutes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "BilledMinutes");
    private final static QName _IncidentTypeDisposition_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Disposition");
    private final static QName _IncidentTypeCreatedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CreatedByAccount");
    private final static QName _IncidentTypeChannel_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Channel");
    private final static QName _IncidentTypeResponseInterval_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ResponseInterval");
    private final static QName _IncidentTypeMailing_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Mailing");
    private final static QName _IncidentTypeSeverity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Severity");
    private final static QName _IncidentTypeSmartSenseCustomer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SmartSenseCustomer");
    private final static QName _IncidentTypeSubject_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Subject");
    private final static QName _ThreadTypeMailHeader_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailHeader");
    private final static QName _ContactSalesSettingsTypeAcquiredDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AcquiredDate");
    private final static QName _ContactSalesSettingsTypeSalesAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesAccount");
    private final static QName _AnswerRelatedAnswerTypeManualStrength_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ManualStrength");
    private final static QName _ContactTypePasswordEmailExpirationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PasswordEmailExpirationTime");
    private final static QName _ContactTypeChannelUsernames_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ChannelUsernames");
    private final static QName _ContactTypeExternalReference_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExternalReference");
    private final static QName _ContactTypePhones_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Phones");
    private final static QName _ContactTypeEmails_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Emails");
    private final static QName _ContactTypePasswordExpirationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PasswordExpirationTime");
    private final static QName _ContactTypeNotes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Notes");
    private final static QName _ContactTypeContactType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactType");
    private final static QName _ContactTypeNewPassword_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NewPassword");
    private final static QName _ContactTypeLogin_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Login");
    private final static QName _ContactTypeTitle_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Title");
    private final static QName _PersonNameTypeLast_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Last");
    private final static QName _PersonNameTypeFirst_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "First");
    private final static QName _ProductNotificationTypeInterface_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Interface");
    private final static QName _BannerTypeImportanceFlag_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ImportanceFlag");
    private final static QName _BannerTypeUpdatedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "UpdatedByAccount");
    private final static QName _BannerTypeUpdatedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "UpdatedTime");
    private final static QName _BannerTypeText_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Text");
    private final static QName _CountryTypeProvinces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Provinces");
    private final static QName _ConfigurationTypeValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Value");
    private final static QName _OpportunityContactTypeContactRole_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContactRole");
    private final static QName _SSOTokenReferenceTypeIssuedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IssuedTime");
    private final static QName _AccountSalesSettingsTypeTerritory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Territory");
    private final static QName _AssetTypeDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Description");
    private final static QName _AssetTypeInstalledDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InstalledDate");
    private final static QName _AssetTypePurchasedDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PurchasedDate");
    private final static QName _AssetTypePrice_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Price");
    private final static QName _AssetTypeSerialNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SerialNumber");
    private final static QName _AssetTypeRetiredDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RetiredDate");
    private final static QName _SalesTerritoryTypeTerritoryHierarchy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TerritoryHierarchy");
    private final static QName _QuoteLineItemTypeAdjustedPrice_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdjustedPrice");
    private final static QName _QuoteLineItemTypeOriginalDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OriginalDescription");
    private final static QName _QuoteLineItemTypeOriginalPartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OriginalPartNumber");
    private final static QName _QuoteLineItemTypeAdjustedName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdjustedName");
    private final static QName _QuoteLineItemTypeAdjustedTotal_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdjustedTotal");
    private final static QName _QuoteLineItemTypeOriginalName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OriginalName");
    private final static QName _QuoteLineItemTypeAdjustedDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdjustedDescription");
    private final static QName _QuoteLineItemTypeAdjustedPartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdjustedPartNumber");
    private final static QName _TimeBilledTypeBillableTask_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "BillableTask");
    private final static QName _GroupAccountTypeStaffGroup_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StaffGroup");
    private final static QName _OpportunityTypeInitialContactDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InitialContactDate");
    private final static QName _OpportunityTypeAccountHierarchy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccountHierarchy");
    private final static QName _OpportunityTypeSalesRepresentativeValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SalesRepresentativeValue");
    private final static QName _OpportunityTypeManagerValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ManagerValue");
    private final static QName _OpportunityTypeWinLossReason_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "WinLossReason");
    private final static QName _OpportunityTypeLostTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LostTime");
    private final static QName _OpportunityTypeLeadRejectDateTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LeadRejectDateTime");
    private final static QName _OpportunityTypeQuotes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Quotes");
    private final static QName _OpportunityTypeReturnValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ReturnValue");
    private final static QName _OpportunityTypeClosedValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ClosedValue");
    private final static QName _OpportunityTypeName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Name");
    private final static QName _OpportunityTypePrimaryContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PrimaryContact");
    private final static QName _OpportunityTypeSurvey_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Survey");
    private final static QName _OpportunityTypeCostOfSale_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CostOfSale");
    private final static QName _OpportunityTypeSummary_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Summary");
    private final static QName _OpportunityTypeWinLossDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "WinLossDescription");
    private final static QName _OpportunityTypeLeadRejectDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LeadRejectDescription");
    private final static QName _OpportunityTypeRecallTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RecallTime");
    private final static QName _OpportunityTypeForecastCloseDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ForecastCloseDate");
    private final static QName _OpportunityTypeAssignedToAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssignedToAccount");
    private final static QName _OpportunityTypeLeadRejectReason_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LeadRejectReason");
    private final static QName _PurchasedProductTypeFinalizedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FinalizedByAccount");
    private final static QName _PurchasedProductTypePurchaseTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PurchaseTime");
    private final static QName _PurchasedProductTypeLicenseEndTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LicenseEndTime");
    private final static QName _PurchasedProductTypeLicenseStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LicenseStartTime");
    private final static QName _OrganizationTypeAddresses_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Addresses");
    private final static QName _OrganizationTypeIndustry_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Industry");
    private final static QName _OrganizationTypeNameFurigana_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NameFurigana");
    private final static QName _OrganizationTypeNumberOfEmployees_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NumberOfEmployees");
    private final static QName _VariableTypeInterfaceValues_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "InterfaceValues");
    private final static QName _VariableTypeFolder_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Folder");
    private final static QName _AddressTypeStateOrProvince_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StateOrProvince");
    private final static QName _AddressTypeCity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "City");
    private final static QName _AddressTypePostalCode_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PostalCode");
    private final static QName _AddressTypeStreet_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Street");
    private final static QName _StandardContentTypeContentValues_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ContentValues");
    private final static QName _StandardContentTypeHotKey_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "HotKey");
    private final static QName _SSOTokenReferenceAttributesTypeRevoked_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Revoked");
    private final static QName _SSOTokenReferenceAttributesTypeUsed_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Used");
    private final static QName _EmailTypeCertificate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Certificate");
    private final static QName _AnswerTypeExpiresDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExpiresDate");
    private final static QName _AnswerTypeAssignedSibling_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AssignedSibling");
    private final static QName _AnswerTypeGuidedAssistance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "GuidedAssistance");
    private final static QName _AnswerTypeCommonAttachments_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CommonAttachments");
    private final static QName _AnswerTypePublishOnDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PublishOnDate");
    private final static QName _AnswerTypeQuestion_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Question");
    private final static QName _AnswerTypeNextNotificationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "NextNotificationTime");
    private final static QName _AnswerTypeSolution_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Solution");
    private final static QName _AnswerTypeKeywords_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Keywords");
    private final static QName _AnswerTypeOriginalReferenceNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OriginalReferenceNumber");
    private final static QName _AnswerTypeProducts_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Products");
    private final static QName _AnswerTypeRelatedAnswers_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "RelatedAnswers");
    private final static QName _AnswerTypeLastNotificationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LastNotificationTime");
    private final static QName _AnswerTypeCategories_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Categories");
    private final static QName _AnswerTypeSiblingAnswers_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SiblingAnswers");
    private final static QName _AnswerTypeAdminLastAccessTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AdminLastAccessTime");
    private final static QName _AnswerTypeAccessLevels_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "AccessLevels");
    private final static QName _AnswerTypeURL_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "URL");
    private final static QName _AnswerTypeLastAccessTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LastAccessTime");
    private final static QName _AnswerNotificationTypeStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "StartTime");
    private final static QName _AccountTypeSignature_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Signature");
    private final static QName _AccountTypeDisplayName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "DisplayName");
    private final static QName _AccountTypeProfile_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Profile");
    private final static QName _AccountTypeEmailNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "EmailNotification");
    private final static QName _AccountTypeManager_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Manager");
    private final static QName _ServiceProductTypeCategoryLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CategoryLinks");
    private final static QName _ServiceProductTypeDispositionLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "DispositionLinks");
    private final static QName _MailboxTypeType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Type");
    private final static QName _MailboxTypeIsDefault_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IsDefault");
    private final static QName _MailboxTypeIncomingEmailSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IncomingEmailSettings");
    private final static QName _MailboxTypeOutgoingEmailSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OutgoingEmailSettings");
    private final static QName _SalesProductTypeSchedules_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Schedules");
    private final static QName _SalesProductTypePartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PartNumber");
    private final static QName _MailboxIncomingEmailSettingsTypeIsEnabled_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "IsEnabled");
    private final static QName _MailboxIncomingEmailSettingsTypeForceReplyBetweenLines_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ForceReplyBetweenLines");
    private final static QName _MailboxIncomingEmailSettingsTypeForwardRejectMessageAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ForwardRejectMessageAddress");
    private final static QName _StageWithStrategyTypeStage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Stage");
    private final static QName _StageWithStrategyTypeStrategy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Strategy");
    private final static QName _ChannelUsernameTypeUsername_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Username");
    private final static QName _ChannelUsernameTypeUserNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "UserNumber");
    private final static QName _QuoteTypeSentTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SentTime");
    private final static QName _QuoteTypeOfferStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OfferStartTime");
    private final static QName _QuoteTypeTotal_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Total");
    private final static QName _QuoteTypeSentTo_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "SentTo");
    private final static QName _QuoteTypeLineItems_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LineItems");
    private final static QName _QuoteTypePriceSchedule_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PriceSchedule");
    private final static QName _QuoteTypeStatus_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Status");
    private final static QName _QuoteTypeOfferEndTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "OfferEndTime");
    private final static QName _QuoteTypeTemplate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Template");
    private final static QName _CampaignTypeExpectedOpportunities_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExpectedOpportunities");
    private final static QName _CampaignTypeActualSales_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ActualSales");
    private final static QName _CampaignTypeCampaignStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CampaignStartTime");
    private final static QName _CampaignTypeBudget_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Budget");
    private final static QName _CampaignTypeObjectivesSummary_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ObjectivesSummary");
    private final static QName _CampaignTypeExpectedCost_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExpectedCost");
    private final static QName _CampaignTypeActualLeads_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ActualLeads");
    private final static QName _CampaignTypeActualOpportunities_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ActualOpportunities");
    private final static QName _CampaignTypeExpectedSales_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExpectedSales");
    private final static QName _CampaignTypeExpectedLeads_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExpectedLeads");
    private final static QName _CampaignTypeActualCost_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ActualCost");
    private final static QName _CampaignTypeCampaignEndTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CampaignEndTime");
    private final static QName _TaskTypeTaskType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TaskType");
    private final static QName _TaskTypePercentComplete_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PercentComplete");
    private final static QName _TaskTypePlannedCompletionTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "PlannedCompletionTime");
    private final static QName _TaskTypePriority_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Priority");
    private final static QName _TaskTypeCompletedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "CompletedTime");
    private final static QName _TaskTypeDueTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "DueTime");
    private final static QName _MonetaryValueTypeExchangeRate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ExchangeRate");
    private final static QName _OrganizationSalesSettingsTypeTotalRevenue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "TotalRevenue");
    private final static QName _LabelTypeLabelText_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "LabelText");
    private final static QName _MailboxOutgoingEmailSettingsTypeFromAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FromAddress");
    private final static QName _MailboxOutgoingEmailSettingsTypeReplyToAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "ReplyToAddress");
    private final static QName _MailboxOutgoingEmailSettingsTypeFriendlyFromAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "FriendlyFromAddress");
    private final static QName _TaskMarketingSettingsTypeDocument_QNAME = new QName("urn:objects.ws.rightnow.com/v1_3", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.datago.model.rightnow.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link InterfaceValueType }
     * 
     */
    public InterfaceValueType createInterfaceValueType() {
        return new InterfaceValueType();
    }

    /**
     * Create an instance of {@link TypedAddressType }
     * 
     */
    public TypedAddressType createTypedAddressType() {
        return new TypedAddressType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ConfigurationType }
     * 
     */
    public ConfigurationType createConfigurationType() {
        return new ConfigurationType();
    }

    /**
     * Create an instance of {@link GroupAccountType }
     * 
     */
    public GroupAccountType createGroupAccountType() {
        return new GroupAccountType();
    }

    /**
     * Create an instance of {@link AnalyticsReportType }
     * 
     */
    public AnalyticsReportType createAnalyticsReportType() {
        return new AnalyticsReportType();
    }

    /**
     * Create an instance of {@link PersonFullNameType }
     * 
     */
    public PersonFullNameType createPersonFullNameType() {
        return new PersonFullNameType();
    }

    /**
     * Create an instance of {@link TaskSalesSettingsType }
     * 
     */
    public TaskSalesSettingsType createTaskSalesSettingsType() {
        return new TaskSalesSettingsType();
    }

    /**
     * Create an instance of {@link AccessLevelTypeType }
     * 
     */
    public AccessLevelTypeType createAccessLevelTypeType() {
        return new AccessLevelTypeType();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswerType }
     * 
     */
    public FileAttachmentAnswerType createFileAttachmentAnswerType() {
        return new FileAttachmentAnswerType();
    }

    /**
     * Create an instance of {@link MessageBaseType }
     * 
     */
    public MessageBaseType createMessageBaseType() {
        return new MessageBaseType();
    }

    /**
     * Create an instance of {@link StandardContentContentValueListType }
     * 
     */
    public StandardContentContentValueListType createStandardContentContentValueListType() {
        return new StandardContentContentValueListType();
    }

    /**
     * Create an instance of {@link ServiceMailboxType }
     * 
     */
    public ServiceMailboxType createServiceMailboxType() {
        return new ServiceMailboxType();
    }

    /**
     * Create an instance of {@link QuoteListType }
     * 
     */
    public QuoteListType createQuoteListType() {
        return new QuoteListType();
    }

    /**
     * Create an instance of {@link PhoneListType }
     * 
     */
    public PhoneListType createPhoneListType() {
        return new PhoneListType();
    }

    /**
     * Create an instance of {@link AssetType }
     * 
     */
    public AssetType createAssetType() {
        return new AssetType();
    }

    /**
     * Create an instance of {@link StatusWithTypeType }
     * 
     */
    public StatusWithTypeType createStatusWithTypeType() {
        return new StatusWithTypeType();
    }

    /**
     * Create an instance of {@link AnalyticsReportFilterType }
     * 
     */
    public AnalyticsReportFilterType createAnalyticsReportFilterType() {
        return new AnalyticsReportFilterType();
    }

    /**
     * Create an instance of {@link ServiceDispositionListType }
     * 
     */
    public ServiceDispositionListType createServiceDispositionListType() {
        return new ServiceDispositionListType();
    }

    /**
     * Create an instance of {@link SSOTokenReferenceType }
     * 
     */
    public SSOTokenReferenceType createSSOTokenReferenceType() {
        return new SSOTokenReferenceType();
    }

    /**
     * Create an instance of {@link OrganizationServiceSettingsType }
     * 
     */
    public OrganizationServiceSettingsType createOrganizationServiceSettingsType() {
        return new OrganizationServiceSettingsType();
    }

    /**
     * Create an instance of {@link InterfaceValueListType }
     * 
     */
    public InterfaceValueListType createInterfaceValueListType() {
        return new InterfaceValueListType();
    }

    /**
     * Create an instance of {@link IncidentContactListType }
     * 
     */
    public IncidentContactListType createIncidentContactListType() {
        return new IncidentContactListType();
    }

    /**
     * Create an instance of {@link AssetStatusesType }
     * 
     */
    public AssetStatusesType createAssetStatusesType() {
        return new AssetStatusesType();
    }

    /**
     * Create an instance of {@link IncidentMilestoneInstanceType }
     * 
     */
    public IncidentMilestoneInstanceType createIncidentMilestoneInstanceType() {
        return new IncidentMilestoneInstanceType();
    }

    /**
     * Create an instance of {@link AnswerRelatedAnswerType }
     * 
     */
    public AnswerRelatedAnswerType createAnswerRelatedAnswerType() {
        return new AnswerRelatedAnswerType();
    }

    /**
     * Create an instance of {@link IncidentMilestoneInstanceListType }
     * 
     */
    public IncidentMilestoneInstanceListType createIncidentMilestoneInstanceListType() {
        return new IncidentMilestoneInstanceListType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link SharedFileAttachmentAnswerType }
     * 
     */
    public SharedFileAttachmentAnswerType createSharedFileAttachmentAnswerType() {
        return new SharedFileAttachmentAnswerType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link SharedFileAttachmentSharedType }
     * 
     */
    public SharedFileAttachmentSharedType createSharedFileAttachmentSharedType() {
        return new SharedFileAttachmentSharedType();
    }

    /**
     * Create an instance of {@link InheritOptionsType }
     * 
     */
    public InheritOptionsType createInheritOptionsType() {
        return new InheritOptionsType();
    }

    /**
     * Create an instance of {@link QuoteLineItemListType }
     * 
     */
    public QuoteLineItemListType createQuoteLineItemListType() {
        return new QuoteLineItemListType();
    }

    /**
     * Create an instance of {@link FileAttachmentCommonListType }
     * 
     */
    public FileAttachmentCommonListType createFileAttachmentCommonListType() {
        return new FileAttachmentCommonListType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link ServiceCategoryType }
     * 
     */
    public ServiceCategoryType createServiceCategoryType() {
        return new ServiceCategoryType();
    }

    /**
     * Create an instance of {@link AnswerNotificationType }
     * 
     */
    public AnswerNotificationType createAnswerNotificationType() {
        return new AnswerNotificationType();
    }

    /**
     * Create an instance of {@link ContactServiceSettingsType }
     * 
     */
    public ContactServiceSettingsType createContactServiceSettingsType() {
        return new ContactServiceSettingsType();
    }

    /**
     * Create an instance of {@link AccountOptionsType }
     * 
     */
    public AccountOptionsType createAccountOptionsType() {
        return new AccountOptionsType();
    }

    /**
     * Create an instance of {@link AnalyticsReportSearchFilterType }
     * 
     */
    public AnalyticsReportSearchFilterType createAnalyticsReportSearchFilterType() {
        return new AnalyticsReportSearchFilterType();
    }

    /**
     * Create an instance of {@link TimeBilledType }
     * 
     */
    public TimeBilledType createTimeBilledType() {
        return new TimeBilledType();
    }

    /**
     * Create an instance of {@link SalesProductType }
     * 
     */
    public SalesProductType createSalesProductType() {
        return new SalesProductType();
    }

    /**
     * Create an instance of {@link AnswerRelatedAnswerListType }
     * 
     */
    public AnswerRelatedAnswerListType createAnswerRelatedAnswerListType() {
        return new AnswerRelatedAnswerListType();
    }

    /**
     * Create an instance of {@link FileAttachmentCommonType }
     * 
     */
    public FileAttachmentCommonType createFileAttachmentCommonType() {
        return new FileAttachmentCommonType();
    }

    /**
     * Create an instance of {@link FileAttachmentIncidentType }
     * 
     */
    public FileAttachmentIncidentType createFileAttachmentIncidentType() {
        return new FileAttachmentIncidentType();
    }

    /**
     * Create an instance of {@link MailboxType }
     * 
     */
    public MailboxType createMailboxType() {
        return new MailboxType();
    }

    /**
     * Create an instance of {@link CategoryNotificationListType }
     * 
     */
    public CategoryNotificationListType createCategoryNotificationListType() {
        return new CategoryNotificationListType();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswerListType }
     * 
     */
    public FileAttachmentAnswerListType createFileAttachmentAnswerListType() {
        return new FileAttachmentAnswerListType();
    }

    /**
     * Create an instance of {@link AccessControlPermissionType }
     * 
     */
    public AccessControlPermissionType createAccessControlPermissionType() {
        return new AccessControlPermissionType();
    }

    /**
     * Create an instance of {@link AssetSLAInstanceType }
     * 
     */
    public AssetSLAInstanceType createAssetSLAInstanceType() {
        return new AssetSLAInstanceType();
    }

    /**
     * Create an instance of {@link BannerType }
     * 
     */
    public BannerType createBannerType() {
        return new BannerType();
    }

    /**
     * Create an instance of {@link QuoteLineItemType }
     * 
     */
    public QuoteLineItemType createQuoteLineItemType() {
        return new QuoteLineItemType();
    }

    /**
     * Create an instance of {@link SSOTokenReferenceAttributesType }
     * 
     */
    public SSOTokenReferenceAttributesType createSSOTokenReferenceAttributesType() {
        return new SSOTokenReferenceAttributesType();
    }

    /**
     * Create an instance of {@link MonetaryValueType }
     * 
     */
    public MonetaryValueType createMonetaryValueType() {
        return new MonetaryValueType();
    }

    /**
     * Create an instance of {@link StandardContentContentValueType }
     * 
     */
    public StandardContentContentValueType createStandardContentContentValueType() {
        return new StandardContentContentValueType();
    }

    /**
     * Create an instance of {@link AccessControlRoleSetType }
     * 
     */
    public AccessControlRoleSetType createAccessControlRoleSetType() {
        return new AccessControlRoleSetType();
    }

    /**
     * Create an instance of {@link ThreadType }
     * 
     */
    public ThreadType createThreadType() {
        return new ThreadType();
    }

    /**
     * Create an instance of {@link MailboxOutgoingEmailSettingsType }
     * 
     */
    public MailboxOutgoingEmailSettingsType createMailboxOutgoingEmailSettingsType() {
        return new MailboxOutgoingEmailSettingsType();
    }

    /**
     * Create an instance of {@link HolidayType }
     * 
     */
    public HolidayType createHolidayType() {
        return new HolidayType();
    }

    /**
     * Create an instance of {@link TaskServiceSettingsType }
     * 
     */
    public TaskServiceSettingsType createTaskServiceSettingsType() {
        return new TaskServiceSettingsType();
    }

    /**
     * Create an instance of {@link IncidentResponseType }
     * 
     */
    public IncidentResponseType createIncidentResponseType() {
        return new IncidentResponseType();
    }

    /**
     * Create an instance of {@link TaskMarketingSettingsType }
     * 
     */
    public TaskMarketingSettingsType createTaskMarketingSettingsType() {
        return new TaskMarketingSettingsType();
    }

    /**
     * Create an instance of {@link ChannelUsernameType }
     * 
     */
    public ChannelUsernameType createChannelUsernameType() {
        return new ChannelUsernameType();
    }

    /**
     * Create an instance of {@link AssetSLAInstanceListType }
     * 
     */
    public AssetSLAInstanceListType createAssetSLAInstanceListType() {
        return new AssetSLAInstanceListType();
    }

    /**
     * Create an instance of {@link ChannelTypeType }
     * 
     */
    public ChannelTypeType createChannelTypeType() {
        return new ChannelTypeType();
    }

    /**
     * Create an instance of {@link ContactMarketingSettingsType }
     * 
     */
    public ContactMarketingSettingsType createContactMarketingSettingsType() {
        return new ContactMarketingSettingsType();
    }

    /**
     * Create an instance of {@link FileAttachmentSharedListType }
     * 
     */
    public FileAttachmentSharedListType createFileAttachmentSharedListType() {
        return new FileAttachmentSharedListType();
    }

    /**
     * Create an instance of {@link AnalyticsReportFilterAttributesType }
     * 
     */
    public AnalyticsReportFilterAttributesType createAnalyticsReportFilterAttributesType() {
        return new AnalyticsReportFilterAttributesType();
    }

    /**
     * Create an instance of {@link SalesTerritoryType }
     * 
     */
    public SalesTerritoryType createSalesTerritoryType() {
        return new SalesTerritoryType();
    }

    /**
     * Create an instance of {@link TaskType }
     * 
     */
    public TaskType createTaskType() {
        return new TaskType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link SharedFileAttachmentCommonType }
     * 
     */
    public SharedFileAttachmentCommonType createSharedFileAttachmentCommonType() {
        return new SharedFileAttachmentCommonType();
    }

    /**
     * Create an instance of {@link FileAttachmentType }
     * 
     */
    public FileAttachmentType createFileAttachmentType() {
        return new FileAttachmentType();
    }

    /**
     * Create an instance of {@link LabelType }
     * 
     */
    public LabelType createLabelType() {
        return new LabelType();
    }

    /**
     * Create an instance of {@link ContactOpenIDAccountListType }
     * 
     */
    public ContactOpenIDAccountListType createContactOpenIDAccountListType() {
        return new ContactOpenIDAccountListType();
    }

    /**
     * Create an instance of {@link OpportunityContactType }
     * 
     */
    public OpportunityContactType createOpportunityContactType() {
        return new OpportunityContactType();
    }

    /**
     * Create an instance of {@link LabelRequiredType }
     * 
     */
    public LabelRequiredType createLabelRequiredType() {
        return new LabelRequiredType();
    }

    /**
     * Create an instance of {@link IncidentContactDeltaType }
     * 
     */
    public IncidentContactDeltaType createIncidentContactDeltaType() {
        return new IncidentContactDeltaType();
    }

    /**
     * Create an instance of {@link AnalyticsReportColumnType }
     * 
     */
    public AnalyticsReportColumnType createAnalyticsReportColumnType() {
        return new AnalyticsReportColumnType();
    }

    /**
     * Create an instance of {@link SharedFileAttachmentIncidentType }
     * 
     */
    public SharedFileAttachmentIncidentType createSharedFileAttachmentIncidentType() {
        return new SharedFileAttachmentIncidentType();
    }

    /**
     * Create an instance of {@link AccountSalesSettingsType }
     * 
     */
    public AccountSalesSettingsType createAccountSalesSettingsType() {
        return new AccountSalesSettingsType();
    }

    /**
     * Create an instance of {@link ServiceCategoryListType }
     * 
     */
    public ServiceCategoryListType createServiceCategoryListType() {
        return new ServiceCategoryListType();
    }

    /**
     * Create an instance of {@link ProvinceListType }
     * 
     */
    public ProvinceListType createProvinceListType() {
        return new ProvinceListType();
    }

    /**
     * Create an instance of {@link SalesProductOptionsType }
     * 
     */
    public SalesProductOptionsType createSalesProductOptionsType() {
        return new SalesProductOptionsType();
    }

    /**
     * Create an instance of {@link LabelListType }
     * 
     */
    public LabelListType createLabelListType() {
        return new LabelListType();
    }

    /**
     * Create an instance of {@link CRMModulesType }
     * 
     */
    public CRMModulesType createCRMModulesType() {
        return new CRMModulesType();
    }

    /**
     * Create an instance of {@link ProvinceType }
     * 
     */
    public ProvinceType createProvinceType() {
        return new ProvinceType();
    }

    /**
     * Create an instance of {@link StageWithStrategyType }
     * 
     */
    public StageWithStrategyType createStageWithStrategyType() {
        return new StageWithStrategyType();
    }

    /**
     * Create an instance of {@link AnswerNotificationListType }
     * 
     */
    public AnswerNotificationListType createAnswerNotificationListType() {
        return new AnswerNotificationListType();
    }

    /**
     * Create an instance of {@link ServiceDispositionDeltaType }
     * 
     */
    public ServiceDispositionDeltaType createServiceDispositionDeltaType() {
        return new ServiceDispositionDeltaType();
    }

    /**
     * Create an instance of {@link CampaignType }
     * 
     */
    public CampaignType createCampaignType() {
        return new CampaignType();
    }

    /**
     * Create an instance of {@link ServiceDispositionType }
     * 
     */
    public ServiceDispositionType createServiceDispositionType() {
        return new ServiceDispositionType();
    }

    /**
     * Create an instance of {@link ServiceCategoryDeltaType }
     * 
     */
    public ServiceCategoryDeltaType createServiceCategoryDeltaType() {
        return new ServiceCategoryDeltaType();
    }

    /**
     * Create an instance of {@link FileAttachmentListType }
     * 
     */
    public FileAttachmentListType createFileAttachmentListType() {
        return new FileAttachmentListType();
    }

    /**
     * Create an instance of {@link ContactOpenIDAccountType }
     * 
     */
    public ContactOpenIDAccountType createContactOpenIDAccountType() {
        return new ContactOpenIDAccountType();
    }

    /**
     * Create an instance of {@link ProductNotificationListType }
     * 
     */
    public ProductNotificationListType createProductNotificationListType() {
        return new ProductNotificationListType();
    }

    /**
     * Create an instance of {@link FileAttachmentIncidentListType }
     * 
     */
    public FileAttachmentIncidentListType createFileAttachmentIncidentListType() {
        return new FileAttachmentIncidentListType();
    }

    /**
     * Create an instance of {@link VariableType }
     * 
     */
    public VariableType createVariableType() {
        return new VariableType();
    }

    /**
     * Create an instance of {@link NoteListType }
     * 
     */
    public NoteListType createNoteListType() {
        return new NoteListType();
    }

    /**
     * Create an instance of {@link ThreadListType }
     * 
     */
    public ThreadListType createThreadListType() {
        return new ThreadListType();
    }

    /**
     * Create an instance of {@link ChannelUsernameListType }
     * 
     */
    public ChannelUsernameListType createChannelUsernameListType() {
        return new ChannelUsernameListType();
    }

    /**
     * Create an instance of {@link ServiceProductListType }
     * 
     */
    public ServiceProductListType createServiceProductListType() {
        return new ServiceProductListType();
    }

    /**
     * Create an instance of {@link MailMessageOptionsType }
     * 
     */
    public MailMessageOptionsType createMailMessageOptionsType() {
        return new MailMessageOptionsType();
    }

    /**
     * Create an instance of {@link OpportunityContactListType }
     * 
     */
    public OpportunityContactListType createOpportunityContactListType() {
        return new OpportunityContactListType();
    }

    /**
     * Create an instance of {@link SiteInterfaceType }
     * 
     */
    public SiteInterfaceType createSiteInterfaceType() {
        return new SiteInterfaceType();
    }

    /**
     * Create an instance of {@link ServiceProductType }
     * 
     */
    public ServiceProductType createServiceProductType() {
        return new ServiceProductType();
    }

    /**
     * Create an instance of {@link SalesProductScheduleListType }
     * 
     */
    public SalesProductScheduleListType createSalesProductScheduleListType() {
        return new SalesProductScheduleListType();
    }

    /**
     * Create an instance of {@link AssetStatusType }
     * 
     */
    public AssetStatusType createAssetStatusType() {
        return new AssetStatusType();
    }

    /**
     * Create an instance of {@link StringFileAttachmentType }
     * 
     */
    public StringFileAttachmentType createStringFileAttachmentType() {
        return new StringFileAttachmentType();
    }

    /**
     * Create an instance of {@link SalesProductScheduleType }
     * 
     */
    public SalesProductScheduleType createSalesProductScheduleType() {
        return new SalesProductScheduleType();
    }

    /**
     * Create an instance of {@link AssignedSLAInstanceType }
     * 
     */
    public AssignedSLAInstanceType createAssignedSLAInstanceType() {
        return new AssignedSLAInstanceType();
    }

    /**
     * Create an instance of {@link ProductNotificationType }
     * 
     */
    public ProductNotificationType createProductNotificationType() {
        return new ProductNotificationType();
    }

    /**
     * Create an instance of {@link EventSubscriptionType }
     * 
     */
    public EventSubscriptionType createEventSubscriptionType() {
        return new EventSubscriptionType();
    }

    /**
     * Create an instance of {@link PurchasedProductType }
     * 
     */
    public PurchasedProductType createPurchasedProductType() {
        return new PurchasedProductType();
    }

    /**
     * Create an instance of {@link ChannelTypeOptionsType }
     * 
     */
    public ChannelTypeOptionsType createChannelTypeOptionsType() {
        return new ChannelTypeOptionsType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link OpportunityType }
     * 
     */
    public OpportunityType createOpportunityType() {
        return new OpportunityType();
    }

    /**
     * Create an instance of {@link OrganizationSalesSettingsType }
     * 
     */
    public OrganizationSalesSettingsType createOrganizationSalesSettingsType() {
        return new OrganizationSalesSettingsType();
    }

    /**
     * Create an instance of {@link MailMessageRecipientsType }
     * 
     */
    public MailMessageRecipientsType createMailMessageRecipientsType() {
        return new MailMessageRecipientsType();
    }

    /**
     * Create an instance of {@link IncidentContactType }
     * 
     */
    public IncidentContactType createIncidentContactType() {
        return new IncidentContactType();
    }

    /**
     * Create an instance of {@link OpportunityContactDeltaType }
     * 
     */
    public OpportunityContactDeltaType createOpportunityContactDeltaType() {
        return new OpportunityContactDeltaType();
    }

    /**
     * Create an instance of {@link ServiceProductDeltaType }
     * 
     */
    public ServiceProductDeltaType createServiceProductDeltaType() {
        return new ServiceProductDeltaType();
    }

    /**
     * Create an instance of {@link MessageContentTypeType }
     * 
     */
    public MessageContentTypeType createMessageContentTypeType() {
        return new MessageContentTypeType();
    }

    /**
     * Create an instance of {@link MailMessageType }
     * 
     */
    public MailMessageType createMailMessageType() {
        return new MailMessageType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link MenuAssignableAccountType }
     * 
     */
    public MenuAssignableAccountType createMenuAssignableAccountType() {
        return new MenuAssignableAccountType();
    }

    /**
     * Create an instance of {@link AccountServiceSettingsType }
     * 
     */
    public AccountServiceSettingsType createAccountServiceSettingsType() {
        return new AccountServiceSettingsType();
    }

    /**
     * Create an instance of {@link EmailListType }
     * 
     */
    public EmailListType createEmailListType() {
        return new EmailListType();
    }

    /**
     * Create an instance of {@link AccessControlAbilityType }
     * 
     */
    public AccessControlAbilityType createAccessControlAbilityType() {
        return new AccessControlAbilityType();
    }

    /**
     * Create an instance of {@link MarketingMailboxType }
     * 
     */
    public MarketingMailboxType createMarketingMailboxType() {
        return new MarketingMailboxType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link FileAttachmentSharedType }
     * 
     */
    public FileAttachmentSharedType createFileAttachmentSharedType() {
        return new FileAttachmentSharedType();
    }

    /**
     * Create an instance of {@link QuoteType }
     * 
     */
    public QuoteType createQuoteType() {
        return new QuoteType();
    }

    /**
     * Create an instance of {@link TimeBilledListType }
     * 
     */
    public TimeBilledListType createTimeBilledListType() {
        return new TimeBilledListType();
    }

    /**
     * Create an instance of {@link AnswerType }
     * 
     */
    public AnswerType createAnswerType() {
        return new AnswerType();
    }

    /**
     * Create an instance of {@link ContactSalesSettingsType }
     * 
     */
    public ContactSalesSettingsType createContactSalesSettingsType() {
        return new ContactSalesSettingsType();
    }

    /**
     * Create an instance of {@link SLAInstanceListType }
     * 
     */
    public SLAInstanceListType createSLAInstanceListType() {
        return new SLAInstanceListType();
    }

    /**
     * Create an instance of {@link OpportunityStatusType }
     * 
     */
    public OpportunityStatusType createOpportunityStatusType() {
        return new OpportunityStatusType();
    }

    /**
     * Create an instance of {@link MailboxIncomingEmailSettingsType }
     * 
     */
    public MailboxIncomingEmailSettingsType createMailboxIncomingEmailSettingsType() {
        return new MailboxIncomingEmailSettingsType();
    }

    /**
     * Create an instance of {@link StandardContentUsageType }
     * 
     */
    public StandardContentUsageType createStandardContentUsageType() {
        return new StandardContentUsageType();
    }

    /**
     * Create an instance of {@link TypedAddressListType }
     * 
     */
    public TypedAddressListType createTypedAddressListType() {
        return new TypedAddressListType();
    }

    /**
     * Create an instance of {@link MailMessageStatusType }
     * 
     */
    public MailMessageStatusType createMailMessageStatusType() {
        return new MailMessageStatusType();
    }

    /**
     * Create an instance of {@link SLAInstanceType }
     * 
     */
    public SLAInstanceType createSLAInstanceType() {
        return new SLAInstanceType();
    }

    /**
     * Create an instance of {@link StandardContentType }
     * 
     */
    public StandardContentType createStandardContentType() {
        return new StandardContentType();
    }

    /**
     * Create an instance of {@link IncidentType }
     * 
     */
    public IncidentType createIncidentType() {
        return new IncidentType();
    }

    /**
     * Create an instance of {@link MailMessageBodyType }
     * 
     */
    public MailMessageBodyType createMailMessageBodyType() {
        return new MailMessageBodyType();
    }

    /**
     * Create an instance of {@link StandardContentAttributesType }
     * 
     */
    public StandardContentAttributesType createStandardContentAttributesType() {
        return new StandardContentAttributesType();
    }

    /**
     * Create an instance of {@link CategoryNotificationType }
     * 
     */
    public CategoryNotificationType createCategoryNotificationType() {
        return new CategoryNotificationType();
    }

    /**
     * Create an instance of {@link LabelRequiredListType }
     * 
     */
    public LabelRequiredListType createLabelRequiredListType() {
        return new LabelRequiredListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedSLAInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssignedSLAInstance")
    public JAXBElement<AssignedSLAInstanceType> createAssignedSLAInstance(AssignedSLAInstanceType value) {
        return new JAXBElement<AssignedSLAInstanceType>(_AssignedSLAInstance_QNAME, AssignedSLAInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Phone")
    public JAXBElement<PhoneType> createPhone(PhoneType value) {
        return new JAXBElement<PhoneType>(_Phone_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventSubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EventSubscription")
    public JAXBElement<EventSubscriptionType> createEventSubscription(EventSubscriptionType value) {
        return new JAXBElement<EventSubscriptionType>(_EventSubscription_QNAME, EventSubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchasedProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PurchasedProduct")
    public JAXBElement<PurchasedProductType> createPurchasedProduct(PurchasedProductType value) {
        return new JAXBElement<PurchasedProductType>(_PurchasedProduct_QNAME, PurchasedProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentContact")
    public JAXBElement<IncidentContactType> createIncidentContact(IncidentContactType value) {
        return new JAXBElement<IncidentContactType>(_IncidentContact_QNAME, IncidentContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactDeltaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OpportunityContactDelta")
    public JAXBElement<OpportunityContactDeltaType> createOpportunityContactDelta(OpportunityContactDeltaType value) {
        return new JAXBElement<OpportunityContactDeltaType>(_OpportunityContactDelta_QNAME, OpportunityContactDeltaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OrganizationSalesSettings")
    public JAXBElement<OrganizationSalesSettingsType> createOrganizationSalesSettings(OrganizationSalesSettingsType value) {
        return new JAXBElement<OrganizationSalesSettingsType>(_OrganizationSalesSettings_QNAME, OrganizationSalesSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductDeltaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceProductDelta")
    public JAXBElement<ServiceProductDeltaType> createServiceProductDelta(ServiceProductDeltaType value) {
        return new JAXBElement<ServiceProductDeltaType>(_ServiceProductDelta_QNAME, ServiceProductDeltaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Variable")
    public JAXBElement<VariableType> createVariable(VariableType value) {
        return new JAXBElement<VariableType>(_Variable_QNAME, VariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncidentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentIncidentList")
    public JAXBElement<FileAttachmentIncidentListType> createFileAttachmentIncidentList(FileAttachmentIncidentListType value) {
        return new JAXBElement<FileAttachmentIncidentListType>(_FileAttachmentIncidentList_QNAME, FileAttachmentIncidentListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NoteList")
    public JAXBElement<NoteListType> createNoteList(NoteListType value) {
        return new JAXBElement<NoteListType>(_NoteList_QNAME, NoteListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ThreadList")
    public JAXBElement<ThreadListType> createThreadList(ThreadListType value) {
        return new JAXBElement<ThreadListType>(_ThreadList_QNAME, ThreadListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OpportunityContactList")
    public JAXBElement<OpportunityContactListType> createOpportunityContactList(OpportunityContactListType value) {
        return new JAXBElement<OpportunityContactListType>(_OpportunityContactList_QNAME, OpportunityContactListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SiteInterface")
    public JAXBElement<SiteInterfaceType> createSiteInterface(SiteInterfaceType value) {
        return new JAXBElement<SiteInterfaceType>(_SiteInterface_QNAME, SiteInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesProductSchedule")
    public JAXBElement<SalesProductScheduleType> createSalesProductSchedule(SalesProductScheduleType value) {
        return new JAXBElement<SalesProductScheduleType>(_SalesProductSchedule_QNAME, SalesProductScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactSalesSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactSalesSettings")
    public JAXBElement<ContactSalesSettingsType> createContactSalesSettings(ContactSalesSettingsType value) {
        return new JAXBElement<ContactSalesSettingsType>(_ContactSalesSettings_QNAME, ContactSalesSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TimeBilledList")
    public JAXBElement<TimeBilledListType> createTimeBilledList(TimeBilledListType value) {
        return new JAXBElement<TimeBilledListType>(_TimeBilledList_QNAME, TimeBilledListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TypedAddressList")
    public JAXBElement<TypedAddressListType> createTypedAddressList(TypedAddressListType value) {
        return new JAXBElement<TypedAddressListType>(_TypedAddressList_QNAME, TypedAddressListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OpportunityStatus")
    public JAXBElement<OpportunityStatusType> createOpportunityStatus(OpportunityStatusType value) {
        return new JAXBElement<OpportunityStatusType>(_OpportunityStatus_QNAME, OpportunityStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Incident")
    public JAXBElement<IncidentType> createIncident(IncidentType value) {
        return new JAXBElement<IncidentType>(_Incident_QNAME, IncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstance")
    public JAXBElement<SLAInstanceType> createSLAInstance(SLAInstanceType value) {
        return new JAXBElement<SLAInstanceType>(_SLAInstance_QNAME, SLAInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailMessageBody")
    public JAXBElement<MailMessageBodyType> createMailMessageBody(MailMessageBodyType value) {
        return new JAXBElement<MailMessageBodyType>(_MailMessageBody_QNAME, MailMessageBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailMessage")
    public JAXBElement<MailMessageType> createMailMessage(MailMessageType value) {
        return new JAXBElement<MailMessageType>(_MailMessage_QNAME, MailMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EmailList")
    public JAXBElement<EmailListType> createEmailList(EmailListType value) {
        return new JAXBElement<EmailListType>(_EmailList_QNAME, EmailListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentShared")
    public JAXBElement<FileAttachmentSharedType> createFileAttachmentShared(FileAttachmentSharedType value) {
        return new JAXBElement<FileAttachmentSharedType>(_FileAttachmentShared_QNAME, FileAttachmentSharedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactDeltaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentContactDelta")
    public JAXBElement<IncidentContactDeltaType> createIncidentContactDelta(IncidentContactDeltaType value) {
        return new JAXBElement<IncidentContactDeltaType>(_IncidentContactDelta_QNAME, IncidentContactDeltaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequiredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LabelRequired")
    public JAXBElement<LabelRequiredType> createLabelRequired(LabelRequiredType value) {
        return new JAXBElement<LabelRequiredType>(_LabelRequired_QNAME, LabelRequiredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSalesSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccountSalesSettings")
    public JAXBElement<AccountSalesSettingsType> createAccountSalesSettings(AccountSalesSettingsType value) {
        return new JAXBElement<AccountSalesSettingsType>(_AccountSalesSettings_QNAME, AccountSalesSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Task")
    public JAXBElement<TaskType> createTask(TaskType value) {
        return new JAXBElement<TaskType>(_Task_QNAME, TaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OpportunityContact")
    public JAXBElement<OpportunityContactType> createOpportunityContact(OpportunityContactType value) {
        return new JAXBElement<OpportunityContactType>(_OpportunityContact_QNAME, OpportunityContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceDisposition")
    public JAXBElement<ServiceDispositionType> createServiceDisposition(ServiceDispositionType value) {
        return new JAXBElement<ServiceDispositionType>(_ServiceDisposition_QNAME, ServiceDispositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StageWithStrategyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StageWithStrategy")
    public JAXBElement<StageWithStrategyType> createStageWithStrategy(StageWithStrategyType value) {
        return new JAXBElement<StageWithStrategyType>(_StageWithStrategy_QNAME, StageWithStrategyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactOpenIDAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactOpenIDAccount")
    public JAXBElement<ContactOpenIDAccountType> createContactOpenIDAccount(ContactOpenIDAccountType value) {
        return new JAXBElement<ContactOpenIDAccountType>(_ContactOpenIDAccount_QNAME, ContactOpenIDAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentList")
    public JAXBElement<FileAttachmentListType> createFileAttachmentList(FileAttachmentListType value) {
        return new JAXBElement<FileAttachmentListType>(_FileAttachmentList_QNAME, FileAttachmentListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProductNotificationList")
    public JAXBElement<ProductNotificationListType> createProductNotificationList(ProductNotificationListType value) {
        return new JAXBElement<ProductNotificationListType>(_ProductNotificationList_QNAME, ProductNotificationListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesProductOptions")
    public JAXBElement<SalesProductOptionsType> createSalesProductOptions(SalesProductOptionsType value) {
        return new JAXBElement<SalesProductOptionsType>(_SalesProductOptions_QNAME, SalesProductOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProvinceList")
    public JAXBElement<ProvinceListType> createProvinceList(ProvinceListType value) {
        return new JAXBElement<ProvinceListType>(_ProvinceList_QNAME, ProvinceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMModulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CRMModules")
    public JAXBElement<CRMModulesType> createCRMModules(CRMModulesType value) {
        return new JAXBElement<CRMModulesType>(_CRMModules_QNAME, CRMModulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Province")
    public JAXBElement<ProvinceType> createProvince(ProvinceType value) {
        return new JAXBElement<ProvinceType>(_Province_QNAME, ProvinceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentIncident")
    public JAXBElement<FileAttachmentIncidentType> createFileAttachmentIncident(FileAttachmentIncidentType value) {
        return new JAXBElement<FileAttachmentIncidentType>(_FileAttachmentIncident_QNAME, FileAttachmentIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CategoryNotificationList")
    public JAXBElement<CategoryNotificationListType> createCategoryNotificationList(CategoryNotificationListType value) {
        return new JAXBElement<CategoryNotificationListType>(_CategoryNotificationList_QNAME, CategoryNotificationListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccountOptions")
    public JAXBElement<AccountOptionsType> createAccountOptions(AccountOptionsType value) {
        return new JAXBElement<AccountOptionsType>(_AccountOptions_QNAME, AccountOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportSearchFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnalyticsReportSearchFilter")
    public JAXBElement<AnalyticsReportSearchFilterType> createAnalyticsReportSearchFilter(AnalyticsReportSearchFilterType value) {
        return new JAXBElement<AnalyticsReportSearchFilterType>(_AnalyticsReportSearchFilter_QNAME, AnalyticsReportSearchFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactServiceSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactServiceSettings")
    public JAXBElement<ContactServiceSettingsType> createContactServiceSettings(ContactServiceSettingsType value) {
        return new JAXBElement<ContactServiceSettingsType>(_ContactServiceSettings_QNAME, ContactServiceSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentCommon")
    public JAXBElement<FileAttachmentCommonType> createFileAttachmentCommon(FileAttachmentCommonType value) {
        return new JAXBElement<FileAttachmentCommonType>(_FileAttachmentCommon_QNAME, FileAttachmentCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnswerRelatedAnswerList")
    public JAXBElement<AnswerRelatedAnswerListType> createAnswerRelatedAnswerList(AnswerRelatedAnswerListType value) {
        return new JAXBElement<AnswerRelatedAnswerListType>(_AnswerRelatedAnswerList_QNAME, AnswerRelatedAnswerListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TaskServiceSettings")
    public JAXBElement<TaskServiceSettingsType> createTaskServiceSettings(TaskServiceSettingsType value) {
        return new JAXBElement<TaskServiceSettingsType>(_TaskServiceSettings_QNAME, TaskServiceSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMarketingSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TaskMarketingSettings")
    public JAXBElement<TaskMarketingSettingsType> createTaskMarketingSettings(TaskMarketingSettingsType value) {
        return new JAXBElement<TaskMarketingSettingsType>(_TaskMarketingSettings_QNAME, TaskMarketingSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMarketingSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactMarketingSettings")
    public JAXBElement<ContactMarketingSettingsType> createContactMarketingSettings(ContactMarketingSettingsType value) {
        return new JAXBElement<ContactMarketingSettingsType>(_ContactMarketingSettings_QNAME, ContactMarketingSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChannelType")
    public JAXBElement<ChannelTypeType> createChannelType(ChannelTypeType value) {
        return new JAXBElement<ChannelTypeType>(_ChannelType_QNAME, ChannelTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Banner")
    public JAXBElement<BannerType> createBanner(BannerType value) {
        return new JAXBElement<BannerType>(_Banner_QNAME, BannerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Thread")
    public JAXBElement<ThreadType> createThread(ThreadType value) {
        return new JAXBElement<ThreadType>(_Thread_QNAME, ThreadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PhoneList")
    public JAXBElement<PhoneListType> createPhoneList(PhoneListType value) {
        return new JAXBElement<PhoneListType>(_PhoneList_QNAME, PhoneListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Asset")
    public JAXBElement<AssetType> createAsset(AssetType value) {
        return new JAXBElement<AssetType>(_Asset_QNAME, AssetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusWithTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StatusWithType")
    public JAXBElement<StatusWithTypeType> createStatusWithType(StatusWithTypeType value) {
        return new JAXBElement<StatusWithTypeType>(_StatusWithType_QNAME, StatusWithTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Account")
    public JAXBElement<AccountType> createAccount(AccountType value) {
        return new JAXBElement<AccountType>(_Account_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnalyticsReport")
    public JAXBElement<AnalyticsReportType> createAnalyticsReport(AnalyticsReportType value) {
        return new JAXBElement<AnalyticsReportType>(_AnalyticsReport_QNAME, AnalyticsReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFullNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PersonFullName")
    public JAXBElement<PersonFullNameType> createPersonFullName(PersonFullNameType value) {
        return new JAXBElement<PersonFullNameType>(_PersonFullName_QNAME, PersonFullNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnswerRelatedAnswer")
    public JAXBElement<AnswerRelatedAnswerType> createAnswerRelatedAnswer(AnswerRelatedAnswerType value) {
        return new JAXBElement<AnswerRelatedAnswerType>(_AnswerRelatedAnswer_QNAME, AnswerRelatedAnswerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentMilestoneInstanceList")
    public JAXBElement<IncidentMilestoneInstanceListType> createIncidentMilestoneInstanceList(IncidentMilestoneInstanceListType value) {
        return new JAXBElement<IncidentMilestoneInstanceListType>(_IncidentMilestoneInstanceList_QNAME, IncidentMilestoneInstanceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InheritOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InheritOptions")
    public JAXBElement<InheritOptionsType> createInheritOptions(InheritOptionsType value) {
        return new JAXBElement<InheritOptionsType>(_InheritOptions_QNAME, InheritOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnalyticsReportFilter")
    public JAXBElement<AnalyticsReportFilterType> createAnalyticsReportFilter(AnalyticsReportFilterType value) {
        return new JAXBElement<AnalyticsReportFilterType>(_AnalyticsReportFilter_QNAME, AnalyticsReportFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OrganizationServiceSettings")
    public JAXBElement<OrganizationServiceSettingsType> createOrganizationServiceSettings(OrganizationServiceSettingsType value) {
        return new JAXBElement<OrganizationServiceSettingsType>(_OrganizationServiceSettings_QNAME, OrganizationServiceSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentContactList")
    public JAXBElement<IncidentContactListType> createIncidentContactList(IncidentContactListType value) {
        return new JAXBElement<IncidentContactListType>(_IncidentContactList_QNAME, IncidentContactListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProductNotification")
    public JAXBElement<ProductNotificationType> createProductNotification(ProductNotificationType value) {
        return new JAXBElement<ProductNotificationType>(_ProductNotification_QNAME, ProductNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Opportunity")
    public JAXBElement<OpportunityType> createOpportunity(OpportunityType value) {
        return new JAXBElement<OpportunityType>(_Opportunity_QNAME, OpportunityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelTypeOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChannelTypeOptions")
    public JAXBElement<ChannelTypeOptionsType> createChannelTypeOptions(ChannelTypeOptionsType value) {
        return new JAXBElement<ChannelTypeOptionsType>(_ChannelTypeOptions_QNAME, ChannelTypeOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageRecipientsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailMessageRecipients")
    public JAXBElement<MailMessageRecipientsType> createMailMessageRecipients(MailMessageRecipientsType value) {
        return new JAXBElement<MailMessageRecipientsType>(_MailMessageRecipients_QNAME, MailMessageRecipientsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceProductList")
    public JAXBElement<ServiceProductListType> createServiceProductList(ServiceProductListType value) {
        return new JAXBElement<ServiceProductListType>(_ServiceProductList_QNAME, ServiceProductListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChannelUsernameList")
    public JAXBElement<ChannelUsernameListType> createChannelUsernameList(ChannelUsernameListType value) {
        return new JAXBElement<ChannelUsernameListType>(_ChannelUsernameList_QNAME, ChannelUsernameListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssetStatus")
    public JAXBElement<AssetStatusType> createAssetStatus(AssetStatusType value) {
        return new JAXBElement<AssetStatusType>(_AssetStatus_QNAME, AssetStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesProductScheduleList")
    public JAXBElement<SalesProductScheduleListType> createSalesProductScheduleList(SalesProductScheduleListType value) {
        return new JAXBElement<SalesProductScheduleListType>(_SalesProductScheduleList_QNAME, SalesProductScheduleListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceProduct")
    public JAXBElement<ServiceProductType> createServiceProduct(ServiceProductType value) {
        return new JAXBElement<ServiceProductType>(_ServiceProduct_QNAME, ServiceProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailMessageOptions")
    public JAXBElement<MailMessageOptionsType> createMailMessageOptions(MailMessageOptionsType value) {
        return new JAXBElement<MailMessageOptionsType>(_MailMessageOptions_QNAME, MailMessageOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringFileAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StringFileAttachment")
    public JAXBElement<StringFileAttachmentType> createStringFileAttachment(StringFileAttachmentType value) {
        return new JAXBElement<StringFileAttachmentType>(_StringFileAttachment_QNAME, StringFileAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Answer")
    public JAXBElement<AnswerType> createAnswer(AnswerType value) {
        return new JAXBElement<AnswerType>(_Answer_QNAME, AnswerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Quote")
    public JAXBElement<QuoteType> createQuote(QuoteType value) {
        return new JAXBElement<QuoteType>(_Quote_QNAME, QuoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailMessageStatus")
    public JAXBElement<MailMessageStatusType> createMailMessageStatus(MailMessageStatusType value) {
        return new JAXBElement<MailMessageStatusType>(_MailMessageStatus_QNAME, MailMessageStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailboxIncomingEmailSettings")
    public JAXBElement<MailboxIncomingEmailSettingsType> createMailboxIncomingEmailSettings(MailboxIncomingEmailSettingsType value) {
        return new JAXBElement<MailboxIncomingEmailSettingsType>(_MailboxIncomingEmailSettings_QNAME, MailboxIncomingEmailSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StandardContentUsage")
    public JAXBElement<StandardContentUsageType> createStandardContentUsage(StandardContentUsageType value) {
        return new JAXBElement<StandardContentUsageType>(_StandardContentUsage_QNAME, StandardContentUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstanceList")
    public JAXBElement<SLAInstanceListType> createSLAInstanceList(SLAInstanceListType value) {
        return new JAXBElement<SLAInstanceListType>(_SLAInstanceList_QNAME, SLAInstanceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StandardContent")
    public JAXBElement<StandardContentType> createStandardContent(StandardContentType value) {
        return new JAXBElement<StandardContentType>(_StandardContent_QNAME, StandardContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CategoryNotification")
    public JAXBElement<CategoryNotificationType> createCategoryNotification(CategoryNotificationType value) {
        return new JAXBElement<CategoryNotificationType>(_CategoryNotification_QNAME, CategoryNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequiredListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LabelRequiredList")
    public JAXBElement<LabelRequiredListType> createLabelRequiredList(LabelRequiredListType value) {
        return new JAXBElement<LabelRequiredListType>(_LabelRequiredList_QNAME, LabelRequiredListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StandardContentAttributes")
    public JAXBElement<StandardContentAttributesType> createStandardContentAttributes(StandardContentAttributesType value) {
        return new JAXBElement<StandardContentAttributesType>(_StandardContentAttributes_QNAME, StandardContentAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageContentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MessageContentType")
    public JAXBElement<MessageContentTypeType> createMessageContentType(MessageContentTypeType value) {
        return new JAXBElement<MessageContentTypeType>(_MessageContentType_QNAME, MessageContentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MenuAssignableAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MenuAssignableAccount")
    public JAXBElement<MenuAssignableAccountType> createMenuAssignableAccount(MenuAssignableAccountType value) {
        return new JAXBElement<MenuAssignableAccountType>(_MenuAssignableAccount_QNAME, MenuAssignableAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountServiceSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccountServiceSettings")
    public JAXBElement<AccountServiceSettingsType> createAccountServiceSettings(AccountServiceSettingsType value) {
        return new JAXBElement<AccountServiceSettingsType>(_AccountServiceSettings_QNAME, AccountServiceSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControlAbilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccessControlAbility")
    public JAXBElement<AccessControlAbilityType> createAccessControlAbility(AccessControlAbilityType value) {
        return new JAXBElement<AccessControlAbilityType>(_AccessControlAbility_QNAME, AccessControlAbilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingMailboxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MarketingMailbox")
    public JAXBElement<MarketingMailboxType> createMarketingMailbox(MarketingMailboxType value) {
        return new JAXBElement<MarketingMailboxType>(_MarketingMailbox_QNAME, MarketingMailboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedFileAttachmentIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SharedFileAttachmentIncident")
    public JAXBElement<SharedFileAttachmentIncidentType> createSharedFileAttachmentIncident(SharedFileAttachmentIncidentType value) {
        return new JAXBElement<SharedFileAttachmentIncidentType>(_SharedFileAttachmentIncident_QNAME, SharedFileAttachmentIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportColumnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnalyticsReportColumn")
    public JAXBElement<AnalyticsReportColumnType> createAnalyticsReportColumn(AnalyticsReportColumnType value) {
        return new JAXBElement<AnalyticsReportColumnType>(_AnalyticsReportColumn_QNAME, AnalyticsReportColumnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportFilterAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnalyticsReportFilterAttributes")
    public JAXBElement<AnalyticsReportFilterAttributesType> createAnalyticsReportFilterAttributes(AnalyticsReportFilterAttributesType value) {
        return new JAXBElement<AnalyticsReportFilterAttributesType>(_AnalyticsReportFilterAttributes_QNAME, AnalyticsReportFilterAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTerritoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesTerritory")
    public JAXBElement<SalesTerritoryType> createSalesTerritory(SalesTerritoryType value) {
        return new JAXBElement<SalesTerritoryType>(_SalesTerritory_QNAME, SalesTerritoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentSharedList")
    public JAXBElement<FileAttachmentSharedListType> createFileAttachmentSharedList(FileAttachmentSharedListType value) {
        return new JAXBElement<FileAttachmentSharedListType>(_FileAttachmentSharedList_QNAME, FileAttachmentSharedListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachment")
    public JAXBElement<FileAttachmentType> createFileAttachment(FileAttachmentType value) {
        return new JAXBElement<FileAttachmentType>(_FileAttachment_QNAME, FileAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedFileAttachmentCommonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SharedFileAttachmentCommon")
    public JAXBElement<SharedFileAttachmentCommonType> createSharedFileAttachmentCommon(SharedFileAttachmentCommonType value) {
        return new JAXBElement<SharedFileAttachmentCommonType>(_SharedFileAttachmentCommon_QNAME, SharedFileAttachmentCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactOpenIDAccountListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactOpenIDAccountList")
    public JAXBElement<ContactOpenIDAccountListType> createContactOpenIDAccountList(ContactOpenIDAccountListType value) {
        return new JAXBElement<ContactOpenIDAccountListType>(_ContactOpenIDAccountList_QNAME, ContactOpenIDAccountListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Label")
    public JAXBElement<LabelType> createLabel(LabelType value) {
        return new JAXBElement<LabelType>(_Label_QNAME, LabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Campaign")
    public JAXBElement<CampaignType> createCampaign(CampaignType value) {
        return new JAXBElement<CampaignType>(_Campaign_QNAME, CampaignType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnswerNotificationList")
    public JAXBElement<AnswerNotificationListType> createAnswerNotificationList(AnswerNotificationListType value) {
        return new JAXBElement<AnswerNotificationListType>(_AnswerNotificationList_QNAME, AnswerNotificationListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionDeltaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceDispositionDelta")
    public JAXBElement<ServiceDispositionDeltaType> createServiceDispositionDelta(ServiceDispositionDeltaType value) {
        return new JAXBElement<ServiceDispositionDeltaType>(_ServiceDispositionDelta_QNAME, ServiceDispositionDeltaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryDeltaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceCategoryDelta")
    public JAXBElement<ServiceCategoryDeltaType> createServiceCategoryDelta(ServiceCategoryDeltaType value) {
        return new JAXBElement<ServiceCategoryDeltaType>(_ServiceCategoryDelta_QNAME, ServiceCategoryDeltaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceCategoryList")
    public JAXBElement<ServiceCategoryListType> createServiceCategoryList(ServiceCategoryListType value) {
        return new JAXBElement<ServiceCategoryListType>(_ServiceCategoryList_QNAME, ServiceCategoryListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LabelList")
    public JAXBElement<LabelListType> createLabelList(LabelListType value) {
        return new JAXBElement<LabelListType>(_LabelList_QNAME, LabelListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentAnswerList")
    public JAXBElement<FileAttachmentAnswerListType> createFileAttachmentAnswerList(FileAttachmentAnswerListType value) {
        return new JAXBElement<FileAttachmentAnswerListType>(_FileAttachmentAnswerList_QNAME, FileAttachmentAnswerListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Mailbox")
    public JAXBElement<MailboxType> createMailbox(MailboxType value) {
        return new JAXBElement<MailboxType>(_Mailbox_QNAME, MailboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControlPermissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccessControlPermission")
    public JAXBElement<AccessControlPermissionType> createAccessControlPermission(AccessControlPermissionType value) {
        return new JAXBElement<AccessControlPermissionType>(_AccessControlPermission_QNAME, AccessControlPermissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetSLAInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssetSLAInstance")
    public JAXBElement<AssetSLAInstanceType> createAssetSLAInstance(AssetSLAInstanceType value) {
        return new JAXBElement<AssetSLAInstanceType>(_AssetSLAInstance_QNAME, AssetSLAInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceCategory")
    public JAXBElement<ServiceCategoryType> createServiceCategory(ServiceCategoryType value) {
        return new JAXBElement<ServiceCategoryType>(_ServiceCategory_QNAME, ServiceCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnswerNotification")
    public JAXBElement<AnswerNotificationType> createAnswerNotification(AnswerNotificationType value) {
        return new JAXBElement<AnswerNotificationType>(_AnswerNotification_QNAME, AnswerNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesProduct")
    public JAXBElement<SalesProductType> createSalesProduct(SalesProductType value) {
        return new JAXBElement<SalesProductType>(_SalesProduct_QNAME, SalesProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TimeBilled")
    public JAXBElement<TimeBilledType> createTimeBilled(TimeBilledType value) {
        return new JAXBElement<TimeBilledType>(_TimeBilled_QNAME, TimeBilledType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentResponse")
    public JAXBElement<IncidentResponseType> createIncidentResponse(IncidentResponseType value) {
        return new JAXBElement<IncidentResponseType>(_IncidentResponse_QNAME, IncidentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolidayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Holiday")
    public JAXBElement<HolidayType> createHoliday(HolidayType value) {
        return new JAXBElement<HolidayType>(_Holiday_QNAME, HolidayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailboxOutgoingEmailSettings")
    public JAXBElement<MailboxOutgoingEmailSettingsType> createMailboxOutgoingEmailSettings(MailboxOutgoingEmailSettingsType value) {
        return new JAXBElement<MailboxOutgoingEmailSettingsType>(_MailboxOutgoingEmailSettings_QNAME, MailboxOutgoingEmailSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChannelUsername")
    public JAXBElement<ChannelUsernameType> createChannelUsername(ChannelUsernameType value) {
        return new JAXBElement<ChannelUsernameType>(_ChannelUsername_QNAME, ChannelUsernameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetSLAInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssetSLAInstanceList")
    public JAXBElement<AssetSLAInstanceListType> createAssetSLAInstanceList(AssetSLAInstanceListType value) {
        return new JAXBElement<AssetSLAInstanceListType>(_AssetSLAInstanceList_QNAME, AssetSLAInstanceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "QuoteLineItem")
    public JAXBElement<QuoteLineItemType> createQuoteLineItem(QuoteLineItemType value) {
        return new JAXBElement<QuoteLineItemType>(_QuoteLineItem_QNAME, QuoteLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSOTokenReferenceAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SSOTokenReferenceAttributes")
    public JAXBElement<SSOTokenReferenceAttributesType> createSSOTokenReferenceAttributes(SSOTokenReferenceAttributesType value) {
        return new JAXBElement<SSOTokenReferenceAttributesType>(_SSOTokenReferenceAttributes_QNAME, SSOTokenReferenceAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StandardContentContentValue")
    public JAXBElement<StandardContentContentValueType> createStandardContentContentValue(StandardContentContentValueType value) {
        return new JAXBElement<StandardContentContentValueType>(_StandardContentContentValue_QNAME, StandardContentContentValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MonetaryValue")
    public JAXBElement<MonetaryValueType> createMonetaryValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_MonetaryValue_QNAME, MonetaryValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControlRoleSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccessControlRoleSet")
    public JAXBElement<AccessControlRoleSetType> createAccessControlRoleSet(AccessControlRoleSetType value) {
        return new JAXBElement<AccessControlRoleSetType>(_AccessControlRoleSet_QNAME, AccessControlRoleSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "QuoteList")
    public JAXBElement<QuoteListType> createQuoteList(QuoteListType value) {
        return new JAXBElement<QuoteListType>(_QuoteList_QNAME, QuoteListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMailboxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceMailbox")
    public JAXBElement<ServiceMailboxType> createServiceMailbox(ServiceMailboxType value) {
        return new JAXBElement<ServiceMailboxType>(_ServiceMailbox_QNAME, ServiceMailboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InterfaceValue")
    public JAXBElement<InterfaceValueType> createInterfaceValue(InterfaceValueType value) {
        return new JAXBElement<InterfaceValueType>(_InterfaceValue_QNAME, InterfaceValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TypedAddress")
    public JAXBElement<TypedAddressType> createTypedAddress(TypedAddressType value) {
        return new JAXBElement<TypedAddressType>(_TypedAddress_QNAME, TypedAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "GroupAccount")
    public JAXBElement<GroupAccountType> createGroupAccount(GroupAccountType value) {
        return new JAXBElement<GroupAccountType>(_GroupAccount_QNAME, GroupAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Configuration")
    public JAXBElement<ConfigurationType> createConfiguration(ConfigurationType value) {
        return new JAXBElement<ConfigurationType>(_Configuration_QNAME, ConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessLevelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccessLevelType")
    public JAXBElement<AccessLevelTypeType> createAccessLevelType(AccessLevelTypeType value) {
        return new JAXBElement<AccessLevelTypeType>(_AccessLevelType_QNAME, AccessLevelTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSalesSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TaskSalesSettings")
    public JAXBElement<TaskSalesSettingsType> createTaskSalesSettings(TaskSalesSettingsType value) {
        return new JAXBElement<TaskSalesSettingsType>(_TaskSalesSettings_QNAME, TaskSalesSettingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StandardContentContentValueList")
    public JAXBElement<StandardContentContentValueListType> createStandardContentContentValueList(StandardContentContentValueListType value) {
        return new JAXBElement<StandardContentContentValueListType>(_StandardContentContentValueList_QNAME, StandardContentContentValueListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MessageBase")
    public JAXBElement<MessageBaseType> createMessageBase(MessageBaseType value) {
        return new JAXBElement<MessageBaseType>(_MessageBase_QNAME, MessageBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentAnswer")
    public JAXBElement<FileAttachmentAnswerType> createFileAttachmentAnswer(FileAttachmentAnswerType value) {
        return new JAXBElement<FileAttachmentAnswerType>(_FileAttachmentAnswer_QNAME, FileAttachmentAnswerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncidentMilestoneInstance")
    public JAXBElement<IncidentMilestoneInstanceType> createIncidentMilestoneInstance(IncidentMilestoneInstanceType value) {
        return new JAXBElement<IncidentMilestoneInstanceType>(_IncidentMilestoneInstance_QNAME, IncidentMilestoneInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<NoteType>(_Note_QNAME, NoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedFileAttachmentAnswerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SharedFileAttachmentAnswer")
    public JAXBElement<SharedFileAttachmentAnswerType> createSharedFileAttachmentAnswer(SharedFileAttachmentAnswerType value) {
        return new JAXBElement<SharedFileAttachmentAnswerType>(_SharedFileAttachmentAnswer_QNAME, SharedFileAttachmentAnswerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedFileAttachmentSharedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SharedFileAttachmentShared")
    public JAXBElement<SharedFileAttachmentSharedType> createSharedFileAttachmentShared(SharedFileAttachmentSharedType value) {
        return new JAXBElement<SharedFileAttachmentSharedType>(_SharedFileAttachmentShared_QNAME, SharedFileAttachmentSharedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachmentCommonList")
    public JAXBElement<FileAttachmentCommonListType> createFileAttachmentCommonList(FileAttachmentCommonListType value) {
        return new JAXBElement<FileAttachmentCommonListType>(_FileAttachmentCommonList_QNAME, FileAttachmentCommonListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "QuoteLineItemList")
    public JAXBElement<QuoteLineItemListType> createQuoteLineItemList(QuoteLineItemListType value) {
        return new JAXBElement<QuoteLineItemListType>(_QuoteLineItemList_QNAME, QuoteLineItemListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceDispositionList")
    public JAXBElement<ServiceDispositionListType> createServiceDispositionList(ServiceDispositionListType value) {
        return new JAXBElement<ServiceDispositionListType>(_ServiceDispositionList_QNAME, ServiceDispositionListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSOTokenReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SSOTokenReference")
    public JAXBElement<SSOTokenReferenceType> createSSOTokenReference(SSOTokenReferenceType value) {
        return new JAXBElement<SSOTokenReferenceType>(_SSOTokenReference_QNAME, SSOTokenReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InterfaceValueList")
    public JAXBElement<InterfaceValueListType> createInterfaceValueList(InterfaceValueListType value) {
        return new JAXBElement<InterfaceValueListType>(_InterfaceValueList_QNAME, InterfaceValueListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetStatusesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssetStatuses")
    public JAXBElement<AssetStatusesType> createAssetStatuses(AssetStatusesType value) {
        return new JAXBElement<AssetStatusesType>(_AssetStatuses_QNAME, AssetStatusesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactLists", scope = ContactMarketingSettingsType.class)
    public JAXBElement<NamedIDDeltaList> createContactMarketingSettingsTypeContactLists(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ContactMarketingSettingsTypeContactLists_QNAME, NamedIDDeltaList.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MarketingOrganizationNameAlt", scope = ContactMarketingSettingsType.class)
    public JAXBElement<String> createContactMarketingSettingsTypeMarketingOrganizationNameAlt(String value) {
        return new JAXBElement<String>(_ContactMarketingSettingsTypeMarketingOrganizationNameAlt_QNAME, String.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MarketingOptIn", scope = ContactMarketingSettingsType.class)
    public JAXBElement<Boolean> createContactMarketingSettingsTypeMarketingOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ContactMarketingSettingsTypeMarketingOptIn_QNAME, Boolean.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SurveyOptIn", scope = ContactMarketingSettingsType.class)
    public JAXBElement<Boolean> createContactMarketingSettingsTypeSurveyOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ContactMarketingSettingsTypeSurveyOptIn_QNAME, Boolean.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ContactMarketingSettingsType.class)
    public JAXBElement<ContactMarketingSettingsNullFields> createContactMarketingSettingsTypeValidNullFields(ContactMarketingSettingsNullFields value) {
        return new JAXBElement<ContactMarketingSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ContactMarketingSettingsNullFields.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EmailFormat", scope = ContactMarketingSettingsType.class)
    public JAXBElement<NamedID> createContactMarketingSettingsTypeEmailFormat(NamedID value) {
        return new JAXBElement<NamedID>(_ContactMarketingSettingsTypeEmailFormat_QNAME, NamedID.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MarketingOrganizationName", scope = ContactMarketingSettingsType.class)
    public JAXBElement<String> createContactMarketingSettingsTypeMarketingOrganizationName(String value) {
        return new JAXBElement<String>(_ContactMarketingSettingsTypeMarketingOrganizationName_QNAME, String.class, ContactMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstances", scope = OrganizationServiceSettingsType.class)
    public JAXBElement<SLAInstanceListType> createOrganizationServiceSettingsTypeSLAInstances(SLAInstanceListType value) {
        return new JAXBElement<SLAInstanceListType>(_OrganizationServiceSettingsTypeSLAInstances_QNAME, SLAInstanceListType.class, OrganizationServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = OrganizationServiceSettingsType.class)
    public JAXBElement<OrganizationServiceSettingsNullFields> createOrganizationServiceSettingsTypeValidNullFields(OrganizationServiceSettingsNullFields value) {
        return new JAXBElement<OrganizationServiceSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, OrganizationServiceSettingsNullFields.class, OrganizationServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NameOfSLA", scope = AssignedSLAInstanceType.class)
    public JAXBElement<NamedID> createAssignedSLAInstanceTypeNameOfSLA(NamedID value) {
        return new JAXBElement<NamedID>(_AssignedSLAInstanceTypeNameOfSLA_QNAME, NamedID.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingTotal", scope = AssignedSLAInstanceType.class)
    public JAXBElement<Integer> createAssignedSLAInstanceTypeRemainingTotal(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingTotal_QNAME, Integer.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedSLAInstanceNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AssignedSLAInstanceType.class)
    public JAXBElement<AssignedSLAInstanceNullFields> createAssignedSLAInstanceTypeValidNullFields(AssignedSLAInstanceNullFields value) {
        return new JAXBElement<AssignedSLAInstanceNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AssignedSLAInstanceNullFields.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromCSR", scope = AssignedSLAInstanceType.class)
    public JAXBElement<Integer> createAssignedSLAInstanceTypeRemainingFromCSR(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromCSR_QNAME, Integer.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromWeb", scope = AssignedSLAInstanceType.class)
    public JAXBElement<Integer> createAssignedSLAInstanceTypeRemainingFromWeb(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromWeb_QNAME, Integer.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromChat", scope = AssignedSLAInstanceType.class)
    public JAXBElement<Integer> createAssignedSLAInstanceTypeRemainingFromChat(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromChat_QNAME, Integer.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromEmail", scope = AssignedSLAInstanceType.class)
    public JAXBElement<Integer> createAssignedSLAInstanceTypeRemainingFromEmail(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromEmail_QNAME, Integer.class, AssignedSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = SalesProductScheduleType.class)
    public JAXBElement<String> createSalesProductScheduleTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, SalesProductScheduleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = SalesProductScheduleType.class)
    public JAXBElement<SalesProductScheduleNullFields> createSalesProductScheduleTypeValidNullFields(SalesProductScheduleNullFields value) {
        return new JAXBElement<SalesProductScheduleNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, SalesProductScheduleNullFields.class, SalesProductScheduleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ScheduleEndDate", scope = SalesProductScheduleType.class)
    public JAXBElement<XMLGregorianCalendar> createSalesProductScheduleTypeScheduleEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesProductScheduleTypeScheduleEndDate_QNAME, XMLGregorianCalendar.class, SalesProductScheduleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AnswerNotifications", scope = ContactServiceSettingsType.class)
    public JAXBElement<AnswerNotificationListType> createContactServiceSettingsTypeAnswerNotifications(AnswerNotificationListType value) {
        return new JAXBElement<AnswerNotificationListType>(_ContactServiceSettingsTypeAnswerNotifications_QNAME, AnswerNotificationListType.class, ContactServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstances", scope = ContactServiceSettingsType.class)
    public JAXBElement<SLAInstanceListType> createContactServiceSettingsTypeSLAInstances(SLAInstanceListType value) {
        return new JAXBElement<SLAInstanceListType>(_OrganizationServiceSettingsTypeSLAInstances_QNAME, SLAInstanceListType.class, ContactServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ContactServiceSettingsType.class)
    public JAXBElement<ContactServiceSettingsNullFields> createContactServiceSettingsTypeValidNullFields(ContactServiceSettingsNullFields value) {
        return new JAXBElement<ContactServiceSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ContactServiceSettingsNullFields.class, ContactServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CategoryNotifications", scope = ContactServiceSettingsType.class)
    public JAXBElement<CategoryNotificationListType> createContactServiceSettingsTypeCategoryNotifications(CategoryNotificationListType value) {
        return new JAXBElement<CategoryNotificationListType>(_ContactServiceSettingsTypeCategoryNotifications_QNAME, CategoryNotificationListType.class, ContactServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProductNotifications", scope = ContactServiceSettingsType.class)
    public JAXBElement<ProductNotificationListType> createContactServiceSettingsTypeProductNotifications(ProductNotificationListType value) {
        return new JAXBElement<ProductNotificationListType>(_ContactServiceSettingsTypeProductNotifications_QNAME, ProductNotificationListType.class, ContactServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Opportunity", scope = TaskSalesSettingsType.class)
    public JAXBElement<NamedID> createTaskSalesSettingsTypeOpportunity(NamedID value) {
        return new JAXBElement<NamedID>(_Opportunity_QNAME, NamedID.class, TaskSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = TaskSalesSettingsType.class)
    public JAXBElement<TaskSalesSettingsNullFields> createTaskSalesSettingsTypeValidNullFields(TaskSalesSettingsNullFields value) {
        return new JAXBElement<TaskSalesSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, TaskSalesSettingsNullFields.class, TaskSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Descriptions", scope = ServiceCategoryType.class)
    public JAXBElement<LabelListType> createServiceCategoryTypeDescriptions(LabelListType value) {
        return new JAXBElement<LabelListType>(_ServiceCategoryTypeDescriptions_QNAME, LabelListType.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EndUserVisibleInterfaces", scope = ServiceCategoryType.class)
    public JAXBElement<NamedIDDeltaList> createServiceCategoryTypeEndUserVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeEndUserVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ServiceCategoryType.class)
    public JAXBElement<ServiceCategoryNullFields> createServiceCategoryTypeValidNullFields(ServiceCategoryNullFields value) {
        return new JAXBElement<ServiceCategoryNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ServiceCategoryNullFields.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Parent", scope = ServiceCategoryType.class)
    public JAXBElement<NamedIDHierarchy> createServiceCategoryTypeParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceCategoryTypeParent_QNAME, NamedIDHierarchy.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = ServiceCategoryType.class)
    public JAXBElement<NamedIDDeltaList> createServiceCategoryTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProductLinks", scope = ServiceCategoryType.class)
    public JAXBElement<ServiceProductListType> createServiceCategoryTypeProductLinks(ServiceProductListType value) {
        return new JAXBElement<ServiceProductListType>(_ServiceCategoryTypeProductLinks_QNAME, ServiceProductListType.class, ServiceCategoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ClosedTime", scope = IncidentType.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentTypeClosedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentTypeClosedTime_QNAME, XMLGregorianCalendar.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LastSurveyScore", scope = IncidentType.class)
    public JAXBElement<Integer> createIncidentTypeLastSurveyScore(Integer value) {
        return new JAXBElement<Integer>(_IncidentTypeLastSurveyScore_QNAME, Integer.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentMilestoneInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MilestoneInstances", scope = IncidentType.class)
    public JAXBElement<IncidentMilestoneInstanceListType> createIncidentTypeMilestoneInstances(IncidentMilestoneInstanceListType value) {
        return new JAXBElement<IncidentMilestoneInstanceListType>(_IncidentTypeMilestoneInstances_QNAME, IncidentMilestoneInstanceListType.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Language", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeLanguage(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeLanguage_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Mailbox", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeMailbox(NamedID value) {
        return new JAXBElement<NamedID>(_Mailbox_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Asset", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeAsset(NamedID value) {
        return new JAXBElement<NamedID>(_Asset_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InitialSolutionTime", scope = IncidentType.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentTypeInitialSolutionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentTypeInitialSolutionTime_QNAME, XMLGregorianCalendar.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Queue", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeQueue(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeQueue_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Category", scope = IncidentType.class)
    public JAXBElement<NamedIDHierarchy> createIncidentTypeCategory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_IncidentTypeCategory_QNAME, NamedIDHierarchy.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LastResponseTime", scope = IncidentType.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentTypeLastResponseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentTypeLastResponseTime_QNAME, XMLGregorianCalendar.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InitialResponseDueTime", scope = IncidentType.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentTypeInitialResponseDueTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentTypeInitialResponseDueTime_QNAME, XMLGregorianCalendar.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChatQueue", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeChatQueue(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeChatQueue_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncidentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = IncidentType.class)
    public JAXBElement<FileAttachmentIncidentListType> createIncidentTypeFileAttachments(FileAttachmentIncidentListType value) {
        return new JAXBElement<FileAttachmentIncidentListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentIncidentListType.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Product", scope = IncidentType.class)
    public JAXBElement<NamedIDHierarchy> createIncidentTypeProduct(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_IncidentTypeProduct_QNAME, NamedIDHierarchy.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SmartSenseStaff", scope = IncidentType.class)
    public JAXBElement<Integer> createIncidentTypeSmartSenseStaff(Integer value) {
        return new JAXBElement<Integer>(_IncidentTypeSmartSenseStaff_QNAME, Integer.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ResolutionInterval", scope = IncidentType.class)
    public JAXBElement<Integer> createIncidentTypeResolutionInterval(Integer value) {
        return new JAXBElement<Integer>(_IncidentTypeResolutionInterval_QNAME, Integer.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OtherContacts", scope = IncidentType.class)
    public JAXBElement<IncidentContactListType> createIncidentTypeOtherContacts(IncidentContactListType value) {
        return new JAXBElement<IncidentContactListType>(_IncidentTypeOtherContacts_QNAME, IncidentContactListType.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = IncidentType.class)
    public JAXBElement<IncidentNullFields> createIncidentTypeValidNullFields(IncidentNullFields value) {
        return new JAXBElement<IncidentNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, IncidentNullFields.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "BilledMinutes", scope = IncidentType.class)
    public JAXBElement<TimeBilledListType> createIncidentTypeBilledMinutes(TimeBilledListType value) {
        return new JAXBElement<TimeBilledListType>(_IncidentTypeBilledMinutes_QNAME, TimeBilledListType.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedSLAInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstance", scope = IncidentType.class)
    public JAXBElement<AssignedSLAInstanceType> createIncidentTypeSLAInstance(AssignedSLAInstanceType value) {
        return new JAXBElement<AssignedSLAInstanceType>(_SLAInstance_QNAME, AssignedSLAInstanceType.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Disposition", scope = IncidentType.class)
    public JAXBElement<NamedIDHierarchy> createIncidentTypeDisposition(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_IncidentTypeDisposition_QNAME, NamedIDHierarchy.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CreatedByAccount", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeCreatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeCreatedByAccount_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Channel", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeChannel(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeChannel_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ResponseInterval", scope = IncidentType.class)
    public JAXBElement<Integer> createIncidentTypeResponseInterval(Integer value) {
        return new JAXBElement<Integer>(_IncidentTypeResponseInterval_QNAME, Integer.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Mailing", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeMailing(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeMailing_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Severity", scope = IncidentType.class)
    public JAXBElement<NamedID> createIncidentTypeSeverity(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeSeverity_QNAME, NamedID.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SmartSenseCustomer", scope = IncidentType.class)
    public JAXBElement<Integer> createIncidentTypeSmartSenseCustomer(Integer value) {
        return new JAXBElement<Integer>(_IncidentTypeSmartSenseCustomer_QNAME, Integer.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Subject", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeSubject(String value) {
        return new JAXBElement<String>(_IncidentTypeSubject_QNAME, String.class, IncidentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Account", scope = ThreadType.class)
    public JAXBElement<NamedID> createThreadTypeAccount(NamedID value) {
        return new JAXBElement<NamedID>(_Account_QNAME, NamedID.class, ThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Channel", scope = ThreadType.class)
    public JAXBElement<NamedID> createThreadTypeChannel(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeChannel_QNAME, NamedID.class, ThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ThreadType.class)
    public JAXBElement<ThreadNullFields> createThreadTypeValidNullFields(ThreadNullFields value) {
        return new JAXBElement<ThreadNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ThreadNullFields.class, ThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Contact", scope = ThreadType.class)
    public JAXBElement<NamedID> createThreadTypeContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, ThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "MailHeader", scope = ThreadType.class)
    public JAXBElement<String> createThreadTypeMailHeader(String value) {
        return new JAXBElement<String>(_ThreadTypeMailHeader_QNAME, String.class, ThreadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AcquiredDate", scope = ContactSalesSettingsType.class)
    public JAXBElement<XMLGregorianCalendar> createContactSalesSettingsTypeAcquiredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactSalesSettingsTypeAcquiredDate_QNAME, XMLGregorianCalendar.class, ContactSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ContactSalesSettingsType.class)
    public JAXBElement<ContactSalesSettingsNullFields> createContactSalesSettingsTypeValidNullFields(ContactSalesSettingsNullFields value) {
        return new JAXBElement<ContactSalesSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ContactSalesSettingsNullFields.class, ContactSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesAccount", scope = ContactSalesSettingsType.class)
    public JAXBElement<NamedIDHierarchy> createContactSalesSettingsTypeSalesAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ContactSalesSettingsTypeSalesAccount_QNAME, NamedIDHierarchy.class, ContactSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AnswerRelatedAnswerType.class)
    public JAXBElement<AnswerRelatedAnswerNullFields> createAnswerRelatedAnswerTypeValidNullFields(AnswerRelatedAnswerNullFields value) {
        return new JAXBElement<AnswerRelatedAnswerNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AnswerRelatedAnswerNullFields.class, AnswerRelatedAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ManualStrength", scope = AnswerRelatedAnswerType.class)
    public JAXBElement<Integer> createAnswerRelatedAnswerTypeManualStrength(Integer value) {
        return new JAXBElement<Integer>(_AnswerRelatedAnswerTypeManualStrength_QNAME, Integer.class, AnswerRelatedAnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PasswordEmailExpirationTime", scope = ContactType.class)
    public JAXBElement<XMLGregorianCalendar> createContactTypePasswordEmailExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactTypePasswordEmailExpirationTime_QNAME, XMLGregorianCalendar.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ChannelUsernames", scope = ContactType.class)
    public JAXBElement<ChannelUsernameListType> createContactTypeChannelUsernames(ChannelUsernameListType value) {
        return new JAXBElement<ChannelUsernameListType>(_ContactTypeChannelUsernames_QNAME, ChannelUsernameListType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ContactType.class)
    public JAXBElement<ContactNullFields> createContactTypeValidNullFields(ContactNullFields value) {
        return new JAXBElement<ContactNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ContactNullFields.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExternalReference", scope = ContactType.class)
    public JAXBElement<String> createContactTypeExternalReference(String value) {
        return new JAXBElement<String>(_ContactTypeExternalReference_QNAME, String.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Phones", scope = ContactType.class)
    public JAXBElement<PhoneListType> createContactTypePhones(PhoneListType value) {
        return new JAXBElement<PhoneListType>(_ContactTypePhones_QNAME, PhoneListType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Emails", scope = ContactType.class)
    public JAXBElement<EmailListType> createContactTypeEmails(EmailListType value) {
        return new JAXBElement<EmailListType>(_ContactTypeEmails_QNAME, EmailListType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PasswordExpirationTime", scope = ContactType.class)
    public JAXBElement<XMLGregorianCalendar> createContactTypePasswordExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactTypePasswordExpirationTime_QNAME, XMLGregorianCalendar.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Notes", scope = ContactType.class)
    public JAXBElement<NoteListType> createContactTypeNotes(NoteListType value) {
        return new JAXBElement<NoteListType>(_ContactTypeNotes_QNAME, NoteListType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactType", scope = ContactType.class)
    public JAXBElement<NamedID> createContactTypeContactType(NamedID value) {
        return new JAXBElement<NamedID>(_ContactTypeContactType_QNAME, NamedID.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = ContactType.class)
    public JAXBElement<NamedID> createContactTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NewPassword", scope = ContactType.class)
    public JAXBElement<String> createContactTypeNewPassword(String value) {
        return new JAXBElement<String>(_ContactTypeNewPassword_QNAME, String.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Banner", scope = ContactType.class)
    public JAXBElement<BannerType> createContactTypeBanner(BannerType value) {
        return new JAXBElement<BannerType>(_Banner_QNAME, BannerType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = ContactType.class)
    public JAXBElement<FileAttachmentCommonListType> createContactTypeFileAttachments(FileAttachmentCommonListType value) {
        return new JAXBElement<FileAttachmentCommonListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentCommonListType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Address", scope = ContactType.class)
    public JAXBElement<AddressType> createContactTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Login", scope = ContactType.class)
    public JAXBElement<String> createContactTypeLogin(String value) {
        return new JAXBElement<String>(_ContactTypeLogin_QNAME, String.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Title", scope = ContactType.class)
    public JAXBElement<String> createContactTypeTitle(String value) {
        return new JAXBElement<String>(_ContactTypeTitle_QNAME, String.class, ContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Last", scope = PersonNameType.class)
    public JAXBElement<String> createPersonNameTypeLast(String value) {
        return new JAXBElement<String>(_PersonNameTypeLast_QNAME, String.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = PersonNameType.class)
    public JAXBElement<PersonNameNullFields> createPersonNameTypeValidNullFields(PersonNameNullFields value) {
        return new JAXBElement<PersonNameNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, PersonNameNullFields.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "First", scope = PersonNameType.class)
    public JAXBElement<String> createPersonNameTypeFirst(String value) {
        return new JAXBElement<String>(_PersonNameTypeFirst_QNAME, String.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageRecipientsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MailMessageRecipientsType.class)
    public JAXBElement<MailMessageRecipientsNullFields> createMailMessageRecipientsTypeValidNullFields(MailMessageRecipientsNullFields value) {
        return new JAXBElement<MailMessageRecipientsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MailMessageRecipientsNullFields.class, MailMessageRecipientsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ProductNotificationType.class)
    public JAXBElement<ProductNotificationNullFields> createProductNotificationTypeValidNullFields(ProductNotificationNullFields value) {
        return new JAXBElement<ProductNotificationNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ProductNotificationNullFields.class, ProductNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Interface", scope = ProductNotificationType.class)
    public JAXBElement<NamedID> createProductNotificationTypeInterface(NamedID value) {
        return new JAXBElement<NamedID>(_ProductNotificationTypeInterface_QNAME, NamedID.class, ProductNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ImportanceFlag", scope = BannerType.class)
    public JAXBElement<NamedID> createBannerTypeImportanceFlag(NamedID value) {
        return new JAXBElement<NamedID>(_BannerTypeImportanceFlag_QNAME, NamedID.class, BannerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedByAccount", scope = BannerType.class)
    public JAXBElement<NamedID> createBannerTypeUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerTypeUpdatedByAccount_QNAME, NamedID.class, BannerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = BannerType.class)
    public JAXBElement<BannerNullFields> createBannerTypeValidNullFields(BannerNullFields value) {
        return new JAXBElement<BannerNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, BannerNullFields.class, BannerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedTime", scope = BannerType.class)
    public JAXBElement<XMLGregorianCalendar> createBannerTypeUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BannerTypeUpdatedTime_QNAME, XMLGregorianCalendar.class, BannerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Text", scope = BannerType.class)
    public JAXBElement<String> createBannerTypeText(String value) {
        return new JAXBElement<String>(_BannerTypeText_QNAME, String.class, BannerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Provinces", scope = CountryType.class)
    public JAXBElement<ProvinceListType> createCountryTypeProvinces(ProvinceListType value) {
        return new JAXBElement<ProvinceListType>(_CountryTypeProvinces_QNAME, ProvinceListType.class, CountryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = CountryType.class)
    public JAXBElement<CountryNullFields> createCountryTypeValidNullFields(CountryNullFields value) {
        return new JAXBElement<CountryNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, CountryNullFields.class, CountryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NameOfSLA", scope = AssetSLAInstanceType.class)
    public JAXBElement<NamedID> createAssetSLAInstanceTypeNameOfSLA(NamedID value) {
        return new JAXBElement<NamedID>(_AssignedSLAInstanceTypeNameOfSLA_QNAME, NamedID.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingTotal", scope = AssetSLAInstanceType.class)
    public JAXBElement<Integer> createAssetSLAInstanceTypeRemainingTotal(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingTotal_QNAME, Integer.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromCSR", scope = AssetSLAInstanceType.class)
    public JAXBElement<Integer> createAssetSLAInstanceTypeRemainingFromCSR(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromCSR_QNAME, Integer.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromWeb", scope = AssetSLAInstanceType.class)
    public JAXBElement<Integer> createAssetSLAInstanceTypeRemainingFromWeb(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromWeb_QNAME, Integer.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromChat", scope = AssetSLAInstanceType.class)
    public JAXBElement<Integer> createAssetSLAInstanceTypeRemainingFromChat(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromChat_QNAME, Integer.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RemainingFromEmail", scope = AssetSLAInstanceType.class)
    public JAXBElement<Integer> createAssetSLAInstanceTypeRemainingFromEmail(Integer value) {
        return new JAXBElement<Integer>(_AssignedSLAInstanceTypeRemainingFromEmail_QNAME, Integer.class, AssetSLAInstanceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Value", scope = ConfigurationType.class)
    public JAXBElement<String> createConfigurationTypeValue(String value) {
        return new JAXBElement<String>(_ConfigurationTypeValue_QNAME, String.class, ConfigurationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = CategoryNotificationType.class)
    public JAXBElement<CategoryNotificationNullFields> createCategoryNotificationTypeValidNullFields(CategoryNotificationNullFields value) {
        return new JAXBElement<CategoryNotificationNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, CategoryNotificationNullFields.class, CategoryNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Interface", scope = CategoryNotificationType.class)
    public JAXBElement<NamedID> createCategoryNotificationTypeInterface(NamedID value) {
        return new JAXBElement<NamedID>(_ProductNotificationTypeInterface_QNAME, NamedID.class, CategoryNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = OpportunityContactType.class)
    public JAXBElement<OpportunityContactNullFields> createOpportunityContactTypeValidNullFields(OpportunityContactNullFields value) {
        return new JAXBElement<OpportunityContactNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, OpportunityContactNullFields.class, OpportunityContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContactRole", scope = OpportunityContactType.class)
    public JAXBElement<NamedID> createOpportunityContactTypeContactRole(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityContactTypeContactRole_QNAME, NamedID.class, OpportunityContactType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = SSOTokenReferenceType.class)
    public JAXBElement<String> createSSOTokenReferenceTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, SSOTokenReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSOTokenReferenceNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = SSOTokenReferenceType.class)
    public JAXBElement<SSOTokenReferenceNullFields> createSSOTokenReferenceTypeValidNullFields(SSOTokenReferenceNullFields value) {
        return new JAXBElement<SSOTokenReferenceNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, SSOTokenReferenceNullFields.class, SSOTokenReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IssuedTime", scope = SSOTokenReferenceType.class)
    public JAXBElement<XMLGregorianCalendar> createSSOTokenReferenceTypeIssuedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SSOTokenReferenceTypeIssuedTime_QNAME, XMLGregorianCalendar.class, SSOTokenReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Territory", scope = AccountSalesSettingsType.class)
    public JAXBElement<NamedIDHierarchy> createAccountSalesSettingsTypeTerritory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountSalesSettingsTypeTerritory_QNAME, NamedIDHierarchy.class, AccountSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AccountSalesSettingsType.class)
    public JAXBElement<AccountSalesSettingsNullFields> createAccountSalesSettingsTypeValidNullFields(AccountSalesSettingsNullFields value) {
        return new JAXBElement<AccountSalesSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AccountSalesSettingsNullFields.class, AccountSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Description", scope = AssetType.class)
    public JAXBElement<String> createAssetTypeDescription(String value) {
        return new JAXBElement<String>(_AssetTypeDescription_QNAME, String.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = AssetType.class)
    public JAXBElement<NamedID> createAssetTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetSLAInstanceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SLAInstances", scope = AssetType.class)
    public JAXBElement<AssetSLAInstanceListType> createAssetTypeSLAInstances(AssetSLAInstanceListType value) {
        return new JAXBElement<AssetSLAInstanceListType>(_OrganizationServiceSettingsTypeSLAInstances_QNAME, AssetSLAInstanceListType.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InstalledDate", scope = AssetType.class)
    public JAXBElement<XMLGregorianCalendar> createAssetTypeInstalledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetTypeInstalledDate_QNAME, XMLGregorianCalendar.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PurchasedDate", scope = AssetType.class)
    public JAXBElement<XMLGregorianCalendar> createAssetTypePurchasedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetTypePurchasedDate_QNAME, XMLGregorianCalendar.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AssetType.class)
    public JAXBElement<AssetNullFields> createAssetTypeValidNullFields(AssetNullFields value) {
        return new JAXBElement<AssetNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AssetNullFields.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Price", scope = AssetType.class)
    public JAXBElement<MonetaryValueType> createAssetTypePrice(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_AssetTypePrice_QNAME, MonetaryValueType.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SerialNumber", scope = AssetType.class)
    public JAXBElement<String> createAssetTypeSerialNumber(String value) {
        return new JAXBElement<String>(_AssetTypeSerialNumber_QNAME, String.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Product", scope = AssetType.class)
    public JAXBElement<NamedID> createAssetTypeProduct(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeProduct_QNAME, NamedID.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Contact", scope = AssetType.class)
    public JAXBElement<NamedID> createAssetTypeContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RetiredDate", scope = AssetType.class)
    public JAXBElement<XMLGregorianCalendar> createAssetTypeRetiredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AssetTypeRetiredDate_QNAME, XMLGregorianCalendar.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetStatusesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StatusWithType", scope = AssetType.class)
    public JAXBElement<AssetStatusesType> createAssetTypeStatusWithType(AssetStatusesType value) {
        return new JAXBElement<AssetStatusesType>(_StatusWithType_QNAME, AssetStatusesType.class, AssetType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = SalesTerritoryType.class)
    public JAXBElement<String> createSalesTerritoryTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, SalesTerritoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TerritoryHierarchy", scope = SalesTerritoryType.class)
    public JAXBElement<NamedIDList> createSalesTerritoryTypeTerritoryHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_SalesTerritoryTypeTerritoryHierarchy_QNAME, NamedIDList.class, SalesTerritoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTerritoryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = SalesTerritoryType.class)
    public JAXBElement<SalesTerritoryNullFields> createSalesTerritoryTypeValidNullFields(SalesTerritoryNullFields value) {
        return new JAXBElement<SalesTerritoryNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, SalesTerritoryNullFields.class, SalesTerritoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Parent", scope = SalesTerritoryType.class)
    public JAXBElement<NamedIDHierarchy> createSalesTerritoryTypeParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceCategoryTypeParent_QNAME, NamedIDHierarchy.class, SalesTerritoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = SalesTerritoryType.class)
    public JAXBElement<NamedIDDeltaList> createSalesTerritoryTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, SalesTerritoryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedPrice", scope = QuoteLineItemType.class)
    public JAXBElement<MonetaryValueType> createQuoteLineItemTypeAdjustedPrice(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_QuoteLineItemTypeAdjustedPrice_QNAME, MonetaryValueType.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OriginalDescription", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeOriginalDescription(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeOriginalDescription_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OriginalPartNumber", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeOriginalPartNumber(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeOriginalPartNumber_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedName", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeAdjustedName(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeAdjustedName_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedTotal", scope = QuoteLineItemType.class)
    public JAXBElement<MonetaryValueType> createQuoteLineItemTypeAdjustedTotal(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_QuoteLineItemTypeAdjustedTotal_QNAME, MonetaryValueType.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = QuoteLineItemType.class)
    public JAXBElement<QuoteLineItemNullFields> createQuoteLineItemTypeValidNullFields(QuoteLineItemNullFields value) {
        return new JAXBElement<QuoteLineItemNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, QuoteLineItemNullFields.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OriginalName", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeOriginalName(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeOriginalName_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedDescription", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeAdjustedDescription(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeAdjustedDescription_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Product", scope = QuoteLineItemType.class)
    public JAXBElement<NamedID> createQuoteLineItemTypeProduct(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeProduct_QNAME, NamedID.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedPartNumber", scope = QuoteLineItemType.class)
    public JAXBElement<String> createQuoteLineItemTypeAdjustedPartNumber(String value) {
        return new JAXBElement<String>(_QuoteLineItemTypeAdjustedPartNumber_QNAME, String.class, QuoteLineItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Account", scope = TimeBilledType.class)
    public JAXBElement<NamedIDHierarchy> createTimeBilledTypeAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_Account_QNAME, NamedIDHierarchy.class, TimeBilledType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = TimeBilledType.class)
    public JAXBElement<String> createTimeBilledTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, TimeBilledType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = TimeBilledType.class)
    public JAXBElement<TimeBilledNullFields> createTimeBilledTypeValidNullFields(TimeBilledNullFields value) {
        return new JAXBElement<TimeBilledNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, TimeBilledNullFields.class, TimeBilledType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "BillableTask", scope = TimeBilledType.class)
    public JAXBElement<NamedID> createTimeBilledTypeBillableTask(NamedID value) {
        return new JAXBElement<NamedID>(_TimeBilledTypeBillableTask_QNAME, NamedID.class, TimeBilledType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Account", scope = GroupAccountType.class)
    public JAXBElement<NamedIDHierarchy> createGroupAccountTypeAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_Account_QNAME, NamedIDHierarchy.class, GroupAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccountNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = GroupAccountType.class)
    public JAXBElement<GroupAccountNullFields> createGroupAccountTypeValidNullFields(GroupAccountNullFields value) {
        return new JAXBElement<GroupAccountNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, GroupAccountNullFields.class, GroupAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StaffGroup", scope = GroupAccountType.class)
    public JAXBElement<NamedID> createGroupAccountTypeStaffGroup(NamedID value) {
        return new JAXBElement<NamedID>(_GroupAccountTypeStaffGroup_QNAME, NamedID.class, GroupAccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = StandardContentContentValueType.class)
    public JAXBElement<StandardContentContentValueNullFields> createStandardContentContentValueTypeValidNullFields(StandardContentContentValueNullFields value) {
        return new JAXBElement<StandardContentContentValueNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, StandardContentContentValueNullFields.class, StandardContentContentValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Value", scope = StandardContentContentValueType.class)
    public JAXBElement<String> createStandardContentContentValueTypeValue(String value) {
        return new JAXBElement<String>(_ConfigurationTypeValue_QNAME, String.class, StandardContentContentValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Channel", scope = NoteType.class)
    public JAXBElement<NamedID> createNoteTypeChannel(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeChannel_QNAME, NamedID.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedByAccount", scope = NoteType.class)
    public JAXBElement<NamedID> createNoteTypeUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerTypeUpdatedByAccount_QNAME, NamedID.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = NoteType.class)
    public JAXBElement<NoteNullFields> createNoteTypeValidNullFields(NoteNullFields value) {
        return new JAXBElement<NoteNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, NoteNullFields.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CreatedByAccount", scope = NoteType.class)
    public JAXBElement<NamedID> createNoteTypeCreatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeCreatedByAccount_QNAME, NamedID.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InitialContactDate", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeInitialContactDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityTypeInitialContactDate_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccountHierarchy", scope = OpportunityType.class)
    public JAXBElement<NamedIDList> createOpportunityTypeAccountHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_OpportunityTypeAccountHierarchy_QNAME, NamedIDList.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ClosedTime", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeClosedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentTypeClosedTime_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesRepresentativeValue", scope = OpportunityType.class)
    public JAXBElement<MonetaryValueType> createOpportunityTypeSalesRepresentativeValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OpportunityTypeSalesRepresentativeValue_QNAME, MonetaryValueType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ManagerValue", scope = OpportunityType.class)
    public JAXBElement<MonetaryValueType> createOpportunityTypeManagerValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OpportunityTypeManagerValue_QNAME, MonetaryValueType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Notes", scope = OpportunityType.class)
    public JAXBElement<NoteListType> createOpportunityTypeNotes(NoteListType value) {
        return new JAXBElement<NoteListType>(_ContactTypeNotes_QNAME, NoteListType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = OpportunityType.class)
    public JAXBElement<NamedID> createOpportunityTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "WinLossReason", scope = OpportunityType.class)
    public JAXBElement<NamedID> createOpportunityTypeWinLossReason(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityTypeWinLossReason_QNAME, NamedID.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = OpportunityType.class)
    public JAXBElement<FileAttachmentCommonListType> createOpportunityTypeFileAttachments(FileAttachmentCommonListType value) {
        return new JAXBElement<FileAttachmentCommonListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentCommonListType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LostTime", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeLostTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityTypeLostTime_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LeadRejectDateTime", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeLeadRejectDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityTypeLeadRejectDateTime_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Quotes", scope = OpportunityType.class)
    public JAXBElement<QuoteListType> createOpportunityTypeQuotes(QuoteListType value) {
        return new JAXBElement<QuoteListType>(_OpportunityTypeQuotes_QNAME, QuoteListType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ReturnValue", scope = OpportunityType.class)
    public JAXBElement<MonetaryValueType> createOpportunityTypeReturnValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OpportunityTypeReturnValue_QNAME, MonetaryValueType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ClosedValue", scope = OpportunityType.class)
    public JAXBElement<MonetaryValueType> createOpportunityTypeClosedValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OpportunityTypeClosedValue_QNAME, MonetaryValueType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Name", scope = OpportunityType.class)
    public JAXBElement<String> createOpportunityTypeName(String value) {
        return new JAXBElement<String>(_OpportunityTypeName_QNAME, String.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PrimaryContact", scope = OpportunityType.class)
    public JAXBElement<OpportunityContactType> createOpportunityTypePrimaryContact(OpportunityContactType value) {
        return new JAXBElement<OpportunityContactType>(_OpportunityTypePrimaryContact_QNAME, OpportunityContactType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Campaign", scope = OpportunityType.class)
    public JAXBElement<NamedID> createOpportunityTypeCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_Campaign_QNAME, NamedID.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OtherContacts", scope = OpportunityType.class)
    public JAXBElement<OpportunityContactListType> createOpportunityTypeOtherContacts(OpportunityContactListType value) {
        return new JAXBElement<OpportunityContactListType>(_IncidentTypeOtherContacts_QNAME, OpportunityContactListType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Survey", scope = OpportunityType.class)
    public JAXBElement<NamedID> createOpportunityTypeSurvey(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityTypeSurvey_QNAME, NamedID.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = OpportunityType.class)
    public JAXBElement<OpportunityNullFields> createOpportunityTypeValidNullFields(OpportunityNullFields value) {
        return new JAXBElement<OpportunityNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, OpportunityNullFields.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CostOfSale", scope = OpportunityType.class)
    public JAXBElement<MonetaryValueType> createOpportunityTypeCostOfSale(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OpportunityTypeCostOfSale_QNAME, MonetaryValueType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Summary", scope = OpportunityType.class)
    public JAXBElement<String> createOpportunityTypeSummary(String value) {
        return new JAXBElement<String>(_OpportunityTypeSummary_QNAME, String.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "WinLossDescription", scope = OpportunityType.class)
    public JAXBElement<String> createOpportunityTypeWinLossDescription(String value) {
        return new JAXBElement<String>(_OpportunityTypeWinLossDescription_QNAME, String.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Territory", scope = OpportunityType.class)
    public JAXBElement<NamedIDHierarchy> createOpportunityTypeTerritory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountSalesSettingsTypeTerritory_QNAME, NamedIDHierarchy.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Banner", scope = OpportunityType.class)
    public JAXBElement<BannerType> createOpportunityTypeBanner(BannerType value) {
        return new JAXBElement<BannerType>(_Banner_QNAME, BannerType.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LeadRejectDescription", scope = OpportunityType.class)
    public JAXBElement<String> createOpportunityTypeLeadRejectDescription(String value) {
        return new JAXBElement<String>(_OpportunityTypeLeadRejectDescription_QNAME, String.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TerritoryHierarchy", scope = OpportunityType.class)
    public JAXBElement<NamedIDList> createOpportunityTypeTerritoryHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_SalesTerritoryTypeTerritoryHierarchy_QNAME, NamedIDList.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RecallTime", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeRecallTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityTypeRecallTime_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ForecastCloseDate", scope = OpportunityType.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityTypeForecastCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityTypeForecastCloseDate_QNAME, XMLGregorianCalendar.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssignedToAccount", scope = OpportunityType.class)
    public JAXBElement<NamedIDHierarchy> createOpportunityTypeAssignedToAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_OpportunityTypeAssignedToAccount_QNAME, NamedIDHierarchy.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LeadRejectReason", scope = OpportunityType.class)
    public JAXBElement<NamedID> createOpportunityTypeLeadRejectReason(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityTypeLeadRejectReason_QNAME, NamedID.class, OpportunityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Campaign", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_Campaign_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FinalizedByAccount", scope = PurchasedProductType.class)
    public JAXBElement<NamedIDHierarchy> createPurchasedProductTypeFinalizedByAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_PurchasedProductTypeFinalizedByAccount_QNAME, NamedIDHierarchy.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PurchaseTime", scope = PurchasedProductType.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductTypePurchaseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductTypePurchaseTime_QNAME, XMLGregorianCalendar.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Opportunity", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeOpportunity(NamedID value) {
        return new JAXBElement<NamedID>(_Opportunity_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchasedProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = PurchasedProductType.class)
    public JAXBElement<PurchasedProductNullFields> createPurchasedProductTypeValidNullFields(PurchasedProductNullFields value) {
        return new JAXBElement<PurchasedProductNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, PurchasedProductNullFields.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LicenseEndTime", scope = PurchasedProductType.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductTypeLicenseEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductTypeLicenseEndTime_QNAME, XMLGregorianCalendar.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Price", scope = PurchasedProductType.class)
    public JAXBElement<MonetaryValueType> createPurchasedProductTypePrice(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_AssetTypePrice_QNAME, MonetaryValueType.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SerialNumber", scope = PurchasedProductType.class)
    public JAXBElement<String> createPurchasedProductTypeSerialNumber(String value) {
        return new JAXBElement<String>(_AssetTypeSerialNumber_QNAME, String.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LicenseStartTime", scope = PurchasedProductType.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductTypeLicenseStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductTypeLicenseStartTime_QNAME, XMLGregorianCalendar.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = PurchasedProductType.class)
    public JAXBElement<String> createPurchasedProductTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Mailing", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeMailing(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeMailing_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesProduct", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeSalesProduct(NamedID value) {
        return new JAXBElement<NamedID>(_SalesProduct_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Contact", scope = PurchasedProductType.class)
    public JAXBElement<NamedID> createPurchasedProductTypeContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, PurchasedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailMessageNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MailMessageType.class)
    public JAXBElement<MailMessageNullFields> createMailMessageTypeValidNullFields(MailMessageNullFields value) {
        return new JAXBElement<MailMessageNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MailMessageNullFields.class, MailMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = MailMessageType.class)
    public JAXBElement<FileAttachmentListType> createMailMessageTypeFileAttachments(FileAttachmentListType value) {
        return new JAXBElement<FileAttachmentListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentListType.class, MailMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Addresses", scope = OrganizationType.class)
    public JAXBElement<TypedAddressListType> createOrganizationTypeAddresses(TypedAddressListType value) {
        return new JAXBElement<TypedAddressListType>(_OrganizationTypeAddresses_QNAME, TypedAddressListType.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Industry", scope = OrganizationType.class)
    public JAXBElement<NamedID> createOrganizationTypeIndustry(NamedID value) {
        return new JAXBElement<NamedID>(_OrganizationTypeIndustry_QNAME, NamedID.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NewPassword", scope = OrganizationType.class)
    public JAXBElement<String> createOrganizationTypeNewPassword(String value) {
        return new JAXBElement<String>(_ContactTypeNewPassword_QNAME, String.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Banner", scope = OrganizationType.class)
    public JAXBElement<BannerType> createOrganizationTypeBanner(BannerType value) {
        return new JAXBElement<BannerType>(_Banner_QNAME, BannerType.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NameFurigana", scope = OrganizationType.class)
    public JAXBElement<String> createOrganizationTypeNameFurigana(String value) {
        return new JAXBElement<String>(_OrganizationTypeNameFurigana_QNAME, String.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = OrganizationType.class)
    public JAXBElement<OrganizationNullFields> createOrganizationTypeValidNullFields(OrganizationNullFields value) {
        return new JAXBElement<OrganizationNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, OrganizationNullFields.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = OrganizationType.class)
    public JAXBElement<FileAttachmentCommonListType> createOrganizationTypeFileAttachments(FileAttachmentCommonListType value) {
        return new JAXBElement<FileAttachmentCommonListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentCommonListType.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Parent", scope = OrganizationType.class)
    public JAXBElement<NamedIDHierarchy> createOrganizationTypeParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceCategoryTypeParent_QNAME, NamedIDHierarchy.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExternalReference", scope = OrganizationType.class)
    public JAXBElement<String> createOrganizationTypeExternalReference(String value) {
        return new JAXBElement<String>(_ContactTypeExternalReference_QNAME, String.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Login", scope = OrganizationType.class)
    public JAXBElement<String> createOrganizationTypeLogin(String value) {
        return new JAXBElement<String>(_ContactTypeLogin_QNAME, String.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NumberOfEmployees", scope = OrganizationType.class)
    public JAXBElement<Integer> createOrganizationTypeNumberOfEmployees(Integer value) {
        return new JAXBElement<Integer>(_OrganizationTypeNumberOfEmployees_QNAME, Integer.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Notes", scope = OrganizationType.class)
    public JAXBElement<NoteListType> createOrganizationTypeNotes(NoteListType value) {
        return new JAXBElement<NoteListType>(_ContactTypeNotes_QNAME, NoteListType.class, OrganizationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = VariableType.class)
    public JAXBElement<VariableNullFields> createVariableTypeValidNullFields(VariableNullFields value) {
        return new JAXBElement<VariableNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, VariableNullFields.class, VariableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "InterfaceValues", scope = VariableType.class)
    public JAXBElement<InterfaceValueListType> createVariableTypeInterfaceValues(InterfaceValueListType value) {
        return new JAXBElement<InterfaceValueListType>(_VariableTypeInterfaceValues_QNAME, InterfaceValueListType.class, VariableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Folder", scope = VariableType.class)
    public JAXBElement<NamedIDHierarchy> createVariableTypeFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_VariableTypeFolder_QNAME, NamedIDHierarchy.class, VariableType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StateOrProvince", scope = AddressType.class)
    public JAXBElement<NamedID> createAddressTypeStateOrProvince(NamedID value) {
        return new JAXBElement<NamedID>(_AddressTypeStateOrProvince_QNAME, NamedID.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AddressType.class)
    public JAXBElement<AddressNullFields> createAddressTypeValidNullFields(AddressNullFields value) {
        return new JAXBElement<AddressNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AddressNullFields.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "City", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCity(String value) {
        return new JAXBElement<String>(_AddressTypeCity_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Country", scope = AddressType.class)
    public JAXBElement<NamedID> createAddressTypeCountry(NamedID value) {
        return new JAXBElement<NamedID>(_Country_QNAME, NamedID.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PostalCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypePostalCode(String value) {
        return new JAXBElement<String>(_AddressTypePostalCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Street", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeStreet(String value) {
        return new JAXBElement<String>(_AddressTypeStreet_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ContentValues", scope = StandardContentType.class)
    public JAXBElement<StandardContentContentValueListType> createStandardContentTypeContentValues(StandardContentContentValueListType value) {
        return new JAXBElement<StandardContentContentValueListType>(_StandardContentTypeContentValues_QNAME, StandardContentContentValueListType.class, StandardContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = StandardContentType.class)
    public JAXBElement<StandardContentNullFields> createStandardContentTypeValidNullFields(StandardContentNullFields value) {
        return new JAXBElement<StandardContentNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, StandardContentNullFields.class, StandardContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = StandardContentType.class)
    public JAXBElement<NamedIDDeltaList> createStandardContentTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, StandardContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Folder", scope = StandardContentType.class)
    public JAXBElement<NamedIDHierarchy> createStandardContentTypeFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_VariableTypeFolder_QNAME, NamedIDHierarchy.class, StandardContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "HotKey", scope = StandardContentType.class)
    public JAXBElement<String> createStandardContentTypeHotKey(String value) {
        return new JAXBElement<String>(_StandardContentTypeHotKey_QNAME, String.class, StandardContentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SSOTokenReferenceAttributesNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = SSOTokenReferenceAttributesType.class)
    public JAXBElement<SSOTokenReferenceAttributesNullFields> createSSOTokenReferenceAttributesTypeValidNullFields(SSOTokenReferenceAttributesNullFields value) {
        return new JAXBElement<SSOTokenReferenceAttributesNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, SSOTokenReferenceAttributesNullFields.class, SSOTokenReferenceAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Revoked", scope = SSOTokenReferenceAttributesType.class)
    public JAXBElement<Boolean> createSSOTokenReferenceAttributesTypeRevoked(Boolean value) {
        return new JAXBElement<Boolean>(_SSOTokenReferenceAttributesTypeRevoked_QNAME, Boolean.class, SSOTokenReferenceAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Used", scope = SSOTokenReferenceAttributesType.class)
    public JAXBElement<Boolean> createSSOTokenReferenceAttributesTypeUsed(Boolean value) {
        return new JAXBElement<Boolean>(_SSOTokenReferenceAttributesTypeUsed_QNAME, Boolean.class, SSOTokenReferenceAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Certificate", scope = EmailType.class)
    public JAXBElement<String> createEmailTypeCertificate(String value) {
        return new JAXBElement<String>(_EmailTypeCertificate_QNAME, String.class, EmailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExpiresDate", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypeExpiresDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypeExpiresDate_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AnswerType.class)
    public JAXBElement<AnswerNullFields> createAnswerTypeValidNullFields(AnswerNullFields value) {
        return new JAXBElement<AnswerNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AnswerNullFields.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssignedSibling", scope = AnswerType.class)
    public JAXBElement<NamedID> createAnswerTypeAssignedSibling(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerTypeAssignedSibling_QNAME, NamedID.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "GuidedAssistance", scope = AnswerType.class)
    public JAXBElement<NamedID> createAnswerTypeGuidedAssistance(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerTypeGuidedAssistance_QNAME, NamedID.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CommonAttachments", scope = AnswerType.class)
    public JAXBElement<FileAttachmentSharedListType> createAnswerTypeCommonAttachments(FileAttachmentSharedListType value) {
        return new JAXBElement<FileAttachmentSharedListType>(_AnswerTypeCommonAttachments_QNAME, FileAttachmentSharedListType.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PublishOnDate", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypePublishOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypePublishOnDate_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Question", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeQuestion(String value) {
        return new JAXBElement<String>(_AnswerTypeQuestion_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NextNotificationTime", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypeNextNotificationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypeNextNotificationTime_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Notes", scope = AnswerType.class)
    public JAXBElement<NoteListType> createAnswerTypeNotes(NoteListType value) {
        return new JAXBElement<NoteListType>(_ContactTypeNotes_QNAME, NoteListType.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Solution", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeSolution(String value) {
        return new JAXBElement<String>(_AnswerTypeSolution_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Keywords", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeKeywords(String value) {
        return new JAXBElement<String>(_AnswerTypeKeywords_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OriginalReferenceNumber", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeOriginalReferenceNumber(String value) {
        return new JAXBElement<String>(_AnswerTypeOriginalReferenceNumber_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Products", scope = AnswerType.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerTypeProducts(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerTypeProducts_QNAME, NamedIDHierarchyList.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerRelatedAnswerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "RelatedAnswers", scope = AnswerType.class)
    public JAXBElement<AnswerRelatedAnswerListType> createAnswerTypeRelatedAnswers(AnswerRelatedAnswerListType value) {
        return new JAXBElement<AnswerRelatedAnswerListType>(_AnswerTypeRelatedAnswers_QNAME, AnswerRelatedAnswerListType.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LastNotificationTime", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypeLastNotificationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypeLastNotificationTime_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Banner", scope = AnswerType.class)
    public JAXBElement<BannerType> createAnswerTypeBanner(BannerType value) {
        return new JAXBElement<BannerType>(_Banner_QNAME, BannerType.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedByAccount", scope = AnswerType.class)
    public JAXBElement<NamedID> createAnswerTypeUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerTypeUpdatedByAccount_QNAME, NamedID.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Categories", scope = AnswerType.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerTypeCategories(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerTypeCategories_QNAME, NamedIDHierarchyList.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = AnswerType.class)
    public JAXBElement<FileAttachmentAnswerListType> createAnswerTypeFileAttachments(FileAttachmentAnswerListType value) {
        return new JAXBElement<FileAttachmentAnswerListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentAnswerListType.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SiblingAnswers", scope = AnswerType.class)
    public JAXBElement<NamedIDList> createAnswerTypeSiblingAnswers(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_AnswerTypeSiblingAnswers_QNAME, NamedIDList.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminLastAccessTime", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypeAdminLastAccessTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypeAdminLastAccessTime_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AccessLevels", scope = AnswerType.class)
    public JAXBElement<NamedIDDeltaList> createAnswerTypeAccessLevels(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_AnswerTypeAccessLevels_QNAME, NamedIDDeltaList.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "URL", scope = AnswerType.class)
    public JAXBElement<String> createAnswerTypeURL(String value) {
        return new JAXBElement<String>(_AnswerTypeURL_QNAME, String.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LastAccessTime", scope = AnswerType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerTypeLastAccessTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerTypeLastAccessTime_QNAME, XMLGregorianCalendar.class, AnswerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AnswerNotificationType.class)
    public JAXBElement<AnswerNotificationNullFields> createAnswerNotificationTypeValidNullFields(AnswerNotificationNullFields value) {
        return new JAXBElement<AnswerNotificationNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AnswerNotificationNullFields.class, AnswerNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StartTime", scope = AnswerNotificationType.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerNotificationTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerNotificationTypeStartTime_QNAME, XMLGregorianCalendar.class, AnswerNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Interface", scope = AnswerNotificationType.class)
    public JAXBElement<NamedID> createAnswerNotificationTypeInterface(NamedID value) {
        return new JAXBElement<NamedID>(_ProductNotificationTypeInterface_QNAME, NamedID.class, AnswerNotificationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "NewPassword", scope = AccountType.class)
    public JAXBElement<String> createAccountTypeNewPassword(String value) {
        return new JAXBElement<String>(_ContactTypeNewPassword_QNAME, String.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Signature", scope = AccountType.class)
    public JAXBElement<String> createAccountTypeSignature(String value) {
        return new JAXBElement<String>(_AccountTypeSignature_QNAME, String.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = AccountType.class)
    public JAXBElement<AccountNullFields> createAccountTypeValidNullFields(AccountNullFields value) {
        return new JAXBElement<AccountNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, AccountNullFields.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Phones", scope = AccountType.class)
    public JAXBElement<PhoneListType> createAccountTypePhones(PhoneListType value) {
        return new JAXBElement<PhoneListType>(_ContactTypePhones_QNAME, PhoneListType.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Emails", scope = AccountType.class)
    public JAXBElement<EmailListType> createAccountTypeEmails(EmailListType value) {
        return new JAXBElement<EmailListType>(_ContactTypeEmails_QNAME, EmailListType.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "DisplayName", scope = AccountType.class)
    public JAXBElement<String> createAccountTypeDisplayName(String value) {
        return new JAXBElement<String>(_AccountTypeDisplayName_QNAME, String.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PasswordExpirationTime", scope = AccountType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountTypePasswordExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactTypePasswordExpirationTime_QNAME, XMLGregorianCalendar.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Profile", scope = AccountType.class)
    public JAXBElement<NamedID> createAccountTypeProfile(NamedID value) {
        return new JAXBElement<NamedID>(_AccountTypeProfile_QNAME, NamedID.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EmailNotification", scope = AccountType.class)
    public JAXBElement<NamedID> createAccountTypeEmailNotification(NamedID value) {
        return new JAXBElement<NamedID>(_AccountTypeEmailNotification_QNAME, NamedID.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Manager", scope = AccountType.class)
    public JAXBElement<NamedIDHierarchy> createAccountTypeManager(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountTypeManager_QNAME, NamedIDHierarchy.class, AccountType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Descriptions", scope = ServiceProductType.class)
    public JAXBElement<LabelListType> createServiceProductTypeDescriptions(LabelListType value) {
        return new JAXBElement<LabelListType>(_ServiceCategoryTypeDescriptions_QNAME, LabelListType.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "EndUserVisibleInterfaces", scope = ServiceProductType.class)
    public JAXBElement<NamedIDDeltaList> createServiceProductTypeEndUserVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeEndUserVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ServiceProductType.class)
    public JAXBElement<ServiceProductNullFields> createServiceProductTypeValidNullFields(ServiceProductNullFields value) {
        return new JAXBElement<ServiceProductNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ServiceProductNullFields.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Parent", scope = ServiceProductType.class)
    public JAXBElement<NamedIDHierarchy> createServiceProductTypeParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceCategoryTypeParent_QNAME, NamedIDHierarchy.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = ServiceProductType.class)
    public JAXBElement<NamedIDDeltaList> createServiceProductTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CategoryLinks", scope = ServiceProductType.class)
    public JAXBElement<ServiceCategoryListType> createServiceProductTypeCategoryLinks(ServiceCategoryListType value) {
        return new JAXBElement<ServiceCategoryListType>(_ServiceProductTypeCategoryLinks_QNAME, ServiceCategoryListType.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "DispositionLinks", scope = ServiceProductType.class)
    public JAXBElement<ServiceDispositionListType> createServiceProductTypeDispositionLinks(ServiceDispositionListType value) {
        return new JAXBElement<ServiceDispositionListType>(_ServiceProductTypeDispositionLinks_QNAME, ServiceDispositionListType.class, ServiceProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Value", scope = MessageBaseType.class)
    public JAXBElement<String> createMessageBaseTypeValue(String value) {
        return new JAXBElement<String>(_ConfigurationTypeValue_QNAME, String.class, MessageBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Type", scope = MailboxType.class)
    public JAXBElement<NamedID> createMailboxTypeType(NamedID value) {
        return new JAXBElement<NamedID>(_MailboxTypeType_QNAME, NamedID.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IsDefault", scope = MailboxType.class)
    public JAXBElement<Boolean> createMailboxTypeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MailboxTypeIsDefault_QNAME, Boolean.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IncomingEmailSettings", scope = MailboxType.class)
    public JAXBElement<MailboxIncomingEmailSettingsType> createMailboxTypeIncomingEmailSettings(MailboxIncomingEmailSettingsType value) {
        return new JAXBElement<MailboxIncomingEmailSettingsType>(_MailboxTypeIncomingEmailSettings_QNAME, MailboxIncomingEmailSettingsType.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MailboxType.class)
    public JAXBElement<MailboxNullFields> createMailboxTypeValidNullFields(MailboxNullFields value) {
        return new JAXBElement<MailboxNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MailboxNullFields.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OutgoingEmailSettings", scope = MailboxType.class)
    public JAXBElement<MailboxOutgoingEmailSettingsType> createMailboxTypeOutgoingEmailSettings(MailboxOutgoingEmailSettingsType value) {
        return new JAXBElement<MailboxOutgoingEmailSettingsType>(_MailboxTypeOutgoingEmailSettings_QNAME, MailboxOutgoingEmailSettingsType.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Interface", scope = MailboxType.class)
    public JAXBElement<NamedID> createMailboxTypeInterface(NamedID value) {
        return new JAXBElement<NamedID>(_ProductNotificationTypeInterface_QNAME, NamedID.class, MailboxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Descriptions", scope = SalesProductType.class)
    public JAXBElement<LabelListType> createSalesProductTypeDescriptions(LabelListType value) {
        return new JAXBElement<LabelListType>(_ServiceCategoryTypeDescriptions_QNAME, LabelListType.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Schedules", scope = SalesProductType.class)
    public JAXBElement<SalesProductScheduleListType> createSalesProductTypeSchedules(SalesProductScheduleListType value) {
        return new JAXBElement<SalesProductScheduleListType>(_SalesProductTypeSchedules_QNAME, SalesProductScheduleListType.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = SalesProductType.class)
    public JAXBElement<SalesProductNullFields> createSalesProductTypeValidNullFields(SalesProductNullFields value) {
        return new JAXBElement<SalesProductNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, SalesProductNullFields.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = SalesProductType.class)
    public JAXBElement<NamedIDDeltaList> createSalesProductTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PartNumber", scope = SalesProductType.class)
    public JAXBElement<String> createSalesProductTypePartNumber(String value) {
        return new JAXBElement<String>(_SalesProductTypePartNumber_QNAME, String.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ServiceProduct", scope = SalesProductType.class)
    public JAXBElement<NamedIDHierarchy> createSalesProductTypeServiceProduct(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceProduct_QNAME, NamedIDHierarchy.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Folder", scope = SalesProductType.class)
    public JAXBElement<NamedIDHierarchy> createSalesProductTypeFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_VariableTypeFolder_QNAME, NamedIDHierarchy.class, SalesProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxIncomingEmailSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MailboxIncomingEmailSettingsType.class)
    public JAXBElement<MailboxIncomingEmailSettingsNullFields> createMailboxIncomingEmailSettingsTypeValidNullFields(MailboxIncomingEmailSettingsNullFields value) {
        return new JAXBElement<MailboxIncomingEmailSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MailboxIncomingEmailSettingsNullFields.class, MailboxIncomingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IsEnabled", scope = MailboxIncomingEmailSettingsType.class)
    public JAXBElement<Boolean> createMailboxIncomingEmailSettingsTypeIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_MailboxIncomingEmailSettingsTypeIsEnabled_QNAME, Boolean.class, MailboxIncomingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ForceReplyBetweenLines", scope = MailboxIncomingEmailSettingsType.class)
    public JAXBElement<Boolean> createMailboxIncomingEmailSettingsTypeForceReplyBetweenLines(Boolean value) {
        return new JAXBElement<Boolean>(_MailboxIncomingEmailSettingsTypeForceReplyBetweenLines_QNAME, Boolean.class, MailboxIncomingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ForwardRejectMessageAddress", scope = MailboxIncomingEmailSettingsType.class)
    public JAXBElement<String> createMailboxIncomingEmailSettingsTypeForwardRejectMessageAddress(String value) {
        return new JAXBElement<String>(_MailboxIncomingEmailSettingsTypeForwardRejectMessageAddress_QNAME, String.class, MailboxIncomingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StageWithStrategyNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = StageWithStrategyType.class)
    public JAXBElement<StageWithStrategyNullFields> createStageWithStrategyTypeValidNullFields(StageWithStrategyNullFields value) {
        return new JAXBElement<StageWithStrategyNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, StageWithStrategyNullFields.class, StageWithStrategyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Stage", scope = StageWithStrategyType.class)
    public JAXBElement<NamedID> createStageWithStrategyTypeStage(NamedID value) {
        return new JAXBElement<NamedID>(_StageWithStrategyTypeStage_QNAME, NamedID.class, StageWithStrategyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Strategy", scope = StageWithStrategyType.class)
    public JAXBElement<NamedID> createStageWithStrategyTypeStrategy(NamedID value) {
        return new JAXBElement<NamedID>(_StageWithStrategyTypeStrategy_QNAME, NamedID.class, StageWithStrategyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ChannelUsernameType.class)
    public JAXBElement<ChannelUsernameNullFields> createChannelUsernameTypeValidNullFields(ChannelUsernameNullFields value) {
        return new JAXBElement<ChannelUsernameNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ChannelUsernameNullFields.class, ChannelUsernameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Username", scope = ChannelUsernameType.class)
    public JAXBElement<String> createChannelUsernameTypeUsername(String value) {
        return new JAXBElement<String>(_ChannelUsernameTypeUsername_QNAME, String.class, ChannelUsernameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UserNumber", scope = ChannelUsernameType.class)
    public JAXBElement<String> createChannelUsernameTypeUserNumber(String value) {
        return new JAXBElement<String>(_ChannelUsernameTypeUserNumber_QNAME, String.class, ChannelUsernameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SentTime", scope = QuoteType.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteTypeSentTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteTypeSentTime_QNAME, XMLGregorianCalendar.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OfferStartTime", scope = QuoteType.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteTypeOfferStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteTypeOfferStartTime_QNAME, XMLGregorianCalendar.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Total", scope = QuoteType.class)
    public JAXBElement<MonetaryValueType> createQuoteTypeTotal(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_QuoteTypeTotal_QNAME, MonetaryValueType.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdjustedTotal", scope = QuoteType.class)
    public JAXBElement<MonetaryValueType> createQuoteTypeAdjustedTotal(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_QuoteLineItemTypeAdjustedTotal_QNAME, MonetaryValueType.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SentTo", scope = QuoteType.class)
    public JAXBElement<String> createQuoteTypeSentTo(String value) {
        return new JAXBElement<String>(_QuoteTypeSentTo_QNAME, String.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = QuoteType.class)
    public JAXBElement<QuoteNullFields> createQuoteTypeValidNullFields(QuoteNullFields value) {
        return new JAXBElement<QuoteNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, QuoteNullFields.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LineItems", scope = QuoteType.class)
    public JAXBElement<QuoteLineItemListType> createQuoteTypeLineItems(QuoteLineItemListType value) {
        return new JAXBElement<QuoteLineItemListType>(_QuoteTypeLineItems_QNAME, QuoteLineItemListType.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PriceSchedule", scope = QuoteType.class)
    public JAXBElement<NamedID> createQuoteTypePriceSchedule(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteTypePriceSchedule_QNAME, NamedID.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Comment", scope = QuoteType.class)
    public JAXBElement<String> createQuoteTypeComment(String value) {
        return new JAXBElement<String>(_SalesProductScheduleTypeComment_QNAME, String.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Status", scope = QuoteType.class)
    public JAXBElement<NamedID> createQuoteTypeStatus(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteTypeStatus_QNAME, NamedID.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = QuoteType.class)
    public JAXBElement<FileAttachmentListType> createQuoteTypeFileAttachments(FileAttachmentListType value) {
        return new JAXBElement<FileAttachmentListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentListType.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "OfferEndTime", scope = QuoteType.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteTypeOfferEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteTypeOfferEndTime_QNAME, XMLGregorianCalendar.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Template", scope = QuoteType.class)
    public JAXBElement<NamedID> createQuoteTypeTemplate(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteTypeTemplate_QNAME, NamedID.class, QuoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExpectedOpportunities", scope = CampaignType.class)
    public JAXBElement<Integer> createCampaignTypeExpectedOpportunities(Integer value) {
        return new JAXBElement<Integer>(_CampaignTypeExpectedOpportunities_QNAME, Integer.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = CampaignType.class)
    public JAXBElement<CampaignNullFields> createCampaignTypeValidNullFields(CampaignNullFields value) {
        return new JAXBElement<CampaignNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, CampaignNullFields.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ActualSales", scope = CampaignType.class)
    public JAXBElement<MonetaryValueType> createCampaignTypeActualSales(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_CampaignTypeActualSales_QNAME, MonetaryValueType.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CampaignStartTime", scope = CampaignType.class)
    public JAXBElement<XMLGregorianCalendar> createCampaignTypeCampaignStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CampaignTypeCampaignStartTime_QNAME, XMLGregorianCalendar.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Budget", scope = CampaignType.class)
    public JAXBElement<MonetaryValueType> createCampaignTypeBudget(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_CampaignTypeBudget_QNAME, MonetaryValueType.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ObjectivesSummary", scope = CampaignType.class)
    public JAXBElement<String> createCampaignTypeObjectivesSummary(String value) {
        return new JAXBElement<String>(_CampaignTypeObjectivesSummary_QNAME, String.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CreatedByAccount", scope = CampaignType.class)
    public JAXBElement<NamedID> createCampaignTypeCreatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeCreatedByAccount_QNAME, NamedID.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExpectedCost", scope = CampaignType.class)
    public JAXBElement<MonetaryValueType> createCampaignTypeExpectedCost(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_CampaignTypeExpectedCost_QNAME, MonetaryValueType.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ActualLeads", scope = CampaignType.class)
    public JAXBElement<Integer> createCampaignTypeActualLeads(Integer value) {
        return new JAXBElement<Integer>(_CampaignTypeActualLeads_QNAME, Integer.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ActualOpportunities", scope = CampaignType.class)
    public JAXBElement<Integer> createCampaignTypeActualOpportunities(Integer value) {
        return new JAXBElement<Integer>(_CampaignTypeActualOpportunities_QNAME, Integer.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExpectedSales", scope = CampaignType.class)
    public JAXBElement<MonetaryValueType> createCampaignTypeExpectedSales(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_CampaignTypeExpectedSales_QNAME, MonetaryValueType.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedByAccount", scope = CampaignType.class)
    public JAXBElement<NamedID> createCampaignTypeUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerTypeUpdatedByAccount_QNAME, NamedID.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExpectedLeads", scope = CampaignType.class)
    public JAXBElement<Integer> createCampaignTypeExpectedLeads(Integer value) {
        return new JAXBElement<Integer>(_CampaignTypeExpectedLeads_QNAME, Integer.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssignedToAccount", scope = CampaignType.class)
    public JAXBElement<NamedIDHierarchy> createCampaignTypeAssignedToAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_OpportunityTypeAssignedToAccount_QNAME, NamedIDHierarchy.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ActualCost", scope = CampaignType.class)
    public JAXBElement<MonetaryValueType> createCampaignTypeActualCost(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_CampaignTypeActualCost_QNAME, MonetaryValueType.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CampaignEndTime", scope = CampaignType.class)
    public JAXBElement<XMLGregorianCalendar> createCampaignTypeCampaignEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CampaignTypeCampaignEndTime_QNAME, XMLGregorianCalendar.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Folder", scope = CampaignType.class)
    public JAXBElement<NamedIDHierarchy> createCampaignTypeFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_VariableTypeFolder_QNAME, NamedIDHierarchy.class, CampaignType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TaskType", scope = TaskType.class)
    public JAXBElement<NamedID> createTaskTypeTaskType(NamedID value) {
        return new JAXBElement<NamedID>(_TaskTypeTaskType_QNAME, NamedID.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PercentComplete", scope = TaskType.class)
    public JAXBElement<Integer> createTaskTypePercentComplete(Integer value) {
        return new JAXBElement<Integer>(_TaskTypePercentComplete_QNAME, Integer.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = TaskType.class)
    public JAXBElement<TaskNullFields> createTaskTypeValidNullFields(TaskNullFields value) {
        return new JAXBElement<TaskNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, TaskNullFields.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Notes", scope = TaskType.class)
    public JAXBElement<NoteListType> createTaskTypeNotes(NoteListType value) {
        return new JAXBElement<NoteListType>(_ContactTypeNotes_QNAME, NoteListType.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Organization", scope = TaskType.class)
    public JAXBElement<NamedID> createTaskTypeOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "PlannedCompletionTime", scope = TaskType.class)
    public JAXBElement<XMLGregorianCalendar> createTaskTypePlannedCompletionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskTypePlannedCompletionTime_QNAME, XMLGregorianCalendar.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Priority", scope = TaskType.class)
    public JAXBElement<NamedID> createTaskTypePriority(NamedID value) {
        return new JAXBElement<NamedID>(_TaskTypePriority_QNAME, NamedID.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "CompletedTime", scope = TaskType.class)
    public JAXBElement<XMLGregorianCalendar> createTaskTypeCompletedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskTypeCompletedTime_QNAME, XMLGregorianCalendar.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FileAttachments", scope = TaskType.class)
    public JAXBElement<FileAttachmentCommonListType> createTaskTypeFileAttachments(FileAttachmentCommonListType value) {
        return new JAXBElement<FileAttachmentCommonListType>(_IncidentTypeFileAttachments_QNAME, FileAttachmentCommonListType.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "DueTime", scope = TaskType.class)
    public JAXBElement<XMLGregorianCalendar> createTaskTypeDueTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskTypeDueTime_QNAME, XMLGregorianCalendar.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "StartTime", scope = TaskType.class)
    public JAXBElement<XMLGregorianCalendar> createTaskTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerNotificationTypeStartTime_QNAME, XMLGregorianCalendar.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Contact", scope = TaskType.class)
    public JAXBElement<NamedID> createTaskTypeContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AssignedToAccount", scope = TaskType.class)
    public JAXBElement<NamedIDHierarchy> createTaskTypeAssignedToAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_OpportunityTypeAssignedToAccount_QNAME, NamedIDHierarchy.class, TaskType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ExchangeRate", scope = MonetaryValueType.class)
    public JAXBElement<NamedID> createMonetaryValueTypeExchangeRate(NamedID value) {
        return new JAXBElement<NamedID>(_MonetaryValueTypeExchangeRate_QNAME, NamedID.class, MonetaryValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MonetaryValueType.class)
    public JAXBElement<MonetaryValueNullFields> createMonetaryValueTypeValidNullFields(MonetaryValueNullFields value) {
        return new JAXBElement<MonetaryValueNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MonetaryValueNullFields.class, MonetaryValueType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AcquiredDate", scope = OrganizationSalesSettingsType.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationSalesSettingsTypeAcquiredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactSalesSettingsTypeAcquiredDate_QNAME, XMLGregorianCalendar.class, OrganizationSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "TotalRevenue", scope = OrganizationSalesSettingsType.class)
    public JAXBElement<MonetaryValueType> createOrganizationSalesSettingsTypeTotalRevenue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_OrganizationSalesSettingsTypeTotalRevenue_QNAME, MonetaryValueType.class, OrganizationSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = OrganizationSalesSettingsType.class)
    public JAXBElement<OrganizationSalesSettingsNullFields> createOrganizationSalesSettingsTypeValidNullFields(OrganizationSalesSettingsNullFields value) {
        return new JAXBElement<OrganizationSalesSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, OrganizationSalesSettingsNullFields.class, OrganizationSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "SalesAccount", scope = OrganizationSalesSettingsType.class)
    public JAXBElement<NamedIDHierarchy> createOrganizationSalesSettingsTypeSalesAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ContactSalesSettingsTypeSalesAccount_QNAME, NamedIDHierarchy.class, OrganizationSalesSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = LabelType.class)
    public JAXBElement<LabelNullFields> createLabelTypeValidNullFields(LabelNullFields value) {
        return new JAXBElement<LabelNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, LabelNullFields.class, LabelType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "LabelText", scope = LabelType.class)
    public JAXBElement<String> createLabelTypeLabelText(String value) {
        return new JAXBElement<String>(_LabelTypeLabelText_QNAME, String.class, LabelType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Answer", scope = TaskServiceSettingsType.class)
    public JAXBElement<NamedID> createTaskServiceSettingsTypeAnswer(NamedID value) {
        return new JAXBElement<NamedID>(_Answer_QNAME, NamedID.class, TaskServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = TaskServiceSettingsType.class)
    public JAXBElement<TaskServiceSettingsNullFields> createTaskServiceSettingsTypeValidNullFields(TaskServiceSettingsNullFields value) {
        return new JAXBElement<TaskServiceSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, TaskServiceSettingsNullFields.class, TaskServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Incident", scope = TaskServiceSettingsType.class)
    public JAXBElement<NamedID> createTaskServiceSettingsTypeIncident(NamedID value) {
        return new JAXBElement<NamedID>(_Incident_QNAME, NamedID.class, TaskServiceSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolidayNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = HolidayType.class)
    public JAXBElement<HolidayNullFields> createHolidayTypeValidNullFields(HolidayNullFields value) {
        return new JAXBElement<HolidayNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, HolidayNullFields.class, HolidayType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = HolidayType.class)
    public JAXBElement<NamedIDDeltaList> createHolidayTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, HolidayType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "UpdatedTime", scope = FileAttachmentType.class)
    public JAXBElement<XMLGregorianCalendar> createFileAttachmentTypeUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BannerTypeUpdatedTime_QNAME, XMLGregorianCalendar.class, FileAttachmentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FromAddress", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<String> createMailboxOutgoingEmailSettingsTypeFromAddress(String value) {
        return new JAXBElement<String>(_MailboxOutgoingEmailSettingsTypeFromAddress_QNAME, String.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ReplyToAddress", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<String> createMailboxOutgoingEmailSettingsTypeReplyToAddress(String value) {
        return new JAXBElement<String>(_MailboxOutgoingEmailSettingsTypeReplyToAddress_QNAME, String.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "FriendlyFromAddress", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<String> createMailboxOutgoingEmailSettingsTypeFriendlyFromAddress(String value) {
        return new JAXBElement<String>(_MailboxOutgoingEmailSettingsTypeFriendlyFromAddress_QNAME, String.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxOutgoingEmailSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<MailboxOutgoingEmailSettingsNullFields> createMailboxOutgoingEmailSettingsTypeValidNullFields(MailboxOutgoingEmailSettingsNullFields value) {
        return new JAXBElement<MailboxOutgoingEmailSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, MailboxOutgoingEmailSettingsNullFields.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "IsEnabled", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<Boolean> createMailboxOutgoingEmailSettingsTypeIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_MailboxIncomingEmailSettingsTypeIsEnabled_QNAME, Boolean.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "DisplayName", scope = MailboxOutgoingEmailSettingsType.class)
    public JAXBElement<String> createMailboxOutgoingEmailSettingsTypeDisplayName(String value) {
        return new JAXBElement<String>(_AccountTypeDisplayName_QNAME, String.class, MailboxOutgoingEmailSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Descriptions", scope = ServiceDispositionType.class)
    public JAXBElement<LabelListType> createServiceDispositionTypeDescriptions(LabelListType value) {
        return new JAXBElement<LabelListType>(_ServiceCategoryTypeDescriptions_QNAME, LabelListType.class, ServiceDispositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = ServiceDispositionType.class)
    public JAXBElement<ServiceDispositionNullFields> createServiceDispositionTypeValidNullFields(ServiceDispositionNullFields value) {
        return new JAXBElement<ServiceDispositionNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, ServiceDispositionNullFields.class, ServiceDispositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Parent", scope = ServiceDispositionType.class)
    public JAXBElement<NamedIDHierarchy> createServiceDispositionTypeParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceCategoryTypeParent_QNAME, NamedIDHierarchy.class, ServiceDispositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "AdminVisibleInterfaces", scope = ServiceDispositionType.class)
    public JAXBElement<NamedIDDeltaList> createServiceDispositionTypeAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceCategoryTypeAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceDispositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ProductLinks", scope = ServiceDispositionType.class)
    public JAXBElement<ServiceProductListType> createServiceDispositionTypeProductLinks(ServiceProductListType value) {
        return new JAXBElement<ServiceProductListType>(_ServiceCategoryTypeProductLinks_QNAME, ServiceProductListType.class, ServiceDispositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Campaign", scope = TaskMarketingSettingsType.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsTypeCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_Campaign_QNAME, NamedID.class, TaskMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Survey", scope = TaskMarketingSettingsType.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsTypeSurvey(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityTypeSurvey_QNAME, NamedID.class, TaskMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMarketingSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "ValidNullFields", scope = TaskMarketingSettingsType.class)
    public JAXBElement<TaskMarketingSettingsNullFields> createTaskMarketingSettingsTypeValidNullFields(TaskMarketingSettingsNullFields value) {
        return new JAXBElement<TaskMarketingSettingsNullFields>(_ContactMarketingSettingsTypeValidNullFields_QNAME, TaskMarketingSettingsNullFields.class, TaskMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Mailing", scope = TaskMarketingSettingsType.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsTypeMailing(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentTypeMailing_QNAME, NamedID.class, TaskMarketingSettingsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_3", name = "Document", scope = TaskMarketingSettingsType.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsTypeDocument(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsTypeDocument_QNAME, NamedID.class, TaskMarketingSettingsType.class, value);
    }

}
