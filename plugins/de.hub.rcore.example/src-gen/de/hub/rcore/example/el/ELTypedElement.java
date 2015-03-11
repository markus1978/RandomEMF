/**
 */
package de.hub.rcore.example.el;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELTypedElement#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELTypedElement#isArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELTypedElement()
 * @model
 * @generated
 */
public interface ELTypedElement extends ELNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ELClass)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELTypedElement_Type()
	 * @model
	 * @generated
	 */
	ELClass getType();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELTypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ELClass value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELTypedElement_Array()
	 * @model
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELTypedElement#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

} // ELTypedElement
