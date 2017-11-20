
package com.rightnow.ws.nullfields.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AnswerNullFields complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AnswerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccessLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AssignedSibling" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Categories" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CommonAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Keywords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Products" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Question" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RelatedAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Solution" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerNullFields")
public class AnswerNullFields {

    @XmlAttribute(name = "AccessLevels")
    protected Boolean accessLevels;
    @XmlAttribute(name = "AssignedSibling")
    protected Boolean assignedSibling;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "Categories")
    protected Boolean categories;
    @XmlAttribute(name = "CommonAttachments")
    protected Boolean commonAttachments;
    @XmlAttribute(name = "ExpiresDate")
    protected Boolean expiresDate;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Keywords")
    protected Boolean keywords;
    @XmlAttribute(name = "NextNotificationTime")
    protected Boolean nextNotificationTime;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "OriginalReferenceNumber")
    protected Boolean originalReferenceNumber;
    @XmlAttribute(name = "Products")
    protected Boolean products;
    @XmlAttribute(name = "PublishOnDate")
    protected Boolean publishOnDate;
    @XmlAttribute(name = "Question")
    protected Boolean question;
    @XmlAttribute(name = "RelatedAnswers")
    protected Boolean relatedAnswers;
    @XmlAttribute(name = "Solution")
    protected Boolean solution;
    @XmlAttribute(name = "URL")
    protected Boolean url;

    /**
     * ��ȡaccessLevels���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccessLevels() {
        if (accessLevels == null) {
            return false;
        } else {
            return accessLevels;
        }
    }

    /**
     * ����accessLevels���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessLevels(Boolean value) {
        this.accessLevels = value;
    }

    /**
     * ��ȡassignedSibling���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedSibling() {
        if (assignedSibling == null) {
            return false;
        } else {
            return assignedSibling;
        }
    }

    /**
     * ����assignedSibling���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedSibling(Boolean value) {
        this.assignedSibling = value;
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
     * ��ȡcategories���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategories() {
        if (categories == null) {
            return false;
        } else {
            return categories;
        }
    }

    /**
     * ����categories���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategories(Boolean value) {
        this.categories = value;
    }

    /**
     * ��ȡcommonAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommonAttachments() {
        if (commonAttachments == null) {
            return false;
        } else {
            return commonAttachments;
        }
    }

    /**
     * ����commonAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonAttachments(Boolean value) {
        this.commonAttachments = value;
    }

    /**
     * ��ȡexpiresDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpiresDate() {
        if (expiresDate == null) {
            return false;
        } else {
            return expiresDate;
        }
    }

    /**
     * ����expiresDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiresDate(Boolean value) {
        this.expiresDate = value;
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
     * ��ȡkeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeywords() {
        if (keywords == null) {
            return false;
        } else {
            return keywords;
        }
    }

    /**
     * ����keywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeywords(Boolean value) {
        this.keywords = value;
    }

    /**
     * ��ȡnextNotificationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNextNotificationTime() {
        if (nextNotificationTime == null) {
            return false;
        } else {
            return nextNotificationTime;
        }
    }

    /**
     * ����nextNotificationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNextNotificationTime(Boolean value) {
        this.nextNotificationTime = value;
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
     * ��ȡoriginalReferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOriginalReferenceNumber() {
        if (originalReferenceNumber == null) {
            return false;
        } else {
            return originalReferenceNumber;
        }
    }

    /**
     * ����originalReferenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalReferenceNumber(Boolean value) {
        this.originalReferenceNumber = value;
    }

    /**
     * ��ȡproducts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProducts() {
        if (products == null) {
            return false;
        } else {
            return products;
        }
    }

    /**
     * ����products���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducts(Boolean value) {
        this.products = value;
    }

    /**
     * ��ȡpublishOnDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPublishOnDate() {
        if (publishOnDate == null) {
            return false;
        } else {
            return publishOnDate;
        }
    }

    /**
     * ����publishOnDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishOnDate(Boolean value) {
        this.publishOnDate = value;
    }

    /**
     * ��ȡquestion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuestion() {
        if (question == null) {
            return false;
        } else {
            return question;
        }
    }

    /**
     * ����question���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuestion(Boolean value) {
        this.question = value;
    }

    /**
     * ��ȡrelatedAnswers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRelatedAnswers() {
        if (relatedAnswers == null) {
            return false;
        } else {
            return relatedAnswers;
        }
    }

    /**
     * ����relatedAnswers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelatedAnswers(Boolean value) {
        this.relatedAnswers = value;
    }

    /**
     * ��ȡsolution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolution() {
        if (solution == null) {
            return false;
        } else {
            return solution;
        }
    }

    /**
     * ����solution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolution(Boolean value) {
        this.solution = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isURL() {
        if (url == null) {
            return false;
        } else {
            return url;
        }
    }

    /**
     * ����url���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setURL(Boolean value) {
        this.url = value;
    }

}
