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
 * <p>Java class for CT_TLTimeNodeSequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TLTimeNodeSequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cTn" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLCommonTimeNodeData"/>
 *         &lt;element name="prevCondLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLTimeConditionList" minOccurs="0"/>
 *         &lt;element name="nextCondLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TLTimeConditionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="concurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="prevAc" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLPreviousActionType" />
 *       &lt;attribute name="nextAc" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_TLNextActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TLTimeNodeSequence", propOrder = {
    "cTn",
    "prevCondLst",
    "nextCondLst"
})
public class CTTLTimeNodeSequence {

    @XmlElement(required = true)
    protected CTTLCommonTimeNodeData cTn;
    protected CTTLTimeConditionList prevCondLst;
    protected CTTLTimeConditionList nextCondLst;
    @XmlAttribute
    protected Boolean concurrent;
    @XmlAttribute
    protected STTLPreviousActionType prevAc;
    @XmlAttribute
    protected STTLNextActionType nextAc;

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
     * Gets the value of the prevCondLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLTimeConditionList }
     *     
     */
    public CTTLTimeConditionList getPrevCondLst() {
        return prevCondLst;
    }

    /**
     * Sets the value of the prevCondLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLTimeConditionList }
     *     
     */
    public void setPrevCondLst(CTTLTimeConditionList value) {
        this.prevCondLst = value;
    }

    /**
     * Gets the value of the nextCondLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTTLTimeConditionList }
     *     
     */
    public CTTLTimeConditionList getNextCondLst() {
        return nextCondLst;
    }

    /**
     * Sets the value of the nextCondLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTLTimeConditionList }
     *     
     */
    public void setNextCondLst(CTTLTimeConditionList value) {
        this.nextCondLst = value;
    }

    /**
     * Gets the value of the concurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcurrent() {
        return concurrent;
    }

    /**
     * Sets the value of the concurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrent(Boolean value) {
        this.concurrent = value;
    }

    /**
     * Gets the value of the prevAc property.
     * 
     * @return
     *     possible object is
     *     {@link STTLPreviousActionType }
     *     
     */
    public STTLPreviousActionType getPrevAc() {
        return prevAc;
    }

    /**
     * Sets the value of the prevAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLPreviousActionType }
     *     
     */
    public void setPrevAc(STTLPreviousActionType value) {
        this.prevAc = value;
    }

    /**
     * Gets the value of the nextAc property.
     * 
     * @return
     *     possible object is
     *     {@link STTLNextActionType }
     *     
     */
    public STTLNextActionType getNextAc() {
        return nextAc;
    }

    /**
     * Sets the value of the nextAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTLNextActionType }
     *     
     */
    public void setNextAc(STTLNextActionType value) {
        this.nextAc = value;
    }

}
