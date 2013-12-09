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
 * <p>Java class for CT_TLCommonBehaviorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TLCommonBehaviorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cTn" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLCommonTimeNodeData"/>
 *         &lt;element name="tgtEl" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLTimeTargetElement"/>
 *         &lt;element name="attrNameLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLBehaviorAttributeNameList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="additive" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLBehaviorAdditiveType" />
 *       &lt;attribute name="accumulate" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLBehaviorAccumulateType" />
 *       &lt;attribute name="xfrmType" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLBehaviorTransformType" />
 *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rctx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="override" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLBehaviorOverrideType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TLCommonBehaviorData", propOrder = {
    "cTn",
    "tgtEl",
    "attrNameLst"
})
public class CTTLCommonBehaviorData {

    @XmlElement(required = true)
    protected CTTLCommonTimeNodeData cTn;
    @XmlElement(required = true)
    protected CTTLTimeTargetElement tgtEl;
    protected CTTLBehaviorAttributeNameList attrNameLst;
    @XmlAttribute
    protected STTLBehaviorAdditiveType additive;
    @XmlAttribute
    protected STTLBehaviorAccumulateType accumulate;
    @XmlAttribute
    protected STTLBehaviorTransformType xfrmType;
    @XmlAttribute
    protected String from;
    @XmlAttribute
    protected String to;
    @XmlAttribute
    protected String by;
    @XmlAttribute
    protected String rctx;
    @XmlAttribute
    protected STTLBehaviorOverrideType override;

    /**
     * Gets the value of the cTn property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLCommonTimeNodeData }
     *     
     */
    public CTTLCommonTimeNodeData getCTn() {
        return cTn;
    }

    /**
     * Sets the value of the cTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLCommonTimeNodeData }
     *     
     */
    public void setCTn(CTTLCommonTimeNodeData value) {
        this.cTn = value;
    }

    /**
     * Gets the value of the tgtEl property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLTimeTargetElement }
     *     
     */
    public CTTLTimeTargetElement getTgtEl() {
        return tgtEl;
    }

    /**
     * Sets the value of the tgtEl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLTimeTargetElement }
     *     
     */
    public void setTgtEl(CTTLTimeTargetElement value) {
        this.tgtEl = value;
    }

    /**
     * Gets the value of the attrNameLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLBehaviorAttributeNameList }
     *     
     */
    public CTTLBehaviorAttributeNameList getAttrNameLst() {
        return attrNameLst;
    }

    /**
     * Sets the value of the attrNameLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLBehaviorAttributeNameList }
     *     
     */
    public void setAttrNameLst(CTTLBehaviorAttributeNameList value) {
        this.attrNameLst = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * @return
     *     possible object is
     *     {@link STTLBehaviorAdditiveType }
     *     
     */
    public STTLBehaviorAdditiveType getAdditive() {
        return additive;
    }

    /**
     * Sets the value of the additive property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLBehaviorAdditiveType }
     *     
     */
    public void setAdditive(STTLBehaviorAdditiveType value) {
        this.additive = value;
    }

    /**
     * Gets the value of the accumulate property.
     * 
     * @return
     *     possible object is
     *     {@link STTLBehaviorAccumulateType }
     *     
     */
    public STTLBehaviorAccumulateType getAccumulate() {
        return accumulate;
    }

    /**
     * Sets the value of the accumulate property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLBehaviorAccumulateType }
     *     
     */
    public void setAccumulate(STTLBehaviorAccumulateType value) {
        this.accumulate = value;
    }

    /**
     * Gets the value of the xfrmType property.
     * 
     * @return
     *     possible object is
     *     {@link STTLBehaviorTransformType }
     *     
     */
    public STTLBehaviorTransformType getXfrmType() {
        return xfrmType;
    }

    /**
     * Sets the value of the xfrmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLBehaviorTransformType }
     *     
     */
    public void setXfrmType(STTLBehaviorTransformType value) {
        this.xfrmType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBy(String value) {
        this.by = value;
    }

    /**
     * Gets the value of the rctx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctx() {
        return rctx;
    }

    /**
     * Sets the value of the rctx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRctx(String value) {
        this.rctx = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link STTLBehaviorOverrideType }
     *     
     */
    public STTLBehaviorOverrideType getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLBehaviorOverrideType }
     *     
     */
    public void setOverride(STTLBehaviorOverrideType value) {
        this.override = value;
    }

}
