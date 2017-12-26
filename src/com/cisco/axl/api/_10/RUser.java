
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="associatedDevices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="device" type="{http://www.cisco.com/AXL/API/10.5}String50" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="associatedPc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100" minOccurs="0"/>
 *                             &lt;element name="userRoles" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="enableCti" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="digestCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileVoiceAccess" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="maxDeskPickupWaitTime" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="remoteDestinationLimit" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="associatedRemoteDestinationProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="remoteDestinationProfile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="passwordCredentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pinCredentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pinCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="pinCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredTimeChanged" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pinCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryDevice" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="associatedTodAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="todAccess" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="enableEmcc" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="associatedCapfProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="capfProfileInstanceId" type="{http://www.cisco.com/AXL/API/10.5}String128" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ctiControlledDeviceProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="numericUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mlppPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customUserFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/10.5}RUserCustomUserField" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="homeCluster" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="imAndPresenceEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="lineAppearanceAssociationForPresences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="lineAppearanceAssociationForPresence" type="{http://www.cisco.com/AXL/API/10.5}RLineAppearanceAssociationForPresence" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="directoryUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}RExtension" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selfService" type="{http://www.cisco.com/AXL/API/10.5}UniqueString50" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="calendarPresence" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ldapDirectoryName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameDialing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipccExtension" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="convertUserAccount" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.cisco.com/AXL/API/10.5}XAccountType" minOccurs="0"/>
 *         &lt;element name="authenticationType" type="{http://www.cisco.com/AXL/API/10.5}XAuthenticationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RUser", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "userid",
    "password",
    "pin",
    "mailid",
    "department",
    "manager",
    "userLocale",
    "associatedDevices",
    "primaryExtension",
    "associatedPc",
    "associatedGroups",
    "enableCti",
    "digestCredentials",
    "phoneProfiles",
    "defaultProfile",
    "presenceGroupName",
    "subscribeCallingSearchSpaceName",
    "enableMobility",
    "enableMobileVoiceAccess",
    "maxDeskPickupWaitTime",
    "remoteDestinationLimit",
    "associatedRemoteDestinationProfiles",
    "passwordCredentials",
    "pinCredentials",
    "primaryDevice",
    "associatedTodAccess",
    "status",
    "enableEmcc",
    "associatedCapfProfiles",
    "ctiControlledDeviceProfiles",
    "patternPrecedence",
    "numericUserId",
    "mlppPassword",
    "customUserFields",
    "homeCluster",
    "imAndPresenceEnable",
    "serviceProfile",
    "lineAppearanceAssociationForPresences",
    "directoryUri",
    "telephoneNumber",
    "title",
    "mobileNumber",
    "homeNumber",
    "pagerNumber",
    "extensionsInfo",
    "selfService",
    "userProfile",
    "calendarPresence",
    "ldapDirectoryName",
    "userIdentity",
    "nameDialing",
    "ipccExtension",
    "convertUserAccount",
    "accountType",
    "authenticationType"
})
public class RUser {

    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String userid;
    protected String password;
    protected String pin;
    protected String mailid;
    protected String department;
    protected String manager;
    protected String userLocale;
    protected RUser.AssociatedDevices associatedDevices;
    protected RUser.PrimaryExtension primaryExtension;
    protected String associatedPc;
    protected RUser.AssociatedGroups associatedGroups;
    protected String enableCti;
    protected String digestCredentials;
    protected RUser.PhoneProfiles phoneProfiles;
    protected XFkType defaultProfile;
    protected XFkType presenceGroupName;
    protected XFkType subscribeCallingSearchSpaceName;
    protected String enableMobility;
    protected String enableMobileVoiceAccess;
    protected String maxDeskPickupWaitTime;
    protected String remoteDestinationLimit;
    protected RUser.AssociatedRemoteDestinationProfiles associatedRemoteDestinationProfiles;
    protected RUser.PasswordCredentials passwordCredentials;
    protected RUser.PinCredentials pinCredentials;
    protected XFkType primaryDevice;
    protected RUser.AssociatedTodAccess associatedTodAccess;
    protected String status;
    protected String enableEmcc;
    protected RUser.AssociatedCapfProfiles associatedCapfProfiles;
    protected RUser.CtiControlledDeviceProfiles ctiControlledDeviceProfiles;
    protected String patternPrecedence;
    protected String numericUserId;
    protected String mlppPassword;
    protected RUser.CustomUserFields customUserFields;
    protected String homeCluster;
    protected String imAndPresenceEnable;
    protected XFkType serviceProfile;
    protected RUser.LineAppearanceAssociationForPresences lineAppearanceAssociationForPresences;
    protected String directoryUri;
    protected String telephoneNumber;
    protected String title;
    protected String mobileNumber;
    protected String homeNumber;
    protected String pagerNumber;
    protected RUser.ExtensionsInfo extensionsInfo;
    protected String selfService;
    protected XFkType userProfile;
    protected String calendarPresence;
    protected XFkType ldapDirectoryName;
    protected String userIdentity;
    protected String nameDialing;
    protected XFkType ipccExtension;
    protected XFkType convertUserAccount;
    protected String accountType;
    protected String authenticationType;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the mailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * Sets the value of the mailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailid(String value) {
        this.mailid = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.AssociatedDevices }
     *     
     */
    public RUser.AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(RUser.AssociatedDevices value) {
        this.associatedDevices = value;
    }

    /**
     * Gets the value of the primaryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.PrimaryExtension }
     *     
     */
    public RUser.PrimaryExtension getPrimaryExtension() {
        return primaryExtension;
    }

    /**
     * Sets the value of the primaryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.PrimaryExtension }
     *     
     */
    public void setPrimaryExtension(RUser.PrimaryExtension value) {
        this.primaryExtension = value;
    }

    /**
     * Gets the value of the associatedPc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedPc() {
        return associatedPc;
    }

    /**
     * Sets the value of the associatedPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedPc(String value) {
        this.associatedPc = value;
    }

    /**
     * Gets the value of the associatedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.AssociatedGroups }
     *     
     */
    public RUser.AssociatedGroups getAssociatedGroups() {
        return associatedGroups;
    }

    /**
     * Sets the value of the associatedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.AssociatedGroups }
     *     
     */
    public void setAssociatedGroups(RUser.AssociatedGroups value) {
        this.associatedGroups = value;
    }

    /**
     * Gets the value of the enableCti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCti() {
        return enableCti;
    }

    /**
     * Sets the value of the enableCti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCti(String value) {
        this.enableCti = value;
    }

    /**
     * Gets the value of the digestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestCredentials() {
        return digestCredentials;
    }

    /**
     * Sets the value of the digestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestCredentials(String value) {
        this.digestCredentials = value;
    }

    /**
     * Gets the value of the phoneProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.PhoneProfiles }
     *     
     */
    public RUser.PhoneProfiles getPhoneProfiles() {
        return phoneProfiles;
    }

    /**
     * Sets the value of the phoneProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.PhoneProfiles }
     *     
     */
    public void setPhoneProfiles(RUser.PhoneProfiles value) {
        this.phoneProfiles = value;
    }

    /**
     * Gets the value of the defaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultProfile() {
        return defaultProfile;
    }

    /**
     * Sets the value of the defaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultProfile(XFkType value) {
        this.defaultProfile = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSubscribeCallingSearchSpaceName() {
        return subscribeCallingSearchSpaceName;
    }

    /**
     * Sets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSubscribeCallingSearchSpaceName(XFkType value) {
        this.subscribeCallingSearchSpaceName = value;
    }

    /**
     * Gets the value of the enableMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobility() {
        return enableMobility;
    }

    /**
     * Sets the value of the enableMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobility(String value) {
        this.enableMobility = value;
    }

    /**
     * Gets the value of the enableMobileVoiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobileVoiceAccess() {
        return enableMobileVoiceAccess;
    }

    /**
     * Sets the value of the enableMobileVoiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobileVoiceAccess(String value) {
        this.enableMobileVoiceAccess = value;
    }

    /**
     * Gets the value of the maxDeskPickupWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDeskPickupWaitTime() {
        return maxDeskPickupWaitTime;
    }

    /**
     * Sets the value of the maxDeskPickupWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDeskPickupWaitTime(String value) {
        this.maxDeskPickupWaitTime = value;
    }

    /**
     * Gets the value of the remoteDestinationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDestinationLimit() {
        return remoteDestinationLimit;
    }

    /**
     * Sets the value of the remoteDestinationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDestinationLimit(String value) {
        this.remoteDestinationLimit = value;
    }

    /**
     * Gets the value of the associatedRemoteDestinationProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.AssociatedRemoteDestinationProfiles }
     *     
     */
    public RUser.AssociatedRemoteDestinationProfiles getAssociatedRemoteDestinationProfiles() {
        return associatedRemoteDestinationProfiles;
    }

    /**
     * Sets the value of the associatedRemoteDestinationProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.AssociatedRemoteDestinationProfiles }
     *     
     */
    public void setAssociatedRemoteDestinationProfiles(RUser.AssociatedRemoteDestinationProfiles value) {
        this.associatedRemoteDestinationProfiles = value;
    }

    /**
     * Gets the value of the passwordCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.PasswordCredentials }
     *     
     */
    public RUser.PasswordCredentials getPasswordCredentials() {
        return passwordCredentials;
    }

    /**
     * Sets the value of the passwordCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.PasswordCredentials }
     *     
     */
    public void setPasswordCredentials(RUser.PasswordCredentials value) {
        this.passwordCredentials = value;
    }

    /**
     * Gets the value of the pinCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.PinCredentials }
     *     
     */
    public RUser.PinCredentials getPinCredentials() {
        return pinCredentials;
    }

    /**
     * Sets the value of the pinCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.PinCredentials }
     *     
     */
    public void setPinCredentials(RUser.PinCredentials value) {
        this.pinCredentials = value;
    }

    /**
     * Gets the value of the primaryDevice property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryDevice() {
        return primaryDevice;
    }

    /**
     * Sets the value of the primaryDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryDevice(XFkType value) {
        this.primaryDevice = value;
    }

    /**
     * Gets the value of the associatedTodAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.AssociatedTodAccess }
     *     
     */
    public RUser.AssociatedTodAccess getAssociatedTodAccess() {
        return associatedTodAccess;
    }

    /**
     * Sets the value of the associatedTodAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.AssociatedTodAccess }
     *     
     */
    public void setAssociatedTodAccess(RUser.AssociatedTodAccess value) {
        this.associatedTodAccess = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the enableEmcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableEmcc() {
        return enableEmcc;
    }

    /**
     * Sets the value of the enableEmcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableEmcc(String value) {
        this.enableEmcc = value;
    }

    /**
     * Gets the value of the associatedCapfProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.AssociatedCapfProfiles }
     *     
     */
    public RUser.AssociatedCapfProfiles getAssociatedCapfProfiles() {
        return associatedCapfProfiles;
    }

    /**
     * Sets the value of the associatedCapfProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.AssociatedCapfProfiles }
     *     
     */
    public void setAssociatedCapfProfiles(RUser.AssociatedCapfProfiles value) {
        this.associatedCapfProfiles = value;
    }

    /**
     * Gets the value of the ctiControlledDeviceProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.CtiControlledDeviceProfiles }
     *     
     */
    public RUser.CtiControlledDeviceProfiles getCtiControlledDeviceProfiles() {
        return ctiControlledDeviceProfiles;
    }

    /**
     * Sets the value of the ctiControlledDeviceProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.CtiControlledDeviceProfiles }
     *     
     */
    public void setCtiControlledDeviceProfiles(RUser.CtiControlledDeviceProfiles value) {
        this.ctiControlledDeviceProfiles = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPrecedence(String value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the numericUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericUserId() {
        return numericUserId;
    }

    /**
     * Sets the value of the numericUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericUserId(String value) {
        this.numericUserId = value;
    }

    /**
     * Gets the value of the mlppPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppPassword() {
        return mlppPassword;
    }

    /**
     * Sets the value of the mlppPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppPassword(String value) {
        this.mlppPassword = value;
    }

    /**
     * Gets the value of the customUserFields property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.CustomUserFields }
     *     
     */
    public RUser.CustomUserFields getCustomUserFields() {
        return customUserFields;
    }

    /**
     * Sets the value of the customUserFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.CustomUserFields }
     *     
     */
    public void setCustomUserFields(RUser.CustomUserFields value) {
        this.customUserFields = value;
    }

    /**
     * Gets the value of the homeCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCluster() {
        return homeCluster;
    }

    /**
     * Sets the value of the homeCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCluster(String value) {
        this.homeCluster = value;
    }

    /**
     * Gets the value of the imAndPresenceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAndPresenceEnable() {
        return imAndPresenceEnable;
    }

    /**
     * Sets the value of the imAndPresenceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAndPresenceEnable(String value) {
        this.imAndPresenceEnable = value;
    }

    /**
     * Gets the value of the serviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setServiceProfile(XFkType value) {
        this.serviceProfile = value;
    }

    /**
     * Gets the value of the lineAppearanceAssociationForPresences property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.LineAppearanceAssociationForPresences }
     *     
     */
    public RUser.LineAppearanceAssociationForPresences getLineAppearanceAssociationForPresences() {
        return lineAppearanceAssociationForPresences;
    }

    /**
     * Sets the value of the lineAppearanceAssociationForPresences property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.LineAppearanceAssociationForPresences }
     *     
     */
    public void setLineAppearanceAssociationForPresences(RUser.LineAppearanceAssociationForPresences value) {
        this.lineAppearanceAssociationForPresences = value;
    }

    /**
     * Gets the value of the directoryUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryUri() {
        return directoryUri;
    }

    /**
     * Sets the value of the directoryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryUri(String value) {
        this.directoryUri = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the homeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNumber() {
        return homeNumber;
    }

    /**
     * Sets the value of the homeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNumber(String value) {
        this.homeNumber = value;
    }

    /**
     * Gets the value of the pagerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerNumber() {
        return pagerNumber;
    }

    /**
     * Sets the value of the pagerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerNumber(String value) {
        this.pagerNumber = value;
    }

    /**
     * Gets the value of the extensionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RUser.ExtensionsInfo }
     *     
     */
    public RUser.ExtensionsInfo getExtensionsInfo() {
        return extensionsInfo;
    }

    /**
     * Sets the value of the extensionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUser.ExtensionsInfo }
     *     
     */
    public void setExtensionsInfo(RUser.ExtensionsInfo value) {
        this.extensionsInfo = value;
    }

    /**
     * Gets the value of the selfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfService() {
        return selfService;
    }

    /**
     * Sets the value of the selfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfService(String value) {
        this.selfService = value;
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUserProfile(XFkType value) {
        this.userProfile = value;
    }

    /**
     * Gets the value of the calendarPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarPresence() {
        return calendarPresence;
    }

    /**
     * Sets the value of the calendarPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarPresence(String value) {
        this.calendarPresence = value;
    }

    /**
     * Gets the value of the ldapDirectoryName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLdapDirectoryName() {
        return ldapDirectoryName;
    }

    /**
     * Sets the value of the ldapDirectoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLdapDirectoryName(XFkType value) {
        this.ldapDirectoryName = value;
    }

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentity(String value) {
        this.userIdentity = value;
    }

    /**
     * Gets the value of the nameDialing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDialing() {
        return nameDialing;
    }

    /**
     * Sets the value of the nameDialing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDialing(String value) {
        this.nameDialing = value;
    }

    /**
     * Gets the value of the ipccExtension property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getIpccExtension() {
        return ipccExtension;
    }

    /**
     * Sets the value of the ipccExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setIpccExtension(XFkType value) {
        this.ipccExtension = value;
    }

    /**
     * Gets the value of the convertUserAccount property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getConvertUserAccount() {
        return convertUserAccount;
    }

    /**
     * Sets the value of the convertUserAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setConvertUserAccount(XFkType value) {
        this.convertUserAccount = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
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
     *         &lt;element name="capfProfileInstanceId" type="{http://www.cisco.com/AXL/API/10.5}String128" maxOccurs="unbounded" minOccurs="0"/>
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
        "capfProfileInstanceId"
    })
    public static class AssociatedCapfProfiles {

        protected List<String> capfProfileInstanceId;

        /**
         * Gets the value of the capfProfileInstanceId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capfProfileInstanceId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapfProfileInstanceId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCapfProfileInstanceId() {
            if (capfProfileInstanceId == null) {
                capfProfileInstanceId = new ArrayList<String>();
            }
            return this.capfProfileInstanceId;
        }

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
     *         &lt;element name="device" type="{http://www.cisco.com/AXL/API/10.5}String50" maxOccurs="unbounded" minOccurs="0"/>
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
        "device"
    })
    public static class AssociatedDevices {

        protected List<String> device;

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDevice() {
            if (device == null) {
                device = new ArrayList<String>();
            }
            return this.device;
        }

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
     *         &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100" minOccurs="0"/>
     *                   &lt;element name="userRoles" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
        "userGroup"
    })
    public static class AssociatedGroups {

        protected List<RUser.AssociatedGroups.UserGroup> userGroup;

        /**
         * Gets the value of the userGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUser.AssociatedGroups.UserGroup }
         * 
         * 
         */
        public List<RUser.AssociatedGroups.UserGroup> getUserGroup() {
            if (userGroup == null) {
                userGroup = new ArrayList<RUser.AssociatedGroups.UserGroup>();
            }
            return this.userGroup;
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
         *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100" minOccurs="0"/>
         *         &lt;element name="userRoles" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
            "name",
            "userRoles"
        })
        public static class UserGroup {

            protected String name;
            protected RUser.AssociatedGroups.UserGroup.UserRoles userRoles;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the userRoles property.
             * 
             * @return
             *     possible object is
             *     {@link RUser.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public RUser.AssociatedGroups.UserGroup.UserRoles getUserRoles() {
                return userRoles;
            }

            /**
             * Sets the value of the userRoles property.
             * 
             * @param value
             *     allowed object is
             *     {@link RUser.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public void setUserRoles(RUser.AssociatedGroups.UserGroup.UserRoles value) {
                this.userRoles = value;
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
             *         &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
                "userRole"
            })
            public static class UserRoles {

                protected List<String> userRole;

                /**
                 * Gets the value of the userRole property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the userRole property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUserRole().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getUserRole() {
                    if (userRole == null) {
                        userRole = new ArrayList<String>();
                    }
                    return this.userRole;
                }

            }

        }

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
     *         &lt;element name="remoteDestinationProfile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "remoteDestinationProfile"
    })
    public static class AssociatedRemoteDestinationProfiles {

        protected List<String> remoteDestinationProfile;

        /**
         * Gets the value of the remoteDestinationProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remoteDestinationProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemoteDestinationProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRemoteDestinationProfile() {
            if (remoteDestinationProfile == null) {
                remoteDestinationProfile = new ArrayList<String>();
            }
            return this.remoteDestinationProfile;
        }

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
     *         &lt;element name="todAccess" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "todAccess"
    })
    public static class AssociatedTodAccess {

        protected List<String> todAccess;

        /**
         * Gets the value of the todAccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the todAccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTodAccess().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTodAccess() {
            if (todAccess == null) {
                todAccess = new ArrayList<String>();
            }
            return this.todAccess;
        }

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
     *         &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded" minOccurs="0"/>
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
        "profileName"
    })
    public static class CtiControlledDeviceProfiles {

        protected List<XFkType> profileName;

        /**
         * Gets the value of the profileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XFkType }
         * 
         * 
         */
        public List<XFkType> getProfileName() {
            if (profileName == null) {
                profileName = new ArrayList<XFkType>();
            }
            return this.profileName;
        }

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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/10.5}RUserCustomUserField" maxOccurs="5" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customUserField"
    })
    public static class CustomUserFields {

        protected List<RUserCustomUserField> customUserField;

        /**
         * Gets the value of the customUserField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customUserField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomUserField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUserCustomUserField }
         * 
         * 
         */
        public List<RUserCustomUserField> getCustomUserField() {
            if (customUserField == null) {
                customUserField = new ArrayList<RUserCustomUserField>();
            }
            return this.customUserField;
        }

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
     *         &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}RExtension" maxOccurs="unbounded" minOccurs="0"/>
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
        "extension"
    })
    public static class ExtensionsInfo {

        protected List<RExtension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RExtension }
         * 
         * 
         */
        public List<RExtension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<RExtension>();
            }
            return this.extension;
        }

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
     *         &lt;element name="lineAppearanceAssociationForPresence" type="{http://www.cisco.com/AXL/API/10.5}RLineAppearanceAssociationForPresence" maxOccurs="unbounded" minOccurs="0"/>
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
        "lineAppearanceAssociationForPresence"
    })
    public static class LineAppearanceAssociationForPresences {

        protected List<RLineAppearanceAssociationForPresence> lineAppearanceAssociationForPresence;

        /**
         * Gets the value of the lineAppearanceAssociationForPresence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineAppearanceAssociationForPresence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineAppearanceAssociationForPresence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RLineAppearanceAssociationForPresence }
         * 
         * 
         */
        public List<RLineAppearanceAssociationForPresence> getLineAppearanceAssociationForPresence() {
            if (lineAppearanceAssociationForPresence == null) {
                lineAppearanceAssociationForPresence = new ArrayList<RLineAppearanceAssociationForPresence>();
            }
            return this.lineAppearanceAssociationForPresence;
        }

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
     *         &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "pwdCredPolicyName",
        "pwdCredUserCantChange",
        "pwdCredUserMustChange",
        "pwdCredDoesNotExpire",
        "pwdCredTimeChanged",
        "pwdCredTimeAdminLockout",
        "pwdCredLockedByAdministrator"
    })
    public static class PasswordCredentials {

        protected XFkType pwdCredPolicyName;
        protected String pwdCredUserCantChange;
        protected String pwdCredUserMustChange;
        protected String pwdCredDoesNotExpire;
        protected String pwdCredTimeChanged;
        protected String pwdCredTimeAdminLockout;
        protected String pwdCredLockedByAdministrator;

        /**
         * Gets the value of the pwdCredPolicyName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPwdCredPolicyName() {
            return pwdCredPolicyName;
        }

        /**
         * Sets the value of the pwdCredPolicyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPwdCredPolicyName(XFkType value) {
            this.pwdCredPolicyName = value;
        }

        /**
         * Gets the value of the pwdCredUserCantChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserCantChange() {
            return pwdCredUserCantChange;
        }

        /**
         * Sets the value of the pwdCredUserCantChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserCantChange(String value) {
            this.pwdCredUserCantChange = value;
        }

        /**
         * Gets the value of the pwdCredUserMustChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserMustChange() {
            return pwdCredUserMustChange;
        }

        /**
         * Sets the value of the pwdCredUserMustChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserMustChange(String value) {
            this.pwdCredUserMustChange = value;
        }

        /**
         * Gets the value of the pwdCredDoesNotExpire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredDoesNotExpire() {
            return pwdCredDoesNotExpire;
        }

        /**
         * Sets the value of the pwdCredDoesNotExpire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredDoesNotExpire(String value) {
            this.pwdCredDoesNotExpire = value;
        }

        /**
         * Gets the value of the pwdCredTimeChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredTimeChanged() {
            return pwdCredTimeChanged;
        }

        /**
         * Sets the value of the pwdCredTimeChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredTimeChanged(String value) {
            this.pwdCredTimeChanged = value;
        }

        /**
         * Gets the value of the pwdCredTimeAdminLockout property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredTimeAdminLockout() {
            return pwdCredTimeAdminLockout;
        }

        /**
         * Sets the value of the pwdCredTimeAdminLockout property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredTimeAdminLockout(String value) {
            this.pwdCredTimeAdminLockout = value;
        }

        /**
         * Gets the value of the pwdCredLockedByAdministrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredLockedByAdministrator() {
            return pwdCredLockedByAdministrator;
        }

        /**
         * Sets the value of the pwdCredLockedByAdministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredLockedByAdministrator(String value) {
            this.pwdCredLockedByAdministrator = value;
        }

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
     *         &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded" minOccurs="0"/>
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
        "profileName"
    })
    public static class PhoneProfiles {

        protected List<XFkType> profileName;

        /**
         * Gets the value of the profileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XFkType }
         * 
         * 
         */
        public List<XFkType> getProfileName() {
            if (profileName == null) {
                profileName = new ArrayList<XFkType>();
            }
            return this.profileName;
        }

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
     *         &lt;element name="pinCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="pinCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredTimeChanged" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pinCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "pinCredPolicyName",
        "pinCredUserCantChange",
        "pinCredUserMustChange",
        "pinCredDoesNotExpire",
        "pinCredTimeChanged",
        "pinCredTimeAdminLockout",
        "pinCredLockedByAdministrator"
    })
    public static class PinCredentials {

        protected XFkType pinCredPolicyName;
        protected String pinCredUserCantChange;
        protected String pinCredUserMustChange;
        protected String pinCredDoesNotExpire;
        protected String pinCredTimeChanged;
        protected String pinCredTimeAdminLockout;
        protected String pinCredLockedByAdministrator;

        /**
         * Gets the value of the pinCredPolicyName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPinCredPolicyName() {
            return pinCredPolicyName;
        }

        /**
         * Sets the value of the pinCredPolicyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPinCredPolicyName(XFkType value) {
            this.pinCredPolicyName = value;
        }

        /**
         * Gets the value of the pinCredUserCantChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredUserCantChange() {
            return pinCredUserCantChange;
        }

        /**
         * Sets the value of the pinCredUserCantChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredUserCantChange(String value) {
            this.pinCredUserCantChange = value;
        }

        /**
         * Gets the value of the pinCredUserMustChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredUserMustChange() {
            return pinCredUserMustChange;
        }

        /**
         * Sets the value of the pinCredUserMustChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredUserMustChange(String value) {
            this.pinCredUserMustChange = value;
        }

        /**
         * Gets the value of the pinCredDoesNotExpire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredDoesNotExpire() {
            return pinCredDoesNotExpire;
        }

        /**
         * Sets the value of the pinCredDoesNotExpire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredDoesNotExpire(String value) {
            this.pinCredDoesNotExpire = value;
        }

        /**
         * Gets the value of the pinCredTimeChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredTimeChanged() {
            return pinCredTimeChanged;
        }

        /**
         * Sets the value of the pinCredTimeChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredTimeChanged(String value) {
            this.pinCredTimeChanged = value;
        }

        /**
         * Gets the value of the pinCredTimeAdminLockout property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredTimeAdminLockout() {
            return pinCredTimeAdminLockout;
        }

        /**
         * Sets the value of the pinCredTimeAdminLockout property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredTimeAdminLockout(String value) {
            this.pinCredTimeAdminLockout = value;
        }

        /**
         * Gets the value of the pinCredLockedByAdministrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredLockedByAdministrator() {
            return pinCredLockedByAdministrator;
        }

        /**
         * Sets the value of the pinCredLockedByAdministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredLockedByAdministrator(String value) {
            this.pinCredLockedByAdministrator = value;
        }

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
     *         &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
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
        "pattern",
        "routePartitionName"
    })
    public static class PrimaryExtension {

        protected String pattern;
        protected String routePartitionName;

        /**
         * Gets the value of the pattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Sets the value of the pattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutePartitionName(String value) {
            this.routePartitionName = value;
        }

    }

}
