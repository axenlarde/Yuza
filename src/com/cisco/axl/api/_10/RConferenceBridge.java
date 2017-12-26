
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RConferenceBridge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RConferenceBridge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}UniqueName128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}XProduct" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subUnit" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/10.5}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="maximumCapacity" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="securityProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="destinationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcuConferenceBridgeSipPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="srtpAllowed" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="normalizationScript" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableTrace" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="normalizationScriptInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="normalizationScriptInfo" type="{http://www.cisco.com/AXL/API/10.5}RNormalizationScriptInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="useHttps" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="conferenceBridgePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideSIPTrunkAddress" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
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
@XmlType(name = "RConferenceBridge", propOrder = {
    "name",
    "description",
    "product",
    "devicePoolName",
    "commonDeviceConfigName",
    "locationName",
    "subUnit",
    "loadInformation",
    "vendorConfig",
    "maximumCapacity",
    "useTrustedRelayPoint",
    "securityProfileName",
    "destinationAddress",
    "mcuConferenceBridgeSipPort",
    "sipProfile",
    "srtpAllowed",
    "normalizationScript",
    "enableTrace",
    "normalizationScriptInfos",
    "userName",
    "password",
    "httpPort",
    "useHttps",
    "addresses",
    "conferenceBridgePrefix",
    "overrideSIPTrunkAddress",
    "sipTrunkName"
})
public class RConferenceBridge {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    protected String description;
    protected String product;
    protected XFkType devicePoolName;
    protected XFkType commonDeviceConfigName;
    protected XFkType locationName;
    protected String subUnit;
    protected XLoadInformation loadInformation;
    protected XVendorConfig vendorConfig;
    protected String maximumCapacity;
    protected String useTrustedRelayPoint;
    protected XFkType securityProfileName;
    protected String destinationAddress;
    protected String mcuConferenceBridgeSipPort;
    protected XFkType sipProfile;
    protected String srtpAllowed;
    protected XFkType normalizationScript;
    protected String enableTrace;
    protected RConferenceBridge.NormalizationScriptInfos normalizationScriptInfos;
    protected String userName;
    protected String password;
    protected String httpPort;
    protected String useHttps;
    protected RConferenceBridge.Addresses addresses;
    protected String conferenceBridgePrefix;
    protected String overrideSIPTrunkAddress;
    protected XFkType sipTrunkName;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the description property.
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
     * Sets the value of the description property.
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevicePoolName(XFkType value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonDeviceConfigName(XFkType value) {
        this.commonDeviceConfigName = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the subUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubUnit() {
        return subUnit;
    }

    /**
     * Sets the value of the subUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubUnit(String value) {
        this.subUnit = value;
    }

    /**
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link XLoadInformation }
     *     
     */
    public XLoadInformation getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLoadInformation }
     *     
     */
    public void setLoadInformation(XLoadInformation value) {
        this.loadInformation = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
    }

    /**
     * Gets the value of the maximumCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Sets the value of the maximumCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCapacity(String value) {
        this.maximumCapacity = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the securityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * Sets the value of the securityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecurityProfileName(XFkType value) {
        this.securityProfileName = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the mcuConferenceBridgeSipPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcuConferenceBridgeSipPort() {
        return mcuConferenceBridgeSipPort;
    }

    /**
     * Sets the value of the mcuConferenceBridgeSipPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcuConferenceBridgeSipPort(String value) {
        this.mcuConferenceBridgeSipPort = value;
    }

    /**
     * Gets the value of the sipProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipProfile() {
        return sipProfile;
    }

    /**
     * Sets the value of the sipProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipProfile(XFkType value) {
        this.sipProfile = value;
    }

    /**
     * Gets the value of the srtpAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrtpAllowed() {
        return srtpAllowed;
    }

    /**
     * Sets the value of the srtpAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrtpAllowed(String value) {
        this.srtpAllowed = value;
    }

    /**
     * Gets the value of the normalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNormalizationScript() {
        return normalizationScript;
    }

    /**
     * Sets the value of the normalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNormalizationScript(XFkType value) {
        this.normalizationScript = value;
    }

    /**
     * Gets the value of the enableTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableTrace() {
        return enableTrace;
    }

    /**
     * Sets the value of the enableTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableTrace(String value) {
        this.enableTrace = value;
    }

    /**
     * Gets the value of the normalizationScriptInfos property.
     * 
     * @return
     *     possible object is
     *     {@link RConferenceBridge.NormalizationScriptInfos }
     *     
     */
    public RConferenceBridge.NormalizationScriptInfos getNormalizationScriptInfos() {
        return normalizationScriptInfos;
    }

    /**
     * Sets the value of the normalizationScriptInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RConferenceBridge.NormalizationScriptInfos }
     *     
     */
    public void setNormalizationScriptInfos(RConferenceBridge.NormalizationScriptInfos value) {
        this.normalizationScriptInfos = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the httpPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpPort() {
        return httpPort;
    }

    /**
     * Sets the value of the httpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpPort(String value) {
        this.httpPort = value;
    }

    /**
     * Gets the value of the useHttps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseHttps() {
        return useHttps;
    }

    /**
     * Sets the value of the useHttps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseHttps(String value) {
        this.useHttps = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link RConferenceBridge.Addresses }
     *     
     */
    public RConferenceBridge.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link RConferenceBridge.Addresses }
     *     
     */
    public void setAddresses(RConferenceBridge.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the conferenceBridgePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceBridgePrefix() {
        return conferenceBridgePrefix;
    }

    /**
     * Sets the value of the conferenceBridgePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceBridgePrefix(String value) {
        this.conferenceBridgePrefix = value;
    }

    /**
     * Gets the value of the overrideSIPTrunkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideSIPTrunkAddress() {
        return overrideSIPTrunkAddress;
    }

    /**
     * Sets the value of the overrideSIPTrunkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideSIPTrunkAddress(String value) {
        this.overrideSIPTrunkAddress = value;
    }

    /**
     * Gets the value of the sipTrunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipTrunkName() {
        return sipTrunkName;
    }

    /**
     * Sets the value of the sipTrunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipTrunkName(XFkType value) {
        this.sipTrunkName = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        protected List<String> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAddress() {
            if (address == null) {
                address = new ArrayList<String>();
            }
            return this.address;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="normalizationScriptInfo" type="{http://www.cisco.com/AXL/API/10.5}RNormalizationScriptInfo" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "normalizationScriptInfo"
    })
    public static class NormalizationScriptInfos {

        protected List<RNormalizationScriptInfo> normalizationScriptInfo;

        /**
         * Gets the value of the normalizationScriptInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the normalizationScriptInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNormalizationScriptInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RNormalizationScriptInfo }
         * 
         * 
         */
        public List<RNormalizationScriptInfo> getNormalizationScriptInfo() {
            if (normalizationScriptInfo == null) {
                normalizationScriptInfo = new ArrayList<RNormalizationScriptInfo>();
            }
            return this.normalizationScriptInfo;
        }

    }

}
