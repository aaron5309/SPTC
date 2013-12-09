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
 * <p>Java class for CT_NormalViewProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_NormalViewProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restoredLeft" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_NormalViewPortion"/>
 *         &lt;element name="restoredTop" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_NormalViewPortion"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="showOutlineIcons" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="snapVertSplitter" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="vertBarState" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_SplitterBarState" default="restored" />
 *       &lt;attribute name="horzBarState" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_SplitterBarState" default="restored" />
 *       &lt;attribute name="preferSingleView" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_NormalViewProperties", propOrder = {
    "restoredLeft",
    "restoredTop",
    "extLst"
})
public class CTNormalViewProperties {

    @XmlElement(required = true)
    protected CTNormalViewPortion restoredLeft;
    @XmlElement(required = true)
    protected CTNormalViewPortion restoredTop;
    protected CTExtensionList extLst;
    @XmlAttribute
    protected Boolean showOutlineIcons;
    @XmlAttribute
    protected Boolean snapVertSplitter;
    @XmlAttribute
    protected STSplitterBarState vertBarState;
    @XmlAttribute
    protected STSplitterBarState horzBarState;
    @XmlAttribute
    protected Boolean preferSingleView;

    /**
     * Gets the value of the restoredLeft property.
     * 
     * @return
     *     possible object is
     *     {@link CTNormalViewPortion }
     *     
     */
    public CTNormalViewPortion getRestoredLeft() {
        return restoredLeft;
    }

    /**
     * Sets the value of the restoredLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNormalViewPortion }
     *     
     */
    public void setRestoredLeft(CTNormalViewPortion value) {
        this.restoredLeft = value;
    }

    /**
     * Gets the value of the restoredTop property.
     * 
     * @return
     *     possible object is
     *     {@link CTNormalViewPortion }
     *     
     */
    public CTNormalViewPortion getRestoredTop() {
        return restoredTop;
    }

    /**
     * Sets the value of the restoredTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNormalViewPortion }
     *     
     */
    public void setRestoredTop(CTNormalViewPortion value) {
        this.restoredTop = value;
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
     * Gets the value of the showOutlineIcons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowOutlineIcons() {
        if (showOutlineIcons == null) {
            return true;
        } else {
            return showOutlineIcons;
        }
    }

    /**
     * Sets the value of the showOutlineIcons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOutlineIcons(Boolean value) {
        this.showOutlineIcons = value;
    }

    /**
     * Gets the value of the snapVertSplitter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSnapVertSplitter() {
        if (snapVertSplitter == null) {
            return false;
        } else {
            return snapVertSplitter;
        }
    }

    /**
     * Sets the value of the snapVertSplitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapVertSplitter(Boolean value) {
        this.snapVertSplitter = value;
    }

    /**
     * Gets the value of the vertBarState property.
     * 
     * @return
     *     possible object is
     *     {@link STSplitterBarState }
     *     
     */
    public STSplitterBarState getVertBarState() {
        if (vertBarState == null) {
            return STSplitterBarState.RESTORED;
        } else {
            return vertBarState;
        }
    }

    /**
     * Sets the value of the vertBarState property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSplitterBarState }
     *     
     */
    public void setVertBarState(STSplitterBarState value) {
        this.vertBarState = value;
    }

    /**
     * Gets the value of the horzBarState property.
     * 
     * @return
     *     possible object is
     *     {@link STSplitterBarState }
     *     
     */
    public STSplitterBarState getHorzBarState() {
        if (horzBarState == null) {
            return STSplitterBarState.RESTORED;
        } else {
            return horzBarState;
        }
    }

    /**
     * Sets the value of the horzBarState property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSplitterBarState }
     *     
     */
    public void setHorzBarState(STSplitterBarState value) {
        this.horzBarState = value;
    }

    /**
     * Gets the value of the preferSingleView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferSingleView() {
        if (preferSingleView == null) {
            return false;
        } else {
            return preferSingleView;
        }
    }

    /**
     * Sets the value of the preferSingleView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferSingleView(Boolean value) {
        this.preferSingleView = value;
    }

}
