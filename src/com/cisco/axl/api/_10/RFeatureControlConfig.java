
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFeatureControlConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFeatureControlConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="featureName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="overrideDefault" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableSetting" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFeatureControlConfig", propOrder = {
    "featureName",
    "defaultValue",
    "overrideDefault",
    "enableSetting"
})
public class RFeatureControlConfig {

    protected String featureName;
    protected String defaultValue;
    protected String overrideDefault;
    protected String enableSetting;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the overrideDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideDefault() {
        return overrideDefault;
    }

    /**
     * Sets the value of the overrideDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideDefault(String value) {
        this.overrideDefault = value;
    }

    /**
     * Gets the value of the enableSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSetting() {
        return enableSetting;
    }

    /**
     * Sets the value of the enableSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSetting(String value) {
        this.enableSetting = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
