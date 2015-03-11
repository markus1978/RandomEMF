/**
 */
package de.hub.rcore.example.el;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.rcore.example.el.ExampleLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ExampleLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "el";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.el/EL/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "el";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExampleLanguagePackage eINSTANCE = de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELNamedElementImpl <em>EL Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELNamedElementImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELNamedElement()
	 * @generated
	 */
	int EL_NAMED_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>EL Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EL Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELPackageImpl <em>EL Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELPackageImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPackage()
	 * @generated
	 */
	int EL_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PACKAGE__NAME = EL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PACKAGE__CLASSES = EL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EL Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PACKAGE_FEATURE_COUNT = EL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EL Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PACKAGE_OPERATION_COUNT = EL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELClassImpl <em>EL Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELClassImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELClass()
	 * @generated
	 */
	int EL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS__NAME = EL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS__METHODS = EL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS__FIELDS = EL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Clases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS__SUPER_CLASES = EL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inner Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS__INNER_CLASSES = EL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EL Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS_FEATURE_COUNT = EL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EL Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CLASS_OPERATION_COUNT = EL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELTypedElementImpl <em>EL Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELTypedElementImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELTypedElement()
	 * @generated
	 */
	int EL_TYPED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TYPED_ELEMENT__NAME = EL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TYPED_ELEMENT__TYPE = EL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TYPED_ELEMENT__ARRAY = EL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EL Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TYPED_ELEMENT_FEATURE_COUNT = EL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EL Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_TYPED_ELEMENT_OPERATION_COUNT = EL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELVariableImpl <em>EL Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELVariableImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELVariable()
	 * @generated
	 */
	int EL_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_VARIABLE__NAME = EL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_VARIABLE__TYPE = EL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_VARIABLE__ARRAY = EL_TYPED_ELEMENT__ARRAY;

	/**
	 * The number of structural features of the '<em>EL Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_VARIABLE_FEATURE_COUNT = EL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EL Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_VARIABLE_OPERATION_COUNT = EL_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELMethodImpl <em>EL Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELMethodImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELMethod()
	 * @generated
	 */
	int EL_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__NAME = EL_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__TYPE = EL_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__ARRAY = EL_TYPED_ELEMENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__PARAMETERS = EL_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__LOCAL_VARIABLES = EL_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD__BLOCK = EL_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EL Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD_FEATURE_COUNT = EL_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EL Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_METHOD_OPERATION_COUNT = EL_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELFieldImpl <em>EL Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELFieldImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELField()
	 * @generated
	 */
	int EL_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_FIELD__NAME = EL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_FIELD__TYPE = EL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_FIELD__ARRAY = EL_VARIABLE__ARRAY;

	/**
	 * The number of structural features of the '<em>EL Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_FIELD_FEATURE_COUNT = EL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EL Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_FIELD_OPERATION_COUNT = EL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELStatementImpl <em>EL Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELStatementImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELStatement()
	 * @generated
	 */
	int EL_STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>EL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELBlockImpl <em>EL Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELBlockImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlock()
	 * @generated
	 */
	int EL_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>EL Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EL Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELExpressionImpl <em>EL Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELExpressionImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELExpression()
	 * @generated
	 */
	int EL_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>EL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_EXPRESSION_FEATURE_COUNT = EL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_EXPRESSION_OPERATION_COUNT = EL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELLiteralImpl <em>EL Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELLiteralImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELLiteral()
	 * @generated
	 */
	int EL_LITERAL = 8;

	/**
	 * The number of structural features of the '<em>EL Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_LITERAL_FEATURE_COUNT = EL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EL Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_LITERAL_OPERATION_COUNT = EL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELCallImpl <em>EL Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELCallImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELCall()
	 * @generated
	 */
	int EL_CALL = 10;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CALL__ARGUMENTS = EL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CALL__CALLEE = EL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CALL__THIS_ARGUMENT = EL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EL Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CALL_FEATURE_COUNT = EL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EL Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_CALL_OPERATION_COUNT = EL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELOpCallImpl <em>EL Op Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELOpCallImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOpCall()
	 * @generated
	 */
	int EL_OP_CALL = 9;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_CALL__ARGUMENTS = EL_CALL__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_CALL__CALLEE = EL_CALL__CALLEE;

	/**
	 * The feature id for the '<em><b>This Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_CALL__THIS_ARGUMENT = EL_CALL__THIS_ARGUMENT;

	/**
	 * The number of structural features of the '<em>EL Op Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_CALL_FEATURE_COUNT = EL_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EL Op Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_CALL_OPERATION_COUNT = EL_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELAccessImpl <em>EL Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELAccessImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELAccess()
	 * @generated
	 */
	int EL_ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_ACCESS__VARIABLE = EL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EL Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_ACCESS_FEATURE_COUNT = EL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EL Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_ACCESS_OPERATION_COUNT = EL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELBlockStatementImpl <em>EL Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELBlockStatementImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlockStatement()
	 * @generated
	 */
	int EL_BLOCK_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STATEMENT__BLOCK = EL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STATEMENT__KIND = EL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STATEMENT__EXPRESSIONS = EL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EL Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STATEMENT_FEATURE_COUNT = EL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EL Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STATEMENT_OPERATION_COUNT = EL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELPredefinedImpl <em>EL Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELPredefinedImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPredefined()
	 * @generated
	 */
	int EL_PREDEFINED = 15;

	/**
	 * The number of structural features of the '<em>EL Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EL Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELOpImpl <em>EL Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELOpImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOp()
	 * @generated
	 */
	int EL_OP = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__NAME = EL_PREDEFINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__TYPE = EL_PREDEFINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__ARRAY = EL_PREDEFINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__PARAMETERS = EL_PREDEFINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__LOCAL_VARIABLES = EL_PREDEFINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__BLOCK = EL_PREDEFINED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__KIND = EL_PREDEFINED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__SYNTAX = EL_PREDEFINED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP__OPERATORS = EL_PREDEFINED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EL Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_FEATURE_COUNT = EL_PREDEFINED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>EL Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_OP_OPERATION_COUNT = EL_PREDEFINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELDataTypeImpl <em>EL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELDataTypeImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELDataType()
	 * @generated
	 */
	int EL_DATA_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE__NAME = EL_PREDEFINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE__METHODS = EL_PREDEFINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE__FIELDS = EL_PREDEFINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Clases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE__SUPER_CLASES = EL_PREDEFINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inner Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE__INNER_CLASSES = EL_PREDEFINED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE_FEATURE_COUNT = EL_PREDEFINED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>EL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_DATA_TYPE_OPERATION_COUNT = EL_PREDEFINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELPredefinedPackageImpl <em>EL Predefined Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELPredefinedPackageImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPredefinedPackage()
	 * @generated
	 */
	int EL_PREDEFINED_PACKAGE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_PACKAGE__NAME = EL_PREDEFINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_PACKAGE__CLASSES = EL_PREDEFINED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EL Predefined Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_PACKAGE_FEATURE_COUNT = EL_PREDEFINED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EL Predefined Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_PREDEFINED_PACKAGE_OPERATION_COUNT = EL_PREDEFINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELBlockStarementKindImpl <em>EL Block Starement Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELBlockStarementKindImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlockStarementKind()
	 * @generated
	 */
	int EL_BLOCK_STAREMENT_KIND = 19;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STAREMENT_KIND__SYNTAX = EL_PREDEFINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STAREMENT_KIND__BLOCKS = EL_PREDEFINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STAREMENT_KIND__EXPRESSIONS = EL_PREDEFINED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EL Block Starement Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STAREMENT_KIND_FEATURE_COUNT = EL_PREDEFINED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EL Block Starement Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_BLOCK_STAREMENT_KIND_OPERATION_COUNT = EL_PREDEFINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.impl.ELModelImpl <em>EL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.impl.ELModelImpl
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELModel()
	 * @generated
	 */
	int EL_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_MODEL__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>EL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.rcore.example.el.ELOpKind <em>EL Op Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.rcore.example.el.ELOpKind
	 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOpKind()
	 * @generated
	 */
	int EL_OP_KIND = 21;


	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELPackage <em>EL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Package</em>'.
	 * @see de.hub.rcore.example.el.ELPackage
	 * @generated
	 */
	EClass getELPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see de.hub.rcore.example.el.ELPackage#getClasses()
	 * @see #getELPackage()
	 * @generated
	 */
	EReference getELPackage_Classes();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELClass <em>EL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Class</em>'.
	 * @see de.hub.rcore.example.el.ELClass
	 * @generated
	 */
	EClass getELClass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.hub.rcore.example.el.ELClass#getMethods()
	 * @see #getELClass()
	 * @generated
	 */
	EReference getELClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.hub.rcore.example.el.ELClass#getFields()
	 * @see #getELClass()
	 * @generated
	 */
	EReference getELClass_Fields();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.rcore.example.el.ELClass#getSuperClases <em>Super Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Clases</em>'.
	 * @see de.hub.rcore.example.el.ELClass#getSuperClases()
	 * @see #getELClass()
	 * @generated
	 */
	EReference getELClass_SuperClases();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELClass#getInnerClasses <em>Inner Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Classes</em>'.
	 * @see de.hub.rcore.example.el.ELClass#getInnerClasses()
	 * @see #getELClass()
	 * @generated
	 */
	EReference getELClass_InnerClasses();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELVariable <em>EL Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Variable</em>'.
	 * @see de.hub.rcore.example.el.ELVariable
	 * @generated
	 */
	EClass getELVariable();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELMethod <em>EL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Method</em>'.
	 * @see de.hub.rcore.example.el.ELMethod
	 * @generated
	 */
	EClass getELMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.hub.rcore.example.el.ELMethod#getParameters()
	 * @see #getELMethod()
	 * @generated
	 */
	EReference getELMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELMethod#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see de.hub.rcore.example.el.ELMethod#getLocalVariables()
	 * @see #getELMethod()
	 * @generated
	 */
	EReference getELMethod_LocalVariables();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.rcore.example.el.ELMethod#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see de.hub.rcore.example.el.ELMethod#getBlock()
	 * @see #getELMethod()
	 * @generated
	 */
	EReference getELMethod_Block();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELField <em>EL Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Field</em>'.
	 * @see de.hub.rcore.example.el.ELField
	 * @generated
	 */
	EClass getELField();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELStatement <em>EL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Statement</em>'.
	 * @see de.hub.rcore.example.el.ELStatement
	 * @generated
	 */
	EClass getELStatement();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELBlock <em>EL Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Block</em>'.
	 * @see de.hub.rcore.example.el.ELBlock
	 * @generated
	 */
	EClass getELBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.hub.rcore.example.el.ELBlock#getStatements()
	 * @see #getELBlock()
	 * @generated
	 */
	EReference getELBlock_Statements();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELExpression <em>EL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Expression</em>'.
	 * @see de.hub.rcore.example.el.ELExpression
	 * @generated
	 */
	EClass getELExpression();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELLiteral <em>EL Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Literal</em>'.
	 * @see de.hub.rcore.example.el.ELLiteral
	 * @generated
	 */
	EClass getELLiteral();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELOpCall <em>EL Op Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Op Call</em>'.
	 * @see de.hub.rcore.example.el.ELOpCall
	 * @generated
	 */
	EClass getELOpCall();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELCall <em>EL Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Call</em>'.
	 * @see de.hub.rcore.example.el.ELCall
	 * @generated
	 */
	EClass getELCall();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see de.hub.rcore.example.el.ELCall#getArguments()
	 * @see #getELCall()
	 * @generated
	 */
	EReference getELCall_Arguments();

	/**
	 * Returns the meta object for the reference '{@link de.hub.rcore.example.el.ELCall#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see de.hub.rcore.example.el.ELCall#getCallee()
	 * @see #getELCall()
	 * @generated
	 */
	EReference getELCall_Callee();

	/**
	 * Returns the meta object for the reference '{@link de.hub.rcore.example.el.ELCall#getThisArgument <em>This Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Argument</em>'.
	 * @see de.hub.rcore.example.el.ELCall#getThisArgument()
	 * @see #getELCall()
	 * @generated
	 */
	EReference getELCall_ThisArgument();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELAccess <em>EL Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Access</em>'.
	 * @see de.hub.rcore.example.el.ELAccess
	 * @generated
	 */
	EClass getELAccess();

	/**
	 * Returns the meta object for the reference '{@link de.hub.rcore.example.el.ELAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.hub.rcore.example.el.ELAccess#getVariable()
	 * @see #getELAccess()
	 * @generated
	 */
	EReference getELAccess_Variable();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELBlockStatement <em>EL Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Block Statement</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStatement
	 * @generated
	 */
	EClass getELBlockStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELBlockStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStatement#getBlock()
	 * @see #getELBlockStatement()
	 * @generated
	 */
	EReference getELBlockStatement_Block();

	/**
	 * Returns the meta object for the reference '{@link de.hub.rcore.example.el.ELBlockStatement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStatement#getKind()
	 * @see #getELBlockStatement()
	 * @generated
	 */
	EReference getELBlockStatement_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.rcore.example.el.ELBlockStatement#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStatement#getExpressions()
	 * @see #getELBlockStatement()
	 * @generated
	 */
	EReference getELBlockStatement_Expressions();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELOp <em>EL Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Op</em>'.
	 * @see de.hub.rcore.example.el.ELOp
	 * @generated
	 */
	EClass getELOp();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELOp#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.hub.rcore.example.el.ELOp#getKind()
	 * @see #getELOp()
	 * @generated
	 */
	EAttribute getELOp_Kind();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELOp#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see de.hub.rcore.example.el.ELOp#getSyntax()
	 * @see #getELOp()
	 * @generated
	 */
	EAttribute getELOp_Syntax();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELOp#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operators</em>'.
	 * @see de.hub.rcore.example.el.ELOp#getOperators()
	 * @see #getELOp()
	 * @generated
	 */
	EAttribute getELOp_Operators();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELDataType <em>EL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Data Type</em>'.
	 * @see de.hub.rcore.example.el.ELDataType
	 * @generated
	 */
	EClass getELDataType();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELPredefined <em>EL Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Predefined</em>'.
	 * @see de.hub.rcore.example.el.ELPredefined
	 * @generated
	 */
	EClass getELPredefined();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELPredefinedPackage <em>EL Predefined Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Predefined Package</em>'.
	 * @see de.hub.rcore.example.el.ELPredefinedPackage
	 * @generated
	 */
	EClass getELPredefinedPackage();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELNamedElement <em>EL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Named Element</em>'.
	 * @see de.hub.rcore.example.el.ELNamedElement
	 * @generated
	 */
	EClass getELNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.rcore.example.el.ELNamedElement#getName()
	 * @see #getELNamedElement()
	 * @generated
	 */
	EAttribute getELNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELTypedElement <em>EL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Typed Element</em>'.
	 * @see de.hub.rcore.example.el.ELTypedElement
	 * @generated
	 */
	EClass getELTypedElement();

	/**
	 * Returns the meta object for the reference '{@link de.hub.rcore.example.el.ELTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.hub.rcore.example.el.ELTypedElement#getType()
	 * @see #getELTypedElement()
	 * @generated
	 */
	EReference getELTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELTypedElement#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see de.hub.rcore.example.el.ELTypedElement#isArray()
	 * @see #getELTypedElement()
	 * @generated
	 */
	EAttribute getELTypedElement_Array();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELBlockStarementKind <em>EL Block Starement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Block Starement Kind</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStarementKind
	 * @generated
	 */
	EClass getELBlockStarementKind();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELBlockStarementKind#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStarementKind#getSyntax()
	 * @see #getELBlockStarementKind()
	 * @generated
	 */
	EAttribute getELBlockStarementKind_Syntax();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELBlockStarementKind#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocks</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStarementKind#getBlocks()
	 * @see #getELBlockStarementKind()
	 * @generated
	 */
	EAttribute getELBlockStarementKind_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.rcore.example.el.ELBlockStarementKind#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expressions</em>'.
	 * @see de.hub.rcore.example.el.ELBlockStarementKind#getExpressions()
	 * @see #getELBlockStarementKind()
	 * @generated
	 */
	EAttribute getELBlockStarementKind_Expressions();

	/**
	 * Returns the meta object for class '{@link de.hub.rcore.example.el.ELModel <em>EL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EL Model</em>'.
	 * @see de.hub.rcore.example.el.ELModel
	 * @generated
	 */
	EClass getELModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.rcore.example.el.ELModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.hub.rcore.example.el.ELModel#getPackages()
	 * @see #getELModel()
	 * @generated
	 */
	EReference getELModel_Packages();

	/**
	 * Returns the meta object for enum '{@link de.hub.rcore.example.el.ELOpKind <em>EL Op Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EL Op Kind</em>'.
	 * @see de.hub.rcore.example.el.ELOpKind
	 * @generated
	 */
	EEnum getELOpKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleLanguageFactory getExampleLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELPackageImpl <em>EL Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELPackageImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPackage()
		 * @generated
		 */
		EClass EL_PACKAGE = eINSTANCE.getELPackage();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_PACKAGE__CLASSES = eINSTANCE.getELPackage_Classes();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELClassImpl <em>EL Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELClassImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELClass()
		 * @generated
		 */
		EClass EL_CLASS = eINSTANCE.getELClass();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CLASS__METHODS = eINSTANCE.getELClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CLASS__FIELDS = eINSTANCE.getELClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Super Clases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CLASS__SUPER_CLASES = eINSTANCE.getELClass_SuperClases();

		/**
		 * The meta object literal for the '<em><b>Inner Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CLASS__INNER_CLASSES = eINSTANCE.getELClass_InnerClasses();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELVariableImpl <em>EL Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELVariableImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELVariable()
		 * @generated
		 */
		EClass EL_VARIABLE = eINSTANCE.getELVariable();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELMethodImpl <em>EL Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELMethodImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELMethod()
		 * @generated
		 */
		EClass EL_METHOD = eINSTANCE.getELMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_METHOD__PARAMETERS = eINSTANCE.getELMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_METHOD__LOCAL_VARIABLES = eINSTANCE.getELMethod_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_METHOD__BLOCK = eINSTANCE.getELMethod_Block();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELFieldImpl <em>EL Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELFieldImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELField()
		 * @generated
		 */
		EClass EL_FIELD = eINSTANCE.getELField();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELStatementImpl <em>EL Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELStatementImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELStatement()
		 * @generated
		 */
		EClass EL_STATEMENT = eINSTANCE.getELStatement();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELBlockImpl <em>EL Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELBlockImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlock()
		 * @generated
		 */
		EClass EL_BLOCK = eINSTANCE.getELBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_BLOCK__STATEMENTS = eINSTANCE.getELBlock_Statements();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELExpressionImpl <em>EL Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELExpressionImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELExpression()
		 * @generated
		 */
		EClass EL_EXPRESSION = eINSTANCE.getELExpression();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELLiteralImpl <em>EL Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELLiteralImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELLiteral()
		 * @generated
		 */
		EClass EL_LITERAL = eINSTANCE.getELLiteral();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELOpCallImpl <em>EL Op Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELOpCallImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOpCall()
		 * @generated
		 */
		EClass EL_OP_CALL = eINSTANCE.getELOpCall();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELCallImpl <em>EL Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELCallImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELCall()
		 * @generated
		 */
		EClass EL_CALL = eINSTANCE.getELCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CALL__ARGUMENTS = eINSTANCE.getELCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CALL__CALLEE = eINSTANCE.getELCall_Callee();

		/**
		 * The meta object literal for the '<em><b>This Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_CALL__THIS_ARGUMENT = eINSTANCE.getELCall_ThisArgument();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELAccessImpl <em>EL Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELAccessImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELAccess()
		 * @generated
		 */
		EClass EL_ACCESS = eINSTANCE.getELAccess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_ACCESS__VARIABLE = eINSTANCE.getELAccess_Variable();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELBlockStatementImpl <em>EL Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELBlockStatementImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlockStatement()
		 * @generated
		 */
		EClass EL_BLOCK_STATEMENT = eINSTANCE.getELBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_BLOCK_STATEMENT__BLOCK = eINSTANCE.getELBlockStatement_Block();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_BLOCK_STATEMENT__KIND = eINSTANCE.getELBlockStatement_Kind();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_BLOCK_STATEMENT__EXPRESSIONS = eINSTANCE.getELBlockStatement_Expressions();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELOpImpl <em>EL Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELOpImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOp()
		 * @generated
		 */
		EClass EL_OP = eINSTANCE.getELOp();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_OP__KIND = eINSTANCE.getELOp_Kind();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_OP__SYNTAX = eINSTANCE.getELOp_Syntax();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_OP__OPERATORS = eINSTANCE.getELOp_Operators();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELDataTypeImpl <em>EL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELDataTypeImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELDataType()
		 * @generated
		 */
		EClass EL_DATA_TYPE = eINSTANCE.getELDataType();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELPredefinedImpl <em>EL Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELPredefinedImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPredefined()
		 * @generated
		 */
		EClass EL_PREDEFINED = eINSTANCE.getELPredefined();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELPredefinedPackageImpl <em>EL Predefined Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELPredefinedPackageImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELPredefinedPackage()
		 * @generated
		 */
		EClass EL_PREDEFINED_PACKAGE = eINSTANCE.getELPredefinedPackage();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELNamedElementImpl <em>EL Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELNamedElementImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELNamedElement()
		 * @generated
		 */
		EClass EL_NAMED_ELEMENT = eINSTANCE.getELNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_NAMED_ELEMENT__NAME = eINSTANCE.getELNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELTypedElementImpl <em>EL Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELTypedElementImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELTypedElement()
		 * @generated
		 */
		EClass EL_TYPED_ELEMENT = eINSTANCE.getELTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_TYPED_ELEMENT__TYPE = eINSTANCE.getELTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_TYPED_ELEMENT__ARRAY = eINSTANCE.getELTypedElement_Array();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELBlockStarementKindImpl <em>EL Block Starement Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELBlockStarementKindImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELBlockStarementKind()
		 * @generated
		 */
		EClass EL_BLOCK_STAREMENT_KIND = eINSTANCE.getELBlockStarementKind();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_BLOCK_STAREMENT_KIND__SYNTAX = eINSTANCE.getELBlockStarementKind_Syntax();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_BLOCK_STAREMENT_KIND__BLOCKS = eINSTANCE.getELBlockStarementKind_Blocks();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EL_BLOCK_STAREMENT_KIND__EXPRESSIONS = eINSTANCE.getELBlockStarementKind_Expressions();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.impl.ELModelImpl <em>EL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.impl.ELModelImpl
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELModel()
		 * @generated
		 */
		EClass EL_MODEL = eINSTANCE.getELModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EL_MODEL__PACKAGES = eINSTANCE.getELModel_Packages();

		/**
		 * The meta object literal for the '{@link de.hub.rcore.example.el.ELOpKind <em>EL Op Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.rcore.example.el.ELOpKind
		 * @see de.hub.rcore.example.el.impl.ExampleLanguagePackageImpl#getELOpKind()
		 * @generated
		 */
		EEnum EL_OP_KIND = eINSTANCE.getELOpKind();

	}

} //ExampleLanguagePackage
