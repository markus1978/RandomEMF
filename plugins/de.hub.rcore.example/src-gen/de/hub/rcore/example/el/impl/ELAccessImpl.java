/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELAccess;
import de.hub.rcore.example.el.ELVariable;
import de.hub.rcore.example.el.ExampleLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELAccessImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELAccessImpl extends ELExpressionImpl implements ELAccess {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ELVariable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELVariable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (ELVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExampleLanguagePackage.EL_ACCESS__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(ELVariable newVariable) {
		ELVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_ACCESS__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_ACCESS__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_ACCESS__VARIABLE:
				setVariable((ELVariable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_ACCESS__VARIABLE:
				setVariable((ELVariable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_ACCESS__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //ELAccessImpl
