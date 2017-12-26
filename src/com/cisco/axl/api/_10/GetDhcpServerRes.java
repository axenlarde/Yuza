
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDhcpServerRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDhcpServerRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dhcpServer" type="{http://www.cisco.com/AXL/API/10.5}RDhcpServer"/>
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
@XmlType(name = "GetDhcpServerRes", propOrder = {
    "_return"
})
public class GetDhcpServerRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDhcpServerRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDhcpServerRes.Return }
     *     
     */
    public GetDhcpServerRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDhcpServerRes.Return }
     *     
     */
    public void setReturn(GetDhcpServerRes.Return value) {
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
     *         &lt;element name="dhcpServer" type="{http://www.cisco.com/AXL/API/10.5}RDhcpServer"/>
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
        "dhcpServer"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDhcpServer dhcpServer;

        /**
         * Gets the value of the dhcpServer property.
         * 
         * @return
         *     possible object is
         *     {@link RDhcpServer }
         *     
         */
        public RDhcpServer getDhcpServer() {
            return dhcpServer;
        }

        /**
         * Sets the value of the dhcpServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDhcpServer }
         *     
         */
        public void setDhcpServer(RDhcpServer value) {
            this.dhcpServer = value;
        }

    }

}
