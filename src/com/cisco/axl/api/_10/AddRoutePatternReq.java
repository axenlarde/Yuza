
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRoutePatternReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routePattern" type="{http://www.cisco.com/AXL/API/10.5}XRoutePattern"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRoutePatternReq", propOrder = {
    "routePattern"
})
public class AddRoutePatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRoutePattern routePattern;

    /**
     * Gets the value of the routePattern property.
     * 
     * @return
     *     possible object is
     *     {@link XRoutePattern }
     *     
     */
    public XRoutePattern getRoutePattern() {
        return routePattern;
    }

    /**
     * Sets the value of the routePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRoutePattern }
     *     
     */
    public void setRoutePattern(XRoutePattern value) {
        this.routePattern = value;
    }

}
