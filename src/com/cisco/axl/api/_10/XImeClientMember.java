
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XImeClientMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XImeClientMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="enrolledPatternGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XImeClientMember", propOrder = {
    "enrolledPatternGroupName"
})
public class XImeClientMember {

    protected XFkType enrolledPatternGroupName;

    /**
     * Gets the value of the enrolledPatternGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getEnrolledPatternGroupName() {
        return enrolledPatternGroupName;
    }

    /**
     * Sets the value of the enrolledPatternGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setEnrolledPatternGroupName(XFkType value) {
        this.enrolledPatternGroupName = value;
    }

}
