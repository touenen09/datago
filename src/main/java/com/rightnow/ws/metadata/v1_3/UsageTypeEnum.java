
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UsageTypeEnum�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="UsageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USAGE_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="USAGE_URI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageTypeEnum")
@XmlEnum
public enum UsageTypeEnum {

    USAGE_EMAIL_ADDRESS,
    USAGE_URI;

    public String value() {
        return name();
    }

    public static UsageTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
