/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExampleLanguageFactoryImpl extends EFactoryImpl implements ExampleLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExampleLanguageFactory init() {
		try {
			ExampleLanguageFactory theExampleLanguageFactory = (ExampleLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(ExampleLanguagePackage.eNS_URI);
			if (theExampleLanguageFactory != null) {
				return theExampleLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExampleLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExampleLanguagePackage.EL_PACKAGE: return createELPackage();
			case ExampleLanguagePackage.EL_CLASS: return createELClass();
			case ExampleLanguagePackage.EL_VARIABLE: return createELVariable();
			case ExampleLanguagePackage.EL_METHOD: return createELMethod();
			case ExampleLanguagePackage.EL_FIELD: return createELField();
			case ExampleLanguagePackage.EL_STATEMENT: return createELStatement();
			case ExampleLanguagePackage.EL_BLOCK: return createELBlock();
			case ExampleLanguagePackage.EL_EXPRESSION: return createELExpression();
			case ExampleLanguagePackage.EL_LITERAL: return createELLiteral();
			case ExampleLanguagePackage.EL_OP_CALL: return createELOpCall();
			case ExampleLanguagePackage.EL_CALL: return createELCall();
			case ExampleLanguagePackage.EL_ACCESS: return createELAccess();
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT: return createELBlockStatement();
			case ExampleLanguagePackage.EL_OP: return createELOp();
			case ExampleLanguagePackage.EL_DATA_TYPE: return createELDataType();
			case ExampleLanguagePackage.EL_PREDEFINED: return createELPredefined();
			case ExampleLanguagePackage.EL_PREDEFINED_PACKAGE: return createELPredefinedPackage();
			case ExampleLanguagePackage.EL_NAMED_ELEMENT: return createELNamedElement();
			case ExampleLanguagePackage.EL_TYPED_ELEMENT: return createELTypedElement();
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND: return createELBlockStarementKind();
			case ExampleLanguagePackage.EL_MODEL: return createELModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExampleLanguagePackage.EL_OP_KIND:
				return createELOpKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExampleLanguagePackage.EL_OP_KIND:
				return convertELOpKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELPackage createELPackage() {
		ELPackageImpl elPackage = new ELPackageImpl();
		return elPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELClass createELClass() {
		ELClassImpl elClass = new ELClassImpl();
		return elClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELVariable createELVariable() {
		ELVariableImpl elVariable = new ELVariableImpl();
		return elVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELMethod createELMethod() {
		ELMethodImpl elMethod = new ELMethodImpl();
		return elMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELField createELField() {
		ELFieldImpl elField = new ELFieldImpl();
		return elField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELStatement createELStatement() {
		ELStatementImpl elStatement = new ELStatementImpl();
		return elStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlock createELBlock() {
		ELBlockImpl elBlock = new ELBlockImpl();
		return elBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELExpression createELExpression() {
		ELExpressionImpl elExpression = new ELExpressionImpl();
		return elExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELLiteral createELLiteral() {
		ELLiteralImpl elLiteral = new ELLiteralImpl();
		return elLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOpCall createELOpCall() {
		ELOpCallImpl elOpCall = new ELOpCallImpl();
		return elOpCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELCall createELCall() {
		ELCallImpl elCall = new ELCallImpl();
		return elCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELAccess createELAccess() {
		ELAccessImpl elAccess = new ELAccessImpl();
		return elAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlockStatement createELBlockStatement() {
		ELBlockStatementImpl elBlockStatement = new ELBlockStatementImpl();
		return elBlockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOp createELOp() {
		ELOpImpl elOp = new ELOpImpl();
		return elOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELDataType createELDataType() {
		ELDataTypeImpl elDataType = new ELDataTypeImpl();
		return elDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELPredefined createELPredefined() {
		ELPredefinedImpl elPredefined = new ELPredefinedImpl();
		return elPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELPredefinedPackage createELPredefinedPackage() {
		ELPredefinedPackageImpl elPredefinedPackage = new ELPredefinedPackageImpl();
		return elPredefinedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELNamedElement createELNamedElement() {
		ELNamedElementImpl elNamedElement = new ELNamedElementImpl();
		return elNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELTypedElement createELTypedElement() {
		ELTypedElementImpl elTypedElement = new ELTypedElementImpl();
		return elTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlockStarementKind createELBlockStarementKind() {
		ELBlockStarementKindImpl elBlockStarementKind = new ELBlockStarementKindImpl();
		return elBlockStarementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELModel createELModel() {
		ELModelImpl elModel = new ELModelImpl();
		return elModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOpKind createELOpKindFromString(EDataType eDataType, String initialValue) {
		ELOpKind result = ELOpKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELOpKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleLanguagePackage getExampleLanguagePackage() {
		return (ExampleLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExampleLanguagePackage getPackage() {
		return ExampleLanguagePackage.eINSTANCE;
	}

} //ExampleLanguageFactoryImpl
