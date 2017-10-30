
package com.oracle.datago.model.rightnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.datago.model.rightnow package. 
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

    private final static QName _ContentList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentList");
    private final static QName _ServiceCategoryContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ServiceCategoryContentFilter");
    private final static QName _GetSmartAssistantSuggestionsExtendedResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestionsExtendedResponse");
    private final static QName _KnowledgeStandardContentContentValueList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KnowledgeStandardContentContentValueList");
    private final static QName _FileAttachmentAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentAnswerList");
    private final static QName _SearchGroupedContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchGroupedContentResponse");
    private final static QName _GetPopularContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetPopularContent");
    private final static QName _RateContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RateContentResponse");
    private final static QName _SocialQuestionContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialQuestionContent");
    private final static QName _SearchResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SearchResponse");
    private final static QName _SocialQuestionContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SocialQuestionContentNullFields");
    private final static QName _StartInteractionResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "StartInteractionResponse");
    private final static QName _SmartAssistantSuggestionsResponseNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SmartAssistantSuggestionsResponseNullFields");
    private final static QName _ContentGroupedSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentGroupedSearch");
    private final static QName _Content_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Content");
    private final static QName _AnswerContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "AnswerContentNullFields");
    private final static QName _SearchGroupedContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchGroupedContent");
    private final static QName _RegisterSmartAssistantResolution_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RegisterSmartAssistantResolution");
    private final static QName _FileAttachmentCommon_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentCommon");
    private final static QName _ContentListResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentListResponse");
    private final static QName _DomainContentFilterList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "DomainContentFilterList");
    private final static QName _NamedIDHierarchy_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDHierarchy");
    private final static QName _SocialQuestionCommentContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SocialQuestionCommentContentNullFields");
    private final static QName _RateContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RateContent");
    private final static QName _Knowledge_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Knowledge");
    private final static QName _GetSmartAssistantSuggestions_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestions");
    private final static QName _ContentSearchNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentSearchNullFields");
    private final static QName _StartInteraction_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "StartInteraction");
    private final static QName _GetRecommendedContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetRecommendedContent");
    private final static QName _GetContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetContentResponse");
    private final static QName _GroupedContentSummaryList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GroupedContentSummaryList");
    private final static QName _GroupedContentSummary_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GroupedContentSummary");
    private final static QName _StandardContentContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "StandardContentContent");
    private final static QName _SocialUserSummary_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialUserSummary");
    private final static QName _GetValuesForNamedIDResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetValuesForNamedIDResponse");
    private final static QName _SocialQuestionCommentContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialQuestionCommentContent");
    private final static QName _StandardContentContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "StandardContentContentNullFields");
    private final static QName _ContentRate_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentRate");
    private final static QName _StatusWithType_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "StatusWithType");
    private final static QName _SocialQuestionCommentSummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialQuestionCommentSummaryContent");
    private final static QName _RequestErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1", "RequestErrorFault");
    private final static QName _NamedIDDeltaList_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDDeltaList");
    private final static QName _NamedIDDelta_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDDelta");
    private final static QName _AnswerSummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AnswerSummaryContent");
    private final static QName _BestSocialQuestionAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "BestSocialQuestionAnswerList");
    private final static QName _ContentRequestStatus_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentRequestStatus");
    private final static QName _ContentSecurityOptions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSecurityOptions");
    private final static QName _FileAttachmentAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentAnswer");
    private final static QName _SocialQuestionStatuses_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "SocialQuestionStatuses");
    private final static QName _BestSocialQuestionAnswerNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "BestSocialQuestionAnswerNullFields");
    private final static QName _DataValue_QNAME = new QName("urn:generic.ws.rightnow.com/v1", "DataValue");
    private final static QName _GetSmartAssistantSearchResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearchResponse");
    private final static QName _DomainContentFilterNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "DomainContentFilterNullFields");
    private final static QName _GroupedSearchResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GroupedSearchResponse");
    private final static QName _GetSmartAssistantSearchExtendedResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearchExtendedResponse");
    private final static QName _ContentSearchOrigin_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearchOrigin");
    private final static QName _SocialQuestionSummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialQuestionSummaryContent");
    private final static QName _ContentSearchConstraints_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearchConstraints");
    private final static QName _ServiceProductContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ServiceProductContentFilter");
    private final static QName _RNObjectType_QNAME = new QName("urn:generic.ws.rightnow.com/v1", "RNObjectType");
    private final static QName _SocialUserStatusesSummary_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SocialUserStatusesSummary");
    private final static QName _SmartAssistantSuggestionsResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantSuggestionsResponse");
    private final static QName _GetRecommendedContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetRecommendedContentResponse");
    private final static QName _SmartAssistantContentSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantContentSearch");
    private final static QName _GetSmartAssistantSearch_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearch");
    private final static QName _ContentSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearch");
    private final static QName _NamedIDHierarchyList_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDHierarchyList");
    private final static QName _ContentFilterList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentFilterList");
    private final static QName _IncidentContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "IncidentContent");
    private final static QName _GroupedSearchResponseNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "GroupedSearchResponseNullFields");
    private final static QName _GetContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetContent");
    private final static QName _GetValuesForNamedID_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetValuesForNamedID");
    private final static QName _RegisterSmartAssistantResolutionResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RegisterSmartAssistantResolutionResponse");
    private final static QName _SocialQuestionCommentStatuses_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "SocialQuestionCommentStatuses");
    private final static QName _DomainContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "DomainContentFilter");
    private final static QName _SmartAssistantResolution_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantResolution");
    private final static QName _SmartAssistantSuggestionsNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SmartAssistantSuggestionsNullFields");
    private final static QName _LabelRequiredList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "LabelRequiredList");
    private final static QName _SmartAssistantSearchNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SmartAssistantSearchNullFields");
    private final static QName _SocialUserSummaryNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SocialUserSummaryNullFields");
    private final static QName _AnswerContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AnswerContent");
    private final static QName _GetSmartAssistantSearchExtended_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearchExtended");
    private final static QName _GetSmartAssistantSuggestionsResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestionsResponse");
    private final static QName _FileAttachmentShared_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentShared");
    private final static QName _NamedIDList_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDList");
    private final static QName _ContentGroupedSearchNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentGroupedSearchNullFields");
    private final static QName _ContentListResponseNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentListResponseNullFields");
    private final static QName _KeyValueItem_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KeyValueItem");
    private final static QName _MarkContentAsViewedResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "MarkContentAsViewedResponse");
    private final static QName _GetSmartAssistantSuggestionsExtended_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestionsExtended");
    private final static QName _ContentSearchConstraintsList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearchConstraintsList");
    private final static QName _KeyValueItemList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KeyValueItemList");
    private final static QName _ContentViewOrigin_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentViewOrigin");
    private final static QName _LabelRequired_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "LabelRequired");
    private final static QName _ID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "ID");
    private final static QName _SummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContent");
    private final static QName _ContentSearchConstraintsNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentSearchConstraintsNullFields");
    private final static QName _KnowledgeStandardContentContentValueNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "KnowledgeStandardContentContentValueNullFields");
    private final static QName _SmartAssistantSuggestions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantSuggestions");
    private final static QName _MarkContentAsViewed_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "MarkContentAsViewed");
    private final static QName _ContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentFilter");
    private final static QName _FileAttachmentSharedList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentSharedList");
    private final static QName _NamedReadOnlyID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedReadOnlyID");
    private final static QName _FileAttachment_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachment");
    private final static QName _GetPopularContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetPopularContentResponse");
    private final static QName _GroupedContentSummaryNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "GroupedContentSummaryNullFields");
    private final static QName _GenericField_QNAME = new QName("urn:generic.ws.rightnow.com/v1", "GenericField");
    private final static QName _ContentSortOptions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSortOptions");
    private final static QName _GenericObject_QNAME = new QName("urn:generic.ws.rightnow.com/v1", "GenericObject");
    private final static QName _KnowledgeStandardContentContentValue_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KnowledgeStandardContentContentValue");
    private final static QName _SmartAssistantSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantSearch");
    private final static QName _RNObject_QNAME = new QName("urn:base.ws.rightnow.com/v1", "RNObject");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1", "UnexpectedErrorFault");
    private final static QName _SearchContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchContent");
    private final static QName _SearchContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchContentResponse");
    private final static QName _SummaryContentList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContentList");
    private final static QName _ServerErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1", "ServerErrorFault");
    private final static QName _NamedID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedID");
    private final static QName _BestSocialQuestionAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "BestSocialQuestionAnswer");
    private final static QName _ContentListResponseValidNullFields_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ValidNullFields");
    private final static QName _ContentListResponseSummaryContents_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContents");
    private final static QName _SocialQuestionCommentContentContentLastUpdatedBySocialUser_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentLastUpdatedBySocialUser");
    private final static QName _SocialQuestionCommentContentCreatedBySocialUser_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "CreatedBySocialUser");
    private final static QName _SocialQuestionCommentContentParent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Parent");
    private final static QName _SocialQuestionCommentContentBodyContentType_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "BodyContentType");
    private final static QName _SocialQuestionCommentContentBody_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Body");
    private final static QName _SocialQuestionCommentContentUpdatedBySocialUser_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "UpdatedBySocialUser");
    private final static QName _StandardContentContentContentValues_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentValues");
    private final static QName _ContentSearchConstraintsFilters_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Filters");
    private final static QName _ContentSearchConstraintsStart_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Start");
    private final static QName _ContentSearchConstraintsLimit_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Limit");
    private final static QName _ContentSearchConstraintsSortOptions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SortOptions");
    private final static QName _FileAttachmentUpdatedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "UpdatedTime");
    private final static QName _ContentGroupedSearchIncludeRelatedSearches_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "IncludeRelatedSearches");
    private final static QName _ContentGroupedSearchIncludeSpellingSuggestions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "IncludeSpellingSuggestions");
    private final static QName _ContentGroupedSearchSearchOrigin_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SearchOrigin");
    private final static QName _ContentGroupedSearchSearchConstraints_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SearchConstraints");
    private final static QName _DomainContentFilterFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Filter");
    private final static QName _BestSocialQuestionAnswerSocialUser_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "SocialUser");
    private final static QName _BestSocialQuestionAnswerValidNullFields_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "ValidNullFields");
    private final static QName _AnswerContentKeywords_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Keywords");
    private final static QName _AnswerContentProducts_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Products");
    private final static QName _AnswerContentCategories_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Categories");
    private final static QName _AnswerContentFileAttachments_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "FileAttachments");
    private final static QName _AnswerContentGuidedAssistance_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GuidedAssistance");
    private final static QName _AnswerContentCommonAttachments_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "CommonAttachments");
    private final static QName _AnswerContentQuestion_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Question");
    private final static QName _AnswerContentAccessLevels_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AccessLevels");
    private final static QName _AnswerContentSolution_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Solution");
    private final static QName _AnswerContentURL_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "URL");
    private final static QName _SearchContentMsgFilters_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "Filters");
    private final static QName _RNObjectTypeNamespace_QNAME = new QName("urn:generic.ws.rightnow.com/v1", "Namespace");
    private final static QName _SmartAssistantSuggestionsResponseSuggestions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Suggestions");
    private final static QName _KnowledgeStandardContentContentValueValue_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Value");
    private final static QName _SocialQuestionContentCategory_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Category");
    private final static QName _SocialQuestionContentLanguage_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Language");
    private final static QName _SocialQuestionContentProduct_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Product");
    private final static QName _SocialQuestionContentBestSocialQuestionAnswers_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "BestSocialQuestionAnswers");
    private final static QName _SocialQuestionContentSubject_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Subject");
    private final static QName _SmartAssistantSuggestionsKeyValueItems_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KeyValueItems");
    private final static QName _SocialUserSummaryAvatarURL_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AvatarURL");
    private final static QName _SocialUserSummaryDisplayName_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "DisplayName");
    private final static QName _GroupedSearchResponseGroupedSummaries_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GroupedSummaries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.datago.model.rightnow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartInteractionResponseMsg }
     * 
     */
    public StartInteractionResponseMsg createStartInteractionResponseMsg() {
        return new StartInteractionResponseMsg();
    }

    /**
     * Create an instance of {@link NamedID }
     * 
     */
    public NamedID createNamedID() {
        return new NamedID();
    }

    /**
     * Create an instance of {@link ContentListResponseNullFields }
     * 
     */
    public ContentListResponseNullFields createContentListResponseNullFields() {
        return new ContentListResponseNullFields();
    }

    /**
     * Create an instance of {@link ContentSecurityOptions }
     * 
     */
    public ContentSecurityOptions createContentSecurityOptions() {
        return new ContentSecurityOptions();
    }

    /**
     * Create an instance of {@link ContentSearchOrigin }
     * 
     */
    public ContentSearchOrigin createContentSearchOrigin() {
        return new ContentSearchOrigin();
    }

    /**
     * Create an instance of {@link GetValuesForNamedIDMsg }
     * 
     */
    public GetValuesForNamedIDMsg createGetValuesForNamedIDMsg() {
        return new GetValuesForNamedIDMsg();
    }

    /**
     * Create an instance of {@link DomainContentFilter }
     * 
     */
    public DomainContentFilter createDomainContentFilter() {
        return new DomainContentFilter();
    }

    /**
     * Create an instance of {@link AnswerSummaryContent }
     * 
     */
    public AnswerSummaryContent createAnswerSummaryContent() {
        return new AnswerSummaryContent();
    }

    /**
     * Create an instance of {@link RateContentMsg }
     * 
     */
    public RateContentMsg createRateContentMsg() {
        return new RateContentMsg();
    }

    /**
     * Create an instance of {@link BestSocialQuestionAnswerList }
     * 
     */
    public BestSocialQuestionAnswerList createBestSocialQuestionAnswerList() {
        return new BestSocialQuestionAnswerList();
    }

    /**
     * Create an instance of {@link LabelRequiredList }
     * 
     */
    public LabelRequiredList createLabelRequiredList() {
        return new LabelRequiredList();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswer }
     * 
     */
    public FileAttachmentAnswer createFileAttachmentAnswer() {
        return new FileAttachmentAnswer();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsExtendedMsg }
     * 
     */
    public GetSmartAssistantSuggestionsExtendedMsg createGetSmartAssistantSuggestionsExtendedMsg() {
        return new GetSmartAssistantSuggestionsExtendedMsg();
    }

    /**
     * Create an instance of {@link StartInteractionMsg }
     * 
     */
    public StartInteractionMsg createStartInteractionMsg() {
        return new StartInteractionMsg();
    }

    /**
     * Create an instance of {@link ContentListResponse }
     * 
     */
    public ContentListResponse createContentListResponse() {
        return new ContentListResponse();
    }

    /**
     * Create an instance of {@link StandardContentContent }
     * 
     */
    public StandardContentContent createStandardContentContent() {
        return new StandardContentContent();
    }

    /**
     * Create an instance of {@link AnswerContent }
     * 
     */
    public AnswerContent createAnswerContent() {
        return new AnswerContent();
    }

    /**
     * Create an instance of {@link GroupedSearchResponseNullFields }
     * 
     */
    public GroupedSearchResponseNullFields createGroupedSearchResponseNullFields() {
        return new GroupedSearchResponseNullFields();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValueNullFields }
     * 
     */
    public KnowledgeStandardContentContentValueNullFields createKnowledgeStandardContentContentValueNullFields() {
        return new KnowledgeStandardContentContentValueNullFields();
    }

    /**
     * Create an instance of {@link DataValue }
     * 
     */
    public DataValue createDataValue() {
        return new DataValue();
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestionsResponseNullFields }
     * 
     */
    public SmartAssistantSuggestionsResponseNullFields createSmartAssistantSuggestionsResponseNullFields() {
        return new SmartAssistantSuggestionsResponseNullFields();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link IncidentContent }
     * 
     */
    public IncidentContent createIncidentContent() {
        return new IncidentContent();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsResponseMsg }
     * 
     */
    public GetSmartAssistantSuggestionsResponseMsg createGetSmartAssistantSuggestionsResponseMsg() {
        return new GetSmartAssistantSuggestionsResponseMsg();
    }

    /**
     * Create an instance of {@link FileAttachmentSharedList }
     * 
     */
    public FileAttachmentSharedList createFileAttachmentSharedList() {
        return new FileAttachmentSharedList();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValueList }
     * 
     */
    public KnowledgeStandardContentContentValueList createKnowledgeStandardContentContentValueList() {
        return new KnowledgeStandardContentContentValueList();
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestionsNullFields }
     * 
     */
    public SmartAssistantSuggestionsNullFields createSmartAssistantSuggestionsNullFields() {
        return new SmartAssistantSuggestionsNullFields();
    }

    /**
     * Create an instance of {@link GenericObject }
     * 
     */
    public GenericObject createGenericObject() {
        return new GenericObject();
    }

    /**
     * Create an instance of {@link RateContentResponseMsg }
     * 
     */
    public RateContentResponseMsg createRateContentResponseMsg() {
        return new RateContentResponseMsg();
    }

    /**
     * Create an instance of {@link ContentViewOrigin }
     * 
     */
    public ContentViewOrigin createContentViewOrigin() {
        return new ContentViewOrigin();
    }

    /**
     * Create an instance of {@link NamedIDList }
     * 
     */
    public NamedIDList createNamedIDList() {
        return new NamedIDList();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsExtendedResponseMsg }
     * 
     */
    public GetSmartAssistantSuggestionsExtendedResponseMsg createGetSmartAssistantSuggestionsExtendedResponseMsg() {
        return new GetSmartAssistantSuggestionsExtendedResponseMsg();
    }

    /**
     * Create an instance of {@link ContentGroupedSearch }
     * 
     */
    public ContentGroupedSearch createContentGroupedSearch() {
        return new ContentGroupedSearch();
    }

    /**
     * Create an instance of {@link ContentRequestStatus }
     * 
     */
    public ContentRequestStatus createContentRequestStatus() {
        return new ContentRequestStatus();
    }

    /**
     * Create an instance of {@link SearchContentResponseMsg }
     * 
     */
    public SearchContentResponseMsg createSearchContentResponseMsg() {
        return new SearchContentResponseMsg();
    }

    /**
     * Create an instance of {@link SocialUserStatusesSummary }
     * 
     */
    public SocialUserStatusesSummary createSocialUserStatusesSummary() {
        return new SocialUserStatusesSummary();
    }

    /**
     * Create an instance of {@link NamedIDHierarchyList }
     * 
     */
    public NamedIDHierarchyList createNamedIDHierarchyList() {
        return new NamedIDHierarchyList();
    }

    /**
     * Create an instance of {@link NamedIDHierarchy }
     * 
     */
    public NamedIDHierarchy createNamedIDHierarchy() {
        return new NamedIDHierarchy();
    }

    /**
     * Create an instance of {@link RNFault }
     * 
     */
    public RNFault createRNFault() {
        return new RNFault();
    }

    /**
     * Create an instance of {@link ContentSearchNullFields }
     * 
     */
    public ContentSearchNullFields createContentSearchNullFields() {
        return new ContentSearchNullFields();
    }

    /**
     * Create an instance of {@link GetValuesForNamedIDResponseMsg }
     * 
     */
    public GetValuesForNamedIDResponseMsg createGetValuesForNamedIDResponseMsg() {
        return new GetValuesForNamedIDResponseMsg();
    }

    /**
     * Create an instance of {@link SearchGroupedContentMsg }
     * 
     */
    public SearchGroupedContentMsg createSearchGroupedContentMsg() {
        return new SearchGroupedContentMsg();
    }

    /**
     * Create an instance of {@link MarkContentAsViewedResponseMsg }
     * 
     */
    public MarkContentAsViewedResponseMsg createMarkContentAsViewedResponseMsg() {
        return new MarkContentAsViewedResponseMsg();
    }

    /**
     * Create an instance of {@link ServiceCategoryContentFilter }
     * 
     */
    public ServiceCategoryContentFilter createServiceCategoryContentFilter() {
        return new ServiceCategoryContentFilter();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link SocialQuestionContentNullFields }
     * 
     */
    public SocialQuestionContentNullFields createSocialQuestionContentNullFields() {
        return new SocialQuestionContentNullFields();
    }

    /**
     * Create an instance of {@link GetContentMsg }
     * 
     */
    public GetContentMsg createGetContentMsg() {
        return new GetContentMsg();
    }

    /**
     * Create an instance of {@link RNObject }
     * 
     */
    public RNObject createRNObject() {
        return new RNObject();
    }

    /**
     * Create an instance of {@link SocialQuestionStatuses }
     * 
     */
    public SocialQuestionStatuses createSocialQuestionStatuses() {
        return new SocialQuestionStatuses();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link SmartAssistantSearch }
     * 
     */
    public SmartAssistantSearch createSmartAssistantSearch() {
        return new SmartAssistantSearch();
    }

    /**
     * Create an instance of {@link BestSocialQuestionAnswer }
     * 
     */
    public BestSocialQuestionAnswer createBestSocialQuestionAnswer() {
        return new BestSocialQuestionAnswer();
    }

    /**
     * Create an instance of {@link FileAttachmentCommon }
     * 
     */
    public FileAttachmentCommon createFileAttachmentCommon() {
        return new FileAttachmentCommon();
    }

    /**
     * Create an instance of {@link NamedIDDelta }
     * 
     */
    public NamedIDDelta createNamedIDDelta() {
        return new NamedIDDelta();
    }

    /**
     * Create an instance of {@link GetRecommendedContentMsg }
     * 
     */
    public GetRecommendedContentMsg createGetRecommendedContentMsg() {
        return new GetRecommendedContentMsg();
    }

    /**
     * Create an instance of {@link RegisterSmartAssistantResolutionResponseMsg }
     * 
     */
    public RegisterSmartAssistantResolutionResponseMsg createRegisterSmartAssistantResolutionResponseMsg() {
        return new RegisterSmartAssistantResolutionResponseMsg();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchMsg }
     * 
     */
    public GetSmartAssistantSearchMsg createGetSmartAssistantSearchMsg() {
        return new GetSmartAssistantSearchMsg();
    }

    /**
     * Create an instance of {@link DomainContentFilterNullFields }
     * 
     */
    public DomainContentFilterNullFields createDomainContentFilterNullFields() {
        return new DomainContentFilterNullFields();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFaultType }
     * 
     */
    public UnexpectedErrorFaultType createUnexpectedErrorFaultType() {
        return new UnexpectedErrorFaultType();
    }

    /**
     * Create an instance of {@link SocialUserSummaryNullFields }
     * 
     */
    public SocialUserSummaryNullFields createSocialUserSummaryNullFields() {
        return new SocialUserSummaryNullFields();
    }

    /**
     * Create an instance of {@link KeyValueItem }
     * 
     */
    public KeyValueItem createKeyValueItem() {
        return new KeyValueItem();
    }

    /**
     * Create an instance of {@link RequestErrorFaultType }
     * 
     */
    public RequestErrorFaultType createRequestErrorFaultType() {
        return new RequestErrorFaultType();
    }

    /**
     * Create an instance of {@link ContentRate }
     * 
     */
    public ContentRate createContentRate() {
        return new ContentRate();
    }

    /**
     * Create an instance of {@link SocialQuestionCommentContent }
     * 
     */
    public SocialQuestionCommentContent createSocialQuestionCommentContent() {
        return new SocialQuestionCommentContent();
    }

    /**
     * Create an instance of {@link ContentSearchConstraints }
     * 
     */
    public ContentSearchConstraints createContentSearchConstraints() {
        return new ContentSearchConstraints();
    }

    /**
     * Create an instance of {@link ContentSearchConstraintsNullFields }
     * 
     */
    public ContentSearchConstraintsNullFields createContentSearchConstraintsNullFields() {
        return new ContentSearchConstraintsNullFields();
    }

    /**
     * Create an instance of {@link SearchContentMsg }
     * 
     */
    public SearchContentMsg createSearchContentMsg() {
        return new SearchContentMsg();
    }

    /**
     * Create an instance of {@link GetPopularContentMsg }
     * 
     */
    public GetPopularContentMsg createGetPopularContentMsg() {
        return new GetPopularContentMsg();
    }

    /**
     * Create an instance of {@link SearchGroupedContentResponseMsg }
     * 
     */
    public SearchGroupedContentResponseMsg createSearchGroupedContentResponseMsg() {
        return new SearchGroupedContentResponseMsg();
    }

    /**
     * Create an instance of {@link SocialQuestionSummaryContent }
     * 
     */
    public SocialQuestionSummaryContent createSocialQuestionSummaryContent() {
        return new SocialQuestionSummaryContent();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValue }
     * 
     */
    public KnowledgeStandardContentContentValue createKnowledgeStandardContentContentValue() {
        return new KnowledgeStandardContentContentValue();
    }

    /**
     * Create an instance of {@link MarkContentAsViewedMsg }
     * 
     */
    public MarkContentAsViewedMsg createMarkContentAsViewedMsg() {
        return new MarkContentAsViewedMsg();
    }

    /**
     * Create an instance of {@link ContentFilterList }
     * 
     */
    public ContentFilterList createContentFilterList() {
        return new ContentFilterList();
    }

    /**
     * Create an instance of {@link NamedReadOnlyID }
     * 
     */
    public NamedReadOnlyID createNamedReadOnlyID() {
        return new NamedReadOnlyID();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchExtendedResponseMsg }
     * 
     */
    public GetSmartAssistantSearchExtendedResponseMsg createGetSmartAssistantSearchExtendedResponseMsg() {
        return new GetSmartAssistantSearchExtendedResponseMsg();
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestions }
     * 
     */
    public SmartAssistantSuggestions createSmartAssistantSuggestions() {
        return new SmartAssistantSuggestions();
    }

    /**
     * Create an instance of {@link GetContentResponseMsg }
     * 
     */
    public GetContentResponseMsg createGetContentResponseMsg() {
        return new GetContentResponseMsg();
    }

    /**
     * Create an instance of {@link FileAttachmentShared }
     * 
     */
    public FileAttachmentShared createFileAttachmentShared() {
        return new FileAttachmentShared();
    }

    /**
     * Create an instance of {@link SocialQuestionCommentStatuses }
     * 
     */
    public SocialQuestionCommentStatuses createSocialQuestionCommentStatuses() {
        return new SocialQuestionCommentStatuses();
    }

    /**
     * Create an instance of {@link SummaryContentList }
     * 
     */
    public SummaryContentList createSummaryContentList() {
        return new SummaryContentList();
    }

    /**
     * Create an instance of {@link StatusWithType }
     * 
     */
    public StatusWithType createStatusWithType() {
        return new StatusWithType();
    }

    /**
     * Create an instance of {@link Knowledge }
     * 
     */
    public Knowledge createKnowledge() {
        return new Knowledge();
    }

    /**
     * Create an instance of {@link GenericField }
     * 
     */
    public GenericField createGenericField() {
        return new GenericField();
    }

    /**
     * Create an instance of {@link GetRecommendedContentResponseMsg }
     * 
     */
    public GetRecommendedContentResponseMsg createGetRecommendedContentResponseMsg() {
        return new GetRecommendedContentResponseMsg();
    }

    /**
     * Create an instance of {@link GroupedContentSummaryList }
     * 
     */
    public GroupedContentSummaryList createGroupedContentSummaryList() {
        return new GroupedContentSummaryList();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link RNObjectType }
     * 
     */
    public RNObjectType createRNObjectType() {
        return new RNObjectType();
    }

    /**
     * Create an instance of {@link SummaryContent }
     * 
     */
    public SummaryContent createSummaryContent() {
        return new SummaryContent();
    }

    /**
     * Create an instance of {@link GetPopularContentResponseMsg }
     * 
     */
    public GetPopularContentResponseMsg createGetPopularContentResponseMsg() {
        return new GetPopularContentResponseMsg();
    }

    /**
     * Create an instance of {@link GroupedContentSummaryNullFields }
     * 
     */
    public GroupedContentSummaryNullFields createGroupedContentSummaryNullFields() {
        return new GroupedContentSummaryNullFields();
    }

    /**
     * Create an instance of {@link KeyValueItemList }
     * 
     */
    public KeyValueItemList createKeyValueItemList() {
        return new KeyValueItemList();
    }

    /**
     * Create an instance of {@link ContentSearchConstraintsList }
     * 
     */
    public ContentSearchConstraintsList createContentSearchConstraintsList() {
        return new ContentSearchConstraintsList();
    }

    /**
     * Create an instance of {@link ClientInfoHeader }
     * 
     */
    public ClientInfoHeader createClientInfoHeader() {
        return new ClientInfoHeader();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchResponseMsg }
     * 
     */
    public GetSmartAssistantSearchResponseMsg createGetSmartAssistantSearchResponseMsg() {
        return new GetSmartAssistantSearchResponseMsg();
    }

    /**
     * Create an instance of {@link StandardContentContentNullFields }
     * 
     */
    public StandardContentContentNullFields createStandardContentContentNullFields() {
        return new StandardContentContentNullFields();
    }

    /**
     * Create an instance of {@link RegisterSmartAssistantResolutionMsg }
     * 
     */
    public RegisterSmartAssistantResolutionMsg createRegisterSmartAssistantResolutionMsg() {
        return new RegisterSmartAssistantResolutionMsg();
    }

    /**
     * Create an instance of {@link GroupedSearchResponse }
     * 
     */
    public GroupedSearchResponse createGroupedSearchResponse() {
        return new GroupedSearchResponse();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchExtendedMsg }
     * 
     */
    public GetSmartAssistantSearchExtendedMsg createGetSmartAssistantSearchExtendedMsg() {
        return new GetSmartAssistantSearchExtendedMsg();
    }

    /**
     * Create an instance of {@link SmartAssistantSearchNullFields }
     * 
     */
    public SmartAssistantSearchNullFields createSmartAssistantSearchNullFields() {
        return new SmartAssistantSearchNullFields();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswerList }
     * 
     */
    public FileAttachmentAnswerList createFileAttachmentAnswerList() {
        return new FileAttachmentAnswerList();
    }

    /**
     * Create an instance of {@link ContentSortOptions }
     * 
     */
    public ContentSortOptions createContentSortOptions() {
        return new ContentSortOptions();
    }

    /**
     * Create an instance of {@link ServerErrorFaultType }
     * 
     */
    public ServerErrorFaultType createServerErrorFaultType() {
        return new ServerErrorFaultType();
    }

    /**
     * Create an instance of {@link ContentList }
     * 
     */
    public ContentList createContentList() {
        return new ContentList();
    }

    /**
     * Create an instance of {@link LabelRequired }
     * 
     */
    public LabelRequired createLabelRequired() {
        return new LabelRequired();
    }

    /**
     * Create an instance of {@link SmartAssistantResolution }
     * 
     */
    public SmartAssistantResolution createSmartAssistantResolution() {
        return new SmartAssistantResolution();
    }

    /**
     * Create an instance of {@link GroupedContentSummary }
     * 
     */
    public GroupedContentSummary createGroupedContentSummary() {
        return new GroupedContentSummary();
    }

    /**
     * Create an instance of {@link ContentFilter }
     * 
     */
    public ContentFilter createContentFilter() {
        return new ContentFilter();
    }

    /**
     * Create an instance of {@link SocialUserSummary }
     * 
     */
    public SocialUserSummary createSocialUserSummary() {
        return new SocialUserSummary();
    }

    /**
     * Create an instance of {@link DomainContentFilterList }
     * 
     */
    public DomainContentFilterList createDomainContentFilterList() {
        return new DomainContentFilterList();
    }

    /**
     * Create an instance of {@link ContentGroupedSearchNullFields }
     * 
     */
    public ContentGroupedSearchNullFields createContentGroupedSearchNullFields() {
        return new ContentGroupedSearchNullFields();
    }

    /**
     * Create an instance of {@link SocialQuestionCommentSummaryContent }
     * 
     */
    public SocialQuestionCommentSummaryContent createSocialQuestionCommentSummaryContent() {
        return new SocialQuestionCommentSummaryContent();
    }

    /**
     * Create an instance of {@link SocialQuestionCommentContentNullFields }
     * 
     */
    public SocialQuestionCommentContentNullFields createSocialQuestionCommentContentNullFields() {
        return new SocialQuestionCommentContentNullFields();
    }

    /**
     * Create an instance of {@link NamedIDDeltaList }
     * 
     */
    public NamedIDDeltaList createNamedIDDeltaList() {
        return new NamedIDDeltaList();
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestionsResponse }
     * 
     */
    public SmartAssistantSuggestionsResponse createSmartAssistantSuggestionsResponse() {
        return new SmartAssistantSuggestionsResponse();
    }

    /**
     * Create an instance of {@link SmartAssistantContentSearch }
     * 
     */
    public SmartAssistantContentSearch createSmartAssistantContentSearch() {
        return new SmartAssistantContentSearch();
    }

    /**
     * Create an instance of {@link BestSocialQuestionAnswerNullFields }
     * 
     */
    public BestSocialQuestionAnswerNullFields createBestSocialQuestionAnswerNullFields() {
        return new BestSocialQuestionAnswerNullFields();
    }

    /**
     * Create an instance of {@link SocialQuestionContent }
     * 
     */
    public SocialQuestionContent createSocialQuestionContent() {
        return new SocialQuestionContent();
    }

    /**
     * Create an instance of {@link AnswerContentNullFields }
     * 
     */
    public AnswerContentNullFields createAnswerContentNullFields() {
        return new AnswerContentNullFields();
    }

    /**
     * Create an instance of {@link ServiceProductContentFilter }
     * 
     */
    public ServiceProductContentFilter createServiceProductContentFilter() {
        return new ServiceProductContentFilter();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsMsg }
     * 
     */
    public GetSmartAssistantSuggestionsMsg createGetSmartAssistantSuggestionsMsg() {
        return new GetSmartAssistantSuggestionsMsg();
    }

    /**
     * Create an instance of {@link ContentSearch }
     * 
     */
    public ContentSearch createContentSearch() {
        return new ContentSearch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentList")
    public JAXBElement<ContentList> createContentList(ContentList value) {
        return new JAXBElement<ContentList>(_ContentList_QNAME, ContentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ServiceCategoryContentFilter")
    public JAXBElement<ServiceCategoryContentFilter> createServiceCategoryContentFilter(ServiceCategoryContentFilter value) {
        return new JAXBElement<ServiceCategoryContentFilter>(_ServiceCategoryContentFilter_QNAME, ServiceCategoryContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsExtendedResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestionsExtendedResponse")
    public JAXBElement<GetSmartAssistantSuggestionsExtendedResponseMsg> createGetSmartAssistantSuggestionsExtendedResponse(GetSmartAssistantSuggestionsExtendedResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsExtendedResponseMsg>(_GetSmartAssistantSuggestionsExtendedResponse_QNAME, GetSmartAssistantSuggestionsExtendedResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValueList")
    public JAXBElement<KnowledgeStandardContentContentValueList> createKnowledgeStandardContentContentValueList(KnowledgeStandardContentContentValueList value) {
        return new JAXBElement<KnowledgeStandardContentContentValueList>(_KnowledgeStandardContentContentValueList_QNAME, KnowledgeStandardContentContentValueList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentAnswerList")
    public JAXBElement<FileAttachmentAnswerList> createFileAttachmentAnswerList(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_FileAttachmentAnswerList_QNAME, FileAttachmentAnswerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroupedContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchGroupedContentResponse")
    public JAXBElement<SearchGroupedContentResponseMsg> createSearchGroupedContentResponse(SearchGroupedContentResponseMsg value) {
        return new JAXBElement<SearchGroupedContentResponseMsg>(_SearchGroupedContentResponse_QNAME, SearchGroupedContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopularContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetPopularContent")
    public JAXBElement<GetPopularContentMsg> createGetPopularContent(GetPopularContentMsg value) {
        return new JAXBElement<GetPopularContentMsg>(_GetPopularContent_QNAME, GetPopularContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RateContentResponse")
    public JAXBElement<RateContentResponseMsg> createRateContentResponse(RateContentResponseMsg value) {
        return new JAXBElement<RateContentResponseMsg>(_RateContentResponse_QNAME, RateContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialQuestionContent")
    public JAXBElement<SocialQuestionContent> createSocialQuestionContent(SocialQuestionContent value) {
        return new JAXBElement<SocialQuestionContent>(_SocialQuestionContent_QNAME, SocialQuestionContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SearchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SocialQuestionContentNullFields")
    public JAXBElement<SocialQuestionContentNullFields> createSocialQuestionContentNullFields(SocialQuestionContentNullFields value) {
        return new JAXBElement<SocialQuestionContentNullFields>(_SocialQuestionContentNullFields_QNAME, SocialQuestionContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartInteractionResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "StartInteractionResponse")
    public JAXBElement<StartInteractionResponseMsg> createStartInteractionResponse(StartInteractionResponseMsg value) {
        return new JAXBElement<StartInteractionResponseMsg>(_StartInteractionResponse_QNAME, StartInteractionResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SmartAssistantSuggestionsResponseNullFields")
    public JAXBElement<SmartAssistantSuggestionsResponseNullFields> createSmartAssistantSuggestionsResponseNullFields(SmartAssistantSuggestionsResponseNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsResponseNullFields>(_SmartAssistantSuggestionsResponseNullFields_QNAME, SmartAssistantSuggestionsResponseNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentGroupedSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentGroupedSearch")
    public JAXBElement<ContentGroupedSearch> createContentGroupedSearch(ContentGroupedSearch value) {
        return new JAXBElement<ContentGroupedSearch>(_ContentGroupedSearch_QNAME, ContentGroupedSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Content }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Content")
    public JAXBElement<Content> createContent(Content value) {
        return new JAXBElement<Content>(_Content_QNAME, Content.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "AnswerContentNullFields")
    public JAXBElement<AnswerContentNullFields> createAnswerContentNullFields(AnswerContentNullFields value) {
        return new JAXBElement<AnswerContentNullFields>(_AnswerContentNullFields_QNAME, AnswerContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroupedContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchGroupedContent")
    public JAXBElement<SearchGroupedContentMsg> createSearchGroupedContent(SearchGroupedContentMsg value) {
        return new JAXBElement<SearchGroupedContentMsg>(_SearchGroupedContent_QNAME, SearchGroupedContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartAssistantResolutionMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RegisterSmartAssistantResolution")
    public JAXBElement<RegisterSmartAssistantResolutionMsg> createRegisterSmartAssistantResolution(RegisterSmartAssistantResolutionMsg value) {
        return new JAXBElement<RegisterSmartAssistantResolutionMsg>(_RegisterSmartAssistantResolution_QNAME, RegisterSmartAssistantResolutionMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentCommon")
    public JAXBElement<FileAttachmentCommon> createFileAttachmentCommon(FileAttachmentCommon value) {
        return new JAXBElement<FileAttachmentCommon>(_FileAttachmentCommon_QNAME, FileAttachmentCommon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentListResponse")
    public JAXBElement<ContentListResponse> createContentListResponse(ContentListResponse value) {
        return new JAXBElement<ContentListResponse>(_ContentListResponse_QNAME, ContentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "DomainContentFilterList")
    public JAXBElement<DomainContentFilterList> createDomainContentFilterList(DomainContentFilterList value) {
        return new JAXBElement<DomainContentFilterList>(_DomainContentFilterList_QNAME, DomainContentFilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDHierarchy")
    public JAXBElement<NamedIDHierarchy> createNamedIDHierarchy(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_NamedIDHierarchy_QNAME, NamedIDHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionCommentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SocialQuestionCommentContentNullFields")
    public JAXBElement<SocialQuestionCommentContentNullFields> createSocialQuestionCommentContentNullFields(SocialQuestionCommentContentNullFields value) {
        return new JAXBElement<SocialQuestionCommentContentNullFields>(_SocialQuestionCommentContentNullFields_QNAME, SocialQuestionCommentContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RateContent")
    public JAXBElement<RateContentMsg> createRateContent(RateContentMsg value) {
        return new JAXBElement<RateContentMsg>(_RateContent_QNAME, RateContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Knowledge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Knowledge")
    public JAXBElement<Knowledge> createKnowledge(Knowledge value) {
        return new JAXBElement<Knowledge>(_Knowledge_QNAME, Knowledge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestions")
    public JAXBElement<GetSmartAssistantSuggestionsMsg> createGetSmartAssistantSuggestions(GetSmartAssistantSuggestionsMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsMsg>(_GetSmartAssistantSuggestions_QNAME, GetSmartAssistantSuggestionsMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentSearchNullFields")
    public JAXBElement<ContentSearchNullFields> createContentSearchNullFields(ContentSearchNullFields value) {
        return new JAXBElement<ContentSearchNullFields>(_ContentSearchNullFields_QNAME, ContentSearchNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartInteractionMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "StartInteraction")
    public JAXBElement<StartInteractionMsg> createStartInteraction(StartInteractionMsg value) {
        return new JAXBElement<StartInteractionMsg>(_StartInteraction_QNAME, StartInteractionMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetRecommendedContent")
    public JAXBElement<GetRecommendedContentMsg> createGetRecommendedContent(GetRecommendedContentMsg value) {
        return new JAXBElement<GetRecommendedContentMsg>(_GetRecommendedContent_QNAME, GetRecommendedContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetContentResponse")
    public JAXBElement<GetContentResponseMsg> createGetContentResponse(GetContentResponseMsg value) {
        return new JAXBElement<GetContentResponseMsg>(_GetContentResponse_QNAME, GetContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedContentSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GroupedContentSummaryList")
    public JAXBElement<GroupedContentSummaryList> createGroupedContentSummaryList(GroupedContentSummaryList value) {
        return new JAXBElement<GroupedContentSummaryList>(_GroupedContentSummaryList_QNAME, GroupedContentSummaryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedContentSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GroupedContentSummary")
    public JAXBElement<GroupedContentSummary> createGroupedContentSummary(GroupedContentSummary value) {
        return new JAXBElement<GroupedContentSummary>(_GroupedContentSummary_QNAME, GroupedContentSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "StandardContentContent")
    public JAXBElement<StandardContentContent> createStandardContentContent(StandardContentContent value) {
        return new JAXBElement<StandardContentContent>(_StandardContentContent_QNAME, StandardContentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialUserSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialUserSummary")
    public JAXBElement<SocialUserSummary> createSocialUserSummary(SocialUserSummary value) {
        return new JAXBElement<SocialUserSummary>(_SocialUserSummary_QNAME, SocialUserSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuesForNamedIDResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetValuesForNamedIDResponse")
    public JAXBElement<GetValuesForNamedIDResponseMsg> createGetValuesForNamedIDResponse(GetValuesForNamedIDResponseMsg value) {
        return new JAXBElement<GetValuesForNamedIDResponseMsg>(_GetValuesForNamedIDResponse_QNAME, GetValuesForNamedIDResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionCommentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialQuestionCommentContent")
    public JAXBElement<SocialQuestionCommentContent> createSocialQuestionCommentContent(SocialQuestionCommentContent value) {
        return new JAXBElement<SocialQuestionCommentContent>(_SocialQuestionCommentContent_QNAME, SocialQuestionCommentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "StandardContentContentNullFields")
    public JAXBElement<StandardContentContentNullFields> createStandardContentContentNullFields(StandardContentContentNullFields value) {
        return new JAXBElement<StandardContentContentNullFields>(_StandardContentContentNullFields_QNAME, StandardContentContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentRate")
    public JAXBElement<ContentRate> createContentRate(ContentRate value) {
        return new JAXBElement<ContentRate>(_ContentRate_QNAME, ContentRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusWithType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "StatusWithType")
    public JAXBElement<StatusWithType> createStatusWithType(StatusWithType value) {
        return new JAXBElement<StatusWithType>(_StatusWithType_QNAME, StatusWithType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionCommentSummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialQuestionCommentSummaryContent")
    public JAXBElement<SocialQuestionCommentSummaryContent> createSocialQuestionCommentSummaryContent(SocialQuestionCommentSummaryContent value) {
        return new JAXBElement<SocialQuestionCommentSummaryContent>(_SocialQuestionCommentSummaryContent_QNAME, SocialQuestionCommentSummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1", name = "RequestErrorFault")
    public JAXBElement<RequestErrorFaultType> createRequestErrorFault(RequestErrorFaultType value) {
        return new JAXBElement<RequestErrorFaultType>(_RequestErrorFault_QNAME, RequestErrorFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDDeltaList")
    public JAXBElement<NamedIDDeltaList> createNamedIDDeltaList(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_NamedIDDeltaList_QNAME, NamedIDDeltaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDDelta")
    public JAXBElement<NamedIDDelta> createNamedIDDelta(NamedIDDelta value) {
        return new JAXBElement<NamedIDDelta>(_NamedIDDelta_QNAME, NamedIDDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerSummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AnswerSummaryContent")
    public JAXBElement<AnswerSummaryContent> createAnswerSummaryContent(AnswerSummaryContent value) {
        return new JAXBElement<AnswerSummaryContent>(_AnswerSummaryContent_QNAME, AnswerSummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "BestSocialQuestionAnswerList")
    public JAXBElement<BestSocialQuestionAnswerList> createBestSocialQuestionAnswerList(BestSocialQuestionAnswerList value) {
        return new JAXBElement<BestSocialQuestionAnswerList>(_BestSocialQuestionAnswerList_QNAME, BestSocialQuestionAnswerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentRequestStatus")
    public JAXBElement<ContentRequestStatus> createContentRequestStatus(ContentRequestStatus value) {
        return new JAXBElement<ContentRequestStatus>(_ContentRequestStatus_QNAME, ContentRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSecurityOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSecurityOptions")
    public JAXBElement<ContentSecurityOptions> createContentSecurityOptions(ContentSecurityOptions value) {
        return new JAXBElement<ContentSecurityOptions>(_ContentSecurityOptions_QNAME, ContentSecurityOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentAnswer")
    public JAXBElement<FileAttachmentAnswer> createFileAttachmentAnswer(FileAttachmentAnswer value) {
        return new JAXBElement<FileAttachmentAnswer>(_FileAttachmentAnswer_QNAME, FileAttachmentAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionStatuses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "SocialQuestionStatuses")
    public JAXBElement<SocialQuestionStatuses> createSocialQuestionStatuses(SocialQuestionStatuses value) {
        return new JAXBElement<SocialQuestionStatuses>(_SocialQuestionStatuses_QNAME, SocialQuestionStatuses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "BestSocialQuestionAnswerNullFields")
    public JAXBElement<BestSocialQuestionAnswerNullFields> createBestSocialQuestionAnswerNullFields(BestSocialQuestionAnswerNullFields value) {
        return new JAXBElement<BestSocialQuestionAnswerNullFields>(_BestSocialQuestionAnswerNullFields_QNAME, BestSocialQuestionAnswerNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1", name = "DataValue")
    public JAXBElement<DataValue> createDataValue(DataValue value) {
        return new JAXBElement<DataValue>(_DataValue_QNAME, DataValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearchResponse")
    public JAXBElement<GetSmartAssistantSearchResponseMsg> createGetSmartAssistantSearchResponse(GetSmartAssistantSearchResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSearchResponseMsg>(_GetSmartAssistantSearchResponse_QNAME, GetSmartAssistantSearchResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainContentFilterNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "DomainContentFilterNullFields")
    public JAXBElement<DomainContentFilterNullFields> createDomainContentFilterNullFields(DomainContentFilterNullFields value) {
        return new JAXBElement<DomainContentFilterNullFields>(_DomainContentFilterNullFields_QNAME, DomainContentFilterNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GroupedSearchResponse")
    public JAXBElement<GroupedSearchResponse> createGroupedSearchResponse(GroupedSearchResponse value) {
        return new JAXBElement<GroupedSearchResponse>(_GroupedSearchResponse_QNAME, GroupedSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchExtendedResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearchExtendedResponse")
    public JAXBElement<GetSmartAssistantSearchExtendedResponseMsg> createGetSmartAssistantSearchExtendedResponse(GetSmartAssistantSearchExtendedResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSearchExtendedResponseMsg>(_GetSmartAssistantSearchExtendedResponse_QNAME, GetSmartAssistantSearchExtendedResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchOrigin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearchOrigin")
    public JAXBElement<ContentSearchOrigin> createContentSearchOrigin(ContentSearchOrigin value) {
        return new JAXBElement<ContentSearchOrigin>(_ContentSearchOrigin_QNAME, ContentSearchOrigin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionSummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialQuestionSummaryContent")
    public JAXBElement<SocialQuestionSummaryContent> createSocialQuestionSummaryContent(SocialQuestionSummaryContent value) {
        return new JAXBElement<SocialQuestionSummaryContent>(_SocialQuestionSummaryContent_QNAME, SocialQuestionSummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearchConstraints")
    public JAXBElement<ContentSearchConstraints> createContentSearchConstraints(ContentSearchConstraints value) {
        return new JAXBElement<ContentSearchConstraints>(_ContentSearchConstraints_QNAME, ContentSearchConstraints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ServiceProductContentFilter")
    public JAXBElement<ServiceProductContentFilter> createServiceProductContentFilter(ServiceProductContentFilter value) {
        return new JAXBElement<ServiceProductContentFilter>(_ServiceProductContentFilter_QNAME, ServiceProductContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RNObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1", name = "RNObjectType")
    public JAXBElement<RNObjectType> createRNObjectType(RNObjectType value) {
        return new JAXBElement<RNObjectType>(_RNObjectType_QNAME, RNObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialUserStatusesSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SocialUserStatusesSummary")
    public JAXBElement<SocialUserStatusesSummary> createSocialUserStatusesSummary(SocialUserStatusesSummary value) {
        return new JAXBElement<SocialUserStatusesSummary>(_SocialUserStatusesSummary_QNAME, SocialUserStatusesSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantSuggestionsResponse")
    public JAXBElement<SmartAssistantSuggestionsResponse> createSmartAssistantSuggestionsResponse(SmartAssistantSuggestionsResponse value) {
        return new JAXBElement<SmartAssistantSuggestionsResponse>(_SmartAssistantSuggestionsResponse_QNAME, SmartAssistantSuggestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetRecommendedContentResponse")
    public JAXBElement<GetRecommendedContentResponseMsg> createGetRecommendedContentResponse(GetRecommendedContentResponseMsg value) {
        return new JAXBElement<GetRecommendedContentResponseMsg>(_GetRecommendedContentResponse_QNAME, GetRecommendedContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantContentSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantContentSearch")
    public JAXBElement<SmartAssistantContentSearch> createSmartAssistantContentSearch(SmartAssistantContentSearch value) {
        return new JAXBElement<SmartAssistantContentSearch>(_SmartAssistantContentSearch_QNAME, SmartAssistantContentSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearch")
    public JAXBElement<GetSmartAssistantSearchMsg> createGetSmartAssistantSearch(GetSmartAssistantSearchMsg value) {
        return new JAXBElement<GetSmartAssistantSearchMsg>(_GetSmartAssistantSearch_QNAME, GetSmartAssistantSearchMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearch")
    public JAXBElement<ContentSearch> createContentSearch(ContentSearch value) {
        return new JAXBElement<ContentSearch>(_ContentSearch_QNAME, ContentSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDHierarchyList")
    public JAXBElement<NamedIDHierarchyList> createNamedIDHierarchyList(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_NamedIDHierarchyList_QNAME, NamedIDHierarchyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentFilterList")
    public JAXBElement<ContentFilterList> createContentFilterList(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentFilterList_QNAME, ContentFilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "IncidentContent")
    public JAXBElement<IncidentContent> createIncidentContent(IncidentContent value) {
        return new JAXBElement<IncidentContent>(_IncidentContent_QNAME, IncidentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedSearchResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "GroupedSearchResponseNullFields")
    public JAXBElement<GroupedSearchResponseNullFields> createGroupedSearchResponseNullFields(GroupedSearchResponseNullFields value) {
        return new JAXBElement<GroupedSearchResponseNullFields>(_GroupedSearchResponseNullFields_QNAME, GroupedSearchResponseNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetContent")
    public JAXBElement<GetContentMsg> createGetContent(GetContentMsg value) {
        return new JAXBElement<GetContentMsg>(_GetContent_QNAME, GetContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuesForNamedIDMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetValuesForNamedID")
    public JAXBElement<GetValuesForNamedIDMsg> createGetValuesForNamedID(GetValuesForNamedIDMsg value) {
        return new JAXBElement<GetValuesForNamedIDMsg>(_GetValuesForNamedID_QNAME, GetValuesForNamedIDMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartAssistantResolutionResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RegisterSmartAssistantResolutionResponse")
    public JAXBElement<RegisterSmartAssistantResolutionResponseMsg> createRegisterSmartAssistantResolutionResponse(RegisterSmartAssistantResolutionResponseMsg value) {
        return new JAXBElement<RegisterSmartAssistantResolutionResponseMsg>(_RegisterSmartAssistantResolutionResponse_QNAME, RegisterSmartAssistantResolutionResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionCommentStatuses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "SocialQuestionCommentStatuses")
    public JAXBElement<SocialQuestionCommentStatuses> createSocialQuestionCommentStatuses(SocialQuestionCommentStatuses value) {
        return new JAXBElement<SocialQuestionCommentStatuses>(_SocialQuestionCommentStatuses_QNAME, SocialQuestionCommentStatuses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "DomainContentFilter")
    public JAXBElement<DomainContentFilter> createDomainContentFilter(DomainContentFilter value) {
        return new JAXBElement<DomainContentFilter>(_DomainContentFilter_QNAME, DomainContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantResolution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantResolution")
    public JAXBElement<SmartAssistantResolution> createSmartAssistantResolution(SmartAssistantResolution value) {
        return new JAXBElement<SmartAssistantResolution>(_SmartAssistantResolution_QNAME, SmartAssistantResolution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SmartAssistantSuggestionsNullFields")
    public JAXBElement<SmartAssistantSuggestionsNullFields> createSmartAssistantSuggestionsNullFields(SmartAssistantSuggestionsNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsNullFields>(_SmartAssistantSuggestionsNullFields_QNAME, SmartAssistantSuggestionsNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequiredList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "LabelRequiredList")
    public JAXBElement<LabelRequiredList> createLabelRequiredList(LabelRequiredList value) {
        return new JAXBElement<LabelRequiredList>(_LabelRequiredList_QNAME, LabelRequiredList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SmartAssistantSearchNullFields")
    public JAXBElement<SmartAssistantSearchNullFields> createSmartAssistantSearchNullFields(SmartAssistantSearchNullFields value) {
        return new JAXBElement<SmartAssistantSearchNullFields>(_SmartAssistantSearchNullFields_QNAME, SmartAssistantSearchNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialUserSummaryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SocialUserSummaryNullFields")
    public JAXBElement<SocialUserSummaryNullFields> createSocialUserSummaryNullFields(SocialUserSummaryNullFields value) {
        return new JAXBElement<SocialUserSummaryNullFields>(_SocialUserSummaryNullFields_QNAME, SocialUserSummaryNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AnswerContent")
    public JAXBElement<AnswerContent> createAnswerContent(AnswerContent value) {
        return new JAXBElement<AnswerContent>(_AnswerContent_QNAME, AnswerContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchExtendedMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearchExtended")
    public JAXBElement<GetSmartAssistantSearchExtendedMsg> createGetSmartAssistantSearchExtended(GetSmartAssistantSearchExtendedMsg value) {
        return new JAXBElement<GetSmartAssistantSearchExtendedMsg>(_GetSmartAssistantSearchExtended_QNAME, GetSmartAssistantSearchExtendedMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestionsResponse")
    public JAXBElement<GetSmartAssistantSuggestionsResponseMsg> createGetSmartAssistantSuggestionsResponse(GetSmartAssistantSuggestionsResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsResponseMsg>(_GetSmartAssistantSuggestionsResponse_QNAME, GetSmartAssistantSuggestionsResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentShared }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentShared")
    public JAXBElement<FileAttachmentShared> createFileAttachmentShared(FileAttachmentShared value) {
        return new JAXBElement<FileAttachmentShared>(_FileAttachmentShared_QNAME, FileAttachmentShared.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDList")
    public JAXBElement<NamedIDList> createNamedIDList(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_NamedIDList_QNAME, NamedIDList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentGroupedSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentGroupedSearchNullFields")
    public JAXBElement<ContentGroupedSearchNullFields> createContentGroupedSearchNullFields(ContentGroupedSearchNullFields value) {
        return new JAXBElement<ContentGroupedSearchNullFields>(_ContentGroupedSearchNullFields_QNAME, ContentGroupedSearchNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentListResponseNullFields")
    public JAXBElement<ContentListResponseNullFields> createContentListResponseNullFields(ContentListResponseNullFields value) {
        return new JAXBElement<ContentListResponseNullFields>(_ContentListResponseNullFields_QNAME, ContentListResponseNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KeyValueItem")
    public JAXBElement<KeyValueItem> createKeyValueItem(KeyValueItem value) {
        return new JAXBElement<KeyValueItem>(_KeyValueItem_QNAME, KeyValueItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkContentAsViewedResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "MarkContentAsViewedResponse")
    public JAXBElement<MarkContentAsViewedResponseMsg> createMarkContentAsViewedResponse(MarkContentAsViewedResponseMsg value) {
        return new JAXBElement<MarkContentAsViewedResponseMsg>(_MarkContentAsViewedResponse_QNAME, MarkContentAsViewedResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsExtendedMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestionsExtended")
    public JAXBElement<GetSmartAssistantSuggestionsExtendedMsg> createGetSmartAssistantSuggestionsExtended(GetSmartAssistantSuggestionsExtendedMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsExtendedMsg>(_GetSmartAssistantSuggestionsExtended_QNAME, GetSmartAssistantSuggestionsExtendedMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchConstraintsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearchConstraintsList")
    public JAXBElement<ContentSearchConstraintsList> createContentSearchConstraintsList(ContentSearchConstraintsList value) {
        return new JAXBElement<ContentSearchConstraintsList>(_ContentSearchConstraintsList_QNAME, ContentSearchConstraintsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KeyValueItemList")
    public JAXBElement<KeyValueItemList> createKeyValueItemList(KeyValueItemList value) {
        return new JAXBElement<KeyValueItemList>(_KeyValueItemList_QNAME, KeyValueItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentViewOrigin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentViewOrigin")
    public JAXBElement<ContentViewOrigin> createContentViewOrigin(ContentViewOrigin value) {
        return new JAXBElement<ContentViewOrigin>(_ContentViewOrigin_QNAME, ContentViewOrigin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequired }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "LabelRequired")
    public JAXBElement<LabelRequired> createLabelRequired(LabelRequired value) {
        return new JAXBElement<LabelRequired>(_LabelRequired_QNAME, LabelRequired.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContent")
    public JAXBElement<SummaryContent> createSummaryContent(SummaryContent value) {
        return new JAXBElement<SummaryContent>(_SummaryContent_QNAME, SummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchConstraintsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentSearchConstraintsNullFields")
    public JAXBElement<ContentSearchConstraintsNullFields> createContentSearchConstraintsNullFields(ContentSearchConstraintsNullFields value) {
        return new JAXBElement<ContentSearchConstraintsNullFields>(_ContentSearchConstraintsNullFields_QNAME, ContentSearchConstraintsNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValueNullFields")
    public JAXBElement<KnowledgeStandardContentContentValueNullFields> createKnowledgeStandardContentContentValueNullFields(KnowledgeStandardContentContentValueNullFields value) {
        return new JAXBElement<KnowledgeStandardContentContentValueNullFields>(_KnowledgeStandardContentContentValueNullFields_QNAME, KnowledgeStandardContentContentValueNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantSuggestions")
    public JAXBElement<SmartAssistantSuggestions> createSmartAssistantSuggestions(SmartAssistantSuggestions value) {
        return new JAXBElement<SmartAssistantSuggestions>(_SmartAssistantSuggestions_QNAME, SmartAssistantSuggestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkContentAsViewedMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "MarkContentAsViewed")
    public JAXBElement<MarkContentAsViewedMsg> createMarkContentAsViewed(MarkContentAsViewedMsg value) {
        return new JAXBElement<MarkContentAsViewedMsg>(_MarkContentAsViewed_QNAME, MarkContentAsViewedMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentFilter")
    public JAXBElement<ContentFilter> createContentFilter(ContentFilter value) {
        return new JAXBElement<ContentFilter>(_ContentFilter_QNAME, ContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentSharedList")
    public JAXBElement<FileAttachmentSharedList> createFileAttachmentSharedList(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_FileAttachmentSharedList_QNAME, FileAttachmentSharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedReadOnlyID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedReadOnlyID")
    public JAXBElement<NamedReadOnlyID> createNamedReadOnlyID(NamedReadOnlyID value) {
        return new JAXBElement<NamedReadOnlyID>(_NamedReadOnlyID_QNAME, NamedReadOnlyID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachment")
    public JAXBElement<FileAttachment> createFileAttachment(FileAttachment value) {
        return new JAXBElement<FileAttachment>(_FileAttachment_QNAME, FileAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopularContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetPopularContentResponse")
    public JAXBElement<GetPopularContentResponseMsg> createGetPopularContentResponse(GetPopularContentResponseMsg value) {
        return new JAXBElement<GetPopularContentResponseMsg>(_GetPopularContentResponse_QNAME, GetPopularContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedContentSummaryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "GroupedContentSummaryNullFields")
    public JAXBElement<GroupedContentSummaryNullFields> createGroupedContentSummaryNullFields(GroupedContentSummaryNullFields value) {
        return new JAXBElement<GroupedContentSummaryNullFields>(_GroupedContentSummaryNullFields_QNAME, GroupedContentSummaryNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1", name = "GenericField")
    public JAXBElement<GenericField> createGenericField(GenericField value) {
        return new JAXBElement<GenericField>(_GenericField_QNAME, GenericField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSortOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSortOptions")
    public JAXBElement<ContentSortOptions> createContentSortOptions(ContentSortOptions value) {
        return new JAXBElement<ContentSortOptions>(_ContentSortOptions_QNAME, ContentSortOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1", name = "GenericObject")
    public JAXBElement<GenericObject> createGenericObject(GenericObject value) {
        return new JAXBElement<GenericObject>(_GenericObject_QNAME, GenericObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValue")
    public JAXBElement<KnowledgeStandardContentContentValue> createKnowledgeStandardContentContentValue(KnowledgeStandardContentContentValue value) {
        return new JAXBElement<KnowledgeStandardContentContentValue>(_KnowledgeStandardContentContentValue_QNAME, KnowledgeStandardContentContentValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantSearch")
    public JAXBElement<SmartAssistantSearch> createSmartAssistantSearch(SmartAssistantSearch value) {
        return new JAXBElement<SmartAssistantSearch>(_SmartAssistantSearch_QNAME, SmartAssistantSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RNObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "RNObject")
    public JAXBElement<RNObject> createRNObject(RNObject value) {
        return new JAXBElement<RNObject>(_RNObject_QNAME, RNObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1", name = "UnexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFaultType> createUnexpectedErrorFault(UnexpectedErrorFaultType value) {
        return new JAXBElement<UnexpectedErrorFaultType>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchContent")
    public JAXBElement<SearchContentMsg> createSearchContent(SearchContentMsg value) {
        return new JAXBElement<SearchContentMsg>(_SearchContent_QNAME, SearchContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchContentResponse")
    public JAXBElement<SearchContentResponseMsg> createSearchContentResponse(SearchContentResponseMsg value) {
        return new JAXBElement<SearchContentResponseMsg>(_SearchContentResponse_QNAME, SearchContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContentList")
    public JAXBElement<SummaryContentList> createSummaryContentList(SummaryContentList value) {
        return new JAXBElement<SummaryContentList>(_SummaryContentList_QNAME, SummaryContentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1", name = "ServerErrorFault")
    public JAXBElement<ServerErrorFaultType> createServerErrorFault(ServerErrorFaultType value) {
        return new JAXBElement<ServerErrorFaultType>(_ServerErrorFault_QNAME, ServerErrorFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedID")
    public JAXBElement<NamedID> createNamedID(NamedID value) {
        return new JAXBElement<NamedID>(_NamedID_QNAME, NamedID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "BestSocialQuestionAnswer")
    public JAXBElement<BestSocialQuestionAnswer> createBestSocialQuestionAnswer(BestSocialQuestionAnswer value) {
        return new JAXBElement<BestSocialQuestionAnswer>(_BestSocialQuestionAnswer_QNAME, BestSocialQuestionAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentListResponse.class)
    public JAXBElement<ContentListResponseNullFields> createContentListResponseValidNullFields(ContentListResponseNullFields value) {
        return new JAXBElement<ContentListResponseNullFields>(_ContentListResponseValidNullFields_QNAME, ContentListResponseNullFields.class, ContentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContents", scope = ContentListResponse.class)
    public JAXBElement<SummaryContentList> createContentListResponseSummaryContents(SummaryContentList value) {
        return new JAXBElement<SummaryContentList>(_ContentListResponseSummaryContents_QNAME, SummaryContentList.class, ContentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentLastUpdatedBySocialUser", scope = SocialQuestionCommentContent.class)
    public JAXBElement<NamedID> createSocialQuestionCommentContentContentLastUpdatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentContentLastUpdatedBySocialUser_QNAME, NamedID.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "CreatedBySocialUser", scope = SocialQuestionCommentContent.class)
    public JAXBElement<NamedID> createSocialQuestionCommentContentCreatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentCreatedBySocialUser_QNAME, NamedID.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Parent", scope = SocialQuestionCommentContent.class)
    public JAXBElement<NamedIDHierarchy> createSocialQuestionCommentContentParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_SocialQuestionCommentContentParent_QNAME, NamedIDHierarchy.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionCommentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SocialQuestionCommentContent.class)
    public JAXBElement<SocialQuestionCommentContentNullFields> createSocialQuestionCommentContentValidNullFields(SocialQuestionCommentContentNullFields value) {
        return new JAXBElement<SocialQuestionCommentContentNullFields>(_ContentListResponseValidNullFields_QNAME, SocialQuestionCommentContentNullFields.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "BodyContentType", scope = SocialQuestionCommentContent.class)
    public JAXBElement<NamedID> createSocialQuestionCommentContentBodyContentType(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentBodyContentType_QNAME, NamedID.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Body", scope = SocialQuestionCommentContent.class)
    public JAXBElement<String> createSocialQuestionCommentContentBody(String value) {
        return new JAXBElement<String>(_SocialQuestionCommentContentBody_QNAME, String.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "UpdatedBySocialUser", scope = SocialQuestionCommentContent.class)
    public JAXBElement<NamedID> createSocialQuestionCommentContentUpdatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentUpdatedBySocialUser_QNAME, NamedID.class, SocialQuestionCommentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentValues", scope = StandardContentContent.class)
    public JAXBElement<KnowledgeStandardContentContentValueList> createStandardContentContentContentValues(KnowledgeStandardContentContentValueList value) {
        return new JAXBElement<KnowledgeStandardContentContentValueList>(_StandardContentContentContentValues_QNAME, KnowledgeStandardContentContentValueList.class, StandardContentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = StandardContentContent.class)
    public JAXBElement<StandardContentContentNullFields> createStandardContentContentValidNullFields(StandardContentContentNullFields value) {
        return new JAXBElement<StandardContentContentNullFields>(_ContentListResponseValidNullFields_QNAME, StandardContentContentNullFields.class, StandardContentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filters", scope = ContentSearchConstraints.class)
    public JAXBElement<DomainContentFilterList> createContentSearchConstraintsFilters(DomainContentFilterList value) {
        return new JAXBElement<DomainContentFilterList>(_ContentSearchConstraintsFilters_QNAME, DomainContentFilterList.class, ContentSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Start", scope = ContentSearchConstraints.class)
    public JAXBElement<Integer> createContentSearchConstraintsStart(Integer value) {
        return new JAXBElement<Integer>(_ContentSearchConstraintsStart_QNAME, Integer.class, ContentSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchConstraintsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentSearchConstraints.class)
    public JAXBElement<ContentSearchConstraintsNullFields> createContentSearchConstraintsValidNullFields(ContentSearchConstraintsNullFields value) {
        return new JAXBElement<ContentSearchConstraintsNullFields>(_ContentListResponseValidNullFields_QNAME, ContentSearchConstraintsNullFields.class, ContentSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Limit", scope = ContentSearchConstraints.class)
    public JAXBElement<Integer> createContentSearchConstraintsLimit(Integer value) {
        return new JAXBElement<Integer>(_ContentSearchConstraintsLimit_QNAME, Integer.class, ContentSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSortOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SortOptions", scope = ContentSearchConstraints.class)
    public JAXBElement<ContentSortOptions> createContentSearchConstraintsSortOptions(ContentSortOptions value) {
        return new JAXBElement<ContentSortOptions>(_ContentSearchConstraintsSortOptions_QNAME, ContentSortOptions.class, ContentSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "UpdatedTime", scope = FileAttachment.class)
    public JAXBElement<XMLGregorianCalendar> createFileAttachmentUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileAttachmentUpdatedTime_QNAME, XMLGregorianCalendar.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "IncludeRelatedSearches", scope = ContentGroupedSearch.class)
    public JAXBElement<Boolean> createContentGroupedSearchIncludeRelatedSearches(Boolean value) {
        return new JAXBElement<Boolean>(_ContentGroupedSearchIncludeRelatedSearches_QNAME, Boolean.class, ContentGroupedSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentGroupedSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentGroupedSearch.class)
    public JAXBElement<ContentGroupedSearchNullFields> createContentGroupedSearchValidNullFields(ContentGroupedSearchNullFields value) {
        return new JAXBElement<ContentGroupedSearchNullFields>(_ContentListResponseValidNullFields_QNAME, ContentGroupedSearchNullFields.class, ContentGroupedSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "IncludeSpellingSuggestions", scope = ContentGroupedSearch.class)
    public JAXBElement<Boolean> createContentGroupedSearchIncludeSpellingSuggestions(Boolean value) {
        return new JAXBElement<Boolean>(_ContentGroupedSearchIncludeSpellingSuggestions_QNAME, Boolean.class, ContentGroupedSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SearchOrigin", scope = ContentGroupedSearch.class)
    public JAXBElement<NamedID> createContentGroupedSearchSearchOrigin(NamedID value) {
        return new JAXBElement<NamedID>(_ContentGroupedSearchSearchOrigin_QNAME, NamedID.class, ContentGroupedSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchConstraintsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SearchConstraints", scope = ContentGroupedSearch.class)
    public JAXBElement<ContentSearchConstraintsList> createContentGroupedSearchSearchConstraints(ContentSearchConstraintsList value) {
        return new JAXBElement<ContentSearchConstraintsList>(_ContentGroupedSearchSearchConstraints_QNAME, ContentSearchConstraintsList.class, ContentGroupedSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filter", scope = DomainContentFilter.class)
    public JAXBElement<String> createDomainContentFilterFilter(String value) {
        return new JAXBElement<String>(_DomainContentFilterFilter_QNAME, String.class, DomainContentFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainContentFilterNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = DomainContentFilter.class)
    public JAXBElement<DomainContentFilterNullFields> createDomainContentFilterValidNullFields(DomainContentFilterNullFields value) {
        return new JAXBElement<DomainContentFilterNullFields>(_ContentListResponseValidNullFields_QNAME, DomainContentFilterNullFields.class, DomainContentFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filters", scope = SmartAssistantSearch.class)
    public JAXBElement<ContentFilterList> createSmartAssistantSearchFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentSearchConstraintsFilters_QNAME, ContentFilterList.class, SmartAssistantSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SmartAssistantSearch.class)
    public JAXBElement<SmartAssistantSearchNullFields> createSmartAssistantSearchValidNullFields(SmartAssistantSearchNullFields value) {
        return new JAXBElement<SmartAssistantSearchNullFields>(_ContentListResponseValidNullFields_QNAME, SmartAssistantSearchNullFields.class, SmartAssistantSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Limit", scope = SmartAssistantSearch.class)
    public JAXBElement<Integer> createSmartAssistantSearchLimit(Integer value) {
        return new JAXBElement<Integer>(_ContentSearchConstraintsLimit_QNAME, Integer.class, SmartAssistantSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "SocialUser", scope = BestSocialQuestionAnswer.class)
    public JAXBElement<NamedID> createBestSocialQuestionAnswerSocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_BestSocialQuestionAnswerSocialUser_QNAME, NamedID.class, BestSocialQuestionAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "ValidNullFields", scope = BestSocialQuestionAnswer.class)
    public JAXBElement<BestSocialQuestionAnswerNullFields> createBestSocialQuestionAnswerValidNullFields(BestSocialQuestionAnswerNullFields value) {
        return new JAXBElement<BestSocialQuestionAnswerNullFields>(_BestSocialQuestionAnswerValidNullFields_QNAME, BestSocialQuestionAnswerNullFields.class, BestSocialQuestionAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Keywords", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentKeywords(String value) {
        return new JAXBElement<String>(_AnswerContentKeywords_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Products", scope = AnswerContent.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerContentProducts(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerContentProducts_QNAME, NamedIDHierarchyList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Categories", scope = AnswerContent.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerContentCategories(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerContentCategories_QNAME, NamedIDHierarchyList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "FileAttachments", scope = AnswerContent.class)
    public JAXBElement<FileAttachmentAnswerList> createAnswerContentFileAttachments(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_AnswerContentFileAttachments_QNAME, FileAttachmentAnswerList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GuidedAssistance", scope = AnswerContent.class)
    public JAXBElement<NamedID> createAnswerContentGuidedAssistance(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerContentGuidedAssistance_QNAME, NamedID.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "CommonAttachments", scope = AnswerContent.class)
    public JAXBElement<FileAttachmentSharedList> createAnswerContentCommonAttachments(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_AnswerContentCommonAttachments_QNAME, FileAttachmentSharedList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = AnswerContent.class)
    public JAXBElement<AnswerContentNullFields> createAnswerContentValidNullFields(AnswerContentNullFields value) {
        return new JAXBElement<AnswerContentNullFields>(_ContentListResponseValidNullFields_QNAME, AnswerContentNullFields.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Question", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentQuestion(String value) {
        return new JAXBElement<String>(_AnswerContentQuestion_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AccessLevels", scope = AnswerContent.class)
    public JAXBElement<NamedIDDeltaList> createAnswerContentAccessLevels(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_AnswerContentAccessLevels_QNAME, NamedIDDeltaList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Solution", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentSolution(String value) {
        return new JAXBElement<String>(_AnswerContentSolution_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "URL", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentURL(String value) {
        return new JAXBElement<String>(_AnswerContentURL_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "Filters", scope = SearchContentMsg.class)
    public JAXBElement<ContentFilterList> createSearchContentMsgFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_SearchContentMsgFilters_QNAME, ContentFilterList.class, SearchContentMsg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1", name = "Namespace", scope = RNObjectType.class)
    public JAXBElement<String> createRNObjectTypeNamespace(String value) {
        return new JAXBElement<String>(_RNObjectTypeNamespace_QNAME, String.class, RNObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Suggestions", scope = SmartAssistantSuggestionsResponse.class)
    public JAXBElement<ContentList> createSmartAssistantSuggestionsResponseSuggestions(ContentList value) {
        return new JAXBElement<ContentList>(_SmartAssistantSuggestionsResponseSuggestions_QNAME, ContentList.class, SmartAssistantSuggestionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SmartAssistantSuggestionsResponse.class)
    public JAXBElement<SmartAssistantSuggestionsResponseNullFields> createSmartAssistantSuggestionsResponseValidNullFields(SmartAssistantSuggestionsResponseNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsResponseNullFields>(_ContentListResponseValidNullFields_QNAME, SmartAssistantSuggestionsResponseNullFields.class, SmartAssistantSuggestionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = KnowledgeStandardContentContentValue.class)
    public JAXBElement<KnowledgeStandardContentContentValueNullFields> createKnowledgeStandardContentContentValueValidNullFields(KnowledgeStandardContentContentValueNullFields value) {
        return new JAXBElement<KnowledgeStandardContentContentValueNullFields>(_ContentListResponseValidNullFields_QNAME, KnowledgeStandardContentContentValueNullFields.class, KnowledgeStandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Value", scope = KnowledgeStandardContentContentValue.class)
    public JAXBElement<String> createKnowledgeStandardContentContentValueValue(String value) {
        return new JAXBElement<String>(_KnowledgeStandardContentContentValueValue_QNAME, String.class, KnowledgeStandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentLastUpdatedBySocialUser", scope = SocialQuestionContent.class)
    public JAXBElement<NamedID> createSocialQuestionContentContentLastUpdatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentContentLastUpdatedBySocialUser_QNAME, NamedID.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "CreatedBySocialUser", scope = SocialQuestionContent.class)
    public JAXBElement<NamedID> createSocialQuestionContentCreatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentCreatedBySocialUser_QNAME, NamedID.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Category", scope = SocialQuestionContent.class)
    public JAXBElement<NamedIDHierarchy> createSocialQuestionContentCategory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_SocialQuestionContentCategory_QNAME, NamedIDHierarchy.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Language", scope = SocialQuestionContent.class)
    public JAXBElement<NamedID> createSocialQuestionContentLanguage(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionContentLanguage_QNAME, NamedID.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQuestionContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SocialQuestionContent.class)
    public JAXBElement<SocialQuestionContentNullFields> createSocialQuestionContentValidNullFields(SocialQuestionContentNullFields value) {
        return new JAXBElement<SocialQuestionContentNullFields>(_ContentListResponseValidNullFields_QNAME, SocialQuestionContentNullFields.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Product", scope = SocialQuestionContent.class)
    public JAXBElement<NamedIDHierarchy> createSocialQuestionContentProduct(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_SocialQuestionContentProduct_QNAME, NamedIDHierarchy.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "BodyContentType", scope = SocialQuestionContent.class)
    public JAXBElement<NamedID> createSocialQuestionContentBodyContentType(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentBodyContentType_QNAME, NamedID.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Body", scope = SocialQuestionContent.class)
    public JAXBElement<String> createSocialQuestionContentBody(String value) {
        return new JAXBElement<String>(_SocialQuestionCommentContentBody_QNAME, String.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestSocialQuestionAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "BestSocialQuestionAnswers", scope = SocialQuestionContent.class)
    public JAXBElement<BestSocialQuestionAnswerList> createSocialQuestionContentBestSocialQuestionAnswers(BestSocialQuestionAnswerList value) {
        return new JAXBElement<BestSocialQuestionAnswerList>(_SocialQuestionContentBestSocialQuestionAnswers_QNAME, BestSocialQuestionAnswerList.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Subject", scope = SocialQuestionContent.class)
    public JAXBElement<String> createSocialQuestionContentSubject(String value) {
        return new JAXBElement<String>(_SocialQuestionContentSubject_QNAME, String.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "UpdatedBySocialUser", scope = SocialQuestionContent.class)
    public JAXBElement<NamedID> createSocialQuestionContentUpdatedBySocialUser(NamedID value) {
        return new JAXBElement<NamedID>(_SocialQuestionCommentContentUpdatedBySocialUser_QNAME, NamedID.class, SocialQuestionContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedContentSummaryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = GroupedContentSummary.class)
    public JAXBElement<GroupedContentSummaryNullFields> createGroupedContentSummaryValidNullFields(GroupedContentSummaryNullFields value) {
        return new JAXBElement<GroupedContentSummaryNullFields>(_ContentListResponseValidNullFields_QNAME, GroupedContentSummaryNullFields.class, GroupedContentSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContents", scope = GroupedContentSummary.class)
    public JAXBElement<SummaryContentList> createGroupedContentSummarySummaryContents(SummaryContentList value) {
        return new JAXBElement<SummaryContentList>(_ContentListResponseSummaryContents_QNAME, SummaryContentList.class, GroupedContentSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filters", scope = SmartAssistantSuggestions.class)
    public JAXBElement<ContentFilterList> createSmartAssistantSuggestionsFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentSearchConstraintsFilters_QNAME, ContentFilterList.class, SmartAssistantSuggestions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KeyValueItems", scope = SmartAssistantSuggestions.class)
    public JAXBElement<KeyValueItemList> createSmartAssistantSuggestionsKeyValueItems(KeyValueItemList value) {
        return new JAXBElement<KeyValueItemList>(_SmartAssistantSuggestionsKeyValueItems_QNAME, KeyValueItemList.class, SmartAssistantSuggestions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SmartAssistantSuggestions.class)
    public JAXBElement<SmartAssistantSuggestionsNullFields> createSmartAssistantSuggestionsValidNullFields(SmartAssistantSuggestionsNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsNullFields>(_ContentListResponseValidNullFields_QNAME, SmartAssistantSuggestionsNullFields.class, SmartAssistantSuggestions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Limit", scope = SmartAssistantSuggestions.class)
    public JAXBElement<Integer> createSmartAssistantSuggestionsLimit(Integer value) {
        return new JAXBElement<Integer>(_ContentSearchConstraintsLimit_QNAME, Integer.class, SmartAssistantSuggestions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AvatarURL", scope = SocialUserSummary.class)
    public JAXBElement<String> createSocialUserSummaryAvatarURL(String value) {
        return new JAXBElement<String>(_SocialUserSummaryAvatarURL_QNAME, String.class, SocialUserSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialUserSummaryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SocialUserSummary.class)
    public JAXBElement<SocialUserSummaryNullFields> createSocialUserSummaryValidNullFields(SocialUserSummaryNullFields value) {
        return new JAXBElement<SocialUserSummaryNullFields>(_ContentListResponseValidNullFields_QNAME, SocialUserSummaryNullFields.class, SocialUserSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "DisplayName", scope = SocialUserSummary.class)
    public JAXBElement<String> createSocialUserSummaryDisplayName(String value) {
        return new JAXBElement<String>(_SocialUserSummaryDisplayName_QNAME, String.class, SocialUserSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filters", scope = ContentSearch.class)
    public JAXBElement<ContentFilterList> createContentSearchFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentSearchConstraintsFilters_QNAME, ContentFilterList.class, ContentSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentSearch.class)
    public JAXBElement<ContentSearchNullFields> createContentSearchValidNullFields(ContentSearchNullFields value) {
        return new JAXBElement<ContentSearchNullFields>(_ContentListResponseValidNullFields_QNAME, ContentSearchNullFields.class, ContentSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedContentSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GroupedSummaries", scope = GroupedSearchResponse.class)
    public JAXBElement<GroupedContentSummaryList> createGroupedSearchResponseGroupedSummaries(GroupedContentSummaryList value) {
        return new JAXBElement<GroupedContentSummaryList>(_GroupedSearchResponseGroupedSummaries_QNAME, GroupedContentSummaryList.class, GroupedSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedSearchResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = GroupedSearchResponse.class)
    public JAXBElement<GroupedSearchResponseNullFields> createGroupedSearchResponseValidNullFields(GroupedSearchResponseNullFields value) {
        return new JAXBElement<GroupedSearchResponseNullFields>(_ContentListResponseValidNullFields_QNAME, GroupedSearchResponseNullFields.class, GroupedSearchResponse.class, value);
    }

}
