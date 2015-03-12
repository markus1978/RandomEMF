/**
 */
package de.hub.rcore.example.el;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Op Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELOpCall#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOpCall()
 * @model
 * @generated
 */
public interface ELOpCall extends ELCall {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(ELOp)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOpCall_Kind()
	 * @model
	 * @generated
	 */
	ELOp getKind();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELOpCall#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ELOp value);

} // ELOpCall
