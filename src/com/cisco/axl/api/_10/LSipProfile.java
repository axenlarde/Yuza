
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LSipProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LSipProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String100" minOccurs="0"/>
 *         &lt;element name="defaultTelephonyEventPayloadType" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="redirectByApplication" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ringing180" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="timerInvite" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerRegisterDelta" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerRegister" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerT1" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerT2" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="retryInvite" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="retryNotInvite" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="startMediaPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="stopMediaPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callpickupListUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="callpickupGroupUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="meetmeServiceUrl" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="userInfo" type="{http://www.cisco.com/AXL/API/10.5}XZzuserInfo" minOccurs="0"/>
 *         &lt;element name="dtmfDbLevel" type="{http://www.cisco.com/AXL/API/10.5}XZzdtmfDbLevel" minOccurs="0"/>
 *         &lt;element name="callHoldRingback" type="{http://www.cisco.com/AXL/API/10.5}XZzpreff" minOccurs="0"/>
 *         &lt;element name="anonymousCallBlock" type="{http://www.cisco.com/AXL/API/10.5}XZzpreff" minOccurs="0"/>
 *         &lt;element name="callerIdBlock" type="{http://www.cisco.com/AXL/API/10.5}XZzpreff" minOccurs="0"/>
 *         &lt;element name="dndControl" type="{http://www.cisco.com/AXL/API/10.5}XZzdndcontrol" minOccurs="0"/>
 *         &lt;element name="telnetLevel" type="{http://www.cisco.com/AXL/API/10.5}XTelnetLevel" minOccurs="0"/>
 *         &lt;element name="timerKeepAlive" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerSubscribe" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerSubscribeDelta" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="maxRedirects" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="timerOffHookToFirstDigit" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callForwardUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="abbreviatedDialUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="confJointEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rfc2543Hold" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="semiAttendedTransfer" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableVad" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="stutterMsgWaiting" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="callStats" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="t38Invite" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rerouteIncomingRequest" type="{http://www.cisco.com/AXL/API/10.5}XSIPReroute" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceListName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableAnatForEarlyOfferCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rsvpOverSip" type="{http://www.cisco.com/AXL/API/10.5}XRSVPOverSIP" minOccurs="0"/>
 *         &lt;element name="fallbackToLocalRsvp" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipRe11XxEnabled" type="{http://www.cisco.com/AXL/API/10.5}XSIPRel1XXOptions" minOccurs="0"/>
 *         &lt;element name="gClear" type="{http://www.cisco.com/AXL/API/10.5}XGClear" minOccurs="0"/>
 *         &lt;element name="sendRecvSDPInMidCallInvite" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableOutboundOptionsPing" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="optionsPingIntervalWhenStatusOK" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="optionsPingIntervalWhenStatusNotOK" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="deliverConferenceBridgeIdentifier" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipOptionsRetryCount" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="sipOptionsRetryTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="sipBandwidthModifier" type="{http://www.cisco.com/AXL/API/10.5}XSIPBandwidthModifier" minOccurs="0"/>
 *         &lt;element name="enableUriOutdialSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAgentServerHeaderInfo" type="{http://www.cisco.com/AXL/API/10.5}XUserAgentServerHeaderInfo" minOccurs="0"/>
 *         &lt;element name="allowPresentationSharingUsingBfcp" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="scriptParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isScriptTraceEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowiXApplicationMedia" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="dialStringInterpretation" type="{http://www.cisco.com/AXL/API/10.5}XURIDisambiguationPolicy" minOccurs="0"/>
 *         &lt;element name="acceptAudioCodecPreferences" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="mlppUserAuthorization" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="isAssuredSipServiceEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useCallerIdCallerNameinUriOutgoingRequest" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callerName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingLineIdentification" type="{http://www.cisco.com/AXL/API/10.5}XCallingLineIdentification" minOccurs="0"/>
 *         &lt;element name="rejectAnonymousIncomingCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="callpickupUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="rejectAnonymousOutgoingCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="videoCallTrafficClass" type="{http://www.cisco.com/AXL/API/10.5}XVideoCallTrafficClass" minOccurs="0"/>
 *         &lt;element name="sdpTransparency" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowMultipleCodecs" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipSessionRefreshMethod" type="{http://www.cisco.com/AXL/API/10.5}XSipSessionRefreshMethod" minOccurs="0"/>
 *         &lt;element name="earlyOfferSuppVoiceCall" type="{http://www.cisco.com/AXL/API/10.5}XEOSuppVoiceCall" minOccurs="0"/>
 *         &lt;element name="cucmVersionInSipHeader" type="{http://www.cisco.com/AXL/API/10.5}XCUCMVersionInSipHeader" minOccurs="0"/>
 *         &lt;element name="confidentialAccessLevelHeaders" type="{http://www.cisco.com/AXL/API/10.5}XCALHeaders" minOccurs="0"/>
 *         &lt;element name="destRouteString" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="inactiveSDPRequired" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
@XmlType(name = "LSipProfile", propOrder = {
    "name",
    "description",
    "defaultTelephonyEventPayloadType",
    "redirectByApplication",
    "ringing180",
    "timerInvite",
    "timerRegisterDelta",
    "timerRegister",
    "timerT1",
    "timerT2",
    "retryInvite",
    "retryNotInvite",
    "startMediaPort",
    "stopMediaPort",
    "callpickupListUri",
    "callpickupGroupUri",
    "meetmeServiceUrl",
    "userInfo",
    "dtmfDbLevel",
    "callHoldRingback",
    "anonymousCallBlock",
    "callerIdBlock",
    "dndControl",
    "telnetLevel",
    "timerKeepAlive",
    "timerSubscribe",
    "timerSubscribeDelta",
    "maxRedirects",
    "timerOffHookToFirstDigit",
    "callForwardUri",
    "abbreviatedDialUri",
    "confJointEnable",
    "rfc2543Hold",
    "semiAttendedTransfer",
    "enableVad",
    "stutterMsgWaiting",
    "callStats",
    "t38Invite",
    "rerouteIncomingRequest",
    "resourcePriorityNamespaceListName",
    "enableAnatForEarlyOfferCalls",
    "rsvpOverSip",
    "fallbackToLocalRsvp",
    "sipRe11XxEnabled",
    "gClear",
    "sendRecvSDPInMidCallInvite",
    "enableOutboundOptionsPing",
    "optionsPingIntervalWhenStatusOK",
    "optionsPingIntervalWhenStatusNotOK",
    "deliverConferenceBridgeIdentifier",
    "sipOptionsRetryCount",
    "sipOptionsRetryTimer",
    "sipBandwidthModifier",
    "enableUriOutdialSupport",
    "userAgentServerHeaderInfo",
    "allowPresentationSharingUsingBfcp",
    "scriptParameters",
    "isScriptTraceEnabled",
    "sipNormalizationScript",
    "allowiXApplicationMedia",
    "dialStringInterpretation",
    "acceptAudioCodecPreferences",
    "mlppUserAuthorization",
    "isAssuredSipServiceEnabled",
    "resourcePriorityNamespace",
    "useCallerIdCallerNameinUriOutgoingRequest",
    "callerIdDn",
    "callerName",
    "callingLineIdentification",
    "rejectAnonymousIncomingCall",
    "callpickupUri",
    "rejectAnonymousOutgoingCall",
    "videoCallTrafficClass",
    "sdpTransparency",
    "allowMultipleCodecs",
    "sipSessionRefreshMethod",
    "earlyOfferSuppVoiceCall",
    "cucmVersionInSipHeader",
    "confidentialAccessLevelHeaders",
    "destRouteString",
    "inactiveSDPRequired"
})
public class LSipProfile {

    protected String name;
    protected String description;
    protected String defaultTelephonyEventPayloadType;
    protected String redirectByApplication;
    protected String ringing180;
    protected String timerInvite;
    protected String timerRegisterDelta;
    protected String timerRegister;
    protected String timerT1;
    protected String timerT2;
    protected String retryInvite;
    protected String retryNotInvite;
    protected String startMediaPort;
    protected String stopMediaPort;
    protected String callpickupListUri;
    protected String callpickupGroupUri;
    protected String meetmeServiceUrl;
    protected String userInfo;
    protected String dtmfDbLevel;
    protected String callHoldRingback;
    protected String anonymousCallBlock;
    protected String callerIdBlock;
    protected String dndControl;
    protected String telnetLevel;
    protected String timerKeepAlive;
    protected String timerSubscribe;
    protected String timerSubscribeDelta;
    protected String maxRedirects;
    protected String timerOffHookToFirstDigit;
    protected String callForwardUri;
    protected String abbreviatedDialUri;
    protected String confJointEnable;
    protected String rfc2543Hold;
    protected String semiAttendedTransfer;
    protected String enableVad;
    protected String stutterMsgWaiting;
    protected String callStats;
    protected String t38Invite;
    protected String rerouteIncomingRequest;
    protected XFkType resourcePriorityNamespaceListName;
    protected String enableAnatForEarlyOfferCalls;
    protected String rsvpOverSip;
    protected String fallbackToLocalRsvp;
    protected String sipRe11XxEnabled;
    protected String gClear;
    protected String sendRecvSDPInMidCallInvite;
    protected String enableOutboundOptionsPing;
    protected String optionsPingIntervalWhenStatusOK;
    protected String optionsPingIntervalWhenStatusNotOK;
    protected String deliverConferenceBridgeIdentifier;
    protected String sipOptionsRetryCount;
    protected String sipOptionsRetryTimer;
    protected String sipBandwidthModifier;
    protected String enableUriOutdialSupport;
    protected String userAgentServerHeaderInfo;
    protected String allowPresentationSharingUsingBfcp;
    protected String scriptParameters;
    protected String isScriptTraceEnabled;
    protected XFkType sipNormalizationScript;
    protected String allowiXApplicationMedia;
    protected String dialStringInterpretation;
    protected String acceptAudioCodecPreferences;
    protected String mlppUserAuthorization;
    protected String isAssuredSipServiceEnabled;
    protected XFkType resourcePriorityNamespace;
    protected String useCallerIdCallerNameinUriOutgoingRequest;
    protected String callerIdDn;
    protected String callerName;
    protected String callingLineIdentification;
    protected String rejectAnonymousIncomingCall;
    protected String callpickupUri;
    protected String rejectAnonymousOutgoingCall;
    protected String videoCallTrafficClass;
    protected XFkType sdpTransparency;
    protected String allowMultipleCodecs;
    protected String sipSessionRefreshMethod;
    protected String earlyOfferSuppVoiceCall;
    protected String cucmVersionInSipHeader;
    protected String confidentialAccessLevelHeaders;
    protected String destRouteString;
    protected String inactiveSDPRequired;
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
     * Gets the value of the defaultTelephonyEventPayloadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTelephonyEventPayloadType() {
        return defaultTelephonyEventPayloadType;
    }

    /**
     * Sets the value of the defaultTelephonyEventPayloadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTelephonyEventPayloadType(String value) {
        this.defaultTelephonyEventPayloadType = value;
    }

    /**
     * Gets the value of the redirectByApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectByApplication() {
        return redirectByApplication;
    }

    /**
     * Sets the value of the redirectByApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectByApplication(String value) {
        this.redirectByApplication = value;
    }

    /**
     * Gets the value of the ringing180 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRinging180() {
        return ringing180;
    }

    /**
     * Sets the value of the ringing180 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRinging180(String value) {
        this.ringing180 = value;
    }

    /**
     * Gets the value of the timerInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerInvite() {
        return timerInvite;
    }

    /**
     * Sets the value of the timerInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerInvite(String value) {
        this.timerInvite = value;
    }

    /**
     * Gets the value of the timerRegisterDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerRegisterDelta() {
        return timerRegisterDelta;
    }

    /**
     * Sets the value of the timerRegisterDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerRegisterDelta(String value) {
        this.timerRegisterDelta = value;
    }

    /**
     * Gets the value of the timerRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerRegister() {
        return timerRegister;
    }

    /**
     * Sets the value of the timerRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerRegister(String value) {
        this.timerRegister = value;
    }

    /**
     * Gets the value of the timerT1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerT1() {
        return timerT1;
    }

    /**
     * Sets the value of the timerT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerT1(String value) {
        this.timerT1 = value;
    }

    /**
     * Gets the value of the timerT2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerT2() {
        return timerT2;
    }

    /**
     * Sets the value of the timerT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerT2(String value) {
        this.timerT2 = value;
    }

    /**
     * Gets the value of the retryInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryInvite() {
        return retryInvite;
    }

    /**
     * Sets the value of the retryInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryInvite(String value) {
        this.retryInvite = value;
    }

    /**
     * Gets the value of the retryNotInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryNotInvite() {
        return retryNotInvite;
    }

    /**
     * Sets the value of the retryNotInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryNotInvite(String value) {
        this.retryNotInvite = value;
    }

    /**
     * Gets the value of the startMediaPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMediaPort() {
        return startMediaPort;
    }

    /**
     * Sets the value of the startMediaPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMediaPort(String value) {
        this.startMediaPort = value;
    }

    /**
     * Gets the value of the stopMediaPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopMediaPort() {
        return stopMediaPort;
    }

    /**
     * Sets the value of the stopMediaPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopMediaPort(String value) {
        this.stopMediaPort = value;
    }

    /**
     * Gets the value of the callpickupListUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupListUri() {
        return callpickupListUri;
    }

    /**
     * Sets the value of the callpickupListUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupListUri(String value) {
        this.callpickupListUri = value;
    }

    /**
     * Gets the value of the callpickupGroupUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupGroupUri() {
        return callpickupGroupUri;
    }

    /**
     * Sets the value of the callpickupGroupUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupGroupUri(String value) {
        this.callpickupGroupUri = value;
    }

    /**
     * Gets the value of the meetmeServiceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetmeServiceUrl() {
        return meetmeServiceUrl;
    }

    /**
     * Sets the value of the meetmeServiceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetmeServiceUrl(String value) {
        this.meetmeServiceUrl = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInfo(String value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the dtmfDbLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfDbLevel() {
        return dtmfDbLevel;
    }

    /**
     * Sets the value of the dtmfDbLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfDbLevel(String value) {
        this.dtmfDbLevel = value;
    }

    /**
     * Gets the value of the callHoldRingback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallHoldRingback() {
        return callHoldRingback;
    }

    /**
     * Sets the value of the callHoldRingback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallHoldRingback(String value) {
        this.callHoldRingback = value;
    }

    /**
     * Gets the value of the anonymousCallBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousCallBlock() {
        return anonymousCallBlock;
    }

    /**
     * Sets the value of the anonymousCallBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousCallBlock(String value) {
        this.anonymousCallBlock = value;
    }

    /**
     * Gets the value of the callerIdBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdBlock() {
        return callerIdBlock;
    }

    /**
     * Sets the value of the callerIdBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdBlock(String value) {
        this.callerIdBlock = value;
    }

    /**
     * Gets the value of the dndControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndControl() {
        return dndControl;
    }

    /**
     * Sets the value of the dndControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndControl(String value) {
        this.dndControl = value;
    }

    /**
     * Gets the value of the telnetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelnetLevel() {
        return telnetLevel;
    }

    /**
     * Sets the value of the telnetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelnetLevel(String value) {
        this.telnetLevel = value;
    }

    /**
     * Gets the value of the timerKeepAlive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerKeepAlive() {
        return timerKeepAlive;
    }

    /**
     * Sets the value of the timerKeepAlive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerKeepAlive(String value) {
        this.timerKeepAlive = value;
    }

    /**
     * Gets the value of the timerSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerSubscribe() {
        return timerSubscribe;
    }

    /**
     * Sets the value of the timerSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerSubscribe(String value) {
        this.timerSubscribe = value;
    }

    /**
     * Gets the value of the timerSubscribeDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerSubscribeDelta() {
        return timerSubscribeDelta;
    }

    /**
     * Sets the value of the timerSubscribeDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerSubscribeDelta(String value) {
        this.timerSubscribeDelta = value;
    }

    /**
     * Gets the value of the maxRedirects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRedirects() {
        return maxRedirects;
    }

    /**
     * Sets the value of the maxRedirects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRedirects(String value) {
        this.maxRedirects = value;
    }

    /**
     * Gets the value of the timerOffHookToFirstDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerOffHookToFirstDigit() {
        return timerOffHookToFirstDigit;
    }

    /**
     * Sets the value of the timerOffHookToFirstDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerOffHookToFirstDigit(String value) {
        this.timerOffHookToFirstDigit = value;
    }

    /**
     * Gets the value of the callForwardUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardUri() {
        return callForwardUri;
    }

    /**
     * Sets the value of the callForwardUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardUri(String value) {
        this.callForwardUri = value;
    }

    /**
     * Gets the value of the abbreviatedDialUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDialUri() {
        return abbreviatedDialUri;
    }

    /**
     * Sets the value of the abbreviatedDialUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDialUri(String value) {
        this.abbreviatedDialUri = value;
    }

    /**
     * Gets the value of the confJointEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfJointEnable() {
        return confJointEnable;
    }

    /**
     * Sets the value of the confJointEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfJointEnable(String value) {
        this.confJointEnable = value;
    }

    /**
     * Gets the value of the rfc2543Hold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc2543Hold() {
        return rfc2543Hold;
    }

    /**
     * Sets the value of the rfc2543Hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc2543Hold(String value) {
        this.rfc2543Hold = value;
    }

    /**
     * Gets the value of the semiAttendedTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemiAttendedTransfer() {
        return semiAttendedTransfer;
    }

    /**
     * Sets the value of the semiAttendedTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemiAttendedTransfer(String value) {
        this.semiAttendedTransfer = value;
    }

    /**
     * Gets the value of the enableVad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableVad() {
        return enableVad;
    }

    /**
     * Sets the value of the enableVad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableVad(String value) {
        this.enableVad = value;
    }

    /**
     * Gets the value of the stutterMsgWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStutterMsgWaiting() {
        return stutterMsgWaiting;
    }

    /**
     * Sets the value of the stutterMsgWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStutterMsgWaiting(String value) {
        this.stutterMsgWaiting = value;
    }

    /**
     * Gets the value of the callStats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStats() {
        return callStats;
    }

    /**
     * Sets the value of the callStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStats(String value) {
        this.callStats = value;
    }

    /**
     * Gets the value of the t38Invite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT38Invite() {
        return t38Invite;
    }

    /**
     * Sets the value of the t38Invite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT38Invite(String value) {
        this.t38Invite = value;
    }

    /**
     * Gets the value of the rerouteIncomingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRerouteIncomingRequest() {
        return rerouteIncomingRequest;
    }

    /**
     * Sets the value of the rerouteIncomingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRerouteIncomingRequest(String value) {
        this.rerouteIncomingRequest = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getResourcePriorityNamespaceListName() {
        return resourcePriorityNamespaceListName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setResourcePriorityNamespaceListName(XFkType value) {
        this.resourcePriorityNamespaceListName = value;
    }

    /**
     * Gets the value of the enableAnatForEarlyOfferCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableAnatForEarlyOfferCalls() {
        return enableAnatForEarlyOfferCalls;
    }

    /**
     * Sets the value of the enableAnatForEarlyOfferCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableAnatForEarlyOfferCalls(String value) {
        this.enableAnatForEarlyOfferCalls = value;
    }

    /**
     * Gets the value of the rsvpOverSip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvpOverSip() {
        return rsvpOverSip;
    }

    /**
     * Sets the value of the rsvpOverSip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsvpOverSip(String value) {
        this.rsvpOverSip = value;
    }

    /**
     * Gets the value of the fallbackToLocalRsvp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackToLocalRsvp() {
        return fallbackToLocalRsvp;
    }

    /**
     * Sets the value of the fallbackToLocalRsvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackToLocalRsvp(String value) {
        this.fallbackToLocalRsvp = value;
    }

    /**
     * Gets the value of the sipRe11XxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipRe11XxEnabled() {
        return sipRe11XxEnabled;
    }

    /**
     * Sets the value of the sipRe11XxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipRe11XxEnabled(String value) {
        this.sipRe11XxEnabled = value;
    }

    /**
     * Gets the value of the gClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGClear() {
        return gClear;
    }

    /**
     * Sets the value of the gClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGClear(String value) {
        this.gClear = value;
    }

    /**
     * Gets the value of the sendRecvSDPInMidCallInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendRecvSDPInMidCallInvite() {
        return sendRecvSDPInMidCallInvite;
    }

    /**
     * Sets the value of the sendRecvSDPInMidCallInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendRecvSDPInMidCallInvite(String value) {
        this.sendRecvSDPInMidCallInvite = value;
    }

    /**
     * Gets the value of the enableOutboundOptionsPing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableOutboundOptionsPing() {
        return enableOutboundOptionsPing;
    }

    /**
     * Sets the value of the enableOutboundOptionsPing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableOutboundOptionsPing(String value) {
        this.enableOutboundOptionsPing = value;
    }

    /**
     * Gets the value of the optionsPingIntervalWhenStatusOK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsPingIntervalWhenStatusOK() {
        return optionsPingIntervalWhenStatusOK;
    }

    /**
     * Sets the value of the optionsPingIntervalWhenStatusOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsPingIntervalWhenStatusOK(String value) {
        this.optionsPingIntervalWhenStatusOK = value;
    }

    /**
     * Gets the value of the optionsPingIntervalWhenStatusNotOK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsPingIntervalWhenStatusNotOK() {
        return optionsPingIntervalWhenStatusNotOK;
    }

    /**
     * Sets the value of the optionsPingIntervalWhenStatusNotOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsPingIntervalWhenStatusNotOK(String value) {
        this.optionsPingIntervalWhenStatusNotOK = value;
    }

    /**
     * Gets the value of the deliverConferenceBridgeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverConferenceBridgeIdentifier() {
        return deliverConferenceBridgeIdentifier;
    }

    /**
     * Sets the value of the deliverConferenceBridgeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverConferenceBridgeIdentifier(String value) {
        this.deliverConferenceBridgeIdentifier = value;
    }

    /**
     * Gets the value of the sipOptionsRetryCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipOptionsRetryCount() {
        return sipOptionsRetryCount;
    }

    /**
     * Sets the value of the sipOptionsRetryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipOptionsRetryCount(String value) {
        this.sipOptionsRetryCount = value;
    }

    /**
     * Gets the value of the sipOptionsRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipOptionsRetryTimer() {
        return sipOptionsRetryTimer;
    }

    /**
     * Sets the value of the sipOptionsRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipOptionsRetryTimer(String value) {
        this.sipOptionsRetryTimer = value;
    }

    /**
     * Gets the value of the sipBandwidthModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipBandwidthModifier() {
        return sipBandwidthModifier;
    }

    /**
     * Sets the value of the sipBandwidthModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipBandwidthModifier(String value) {
        this.sipBandwidthModifier = value;
    }

    /**
     * Gets the value of the enableUriOutdialSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableUriOutdialSupport() {
        return enableUriOutdialSupport;
    }

    /**
     * Sets the value of the enableUriOutdialSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableUriOutdialSupport(String value) {
        this.enableUriOutdialSupport = value;
    }

    /**
     * Gets the value of the userAgentServerHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgentServerHeaderInfo() {
        return userAgentServerHeaderInfo;
    }

    /**
     * Sets the value of the userAgentServerHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgentServerHeaderInfo(String value) {
        this.userAgentServerHeaderInfo = value;
    }

    /**
     * Gets the value of the allowPresentationSharingUsingBfcp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowPresentationSharingUsingBfcp() {
        return allowPresentationSharingUsingBfcp;
    }

    /**
     * Sets the value of the allowPresentationSharingUsingBfcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowPresentationSharingUsingBfcp(String value) {
        this.allowPresentationSharingUsingBfcp = value;
    }

    /**
     * Gets the value of the scriptParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptParameters() {
        return scriptParameters;
    }

    /**
     * Sets the value of the scriptParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptParameters(String value) {
        this.scriptParameters = value;
    }

    /**
     * Gets the value of the isScriptTraceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsScriptTraceEnabled() {
        return isScriptTraceEnabled;
    }

    /**
     * Sets the value of the isScriptTraceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsScriptTraceEnabled(String value) {
        this.isScriptTraceEnabled = value;
    }

    /**
     * Gets the value of the sipNormalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipNormalizationScript() {
        return sipNormalizationScript;
    }

    /**
     * Sets the value of the sipNormalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipNormalizationScript(XFkType value) {
        this.sipNormalizationScript = value;
    }

    /**
     * Gets the value of the allowiXApplicationMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowiXApplicationMedia() {
        return allowiXApplicationMedia;
    }

    /**
     * Sets the value of the allowiXApplicationMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowiXApplicationMedia(String value) {
        this.allowiXApplicationMedia = value;
    }

    /**
     * Gets the value of the dialStringInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialStringInterpretation() {
        return dialStringInterpretation;
    }

    /**
     * Sets the value of the dialStringInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialStringInterpretation(String value) {
        this.dialStringInterpretation = value;
    }

    /**
     * Gets the value of the acceptAudioCodecPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptAudioCodecPreferences() {
        return acceptAudioCodecPreferences;
    }

    /**
     * Sets the value of the acceptAudioCodecPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptAudioCodecPreferences(String value) {
        this.acceptAudioCodecPreferences = value;
    }

    /**
     * Gets the value of the mlppUserAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppUserAuthorization() {
        return mlppUserAuthorization;
    }

    /**
     * Sets the value of the mlppUserAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppUserAuthorization(String value) {
        this.mlppUserAuthorization = value;
    }

    /**
     * Gets the value of the isAssuredSipServiceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAssuredSipServiceEnabled() {
        return isAssuredSipServiceEnabled;
    }

    /**
     * Sets the value of the isAssuredSipServiceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAssuredSipServiceEnabled(String value) {
        this.isAssuredSipServiceEnabled = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getResourcePriorityNamespace() {
        return resourcePriorityNamespace;
    }

    /**
     * Sets the value of the resourcePriorityNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setResourcePriorityNamespace(XFkType value) {
        this.resourcePriorityNamespace = value;
    }

    /**
     * Gets the value of the useCallerIdCallerNameinUriOutgoingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCallerIdCallerNameinUriOutgoingRequest() {
        return useCallerIdCallerNameinUriOutgoingRequest;
    }

    /**
     * Sets the value of the useCallerIdCallerNameinUriOutgoingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCallerIdCallerNameinUriOutgoingRequest(String value) {
        this.useCallerIdCallerNameinUriOutgoingRequest = value;
    }

    /**
     * Gets the value of the callerIdDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdDn(String value) {
        this.callerIdDn = value;
    }

    /**
     * Gets the value of the callerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerName() {
        return callerName;
    }

    /**
     * Sets the value of the callerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerName(String value) {
        this.callerName = value;
    }

    /**
     * Gets the value of the callingLineIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdentification() {
        return callingLineIdentification;
    }

    /**
     * Sets the value of the callingLineIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdentification(String value) {
        this.callingLineIdentification = value;
    }

    /**
     * Gets the value of the rejectAnonymousIncomingCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectAnonymousIncomingCall() {
        return rejectAnonymousIncomingCall;
    }

    /**
     * Sets the value of the rejectAnonymousIncomingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectAnonymousIncomingCall(String value) {
        this.rejectAnonymousIncomingCall = value;
    }

    /**
     * Gets the value of the callpickupUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupUri() {
        return callpickupUri;
    }

    /**
     * Sets the value of the callpickupUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupUri(String value) {
        this.callpickupUri = value;
    }

    /**
     * Gets the value of the rejectAnonymousOutgoingCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectAnonymousOutgoingCall() {
        return rejectAnonymousOutgoingCall;
    }

    /**
     * Sets the value of the rejectAnonymousOutgoingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectAnonymousOutgoingCall(String value) {
        this.rejectAnonymousOutgoingCall = value;
    }

    /**
     * Gets the value of the videoCallTrafficClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoCallTrafficClass() {
        return videoCallTrafficClass;
    }

    /**
     * Sets the value of the videoCallTrafficClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoCallTrafficClass(String value) {
        this.videoCallTrafficClass = value;
    }

    /**
     * Gets the value of the sdpTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSdpTransparency() {
        return sdpTransparency;
    }

    /**
     * Sets the value of the sdpTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSdpTransparency(XFkType value) {
        this.sdpTransparency = value;
    }

    /**
     * Gets the value of the allowMultipleCodecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowMultipleCodecs() {
        return allowMultipleCodecs;
    }

    /**
     * Sets the value of the allowMultipleCodecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowMultipleCodecs(String value) {
        this.allowMultipleCodecs = value;
    }

    /**
     * Gets the value of the sipSessionRefreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipSessionRefreshMethod() {
        return sipSessionRefreshMethod;
    }

    /**
     * Sets the value of the sipSessionRefreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipSessionRefreshMethod(String value) {
        this.sipSessionRefreshMethod = value;
    }

    /**
     * Gets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyOfferSuppVoiceCall() {
        return earlyOfferSuppVoiceCall;
    }

    /**
     * Sets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyOfferSuppVoiceCall(String value) {
        this.earlyOfferSuppVoiceCall = value;
    }

    /**
     * Gets the value of the cucmVersionInSipHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCucmVersionInSipHeader() {
        return cucmVersionInSipHeader;
    }

    /**
     * Sets the value of the cucmVersionInSipHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCucmVersionInSipHeader(String value) {
        this.cucmVersionInSipHeader = value;
    }

    /**
     * Gets the value of the confidentialAccessLevelHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialAccessLevelHeaders() {
        return confidentialAccessLevelHeaders;
    }

    /**
     * Sets the value of the confidentialAccessLevelHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialAccessLevelHeaders(String value) {
        this.confidentialAccessLevelHeaders = value;
    }

    /**
     * Gets the value of the destRouteString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestRouteString() {
        return destRouteString;
    }

    /**
     * Sets the value of the destRouteString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestRouteString(String value) {
        this.destRouteString = value;
    }

    /**
     * Gets the value of the inactiveSDPRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveSDPRequired() {
        return inactiveSDPRequired;
    }

    /**
     * Sets the value of the inactiveSDPRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveSDPRequired(String value) {
        this.inactiveSDPRequired = value;
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

}
