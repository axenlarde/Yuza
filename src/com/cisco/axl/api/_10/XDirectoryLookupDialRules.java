
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDirectoryLookupDialRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDirectoryLookupDialRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberBeginWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="digitsToBeRemoved" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="prefixPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XDirectoryLookupDialRules", propOrder = {
    "name",
    "description",
    "numberBeginWith",
    "numberOfDigits",
    "digitsToBeRemoved",
    "prefixPattern",
    "priority"
})
public class XDirectoryLookupDialRules {

    protected String name;
    protected String description;
    protected String numberBeginWith;
    @XmlElement(defaultValue = "0")
    protected String numberOfDigits;
    @XmlElement(defaultValue = "0")
    protected String digitsToBeRemoved;
    protected String prefixPattern;
    @XmlElement(defaultValue = "0")
    protected String priority;

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
     * Gets the value of the numberBeginWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBeginWith() {
        return numberBeginWith;
    }

    /**
     * Sets the value of the numberBeginWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBeginWith(String value) {
        this.numberBeginWith = value;
    }

    /**
     * Gets the value of the numberOfDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfDigits() {
        return numberOfDigits;
    }

    /**
     * Sets the value of the numberOfDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfDigits(String value) {
        this.numberOfDigits = value;
    }

    /**
     * Gets the value of the digitsToBeRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitsToBeRemoved() {
        return digitsToBeRemoved;
    }

    /**
     * Sets the value of the digitsToBeRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitsToBeRemoved(String value) {
        this.digitsToBeRemoved = value;
    }

    /**
     * Gets the value of the prefixPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixPattern() {
        return prefixPattern;
    }

    /**
     * Sets the value of the prefixPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixPattern(String value) {
        this.prefixPattern = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

}
