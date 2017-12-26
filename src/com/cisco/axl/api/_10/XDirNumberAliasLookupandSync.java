
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDirNumberAliasLookupandSync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDirNumberAliasLookupandSync">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ldapConfigName" type="{http://www.cisco.com/AXL/API/10.5}String50"/>
 *         &lt;element name="ldapManagerDisgName" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
 *         &lt;element name="ldapPassword" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
 *         &lt;element name="ldapUserSearch" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="ldapDirectoryServerUsage" type="{http://www.cisco.com/AXL/API/10.5}XLDAPDirectoryFunction" minOccurs="0"/>
 *         &lt;element name="keepAliveSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keepAliveTime" type="{http://www.cisco.com/AXL/API/10.5}XKeepAliveTimeInterval" minOccurs="0"/>
 *         &lt;element name="sipAliasSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableCachingofRecords" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="servers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="server" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ldapPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *                             &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cacheSizeforAliasLookup" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="cacheAgeforAliasLookup" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XDirNumberAliasLookupandSync", propOrder = {
    "ldapConfigName",
    "ldapManagerDisgName",
    "ldapPassword",
    "ldapUserSearch",
    "ldapDirectoryServerUsage",
    "keepAliveSearch",
    "keepAliveTime",
    "sipAliasSuffix",
    "enableCachingofRecords",
    "servers",
    "cacheSizeforAliasLookup",
    "cacheAgeforAliasLookup"
})
public class XDirNumberAliasLookupandSync {

    protected String ldapConfigName;
    protected String ldapManagerDisgName;
    protected String ldapPassword;
    protected String ldapUserSearch;
    @XmlElement(defaultValue = "DirSync")
    protected String ldapDirectoryServerUsage;
    @XmlElementRef(name = "keepAliveSearch", type = JAXBElement.class)
    protected JAXBElement<String> keepAliveSearch;
    @XmlElement(defaultValue = "5")
    protected String keepAliveTime;
    @XmlElementRef(name = "sipAliasSuffix", type = JAXBElement.class)
    protected JAXBElement<String> sipAliasSuffix;
    protected String enableCachingofRecords;
    protected XDirNumberAliasLookupandSync.Servers servers;
    @XmlElement(defaultValue = "3000")
    protected String cacheSizeforAliasLookup;
    @XmlElement(defaultValue = "0")
    protected String cacheAgeforAliasLookup;

    /**
     * Gets the value of the ldapConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapConfigName() {
        return ldapConfigName;
    }

    /**
     * Sets the value of the ldapConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapConfigName(String value) {
        this.ldapConfigName = value;
    }

    /**
     * Gets the value of the ldapManagerDisgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapManagerDisgName() {
        return ldapManagerDisgName;
    }

    /**
     * Sets the value of the ldapManagerDisgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapManagerDisgName(String value) {
        this.ldapManagerDisgName = value;
    }

    /**
     * Gets the value of the ldapPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapPassword() {
        return ldapPassword;
    }

    /**
     * Sets the value of the ldapPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapPassword(String value) {
        this.ldapPassword = value;
    }

    /**
     * Gets the value of the ldapUserSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapUserSearch() {
        return ldapUserSearch;
    }

    /**
     * Sets the value of the ldapUserSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapUserSearch(String value) {
        this.ldapUserSearch = value;
    }

    /**
     * Gets the value of the ldapDirectoryServerUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapDirectoryServerUsage() {
        return ldapDirectoryServerUsage;
    }

    /**
     * Sets the value of the ldapDirectoryServerUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapDirectoryServerUsage(String value) {
        this.ldapDirectoryServerUsage = value;
    }

    /**
     * Gets the value of the keepAliveSearch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeepAliveSearch() {
        return keepAliveSearch;
    }

    /**
     * Sets the value of the keepAliveSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeepAliveSearch(JAXBElement<String> value) {
        this.keepAliveSearch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the keepAliveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Sets the value of the keepAliveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepAliveTime(String value) {
        this.keepAliveTime = value;
    }

    /**
     * Gets the value of the sipAliasSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSipAliasSuffix() {
        return sipAliasSuffix;
    }

    /**
     * Sets the value of the sipAliasSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSipAliasSuffix(JAXBElement<String> value) {
        this.sipAliasSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the enableCachingofRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCachingofRecords() {
        return enableCachingofRecords;
    }

    /**
     * Sets the value of the enableCachingofRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCachingofRecords(String value) {
        this.enableCachingofRecords = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link XDirNumberAliasLookupandSync.Servers }
     *     
     */
    public XDirNumberAliasLookupandSync.Servers getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirNumberAliasLookupandSync.Servers }
     *     
     */
    public void setServers(XDirNumberAliasLookupandSync.Servers value) {
        this.servers = value;
    }

    /**
     * Gets the value of the cacheSizeforAliasLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheSizeforAliasLookup() {
        return cacheSizeforAliasLookup;
    }

    /**
     * Sets the value of the cacheSizeforAliasLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheSizeforAliasLookup(String value) {
        this.cacheSizeforAliasLookup = value;
    }

    /**
     * Gets the value of the cacheAgeforAliasLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheAgeforAliasLookup() {
        return cacheAgeforAliasLookup;
    }

    /**
     * Sets the value of the cacheAgeforAliasLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheAgeforAliasLookup(String value) {
        this.cacheAgeforAliasLookup = value;
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
     *         &lt;element name="server" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ldapPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
     *                   &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "server"
    })
    public static class Servers {

        protected List<XDirNumberAliasLookupandSync.Servers.Server> server;

        /**
         * Gets the value of the server property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the server property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDirNumberAliasLookupandSync.Servers.Server }
         * 
         * 
         */
        public List<XDirNumberAliasLookupandSync.Servers.Server> getServer() {
            if (server == null) {
                server = new ArrayList<XDirNumberAliasLookupandSync.Servers.Server>();
            }
            return this.server;
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
         *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ldapPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
         *         &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
            "hostName",
            "ldapPort",
            "sslEnabled"
        })
        public static class Server {

            protected String hostName;
            protected String ldapPort;
            protected String sslEnabled;

            /**
             * Gets the value of the hostName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHostName() {
                return hostName;
            }

            /**
             * Sets the value of the hostName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHostName(String value) {
                this.hostName = value;
            }

            /**
             * Gets the value of the ldapPort property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLdapPort() {
                return ldapPort;
            }

            /**
             * Sets the value of the ldapPort property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLdapPort(String value) {
                this.ldapPort = value;
            }

            /**
             * Gets the value of the sslEnabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSslEnabled() {
                return sslEnabled;
            }

            /**
             * Sets the value of the sslEnabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSslEnabled(String value) {
                this.sslEnabled = value;
            }

        }

    }

}
