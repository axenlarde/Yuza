
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XH323TrunkDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XH323TrunkDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="addressIpv4" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XH323TrunkDestination", propOrder = {
    "addressIpv4",
    "sortOrder"
})
public class XH323TrunkDestination {

    protected String addressIpv4;
    protected String sortOrder;

    /**
     * Gets the value of the addressIpv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressIpv4() {
        return addressIpv4;
    }

    /**
     * Sets the value of the addressIpv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressIpv4(String value) {
        this.addressIpv4 = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

}
