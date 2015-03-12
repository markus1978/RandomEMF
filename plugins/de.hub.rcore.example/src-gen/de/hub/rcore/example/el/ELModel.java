/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.ELModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELModel#getOps <em>Ops</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.ELModel#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELModel()
 * @model
 * @generated
 */
public interface ELModel extends ELNamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELModel_Ops()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELOp> getOps();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.rcore.example.el.ELBlockStarementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#getELModel_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELBlockStarementKind> getBlocks();

} // ELModel
