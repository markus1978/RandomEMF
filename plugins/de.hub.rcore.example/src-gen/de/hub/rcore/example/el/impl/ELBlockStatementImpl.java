/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELBlockStatement;
import de.hub.rcore.example.el.ELExpression;
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
 * An implementation of the model object '<em><b>EL Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStatementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStatementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELBlockStatementImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELBlockStatementImpl extends ELStatementImpl implements ELBlockStatement {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<ELBlock> block;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ELBlockStarementKind kind;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected ELExpression expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELBlockStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_BLOCK_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELBlock> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<ELBlock>(ELBlock.class, this, ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlockStarementKind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (ELBlockStarementKind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlockStarementKind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ELBlockStarementKind newKind) {
		ELBlockStarementKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELExpression getExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressions(ELExpression newExpressions, NotificationChain msgs) {
		ELExpression oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS, oldExpressions, newExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressions(ELExpression newExpressions) {
		if (newExpressions != expressions) {
			NotificationChain msgs = null;
			if (expressions != null)
				msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS, null, msgs);
			if (newExpressions != null)
				msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS, null, msgs);
			msgs = basicSetExpressions(newExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS, newExpressions, newExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS:
				return basicSetExpressions(null, msgs);
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
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK:
				return getBlock();
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS:
				return getExpressions();
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
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends ELBlock>)newValue);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND:
				setKind((ELBlockStarementKind)newValue);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS:
				setExpressions((ELExpression)newValue);
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
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK:
				getBlock().clear();
				return;
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND:
				setKind((ELBlockStarementKind)null);
				return;
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS:
				setExpressions((ELExpression)null);
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
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__BLOCK:
				return block != null && !block.isEmpty();
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__KIND:
				return kind != null;
			case ExampleLanguagePackage.EL_BLOCK_STATEMENT__EXPRESSIONS:
				return expressions != null;
		}
		return super.eIsSet(featureID);
	}

} //ELBlockStatementImpl
