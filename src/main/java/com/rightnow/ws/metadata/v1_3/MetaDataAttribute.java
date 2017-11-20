
package com.rightnow.ws.metadata.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_3.DataTypeEnum;


/**
 * <p>MetaDataAttribute complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{urn:generic.ws.rightnow.com/v1_3}DataTypeEnum"/>
 *         &lt;element name="DataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEnumerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxDepth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PasswordExpirationInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordGracePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxOccurrence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxOldPasswords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMaxRepetitions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinLowerCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinNumericSpecial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinSpecial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordMinUpperCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordWarningPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageOnCreate" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnDestroy" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnGet" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnUpdate" type="{urn:metadata.ws.rightnow.com/v1_3}MetaDataUsageEnum"/>
 *         &lt;element name="UsageType" type="{urn:metadata.ws.rightnow.com/v1_3}UsageTypeEnum" minOccurs="0"/>
 *         &lt;element name="UsedAsName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttribute", propOrder = {
    "dataType",
    "dataTypeName",
    "metaDataLink",
    "inputMask",
    "isDeprecated",
    "isEnumerable",
    "description",
    "label",
    "maxBytes",
    "maxDepth",
    "maxLength",
    "maxValue",
    "minLength",
    "minValue",
    "name",
    "nullable",
    "passwordExpirationInterval",
    "passwordGracePeriod",
    "passwordMaxOccurrence",
    "passwordMaxOldPasswords",
    "passwordMaxRepetitions",
    "passwordMinLowerCase",
    "passwordMinNumericSpecial",
    "passwordMinSpecial",
    "passwordMinUpperCase",
    "passwordWarningPeriod",
    "pattern",
    "usageOnCreate",
    "usageOnDestroy",
    "usageOnGet",
    "usageOnUpdate",
    "usageType",
    "usedAsName"
})
public class MetaDataAttribute {

    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataTypeEnum dataType;
    @XmlElement(name = "DataTypeName")
    protected String dataTypeName;
    @XmlElement(name = "MetaDataLink")
    protected String metaDataLink;
    @XmlElement(name = "InputMask")
    protected String inputMask;
    @XmlElement(name = "IsDeprecated")
    protected boolean isDeprecated;
    @XmlElement(name = "IsEnumerable")
    protected Boolean isEnumerable;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "MaxBytes")
    protected Long maxBytes;
    @XmlElement(name = "MaxDepth")
    protected Integer maxDepth;
    @XmlElement(name = "MaxLength")
    protected Long maxLength;
    @XmlElement(name = "MaxValue")
    protected Long maxValue;
    @XmlElement(name = "MinLength")
    protected Long minLength;
    @XmlElement(name = "MinValue")
    protected Long minValue;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Nullable")
    protected boolean nullable;
    @XmlElement(name = "PasswordExpirationInterval")
    protected Integer passwordExpirationInterval;
    @XmlElement(name = "PasswordGracePeriod")
    protected Integer passwordGracePeriod;
    @XmlElement(name = "PasswordMaxOccurrence")
    protected Integer passwordMaxOccurrence;
    @XmlElement(name = "PasswordMaxOldPasswords")
    protected Integer passwordMaxOldPasswords;
    @XmlElement(name = "PasswordMaxRepetitions")
    protected Integer passwordMaxRepetitions;
    @XmlElement(name = "PasswordMinLowerCase")
    protected Integer passwordMinLowerCase;
    @XmlElement(name = "PasswordMinNumericSpecial")
    protected Integer passwordMinNumericSpecial;
    @XmlElement(name = "PasswordMinSpecial")
    protected Integer passwordMinSpecial;
    @XmlElement(name = "PasswordMinUpperCase")
    protected Integer passwordMinUpperCase;
    @XmlElement(name = "PasswordWarningPeriod")
    protected Integer passwordWarningPeriod;
    @XmlElement(name = "Pattern")
    protected String pattern;
    @XmlElement(name = "UsageOnCreate", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnCreate;
    @XmlElement(name = "UsageOnDestroy", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnDestroy;
    @XmlElement(name = "UsageOnGet", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnGet;
    @XmlElement(name = "UsageOnUpdate", required = true)
    @XmlSchemaType(name = "string")
    protected MetaDataUsageEnum usageOnUpdate;
    @XmlElement(name = "UsageType")
    @XmlSchemaType(name = "string")
    protected UsageTypeEnum usageType;
    @XmlElement(name = "UsedAsName")
    protected boolean usedAsName;

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * ��ȡdataTypeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * ����dataTypeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeName(String value) {
        this.dataTypeName = value;
    }

    /**
     * ��ȡmetaDataLink���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataLink() {
        return metaDataLink;
    }

    /**
     * ����metaDataLink���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataLink(String value) {
        this.metaDataLink = value;
    }

    /**
     * ��ȡinputMask���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMask() {
        return inputMask;
    }

    /**
     * ����inputMask���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMask(String value) {
        this.inputMask = value;
    }

    /**
     * ��ȡisDeprecated���Ե�ֵ��
     * 
     */
    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    /**
     * ����isDeprecated���Ե�ֵ��
     * 
     */
    public void setIsDeprecated(boolean value) {
        this.isDeprecated = value;
    }

    /**
     * ��ȡisEnumerable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnumerable() {
        return isEnumerable;
    }

    /**
     * ����isEnumerable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnumerable(Boolean value) {
        this.isEnumerable = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡlabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * ����label���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * ��ȡmaxBytes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBytes() {
        return maxBytes;
    }

    /**
     * ����maxBytes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBytes(Long value) {
        this.maxBytes = value;
    }

    /**
     * ��ȡmaxDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDepth() {
        return maxDepth;
    }

    /**
     * ����maxDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDepth(Integer value) {
        this.maxDepth = value;
    }

    /**
     * ��ȡmaxLength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * ����maxLength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLength(Long value) {
        this.maxLength = value;
    }

    /**
     * ��ȡmaxValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * ����maxValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxValue(Long value) {
        this.maxValue = value;
    }

    /**
     * ��ȡminLength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinLength() {
        return minLength;
    }

    /**
     * ����minLength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinLength(Long value) {
        this.minLength = value;
    }

    /**
     * ��ȡminValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * ����minValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinValue(Long value) {
        this.minValue = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡnullable���Ե�ֵ��
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * ����nullable���Ե�ֵ��
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * ��ȡpasswordExpirationInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordExpirationInterval() {
        return passwordExpirationInterval;
    }

    /**
     * ����passwordExpirationInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordExpirationInterval(Integer value) {
        this.passwordExpirationInterval = value;
    }

    /**
     * ��ȡpasswordGracePeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordGracePeriod() {
        return passwordGracePeriod;
    }

    /**
     * ����passwordGracePeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordGracePeriod(Integer value) {
        this.passwordGracePeriod = value;
    }

    /**
     * ��ȡpasswordMaxOccurrence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxOccurrence() {
        return passwordMaxOccurrence;
    }

    /**
     * ����passwordMaxOccurrence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxOccurrence(Integer value) {
        this.passwordMaxOccurrence = value;
    }

    /**
     * ��ȡpasswordMaxOldPasswords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxOldPasswords() {
        return passwordMaxOldPasswords;
    }

    /**
     * ����passwordMaxOldPasswords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxOldPasswords(Integer value) {
        this.passwordMaxOldPasswords = value;
    }

    /**
     * ��ȡpasswordMaxRepetitions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMaxRepetitions() {
        return passwordMaxRepetitions;
    }

    /**
     * ����passwordMaxRepetitions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMaxRepetitions(Integer value) {
        this.passwordMaxRepetitions = value;
    }

    /**
     * ��ȡpasswordMinLowerCase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinLowerCase() {
        return passwordMinLowerCase;
    }

    /**
     * ����passwordMinLowerCase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinLowerCase(Integer value) {
        this.passwordMinLowerCase = value;
    }

    /**
     * ��ȡpasswordMinNumericSpecial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinNumericSpecial() {
        return passwordMinNumericSpecial;
    }

    /**
     * ����passwordMinNumericSpecial���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinNumericSpecial(Integer value) {
        this.passwordMinNumericSpecial = value;
    }

    /**
     * ��ȡpasswordMinSpecial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinSpecial() {
        return passwordMinSpecial;
    }

    /**
     * ����passwordMinSpecial���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinSpecial(Integer value) {
        this.passwordMinSpecial = value;
    }

    /**
     * ��ȡpasswordMinUpperCase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordMinUpperCase() {
        return passwordMinUpperCase;
    }

    /**
     * ����passwordMinUpperCase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordMinUpperCase(Integer value) {
        this.passwordMinUpperCase = value;
    }

    /**
     * ��ȡpasswordWarningPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordWarningPeriod() {
        return passwordWarningPeriod;
    }

    /**
     * ����passwordWarningPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordWarningPeriod(Integer value) {
        this.passwordWarningPeriod = value;
    }

    /**
     * ��ȡpattern���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * ����pattern���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * ��ȡusageOnCreate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnCreate() {
        return usageOnCreate;
    }

    /**
     * ����usageOnCreate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnCreate(MetaDataUsageEnum value) {
        this.usageOnCreate = value;
    }

    /**
     * ��ȡusageOnDestroy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnDestroy() {
        return usageOnDestroy;
    }

    /**
     * ����usageOnDestroy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnDestroy(MetaDataUsageEnum value) {
        this.usageOnDestroy = value;
    }

    /**
     * ��ȡusageOnGet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnGet() {
        return usageOnGet;
    }

    /**
     * ����usageOnGet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnGet(MetaDataUsageEnum value) {
        this.usageOnGet = value;
    }

    /**
     * ��ȡusageOnUpdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnUpdate() {
        return usageOnUpdate;
    }

    /**
     * ����usageOnUpdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnUpdate(MetaDataUsageEnum value) {
        this.usageOnUpdate = value;
    }

    /**
     * ��ȡusageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UsageTypeEnum }
     *     
     */
    public UsageTypeEnum getUsageType() {
        return usageType;
    }

    /**
     * ����usageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UsageTypeEnum }
     *     
     */
    public void setUsageType(UsageTypeEnum value) {
        this.usageType = value;
    }

    /**
     * ��ȡusedAsName���Ե�ֵ��
     * 
     */
    public boolean isUsedAsName() {
        return usedAsName;
    }

    /**
     * ����usedAsName���Ե�ֵ��
     * 
     */
    public void setUsedAsName(boolean value) {
        this.usedAsName = value;
    }

}
