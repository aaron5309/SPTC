/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
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

    This file is a translation into Java of a portion of 
    Program.cs from Microsoft's OpenXmlViewer, which was made available to
    the project under the following license:
    
		(c) Microsoft Corporation
		
		Microsoft Public License (Ms-PL)
		
		This license governs use of the accompanying software. If you use the
		software, you accept this license. If you do not accept the license, do
		not use the software.
		
		1. Definitions
		
		The terms "reproduce," "reproduction," "derivative works," and "distribution"
		have the same meaning here as under U.S. copyright law.
		
		A "contribution" is the original software, or any additions or changes to the software.
		
		A "contributor" is any person that distributes its contribution under this license.
		
		"Licensed patents" are a contributor's patent claims that read directly on its contribution.
		
		2. Grant of Rights
		
		(A) Copyright Grant- Subject to the terms of this license, including the
		license conditions and limitations in section 3, each contributor
		grants you a non-exclusive, worldwide, royalty-free copyright license
		to reproduce its contribution, prepare derivative works of its
		contribution, and distribute its contribution or any derivative works
		that you create.
		
		(B) Patent Grant- Subject to the terms of this
		license, including the license conditions and limitations in section 3,
		each contributor grants you a non-exclusive, worldwide, royalty-free
		license under its licensed patents to make, have made, use, sell, offer
		for sale, import, and/or otherwise dispose of its contribution in the
		software or derivative works of the contribution in the software.
		
		3. Conditions and Limitations
		
		(A) No Trademark License- This license does not grant you rights to use any contributors' name, logo, or trademarks.
		
		(B) If you bring a patent claim against any contributor over patents that
		you claim are infringed by the software, your patent license from such
		contributor to the software ends automatically.
		
		(C) If you distribute any portion of the software, you must retain all copyright,
		patent, trademark, and attribution notices that are present in the
		software.
		
		(D) If you distribute any portion of the software in
		source code form, you may do so only under this license by including a
		complete copy of this license with your distribution. If you distribute
		any portion of the software in compiled or object code form, you may
		only do so under a license that complies with this license.
		
		(E) The software is licensed "as-is." You bear the risk of using it. The
		contributors give no express warranties, guarantees or conditions. You
		may have additional consumer rights under your local laws which this
		license cannot change. To the extent permitted under your local laws,
		the contributors exclude the implied warranties of merchantability,
		fitness for a particular purpose and non-infringement.

 */
package org.docx4j.model.listnumbering;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.docx4j.model.PropertyResolver;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.NumberingDefinitionsPart;
import org.docx4j.wml.Lvl;
import org.docx4j.wml.NumFmt;
import org.docx4j.wml.NumberFormat;
import org.docx4j.wml.Numbering;
import org.docx4j.wml.PPr;
import org.docx4j.wml.PPrBase.Ind;
import org.docx4j.wml.PPrBase.NumPr;

public class Emulator {
	
	/* There should be only one Emulator object per 
	 * WordprocessingML package.  It is set on the 
	 * numbering part.
	 * 
	 * TODO 2011 02 23: in addition to having numbering in the 
	 * Main document part, you can have numbering in other 
	 * stories:
	 *   - headers/footers
	 *   - comments
	 *   - footnotes/endnotes
	 * This means that ListLevel should have independent counters
	 * for each story, or the there should be a ListLevel defined
	 * for each story! 
	 * 
	 */
	
	protected static Logger log = Logger.getLogger(Emulator.class);
			
    public Emulator()
    {
    }
    

    /* Get the computed list number for the given list at this point in the
     * document.
     */
    public static ResultTriple getNumber(WordprocessingMLPackage wmlPackage, String pStyleVal, 
    		String numId, String levelId) {
    	
    	
    	org.docx4j.openpackaging.parts.WordprocessingML.NumberingDefinitionsPart numberingPart =
    		wmlPackage.getMainDocumentPart().getNumberingDefinitionsPart();
    	
    	if (numberingPart==null) {
    		return null;
    	}

    	Emulator em = numberingPart.getEmulator();
    	
    	// Object to hold results
    	ResultTriple triple = em.new ResultTriple();    	
    	
    	org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart stylesPart =
    		wmlPackage.getMainDocumentPart().getStyleDefinitionsPart();
    	
    	PropertyResolver propertyResolver = wmlPackage.getMainDocumentPart().getPropertyResolver();
    	    	
    	// If numId is not provided explicitly, 
    	// is it provided by the style?
    	// (ie does this style have a list associated with it?)
    	if (numId == null 
    			|| numId.equals("")) {
    		
    		org.docx4j.wml.Style style = null;
    		if (pStyleVal==null || pStyleVal.equals("") ) {
        		log.debug("no explicit numId; no style either");
    			return null;
    		}
    		
    		log.debug("no explicit numId; looking in styles");
			style = propertyResolver.getStyle(pStyleVal); 
			
	    	if (style == null) {
	    		log.debug("Couldn't find style '" + pStyleVal + "'");
	    		return null;
	    	} 
	    	
	    	if (style.getPPr() == null) {
		    		log.debug("Style '" + pStyleVal + "' has no pPr");
//		    		System.out.println("Style '" + pStyleVal + "' has no pPr");
//		        	System.out.println(
//		        			org.docx4j.XmlUtils.marshaltoString(style, true, true)
//		        			);
		        	
		    		return null;
	    	} 

	    	
    		NumPr numPr = style.getPPr().getNumPr();
    		
    		if (numPr==null) {
	        	log.debug("Couldn't get NumPr from " +  pStyleVal);
//	        	log.debug(
//	        			org.docx4j.XmlUtils.marshaltoString(style, true, true)
//	        			);
	        	// So there is no numbering set on the style either
	        	// That's ok ..
	        	return null;
    		}
    		
    		if (numPr.getNumId()==null) {
    			log.debug("NumPr element has no numId");
    			if (pStyleVal!=null) {
    	        	// use propertyResolver to follow <w:basedOn w:val="blagh"/>
        			log.debug(pStyleVal + ".. use propertyResolver to follow basedOn");
    				propertyResolver.getEffectivePPr(pStyleVal);
    			}
    			
    			if (numPr.getNumId()==null) {	
        			log.debug(pStyleVal + "NumPr element still has no numId (basedOn didn't help)");
    				return null; // Is this the right thing to do? Check!
    			} else {
    				log.info("Got numId: " + numPr.getNumId() );
    			}
    		}
    		
    		numId = numPr.getNumId().getVal().toString();
    		if (numId == null || numId.equals("")) {
    			log.error("numId was null or empty!");
    			return null;
    		} 
    		
    		if (levelId == null 
    				|| levelId.equals("") ) {
    			
    			if (numPr.getIlvl() != null ) {
    				
    				levelId = numPr.getIlvl().getVal().toString();
    	    		log.info("levelId=" + numId + " (from style)" );
    			} else {
    				// default
    				levelId = "0";
    			}
    		}
    	}

		log.debug("Using numId: " + numId);    		
    	
		if (levelId == null || levelId.equals("")) {
			// String numId = getAttributeValue(numIdNode, ValAttrName);
			log.warn("No level id?! Default to 0.");
			levelId="0";
		}


		if (numberingPart.getInstanceListDefinitions().containsKey(numId)
				&& numberingPart.getInstanceListDefinitions().get(numId).LevelExists(
						levelId)) {
			// XmlAttribute counterAttr =
			// mainDoc.CreateAttribute("numString");

			numberingPart.getInstanceListDefinitions().get(numId).IncrementCounter(
					levelId);
			triple.numString = numberingPart.getInstanceListDefinitions().get(numId)
					.GetCurrentNumberString(levelId);
			
			log.debug("Got number: " + triple.numString);

			String font = numberingPart.getInstanceListDefinitions().get(numId)
					.GetFont(levelId);

			if (font != null && !font.equals("")) {
				triple.numFont = font;
			}

			if (numberingPart.getInstanceListDefinitions().get(numId).IsBullet(levelId)) {
				//triple.isBullet = true;
				triple.bullet = numberingPart.getInstanceListDefinitions().get(numId).getLevel(levelId).getLevelText();
			}
			
			PPr ppr = numberingPart.getInstanceListDefinitions().get(numId).getLevel(levelId).getJaxbAbstractLvl().getPPr();
			if (ppr!=null) {
				triple.ind = ppr.getInd();
			}
			
		} else if (!numberingPart.getInstanceListDefinitions().containsKey(numId)){
			
			log.error("Couldn't find list " + numId);
			
		} else if (!numberingPart.getInstanceListDefinitions().get(numId).LevelExists(
				levelId)){
			
			log.error("Couldn't find level " + levelId + " in list " + numId);					
		}
		return triple;
    }

//    public ListLevel getListNumberingDefinition(NumberingDefinitionsPart numberingPart, NumPr numPr) {
//    	
//		if (numPr.getNumId()==null) {
//			return null; 	    			
//		}
//		
//		String numId = null;
//		if (numPr.getNumId()==null) {
//			log.error("numId was null or empty!");
//			return null;
//		} else {
//			numId = numPr.getNumId().getVal().toString();
//		}
//		
//		String levelId = "0";
//		if (numPr.getIlvl() != null ) {
//			levelId = numPr.getIlvl().getVal().toString();
//		}
//	
//		// Get the list
//		ListNumberingDefinition listNumberingDefinition
//			= numberingPart.getInstanceListDefinitions().get(numId);
//    	
//		if (listNumberingDefinition==null) {
//			return null;
//		} else {
//			return listNumberingDefinition.getLevel(levelId);
//		}
//    }
    
    
    public class ResultTriple {
    	
    	String numString;
		public String getNumString() {
			return numString;
		}
    	
    	String numFont;
		public String getNumFont() {
			return numFont;
		}
    	
//    	boolean isBullet = false;
//		public boolean isBullet() {
//			return isBullet;
//		}
		
		String bullet = null;
		public String getBullet() {
			return bullet;
		}
		
		Ind ind = null;
		public Ind getIndent() {
			return ind;
		}
    }

}
