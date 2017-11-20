
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.metadata.v1_3 package. 
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

    private final static QName _MetaDataAttributeList_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataAttributeList");
    private final static QName _SubscriptionEvents_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "SubscriptionEvents");
    private final static QName _MetaDataAttributeUsage_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataAttributeUsage");
    private final static QName _MetaDataRelationship_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataRelationship");
    private final static QName _MetaDataClass_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataClass");
    private final static QName _MetaDataAttribute_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataAttribute");
    private final static QName _MetaDataOperationList_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataOperationList");
    private final static QName _MetaDataAttributeUsageList_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataAttributeUsageList");
    private final static QName _MetaDataOperation_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataOperation");
    private final static QName _MetaDataClassOperation_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_3", "MetaDataClassOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.metadata.v1_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaDataOperation }
     * 
     */
    public MetaDataOperation createMetaDataOperation() {
        return new MetaDataOperation();
    }

    /**
     * Create an instance of {@link MetaDataOperationList }
     * 
     */
    public MetaDataOperationList createMetaDataOperationList() {
        return new MetaDataOperationList();
    }

    /**
     * Create an instance of {@link SubscriptionEvents }
     * 
     */
    public SubscriptionEvents createSubscriptionEvents() {
        return new SubscriptionEvents();
    }

    /**
     * Create an instance of {@link MetaDataRelationship }
     * 
     */
    public MetaDataRelationship createMetaDataRelationship() {
        return new MetaDataRelationship();
    }

    /**
     * Create an instance of {@link MetaDataAttributeUsage }
     * 
     */
    public MetaDataAttributeUsage createMetaDataAttributeUsage() {
        return new MetaDataAttributeUsage();
    }

    /**
     * Create an instance of {@link MetaDataClass }
     * 
     */
    public MetaDataClass createMetaDataClass() {
        return new MetaDataClass();
    }

    /**
     * Create an instance of {@link MetaDataClassOperation }
     * 
     */
    public MetaDataClassOperation createMetaDataClassOperation() {
        return new MetaDataClassOperation();
    }

    /**
     * Create an instance of {@link MetaDataAttributeList }
     * 
     */
    public MetaDataAttributeList createMetaDataAttributeList() {
        return new MetaDataAttributeList();
    }

    /**
     * Create an instance of {@link MetaDataAttribute }
     * 
     */
    public MetaDataAttribute createMetaDataAttribute() {
        return new MetaDataAttribute();
    }

    /**
     * Create an instance of {@link MetaDataAttributeUsageList }
     * 
     */
    public MetaDataAttributeUsageList createMetaDataAttributeUsageList() {
        return new MetaDataAttributeUsageList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataAttributeList")
    public JAXBElement<MetaDataAttributeList> createMetaDataAttributeList(MetaDataAttributeList value) {
        return new JAXBElement<MetaDataAttributeList>(_MetaDataAttributeList_QNAME, MetaDataAttributeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "SubscriptionEvents")
    public JAXBElement<SubscriptionEvents> createSubscriptionEvents(SubscriptionEvents value) {
        return new JAXBElement<SubscriptionEvents>(_SubscriptionEvents_QNAME, SubscriptionEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttributeUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataAttributeUsage")
    public JAXBElement<MetaDataAttributeUsage> createMetaDataAttributeUsage(MetaDataAttributeUsage value) {
        return new JAXBElement<MetaDataAttributeUsage>(_MetaDataAttributeUsage_QNAME, MetaDataAttributeUsage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataRelationship")
    public JAXBElement<MetaDataRelationship> createMetaDataRelationship(MetaDataRelationship value) {
        return new JAXBElement<MetaDataRelationship>(_MetaDataRelationship_QNAME, MetaDataRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataClass")
    public JAXBElement<MetaDataClass> createMetaDataClass(MetaDataClass value) {
        return new JAXBElement<MetaDataClass>(_MetaDataClass_QNAME, MetaDataClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataAttribute")
    public JAXBElement<MetaDataAttribute> createMetaDataAttribute(MetaDataAttribute value) {
        return new JAXBElement<MetaDataAttribute>(_MetaDataAttribute_QNAME, MetaDataAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataOperationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataOperationList")
    public JAXBElement<MetaDataOperationList> createMetaDataOperationList(MetaDataOperationList value) {
        return new JAXBElement<MetaDataOperationList>(_MetaDataOperationList_QNAME, MetaDataOperationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttributeUsageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataAttributeUsageList")
    public JAXBElement<MetaDataAttributeUsageList> createMetaDataAttributeUsageList(MetaDataAttributeUsageList value) {
        return new JAXBElement<MetaDataAttributeUsageList>(_MetaDataAttributeUsageList_QNAME, MetaDataAttributeUsageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataOperation")
    public JAXBElement<MetaDataOperation> createMetaDataOperation(MetaDataOperation value) {
        return new JAXBElement<MetaDataOperation>(_MetaDataOperation_QNAME, MetaDataOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataClassOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_3", name = "MetaDataClassOperation")
    public JAXBElement<MetaDataClassOperation> createMetaDataClassOperation(MetaDataClassOperation value) {
        return new JAXBElement<MetaDataClassOperation>(_MetaDataClassOperation_QNAME, MetaDataClassOperation.class, null, value);
    }

}
