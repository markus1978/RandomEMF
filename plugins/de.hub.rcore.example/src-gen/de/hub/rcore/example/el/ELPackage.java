/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELPackage#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELPackage()
 * @model
 * @generated
 */
public interface ELPackage extends ELNamedElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELClass> getClasses();

} // ELPackage
