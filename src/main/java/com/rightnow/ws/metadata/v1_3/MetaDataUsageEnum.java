
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetaDataUsageEnum�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="IGNORED"/>
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataUsageEnum")
@XmlEnum
public enum MetaDataUsageEnum {

    NOT_ALLOWED,
    ALLOWED,
    IGNORED,
    REQUIRED,
    SPECIFIED;

    public String value() {
        return name();
    }

    public static MetaDataUsageEnum fromValue(String v) {
        return valueOf(v);
    }

}
