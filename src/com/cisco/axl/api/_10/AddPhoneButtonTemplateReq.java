
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhoneButtonTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhoneButtonTemplateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="phoneButtonTemplate" type="{http://www.cisco.com/AXL/API/10.5}XPhoneButtonTemplate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhoneButtonTemplateReq", propOrder = {
    "phoneButtonTemplate"
})
public class AddPhoneButtonTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhoneButtonTemplate phoneButtonTemplate;

    /**
     * Gets the value of the phoneButtonTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XPhoneButtonTemplate }
     *     
     */
    public XPhoneButtonTemplate getPhoneButtonTemplate() {
        return phoneButtonTemplate;
    }

    /**
     * Sets the value of the phoneButtonTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhoneButtonTemplate }
     *     
     */
    public void setPhoneButtonTemplate(XPhoneButtonTemplate value) {
        this.phoneButtonTemplate = value;
    }

}
