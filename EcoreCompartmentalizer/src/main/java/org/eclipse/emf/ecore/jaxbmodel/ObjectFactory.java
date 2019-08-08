//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 01:05:25 PM CEST 
//


package org.eclipse.emf.ecore.jaxbmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.emf._2002.ecore package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EReference_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EReference");
    private final static QName _ETypeParameter_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "ETypeParameter");
    private final static QName _EEnumLiteral_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EEnumLiteral");
    private final static QName _EOperation_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EOperation");
    private final static QName _EParameter_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EParameter");
    private final static QName _EStringToStringMapEntry_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EStringToStringMapEntry");
    private final static QName _EGenericType_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EGenericType");
    private final static QName _EObject_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EObject");
    private final static QName _EAttribute_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EAttribute");
    private final static QName _EClass_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EClass");
    private final static QName _EAnnotation_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EAnnotation");
    private final static QName _EFactory_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EFactory");
    private final static QName _ETypedElement_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement");
    private final static QName _EPackage_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EPackage");
    private final static QName _EEnum_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EEnum");
    private final static QName _EModelElement_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EModelElement");
    private final static QName _EStructuralFeature_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EStructuralFeature");
    private final static QName _EClassifier_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EClassifier");
    private final static QName _EDataType_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "EDataType");
    private final static QName _ENamedElement_QNAME = new QName("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.emf._2002.ecore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EDataType }
     * 
     */
    public EDataType createEDataType() {
        return new EDataType();
    }

    /**
     * Create an instance of {@link EEnum }
     * 
     */
    public EEnum createEEnum() {
        return new EEnum();
    }

    /**
     * Create an instance of {@link EPackage }
     * 
     */
    public EPackage createEPackage() {
        return new EPackage();
    }

    /**
     * Create an instance of {@link EAnnotation }
     * 
     */
    public EAnnotation createEAnnotation() {
        return new EAnnotation();
    }

    /**
     * Create an instance of {@link EFactory }
     * 
     */
    public EFactory createEFactory() {
        return new EFactory();
    }

    /**
     * Create an instance of {@link EAttribute }
     * 
     */
    public EAttribute createEAttribute() {
        return new EAttribute();
    }

    /**
     * Create an instance of {@link EClass }
     * 
     */
    public EClass createEClass() {
        return new EClass();
    }

    /**
     * Create an instance of {@link EParameter }
     * 
     */
    public EParameter createEParameter() {
        return new EParameter();
    }

    /**
     * Create an instance of {@link EStringToStringMapEntry }
     * 
     */
    public EStringToStringMapEntry createEStringToStringMapEntry() {
        return new EStringToStringMapEntry();
    }

    /**
     * Create an instance of {@link EGenericType }
     * 
     */
    public EGenericType createEGenericType() {
        return new EGenericType();
    }

    /**
     * Create an instance of {@link EEnumLiteral }
     * 
     */
    public EEnumLiteral createEEnumLiteral() {
        return new EEnumLiteral();
    }

    /**
     * Create an instance of {@link EOperation }
     * 
     */
    public EOperation createEOperation() {
        return new EOperation();
    }

    /**
     * Create an instance of {@link EReference }
     * 
     */
    public EReference createEReference() {
        return new EReference();
    }

    /**
     * Create an instance of {@link ETypeParameter }
     * 
     */
    public ETypeParameter createETypeParameter() {
        return new ETypeParameter();
    }

    /**
     * Create an instance of {@link EObject }
     * 
     */
    public EObject createEObject() {
        return new EObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EReference")
    public JAXBElement<EReference> createEReference(EReference value) {
        return new JAXBElement<EReference>(_EReference_QNAME, EReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETypeParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "ETypeParameter")
    public JAXBElement<ETypeParameter> createETypeParameter(ETypeParameter value) {
        return new JAXBElement<ETypeParameter>(_ETypeParameter_QNAME, ETypeParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EEnumLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EEnumLiteral")
    public JAXBElement<EEnumLiteral> createEEnumLiteral(EEnumLiteral value) {
        return new JAXBElement<EEnumLiteral>(_EEnumLiteral_QNAME, EEnumLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EOperation")
    public JAXBElement<EOperation> createEOperation(EOperation value) {
        return new JAXBElement<EOperation>(_EOperation_QNAME, EOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EParameter")
    public JAXBElement<EParameter> createEParameter(EParameter value) {
        return new JAXBElement<EParameter>(_EParameter_QNAME, EParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EStringToStringMapEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EStringToStringMapEntry")
    public JAXBElement<EStringToStringMapEntry> createEStringToStringMapEntry(EStringToStringMapEntry value) {
        return new JAXBElement<EStringToStringMapEntry>(_EStringToStringMapEntry_QNAME, EStringToStringMapEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EGenericType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EGenericType")
    public JAXBElement<EGenericType> createEGenericType(EGenericType value) {
        return new JAXBElement<EGenericType>(_EGenericType_QNAME, EGenericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EObject")
    public JAXBElement<Object> createEObject(Object value) {
        return new JAXBElement<Object>(_EObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EAttribute")
    public JAXBElement<EAttribute> createEAttribute(EAttribute value) {
        return new JAXBElement<EAttribute>(_EAttribute_QNAME, EAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EClass")
    public JAXBElement<EClass> createEClass(EClass value) {
        return new JAXBElement<EClass>(_EClass_QNAME, EClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAnnotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EAnnotation")
    public JAXBElement<EAnnotation> createEAnnotation(EAnnotation value) {
        return new JAXBElement<EAnnotation>(_EAnnotation_QNAME, EAnnotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EFactory")
    public JAXBElement<EFactory> createEFactory(EFactory value) {
        return new JAXBElement<EFactory>(_EFactory_QNAME, EFactory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETypedElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "ETypedElement")
    public JAXBElement<ETypedElement> createETypedElement(ETypedElement value) {
        return new JAXBElement<ETypedElement>(_ETypedElement_QNAME, ETypedElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EPackage")
    public JAXBElement<EPackage> createEPackage(EPackage value) {
        return new JAXBElement<EPackage>(_EPackage_QNAME, EPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EEnum")
    public JAXBElement<EEnum> createEEnum(EEnum value) {
        return new JAXBElement<EEnum>(_EEnum_QNAME, EEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EModelElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EModelElement")
    public JAXBElement<EModelElement> createEModelElement(EModelElement value) {
        return new JAXBElement<EModelElement>(_EModelElement_QNAME, EModelElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EStructuralFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EStructuralFeature")
    public JAXBElement<EStructuralFeature> createEStructuralFeature(EStructuralFeature value) {
        return new JAXBElement<EStructuralFeature>(_EStructuralFeature_QNAME, EStructuralFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EClassifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EClassifier")
    public JAXBElement<EClassifier> createEClassifier(EClassifier value) {
        return new JAXBElement<EClassifier>(_EClassifier_QNAME, EClassifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "EDataType")
    public JAXBElement<EDataType> createEDataType(EDataType value) {
        return new JAXBElement<EDataType>(_EDataType_QNAME, EDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENamedElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eclipse.org/emf/2002/Ecore", name = "ENamedElement")
    public JAXBElement<ENamedElement> createENamedElement(ENamedElement value) {
        return new JAXBElement<ENamedElement>(_ENamedElement_QNAME, ENamedElement.class, null, value);
    }

}
