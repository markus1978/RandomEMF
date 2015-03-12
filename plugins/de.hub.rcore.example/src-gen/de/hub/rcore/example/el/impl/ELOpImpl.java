/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpKind;
import de.hub.rcore.example.el.ExampleLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getPrecedence <em>Precedence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELOpImpl extends MinimalEObjectImpl.Container implements ELOp {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ELOpKind KIND_EDEFAULT = ELOpKind.INFIX;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ELOpKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyntax() <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected String syntax = SYNTAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperands() <em>Operands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERANDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected int operands = OPERANDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecedence() <em>Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECEDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected int precedence = PRECEDENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOpKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ELOpKind newKind) {
		ELOpKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntax() {
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntax(String newSyntax) {
		String oldSyntax = syntax;
		syntax = newSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__SYNTAX, oldSyntax, syntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperands() {
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperands(int newOperands) {
		int oldOperands = operands;
		operands = newOperands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__OPERANDS, oldOperands, operands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(int newPrecedence) {
		int oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__PRECEDENCE, oldPrecedence, precedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_OP__KIND:
				return getKind();
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				return getSyntax();
			case ExampleLanguagePackage.EL_OP__OPERANDS:
				return getOperands();
			case ExampleLanguagePackage.EL_OP__PRECEDENCE:
				return getPrecedence();
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
			case ExampleLanguagePackage.EL_OP__KIND:
				setKind((ELOpKind)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				setSyntax((String)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__OPERANDS:
				setOperands((Integer)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__PRECEDENCE:
				setPrecedence((Integer)newValue);
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
			case ExampleLanguagePackage.EL_OP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				setSyntax(SYNTAX_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__OPERANDS:
				setOperands(OPERANDS_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__PRECEDENCE:
				setPrecedence(PRECEDENCE_EDEFAULT);
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
			case ExampleLanguagePackage.EL_OP__KIND:
				return kind != KIND_EDEFAULT;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				return SYNTAX_EDEFAULT == null ? syntax != null : !SYNTAX_EDEFAULT.equals(syntax);
			case ExampleLanguagePackage.EL_OP__OPERANDS:
				return operands != OPERANDS_EDEFAULT;
			case ExampleLanguagePackage.EL_OP__PRECEDENCE:
				return precedence != PRECEDENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", syntax: ");
		result.append(syntax);
		result.append(", operands: ");
		result.append(operands);
		result.append(", precedence: ");
		result.append(precedence);
		result.append(')');
		return result.toString();
	}

} //ELOpImpl
