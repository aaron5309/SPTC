/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_TLAnimateScaleBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TLAnimateScaleBehavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cBhvr" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLCommonBehaviorData"/>
 *         &lt;element name="by" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLPoint" minOccurs="0"/>
 *         &lt;element name="from" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLPoint" minOccurs="0"/>
 *         &lt;element name="to" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zoomContents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TLAnimateScaleBehavior", propOrder = {
    "cBhvr",
    "by",
    "from",
    "to"
})
public class CTTLAnimateScaleBehavior {

    @XmlElement(required = true)
    protected CTTLCommonBehaviorData cBhvr;
    protected CTTLPoint by;
    protected CTTLPoint from;
    protected CTTLPoint to;
    @XmlAttribute
    protected Boolean zoomContents;

    /**
     * Gets the value of the cBhvr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLCommonBehaviorData }
     *     
     */
    public CTTLCommonBehaviorData getCBhvr() {
        return cBhvr;
    }

    /**
     * Sets the value of the cBhvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLCommonBehaviorData }
     *     
     */
    public void setCBhvr(CTTLCommonBehaviorData value) {
        this.cBhvr = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLPoint }
     *     
     */
    public CTTLPoint getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLPoint }
     *     
     */
    public void setBy(CTTLPoint value) {
        this.by = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLPoint }
     *     
     */
    public CTTLPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLPoint }
     *     
     */
    public void setFrom(CTTLPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLPoint }
     *     
     */
    public CTTLPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLPoint }
     *     
     */
    public void setTo(CTTLPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the zoomContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZoomContents() {
        return zoomContents;
    }

    /**
     * Sets the value of the zoomContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoomContents(Boolean value) {
        this.zoomContents = value;
    }

}
