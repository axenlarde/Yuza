
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFallbackFeatureConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFallbackFeatureConfigReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableFallbackForImeCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="qosSensistivityLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCorrelationDigits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCollectionTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callAnswerTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="clearImeCallDelayTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfInterDigitDelayTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="postConnectFallbackDelayTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="fallbackSplitDelayTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callCss" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFallbackFeatureConfigReq", propOrder = {
    "enableFallbackForImeCalls",
    "qosSensistivityLevel",
    "dtmfCorrelationDigits",
    "dtmfCollectionTimer",
    "callAnswerTimer",
    "clearImeCallDelayTimer",
    "dtmfInterDigitDelayTimer",
    "postConnectFallbackDelayTimer",
    "fallbackSplitDelayTimer",
    "callCss"
})
public class UpdateFallbackFeatureConfigReq {

    @XmlElementRef(name = "enableFallbackForImeCalls", type = JAXBElement.class)
    protected JAXBElement<String> enableFallbackForImeCalls;
    @XmlElementRef(name = "qosSensistivityLevel", type = JAXBElement.class)
    protected JAXBElement<String> qosSensistivityLevel;
    @XmlElementRef(name = "dtmfCorrelationDigits", type = JAXBElement.class)
    protected JAXBElement<String> dtmfCorrelationDigits;
    @XmlElementRef(name = "dtmfCollectionTimer", type = JAXBElement.class)
    protected JAXBElement<String> dtmfCollectionTimer;
    @XmlElementRef(name = "callAnswerTimer", type = JAXBElement.class)
    protected JAXBElement<String> callAnswerTimer;
    @XmlElementRef(name = "clearImeCallDelayTimer", type = JAXBElement.class)
    protected JAXBElement<String> clearImeCallDelayTimer;
    @XmlElementRef(name = "dtmfInterDigitDelayTimer", type = JAXBElement.class)
    protected JAXBElement<String> dtmfInterDigitDelayTimer;
    @XmlElementRef(name = "postConnectFallbackDelayTimer", type = JAXBElement.class)
    protected JAXBElement<String> postConnectFallbackDelayTimer;
    @XmlElementRef(name = "fallbackSplitDelayTimer", type = JAXBElement.class)
    protected JAXBElement<String> fallbackSplitDelayTimer;
    @XmlElementRef(name = "callCss", type = JAXBElement.class)
    protected JAXBElement<String> callCss;

    /**
     * Gets the value of the enableFallbackForImeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnableFallbackForImeCalls() {
        return enableFallbackForImeCalls;
    }

    /**
     * Sets the value of the enableFallbackForImeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnableFallbackForImeCalls(JAXBElement<String> value) {
        this.enableFallbackForImeCalls = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qosSensistivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQosSensistivityLevel() {
        return qosSensistivityLevel;
    }

    /**
     * Sets the value of the qosSensistivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQosSensistivityLevel(JAXBElement<String> value) {
        this.qosSensistivityLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtmfCorrelationDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtmfCorrelationDigits() {
        return dtmfCorrelationDigits;
    }

    /**
     * Sets the value of the dtmfCorrelationDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtmfCorrelationDigits(JAXBElement<String> value) {
        this.dtmfCorrelationDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtmfCollectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtmfCollectionTimer() {
        return dtmfCollectionTimer;
    }

    /**
     * Sets the value of the dtmfCollectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtmfCollectionTimer(JAXBElement<String> value) {
        this.dtmfCollectionTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callAnswerTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallAnswerTimer() {
        return callAnswerTimer;
    }

    /**
     * Sets the value of the callAnswerTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallAnswerTimer(JAXBElement<String> value) {
        this.callAnswerTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clearImeCallDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClearImeCallDelayTimer() {
        return clearImeCallDelayTimer;
    }

    /**
     * Sets the value of the clearImeCallDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClearImeCallDelayTimer(JAXBElement<String> value) {
        this.clearImeCallDelayTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtmfInterDigitDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtmfInterDigitDelayTimer() {
        return dtmfInterDigitDelayTimer;
    }

    /**
     * Sets the value of the dtmfInterDigitDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtmfInterDigitDelayTimer(JAXBElement<String> value) {
        this.dtmfInterDigitDelayTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postConnectFallbackDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostConnectFallbackDelayTimer() {
        return postConnectFallbackDelayTimer;
    }

    /**
     * Sets the value of the postConnectFallbackDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostConnectFallbackDelayTimer(JAXBElement<String> value) {
        this.postConnectFallbackDelayTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fallbackSplitDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFallbackSplitDelayTimer() {
        return fallbackSplitDelayTimer;
    }

    /**
     * Sets the value of the fallbackSplitDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFallbackSplitDelayTimer(JAXBElement<String> value) {
        this.fallbackSplitDelayTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callCss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCss() {
        return callCss;
    }

    /**
     * Sets the value of the callCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCss(JAXBElement<String> value) {
        this.callCss = ((JAXBElement<String> ) value);
    }

}
