
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RUniversalDeviceTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RUniversalDeviceTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="deviceSecurityProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="phoneButtonTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="sipDialRules" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyTransformationCSSForInboundCalls" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyTransformationCSSForOutboundCalls" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="reroutingCallingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCallingPartyTransformationCSSforInboundCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCallingPartyTransformationCSSforOutboundCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="commonPhoneProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfiguration" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="softkeyTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="phonePersonalization" type="{http://www.cisco.com/AXL/API/10.5}XPhonePersonalization" minOccurs="0"/>
 *         &lt;element name="mtpPreferredOriginatingCodec" type="{http://www.cisco.com/AXL/API/10.5}XSIPCodec" minOccurs="0"/>
 *         &lt;element name="outboundCallRollover" type="{http://www.cisco.com/AXL/API/10.5}XOutboundCallRollover" minOccurs="0"/>
 *         &lt;element name="mediaTerminationPointRequired" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="requiredDtmfReception" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rfc2833Disabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="speeddials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/10.5}RSpeeddial" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="protectedDevice" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/10.5}XAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="authenticationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/10.5}XKeySize" minOccurs="0"/>
 *         &lt;element name="servicesProvisioning" type="{http://www.cisco.com/AXL/API/10.5}XPhoneServiceDisplay" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/10.5}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="secureShellUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureShellPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/10.5}XCountry" minOccurs="0"/>
 *         &lt;element name="mlppDomain" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mlppIndication" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="mlppPreemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="doNotDisturb" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndIncomingCallAlert" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarCallingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="blfPresenceGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="blfAudibleAlertSettingPhoneBusy" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="blfAudibleAlertSettingPhoneIdle" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSource" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSource" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="deviceMobilityMode" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="mediaResourceGroupList" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="remoteDevice" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="hotlineDevice" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="requireOffPremiseLocation" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ownerUserId" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mobilityUserId" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}XBarge" minOccurs="0"/>
 *         &lt;element name="builtInBridge" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="allowControlOfDeviceFromCti" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableExtensionMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="recordingOptions" type="{http://www.cisco.com/AXL/API/10.5}XRecordingFlag" minOccurs="0"/>
 *         &lt;element name="privacy" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="loggedIntoHuntGroup" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="proxyServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idleTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="secureDirUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureIdleUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureServicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureMessagesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureInformationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureAuthenticationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="audibleMsgWaitingicatorPolicy" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="logMissedCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="visualMsgWaitingIndicatorPolicy" type="{http://www.cisco.com/AXL/API/10.5}XMWLPolicy" minOccurs="0"/>
 *         &lt;element name="lineLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCallerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfCalls" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="ringSettingWhenPhoneIdle" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="busyTrigger" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="ringSettingWhenPhoneInUse" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="directoryNumber" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callPickupGroupAudioAlertSettingPhoneActive" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="callPickupGroupAudioAlertSettingPhoneIdle" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="monitoringCallingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode" minOccurs="0"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}RSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RUniversalDeviceTemplate", propOrder = {
    "name",
    "deviceDescription",
    "devicePool",
    "deviceSecurityProfile",
    "sipProfile",
    "phoneButtonTemplate",
    "sipDialRules",
    "callingSearchSpace",
    "callingPartyTransformationCSSForInboundCalls",
    "callingPartyTransformationCSSForOutboundCalls",
    "reroutingCallingSearchSpace",
    "subscribeCallingSearchSpaceName",
    "useDevicePoolCallingPartyTransformationCSSforInboundCalls",
    "useDevicePoolCallingPartyTransformationCSSforOutboundCalls",
    "commonPhoneProfile",
    "commonDeviceConfiguration",
    "softkeyTemplate",
    "featureControlPolicy",
    "phonePersonalization",
    "mtpPreferredOriginatingCodec",
    "outboundCallRollover",
    "mediaTerminationPointRequired",
    "unattendedPort",
    "requiredDtmfReception",
    "rfc2833Disabled",
    "speeddials",
    "useTrustedRelayPoint",
    "protectedDevice",
    "authenticationMode",
    "authenticationString",
    "keySize",
    "servicesProvisioning",
    "packetCaptureMode",
    "packetCaptureDuration",
    "secureShellUser",
    "secureShellPassword",
    "userLocale",
    "networkLocale",
    "mlppDomain",
    "mlppIndication",
    "mlppPreemption",
    "doNotDisturb",
    "dndOption",
    "dndIncomingCallAlert",
    "aarGroup",
    "aarCallingSearchSpace",
    "blfPresenceGroup",
    "blfAudibleAlertSettingPhoneBusy",
    "blfAudibleAlertSettingPhoneIdle",
    "userHoldMohAudioSource",
    "networkHoldMohAudioSource",
    "location",
    "geoLocation",
    "deviceMobilityMode",
    "mediaResourceGroupList",
    "remoteDevice",
    "hotlineDevice",
    "retryVideoCallAsAudio",
    "requireOffPremiseLocation",
    "ownerUserId",
    "mobilityUserId",
    "joinAcrossLines",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "singleButtonBarge",
    "builtInBridge",
    "allowControlOfDeviceFromCti",
    "ignorePresentationIndicators",
    "enableExtensionMobility",
    "recordingOptions",
    "privacy",
    "loggedIntoHuntGroup",
    "proxyServer",
    "servicesUrl",
    "idle",
    "idleTimer",
    "secureDirUrl",
    "messages",
    "secureIdleUrl",
    "authenticationServer",
    "directory",
    "secureServicesUrl",
    "information",
    "secureMessagesUrl",
    "secureInformationUrl",
    "secureAuthenticationUrl",
    "externalPhoneNumber",
    "audibleMsgWaitingicatorPolicy",
    "logMissedCalls",
    "visualMsgWaitingIndicatorPolicy",
    "lineLabel",
    "displayCallerId",
    "maxNumberOfCalls",
    "ringSettingWhenPhoneIdle",
    "busyTrigger",
    "ringSettingWhenPhoneInUse",
    "directoryNumber",
    "recordingProfile",
    "callPickupGroupAudioAlertSettingPhoneActive",
    "callPickupGroupAudioAlertSettingPhoneIdle",
    "monitoringCallingSearchSpace",
    "confidentialAccess",
    "services"
})
public class RUniversalDeviceTemplate {

    protected String name;
    protected String deviceDescription;
    protected XFkType devicePool;
    protected XFkType deviceSecurityProfile;
    protected XFkType sipProfile;
    protected XFkType phoneButtonTemplate;
    protected XFkType sipDialRules;
    protected XFkType callingSearchSpace;
    protected XFkType callingPartyTransformationCSSForInboundCalls;
    protected XFkType callingPartyTransformationCSSForOutboundCalls;
    protected XFkType reroutingCallingSearchSpace;
    protected XFkType subscribeCallingSearchSpaceName;
    protected String useDevicePoolCallingPartyTransformationCSSforInboundCalls;
    protected String useDevicePoolCallingPartyTransformationCSSforOutboundCalls;
    protected XFkType commonPhoneProfile;
    protected XFkType commonDeviceConfiguration;
    protected XFkType softkeyTemplate;
    protected XFkType featureControlPolicy;
    protected String phonePersonalization;
    protected String mtpPreferredOriginatingCodec;
    protected String outboundCallRollover;
    protected String mediaTerminationPointRequired;
    protected String unattendedPort;
    protected String requiredDtmfReception;
    protected String rfc2833Disabled;
    protected RUniversalDeviceTemplate.Speeddials speeddials;
    protected String useTrustedRelayPoint;
    protected String protectedDevice;
    protected String authenticationMode;
    protected String authenticationString;
    protected String keySize;
    protected String servicesProvisioning;
    protected String packetCaptureMode;
    protected String packetCaptureDuration;
    protected String secureShellUser;
    protected String secureShellPassword;
    protected String userLocale;
    protected String networkLocale;
    protected XFkType mlppDomain;
    protected String mlppIndication;
    protected String mlppPreemption;
    protected String doNotDisturb;
    protected String dndOption;
    protected String dndIncomingCallAlert;
    protected XFkType aarGroup;
    protected XFkType aarCallingSearchSpace;
    protected XFkType blfPresenceGroup;
    protected String blfAudibleAlertSettingPhoneBusy;
    protected String blfAudibleAlertSettingPhoneIdle;
    protected String userHoldMohAudioSource;
    protected String networkHoldMohAudioSource;
    protected XFkType location;
    protected XFkType geoLocation;
    protected String deviceMobilityMode;
    protected XFkType mediaResourceGroupList;
    protected String remoteDevice;
    protected String hotlineDevice;
    protected String retryVideoCallAsAudio;
    protected String requireOffPremiseLocation;
    protected XFkType ownerUserId;
    protected XFkType mobilityUserId;
    protected String joinAcrossLines;
    protected String alwaysUsePrimeLine;
    protected String alwaysUsePrimeLineForVoiceMessage;
    protected String singleButtonBarge;
    protected String builtInBridge;
    protected String allowControlOfDeviceFromCti;
    protected String ignorePresentationIndicators;
    protected String enableExtensionMobility;
    protected String recordingOptions;
    protected String privacy;
    protected String loggedIntoHuntGroup;
    protected String proxyServer;
    protected String servicesUrl;
    protected String idle;
    protected String idleTimer;
    protected String secureDirUrl;
    protected String messages;
    protected String secureIdleUrl;
    protected String authenticationServer;
    protected String directory;
    protected String secureServicesUrl;
    protected String information;
    protected String secureMessagesUrl;
    protected String secureInformationUrl;
    protected String secureAuthenticationUrl;
    protected String externalPhoneNumber;
    protected String audibleMsgWaitingicatorPolicy;
    protected String logMissedCalls;
    protected String visualMsgWaitingIndicatorPolicy;
    protected String lineLabel;
    protected String displayCallerId;
    @XmlElement(name = "MaxNumberOfCalls")
    protected String maxNumberOfCalls;
    protected String ringSettingWhenPhoneIdle;
    protected String busyTrigger;
    protected String ringSettingWhenPhoneInUse;
    protected XFkType directoryNumber;
    protected XFkType recordingProfile;
    protected String callPickupGroupAudioAlertSettingPhoneActive;
    protected String callPickupGroupAudioAlertSettingPhoneIdle;
    protected XFkType monitoringCallingSearchSpace;
    protected RUniversalDeviceTemplate.ConfidentialAccess confidentialAccess;
    protected RUniversalDeviceTemplate.Services services;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the devicePool property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevicePool() {
        return devicePool;
    }

    /**
     * Sets the value of the devicePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevicePool(XFkType value) {
        this.devicePool = value;
    }

    /**
     * Gets the value of the deviceSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDeviceSecurityProfile() {
        return deviceSecurityProfile;
    }

    /**
     * Sets the value of the deviceSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDeviceSecurityProfile(XFkType value) {
        this.deviceSecurityProfile = value;
    }

    /**
     * Gets the value of the sipProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipProfile() {
        return sipProfile;
    }

    /**
     * Sets the value of the sipProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipProfile(XFkType value) {
        this.sipProfile = value;
    }

    /**
     * Gets the value of the phoneButtonTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneButtonTemplate() {
        return phoneButtonTemplate;
    }

    /**
     * Sets the value of the phoneButtonTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneButtonTemplate(XFkType value) {
        this.phoneButtonTemplate = value;
    }

    /**
     * Gets the value of the sipDialRules property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipDialRules() {
        return sipDialRules;
    }

    /**
     * Sets the value of the sipDialRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipDialRules(XFkType value) {
        this.sipDialRules = value;
    }

    /**
     * Gets the value of the callingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpace() {
        return callingSearchSpace;
    }

    /**
     * Sets the value of the callingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpace(XFkType value) {
        this.callingSearchSpace = value;
    }

    /**
     * Gets the value of the callingPartyTransformationCSSForInboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartyTransformationCSSForInboundCalls() {
        return callingPartyTransformationCSSForInboundCalls;
    }

    /**
     * Sets the value of the callingPartyTransformationCSSForInboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartyTransformationCSSForInboundCalls(XFkType value) {
        this.callingPartyTransformationCSSForInboundCalls = value;
    }

    /**
     * Gets the value of the callingPartyTransformationCSSForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartyTransformationCSSForOutboundCalls() {
        return callingPartyTransformationCSSForOutboundCalls;
    }

    /**
     * Sets the value of the callingPartyTransformationCSSForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartyTransformationCSSForOutboundCalls(XFkType value) {
        this.callingPartyTransformationCSSForOutboundCalls = value;
    }

    /**
     * Gets the value of the reroutingCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getReroutingCallingSearchSpace() {
        return reroutingCallingSearchSpace;
    }

    /**
     * Sets the value of the reroutingCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setReroutingCallingSearchSpace(XFkType value) {
        this.reroutingCallingSearchSpace = value;
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
     * Gets the value of the useDevicePoolCallingPartyTransformationCSSforInboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCallingPartyTransformationCSSforInboundCalls() {
        return useDevicePoolCallingPartyTransformationCSSforInboundCalls;
    }

    /**
     * Sets the value of the useDevicePoolCallingPartyTransformationCSSforInboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCallingPartyTransformationCSSforInboundCalls(String value) {
        this.useDevicePoolCallingPartyTransformationCSSforInboundCalls = value;
    }

    /**
     * Gets the value of the useDevicePoolCallingPartyTransformationCSSforOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCallingPartyTransformationCSSforOutboundCalls() {
        return useDevicePoolCallingPartyTransformationCSSforOutboundCalls;
    }

    /**
     * Sets the value of the useDevicePoolCallingPartyTransformationCSSforOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCallingPartyTransformationCSSforOutboundCalls(String value) {
        this.useDevicePoolCallingPartyTransformationCSSforOutboundCalls = value;
    }

    /**
     * Gets the value of the commonPhoneProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonPhoneProfile() {
        return commonPhoneProfile;
    }

    /**
     * Sets the value of the commonPhoneProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonPhoneProfile(XFkType value) {
        this.commonPhoneProfile = value;
    }

    /**
     * Gets the value of the commonDeviceConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonDeviceConfiguration() {
        return commonDeviceConfiguration;
    }

    /**
     * Sets the value of the commonDeviceConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonDeviceConfiguration(XFkType value) {
        this.commonDeviceConfiguration = value;
    }

    /**
     * Gets the value of the softkeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftkeyTemplate() {
        return softkeyTemplate;
    }

    /**
     * Sets the value of the softkeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftkeyTemplate(XFkType value) {
        this.softkeyTemplate = value;
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setFeatureControlPolicy(XFkType value) {
        this.featureControlPolicy = value;
    }

    /**
     * Gets the value of the phonePersonalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePersonalization() {
        return phonePersonalization;
    }

    /**
     * Sets the value of the phonePersonalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePersonalization(String value) {
        this.phonePersonalization = value;
    }

    /**
     * Gets the value of the mtpPreferredOriginatingCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpPreferredOriginatingCodec() {
        return mtpPreferredOriginatingCodec;
    }

    /**
     * Sets the value of the mtpPreferredOriginatingCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpPreferredOriginatingCodec(String value) {
        this.mtpPreferredOriginatingCodec = value;
    }

    /**
     * Gets the value of the outboundCallRollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundCallRollover() {
        return outboundCallRollover;
    }

    /**
     * Sets the value of the outboundCallRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundCallRollover(String value) {
        this.outboundCallRollover = value;
    }

    /**
     * Gets the value of the mediaTerminationPointRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTerminationPointRequired() {
        return mediaTerminationPointRequired;
    }

    /**
     * Sets the value of the mediaTerminationPointRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTerminationPointRequired(String value) {
        this.mediaTerminationPointRequired = value;
    }

    /**
     * Gets the value of the unattendedPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnattendedPort() {
        return unattendedPort;
    }

    /**
     * Sets the value of the unattendedPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnattendedPort(String value) {
        this.unattendedPort = value;
    }

    /**
     * Gets the value of the requiredDtmfReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDtmfReception() {
        return requiredDtmfReception;
    }

    /**
     * Sets the value of the requiredDtmfReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDtmfReception(String value) {
        this.requiredDtmfReception = value;
    }

    /**
     * Gets the value of the rfc2833Disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc2833Disabled() {
        return rfc2833Disabled;
    }

    /**
     * Sets the value of the rfc2833Disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc2833Disabled(String value) {
        this.rfc2833Disabled = value;
    }

    /**
     * Gets the value of the speeddials property.
     * 
     * @return
     *     possible object is
     *     {@link RUniversalDeviceTemplate.Speeddials }
     *     
     */
    public RUniversalDeviceTemplate.Speeddials getSpeeddials() {
        return speeddials;
    }

    /**
     * Sets the value of the speeddials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUniversalDeviceTemplate.Speeddials }
     *     
     */
    public void setSpeeddials(RUniversalDeviceTemplate.Speeddials value) {
        this.speeddials = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the protectedDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedDevice() {
        return protectedDevice;
    }

    /**
     * Sets the value of the protectedDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedDevice(String value) {
        this.protectedDevice = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the authenticationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * Sets the value of the authenticationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationString(String value) {
        this.authenticationString = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the servicesProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesProvisioning() {
        return servicesProvisioning;
    }

    /**
     * Sets the value of the servicesProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesProvisioning(String value) {
        this.servicesProvisioning = value;
    }

    /**
     * Gets the value of the packetCaptureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCaptureMode() {
        return packetCaptureMode;
    }

    /**
     * Sets the value of the packetCaptureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCaptureMode(String value) {
        this.packetCaptureMode = value;
    }

    /**
     * Gets the value of the packetCaptureDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCaptureDuration() {
        return packetCaptureDuration;
    }

    /**
     * Sets the value of the packetCaptureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCaptureDuration(String value) {
        this.packetCaptureDuration = value;
    }

    /**
     * Gets the value of the secureShellUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureShellUser() {
        return secureShellUser;
    }

    /**
     * Sets the value of the secureShellUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureShellUser(String value) {
        this.secureShellUser = value;
    }

    /**
     * Gets the value of the secureShellPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureShellPassword() {
        return secureShellPassword;
    }

    /**
     * Sets the value of the secureShellPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureShellPassword(String value) {
        this.secureShellPassword = value;
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
     * Gets the value of the networkLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocale(String value) {
        this.networkLocale = value;
    }

    /**
     * Gets the value of the mlppDomain property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMlppDomain() {
        return mlppDomain;
    }

    /**
     * Sets the value of the mlppDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMlppDomain(XFkType value) {
        this.mlppDomain = value;
    }

    /**
     * Gets the value of the mlppIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndication() {
        return mlppIndication;
    }

    /**
     * Sets the value of the mlppIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndication(String value) {
        this.mlppIndication = value;
    }

    /**
     * Gets the value of the mlppPreemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppPreemption() {
        return mlppPreemption;
    }

    /**
     * Sets the value of the mlppPreemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppPreemption(String value) {
        this.mlppPreemption = value;
    }

    /**
     * Gets the value of the doNotDisturb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotDisturb() {
        return doNotDisturb;
    }

    /**
     * Sets the value of the doNotDisturb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotDisturb(String value) {
        this.doNotDisturb = value;
    }

    /**
     * Gets the value of the dndOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndOption() {
        return dndOption;
    }

    /**
     * Sets the value of the dndOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndOption(String value) {
        this.dndOption = value;
    }

    /**
     * Gets the value of the dndIncomingCallAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndIncomingCallAlert() {
        return dndIncomingCallAlert;
    }

    /**
     * Sets the value of the dndIncomingCallAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndIncomingCallAlert(String value) {
        this.dndIncomingCallAlert = value;
    }

    /**
     * Gets the value of the aarGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroup() {
        return aarGroup;
    }

    /**
     * Sets the value of the aarGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroup(XFkType value) {
        this.aarGroup = value;
    }

    /**
     * Gets the value of the aarCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarCallingSearchSpace() {
        return aarCallingSearchSpace;
    }

    /**
     * Sets the value of the aarCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarCallingSearchSpace(XFkType value) {
        this.aarCallingSearchSpace = value;
    }

    /**
     * Gets the value of the blfPresenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBlfPresenceGroup() {
        return blfPresenceGroup;
    }

    /**
     * Sets the value of the blfPresenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBlfPresenceGroup(XFkType value) {
        this.blfPresenceGroup = value;
    }

    /**
     * Gets the value of the blfAudibleAlertSettingPhoneBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfAudibleAlertSettingPhoneBusy() {
        return blfAudibleAlertSettingPhoneBusy;
    }

    /**
     * Sets the value of the blfAudibleAlertSettingPhoneBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfAudibleAlertSettingPhoneBusy(String value) {
        this.blfAudibleAlertSettingPhoneBusy = value;
    }

    /**
     * Gets the value of the blfAudibleAlertSettingPhoneIdle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfAudibleAlertSettingPhoneIdle() {
        return blfAudibleAlertSettingPhoneIdle;
    }

    /**
     * Sets the value of the blfAudibleAlertSettingPhoneIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfAudibleAlertSettingPhoneIdle(String value) {
        this.blfAudibleAlertSettingPhoneIdle = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSource() {
        return userHoldMohAudioSource;
    }

    /**
     * Sets the value of the userHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSource(String value) {
        this.userHoldMohAudioSource = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSource() {
        return networkHoldMohAudioSource;
    }

    /**
     * Sets the value of the networkHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSource(String value) {
        this.networkHoldMohAudioSource = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocation(XFkType value) {
        this.location = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocation(XFkType value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the deviceMobilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMobilityMode() {
        return deviceMobilityMode;
    }

    /**
     * Sets the value of the deviceMobilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMobilityMode(String value) {
        this.deviceMobilityMode = value;
    }

    /**
     * Gets the value of the mediaResourceGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMediaResourceGroupList() {
        return mediaResourceGroupList;
    }

    /**
     * Sets the value of the mediaResourceGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMediaResourceGroupList(XFkType value) {
        this.mediaResourceGroupList = value;
    }

    /**
     * Gets the value of the remoteDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDevice() {
        return remoteDevice;
    }

    /**
     * Sets the value of the remoteDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDevice(String value) {
        this.remoteDevice = value;
    }

    /**
     * Gets the value of the hotlineDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotlineDevice() {
        return hotlineDevice;
    }

    /**
     * Sets the value of the hotlineDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotlineDevice(String value) {
        this.hotlineDevice = value;
    }

    /**
     * Gets the value of the retryVideoCallAsAudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryVideoCallAsAudio() {
        return retryVideoCallAsAudio;
    }

    /**
     * Sets the value of the retryVideoCallAsAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryVideoCallAsAudio(String value) {
        this.retryVideoCallAsAudio = value;
    }

    /**
     * Gets the value of the requireOffPremiseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireOffPremiseLocation() {
        return requireOffPremiseLocation;
    }

    /**
     * Sets the value of the requireOffPremiseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireOffPremiseLocation(String value) {
        this.requireOffPremiseLocation = value;
    }

    /**
     * Gets the value of the ownerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getOwnerUserId() {
        return ownerUserId;
    }

    /**
     * Sets the value of the ownerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setOwnerUserId(XFkType value) {
        this.ownerUserId = value;
    }

    /**
     * Gets the value of the mobilityUserId property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobilityUserId() {
        return mobilityUserId;
    }

    /**
     * Sets the value of the mobilityUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobilityUserId(XFkType value) {
        this.mobilityUserId = value;
    }

    /**
     * Gets the value of the joinAcrossLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinAcrossLines() {
        return joinAcrossLines;
    }

    /**
     * Sets the value of the joinAcrossLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinAcrossLines(String value) {
        this.joinAcrossLines = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLine() {
        return alwaysUsePrimeLine;
    }

    /**
     * Sets the value of the alwaysUsePrimeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLine(String value) {
        this.alwaysUsePrimeLine = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLineForVoiceMessage() {
        return alwaysUsePrimeLineForVoiceMessage;
    }

    /**
     * Sets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLineForVoiceMessage(String value) {
        this.alwaysUsePrimeLineForVoiceMessage = value;
    }

    /**
     * Gets the value of the singleButtonBarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleButtonBarge() {
        return singleButtonBarge;
    }

    /**
     * Sets the value of the singleButtonBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleButtonBarge(String value) {
        this.singleButtonBarge = value;
    }

    /**
     * Gets the value of the builtInBridge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltInBridge() {
        return builtInBridge;
    }

    /**
     * Sets the value of the builtInBridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltInBridge(String value) {
        this.builtInBridge = value;
    }

    /**
     * Gets the value of the allowControlOfDeviceFromCti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowControlOfDeviceFromCti() {
        return allowControlOfDeviceFromCti;
    }

    /**
     * Sets the value of the allowControlOfDeviceFromCti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowControlOfDeviceFromCti(String value) {
        this.allowControlOfDeviceFromCti = value;
    }

    /**
     * Gets the value of the ignorePresentationIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnorePresentationIndicators() {
        return ignorePresentationIndicators;
    }

    /**
     * Sets the value of the ignorePresentationIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnorePresentationIndicators(String value) {
        this.ignorePresentationIndicators = value;
    }

    /**
     * Gets the value of the enableExtensionMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableExtensionMobility() {
        return enableExtensionMobility;
    }

    /**
     * Sets the value of the enableExtensionMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableExtensionMobility(String value) {
        this.enableExtensionMobility = value;
    }

    /**
     * Gets the value of the recordingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingOptions() {
        return recordingOptions;
    }

    /**
     * Sets the value of the recordingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingOptions(String value) {
        this.recordingOptions = value;
    }

    /**
     * Gets the value of the privacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * Sets the value of the privacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacy(String value) {
        this.privacy = value;
    }

    /**
     * Gets the value of the loggedIntoHuntGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedIntoHuntGroup() {
        return loggedIntoHuntGroup;
    }

    /**
     * Sets the value of the loggedIntoHuntGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedIntoHuntGroup(String value) {
        this.loggedIntoHuntGroup = value;
    }

    /**
     * Gets the value of the proxyServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyServer() {
        return proxyServer;
    }

    /**
     * Sets the value of the proxyServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyServer(String value) {
        this.proxyServer = value;
    }

    /**
     * Gets the value of the servicesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesUrl() {
        return servicesUrl;
    }

    /**
     * Sets the value of the servicesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesUrl(String value) {
        this.servicesUrl = value;
    }

    /**
     * Gets the value of the idle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdle() {
        return idle;
    }

    /**
     * Sets the value of the idle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdle(String value) {
        this.idle = value;
    }

    /**
     * Gets the value of the idleTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleTimer() {
        return idleTimer;
    }

    /**
     * Sets the value of the idleTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleTimer(String value) {
        this.idleTimer = value;
    }

    /**
     * Gets the value of the secureDirUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureDirUrl() {
        return secureDirUrl;
    }

    /**
     * Sets the value of the secureDirUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureDirUrl(String value) {
        this.secureDirUrl = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessages(String value) {
        this.messages = value;
    }

    /**
     * Gets the value of the secureIdleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureIdleUrl() {
        return secureIdleUrl;
    }

    /**
     * Sets the value of the secureIdleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureIdleUrl(String value) {
        this.secureIdleUrl = value;
    }

    /**
     * Gets the value of the authenticationServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationServer() {
        return authenticationServer;
    }

    /**
     * Sets the value of the authenticationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationServer(String value) {
        this.authenticationServer = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the secureServicesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureServicesUrl() {
        return secureServicesUrl;
    }

    /**
     * Sets the value of the secureServicesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureServicesUrl(String value) {
        this.secureServicesUrl = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the secureMessagesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureMessagesUrl() {
        return secureMessagesUrl;
    }

    /**
     * Sets the value of the secureMessagesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureMessagesUrl(String value) {
        this.secureMessagesUrl = value;
    }

    /**
     * Gets the value of the secureInformationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureInformationUrl() {
        return secureInformationUrl;
    }

    /**
     * Sets the value of the secureInformationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureInformationUrl(String value) {
        this.secureInformationUrl = value;
    }

    /**
     * Gets the value of the secureAuthenticationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureAuthenticationUrl() {
        return secureAuthenticationUrl;
    }

    /**
     * Sets the value of the secureAuthenticationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureAuthenticationUrl(String value) {
        this.secureAuthenticationUrl = value;
    }

    /**
     * Gets the value of the externalPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPhoneNumber() {
        return externalPhoneNumber;
    }

    /**
     * Sets the value of the externalPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPhoneNumber(String value) {
        this.externalPhoneNumber = value;
    }

    /**
     * Gets the value of the audibleMsgWaitingicatorPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMsgWaitingicatorPolicy() {
        return audibleMsgWaitingicatorPolicy;
    }

    /**
     * Sets the value of the audibleMsgWaitingicatorPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMsgWaitingicatorPolicy(String value) {
        this.audibleMsgWaitingicatorPolicy = value;
    }

    /**
     * Gets the value of the logMissedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogMissedCalls() {
        return logMissedCalls;
    }

    /**
     * Sets the value of the logMissedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogMissedCalls(String value) {
        this.logMissedCalls = value;
    }

    /**
     * Gets the value of the visualMsgWaitingIndicatorPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualMsgWaitingIndicatorPolicy() {
        return visualMsgWaitingIndicatorPolicy;
    }

    /**
     * Sets the value of the visualMsgWaitingIndicatorPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualMsgWaitingIndicatorPolicy(String value) {
        this.visualMsgWaitingIndicatorPolicy = value;
    }

    /**
     * Gets the value of the lineLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineLabel() {
        return lineLabel;
    }

    /**
     * Sets the value of the lineLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineLabel(String value) {
        this.lineLabel = value;
    }

    /**
     * Gets the value of the displayCallerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCallerId() {
        return displayCallerId;
    }

    /**
     * Sets the value of the displayCallerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCallerId(String value) {
        this.displayCallerId = value;
    }

    /**
     * Gets the value of the maxNumberOfCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberOfCalls() {
        return maxNumberOfCalls;
    }

    /**
     * Sets the value of the maxNumberOfCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberOfCalls(String value) {
        this.maxNumberOfCalls = value;
    }

    /**
     * Gets the value of the ringSettingWhenPhoneIdle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingWhenPhoneIdle() {
        return ringSettingWhenPhoneIdle;
    }

    /**
     * Sets the value of the ringSettingWhenPhoneIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingWhenPhoneIdle(String value) {
        this.ringSettingWhenPhoneIdle = value;
    }

    /**
     * Gets the value of the busyTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyTrigger() {
        return busyTrigger;
    }

    /**
     * Sets the value of the busyTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyTrigger(String value) {
        this.busyTrigger = value;
    }

    /**
     * Gets the value of the ringSettingWhenPhoneInUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingWhenPhoneInUse() {
        return ringSettingWhenPhoneInUse;
    }

    /**
     * Sets the value of the ringSettingWhenPhoneInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingWhenPhoneInUse(String value) {
        this.ringSettingWhenPhoneInUse = value;
    }

    /**
     * Gets the value of the directoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDirectoryNumber() {
        return directoryNumber;
    }

    /**
     * Sets the value of the directoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDirectoryNumber(XFkType value) {
        this.directoryNumber = value;
    }

    /**
     * Gets the value of the recordingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRecordingProfile() {
        return recordingProfile;
    }

    /**
     * Sets the value of the recordingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRecordingProfile(XFkType value) {
        this.recordingProfile = value;
    }

    /**
     * Gets the value of the callPickupGroupAudioAlertSettingPhoneActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupGroupAudioAlertSettingPhoneActive() {
        return callPickupGroupAudioAlertSettingPhoneActive;
    }

    /**
     * Sets the value of the callPickupGroupAudioAlertSettingPhoneActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupGroupAudioAlertSettingPhoneActive(String value) {
        this.callPickupGroupAudioAlertSettingPhoneActive = value;
    }

    /**
     * Gets the value of the callPickupGroupAudioAlertSettingPhoneIdle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupGroupAudioAlertSettingPhoneIdle() {
        return callPickupGroupAudioAlertSettingPhoneIdle;
    }

    /**
     * Sets the value of the callPickupGroupAudioAlertSettingPhoneIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupGroupAudioAlertSettingPhoneIdle(String value) {
        this.callPickupGroupAudioAlertSettingPhoneIdle = value;
    }

    /**
     * Gets the value of the monitoringCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMonitoringCallingSearchSpace() {
        return monitoringCallingSearchSpace;
    }

    /**
     * Sets the value of the monitoringCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMonitoringCallingSearchSpace(XFkType value) {
        this.monitoringCallingSearchSpace = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RUniversalDeviceTemplate.ConfidentialAccess }
     *     
     */
    public RUniversalDeviceTemplate.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUniversalDeviceTemplate.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(RUniversalDeviceTemplate.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link RUniversalDeviceTemplate.Services }
     *     
     */
    public RUniversalDeviceTemplate.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUniversalDeviceTemplate.Services }
     *     
     */
    public void setServices(RUniversalDeviceTemplate.Services value) {
        this.services = value;
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
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode" minOccurs="0"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
        "confidentialAccessMode",
        "confidentialAccessLevel"
    })
    public static class ConfidentialAccess {

        protected String confidentialAccessMode;
        protected String confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessMode(String value) {
            this.confidentialAccessMode = value;
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessLevel(String value) {
            this.confidentialAccessLevel = value;
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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}RSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
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
        "service"
    })
    public static class Services {

        protected List<RSubscribedService> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RSubscribedService }
         * 
         * 
         */
        public List<RSubscribedService> getService() {
            if (service == null) {
                service = new ArrayList<RSubscribedService>();
            }
            return this.service;
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
     *         &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/10.5}RSpeeddial" maxOccurs="unbounded" minOccurs="0"/>
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
        "speeddial"
    })
    public static class Speeddials {

        protected List<RSpeeddial> speeddial;

        /**
         * Gets the value of the speeddial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the speeddial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpeeddial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RSpeeddial }
         * 
         * 
         */
        public List<RSpeeddial> getSpeeddial() {
            if (speeddial == null) {
                speeddial = new ArrayList<RSpeeddial>();
            }
            return this.speeddial;
        }

    }

}
