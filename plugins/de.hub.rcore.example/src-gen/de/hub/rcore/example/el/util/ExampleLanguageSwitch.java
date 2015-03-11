/**
 */
package de.hub.rcore.example.el.util;

import de.hub.rcore.example.el.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.hub.rcore.example.el.ELAccess;
import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELBlockStatement;
import de.hub.rcore.example.el.ELCall;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELDataType;
import de.hub.rcore.example.el.ELExpression;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELLiteral;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELNamedElement;
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpCall;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ELPredefined;
import de.hub.rcore.example.el.ELPredefinedPackage;
import de.hub.rcore.example.el.ELStatement;
import de.hub.rcore.example.el.ELTypedElement;
import de.hub.rcore.example.el.ELVariable;
import de.hub.rcore.example.el.ExampleLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.rcore.example.el.ExampleLanguagePackage
 * @generated
 */
public class ExampleLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExampleLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = ExampleLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExampleLanguagePackage.EL_PACKAGE: {
				ELPackage elPackage = (ELPackage)theEObject;
				T result = caseELPackage(elPackage);
				if (result == null) result = caseELNamedElement(elPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_CLASS: {
				ELClass elClass = (ELClass)theEObject;
				T result = caseELClass(elClass);
				if (result == null) result = caseELNamedElement(elClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_VARIABLE: {
				ELVariable elVariable = (ELVariable)theEObject;
				T result = caseELVariable(elVariable);
				if (result == null) result = caseELTypedElement(elVariable);
				if (result == null) result = caseELNamedElement(elVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_METHOD: {
				ELMethod elMethod = (ELMethod)theEObject;
				T result = caseELMethod(elMethod);
				if (result == null) result = caseELTypedElement(elMethod);
				if (result == null) result = caseELNamedElement(elMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_FIELD: {
				ELField elField = (ELField)theEObject;
				T result = caseELField(elField);
				if (result == null) result = caseELVariable(elField);
				if (result == null) result = caseELTypedElement(elField);
				if (result == null) result = caseELNamedElement(elField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_STATEMENT: {
				ELStatement elStatement = (ELStatement)theEObject;
				T result = caseELStatement(elStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_BLOCK: {
				ELBlock elBlock = (ELBlock)theEObject;
				T result = caseELBlock(elBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_EXPRESSION: {
				ELExpression elExpression = (ELExpression)theEObject;
				T result = caseELExpression(elExpression);
				if (result == null) result = caseELStatement(elExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_LITERAL: {
				ELLiteral elLiteral = (ELLiteral)theEObject;
				T result = caseELLiteral(elLiteral);
				if (result == null) result = caseELExpression(elLiteral);
				if (result == null) result = caseELStatement(elLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_OP_CALL: {
				ELOpCall elOpCall = (ELOpCall)theEObject;
				T result = caseELOpCall(elOpCall);
				if (result == null) result = caseELCall(elOpCall);
				if (result == null) result = caseELExpression(elOpCall);
				if (result == null) result = caseELStatement(elOpCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_CALL: {
				ELCall elCall = (ELCall)theEObject;
				T result = caseELCall(elCall);
				if (result == null) result = caseELExpression(elCall);
				if (result == null) result = caseELStatement(elCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_ACCESS: {
				ELAccess elAccess = (ELAccess)theEObject;
				T result = caseELAccess(elAccess);
				if (result == null) result = caseELExpression(elAccess);
				if (result == null) result = caseELStatement(elAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT: {
				ELBlockStatement elBlockStatement = (ELBlockStatement)theEObject;
				T result = caseELBlockStatement(elBlockStatement);
				if (result == null) result = caseELStatement(elBlockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_OP: {
				ELOp elOp = (ELOp)theEObject;
				T result = caseELOp(elOp);
				if (result == null) result = caseELPredefined(elOp);
				if (result == null) result = caseELMethod(elOp);
				if (result == null) result = caseELTypedElement(elOp);
				if (result == null) result = caseELNamedElement(elOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_DATA_TYPE: {
				ELDataType elDataType = (ELDataType)theEObject;
				T result = caseELDataType(elDataType);
				if (result == null) result = caseELPredefined(elDataType);
				if (result == null) result = caseELClass(elDataType);
				if (result == null) result = caseELNamedElement(elDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_PREDEFINED: {
				ELPredefined elPredefined = (ELPredefined)theEObject;
				T result = caseELPredefined(elPredefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_PREDEFINED_PACKAGE: {
				ELPredefinedPackage elPredefinedPackage = (ELPredefinedPackage)theEObject;
				T result = caseELPredefinedPackage(elPredefinedPackage);
				if (result == null) result = caseELPredefined(elPredefinedPackage);
				if (result == null) result = caseELPackage(elPredefinedPackage);
				if (result == null) result = caseELNamedElement(elPredefinedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_NAMED_ELEMENT: {
				ELNamedElement elNamedElement = (ELNamedElement)theEObject;
				T result = caseELNamedElement(elNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_TYPED_ELEMENT: {
				ELTypedElement elTypedElement = (ELTypedElement)theEObject;
				T result = caseELTypedElement(elTypedElement);
				if (result == null) result = caseELNamedElement(elTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND: {
				ELBlockStarementKind elBlockStarementKind = (ELBlockStarementKind)theEObject;
				T result = caseELBlockStarementKind(elBlockStarementKind);
				if (result == null) result = caseELPredefined(elBlockStarementKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExampleLanguagePackage.EL_MODEL: {
				ELModel elModel = (ELModel)theEObject;
				T result = caseELModel(elModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELPackage(ELPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELClass(ELClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELVariable(ELVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELMethod(ELMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELField(ELField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELStatement(ELStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELBlock(ELBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELExpression(ELExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELLiteral(ELLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Op Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Op Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELOpCall(ELOpCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELCall(ELCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELAccess(ELAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELBlockStatement(ELBlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELOp(ELOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELDataType(ELDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Predefined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Predefined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELPredefined(ELPredefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Predefined Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Predefined Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELPredefinedPackage(ELPredefinedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELNamedElement(ELNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELTypedElement(ELTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Block Starement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Block Starement Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELBlockStarementKind(ELBlockStarementKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELModel(ELModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExampleLanguageSwitch
