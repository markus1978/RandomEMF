/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELCall;
import de.hub.rcore.example.el.ELExpression;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ExampleLanguagePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELCallImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELCallImpl#getThisArgument <em>This Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELCallImpl extends ELExpressionImpl implements ELCall {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ELExpression> arguments;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected ELMethod callee;

	/**
	 * The cached value of the '{@link #getThisArgument() <em>This Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThisArgument()
	 * @generated
	 * @ordered
	 */
	protected ELExpression thisArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELExpression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<ELExpression>(ELExpression.class, this, ExampleLanguagePackage.EL_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELMethod getCallee() {
		if (callee != null && callee.eIsProxy()) {
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (ELMethod)eResolveProxy(oldCallee);
			if (callee != oldCallee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExampleLanguagePackage.EL_CALL__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELMethod basicGetCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(ELMethod newCallee) {
		ELMethod oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_CALL__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELExpression getThisArgument() {
		if (thisArgument != null && thisArgument.eIsProxy()) {
			InternalEObject oldThisArgument = (InternalEObject)thisArgument;
			thisArgument = (ELExpression)eResolveProxy(oldThisArgument);
			if (thisArgument != oldThisArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT, oldThisArgument, thisArgument));
			}
		}
		return thisArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELExpression basicGetThisArgument() {
		return thisArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThisArgument(ELExpression newThisArgument) {
		ELExpression oldThisArgument = thisArgument;
		thisArgument = newThisArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT, oldThisArgument, thisArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_CALL__ARGUMENTS:
				return getArguments();
			case ExampleLanguagePackage.EL_CALL__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT:
				if (resolve) return getThisArgument();
				return basicGetThisArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends ELExpression>)newValue);
				return;
			case ExampleLanguagePackage.EL_CALL__CALLEE:
				setCallee((ELMethod)newValue);
				return;
			case ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT:
				setThisArgument((ELExpression)newValue);
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
			case ExampleLanguagePackage.EL_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case ExampleLanguagePackage.EL_CALL__CALLEE:
				setCallee((ELMethod)null);
				return;
			case ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT:
				setThisArgument((ELExpression)null);
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
			case ExampleLanguagePackage.EL_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case ExampleLanguagePackage.EL_CALL__CALLEE:
				return callee != null;
			case ExampleLanguagePackage.EL_CALL__THIS_ARGUMENT:
				return thisArgument != null;
		}
		return super.eIsSet(featureID);
	}

} //ELCallImpl
