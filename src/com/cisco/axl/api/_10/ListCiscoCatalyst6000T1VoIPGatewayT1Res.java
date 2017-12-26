
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCiscoCatalyst6000T1VoIPGatewayT1Res complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCiscoCatalyst6000T1VoIPGatewayT1Res">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ciscoCatalyst6000T1VoIPGatewayT1" type="{http://www.cisco.com/AXL/API/10.5}LCiscoCatalyst6000T1VoIPGatewayT1" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListCiscoCatalyst6000T1VoIPGatewayT1Res", propOrder = {
    "_return"
})
public class ListCiscoCatalyst6000T1VoIPGatewayT1Res
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCiscoCatalyst6000T1VoIPGatewayT1Res.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayT1Res.Return }
     *     
     */
    public ListCiscoCatalyst6000T1VoIPGatewayT1Res.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayT1Res.Return }
     *     
     */
    public void setReturn(ListCiscoCatalyst6000T1VoIPGatewayT1Res.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayT1" type="{http://www.cisco.com/AXL/API/10.5}LCiscoCatalyst6000T1VoIPGatewayT1" maxOccurs="unbounded" minOccurs="0"/>
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
        "ciscoCatalyst6000T1VoIPGatewayT1"
    })
    public static class Return {

        protected List<LCiscoCatalyst6000T1VoIPGatewayT1> ciscoCatalyst6000T1VoIPGatewayT1;

        /**
         * Gets the value of the ciscoCatalyst6000T1VoIPGatewayT1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ciscoCatalyst6000T1VoIPGatewayT1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCiscoCatalyst6000T1VoIPGatewayT1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCiscoCatalyst6000T1VoIPGatewayT1 }
         * 
         * 
         */
        public List<LCiscoCatalyst6000T1VoIPGatewayT1> getCiscoCatalyst6000T1VoIPGatewayT1() {
            if (ciscoCatalyst6000T1VoIPGatewayT1 == null) {
                ciscoCatalyst6000T1VoIPGatewayT1 = new ArrayList<LCiscoCatalyst6000T1VoIPGatewayT1>();
            }
            return this.ciscoCatalyst6000T1VoIPGatewayT1;
        }

    }

}
