
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServiceProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}RServiceProfile"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceProfileRes", propOrder = {
    "_return"
})
public class GetServiceProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetServiceProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceProfileRes.Return }
     *     
     */
    public GetServiceProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceProfileRes.Return }
     *     
     */
    public void setReturn(GetServiceProfileRes.Return value) {
        this._return = value;
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
     *       &lt;sequence>
     *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}RServiceProfile"/>
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
        "serviceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RServiceProfile serviceProfile;

        /**
         * Gets the value of the serviceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RServiceProfile }
         *     
         */
        public RServiceProfile getServiceProfile() {
            return serviceProfile;
        }

        /**
         * Sets the value of the serviceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RServiceProfile }
         *     
         */
        public void setServiceProfile(RServiceProfile value) {
            this.serviceProfile = value;
        }

    }

}
