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
 * <p>Java class for ST_TransitionCornerDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TransitionCornerDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="lu"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="ld"/>
 *     &lt;enumeration value="rd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TransitionCornerDirectionType")
@XmlEnum
public enum STTransitionCornerDirectionType {


    /**
     * 
     * 						Transition Corner Direction Enum ( Left-Up )
     * 					
     * 
     */
    @XmlEnumValue("lu")
    LU("lu"),

    /**
     * 
     * 						Transition Corner Direction Enum ( Right-Up )
     * 					
     * 
     */
    @XmlEnumValue("ru")
    RU("ru"),

    /**
     * 
     * 						Transition Corner Direction Enum ( Left-Down )
     * 					
     * 
     */
    @XmlEnumValue("ld")
    LD("ld"),

    /**
     * 
     * 						Transition Corner Direction Enum ( Right-Down )
     * 					
     * 
     */
    @XmlEnumValue("rd")
    RD("rd");
    private final String value;

    STTransitionCornerDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTransitionCornerDirectionType fromValue(String v) {
        for (STTransitionCornerDirectionType c: STTransitionCornerDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
