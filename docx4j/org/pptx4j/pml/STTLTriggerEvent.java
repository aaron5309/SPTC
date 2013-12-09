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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TLTriggerEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TLTriggerEvent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="onBegin"/>
 *     &lt;enumeration value="onEnd"/>
 *     &lt;enumeration value="begin"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="onClick"/>
 *     &lt;enumeration value="onDblClick"/>
 *     &lt;enumeration value="onMouseOver"/>
 *     &lt;enumeration value="onMouseOut"/>
 *     &lt;enumeration value="onNext"/>
 *     &lt;enumeration value="onPrev"/>
 *     &lt;enumeration value="onStopAudio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TLTriggerEvent")
@XmlEnum
public enum STTLTriggerEvent {


    /**
     * 
     * 						Trigger Event Enum ( On Begin )
     * 					
     * 
     */
    @XmlEnumValue("onBegin")
    ON_BEGIN("onBegin"),

    /**
     * 
     * 						Trigger Event Enum ( On End )
     * 					
     * 
     */
    @XmlEnumValue("onEnd")
    ON_END("onEnd"),

    /**
     * 
     * 						Trigger Event Enum ( Begin )
     * 					
     * 
     */
    @XmlEnumValue("begin")
    BEGIN("begin"),

    /**
     * 
     * 						Trigger Event Enum ( End )
     * 					
     * 
     */
    @XmlEnumValue("end")
    END("end"),

    /**
     * 
     * 						Trigger Event Enum ( On Click )
     * 					
     * 
     */
    @XmlEnumValue("onClick")
    ON_CLICK("onClick"),

    /**
     * 
     * 						Trigger Event Enum ( On Double Click )
     * 					
     * 
     */
    @XmlEnumValue("onDblClick")
    ON_DBL_CLICK("onDblClick"),

    /**
     * 
     * 						Trigger Event Enum ( On Mouse Over )
     * 					
     * 
     */
    @XmlEnumValue("onMouseOver")
    ON_MOUSE_OVER("onMouseOver"),

    /**
     * 
     * 						Trigger Event Enum ( On Mouse Out )
     * 					
     * 
     */
    @XmlEnumValue("onMouseOut")
    ON_MOUSE_OUT("onMouseOut"),

    /**
     * 
     * 						Trigger Event Enum ( On Next )
     * 					
     * 
     */
    @XmlEnumValue("onNext")
    ON_NEXT("onNext"),

    /**
     * 
     * 						Trigger Event Enum ( On Previous )
     * 					
     * 
     */
    @XmlEnumValue("onPrev")
    ON_PREV("onPrev"),

    /**
     * 
     * 						Trigger Event Enum ( On Stop Audio )
     * 					
     * 
     */
    @XmlEnumValue("onStopAudio")
    ON_STOP_AUDIO("onStopAudio");
    private final String value;

    STTLTriggerEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTLTriggerEvent fromValue(String v) {
        for (STTLTriggerEvent c: STTLTriggerEvent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
