
package com.rightnow.ws.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FileAttachmentAnswer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FileAttachmentAnswer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentCommon">
 *       &lt;sequence>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Indexed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileAttachmentAnswer", propOrder = {
    "disabled",
    "indexed",
    "_private"
})
@XmlSeeAlso({
    SharedFileAttachmentAnswerType.class
})
public class FileAttachmentAnswerType
    extends FileAttachmentCommonType
{

    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Indexed")
    protected Boolean indexed;
    @XmlElement(name = "Private")
    protected Boolean _private;

    /**
     * ��ȡdisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * ����disabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * ��ȡindexed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexed() {
        return indexed;
    }

    /**
     * ����indexed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexed(Boolean value) {
        this.indexed = value;
    }

    /**
     * ��ȡprivate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivate() {
        return _private;
    }

    /**
     * ����private���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

}
