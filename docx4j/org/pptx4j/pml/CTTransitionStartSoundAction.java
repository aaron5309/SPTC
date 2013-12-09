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
import org.docx4j.dml.CTEmbeddedWAVAudioFile;


/**
 * <p>Java class for CT_TransitionStartSoundAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TransitionStartSoundAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snd" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_EmbeddedWAVAudioFile"/>
 *       &lt;/sequence>
 *       &lt;attribute name="loop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TransitionStartSoundAction", propOrder = {
    "snd"
})
public class CTTransitionStartSoundAction {

    @XmlElement(required = true)
    protected CTEmbeddedWAVAudioFile snd;
    @XmlAttribute
    protected Boolean loop;

    /**
     * Gets the value of the snd property.
     * 
     * @return
     *     possible object is
     *     {@link CTEmbeddedWAVAudioFile }
     *     
     */
    public CTEmbeddedWAVAudioFile getSnd() {
        return snd;
    }

    /**
     * Sets the value of the snd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEmbeddedWAVAudioFile }
     *     
     */
    public void setSnd(CTEmbeddedWAVAudioFile value) {
        this.snd = value;
    }

    /**
     * Gets the value of the loop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLoop() {
        if (loop == null) {
            return false;
        } else {
            return loop;
        }
    }

    /**
     * Sets the value of the loop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoop(Boolean value) {
        this.loop = value;
    }

}
