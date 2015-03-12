/**
 */
package de.hub.rcore.example.el.util;

import de.hub.rcore.example.el.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.rcore.example.el.ExampleLanguagePackage
 * @generated
 */
public class ExampleLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExampleLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExampleLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleLanguageSwitch<Adapter> modelSwitch =
		new ExampleLanguageSwitch<Adapter>() {
			@Override
			public Adapter caseELPackage(ELPackage object) {
				return createELPackageAdapter();
			}
			@Override
			public Adapter caseELClass(ELClass object) {
				return createELClassAdapter();
			}
			@Override
			public Adapter caseELVariable(ELVariable object) {
				return createELVariableAdapter();
			}
			@Override
			public Adapter caseELMethod(ELMethod object) {
				return createELMethodAdapter();
			}
			@Override
			public Adapter caseELField(ELField object) {
				return createELFieldAdapter();
			}
			@Override
			public Adapter caseELStatement(ELStatement object) {
				return createELStatementAdapter();
			}
			@Override
			public Adapter caseELBlock(ELBlock object) {
				return createELBlockAdapter();
			}
			@Override
			public Adapter caseELExpression(ELExpression object) {
				return createELExpressionAdapter();
			}
			@Override
			public Adapter caseELLiteral(ELLiteral object) {
				return createELLiteralAdapter();
			}
			@Override
			public Adapter caseELOpCall(ELOpCall object) {
				return createELOpCallAdapter();
			}
			@Override
			public Adapter caseELCall(ELCall object) {
				return createELCallAdapter();
			}
			@Override
			public Adapter caseELAccess(ELAccess object) {
				return createELAccessAdapter();
			}
			@Override
			public Adapter caseELBlockStatement(ELBlockStatement object) {
				return createELBlockStatementAdapter();
			}
			@Override
			public Adapter caseELOp(ELOp object) {
				return createELOpAdapter();
			}
			@Override
			public Adapter caseELDataType(ELDataType object) {
				return createELDataTypeAdapter();
			}
			@Override
			public Adapter caseELNamedElement(ELNamedElement object) {
				return createELNamedElementAdapter();
			}
			@Override
			public Adapter caseELTypedElement(ELTypedElement object) {
				return createELTypedElementAdapter();
			}
			@Override
			public Adapter caseELBlockStarementKind(ELBlockStarementKind object) {
				return createELBlockStarementKindAdapter();
			}
			@Override
			public Adapter caseELModel(ELModel object) {
				return createELModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELPackage <em>EL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELPackage
	 * @generated
	 */
	public Adapter createELPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELClass <em>EL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELClass
	 * @generated
	 */
	public Adapter createELClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELVariable <em>EL Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELVariable
	 * @generated
	 */
	public Adapter createELVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELMethod <em>EL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELMethod
	 * @generated
	 */
	public Adapter createELMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELField <em>EL Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELField
	 * @generated
	 */
	public Adapter createELFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELStatement <em>EL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELStatement
	 * @generated
	 */
	public Adapter createELStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELBlock <em>EL Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELBlock
	 * @generated
	 */
	public Adapter createELBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELExpression <em>EL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELExpression
	 * @generated
	 */
	public Adapter createELExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELLiteral <em>EL Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELLiteral
	 * @generated
	 */
	public Adapter createELLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELOpCall <em>EL Op Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELOpCall
	 * @generated
	 */
	public Adapter createELOpCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELCall <em>EL Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELCall
	 * @generated
	 */
	public Adapter createELCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELAccess <em>EL Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELAccess
	 * @generated
	 */
	public Adapter createELAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELBlockStatement <em>EL Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELBlockStatement
	 * @generated
	 */
	public Adapter createELBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELOp <em>EL Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELOp
	 * @generated
	 */
	public Adapter createELOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELDataType <em>EL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELDataType
	 * @generated
	 */
	public Adapter createELDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELNamedElement <em>EL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELNamedElement
	 * @generated
	 */
	public Adapter createELNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELTypedElement <em>EL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELTypedElement
	 * @generated
	 */
	public Adapter createELTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELBlockStarementKind <em>EL Block Starement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELBlockStarementKind
	 * @generated
	 */
	public Adapter createELBlockStarementKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.rcore.example.el.ELModel <em>EL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.rcore.example.el.ELModel
	 * @generated
	 */
	public Adapter createELModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExampleLanguageAdapterFactory
