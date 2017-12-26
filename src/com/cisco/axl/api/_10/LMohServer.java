
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LMohServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LMohServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="maxUnicastConnections" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="maxMulticastConnections" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="fixedAudioSourceDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runFlag" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="isMultiCastEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="baseMulticastIpaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseMulticastPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="multicastIncrementOnIp" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
@XmlType(name = "LMohServer", propOrder = {
    "name",
    "description",
    "processNodeName",
    "devicePoolName",
    "locationName",
    "maxUnicastConnections",
    "maxMulticastConnections",
    "fixedAudioSourceDevice",
    "runFlag",
    "useTrustedRelayPoint",
    "isMultiCastEnabled",
    "baseMulticastIpaddress",
    "baseMulticastPort",
    "multicastIncrementOnIp"
})
public class LMohServer {

    protected String name;
    protected String description;
    protected XFkType processNodeName;
    protected XFkType devicePoolName;
    protected XFkType locationName;
    protected String maxUnicastConnections;
    protected String maxMulticastConnections;
    protected String fixedAudioSourceDevice;
    protected String runFlag;
    protected String useTrustedRelayPoint;
    protected String isMultiCastEnabled;
    protected String baseMulticastIpaddress;
    protected String baseMulticastPort;
    protected String multicastIncrementOnIp;
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
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
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
     * Gets the value of the maxUnicastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxUnicastConnections() {
        return maxUnicastConnections;
    }

    /**
     * Sets the value of the maxUnicastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxUnicastConnections(String value) {
        this.maxUnicastConnections = value;
    }

    /**
     * Gets the value of the maxMulticastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMulticastConnections() {
        return maxMulticastConnections;
    }

    /**
     * Sets the value of the maxMulticastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMulticastConnections(String value) {
        this.maxMulticastConnections = value;
    }

    /**
     * Gets the value of the fixedAudioSourceDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAudioSourceDevice() {
        return fixedAudioSourceDevice;
    }

    /**
     * Sets the value of the fixedAudioSourceDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAudioSourceDevice(String value) {
        this.fixedAudioSourceDevice = value;
    }

    /**
     * Gets the value of the runFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunFlag() {
        return runFlag;
    }

    /**
     * Sets the value of the runFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunFlag(String value) {
        this.runFlag = value;
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
     * Gets the value of the isMultiCastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiCastEnabled() {
        return isMultiCastEnabled;
    }

    /**
     * Sets the value of the isMultiCastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiCastEnabled(String value) {
        this.isMultiCastEnabled = value;
    }

    /**
     * Gets the value of the baseMulticastIpaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastIpaddress() {
        return baseMulticastIpaddress;
    }

    /**
     * Sets the value of the baseMulticastIpaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastIpaddress(String value) {
        this.baseMulticastIpaddress = value;
    }

    /**
     * Gets the value of the baseMulticastPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastPort() {
        return baseMulticastPort;
    }

    /**
     * Sets the value of the baseMulticastPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastPort(String value) {
        this.baseMulticastPort = value;
    }

    /**
     * Gets the value of the multicastIncrementOnIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastIncrementOnIp() {
        return multicastIncrementOnIp;
    }

    /**
     * Sets the value of the multicastIncrementOnIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastIncrementOnIp(String value) {
        this.multicastIncrementOnIp = value;
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
