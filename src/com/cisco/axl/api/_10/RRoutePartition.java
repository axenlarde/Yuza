
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RRoutePartition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RRoutePartition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dialPlanWizardGenId" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timeScheduleIdName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useOriginatingDeviceTimeZone" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/10.5}XTimeZone" minOccurs="0"/>
 *         &lt;element name="partitionUsage" type="{http://www.cisco.com/AXL/API/10.5}XPartitionUsage" minOccurs="0"/>
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
@XmlType(name = "RRoutePartition", propOrder = {
    "name",
    "description",
    "dialPlanWizardGenId",
    "timeScheduleIdName",
    "useOriginatingDeviceTimeZone",
    "timeZone",
    "partitionUsage"
})
public class RRoutePartition {

    protected String name;
    protected String description;
    protected String dialPlanWizardGenId;
    protected XFkType timeScheduleIdName;
    protected String useOriginatingDeviceTimeZone;
    protected String timeZone;
    protected String partitionUsage;
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
     * Gets the value of the dialPlanWizardGenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanWizardGenId() {
        return dialPlanWizardGenId;
    }

    /**
     * Sets the value of the dialPlanWizardGenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanWizardGenId(String value) {
        this.dialPlanWizardGenId = value;
    }

    /**
     * Gets the value of the timeScheduleIdName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTimeScheduleIdName() {
        return timeScheduleIdName;
    }

    /**
     * Sets the value of the timeScheduleIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTimeScheduleIdName(XFkType value) {
        this.timeScheduleIdName = value;
    }

    /**
     * Gets the value of the useOriginatingDeviceTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseOriginatingDeviceTimeZone() {
        return useOriginatingDeviceTimeZone;
    }

    /**
     * Sets the value of the useOriginatingDeviceTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseOriginatingDeviceTimeZone(String value) {
        this.useOriginatingDeviceTimeZone = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the partitionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionUsage() {
        return partitionUsage;
    }

    /**
     * Sets the value of the partitionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionUsage(String value) {
        this.partitionUsage = value;
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
