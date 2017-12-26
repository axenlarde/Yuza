
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
 * <p>Java class for XLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}XPatternUsage"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarDestinationMask" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="aarKeepCallHistory" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="aarVoiceMailEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="callForwardAll" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardAll" minOccurs="0"/>
 *         &lt;element name="callForwardBusy" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardBusy" minOccurs="0"/>
 *         &lt;element name="callForwardBusyInt" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardBusyInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswer" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNoAnswer" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswerInt" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNoAnswerInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverage" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNoCoverage" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverageInt" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNoCoverageInt" minOccurs="0"/>
 *         &lt;element name="callForwardOnFailure" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardOnFailure" minOccurs="0"/>
 *         &lt;element name="callForwardAlternateParty" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardAlternateParty" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegistered" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNotRegistered" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegisteredInt" type="{http://www.cisco.com/AXL/API/10.5}XCallForwardNotRegisteredInt" minOccurs="0"/>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/10.5}XAutoAnswer" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="alertingName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="asciiAlertingName" type="{http://www.cisco.com/AXL/API/10.5}String32" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="shareLineAppearanceCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}XReleaseCauseValue" minOccurs="0"/>
 *         &lt;element name="hrDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="hrInterval" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="cfaCssPolicy" type="{http://www.cisco.com/AXL/API/10.5}XCFACSSActivationPolicy" minOccurs="0"/>
 *         &lt;element name="defaultActivatedDeviceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveDn" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntDn" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveVmEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntVmEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonReversionTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="directoryURIs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}XDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allowCtiControlFlag" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rejectAnonymousCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="patternUrgency" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enterpriseAltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="e164AltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pstnFailover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callControlAgentProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useEnterpriseAltNum" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="useE164AltNum" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLine", propOrder = {
    "pattern",
    "description",
    "usage",
    "routePartitionName",
    "aarNeighborhoodName",
    "aarDestinationMask",
    "aarKeepCallHistory",
    "aarVoiceMailEnabled",
    "callForwardAll",
    "callForwardBusy",
    "callForwardBusyInt",
    "callForwardNoAnswer",
    "callForwardNoAnswerInt",
    "callForwardNoCoverage",
    "callForwardNoCoverageInt",
    "callForwardOnFailure",
    "callForwardAlternateParty",
    "callForwardNotRegistered",
    "callForwardNotRegisteredInt",
    "callPickupGroupName",
    "autoAnswer",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "alertingName",
    "asciiAlertingName",
    "presenceGroupName",
    "shareLineAppearanceCssName",
    "voiceMailProfileName",
    "patternPrecedence",
    "releaseClause",
    "hrDuration",
    "hrInterval",
    "cfaCssPolicy",
    "defaultActivatedDeviceName",
    "parkMonForwardNoRetrieveDn",
    "parkMonForwardNoRetrieveIntDn",
    "parkMonForwardNoRetrieveVmEnabled",
    "parkMonForwardNoRetrieveIntVmEnabled",
    "parkMonForwardNoRetrieveCssName",
    "parkMonForwardNoRetrieveIntCssName",
    "parkMonReversionTimer",
    "partyEntranceTone",
    "directoryURIs",
    "allowCtiControlFlag",
    "rejectAnonymousCall",
    "patternUrgency",
    "confidentialAccess",
    "externalCallControlProfile",
    "enterpriseAltNum",
    "e164AltNum",
    "pstnFailover",
    "callControlAgentProfile",
    "useEnterpriseAltNum",
    "useE164AltNum",
    "active"
})
public class XLine {

    protected String pattern;
    protected String description;
    protected String usage;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "aarDestinationMask", type = JAXBElement.class)
    protected JAXBElement<String> aarDestinationMask;
    protected String aarKeepCallHistory;
    protected String aarVoiceMailEnabled;
    protected XCallForwardAll callForwardAll;
    protected XCallForwardBusy callForwardBusy;
    protected XCallForwardBusyInt callForwardBusyInt;
    protected XCallForwardNoAnswer callForwardNoAnswer;
    protected XCallForwardNoAnswerInt callForwardNoAnswerInt;
    protected XCallForwardNoCoverage callForwardNoCoverage;
    protected XCallForwardNoCoverageInt callForwardNoCoverageInt;
    protected XCallForwardOnFailure callForwardOnFailure;
    protected XCallForwardAlternateParty callForwardAlternateParty;
    protected XCallForwardNotRegistered callForwardNotRegistered;
    protected XCallForwardNotRegisteredInt callForwardNotRegisteredInt;
    protected XFkType callPickupGroupName;
    @XmlElement(defaultValue = "Auto Answer Off")
    protected String autoAnswer;
    @XmlElementRef(name = "networkHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSourceId;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    protected String alertingName;
    protected String asciiAlertingName;
    protected XFkType presenceGroupName;
    @XmlElementRef(name = "shareLineAppearanceCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> shareLineAppearanceCssName;
    @XmlElementRef(name = "voiceMailProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> voiceMailProfileName;
    @XmlElement(defaultValue = "Default")
    protected String patternPrecedence;
    @XmlElement(defaultValue = "No Error")
    protected String releaseClause;
    @XmlElementRef(name = "hrDuration", type = JAXBElement.class)
    protected JAXBElement<String> hrDuration;
    @XmlElementRef(name = "hrInterval", type = JAXBElement.class)
    protected JAXBElement<String> hrInterval;
    @XmlElement(defaultValue = "Use System Default")
    protected String cfaCssPolicy;
    @XmlElementRef(name = "defaultActivatedDeviceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> defaultActivatedDeviceName;
    @XmlElementRef(name = "parkMonForwardNoRetrieveDn", type = JAXBElement.class)
    protected JAXBElement<String> parkMonForwardNoRetrieveDn;
    @XmlElementRef(name = "parkMonForwardNoRetrieveIntDn", type = JAXBElement.class)
    protected JAXBElement<String> parkMonForwardNoRetrieveIntDn;
    protected String parkMonForwardNoRetrieveVmEnabled;
    protected String parkMonForwardNoRetrieveIntVmEnabled;
    @XmlElementRef(name = "parkMonForwardNoRetrieveCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> parkMonForwardNoRetrieveCssName;
    @XmlElementRef(name = "parkMonForwardNoRetrieveIntCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> parkMonForwardNoRetrieveIntCssName;
    @XmlElementRef(name = "parkMonReversionTimer", type = JAXBElement.class)
    protected JAXBElement<String> parkMonReversionTimer;
    @XmlElement(defaultValue = "Default")
    protected String partyEntranceTone;
    protected XLine.DirectoryURIs directoryURIs;
    @XmlElement(defaultValue = "true")
    protected String allowCtiControlFlag;
    protected String rejectAnonymousCall;
    @XmlElement(defaultValue = "false")
    protected String patternUrgency;
    protected XLine.ConfidentialAccess confidentialAccess;
    @XmlElementRef(name = "externalCallControlProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> externalCallControlProfile;
    protected XLine.EnterpriseAltNum enterpriseAltNum;
    protected XLine.E164AltNum e164AltNum;
    protected String pstnFailover;
    protected String callControlAgentProfile;
    protected String useEnterpriseAltNum;
    protected String useE164AltNum;
    @XmlElement(defaultValue = "true")
    protected String active;

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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the aarDestinationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAarDestinationMask() {
        return aarDestinationMask;
    }

    /**
     * Sets the value of the aarDestinationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAarDestinationMask(JAXBElement<String> value) {
        this.aarDestinationMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aarKeepCallHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarKeepCallHistory() {
        return aarKeepCallHistory;
    }

    /**
     * Sets the value of the aarKeepCallHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarKeepCallHistory(String value) {
        this.aarKeepCallHistory = value;
    }

    /**
     * Gets the value of the aarVoiceMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarVoiceMailEnabled() {
        return aarVoiceMailEnabled;
    }

    /**
     * Sets the value of the aarVoiceMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarVoiceMailEnabled(String value) {
        this.aarVoiceMailEnabled = value;
    }

    /**
     * Gets the value of the callForwardAll property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardAll }
     *     
     */
    public XCallForwardAll getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * Sets the value of the callForwardAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardAll }
     *     
     */
    public void setCallForwardAll(XCallForwardAll value) {
        this.callForwardAll = value;
    }

    /**
     * Gets the value of the callForwardBusy property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardBusy }
     *     
     */
    public XCallForwardBusy getCallForwardBusy() {
        return callForwardBusy;
    }

    /**
     * Sets the value of the callForwardBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardBusy }
     *     
     */
    public void setCallForwardBusy(XCallForwardBusy value) {
        this.callForwardBusy = value;
    }

    /**
     * Gets the value of the callForwardBusyInt property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardBusyInt }
     *     
     */
    public XCallForwardBusyInt getCallForwardBusyInt() {
        return callForwardBusyInt;
    }

    /**
     * Sets the value of the callForwardBusyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardBusyInt }
     *     
     */
    public void setCallForwardBusyInt(XCallForwardBusyInt value) {
        this.callForwardBusyInt = value;
    }

    /**
     * Gets the value of the callForwardNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNoAnswer }
     *     
     */
    public XCallForwardNoAnswer getCallForwardNoAnswer() {
        return callForwardNoAnswer;
    }

    /**
     * Sets the value of the callForwardNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNoAnswer }
     *     
     */
    public void setCallForwardNoAnswer(XCallForwardNoAnswer value) {
        this.callForwardNoAnswer = value;
    }

    /**
     * Gets the value of the callForwardNoAnswerInt property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNoAnswerInt }
     *     
     */
    public XCallForwardNoAnswerInt getCallForwardNoAnswerInt() {
        return callForwardNoAnswerInt;
    }

    /**
     * Sets the value of the callForwardNoAnswerInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNoAnswerInt }
     *     
     */
    public void setCallForwardNoAnswerInt(XCallForwardNoAnswerInt value) {
        this.callForwardNoAnswerInt = value;
    }

    /**
     * Gets the value of the callForwardNoCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNoCoverage }
     *     
     */
    public XCallForwardNoCoverage getCallForwardNoCoverage() {
        return callForwardNoCoverage;
    }

    /**
     * Sets the value of the callForwardNoCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNoCoverage }
     *     
     */
    public void setCallForwardNoCoverage(XCallForwardNoCoverage value) {
        this.callForwardNoCoverage = value;
    }

    /**
     * Gets the value of the callForwardNoCoverageInt property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNoCoverageInt }
     *     
     */
    public XCallForwardNoCoverageInt getCallForwardNoCoverageInt() {
        return callForwardNoCoverageInt;
    }

    /**
     * Sets the value of the callForwardNoCoverageInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNoCoverageInt }
     *     
     */
    public void setCallForwardNoCoverageInt(XCallForwardNoCoverageInt value) {
        this.callForwardNoCoverageInt = value;
    }

    /**
     * Gets the value of the callForwardOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardOnFailure }
     *     
     */
    public XCallForwardOnFailure getCallForwardOnFailure() {
        return callForwardOnFailure;
    }

    /**
     * Sets the value of the callForwardOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardOnFailure }
     *     
     */
    public void setCallForwardOnFailure(XCallForwardOnFailure value) {
        this.callForwardOnFailure = value;
    }

    /**
     * Gets the value of the callForwardAlternateParty property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardAlternateParty }
     *     
     */
    public XCallForwardAlternateParty getCallForwardAlternateParty() {
        return callForwardAlternateParty;
    }

    /**
     * Sets the value of the callForwardAlternateParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardAlternateParty }
     *     
     */
    public void setCallForwardAlternateParty(XCallForwardAlternateParty value) {
        this.callForwardAlternateParty = value;
    }

    /**
     * Gets the value of the callForwardNotRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNotRegistered }
     *     
     */
    public XCallForwardNotRegistered getCallForwardNotRegistered() {
        return callForwardNotRegistered;
    }

    /**
     * Sets the value of the callForwardNotRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNotRegistered }
     *     
     */
    public void setCallForwardNotRegistered(XCallForwardNotRegistered value) {
        this.callForwardNotRegistered = value;
    }

    /**
     * Gets the value of the callForwardNotRegisteredInt property.
     * 
     * @return
     *     possible object is
     *     {@link XCallForwardNotRegisteredInt }
     *     
     */
    public XCallForwardNotRegisteredInt getCallForwardNotRegisteredInt() {
        return callForwardNotRegisteredInt;
    }

    /**
     * Sets the value of the callForwardNotRegisteredInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallForwardNotRegisteredInt }
     *     
     */
    public void setCallForwardNotRegisteredInt(XCallForwardNotRegisteredInt value) {
        this.callForwardNotRegisteredInt = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallPickupGroupName(XFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHoldMohAudioSourceId(JAXBElement<String> value) {
        this.networkHoldMohAudioSourceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHoldMohAudioSourceId(JAXBElement<String> value) {
        this.userHoldMohAudioSourceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the alertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingName() {
        return alertingName;
    }

    /**
     * Sets the value of the alertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingName(String value) {
        this.alertingName = value;
    }

    /**
     * Gets the value of the asciiAlertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiAlertingName() {
        return asciiAlertingName;
    }

    /**
     * Sets the value of the asciiAlertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiAlertingName(String value) {
        this.asciiAlertingName = value;
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
     * Gets the value of the shareLineAppearanceCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getShareLineAppearanceCssName() {
        return shareLineAppearanceCssName;
    }

    /**
     * Sets the value of the shareLineAppearanceCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setShareLineAppearanceCssName(JAXBElement<XFkType> value) {
        this.shareLineAppearanceCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the voiceMailProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getVoiceMailProfileName() {
        return voiceMailProfileName;
    }

    /**
     * Sets the value of the voiceMailProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setVoiceMailProfileName(JAXBElement<XFkType> value) {
        this.voiceMailProfileName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseClause(String value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the hrDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHrDuration() {
        return hrDuration;
    }

    /**
     * Sets the value of the hrDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHrDuration(JAXBElement<String> value) {
        this.hrDuration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHrInterval() {
        return hrInterval;
    }

    /**
     * Sets the value of the hrInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHrInterval(JAXBElement<String> value) {
        this.hrInterval = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfaCssPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfaCssPolicy() {
        return cfaCssPolicy;
    }

    /**
     * Sets the value of the cfaCssPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfaCssPolicy(String value) {
        this.cfaCssPolicy = value;
    }

    /**
     * Gets the value of the defaultActivatedDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDefaultActivatedDeviceName() {
        return defaultActivatedDeviceName;
    }

    /**
     * Sets the value of the defaultActivatedDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDefaultActivatedDeviceName(JAXBElement<XFkType> value) {
        this.defaultActivatedDeviceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParkMonForwardNoRetrieveDn() {
        return parkMonForwardNoRetrieveDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParkMonForwardNoRetrieveDn(JAXBElement<String> value) {
        this.parkMonForwardNoRetrieveDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParkMonForwardNoRetrieveIntDn() {
        return parkMonForwardNoRetrieveIntDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParkMonForwardNoRetrieveIntDn(JAXBElement<String> value) {
        this.parkMonForwardNoRetrieveIntDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveVmEnabled() {
        return parkMonForwardNoRetrieveVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveVmEnabled(String value) {
        this.parkMonForwardNoRetrieveVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveIntVmEnabled() {
        return parkMonForwardNoRetrieveIntVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveIntVmEnabled(String value) {
        this.parkMonForwardNoRetrieveIntVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getParkMonForwardNoRetrieveCssName() {
        return parkMonForwardNoRetrieveCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setParkMonForwardNoRetrieveCssName(JAXBElement<XFkType> value) {
        this.parkMonForwardNoRetrieveCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getParkMonForwardNoRetrieveIntCssName() {
        return parkMonForwardNoRetrieveIntCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setParkMonForwardNoRetrieveIntCssName(JAXBElement<XFkType> value) {
        this.parkMonForwardNoRetrieveIntCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the parkMonReversionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParkMonReversionTimer() {
        return parkMonReversionTimer;
    }

    /**
     * Sets the value of the parkMonReversionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParkMonReversionTimer(JAXBElement<String> value) {
        this.parkMonReversionTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyEntranceTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyEntranceTone() {
        return partyEntranceTone;
    }

    /**
     * Sets the value of the partyEntranceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyEntranceTone(String value) {
        this.partyEntranceTone = value;
    }

    /**
     * Gets the value of the directoryURIs property.
     * 
     * @return
     *     possible object is
     *     {@link XLine.DirectoryURIs }
     *     
     */
    public XLine.DirectoryURIs getDirectoryURIs() {
        return directoryURIs;
    }

    /**
     * Sets the value of the directoryURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLine.DirectoryURIs }
     *     
     */
    public void setDirectoryURIs(XLine.DirectoryURIs value) {
        this.directoryURIs = value;
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
     * Gets the value of the rejectAnonymousCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectAnonymousCall() {
        return rejectAnonymousCall;
    }

    /**
     * Sets the value of the rejectAnonymousCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectAnonymousCall(String value) {
        this.rejectAnonymousCall = value;
    }

    /**
     * Gets the value of the patternUrgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternUrgency() {
        return patternUrgency;
    }

    /**
     * Sets the value of the patternUrgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternUrgency(String value) {
        this.patternUrgency = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XLine.ConfidentialAccess }
     *     
     */
    public XLine.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLine.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(XLine.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setExternalCallControlProfile(JAXBElement<XFkType> value) {
        this.externalCallControlProfile = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the enterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link XLine.EnterpriseAltNum }
     *     
     */
    public XLine.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLine.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(XLine.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link XLine.E164AltNum }
     *     
     */
    public XLine.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLine.E164AltNum }
     *     
     */
    public void setE164AltNum(XLine.E164AltNum value) {
        this.e164AltNum = value;
    }

    /**
     * Gets the value of the pstnFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailover() {
        return pstnFailover;
    }

    /**
     * Sets the value of the pstnFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailover(String value) {
        this.pstnFailover = value;
    }

    /**
     * Gets the value of the callControlAgentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallControlAgentProfile() {
        return callControlAgentProfile;
    }

    /**
     * Sets the value of the callControlAgentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallControlAgentProfile(String value) {
        this.callControlAgentProfile = value;
    }

    /**
     * Gets the value of the useEnterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseEnterpriseAltNum() {
        return useEnterpriseAltNum;
    }

    /**
     * Sets the value of the useEnterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseEnterpriseAltNum(String value) {
        this.useEnterpriseAltNum = value;
    }

    /**
     * Gets the value of the useE164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseE164AltNum() {
        return useE164AltNum;
    }

    /**
     * Sets the value of the useE164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseE164AltNum(String value) {
        this.useE164AltNum = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}XDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
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
        "directoryUri"
    })
    public static class DirectoryURIs {

        protected List<XDirectoryUri> directoryUri;

        /**
         * Gets the value of the directoryUri property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directoryUri property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirectoryUri().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDirectoryUri }
         * 
         * 
         */
        public List<XDirectoryUri> getDirectoryUri() {
            if (directoryUri == null) {
                directoryUri = new ArrayList<XDirectoryUri>();
            }
            return this.directoryUri;
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
     *         &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "numMask",
        "isUrgent",
        "addLocalRoutePartition",
        "routePartition",
        "advertiseGloballyIls"
    })
    public static class E164AltNum {

        @XmlElementRef(name = "numMask", type = JAXBElement.class)
        protected JAXBElement<String> numMask;
        @XmlElement(defaultValue = "false")
        protected String isUrgent;
        @XmlElement(defaultValue = "true")
        protected String addLocalRoutePartition;
        @XmlElementRef(name = "routePartition", type = JAXBElement.class)
        protected JAXBElement<XFkType> routePartition;
        @XmlElement(defaultValue = "true")
        protected String advertiseGloballyIls;

        /**
         * Gets the value of the numMask property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNumMask() {
            return numMask;
        }

        /**
         * Sets the value of the numMask property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNumMask(JAXBElement<String> value) {
            this.numMask = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the isUrgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsUrgent() {
            return isUrgent;
        }

        /**
         * Sets the value of the isUrgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsUrgent(String value) {
            this.isUrgent = value;
        }

        /**
         * Gets the value of the addLocalRoutePartition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddLocalRoutePartition() {
            return addLocalRoutePartition;
        }

        /**
         * Sets the value of the addLocalRoutePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddLocalRoutePartition(String value) {
            this.addLocalRoutePartition = value;
        }

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public JAXBElement<XFkType> getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public void setRoutePartition(JAXBElement<XFkType> value) {
            this.routePartition = ((JAXBElement<XFkType> ) value);
        }

        /**
         * Gets the value of the advertiseGloballyIls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvertiseGloballyIls() {
            return advertiseGloballyIls;
        }

        /**
         * Sets the value of the advertiseGloballyIls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvertiseGloballyIls(String value) {
            this.advertiseGloballyIls = value;
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
     *         &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "numMask",
        "isUrgent",
        "addLocalRoutePartition",
        "routePartition",
        "advertiseGloballyIls"
    })
    public static class EnterpriseAltNum {

        @XmlElementRef(name = "numMask", type = JAXBElement.class)
        protected JAXBElement<String> numMask;
        @XmlElement(defaultValue = "false")
        protected String isUrgent;
        @XmlElement(defaultValue = "true")
        protected String addLocalRoutePartition;
        @XmlElementRef(name = "routePartition", type = JAXBElement.class)
        protected JAXBElement<XFkType> routePartition;
        @XmlElement(defaultValue = "true")
        protected String advertiseGloballyIls;

        /**
         * Gets the value of the numMask property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNumMask() {
            return numMask;
        }

        /**
         * Sets the value of the numMask property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNumMask(JAXBElement<String> value) {
            this.numMask = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the isUrgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsUrgent() {
            return isUrgent;
        }

        /**
         * Sets the value of the isUrgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsUrgent(String value) {
            this.isUrgent = value;
        }

        /**
         * Gets the value of the addLocalRoutePartition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddLocalRoutePartition() {
            return addLocalRoutePartition;
        }

        /**
         * Sets the value of the addLocalRoutePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddLocalRoutePartition(String value) {
            this.addLocalRoutePartition = value;
        }

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public JAXBElement<XFkType> getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public void setRoutePartition(JAXBElement<XFkType> value) {
            this.routePartition = ((JAXBElement<XFkType> ) value);
        }

        /**
         * Gets the value of the advertiseGloballyIls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvertiseGloballyIls() {
            return advertiseGloballyIls;
        }

        /**
         * Sets the value of the advertiseGloballyIls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvertiseGloballyIls(String value) {
            this.advertiseGloballyIls = value;
        }

    }

}
