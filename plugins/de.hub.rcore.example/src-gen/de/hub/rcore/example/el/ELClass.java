/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELClass#getFields <em>Fields</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELClass#getSuperClases <em>Super Clases</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELClass#getInnerClasses <em>Inner Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELClass()
 * @model
 * @generated
 */
public interface ELClass extends ELNamedElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELField> getFields();

	/**
	 * Returns the value of the '<em><b>Super Clases</b></em>' reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Clases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Clases</em>' reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELClass_SuperClases()
	 * @model
	 * @generated
	 */
	EList<ELClass> getSuperClases();

	/**
	 * Returns the value of the '<em><b>Inner Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Classes</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELClass_InnerClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELClass> getInnerClasses();

} // ELClass
