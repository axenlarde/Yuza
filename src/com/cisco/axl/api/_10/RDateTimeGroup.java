
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDateTimeGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDateTimeGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/10.5}XTimeZone" minOccurs="0"/>
 *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateformat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNtpReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="selectedPhoneNtpReference" type="{http://www.cisco.com/AXL/API/10.5}RDateTimeGroupNtpReference" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RDateTimeGroup", propOrder = {
    "name",
    "timeZone",
    "separator",
    "dateformat",
    "timeFormat",
    "phoneNtpReferences"
})
public class RDateTimeGroup {

    protected String name;
    protected String timeZone;
    protected String separator;
    protected String dateformat;
    protected String timeFormat;
    protected RDateTimeGroup.PhoneNtpReferences phoneNtpReferences;
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
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the dateformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateformat() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateformat(String value) {
        this.dateformat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the phoneNtpReferences property.
     * 
     * @return
     *     possible object is
     *     {@link RDateTimeGroup.PhoneNtpReferences }
     *     
     */
    public RDateTimeGroup.PhoneNtpReferences getPhoneNtpReferences() {
        return phoneNtpReferences;
    }

    /**
     * Sets the value of the phoneNtpReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDateTimeGroup.PhoneNtpReferences }
     *     
     */
    public void setPhoneNtpReferences(RDateTimeGroup.PhoneNtpReferences value) {
        this.phoneNtpReferences = value;
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
     *         &lt;element name="selectedPhoneNtpReference" type="{http://www.cisco.com/AXL/API/10.5}RDateTimeGroupNtpReference" maxOccurs="unbounded" minOccurs="0"/>
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
        "selectedPhoneNtpReference"
    })
    public static class PhoneNtpReferences {

        protected List<RDateTimeGroupNtpReference> selectedPhoneNtpReference;

        /**
         * Gets the value of the selectedPhoneNtpReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedPhoneNtpReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedPhoneNtpReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RDateTimeGroupNtpReference }
         * 
         * 
         */
        public List<RDateTimeGroupNtpReference> getSelectedPhoneNtpReference() {
            if (selectedPhoneNtpReference == null) {
                selectedPhoneNtpReference = new ArrayList<RDateTimeGroupNtpReference>();
            }
            return this.selectedPhoneNtpReference;
        }

    }

}
