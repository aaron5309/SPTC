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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.docx4j.dml.CTAnimationGraphicalObjectBuildProperties;


/**
 * <p>Java class for CT_TLGraphicalObjectBuild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TLGraphicalObjectBuild">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bldAsOne" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_Empty"/>
 *         &lt;element name="bldSub" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_AnimationGraphicalObjectBuildProperties"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://schemas.openxmlformats.org/presentationml/2006/main}AG_TLBuild"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TLGraphicalObjectBuild", propOrder = {
    "bldAsOne",
    "bldSub"
})
public class CTTLGraphicalObjectBuild {

    protected CTEmpty bldAsOne;
    protected CTAnimationGraphicalObjectBuildProperties bldSub;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String spid;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long grpId;
    @XmlAttribute
    protected Boolean uiExpand;

    /**
     * Gets the value of the bldAsOne property.
     * 
     * @return
     *     possible object is
     *     {@link CTEmpty }
     *     
     */
    public CTEmpty getBldAsOne() {
        return bldAsOne;
    }

    /**
     * Sets the value of the bldAsOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEmpty }
     *     
     */
    public void setBldAsOne(CTEmpty value) {
        this.bldAsOne = value;
    }

    /**
     * Gets the value of the bldSub property.
     * 
     * @return
     *     possible object is
     *     {@link CTAnimationGraphicalObjectBuildProperties }
     *     
     */
    public CTAnimationGraphicalObjectBuildProperties getBldSub() {
        return bldSub;
    }

    /**
     * Sets the value of the bldSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAnimationGraphicalObjectBuildProperties }
     *     
     */
    public void setBldSub(CTAnimationGraphicalObjectBuildProperties value) {
        this.bldSub = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpid() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpid(String value) {
        this.spid = value;
    }

    /**
     * Gets the value of the grpId property.
     * 
     */
    public long getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     */
    public void setGrpId(long value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the uiExpand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUiExpand() {
        if (uiExpand == null) {
            return false;
        } else {
            return uiExpand;
        }
    }

    /**
     * Sets the value of the uiExpand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUiExpand(Boolean value) {
        this.uiExpand = value;
    }

}
