
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RBLFDirectedCallPark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RBLFDirectedCallPark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="label" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="directedCallParkId" type="{http://www.cisco.com/AXL/API/10.5}XUUID" minOccurs="0"/>
 *           &lt;element name="directedCallParkDnAndPartition" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                     &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RBLFDirectedCallPark", propOrder = {
    "label",
    "directedCallParkId",
    "directedCallParkDnAndPartition",
    "index"
})
public class RBLFDirectedCallPark {

    protected String label;
    protected String directedCallParkId;
    protected RBLFDirectedCallPark.DirectedCallParkDnAndPartition directedCallParkDnAndPartition;
    protected String index;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the directedCallParkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallParkId() {
        return directedCallParkId;
    }

    /**
     * Sets the value of the directedCallParkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallParkId(String value) {
        this.directedCallParkId = value;
    }

    /**
     * Gets the value of the directedCallParkDnAndPartition property.
     * 
     * @return
     *     possible object is
     *     {@link RBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public RBLFDirectedCallPark.DirectedCallParkDnAndPartition getDirectedCallParkDnAndPartition() {
        return directedCallParkDnAndPartition;
    }

    /**
     * Sets the value of the directedCallParkDnAndPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public void setDirectedCallParkDnAndPartition(RBLFDirectedCallPark.DirectedCallParkDnAndPartition value) {
        this.directedCallParkDnAndPartition = value;
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
     *         &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
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
        "dnPattern",
        "routePartitionName"
    })
    public static class DirectedCallParkDnAndPartition {

        protected String dnPattern;
        protected XFkType routePartitionName;

        /**
         * Gets the value of the dnPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDnPattern() {
            return dnPattern;
        }

        /**
         * Sets the value of the dnPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDnPattern(String value) {
            this.dnPattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartitionName(XFkType value) {
            this.routePartitionName = value;
        }

    }

}
