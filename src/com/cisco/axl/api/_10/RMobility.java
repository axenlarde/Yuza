
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMobility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="handoffNumber" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="handoffPartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="DTMFNumber" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="DTMFPartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMobility", propOrder = {
    "handoffNumber",
    "handoffPartitionName",
    "dtmfNumber",
    "dtmfPartitionName"
})
public class RMobility {

    protected XFkType handoffNumber;
    protected XFkType handoffPartitionName;
    @XmlElement(name = "DTMFNumber")
    protected XFkType dtmfNumber;
    @XmlElement(name = "DTMFPartitionName")
    protected XFkType dtmfPartitionName;

    /**
     * Gets the value of the handoffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHandoffNumber() {
        return handoffNumber;
    }

    /**
     * Sets the value of the handoffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHandoffNumber(XFkType value) {
        this.handoffNumber = value;
    }

    /**
     * Gets the value of the handoffPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHandoffPartitionName() {
        return handoffPartitionName;
    }

    /**
     * Sets the value of the handoffPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHandoffPartitionName(XFkType value) {
        this.handoffPartitionName = value;
    }

    /**
     * Gets the value of the dtmfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDTMFNumber() {
        return dtmfNumber;
    }

    /**
     * Sets the value of the dtmfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDTMFNumber(XFkType value) {
        this.dtmfNumber = value;
    }

    /**
     * Gets the value of the dtmfPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDTMFPartitionName() {
        return dtmfPartitionName;
    }

    /**
     * Sets the value of the dtmfPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDTMFPartitionName(XFkType value) {
        this.dtmfPartitionName = value;
    }

}
