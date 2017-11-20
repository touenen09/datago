
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetaDataKeyTypeEnum�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataKeyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="PRIMARY_COMPOSITE"/>
 *     &lt;enumeration value="FOREIGN_AGGREGATION"/>
 *     &lt;enumeration value="FOREIGN_COMPOSITION"/>
 *     &lt;enumeration value="FOREIGN_RELATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataKeyTypeEnum")
@XmlEnum
public enum MetaDataKeyTypeEnum {

    NONE,
    PRIMARY,
    PRIMARY_COMPOSITE,
    FOREIGN_AGGREGATION,
    FOREIGN_COMPOSITION,
    FOREIGN_RELATION;

    public String value() {
        return name();
    }

    public static MetaDataKeyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
