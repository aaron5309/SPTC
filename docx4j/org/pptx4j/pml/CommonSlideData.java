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
 * <p>Java class for CT_CommonSlideData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_CommonSlideData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bg" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_Background" minOccurs="0"/>
 *         &lt;element name="spTree" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_GroupShape"/>
 *         &lt;element name="custDataLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_CustomerDataList" minOccurs="0"/>
 *         &lt;element name="controls" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ControlList" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CommonSlideData", propOrder = {
    "bg",
    "spTree",
    "custDataLst",
    "controls",
    "extLst"
})
public class CommonSlideData {

    protected CTBackground bg;
    @XmlElement(required = true)
    protected GroupShape spTree;
    protected CTCustomerDataList custDataLst;
    protected CTControlList controls;
    protected CTExtensionList extLst;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the bg property.
     * 
     * @return
     *     possible object is
     *     {@link CTBackground }
     *     
     */
    public CTBackground getBg() {
        return bg;
    }

    /**
     * Sets the value of the bg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBackground }
     *     
     */
    public void setBg(CTBackground value) {
        this.bg = value;
    }

    /**
     * Gets the value of the spTree property.
     * 
     * @return
     *     possible object is
     *     {@link GroupShape }
     *     
     */
    public GroupShape getSpTree() {
        return spTree;
    }

    /**
     * Sets the value of the spTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupShape }
     *     
     */
    public void setSpTree(GroupShape value) {
        this.spTree = value;
    }

    /**
     * Gets the value of the custDataLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTCustomerDataList }
     *     
     */
    public CTCustomerDataList getCustDataLst() {
        return custDataLst;
    }

    /**
     * Sets the value of the custDataLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCustomerDataList }
     *     
     */
    public void setCustDataLst(CTCustomerDataList value) {
        this.custDataLst = value;
    }

    /**
     * Gets the value of the controls property.
     * 
     * @return
     *     possible object is
     *     {@link CTControlList }
     *     
     */
    public CTControlList getControls() {
        return controls;
    }

    /**
     * Sets the value of the controls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTControlList }
     *     
     */
    public void setControls(CTControlList value) {
        this.controls = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTExtensionList }
     *     
     */
    public CTExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExtensionList }
     *     
     */
    public void setExtLst(CTExtensionList value) {
        this.extLst = value;
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
        if (name == null) {
            return "";
        } else {
            return name;
        }
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

}
