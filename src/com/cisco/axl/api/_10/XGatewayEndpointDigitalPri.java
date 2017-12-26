
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for XGatewayEndpointDigitalPri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewayEndpointDigitalPri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}UniqueString128"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}XProduct"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}XClass"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/10.5}XDeviceProtocol"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/10.5}XProtocolSide"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/10.5}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/10.5}XCountry" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/10.5}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="mlppPreemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="redirectInboundNumberIe" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="calledPlan" type="{http://www.cisco.com/AXL/API/10.5}XNumberingPlan"/>
 *         &lt;element name="calledPri" type="{http://www.cisco.com/AXL/API/10.5}XPriOfNumber"/>
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/10.5}XCallingPartySelection"/>
 *         &lt;element name="callingPlan" type="{http://www.cisco.com/AXL/API/10.5}XNumberingPlan"/>
 *         &lt;element name="callingPri" type="{http://www.cisco.com/AXL/API/10.5}XPriOfNumber"/>
 *         &lt;element name="chanIE" type="{http://www.cisco.com/AXL/API/10.5}XPRIChanIE"/>
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/10.5}XClockReference"/>
 *         &lt;element name="dChannelEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="channelSelectionOrder" type="{http://www.cisco.com/AXL/API/10.5}XTrunkSelectionOrder"/>
 *         &lt;element name="displayIe" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/10.5}XEncode"/>
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/10.5}XCSUParam"/>
 *         &lt;element name="firstDelay" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="interfaceIdPresent" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="interfaceId" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="intraDelay" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="mcdnEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="redirectOutboundNumberIe" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="numDigitsToStrip" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="passingPrecedenceLevelThrough" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}XPresentationBit"/>
 *         &lt;element name="connectedLineIdPresentation" type="{http://www.cisco.com/AXL/API/10.5}XPresentationBit"/>
 *         &lt;element name="priProtocol" type="{http://www.cisco.com/AXL/API/10.5}XPriProtocol"/>
 *         &lt;element name="securityAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="sendCallingNameInFacilityIe" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="sendExLeadingCharInDispIe" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="sendRestart" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="setupNonIsdnPi" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="sigDigits">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="span" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="statusPoll" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="smdiBasePort" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="GClearEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/10.5}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="transmitUtf8" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="v150" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="asn1RoseOidEncoding" type="{http://www.cisco.com/AXL/API/10.5}XASN1RoseOidEncoding" minOccurs="0"/>
 *         &lt;element name="qsigVariant" type="{http://www.cisco.com/AXL/API/10.5}XQSIGVariant" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="routeClassSignalling" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="nationalStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="internationalStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="unknownStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="subscriberStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="nationalTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="internationalTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="unknownTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssNatl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssIntl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssUnkn" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssSubs" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberPrefix" type="{http://www.cisco.com/AXL/API/10.5}String16" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberStripDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssNatl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssIntl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssUnkn" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssSubs" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCntdPartyTransformationCss" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="cntdPartyTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatewayEndpointDigitalPri", propOrder = {
    "index",
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "networkLocale",
    "mediaResourceListName",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "mlppDomainId",
    "mlppIndicationStatus",
    "mlppPreemption",
    "useTrustedRelayPoint",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "redirectInboundNumberIe",
    "calledPlan",
    "calledPri",
    "callerIdDn",
    "callingPartySelection",
    "callingPlan",
    "callingPri",
    "chanIE",
    "clockReference",
    "dChannelEnable",
    "channelSelectionOrder",
    "displayIe",
    "pcmType",
    "csuParam",
    "firstDelay",
    "interfaceIdPresent",
    "interfaceId",
    "intraDelay",
    "mcdnEnable",
    "redirectOutboundNumberIe",
    "numDigitsToStrip",
    "passingPrecedenceLevelThrough",
    "prefix",
    "callingLinePresentationBit",
    "connectedLineIdPresentation",
    "priProtocol",
    "securityAccessLevel",
    "sendCallingNameInFacilityIe",
    "sendExLeadingCharInDispIe",
    "sendRestart",
    "setupNonIsdnPi",
    "sigDigits",
    "span",
    "statusPoll",
    "smdiBasePort",
    "gClearEnable",
    "packetCaptureMode",
    "packetCaptureDuration",
    "transmitUtf8",
    "v150",
    "asn1RoseOidEncoding",
    "qsigVariant",
    "unattendedPort",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "nationalPrefix",
    "internationalPrefix",
    "unknownPrefix",
    "subscriberPrefix",
    "geoLocationFilterName",
    "routeClassSignalling",
    "nationalStripDigits",
    "internationalStripDigits",
    "unknownStripDigits",
    "subscriberStripDigits",
    "nationalTransformationCssName",
    "internationalTransformationCssName",
    "unknownTransformationCssName",
    "subscriberTransformationCssName",
    "pstnAccess",
    "imeE164TransformationName",
    "useDevicePoolCgpnTransformCssNatl",
    "useDevicePoolCgpnTransformCssIntl",
    "useDevicePoolCgpnTransformCssUnkn",
    "useDevicePoolCgpnTransformCssSubs",
    "calledPartyNationalPrefix",
    "calledPartyInternationalPrefix",
    "calledPartyUnknownPrefix",
    "calledPartySubscriberPrefix",
    "calledPartyNationalStripDigits",
    "calledPartyInternationalStripDigits",
    "calledPartyUnknownStripDigits",
    "calledPartySubscriberStripDigits",
    "calledPartyNationalTransformationCssName",
    "calledPartyInternationalTransformationCssName",
    "calledPartyUnknownTransformationCssName",
    "calledPartySubscriberTransformationCssName",
    "useDevicePoolCalledCssNatl",
    "useDevicePoolCalledCssIntl",
    "useDevicePoolCalledCssUnkn",
    "useDevicePoolCalledCssSubs",
    "useDevicePoolCntdPartyTransformationCss",
    "cntdPartyTransformationCssName",
    "confidentialAccess"
})
public class XGatewayEndpointDigitalPri {

    @XmlElement(defaultValue = "0")
    protected String index;
    protected String name;
    protected String description;
    protected String product;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    @XmlElement(defaultValue = "User")
    protected String protocolSide;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class)
    protected JAXBElement<XFkType> devicePoolName;
    @XmlElementRef(name = "commonDeviceConfigName", type = JAXBElement.class)
    protected JAXBElement<XFkType> commonDeviceConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "loadInformation", type = JAXBElement.class)
    protected JAXBElement<XLoadInformation> loadInformation;
    protected XVendorConfig vendorConfig;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<String> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "Default")
    protected String mlppPreemption;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    protected String redirectInboundNumberIe;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPri;
    @XmlElementRef(name = "callerIdDn", type = JAXBElement.class)
    protected JAXBElement<String> callerIdDn;
    @XmlElement(defaultValue = "Originator")
    protected String callingPartySelection;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPri;
    @XmlElement(defaultValue = "Use Number when 1B")
    protected String chanIE;
    protected String clockReference;
    protected String dChannelEnable;
    @XmlElement(defaultValue = "Top Down")
    protected String channelSelectionOrder;
    protected String displayIe;
    protected String pcmType;
    protected String csuParam;
    @XmlElement(defaultValue = "32")
    protected String firstDelay;
    protected String interfaceIdPresent;
    @XmlElement(defaultValue = "0")
    protected String interfaceId;
    @XmlElement(defaultValue = "4")
    protected String intraDelay;
    protected String mcdnEnable;
    protected String redirectOutboundNumberIe;
    protected String numDigitsToStrip;
    protected String passingPrecedenceLevelThrough;
    @XmlElementRef(name = "prefix", type = JAXBElement.class)
    protected JAXBElement<String> prefix;
    @XmlElement(defaultValue = "Default")
    protected String callingLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedLineIdPresentation;
    protected String priProtocol;
    @XmlElement(defaultValue = "2")
    protected String securityAccessLevel;
    protected String sendCallingNameInFacilityIe;
    protected String sendExLeadingCharInDispIe;
    protected String sendRestart;
    protected String setupNonIsdnPi;
    protected XGatewayEndpointDigitalPri.SigDigits sigDigits;
    protected String span;
    protected String statusPoll;
    @XmlElement(defaultValue = "0")
    protected String smdiBasePort;
    @XmlElement(name = "GClearEnable")
    protected String gClearEnable;
    @XmlElement(defaultValue = "None")
    protected String packetCaptureMode;
    @XmlElementRef(name = "packetCaptureDuration", type = JAXBElement.class)
    protected JAXBElement<String> packetCaptureDuration;
    @XmlElement(defaultValue = "false")
    protected String transmitUtf8;
    @XmlElement(defaultValue = "false")
    protected String v150;
    @XmlElement(defaultValue = "No Changes")
    protected String asn1RoseOidEncoding;
    @XmlElement(defaultValue = "No Changes")
    protected String qsigVariant;
    @XmlElement(defaultValue = "false")
    protected String unattendedPort;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCdpnTransformCss;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    @XmlElement(defaultValue = "Default")
    protected String routeClassSignalling;
    @XmlElementRef(name = "nationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> nationalStripDigits;
    @XmlElementRef(name = "internationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> internationalStripDigits;
    @XmlElementRef(name = "unknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> unknownStripDigits;
    @XmlElementRef(name = "subscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> subscriberStripDigits;
    @XmlElementRef(name = "nationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> nationalTransformationCssName;
    @XmlElementRef(name = "internationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> internationalTransformationCssName;
    @XmlElementRef(name = "unknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> unknownTransformationCssName;
    @XmlElementRef(name = "subscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscriberTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String pstnAccess;
    @XmlElementRef(name = "imeE164TransformationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> imeE164TransformationName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssNatl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssIntl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssUnkn;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssSubs;
    protected String calledPartyNationalPrefix;
    protected String calledPartyInternationalPrefix;
    protected String calledPartyUnknownPrefix;
    protected String calledPartySubscriberPrefix;
    @XmlElementRef(name = "calledPartyNationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyNationalStripDigits;
    @XmlElementRef(name = "calledPartyInternationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyInternationalStripDigits;
    @XmlElementRef(name = "calledPartyUnknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyUnknownStripDigits;
    @XmlElementRef(name = "calledPartySubscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartySubscriberStripDigits;
    @XmlElementRef(name = "calledPartyNationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyNationalTransformationCssName;
    @XmlElementRef(name = "calledPartyInternationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyInternationalTransformationCssName;
    @XmlElementRef(name = "calledPartyUnknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyUnknownTransformationCssName;
    @XmlElementRef(name = "calledPartySubscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartySubscriberTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssNatl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssIntl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssUnkn;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCalledCssSubs;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCntdPartyTransformationCss;
    @XmlElementRef(name = "cntdPartyTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cntdPartyTransformationCssName;
    protected XGatewayEndpointDigitalPri.ConfidentialAccess confidentialAccess;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.callingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDevicePoolName(JAXBElement<XFkType> value) {
        this.devicePoolName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCommonDeviceConfigName(JAXBElement<XFkType> value) {
        this.commonDeviceConfigName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the networkLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkLocale(JAXBElement<String> value) {
        this.networkLocale = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMediaResourceListName(JAXBElement<XFkType> value) {
        this.mediaResourceListName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAutomatedAlternateRoutingCssName(JAXBElement<XFkType> value) {
        this.automatedAlternateRoutingCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAarNeighborhoodName(JAXBElement<XFkType> value) {
        this.aarNeighborhoodName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public JAXBElement<XLoadInformation> getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public void setLoadInformation(JAXBElement<XLoadInformation> value) {
        this.loadInformation = ((JAXBElement<XLoadInformation> ) value);
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
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppDomainId(JAXBElement<String> value) {
        this.mlppDomainId = ((JAXBElement<String> ) value);
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
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCgpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cgpnTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationName(JAXBElement<XFkType> value) {
        this.geoLocationName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the redirectInboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectInboundNumberIe() {
        return redirectInboundNumberIe;
    }

    /**
     * Sets the value of the redirectInboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectInboundNumberIe(String value) {
        this.redirectInboundNumberIe = value;
    }

    /**
     * Gets the value of the calledPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPlan() {
        return calledPlan;
    }

    /**
     * Sets the value of the calledPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPlan(String value) {
        this.calledPlan = value;
    }

    /**
     * Gets the value of the calledPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPri() {
        return calledPri;
    }

    /**
     * Sets the value of the calledPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPri(String value) {
        this.calledPri = value;
    }

    /**
     * Gets the value of the callerIdDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallerIdDn(JAXBElement<String> value) {
        this.callerIdDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartySelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySelection() {
        return callingPartySelection;
    }

    /**
     * Sets the value of the callingPartySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySelection(String value) {
        this.callingPartySelection = value;
    }

    /**
     * Gets the value of the callingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPlan() {
        return callingPlan;
    }

    /**
     * Sets the value of the callingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPlan(String value) {
        this.callingPlan = value;
    }

    /**
     * Gets the value of the callingPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPri() {
        return callingPri;
    }

    /**
     * Sets the value of the callingPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPri(String value) {
        this.callingPri = value;
    }

    /**
     * Gets the value of the chanIE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanIE() {
        return chanIE;
    }

    /**
     * Sets the value of the chanIE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanIE(String value) {
        this.chanIE = value;
    }

    /**
     * Gets the value of the clockReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockReference() {
        return clockReference;
    }

    /**
     * Sets the value of the clockReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockReference(String value) {
        this.clockReference = value;
    }

    /**
     * Gets the value of the dChannelEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDChannelEnable() {
        return dChannelEnable;
    }

    /**
     * Sets the value of the dChannelEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDChannelEnable(String value) {
        this.dChannelEnable = value;
    }

    /**
     * Gets the value of the channelSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSelectionOrder() {
        return channelSelectionOrder;
    }

    /**
     * Sets the value of the channelSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSelectionOrder(String value) {
        this.channelSelectionOrder = value;
    }

    /**
     * Gets the value of the displayIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayIe() {
        return displayIe;
    }

    /**
     * Sets the value of the displayIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayIe(String value) {
        this.displayIe = value;
    }

    /**
     * Gets the value of the pcmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcmType() {
        return pcmType;
    }

    /**
     * Sets the value of the pcmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcmType(String value) {
        this.pcmType = value;
    }

    /**
     * Gets the value of the csuParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsuParam() {
        return csuParam;
    }

    /**
     * Sets the value of the csuParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsuParam(String value) {
        this.csuParam = value;
    }

    /**
     * Gets the value of the firstDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDelay() {
        return firstDelay;
    }

    /**
     * Sets the value of the firstDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDelay(String value) {
        this.firstDelay = value;
    }

    /**
     * Gets the value of the interfaceIdPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceIdPresent() {
        return interfaceIdPresent;
    }

    /**
     * Sets the value of the interfaceIdPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceIdPresent(String value) {
        this.interfaceIdPresent = value;
    }

    /**
     * Gets the value of the interfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceId(String value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the intraDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraDelay() {
        return intraDelay;
    }

    /**
     * Sets the value of the intraDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraDelay(String value) {
        this.intraDelay = value;
    }

    /**
     * Gets the value of the mcdnEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcdnEnable() {
        return mcdnEnable;
    }

    /**
     * Sets the value of the mcdnEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcdnEnable(String value) {
        this.mcdnEnable = value;
    }

    /**
     * Gets the value of the redirectOutboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectOutboundNumberIe() {
        return redirectOutboundNumberIe;
    }

    /**
     * Sets the value of the redirectOutboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectOutboundNumberIe(String value) {
        this.redirectOutboundNumberIe = value;
    }

    /**
     * Gets the value of the numDigitsToStrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDigitsToStrip() {
        return numDigitsToStrip;
    }

    /**
     * Sets the value of the numDigitsToStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDigitsToStrip(String value) {
        this.numDigitsToStrip = value;
    }

    /**
     * Gets the value of the passingPrecedenceLevelThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassingPrecedenceLevelThrough() {
        return passingPrecedenceLevelThrough;
    }

    /**
     * Sets the value of the passingPrecedenceLevelThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassingPrecedenceLevelThrough(String value) {
        this.passingPrecedenceLevelThrough = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLinePresentationBit() {
        return callingLinePresentationBit;
    }

    /**
     * Sets the value of the callingLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLinePresentationBit(String value) {
        this.callingLinePresentationBit = value;
    }

    /**
     * Gets the value of the connectedLineIdPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedLineIdPresentation() {
        return connectedLineIdPresentation;
    }

    /**
     * Sets the value of the connectedLineIdPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedLineIdPresentation(String value) {
        this.connectedLineIdPresentation = value;
    }

    /**
     * Gets the value of the priProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriProtocol() {
        return priProtocol;
    }

    /**
     * Sets the value of the priProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriProtocol(String value) {
        this.priProtocol = value;
    }

    /**
     * Gets the value of the securityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAccessLevel() {
        return securityAccessLevel;
    }

    /**
     * Sets the value of the securityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAccessLevel(String value) {
        this.securityAccessLevel = value;
    }

    /**
     * Gets the value of the sendCallingNameInFacilityIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCallingNameInFacilityIe() {
        return sendCallingNameInFacilityIe;
    }

    /**
     * Sets the value of the sendCallingNameInFacilityIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCallingNameInFacilityIe(String value) {
        this.sendCallingNameInFacilityIe = value;
    }

    /**
     * Gets the value of the sendExLeadingCharInDispIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendExLeadingCharInDispIe() {
        return sendExLeadingCharInDispIe;
    }

    /**
     * Sets the value of the sendExLeadingCharInDispIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendExLeadingCharInDispIe(String value) {
        this.sendExLeadingCharInDispIe = value;
    }

    /**
     * Gets the value of the sendRestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendRestart() {
        return sendRestart;
    }

    /**
     * Sets the value of the sendRestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendRestart(String value) {
        this.sendRestart = value;
    }

    /**
     * Gets the value of the setupNonIsdnPi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupNonIsdnPi() {
        return setupNonIsdnPi;
    }

    /**
     * Sets the value of the setupNonIsdnPi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupNonIsdnPi(String value) {
        this.setupNonIsdnPi = value;
    }

    /**
     * Gets the value of the sigDigits property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalPri.SigDigits }
     *     
     */
    public XGatewayEndpointDigitalPri.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalPri.SigDigits }
     *     
     */
    public void setSigDigits(XGatewayEndpointDigitalPri.SigDigits value) {
        this.sigDigits = value;
    }

    /**
     * Gets the value of the span property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpan() {
        return span;
    }

    /**
     * Sets the value of the span property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpan(String value) {
        this.span = value;
    }

    /**
     * Gets the value of the statusPoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPoll() {
        return statusPoll;
    }

    /**
     * Sets the value of the statusPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPoll(String value) {
        this.statusPoll = value;
    }

    /**
     * Gets the value of the smdiBasePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmdiBasePort() {
        return smdiBasePort;
    }

    /**
     * Sets the value of the smdiBasePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmdiBasePort(String value) {
        this.smdiBasePort = value;
    }

    /**
     * Gets the value of the gClearEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGClearEnable() {
        return gClearEnable;
    }

    /**
     * Sets the value of the gClearEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGClearEnable(String value) {
        this.gClearEnable = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPacketCaptureDuration() {
        return packetCaptureDuration;
    }

    /**
     * Sets the value of the packetCaptureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPacketCaptureDuration(JAXBElement<String> value) {
        this.packetCaptureDuration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transmitUtf8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitUtf8() {
        return transmitUtf8;
    }

    /**
     * Sets the value of the transmitUtf8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitUtf8(String value) {
        this.transmitUtf8 = value;
    }

    /**
     * Gets the value of the v150 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV150() {
        return v150;
    }

    /**
     * Sets the value of the v150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV150(String value) {
        this.v150 = value;
    }

    /**
     * Gets the value of the asn1RoseOidEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsn1RoseOidEncoding() {
        return asn1RoseOidEncoding;
    }

    /**
     * Sets the value of the asn1RoseOidEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsn1RoseOidEncoding(String value) {
        this.asn1RoseOidEncoding = value;
    }

    /**
     * Gets the value of the qsigVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsigVariant() {
        return qsigVariant;
    }

    /**
     * Sets the value of the qsigVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsigVariant(String value) {
        this.qsigVariant = value;
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
     * Gets the value of the cdpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCdpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cdpnTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCdpnTransformCss() {
        return useDevicePoolCdpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCdpnTransformCss(String value) {
        this.useDevicePoolCdpnTransformCss = value;
    }

    /**
     * Gets the value of the nationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Sets the value of the nationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalPrefix(String value) {
        this.nationalPrefix = value;
    }

    /**
     * Gets the value of the internationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    /**
     * Sets the value of the internationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPrefix(String value) {
        this.internationalPrefix = value;
    }

    /**
     * Gets the value of the unknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownPrefix() {
        return unknownPrefix;
    }

    /**
     * Sets the value of the unknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownPrefix(String value) {
        this.unknownPrefix = value;
    }

    /**
     * Gets the value of the subscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberPrefix() {
        return subscriberPrefix;
    }

    /**
     * Sets the value of the subscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberPrefix(String value) {
        this.subscriberPrefix = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationFilterName(JAXBElement<XFkType> value) {
        this.geoLocationFilterName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the routeClassSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteClassSignalling() {
        return routeClassSignalling;
    }

    /**
     * Sets the value of the routeClassSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteClassSignalling(String value) {
        this.routeClassSignalling = value;
    }

    /**
     * Gets the value of the nationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalStripDigits() {
        return nationalStripDigits;
    }

    /**
     * Sets the value of the nationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalStripDigits(JAXBElement<String> value) {
        this.nationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternationalStripDigits() {
        return internationalStripDigits;
    }

    /**
     * Sets the value of the internationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternationalStripDigits(JAXBElement<String> value) {
        this.internationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnknownStripDigits() {
        return unknownStripDigits;
    }

    /**
     * Sets the value of the unknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnknownStripDigits(JAXBElement<String> value) {
        this.unknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberStripDigits() {
        return subscriberStripDigits;
    }

    /**
     * Sets the value of the subscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberStripDigits(JAXBElement<String> value) {
        this.subscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNationalTransformationCssName() {
        return nationalTransformationCssName;
    }

    /**
     * Sets the value of the nationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.nationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the internationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getInternationalTransformationCssName() {
        return internationalTransformationCssName;
    }

    /**
     * Sets the value of the internationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.internationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the unknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnknownTransformationCssName() {
        return unknownTransformationCssName;
    }

    /**
     * Sets the value of the unknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.unknownTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the subscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscriberTransformationCssName() {
        return subscriberTransformationCssName;
    }

    /**
     * Sets the value of the subscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.subscriberTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnAccess(String value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the imeE164TransformationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getImeE164TransformationName() {
        return imeE164TransformationName;
    }

    /**
     * Sets the value of the imeE164TransformationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setImeE164TransformationName(JAXBElement<XFkType> value) {
        this.imeE164TransformationName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssNatl() {
        return useDevicePoolCgpnTransformCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssNatl(String value) {
        this.useDevicePoolCgpnTransformCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssIntl() {
        return useDevicePoolCgpnTransformCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssIntl(String value) {
        this.useDevicePoolCgpnTransformCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssUnkn() {
        return useDevicePoolCgpnTransformCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssUnkn(String value) {
        this.useDevicePoolCgpnTransformCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssSubs() {
        return useDevicePoolCgpnTransformCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssSubs(String value) {
        this.useDevicePoolCgpnTransformCssSubs = value;
    }

    /**
     * Gets the value of the calledPartyNationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNationalPrefix() {
        return calledPartyNationalPrefix;
    }

    /**
     * Sets the value of the calledPartyNationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNationalPrefix(String value) {
        this.calledPartyNationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyInternationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyInternationalPrefix() {
        return calledPartyInternationalPrefix;
    }

    /**
     * Sets the value of the calledPartyInternationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyInternationalPrefix(String value) {
        this.calledPartyInternationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyUnknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyUnknownPrefix() {
        return calledPartyUnknownPrefix;
    }

    /**
     * Sets the value of the calledPartyUnknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyUnknownPrefix(String value) {
        this.calledPartyUnknownPrefix = value;
    }

    /**
     * Gets the value of the calledPartySubscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartySubscriberPrefix() {
        return calledPartySubscriberPrefix;
    }

    /**
     * Sets the value of the calledPartySubscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartySubscriberPrefix(String value) {
        this.calledPartySubscriberPrefix = value;
    }

    /**
     * Gets the value of the calledPartyNationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyNationalStripDigits() {
        return calledPartyNationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyNationalStripDigits(JAXBElement<String> value) {
        this.calledPartyNationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyInternationalStripDigits() {
        return calledPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyInternationalStripDigits(JAXBElement<String> value) {
        this.calledPartyInternationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyUnknownStripDigits() {
        return calledPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the calledPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyUnknownStripDigits(JAXBElement<String> value) {
        this.calledPartyUnknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartySubscriberStripDigits() {
        return calledPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the calledPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartySubscriberStripDigits(JAXBElement<String> value) {
        this.calledPartySubscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyNationalTransformationCssName() {
        return calledPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyNationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyInternationalTransformationCssName() {
        return calledPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyInternationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyUnknownTransformationCssName() {
        return calledPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyUnknownTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartySubscriberTransformationCssName() {
        return calledPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartySubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartySubscriberTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssNatl() {
        return useDevicePoolCalledCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssNatl(String value) {
        this.useDevicePoolCalledCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssIntl() {
        return useDevicePoolCalledCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssIntl(String value) {
        this.useDevicePoolCalledCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssUnkn() {
        return useDevicePoolCalledCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssUnkn(String value) {
        this.useDevicePoolCalledCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssSubs() {
        return useDevicePoolCalledCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssSubs(String value) {
        this.useDevicePoolCalledCssSubs = value;
    }

    /**
     * Gets the value of the useDevicePoolCntdPartyTransformationCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCntdPartyTransformationCss() {
        return useDevicePoolCntdPartyTransformationCss;
    }

    /**
     * Sets the value of the useDevicePoolCntdPartyTransformationCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCntdPartyTransformationCss(String value) {
        this.useDevicePoolCntdPartyTransformationCss = value;
    }

    /**
     * Gets the value of the cntdPartyTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCntdPartyTransformationCssName() {
        return cntdPartyTransformationCssName;
    }

    /**
     * Sets the value of the cntdPartyTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCntdPartyTransformationCssName(JAXBElement<XFkType> value) {
        this.cntdPartyTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalPri.ConfidentialAccess }
     *     
     */
    public XGatewayEndpointDigitalPri.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalPri.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(XGatewayEndpointDigitalPri.ConfidentialAccess value) {
        this.confidentialAccess = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
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

        @XmlElementRef(name = "confidentialAccessMode", type = JAXBElement.class)
        protected JAXBElement<String> confidentialAccessMode;
        @XmlElementRef(name = "confidentialAccessLevel", type = JAXBElement.class)
        protected JAXBElement<String> confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessMode(JAXBElement<String> value) {
            this.confidentialAccessMode = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessLevel(JAXBElement<String> value) {
            this.confidentialAccessLevel = ((JAXBElement<String> ) value);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
     *       &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SigDigits {

        @XmlValue
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger value;
        @XmlAttribute
        protected Boolean enable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

    }

}
