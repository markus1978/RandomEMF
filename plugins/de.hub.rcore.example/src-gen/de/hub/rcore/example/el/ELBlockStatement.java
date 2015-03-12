/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStatement#getBlock <em>Block</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStatement#getKind <em>Kind</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStatement#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStatement()
 * @model
 * @generated
 */
public interface ELBlockStatement extends ELStatement {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStatement_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELBlock> getBlock();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(ELBlockStarementKind)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStatement_Kind()
	 * @model
	 * @generated
	 */
	ELBlockStarementKind getKind();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELBlockStatement#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ELBlockStarementKind value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStatement_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELExpression> getExpressions();

} // ELBlockStatement
