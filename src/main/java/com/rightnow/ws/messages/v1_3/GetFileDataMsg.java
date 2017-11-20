
package com.rightnow.ws.messages.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_3.ID;
import com.rightnow.ws.base.v1_3.RNObject;


/**
 * <p>GetFileDataMsg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetFileDataMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObject" type="{urn:base.ws.rightnow.com/v1_3}RNObject"/>
 *         &lt;element name="FileID" type="{urn:base.ws.rightnow.com/v1_3}ID"/>
 *         &lt;element name="DisableMTOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileDataMsg", propOrder = {
    "rnObject",
    "fileID",
    "disableMTOM"
})
public class GetFileDataMsg {

    @XmlElement(name = "RNObject", required = true)
    protected RNObject rnObject;
    @XmlElement(name = "FileID", required = true)
    protected ID fileID;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * ��ȡrnObject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getRNObject() {
        return rnObject;
    }

    /**
     * ����rnObject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setRNObject(RNObject value) {
        this.rnObject = value;
    }

    /**
     * ��ȡfileID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getFileID() {
        return fileID;
    }

    /**
     * ����fileID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setFileID(ID value) {
        this.fileID = value;
    }

    /**
     * ��ȡdisableMTOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMTOM() {
        return disableMTOM;
    }

    /**
     * ����disableMTOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMTOM(Boolean value) {
        this.disableMTOM = value;
    }

}
