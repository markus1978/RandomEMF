/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.rcore.example.el.ExampleLanguagePackage
 * @generated
 */
public interface ExampleLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExampleLanguageFactory eINSTANCE = de.hub.rcore.example.el.impl.ExampleLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EL Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Package</em>'.
	 * @generated
	 */
	ELPackage createELPackage();

	/**
	 * Returns a new object of class '<em>EL Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Class</em>'.
	 * @generated
	 */
	ELClass createELClass();

	/**
	 * Returns a new object of class '<em>EL Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Variable</em>'.
	 * @generated
	 */
	ELVariable createELVariable();

	/**
	 * Returns a new object of class '<em>EL Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Method</em>'.
	 * @generated
	 */
	ELMethod createELMethod();

	/**
	 * Returns a new object of class '<em>EL Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Field</em>'.
	 * @generated
	 */
	ELField createELField();

	/**
	 * Returns a new object of class '<em>EL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Statement</em>'.
	 * @generated
	 */
	ELStatement createELStatement();

	/**
	 * Returns a new object of class '<em>EL Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Block</em>'.
	 * @generated
	 */
	ELBlock createELBlock();

	/**
	 * Returns a new object of class '<em>EL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Expression</em>'.
	 * @generated
	 */
	ELExpression createELExpression();

	/**
	 * Returns a new object of class '<em>EL Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Literal</em>'.
	 * @generated
	 */
	ELLiteral createELLiteral();

	/**
	 * Returns a new object of class '<em>EL Op Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Op Call</em>'.
	 * @generated
	 */
	ELOpCall createELOpCall();

	/**
	 * Returns a new object of class '<em>EL Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Call</em>'.
	 * @generated
	 */
	ELCall createELCall();

	/**
	 * Returns a new object of class '<em>EL Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Access</em>'.
	 * @generated
	 */
	ELAccess createELAccess();

	/**
	 * Returns a new object of class '<em>EL Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Block Statement</em>'.
	 * @generated
	 */
	ELBlockStatement createELBlockStatement();

	/**
	 * Returns a new object of class '<em>EL Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Op</em>'.
	 * @generated
	 */
	ELOp createELOp();

	/**
	 * Returns a new object of class '<em>EL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Data Type</em>'.
	 * @generated
	 */
	ELDataType createELDataType();

	/**
	 * Returns a new object of class '<em>EL Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Named Element</em>'.
	 * @generated
	 */
	ELNamedElement createELNamedElement();

	/**
	 * Returns a new object of class '<em>EL Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Typed Element</em>'.
	 * @generated
	 */
	ELTypedElement createELTypedElement();

	/**
	 * Returns a new object of class '<em>EL Block Starement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Block Starement Kind</em>'.
	 * @generated
	 */
	ELBlockStarementKind createELBlockStarementKind();

	/**
	 * Returns a new object of class '<em>EL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Model</em>'.
	 * @generated
	 */
	ELModel createELModel();

	/**
	 * Returns a new object of class '<em>EL Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Assignment</em>'.
	 * @generated
	 */
	ELAssignment createELAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExampleLanguagePackage getExampleLanguagePackage();

} //ExampleLanguageFactory
