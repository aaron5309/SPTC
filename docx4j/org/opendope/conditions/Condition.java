//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.27 at 06:57:43 PM EST 
//


package org.opendope.conditions;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.docx4j.XmlUtils;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.CustomXmlDataStoragePart;
import org.docx4j.openpackaging.parts.opendope.ConditionsPart;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://opendope.org/conditions}xpathref"/>
 *         &lt;element ref="{http://opendope.org/conditions}and"/>
 *         &lt;element ref="{http://opendope.org/conditions}or"/>
 *         &lt;element ref="{http://opendope.org/conditions}not"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="descrption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "particle"
})
@XmlRootElement(name = "condition")
public class Condition implements Evaluable {

    @XmlElements({
        @XmlElement(name = "xpathref", type = Xpathref.class),
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "not", type = Not.class)
    })
    protected Evaluable particle;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "descrption")
    protected String descrption;
    @XmlAttribute(name = "comments")
    protected String comments;

    /**
     * Gets the value of the particle property.
     * 
     * @return
     *     possible object is
     *     {@link Xpathref }
     *     {@link And }
     *     {@link Or }
     *     {@link Not }
     *     
     */
    public Evaluable getParticle() {
        return particle;
    }

    /**
     * Sets the value of the particle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xpathref }
     *     {@link And }
     *     {@link Or }
     *     {@link Not }
     *     
     */
    public void setParticle(Evaluable value) {
        this.particle = value;
    }
    
	public boolean evaluate(WordprocessingMLPackage pkg, 
			Map<String, CustomXmlDataStoragePart> customXmlDataStorageParts,
			Conditions conditions,
			org.opendope.xpaths.Xpaths xPaths) {

		return particle.evaluate(pkg, customXmlDataStorageParts, conditions, xPaths);
    }

	public void listXPaths( List<org.opendope.xpaths.Xpaths.Xpath> theList, 
			Conditions conditions,
			org.opendope.xpaths.Xpaths xPaths) {
		
    	particle.listXPaths(theList, conditions, xPaths);
		
	}
	
	public String toString(Conditions conditions,
			org.opendope.xpaths.Xpaths xPaths) {

		return particle.toString(conditions, xPaths);
	}
	
	public Condition repeat(String xpathBase,
			int index,
			Conditions conditions,
			org.opendope.xpaths.Xpaths xPaths)	{
		
		// Create and add new condition
		Condition newCondition = XmlUtils.deepCopy(this);
		String newConditionId = id + "_" + index;
		newCondition.setId(newConditionId);
		conditions.getCondition().add(newCondition);
		
		// Fix its particles
		newCondition.getParticle().repeat(xpathBase, index, conditions, xPaths);
		
		return newCondition;
	}
	
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the descrption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * Sets the value of the descrption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrption(String value) {
        this.descrption = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
