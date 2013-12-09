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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_OleObjectEmbed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_OleObjectEmbed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="followColorScheme" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_OleObjectFollowColorScheme" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_OleObjectEmbed", propOrder = {
    "extLst"
})
public class CTOleObjectEmbed {

    protected CTExtensionList extLst;
    @XmlAttribute
    protected STOleObjectFollowColorScheme followColorScheme;

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
     * Gets the value of the followColorScheme property.
     * 
     * @return
     *     possible object is
     *     {@link STOleObjectFollowColorScheme }
     *     
     */
    public STOleObjectFollowColorScheme getFollowColorScheme() {
        if (followColorScheme == null) {
            return STOleObjectFollowColorScheme.NONE;
        } else {
            return followColorScheme;
        }
    }

    /**
     * Sets the value of the followColorScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOleObjectFollowColorScheme }
     *     
     */
    public void setFollowColorScheme(STOleObjectFollowColorScheme value) {
        this.followColorScheme = value;
    }

}
