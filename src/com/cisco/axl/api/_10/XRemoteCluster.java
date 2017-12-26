
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRemoteCluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRemoteCluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="clusterId" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullyQualifiedName" type="{http://www.cisco.com/AXL/API/10.5}String50"/>
 *         &lt;element name="emcc" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="rsvpAgent" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="tftp" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="lbm" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="uds" type="{http://www.cisco.com/AXL/API/10.5}XRemoteClusterMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRemoteCluster", propOrder = {
    "clusterId",
    "description",
    "fullyQualifiedName",
    "emcc",
    "pstnAccess",
    "rsvpAgent",
    "tftp",
    "lbm",
    "uds"
})
public class XRemoteCluster {

    protected String clusterId;
    protected String description;
    protected String fullyQualifiedName;
    protected XRemoteClusterMember emcc;
    protected XRemoteClusterMember pstnAccess;
    protected XRemoteClusterMember rsvpAgent;
    protected XRemoteClusterMember tftp;
    protected XRemoteClusterMember lbm;
    protected XRemoteClusterMember uds;

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterId(String value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
    }

    /**
     * Gets the value of the emcc property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getEmcc() {
        return emcc;
    }

    /**
     * Sets the value of the emcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setEmcc(XRemoteClusterMember value) {
        this.emcc = value;
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setPstnAccess(XRemoteClusterMember value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the rsvpAgent property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getRsvpAgent() {
        return rsvpAgent;
    }

    /**
     * Sets the value of the rsvpAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setRsvpAgent(XRemoteClusterMember value) {
        this.rsvpAgent = value;
    }

    /**
     * Gets the value of the tftp property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getTftp() {
        return tftp;
    }

    /**
     * Sets the value of the tftp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setTftp(XRemoteClusterMember value) {
        this.tftp = value;
    }

    /**
     * Gets the value of the lbm property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getLbm() {
        return lbm;
    }

    /**
     * Sets the value of the lbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setLbm(XRemoteClusterMember value) {
        this.lbm = value;
    }

    /**
     * Gets the value of the uds property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public XRemoteClusterMember getUds() {
        return uds;
    }

    /**
     * Sets the value of the uds property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteClusterMember }
     *     
     */
    public void setUds(XRemoteClusterMember value) {
        this.uds = value;
    }

}
