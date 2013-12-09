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
 * <p>Java class for ST_PlaceholderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_PlaceholderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="body"/>
 *     &lt;enumeration value="ctrTitle"/>
 *     &lt;enumeration value="subTitle"/>
 *     &lt;enumeration value="dt"/>
 *     &lt;enumeration value="sldNum"/>
 *     &lt;enumeration value="ftr"/>
 *     &lt;enumeration value="hdr"/>
 *     &lt;enumeration value="obj"/>
 *     &lt;enumeration value="chart"/>
 *     &lt;enumeration value="tbl"/>
 *     &lt;enumeration value="clipArt"/>
 *     &lt;enumeration value="dgm"/>
 *     &lt;enumeration value="media"/>
 *     &lt;enumeration value="sldImg"/>
 *     &lt;enumeration value="pic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_PlaceholderType")
@XmlEnum
public enum STPlaceholderType {


    /**
     * Title
     * 
     */
    @XmlEnumValue("title")
    TITLE("title"),

    /**
     * Body
     * 
     */
    @XmlEnumValue("body")
    BODY("body"),

    /**
     * 
     * 						Centered Title
     * 					
     * 
     */
    @XmlEnumValue("ctrTitle")
    CTR_TITLE("ctrTitle"),

    /**
     * Subtitle
     * 
     */
    @XmlEnumValue("subTitle")
    SUB_TITLE("subTitle"),

    /**
     * Date and Time
     * 
     */
    @XmlEnumValue("dt")
    DT("dt"),

    /**
     * Slide Number
     * 
     */
    @XmlEnumValue("sldNum")
    SLD_NUM("sldNum"),

    /**
     * Footer
     * 
     */
    @XmlEnumValue("ftr")
    FTR("ftr"),

    /**
     * Header
     * 
     */
    @XmlEnumValue("hdr")
    HDR("hdr"),

    /**
     * Object
     * 
     */
    @XmlEnumValue("obj")
    OBJ("obj"),

    /**
     * Chart
     * 
     */
    @XmlEnumValue("chart")
    CHART("chart"),

    /**
     * Table
     * 
     */
    @XmlEnumValue("tbl")
    TBL("tbl"),

    /**
     * Clip Art
     * 
     */
    @XmlEnumValue("clipArt")
    CLIP_ART("clipArt"),

    /**
     * Diagram
     * 
     */
    @XmlEnumValue("dgm")
    DGM("dgm"),

    /**
     * Media
     * 
     */
    @XmlEnumValue("media")
    MEDIA("media"),

    /**
     * Slide Image
     * 
     */
    @XmlEnumValue("sldImg")
    SLD_IMG("sldImg"),

    /**
     * Picture
     * 
     */
    @XmlEnumValue("pic")
    PIC("pic");
    private final String value;

    STPlaceholderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPlaceholderType fromValue(String v) {
        for (STPlaceholderType c: STPlaceholderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
