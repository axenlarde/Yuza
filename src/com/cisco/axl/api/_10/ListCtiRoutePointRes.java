
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCtiRoutePointRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCtiRoutePointRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/10.5}LCtiRoutePoint" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListCtiRoutePointRes", propOrder = {
    "_return"
})
public class ListCtiRoutePointRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCtiRoutePointRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCtiRoutePointRes.Return }
     *     
     */
    public ListCtiRoutePointRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCtiRoutePointRes.Return }
     *     
     */
    public void setReturn(ListCtiRoutePointRes.Return value) {
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
     *         &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/10.5}LCtiRoutePoint" maxOccurs="unbounded" minOccurs="0"/>
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
        "ctiRoutePoint"
    })
    public static class Return {

        protected List<LCtiRoutePoint> ctiRoutePoint;

        /**
         * Gets the value of the ctiRoutePoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctiRoutePoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtiRoutePoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCtiRoutePoint }
         * 
         * 
         */
        public List<LCtiRoutePoint> getCtiRoutePoint() {
            if (ctiRoutePoint == null) {
                ctiRoutePoint = new ArrayList<LCtiRoutePoint>();
            }
            return this.ctiRoutePoint;
        }

    }

}
