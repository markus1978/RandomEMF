/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ExampleLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Block Starement Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStarementKindImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStarementKindImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStarementKindImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELBlockStarementKindImpl extends MinimalEObjectImpl.Container implements ELBlockStarementKind {
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
	 * The default value of the '{@link #getBlocks() <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected int blocks = BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressions() <em>Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPRESSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected int expressions = EXPRESSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELBlockStarementKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_BLOCK_STAREMENT_KIND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__SYNTAX, oldSyntax, syntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlocks() {
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocks(int newBlocks) {
		int oldBlocks = blocks;
		blocks = newBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__BLOCKS, oldBlocks, blocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressions(int newExpressions) {
		int oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__EXPRESSIONS, oldExpressions, expressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__SYNTAX:
				return getSyntax();
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__BLOCKS:
				return getBlocks();
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__EXPRESSIONS:
				return getExpressions();
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
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__SYNTAX:
				setSyntax((String)newValue);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__BLOCKS:
				setBlocks((Integer)newValue);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__EXPRESSIONS:
				setExpressions((Integer)newValue);
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
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__SYNTAX:
				setSyntax(SYNTAX_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__BLOCKS:
				setBlocks(BLOCKS_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__EXPRESSIONS:
				setExpressions(EXPRESSIONS_EDEFAULT);
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
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__SYNTAX:
				return SYNTAX_EDEFAULT == null ? syntax != null : !SYNTAX_EDEFAULT.equals(syntax);
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__BLOCKS:
				return blocks != BLOCKS_EDEFAULT;
			case ExampleLanguagePackage.EL_BLOCK_STAREMENT_KIND__EXPRESSIONS:
				return expressions != EXPRESSIONS_EDEFAULT;
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
		result.append(" (syntax: ");
		result.append(syntax);
		result.append(", blocks: ");
		result.append(blocks);
		result.append(", expressions: ");
		result.append(expressions);
		result.append(')');
		return result.toString();
	}

} //ELBlockStarementKindImpl
