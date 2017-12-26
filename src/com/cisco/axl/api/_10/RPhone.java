
package com.cisco.axl.api._10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}XProduct" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/10.5}XModel" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}XClass" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/10.5}XDeviceProtocol" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/10.5}XProtocolSide" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="commonPhoneConfigName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/10.5}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/10.5}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="versionStamp" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="securityProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="sipProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="sendGeoLocation" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}RPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}RNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numberOfButtons" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
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
 *         &lt;element name="busyLampFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/10.5}RBusyLampField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryPhoneName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingIdleBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="ringSettingBusyBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="blfDirectedCallParks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}RBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addOnModules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}RAddOnModule" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/10.5}XCountry" minOccurs="0"/>
 *         &lt;element name="idleTimeout" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="authenticationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idleUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messagesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyServerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="loginUserId" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="defaultProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableExtensionMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="currentProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="loginTime" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="loginDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="currentConfig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *                   &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *                   &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
 *                   &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}XBarge" minOccurs="0"/>
 *                   &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *                   &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}XDNDOption" minOccurs="0"/>
 *                   &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="emccCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                   &lt;element name="model" type="{http://www.cisco.com/AXL/API/10.5}XModel" minOccurs="0"/>
 *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}XProduct" minOccurs="0"/>
 *                   &lt;element name="deviceProtocol" type="{http://www.cisco.com/AXL/API/10.5}XDeviceProtocol" minOccurs="0"/>
 *                   &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}XClass" minOccurs="0"/>
 *                   &lt;element name="addressMode" type="{http://www.cisco.com/AXL/API/10.5}XIPAddressingMode" minOccurs="0"/>
 *                   &lt;element name="allowAutoConfig" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="remoteSrstOption" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *                   &lt;element name="remoteSrstIp" type="{http://www.cisco.com/AXL/API/10.5}String15" minOccurs="0"/>
 *                   &lt;element name="remoteSrstPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                   &lt;element name="remoteSipSrstIp" type="{http://www.cisco.com/AXL/API/10.5}String15" minOccurs="0"/>
 *                   &lt;element name="remoteSipSrstPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                   &lt;element name="geolocationInfo" type="{http://www.cisco.com/AXL/API/10.5}String2048" minOccurs="0"/>
 *                   &lt;element name="remoteLocationName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}XBarge" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="builtInBridgeStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="hlogStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="ownerUserName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/10.5}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="rerouteCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowCtiControlFlag" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="requireDtmfReception" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rfc2833Disabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="certificateOperation" type="{http://www.cisco.com/AXL/API/10.5}XCertificateOperation" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/10.5}XAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/10.5}XKeySize" minOccurs="0"/>
 *         &lt;element name="authenticationString" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="certificateStatus" type="{http://www.cisco.com/AXL/API/10.5}XCertificateStatus" minOccurs="0"/>
 *         &lt;element name="upgradeFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceMobilityMode" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="roamingDevicePoolName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="remoteDevice" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="isDualMode" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mobilityUserIdName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="phoneSuite" type="{http://www.cisco.com/AXL/API/10.5}XPhonePersonalization" minOccurs="0"/>
 *         &lt;element name="phoneServiceDisplay" type="{http://www.cisco.com/AXL/API/10.5}XPhoneServiceDisplay" minOccurs="0"/>
 *         &lt;element name="isProtected" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mtpRequired" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mtpPreferedCodec" type="{http://www.cisco.com/AXL/API/10.5}XSIPCodec" minOccurs="0"/>
 *         &lt;element name="dialRulesName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="sshUserId" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="sshPwd" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="digestUser" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="outboundCallRollover" type="{http://www.cisco.com/AXL/API/10.5}XOutboundCallRollover" minOccurs="0"/>
 *         &lt;element name="hotlineDevice" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="secureInformationUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="secureDirectoryUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="secureMessageUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="secureServicesUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="secureAuthenticationUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="secureIdleUrl" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="deviceTrustMode" type="{http://www.cisco.com/AXL/API/10.5}XDeviceTrustMode" minOccurs="0"/>
 *         &lt;element name="earlyOfferSupportForVoiceCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="requireThirdPartyRegistration" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="blockIncomingCallsWhenRoaming" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="homeNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowPresentationSharingUsingBfcp" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
 *         &lt;element name="requireOffPremiseLocation" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="allowiXApplicableMedia" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="cgpnIngressDN" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnIngressDN" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="enableCallRoutingToRdWhenNoneIsActive" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="wifiHotspotProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="wirelessLanProfileGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPhone", propOrder = {
    "name",
    "description",
    "product",
    "model",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "commonPhoneConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "versionStamp",
    "traceFlag",
    "mlppDomainId",
    "mlppIndicationStatus",
    "preemption",
    "useTrustedRelayPoint",
    "retryVideoCallAsAudio",
    "securityProfileName",
    "sipProfileName",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "geoLocationFilterName",
    "sendGeoLocation",
    "lines",
    "numberOfButtons",
    "phoneTemplateName",
    "speeddials",
    "busyLampFields",
    "primaryPhoneName",
    "ringSettingIdleBlfAudibleAlert",
    "ringSettingBusyBlfAudibleAlert",
    "blfDirectedCallParks",
    "addOnModules",
    "userLocale",
    "networkLocale",
    "idleTimeout",
    "authenticationUrl",
    "directoryUrl",
    "idleUrl",
    "informationUrl",
    "messagesUrl",
    "proxyServerUrl",
    "servicesUrl",
    "services",
    "softkeyTemplateName",
    "loginUserId",
    "defaultProfileName",
    "enableExtensionMobility",
    "currentProfileName",
    "loginTime",
    "loginDuration",
    "currentConfig",
    "singleButtonBarge",
    "joinAcrossLines",
    "builtInBridgeStatus",
    "callInfoPrivacyStatus",
    "hlogStatus",
    "ownerUserName",
    "ignorePresentationIndicators",
    "packetCaptureMode",
    "packetCaptureDuration",
    "subscribeCallingSearchSpaceName",
    "rerouteCallingSearchSpaceName",
    "allowCtiControlFlag",
    "presenceGroupName",
    "unattendedPort",
    "requireDtmfReception",
    "rfc2833Disabled",
    "certificateOperation",
    "authenticationMode",
    "keySize",
    "authenticationString",
    "certificateStatus",
    "upgradeFinishTime",
    "deviceMobilityMode",
    "roamingDevicePoolName",
    "remoteDevice",
    "dndOption",
    "dndRingSetting",
    "dndStatus",
    "isActive",
    "isDualMode",
    "mobilityUserIdName",
    "phoneSuite",
    "phoneServiceDisplay",
    "isProtected",
    "mtpRequired",
    "mtpPreferedCodec",
    "dialRulesName",
    "sshUserId",
    "sshPwd",
    "digestUser",
    "outboundCallRollover",
    "hotlineDevice",
    "secureInformationUrl",
    "secureDirectoryUrl",
    "secureMessageUrl",
    "secureServicesUrl",
    "secureAuthenticationUrl",
    "secureIdleUrl",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "featureControlPolicy",
    "deviceTrustMode",
    "earlyOfferSupportForVoiceCall",
    "requireThirdPartyRegistration",
    "blockIncomingCallsWhenRoaming",
    "homeNetworkId",
    "allowPresentationSharingUsingBfcp",
    "confidentialAccess",
    "requireOffPremiseLocation",
    "allowiXApplicableMedia",
    "cgpnIngressDN",
    "useDevicePoolCgpnIngressDN",
    "msisdn",
    "enableCallRoutingToRdWhenNoneIsActive",
    "wifiHotspotProfile",
    "wirelessLanProfileGroup"
})
public class RPhone {

    protected String name;
    protected String description;
    protected String product;
    protected String model;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    protected String protocolSide;
    protected XFkType callingSearchSpaceName;
    protected XFkType devicePoolName;
    protected XFkType commonDeviceConfigName;
    protected XFkType commonPhoneConfigName;
    protected String networkLocation;
    protected XFkType locationName;
    protected XFkType mediaResourceListName;
    protected String networkHoldMohAudioSourceId;
    protected String userHoldMohAudioSourceId;
    protected XFkType automatedAlternateRoutingCssName;
    protected XFkType aarNeighborhoodName;
    protected XLoadInformation loadInformation;
    protected XVendorConfig vendorConfig;
    protected String versionStamp;
    protected String traceFlag;
    protected String mlppDomainId;
    protected String mlppIndicationStatus;
    protected String preemption;
    protected String useTrustedRelayPoint;
    protected String retryVideoCallAsAudio;
    protected XFkType securityProfileName;
    protected XFkType sipProfileName;
    protected XFkType cgpnTransformationCssName;
    protected String useDevicePoolCgpnTransformCss;
    protected XFkType geoLocationName;
    protected XFkType geoLocationFilterName;
    protected String sendGeoLocation;
    protected RPhone.Lines lines;
    protected String numberOfButtons;
    protected XFkType phoneTemplateName;
    protected RPhone.Speeddials speeddials;
    protected RPhone.BusyLampFields busyLampFields;
    protected XFkType primaryPhoneName;
    protected String ringSettingIdleBlfAudibleAlert;
    protected String ringSettingBusyBlfAudibleAlert;
    protected RPhone.BlfDirectedCallParks blfDirectedCallParks;
    protected RPhone.AddOnModules addOnModules;
    protected String userLocale;
    protected String networkLocale;
    protected String idleTimeout;
    protected String authenticationUrl;
    protected String directoryUrl;
    protected String idleUrl;
    protected String informationUrl;
    protected String messagesUrl;
    protected String proxyServerUrl;
    protected String servicesUrl;
    protected RPhone.Services services;
    protected XFkType softkeyTemplateName;
    protected String loginUserId;
    protected XFkType defaultProfileName;
    protected String enableExtensionMobility;
    protected XFkType currentProfileName;
    protected String loginTime;
    protected String loginDuration;
    protected RPhone.CurrentConfig currentConfig;
    protected String singleButtonBarge;
    protected String joinAcrossLines;
    protected String builtInBridgeStatus;
    protected String callInfoPrivacyStatus;
    protected String hlogStatus;
    protected XFkType ownerUserName;
    protected String ignorePresentationIndicators;
    protected String packetCaptureMode;
    protected String packetCaptureDuration;
    protected XFkType subscribeCallingSearchSpaceName;
    protected XFkType rerouteCallingSearchSpaceName;
    protected String allowCtiControlFlag;
    protected XFkType presenceGroupName;
    protected String unattendedPort;
    protected String requireDtmfReception;
    protected String rfc2833Disabled;
    protected String certificateOperation;
    protected String authenticationMode;
    protected String keySize;
    protected String authenticationString;
    protected String certificateStatus;
    protected String upgradeFinishTime;
    protected String deviceMobilityMode;
    protected XFkType roamingDevicePoolName;
    protected String remoteDevice;
    protected String dndOption;
    protected String dndRingSetting;
    protected String dndStatus;
    protected String isActive;
    protected String isDualMode;
    protected XFkType mobilityUserIdName;
    protected String phoneSuite;
    protected String phoneServiceDisplay;
    protected String isProtected;
    protected String mtpRequired;
    protected String mtpPreferedCodec;
    protected XFkType dialRulesName;
    protected String sshUserId;
    protected String sshPwd;
    protected String digestUser;
    protected String outboundCallRollover;
    protected String hotlineDevice;
    protected String secureInformationUrl;
    protected String secureDirectoryUrl;
    protected String secureMessageUrl;
    protected String secureServicesUrl;
    protected String secureAuthenticationUrl;
    protected String secureIdleUrl;
    protected String alwaysUsePrimeLine;
    protected String alwaysUsePrimeLineForVoiceMessage;
    protected XFkType featureControlPolicy;
    protected String deviceTrustMode;
    protected String earlyOfferSupportForVoiceCall;
    protected String requireThirdPartyRegistration;
    protected String blockIncomingCallsWhenRoaming;
    protected String homeNetworkId;
    @XmlElement(name = "AllowPresentationSharingUsingBfcp")
    protected String allowPresentationSharingUsingBfcp;
    protected RPhone.ConfidentialAccess confidentialAccess;
    protected String requireOffPremiseLocation;
    protected String allowiXApplicableMedia;
    protected XFkType cgpnIngressDN;
    protected String useDevicePoolCgpnIngressDN;
    protected String msisdn;
    protected String enableCallRoutingToRdWhenNoneIsActive;
    protected XFkType wifiHotspotProfile;
    protected XFkType wirelessLanProfileGroup;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolSide(String value) {
        this.protocolSide = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpaceName(XFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevicePoolName(XFkType value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonDeviceConfigName(XFkType value) {
        this.commonDeviceConfigName = value;
    }

    /**
     * Gets the value of the commonPhoneConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonPhoneConfigName() {
        return commonPhoneConfigName;
    }

    /**
     * Sets the value of the commonPhoneConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonPhoneConfigName(XFkType value) {
        this.commonPhoneConfigName = value;
    }

    /**
     * Gets the value of the networkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocation() {
        return networkLocation;
    }

    /**
     * Sets the value of the networkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocation(String value) {
        this.networkLocation = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMediaResourceListName(XFkType value) {
        this.mediaResourceListName = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(String value) {
        this.networkHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSourceId(String value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAutomatedAlternateRoutingCssName(XFkType value) {
        this.automatedAlternateRoutingCssName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarNeighborhoodName(XFkType value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link XLoadInformation }
     *     
     */
    public XLoadInformation getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLoadInformation }
     *     
     */
    public void setLoadInformation(XLoadInformation value) {
        this.loadInformation = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
    }

    /**
     * Gets the value of the versionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionStamp() {
        return versionStamp;
    }

    /**
     * Sets the value of the versionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionStamp(String value) {
        this.versionStamp = value;
    }

    /**
     * Gets the value of the traceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceFlag() {
        return traceFlag;
    }

    /**
     * Sets the value of the traceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceFlag(String value) {
        this.traceFlag = value;
    }

    /**
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppDomainId(String value) {
        this.mlppDomainId = value;
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
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
     * Gets the value of the securityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * Sets the value of the securityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecurityProfileName(XFkType value) {
        this.securityProfileName = value;
    }

    /**
     * Gets the value of the sipProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipProfileName() {
        return sipProfileName;
    }

    /**
     * Sets the value of the sipProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipProfileName(XFkType value) {
        this.sipProfileName = value;
    }

    /**
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCgpnTransformationCssName(XFkType value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCss() {
        return useDevicePoolCgpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCss(String value) {
        this.useDevicePoolCgpnTransformCss = value;
    }

    /**
     * Gets the value of the geoLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationName(XFkType value) {
        this.geoLocationName = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationFilterName(XFkType value) {
        this.geoLocationFilterName = value;
    }

    /**
     * Gets the value of the sendGeoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendGeoLocation() {
        return sendGeoLocation;
    }

    /**
     * Sets the value of the sendGeoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendGeoLocation(String value) {
        this.sendGeoLocation = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.Lines }
     *     
     */
    public RPhone.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.Lines }
     *     
     */
    public void setLines(RPhone.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the numberOfButtons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfButtons() {
        return numberOfButtons;
    }

    /**
     * Sets the value of the numberOfButtons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfButtons(String value) {
        this.numberOfButtons = value;
    }

    /**
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneTemplateName(XFkType value) {
        this.phoneTemplateName = value;
    }

    /**
     * Gets the value of the speeddials property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.Speeddials }
     *     
     */
    public RPhone.Speeddials getSpeeddials() {
        return speeddials;
    }

    /**
     * Sets the value of the speeddials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.Speeddials }
     *     
     */
    public void setSpeeddials(RPhone.Speeddials value) {
        this.speeddials = value;
    }

    /**
     * Gets the value of the busyLampFields property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.BusyLampFields }
     *     
     */
    public RPhone.BusyLampFields getBusyLampFields() {
        return busyLampFields;
    }

    /**
     * Sets the value of the busyLampFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.BusyLampFields }
     *     
     */
    public void setBusyLampFields(RPhone.BusyLampFields value) {
        this.busyLampFields = value;
    }

    /**
     * Gets the value of the primaryPhoneName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryPhoneName() {
        return primaryPhoneName;
    }

    /**
     * Sets the value of the primaryPhoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryPhoneName(XFkType value) {
        this.primaryPhoneName = value;
    }

    /**
     * Gets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingIdleBlfAudibleAlert() {
        return ringSettingIdleBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingIdleBlfAudibleAlert(String value) {
        this.ringSettingIdleBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingBusyBlfAudibleAlert() {
        return ringSettingBusyBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingBusyBlfAudibleAlert(String value) {
        this.ringSettingBusyBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the blfDirectedCallParks property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.BlfDirectedCallParks }
     *     
     */
    public RPhone.BlfDirectedCallParks getBlfDirectedCallParks() {
        return blfDirectedCallParks;
    }

    /**
     * Sets the value of the blfDirectedCallParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.BlfDirectedCallParks }
     *     
     */
    public void setBlfDirectedCallParks(RPhone.BlfDirectedCallParks value) {
        this.blfDirectedCallParks = value;
    }

    /**
     * Gets the value of the addOnModules property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.AddOnModules }
     *     
     */
    public RPhone.AddOnModules getAddOnModules() {
        return addOnModules;
    }

    /**
     * Sets the value of the addOnModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.AddOnModules }
     *     
     */
    public void setAddOnModules(RPhone.AddOnModules value) {
        this.addOnModules = value;
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
     * Gets the value of the idleTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * Sets the value of the idleTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleTimeout(String value) {
        this.idleTimeout = value;
    }

    /**
     * Gets the value of the authenticationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    /**
     * Sets the value of the authenticationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationUrl(String value) {
        this.authenticationUrl = value;
    }

    /**
     * Gets the value of the directoryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryUrl() {
        return directoryUrl;
    }

    /**
     * Sets the value of the directoryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryUrl(String value) {
        this.directoryUrl = value;
    }

    /**
     * Gets the value of the idleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleUrl() {
        return idleUrl;
    }

    /**
     * Sets the value of the idleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleUrl(String value) {
        this.idleUrl = value;
    }

    /**
     * Gets the value of the informationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationUrl() {
        return informationUrl;
    }

    /**
     * Sets the value of the informationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationUrl(String value) {
        this.informationUrl = value;
    }

    /**
     * Gets the value of the messagesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagesUrl() {
        return messagesUrl;
    }

    /**
     * Sets the value of the messagesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagesUrl(String value) {
        this.messagesUrl = value;
    }

    /**
     * Gets the value of the proxyServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyServerUrl() {
        return proxyServerUrl;
    }

    /**
     * Sets the value of the proxyServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyServerUrl(String value) {
        this.proxyServerUrl = value;
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
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.Services }
     *     
     */
    public RPhone.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.Services }
     *     
     */
    public void setServices(RPhone.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftkeyTemplateName(XFkType value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUserId(String value) {
        this.loginUserId = value;
    }

    /**
     * Gets the value of the defaultProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultProfileName() {
        return defaultProfileName;
    }

    /**
     * Sets the value of the defaultProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultProfileName(XFkType value) {
        this.defaultProfileName = value;
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
     * Gets the value of the currentProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCurrentProfileName() {
        return currentProfileName;
    }

    /**
     * Sets the value of the currentProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCurrentProfileName(XFkType value) {
        this.currentProfileName = value;
    }

    /**
     * Gets the value of the loginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTime(String value) {
        this.loginTime = value;
    }

    /**
     * Gets the value of the loginDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDuration() {
        return loginDuration;
    }

    /**
     * Sets the value of the loginDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDuration(String value) {
        this.loginDuration = value;
    }

    /**
     * Gets the value of the currentConfig property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.CurrentConfig }
     *     
     */
    public RPhone.CurrentConfig getCurrentConfig() {
        return currentConfig;
    }

    /**
     * Sets the value of the currentConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.CurrentConfig }
     *     
     */
    public void setCurrentConfig(RPhone.CurrentConfig value) {
        this.currentConfig = value;
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
     * Gets the value of the builtInBridgeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltInBridgeStatus() {
        return builtInBridgeStatus;
    }

    /**
     * Sets the value of the builtInBridgeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltInBridgeStatus(String value) {
        this.builtInBridgeStatus = value;
    }

    /**
     * Gets the value of the callInfoPrivacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallInfoPrivacyStatus() {
        return callInfoPrivacyStatus;
    }

    /**
     * Sets the value of the callInfoPrivacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallInfoPrivacyStatus(String value) {
        this.callInfoPrivacyStatus = value;
    }

    /**
     * Gets the value of the hlogStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHlogStatus() {
        return hlogStatus;
    }

    /**
     * Sets the value of the hlogStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHlogStatus(String value) {
        this.hlogStatus = value;
    }

    /**
     * Gets the value of the ownerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getOwnerUserName() {
        return ownerUserName;
    }

    /**
     * Sets the value of the ownerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setOwnerUserName(XFkType value) {
        this.ownerUserName = value;
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
     * Gets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRerouteCallingSearchSpaceName() {
        return rerouteCallingSearchSpaceName;
    }

    /**
     * Sets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRerouteCallingSearchSpaceName(XFkType value) {
        this.rerouteCallingSearchSpaceName = value;
    }

    /**
     * Gets the value of the allowCtiControlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCtiControlFlag() {
        return allowCtiControlFlag;
    }

    /**
     * Sets the value of the allowCtiControlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCtiControlFlag(String value) {
        this.allowCtiControlFlag = value;
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
     * Gets the value of the requireDtmfReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireDtmfReception() {
        return requireDtmfReception;
    }

    /**
     * Sets the value of the requireDtmfReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireDtmfReception(String value) {
        this.requireDtmfReception = value;
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
     * Gets the value of the certificateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOperation() {
        return certificateOperation;
    }

    /**
     * Sets the value of the certificateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOperation(String value) {
        this.certificateOperation = value;
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
     * Gets the value of the certificateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateStatus() {
        return certificateStatus;
    }

    /**
     * Sets the value of the certificateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateStatus(String value) {
        this.certificateStatus = value;
    }

    /**
     * Gets the value of the upgradeFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeFinishTime() {
        return upgradeFinishTime;
    }

    /**
     * Sets the value of the upgradeFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeFinishTime(String value) {
        this.upgradeFinishTime = value;
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
     * Gets the value of the roamingDevicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoamingDevicePoolName() {
        return roamingDevicePoolName;
    }

    /**
     * Sets the value of the roamingDevicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoamingDevicePoolName(XFkType value) {
        this.roamingDevicePoolName = value;
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
     * Gets the value of the dndRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndRingSetting(String value) {
        this.dndRingSetting = value;
    }

    /**
     * Gets the value of the dndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndStatus() {
        return dndStatus;
    }

    /**
     * Sets the value of the dndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndStatus(String value) {
        this.dndStatus = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDualMode() {
        return isDualMode;
    }

    /**
     * Sets the value of the isDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDualMode(String value) {
        this.isDualMode = value;
    }

    /**
     * Gets the value of the mobilityUserIdName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobilityUserIdName() {
        return mobilityUserIdName;
    }

    /**
     * Sets the value of the mobilityUserIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobilityUserIdName(XFkType value) {
        this.mobilityUserIdName = value;
    }

    /**
     * Gets the value of the phoneSuite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneSuite() {
        return phoneSuite;
    }

    /**
     * Sets the value of the phoneSuite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneSuite(String value) {
        this.phoneSuite = value;
    }

    /**
     * Gets the value of the phoneServiceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneServiceDisplay() {
        return phoneServiceDisplay;
    }

    /**
     * Sets the value of the phoneServiceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneServiceDisplay(String value) {
        this.phoneServiceDisplay = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsProtected(String value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the mtpRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpRequired() {
        return mtpRequired;
    }

    /**
     * Sets the value of the mtpRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpRequired(String value) {
        this.mtpRequired = value;
    }

    /**
     * Gets the value of the mtpPreferedCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpPreferedCodec() {
        return mtpPreferedCodec;
    }

    /**
     * Sets the value of the mtpPreferedCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpPreferedCodec(String value) {
        this.mtpPreferedCodec = value;
    }

    /**
     * Gets the value of the dialRulesName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDialRulesName() {
        return dialRulesName;
    }

    /**
     * Sets the value of the dialRulesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDialRulesName(XFkType value) {
        this.dialRulesName = value;
    }

    /**
     * Gets the value of the sshUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshUserId() {
        return sshUserId;
    }

    /**
     * Sets the value of the sshUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshUserId(String value) {
        this.sshUserId = value;
    }

    /**
     * Gets the value of the sshPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshPwd() {
        return sshPwd;
    }

    /**
     * Sets the value of the sshPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshPwd(String value) {
        this.sshPwd = value;
    }

    /**
     * Gets the value of the digestUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestUser() {
        return digestUser;
    }

    /**
     * Sets the value of the digestUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestUser(String value) {
        this.digestUser = value;
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
     * Gets the value of the secureDirectoryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureDirectoryUrl() {
        return secureDirectoryUrl;
    }

    /**
     * Sets the value of the secureDirectoryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureDirectoryUrl(String value) {
        this.secureDirectoryUrl = value;
    }

    /**
     * Gets the value of the secureMessageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureMessageUrl() {
        return secureMessageUrl;
    }

    /**
     * Sets the value of the secureMessageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureMessageUrl(String value) {
        this.secureMessageUrl = value;
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
     * Gets the value of the deviceTrustMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTrustMode() {
        return deviceTrustMode;
    }

    /**
     * Sets the value of the deviceTrustMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTrustMode(String value) {
        this.deviceTrustMode = value;
    }

    /**
     * Gets the value of the earlyOfferSupportForVoiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyOfferSupportForVoiceCall() {
        return earlyOfferSupportForVoiceCall;
    }

    /**
     * Sets the value of the earlyOfferSupportForVoiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyOfferSupportForVoiceCall(String value) {
        this.earlyOfferSupportForVoiceCall = value;
    }

    /**
     * Gets the value of the requireThirdPartyRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireThirdPartyRegistration() {
        return requireThirdPartyRegistration;
    }

    /**
     * Sets the value of the requireThirdPartyRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireThirdPartyRegistration(String value) {
        this.requireThirdPartyRegistration = value;
    }

    /**
     * Gets the value of the blockIncomingCallsWhenRoaming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockIncomingCallsWhenRoaming() {
        return blockIncomingCallsWhenRoaming;
    }

    /**
     * Sets the value of the blockIncomingCallsWhenRoaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockIncomingCallsWhenRoaming(String value) {
        this.blockIncomingCallsWhenRoaming = value;
    }

    /**
     * Gets the value of the homeNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNetworkId() {
        return homeNetworkId;
    }

    /**
     * Sets the value of the homeNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNetworkId(String value) {
        this.homeNetworkId = value;
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
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RPhone.ConfidentialAccess }
     *     
     */
    public RPhone.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPhone.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(RPhone.ConfidentialAccess value) {
        this.confidentialAccess = value;
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
     * Gets the value of the allowiXApplicableMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowiXApplicableMedia() {
        return allowiXApplicableMedia;
    }

    /**
     * Sets the value of the allowiXApplicableMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowiXApplicableMedia(String value) {
        this.allowiXApplicableMedia = value;
    }

    /**
     * Gets the value of the cgpnIngressDN property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCgpnIngressDN() {
        return cgpnIngressDN;
    }

    /**
     * Sets the value of the cgpnIngressDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCgpnIngressDN(XFkType value) {
        this.cgpnIngressDN = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnIngressDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnIngressDN() {
        return useDevicePoolCgpnIngressDN;
    }

    /**
     * Sets the value of the useDevicePoolCgpnIngressDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnIngressDN(String value) {
        this.useDevicePoolCgpnIngressDN = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the enableCallRoutingToRdWhenNoneIsActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCallRoutingToRdWhenNoneIsActive() {
        return enableCallRoutingToRdWhenNoneIsActive;
    }

    /**
     * Sets the value of the enableCallRoutingToRdWhenNoneIsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCallRoutingToRdWhenNoneIsActive(String value) {
        this.enableCallRoutingToRdWhenNoneIsActive = value;
    }

    /**
     * Gets the value of the wifiHotspotProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getWifiHotspotProfile() {
        return wifiHotspotProfile;
    }

    /**
     * Sets the value of the wifiHotspotProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setWifiHotspotProfile(XFkType value) {
        this.wifiHotspotProfile = value;
    }

    /**
     * Gets the value of the wirelessLanProfileGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getWirelessLanProfileGroup() {
        return wirelessLanProfileGroup;
    }

    /**
     * Sets the value of the wirelessLanProfileGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setWirelessLanProfileGroup(XFkType value) {
        this.wirelessLanProfileGroup = value;
    }

    /**
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
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
     *         &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}RAddOnModule" maxOccurs="3" minOccurs="0"/>
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
        "addOnModule"
    })
    public static class AddOnModules {

        protected List<RAddOnModule> addOnModule;

        /**
         * Gets the value of the addOnModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOnModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOnModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAddOnModule }
         * 
         * 
         */
        public List<RAddOnModule> getAddOnModule() {
            if (addOnModule == null) {
                addOnModule = new ArrayList<RAddOnModule>();
            }
            return this.addOnModule;
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
     *         &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}RBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
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
        "blfDirectedCallPark"
    })
    public static class BlfDirectedCallParks {

        protected List<RBLFDirectedCallPark> blfDirectedCallPark;

        /**
         * Gets the value of the blfDirectedCallPark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blfDirectedCallPark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlfDirectedCallPark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBLFDirectedCallPark }
         * 
         * 
         */
        public List<RBLFDirectedCallPark> getBlfDirectedCallPark() {
            if (blfDirectedCallPark == null) {
                blfDirectedCallPark = new ArrayList<RBLFDirectedCallPark>();
            }
            return this.blfDirectedCallPark;
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
     *         &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/10.5}RBusyLampField" maxOccurs="unbounded" minOccurs="0"/>
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
        "busyLampField"
    })
    public static class BusyLampFields {

        protected List<RBusyLampField> busyLampField;

        /**
         * Gets the value of the busyLampField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the busyLampField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusyLampField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBusyLampField }
         * 
         * 
         */
        public List<RBusyLampField> getBusyLampField() {
            if (busyLampField == null) {
                busyLampField = new ArrayList<RBusyLampField>();
            }
            return this.busyLampField;
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
     *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
     *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
     *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
     *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}XBarge" minOccurs="0"/>
     *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/10.5}XRingSetting" minOccurs="0"/>
     *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}XDNDOption" minOccurs="0"/>
     *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="emccCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/10.5}XModel" minOccurs="0"/>
     *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}XProduct" minOccurs="0"/>
     *         &lt;element name="deviceProtocol" type="{http://www.cisco.com/AXL/API/10.5}XDeviceProtocol" minOccurs="0"/>
     *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}XClass" minOccurs="0"/>
     *         &lt;element name="addressMode" type="{http://www.cisco.com/AXL/API/10.5}XIPAddressingMode" minOccurs="0"/>
     *         &lt;element name="allowAutoConfig" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
     *         &lt;element name="remoteSrstOption" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
     *         &lt;element name="remoteSrstIp" type="{http://www.cisco.com/AXL/API/10.5}String15" minOccurs="0"/>
     *         &lt;element name="remoteSrstPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
     *         &lt;element name="remoteSipSrstIp" type="{http://www.cisco.com/AXL/API/10.5}String15" minOccurs="0"/>
     *         &lt;element name="remoteSipSrstPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
     *         &lt;element name="geolocationInfo" type="{http://www.cisco.com/AXL/API/10.5}String2048" minOccurs="0"/>
     *         &lt;element name="remoteLocationName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
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
        "userHoldMohAudioSourceId",
        "phoneTemplateName",
        "mlppDomainId",
        "mlppIndicationStatus",
        "preemption",
        "softkeyTemplateName",
        "ignorePresentationIndicators",
        "singleButtonBarge",
        "joinAcrossLines",
        "callInfoPrivacyStatus",
        "dndStatus",
        "dndRingSetting",
        "dndOption",
        "alwaysUsePrimeLine",
        "alwaysUsePrimeLineForVoiceMessage",
        "emccCallingSearchSpaceName",
        "deviceName",
        "model",
        "product",
        "deviceProtocol",
        "clazz",
        "addressMode",
        "allowAutoConfig",
        "remoteSrstOption",
        "remoteSrstIp",
        "remoteSrstPort",
        "remoteSipSrstIp",
        "remoteSipSrstPort",
        "geolocationInfo",
        "remoteLocationName"
    })
    public static class CurrentConfig {

        protected String userHoldMohAudioSourceId;
        protected XFkType phoneTemplateName;
        protected String mlppDomainId;
        protected String mlppIndicationStatus;
        protected String preemption;
        protected XFkType softkeyTemplateName;
        protected String ignorePresentationIndicators;
        protected String singleButtonBarge;
        protected String joinAcrossLines;
        protected String callInfoPrivacyStatus;
        protected String dndStatus;
        protected String dndRingSetting;
        protected String dndOption;
        protected String alwaysUsePrimeLine;
        protected String alwaysUsePrimeLineForVoiceMessage;
        protected XFkType emccCallingSearchSpaceName;
        protected String deviceName;
        protected String model;
        protected String product;
        protected String deviceProtocol;
        @XmlElement(name = "class")
        protected String clazz;
        protected String addressMode;
        protected String allowAutoConfig;
        protected String remoteSrstOption;
        protected String remoteSrstIp;
        protected String remoteSrstPort;
        protected String remoteSipSrstIp;
        protected String remoteSipSrstPort;
        protected String geolocationInfo;
        protected String remoteLocationName;

        /**
         * Gets the value of the userHoldMohAudioSourceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserHoldMohAudioSourceId() {
            return userHoldMohAudioSourceId;
        }

        /**
         * Sets the value of the userHoldMohAudioSourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserHoldMohAudioSourceId(String value) {
            this.userHoldMohAudioSourceId = value;
        }

        /**
         * Gets the value of the phoneTemplateName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPhoneTemplateName() {
            return phoneTemplateName;
        }

        /**
         * Sets the value of the phoneTemplateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPhoneTemplateName(XFkType value) {
            this.phoneTemplateName = value;
        }

        /**
         * Gets the value of the mlppDomainId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMlppDomainId() {
            return mlppDomainId;
        }

        /**
         * Sets the value of the mlppDomainId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMlppDomainId(String value) {
            this.mlppDomainId = value;
        }

        /**
         * Gets the value of the mlppIndicationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMlppIndicationStatus() {
            return mlppIndicationStatus;
        }

        /**
         * Sets the value of the mlppIndicationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMlppIndicationStatus(String value) {
            this.mlppIndicationStatus = value;
        }

        /**
         * Gets the value of the preemption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreemption() {
            return preemption;
        }

        /**
         * Sets the value of the preemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreemption(String value) {
            this.preemption = value;
        }

        /**
         * Gets the value of the softkeyTemplateName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getSoftkeyTemplateName() {
            return softkeyTemplateName;
        }

        /**
         * Sets the value of the softkeyTemplateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setSoftkeyTemplateName(XFkType value) {
            this.softkeyTemplateName = value;
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
         * Gets the value of the callInfoPrivacyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallInfoPrivacyStatus() {
            return callInfoPrivacyStatus;
        }

        /**
         * Sets the value of the callInfoPrivacyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallInfoPrivacyStatus(String value) {
            this.callInfoPrivacyStatus = value;
        }

        /**
         * Gets the value of the dndStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDndStatus() {
            return dndStatus;
        }

        /**
         * Sets the value of the dndStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDndStatus(String value) {
            this.dndStatus = value;
        }

        /**
         * Gets the value of the dndRingSetting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDndRingSetting() {
            return dndRingSetting;
        }

        /**
         * Sets the value of the dndRingSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDndRingSetting(String value) {
            this.dndRingSetting = value;
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
         * Gets the value of the emccCallingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getEmccCallingSearchSpaceName() {
            return emccCallingSearchSpaceName;
        }

        /**
         * Sets the value of the emccCallingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setEmccCallingSearchSpaceName(XFkType value) {
            this.emccCallingSearchSpaceName = value;
        }

        /**
         * Gets the value of the deviceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceName() {
            return deviceName;
        }

        /**
         * Sets the value of the deviceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceName(String value) {
            this.deviceName = value;
        }

        /**
         * Gets the value of the model property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModel() {
            return model;
        }

        /**
         * Sets the value of the model property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModel(String value) {
            this.model = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProduct(String value) {
            this.product = value;
        }

        /**
         * Gets the value of the deviceProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceProtocol() {
            return deviceProtocol;
        }

        /**
         * Sets the value of the deviceProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceProtocol(String value) {
            this.deviceProtocol = value;
        }

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the addressMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressMode() {
            return addressMode;
        }

        /**
         * Sets the value of the addressMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressMode(String value) {
            this.addressMode = value;
        }

        /**
         * Gets the value of the allowAutoConfig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowAutoConfig() {
            return allowAutoConfig;
        }

        /**
         * Sets the value of the allowAutoConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowAutoConfig(String value) {
            this.allowAutoConfig = value;
        }

        /**
         * Gets the value of the remoteSrstOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstOption() {
            return remoteSrstOption;
        }

        /**
         * Sets the value of the remoteSrstOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstOption(String value) {
            this.remoteSrstOption = value;
        }

        /**
         * Gets the value of the remoteSrstIp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstIp() {
            return remoteSrstIp;
        }

        /**
         * Sets the value of the remoteSrstIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstIp(String value) {
            this.remoteSrstIp = value;
        }

        /**
         * Gets the value of the remoteSrstPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstPort() {
            return remoteSrstPort;
        }

        /**
         * Sets the value of the remoteSrstPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstPort(String value) {
            this.remoteSrstPort = value;
        }

        /**
         * Gets the value of the remoteSipSrstIp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSipSrstIp() {
            return remoteSipSrstIp;
        }

        /**
         * Sets the value of the remoteSipSrstIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSipSrstIp(String value) {
            this.remoteSipSrstIp = value;
        }

        /**
         * Gets the value of the remoteSipSrstPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSipSrstPort() {
            return remoteSipSrstPort;
        }

        /**
         * Sets the value of the remoteSipSrstPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSipSrstPort(String value) {
            this.remoteSipSrstPort = value;
        }

        /**
         * Gets the value of the geolocationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeolocationInfo() {
            return geolocationInfo;
        }

        /**
         * Sets the value of the geolocationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeolocationInfo(String value) {
            this.geolocationInfo = value;
        }

        /**
         * Gets the value of the remoteLocationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteLocationName() {
            return remoteLocationName;
        }

        /**
         * Sets the value of the remoteLocationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteLocationName(String value) {
            this.remoteLocationName = value;
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
     *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}RPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}RNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
        "line",
        "lineIdentifier"
    })
    public static class Lines {

        protected List<RPhoneLine> line;
        protected List<RNumplanIdentifier> lineIdentifier;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RPhoneLine }
         * 
         * 
         */
        public List<RPhoneLine> getLine() {
            if (line == null) {
                line = new ArrayList<RPhoneLine>();
            }
            return this.line;
        }

        /**
         * Gets the value of the lineIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RNumplanIdentifier }
         * 
         * 
         */
        public List<RNumplanIdentifier> getLineIdentifier() {
            if (lineIdentifier == null) {
                lineIdentifier = new ArrayList<RNumplanIdentifier>();
            }
            return this.lineIdentifier;
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
