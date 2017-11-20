
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChannelUsernameList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelUsernameList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelUsernameList" type="{urn:objects.ws.rightnow.com/v1_3}ChannelUsername" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelUsernameList", propOrder = {
    "channelUsernameList"
})
public class ChannelUsernameListType {

    @XmlElement(name = "ChannelUsernameList")
    protected List<ChannelUsernameType> channelUsernameList;

    /**
     * Gets the value of the channelUsernameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelUsernameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelUsernameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelUsernameType }
     * 
     * 
     */
    public List<ChannelUsernameType> getChannelUsernameList() {
        if (channelUsernameList == null) {
            channelUsernameList = new ArrayList<ChannelUsernameType>();
        }
        return this.channelUsernameList;
    }

}
