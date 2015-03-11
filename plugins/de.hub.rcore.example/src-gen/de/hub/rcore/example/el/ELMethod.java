/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELMethod#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELMethod#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELMethod()
 * @model
 * @generated
 */
public interface ELMethod extends ELTypedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELVariable> getParameters();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELMethod_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(ELBlock)
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELMethod_Block()
	 * @model containment="true"
	 * @generated
	 */
	ELBlock getBlock();

	/**
	 * Sets the value of the '{@link de.hub.rcore.example.el.ELMethod#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(ELBlock value);

} // ELMethod
