//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 01:05:25 PM CEST 
//


package org.eclipse.emf.ecore.jaxbmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ETypeParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETypeParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/emf/2002/Ecore}ENamedElement">
 *       &lt;sequence>
 *         &lt;element name="eBounds" type="{http://www.eclipse.org/emf/2002/Ecore}EGenericType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETypeParameter", propOrder = {
    "eBounds"
})
public class ETypeParameter
    extends ENamedElement
{

    protected List<EGenericType> eBounds;

    /**
     * Gets the value of the eBounds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBounds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBounds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EGenericType }
     * 
     * 
     */
    public List<EGenericType> getEBounds() {
        if (eBounds == null) {
            eBounds = new ArrayList<EGenericType>();
        }
        return this.eBounds;
    }

}
