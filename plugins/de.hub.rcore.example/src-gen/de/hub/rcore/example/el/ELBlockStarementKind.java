/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Block Starement Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStarementKind#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStarementKind#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELBlockStarementKind#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStarementKind()
 * @model
 * @generated
 */
public interface ELBlockStarementKind extends EObject {
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
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStarementKind_Syntax()
	 * @model
	 * @generated
	 */
	String getSyntax();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELBlockStarementKind#getSyntax <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' attribute.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' attribute.
	 * @see #setBlocks(int)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStarementKind_Blocks()
	 * @model
	 * @generated
	 */
	int getBlocks();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELBlockStarementKind#getBlocks <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks</em>' attribute.
	 * @see #getBlocks()
	 * @generated
	 */
	void setBlocks(int value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' attribute.
	 * @see #setExpressions(int)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELBlockStarementKind_Expressions()
	 * @model
	 * @generated
	 */
	int getExpressions();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELBlockStarementKind#getExpressions <em>Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' attribute.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(int value);

} // ELBlockStarementKind
