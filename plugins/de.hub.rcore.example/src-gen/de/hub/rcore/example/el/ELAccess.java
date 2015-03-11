/**
 */
package de.hub.rcore.example.el;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELAccess#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELAccess()
 * @model
 * @generated
 */
public interface ELAccess extends ELExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(ELVariable)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELAccess_Variable()
	 * @model
	 * @generated
	 */
	ELVariable getVariable();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELAccess#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ELVariable value);

} // ELAccess
