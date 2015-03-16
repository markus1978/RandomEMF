/**
 */
package de.hub.rcore.example.el;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELAssignment#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELAssignment#getAssignee <em>Assignee</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELAssignment()
 * @model
 * @generated
 */
public interface ELAssignment extends ELStatement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ELExpression)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELAssignment_Expr()
	 * @model containment="true"
	 * @generated
	 */
	ELExpression getExpr();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELAssignment#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ELExpression value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(ELVariable)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELAssignment_Assignee()
	 * @model
	 * @generated
	 */
	ELVariable getAssignee();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELAssignment#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(ELVariable value);

} // ELAssignment
