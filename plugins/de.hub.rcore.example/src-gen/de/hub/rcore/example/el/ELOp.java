/**
 */
package de.hub.rcore.example.el;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELOp#getKind <em>Kind</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELOp#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELOp#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOp()
 * @model
 * @generated
 */
public interface ELOp extends ELPredefined, ELMethod {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.rcore.example.el.ELOpKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.hub.rcore.example.el.ELOpKind
	 * @see #setKind(ELOpKind)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOp_Kind()
	 * @model
	 * @generated
	 */
	ELOpKind getKind();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELOp#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.hub.rcore.example.el.ELOpKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ELOpKind value);

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' attribute.
	 * @see #setSyntax(String)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOp_Syntax()
	 * @model
	 * @generated
	 */
	String getSyntax();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELOp#getSyntax <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' attribute.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(String value);

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' attribute.
	 * @see #setOperators(int)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELOp_Operators()
	 * @model
	 * @generated
	 */
	int getOperators();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELOp#getOperators <em>Operators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operators</em>' attribute.
	 * @see #getOperators()
	 * @generated
	 */
	void setOperators(int value);

} // ELOp
