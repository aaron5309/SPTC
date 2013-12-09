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
 * <p>Java class for CT_PrintProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PrintProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="prnWhat" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_PrintWhat" default="slides" />
 *       &lt;attribute name="clrMode" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_PrintColorMode" default="clr" />
 *       &lt;attribute name="hiddenSlides" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="scaleToFitPaper" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="frameSlides" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PrintProperties", propOrder = {
    "extLst"
})
public class CTPrintProperties {

    protected CTExtensionList extLst;
    @XmlAttribute
    protected STPrintWhat prnWhat;
    @XmlAttribute
    protected STPrintColorMode clrMode;
    @XmlAttribute
    protected Boolean hiddenSlides;
    @XmlAttribute
    protected Boolean scaleToFitPaper;
    @XmlAttribute
    protected Boolean frameSlides;

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
     * Gets the value of the prnWhat property.
     * 
     * @return
     *     possible object is
     *     {@link STPrintWhat }
     *     
     */
    public STPrintWhat getPrnWhat() {
        if (prnWhat == null) {
            return STPrintWhat.SLIDES;
        } else {
            return prnWhat;
        }
    }

    /**
     * Sets the value of the prnWhat property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPrintWhat }
     *     
     */
    public void setPrnWhat(STPrintWhat value) {
        this.prnWhat = value;
    }

    /**
     * Gets the value of the clrMode property.
     * 
     * @return
     *     possible object is
     *     {@link STPrintColorMode }
     *     
     */
    public STPrintColorMode getClrMode() {
        if (clrMode == null) {
            return STPrintColorMode.CLR;
        } else {
            return clrMode;
        }
    }

    /**
     * Sets the value of the clrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPrintColorMode }
     *     
     */
    public void setClrMode(STPrintColorMode value) {
        this.clrMode = value;
    }

    /**
     * Gets the value of the hiddenSlides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHiddenSlides() {
        if (hiddenSlides == null) {
            return false;
        } else {
            return hiddenSlides;
        }
    }

    /**
     * Sets the value of the hiddenSlides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHiddenSlides(Boolean value) {
        this.hiddenSlides = value;
    }

    /**
     * Gets the value of the scaleToFitPaper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScaleToFitPaper() {
        if (scaleToFitPaper == null) {
            return false;
        } else {
            return scaleToFitPaper;
        }
    }

    /**
     * Sets the value of the scaleToFitPaper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScaleToFitPaper(Boolean value) {
        this.scaleToFitPaper = value;
    }

    /**
     * Gets the value of the frameSlides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFrameSlides() {
        if (frameSlides == null) {
            return false;
        } else {
            return frameSlides;
        }
    }

    /**
     * Sets the value of the frameSlides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrameSlides(Boolean value) {
        this.frameSlides = value;
    }

}
