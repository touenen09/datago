
package com.rightnow.ws.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_3.ContactServiceSettingsNullFields;


/**
 * <p>ContactServiceSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerNotifications" type="{urn:objects.ws.rightnow.com/v1_3}AnswerNotificationList" minOccurs="0"/>
 *         &lt;element name="CategoryNotifications" type="{urn:objects.ws.rightnow.com/v1_3}CategoryNotificationList" minOccurs="0"/>
 *         &lt;element name="ProductNotifications" type="{urn:objects.ws.rightnow.com/v1_3}ProductNotificationList" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_3}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_3}ContactServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettings", propOrder = {
    "answerNotifications",
    "categoryNotifications",
    "productNotifications",
    "slaInstances",
    "validNullFields"
})
public class ContactServiceSettingsType {

    @XmlElementRef(name = "AnswerNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerNotificationListType> answerNotifications;
    @XmlElementRef(name = "CategoryNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoryNotificationListType> categoryNotifications;
    @XmlElementRef(name = "ProductNotifications", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductNotificationListType> productNotifications;
    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<SLAInstanceListType> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_3", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactServiceSettingsNullFields> validNullFields;

    /**
     * ��ȡanswerNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationListType }{@code >}
     *     
     */
    public JAXBElement<AnswerNotificationListType> getAnswerNotifications() {
        return answerNotifications;
    }

    /**
     * ����answerNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationListType }{@code >}
     *     
     */
    public void setAnswerNotifications(JAXBElement<AnswerNotificationListType> value) {
        this.answerNotifications = value;
    }

    /**
     * ��ȡcategoryNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationListType }{@code >}
     *     
     */
    public JAXBElement<CategoryNotificationListType> getCategoryNotifications() {
        return categoryNotifications;
    }

    /**
     * ����categoryNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationListType }{@code >}
     *     
     */
    public void setCategoryNotifications(JAXBElement<CategoryNotificationListType> value) {
        this.categoryNotifications = value;
    }

    /**
     * ��ȡproductNotifications���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationListType }{@code >}
     *     
     */
    public JAXBElement<ProductNotificationListType> getProductNotifications() {
        return productNotifications;
    }

    /**
     * ����productNotifications���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationListType }{@code >}
     *     
     */
    public void setProductNotifications(JAXBElement<ProductNotificationListType> value) {
        this.productNotifications = value;
    }

    /**
     * ��ȡslaInstances���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}
     *     
     */
    public JAXBElement<SLAInstanceListType> getSLAInstances() {
        return slaInstances;
    }

    /**
     * ����slaInstances���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceListType }{@code >}
     *     
     */
    public void setSLAInstances(JAXBElement<SLAInstanceListType> value) {
        this.slaInstances = value;
    }

    /**
     * ��ȡvalidNullFields���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * ����validNullFields���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactServiceSettingsNullFields> value) {
        this.validNullFields = value;
    }

}
