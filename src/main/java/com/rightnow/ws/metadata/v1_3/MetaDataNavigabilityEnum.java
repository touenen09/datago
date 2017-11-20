
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetaDataNavigabilityEnum�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataNavigabilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMING"/>
 *     &lt;enumeration value="OUTGOING"/>
 *     &lt;enumeration value="BIDIRECTIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataNavigabilityEnum")
@XmlEnum
public enum MetaDataNavigabilityEnum {

    INCOMING,
    OUTGOING,
    BIDIRECTIONAL;

    public String value() {
        return name();
    }

    public static MetaDataNavigabilityEnum fromValue(String v) {
        return valueOf(v);
    }

}
