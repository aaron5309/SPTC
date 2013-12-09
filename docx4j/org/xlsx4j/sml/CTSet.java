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


package org.xlsx4j.sml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Set complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Set">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpls" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Tuples" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sortByTuple" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Tuples" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxRank" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="setDefinition" use="required" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_Xstring" />
 *       &lt;attribute name="sortType" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_SortType" default="none" />
 *       &lt;attribute name="queryFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Set", propOrder = {
    "tpls",
    "sortByTuple"
})
public class CTSet {

    protected List<CTTuples> tpls;
    protected CTTuples sortByTuple;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long count;
    @XmlAttribute(required = true)
    protected int maxRank;
    @XmlAttribute(required = true)
    protected String setDefinition;
    @XmlAttribute
    protected STSortType sortType;
    @XmlAttribute
    protected Boolean queryFailed;

    /**
     * Gets the value of the tpls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTpls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTTuples }
     * 
     * 
     */
    public List<CTTuples> getTpls() {
        if (tpls == null) {
            tpls = new ArrayList<CTTuples>();
        }
        return this.tpls;
    }

    /**
     * Gets the value of the sortByTuple property.
     * 
     * @return
     *     possible object is
     *     {@link CTTuples }
     *     
     */
    public CTTuples getSortByTuple() {
        return sortByTuple;
    }

    /**
     * Sets the value of the sortByTuple property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTuples }
     *     
     */
    public void setSortByTuple(CTTuples value) {
        this.sortByTuple = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the maxRank property.
     * 
     */
    public int getMaxRank() {
        return maxRank;
    }

    /**
     * Sets the value of the maxRank property.
     * 
     */
    public void setMaxRank(int value) {
        this.maxRank = value;
    }

    /**
     * Gets the value of the setDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetDefinition() {
        return setDefinition;
    }

    /**
     * Sets the value of the setDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetDefinition(String value) {
        this.setDefinition = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link STSortType }
     *     
     */
    public STSortType getSortType() {
        if (sortType == null) {
            return STSortType.NONE;
        } else {
            return sortType;
        }
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSortType }
     *     
     */
    public void setSortType(STSortType value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the queryFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueryFailed() {
        if (queryFailed == null) {
            return false;
        } else {
            return queryFailed;
        }
    }

    /**
     * Sets the value of the queryFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryFailed(Boolean value) {
        this.queryFailed = value;
    }

}
