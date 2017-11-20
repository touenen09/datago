
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FileAttachmentSharedList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FileAttachmentSharedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileAttachmentList" type="{urn:objects.ws.rightnow.com/v1_3}FileAttachmentShared" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileAttachmentSharedList", propOrder = {
    "fileAttachmentList"
})
public class FileAttachmentSharedListType {

    @XmlElement(name = "FileAttachmentList")
    protected List<FileAttachmentSharedType> fileAttachmentList;

    /**
     * Gets the value of the fileAttachmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttachmentSharedType }
     * 
     * 
     */
    public List<FileAttachmentSharedType> getFileAttachmentList() {
        if (fileAttachmentList == null) {
            fileAttachmentList = new ArrayList<FileAttachmentSharedType>();
        }
        return this.fileAttachmentList;
    }

}
