
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XResourcePriorityNamespaceListMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XResourcePriorityNamespaceListMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="resourcePriorityNamespaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XResourcePriorityNamespaceListMember", propOrder = {
    "resourcePriorityNamespaceName",
    "index"
})
public class XResourcePriorityNamespaceListMember {

    protected XFkType resourcePriorityNamespaceName;
    protected String index;

    /**
     * Gets the value of the resourcePriorityNamespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getResourcePriorityNamespaceName() {
        return resourcePriorityNamespaceName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setResourcePriorityNamespaceName(XFkType value) {
        this.resourcePriorityNamespaceName = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
