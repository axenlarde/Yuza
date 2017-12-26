
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddResourcePriorityNamespaceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddResourcePriorityNamespaceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/10.5}XResourcePriorityNamespace"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddResourcePriorityNamespaceReq", propOrder = {
    "resourcePriorityNamespace"
})
public class AddResourcePriorityNamespaceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XResourcePriorityNamespace resourcePriorityNamespace;

    /**
     * Gets the value of the resourcePriorityNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link XResourcePriorityNamespace }
     *     
     */
    public XResourcePriorityNamespace getResourcePriorityNamespace() {
        return resourcePriorityNamespace;
    }

    /**
     * Sets the value of the resourcePriorityNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XResourcePriorityNamespace }
     *     
     */
    public void setResourcePriorityNamespace(XResourcePriorityNamespace value) {
        this.resourcePriorityNamespace = value;
    }

}
