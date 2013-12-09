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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Stylesheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Stylesheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numFmts" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_NumFmts" minOccurs="0"/>
 *         &lt;element name="fonts" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Fonts" minOccurs="0"/>
 *         &lt;element name="fills" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Fills" minOccurs="0"/>
 *         &lt;element name="borders" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Borders" minOccurs="0"/>
 *         &lt;element name="cellStyleXfs" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_CellStyleXfs" minOccurs="0"/>
 *         &lt;element name="cellXfs" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_CellXfs" minOccurs="0"/>
 *         &lt;element name="cellStyles" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_CellStyles" minOccurs="0"/>
 *         &lt;element name="dxfs" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Dxfs" minOccurs="0"/>
 *         &lt;element name="tableStyles" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_TableStyles" minOccurs="0"/>
 *         &lt;element name="colors" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Colors" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Stylesheet", propOrder = {
    "numFmts",
    "fonts",
    "fills",
    "borders",
    "cellStyleXfs",
    "cellXfs",
    "cellStyles",
    "dxfs",
    "tableStyles",
    "colors",
    "extLst"
})
@XmlRootElement(name = "styleSheet")
public class CTStylesheet {

    protected CTNumFmts numFmts;
    protected CTFonts fonts;
    protected CTFills fills;
    protected CTBorders borders;
    protected CTCellStyleXfs cellStyleXfs;
    protected CTCellXfs cellXfs;
    protected CTCellStyles cellStyles;
    protected CTDxfs dxfs;
    protected CTTableStyles tableStyles;
    protected CTColors colors;
    protected CTExtensionList extLst;

    /**
     * Gets the value of the numFmts property.
     * 
     * @return
     *     possible object is
     *     {@link CTNumFmts }
     *     
     */
    public CTNumFmts getNumFmts() {
        return numFmts;
    }

    /**
     * Sets the value of the numFmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNumFmts }
     *     
     */
    public void setNumFmts(CTNumFmts value) {
        this.numFmts = value;
    }

    /**
     * Gets the value of the fonts property.
     * 
     * @return
     *     possible object is
     *     {@link CTFonts }
     *     
     */
    public CTFonts getFonts() {
        return fonts;
    }

    /**
     * Sets the value of the fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTFonts }
     *     
     */
    public void setFonts(CTFonts value) {
        this.fonts = value;
    }

    /**
     * Gets the value of the fills property.
     * 
     * @return
     *     possible object is
     *     {@link CTFills }
     *     
     */
    public CTFills getFills() {
        return fills;
    }

    /**
     * Sets the value of the fills property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTFills }
     *     
     */
    public void setFills(CTFills value) {
        this.fills = value;
    }

    /**
     * Gets the value of the borders property.
     * 
     * @return
     *     possible object is
     *     {@link CTBorders }
     *     
     */
    public CTBorders getBorders() {
        return borders;
    }

    /**
     * Sets the value of the borders property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBorders }
     *     
     */
    public void setBorders(CTBorders value) {
        this.borders = value;
    }

    /**
     * Gets the value of the cellStyleXfs property.
     * 
     * @return
     *     possible object is
     *     {@link CTCellStyleXfs }
     *     
     */
    public CTCellStyleXfs getCellStyleXfs() {
        return cellStyleXfs;
    }

    /**
     * Sets the value of the cellStyleXfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCellStyleXfs }
     *     
     */
    public void setCellStyleXfs(CTCellStyleXfs value) {
        this.cellStyleXfs = value;
    }

    /**
     * Gets the value of the cellXfs property.
     * 
     * @return
     *     possible object is
     *     {@link CTCellXfs }
     *     
     */
    public CTCellXfs getCellXfs() {
        return cellXfs;
    }

    /**
     * Sets the value of the cellXfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCellXfs }
     *     
     */
    public void setCellXfs(CTCellXfs value) {
        this.cellXfs = value;
    }

    /**
     * Gets the value of the cellStyles property.
     * 
     * @return
     *     possible object is
     *     {@link CTCellStyles }
     *     
     */
    public CTCellStyles getCellStyles() {
        return cellStyles;
    }

    /**
     * Sets the value of the cellStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCellStyles }
     *     
     */
    public void setCellStyles(CTCellStyles value) {
        this.cellStyles = value;
    }

    /**
     * Gets the value of the dxfs property.
     * 
     * @return
     *     possible object is
     *     {@link CTDxfs }
     *     
     */
    public CTDxfs getDxfs() {
        return dxfs;
    }

    /**
     * Sets the value of the dxfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTDxfs }
     *     
     */
    public void setDxfs(CTDxfs value) {
        this.dxfs = value;
    }

    /**
     * Gets the value of the tableStyles property.
     * 
     * @return
     *     possible object is
     *     {@link CTTableStyles }
     *     
     */
    public CTTableStyles getTableStyles() {
        return tableStyles;
    }

    /**
     * Sets the value of the tableStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTableStyles }
     *     
     */
    public void setTableStyles(CTTableStyles value) {
        this.tableStyles = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link CTColors }
     *     
     */
    public CTColors getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColors }
     *     
     */
    public void setColors(CTColors value) {
        this.colors = value;
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

}
