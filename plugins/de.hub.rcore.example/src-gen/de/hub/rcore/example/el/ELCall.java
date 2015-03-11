/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELCall#getCallee <em>Callee</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELCall#getThisArgument <em>This Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELCall()
 * @model
 * @generated
 */
public interface ELCall extends ELExpression {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELExpression> getArguments();

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(ELMethod)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELCall_Callee()
	 * @model
	 * @generated
	 */
	ELMethod getCallee();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELCall#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(ELMethod value);

	/**
	 * Returns the value of the '<em><b>This Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Argument</em>' reference.
	 * @see #setThisArgument(ELExpression)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELCall_ThisArgument()
	 * @model
	 * @generated
	 */
	ELExpression getThisArgument();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELCall#getThisArgument <em>This Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Argument</em>' reference.
	 * @see #getThisArgument()
	 * @generated
	 */
	void setThisArgument(ELExpression value);

} // ELCall
