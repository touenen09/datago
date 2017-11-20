
package com.rightnow.ws.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProvinceList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProvinceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProvinceList" type="{urn:objects.ws.rightnow.com/v1_3}Province" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvinceList", propOrder = {
    "provinceList"
})
public class ProvinceListType {

    @XmlElement(name = "ProvinceList")
    protected List<ProvinceType> provinceList;

    /**
     * Gets the value of the provinceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provinceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvinceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvinceType }
     * 
     * 
     */
    public List<ProvinceType> getProvinceList() {
        if (provinceList == null) {
            provinceList = new ArrayList<ProvinceType>();
        }
        return this.provinceList;
    }

}
