/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELModel;
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ExampleLanguagePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELModelImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELModelImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELModelImpl extends ELNamedElementImpl implements ELModel {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ELPackage> packages;

	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<ELOp> ops;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<ELBlockStarementKind> blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<ELPackage>(ELPackage.class, this, ExampleLanguagePackage.EL_MODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELOp> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<ELOp>(ELOp.class, this, ExampleLanguagePackage.EL_MODEL__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELBlockStarementKind> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<ELBlockStarementKind>(ELBlockStarementKind.class, this, ExampleLanguagePackage.EL_MODEL__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_MODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_MODEL__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_MODEL__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
			case ExampleLanguagePackage.EL_MODEL__PACKAGES:
				return getPackages();
			case ExampleLanguagePackage.EL_MODEL__OPS:
				return getOps();
			case ExampleLanguagePackage.EL_MODEL__BLOCKS:
				return getBlocks();
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
			case ExampleLanguagePackage.EL_MODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends ELPackage>)newValue);
				return;
			case ExampleLanguagePackage.EL_MODEL__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends ELOp>)newValue);
				return;
			case ExampleLanguagePackage.EL_MODEL__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends ELBlockStarementKind>)newValue);
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
			case ExampleLanguagePackage.EL_MODEL__PACKAGES:
				getPackages().clear();
				return;
			case ExampleLanguagePackage.EL_MODEL__OPS:
				getOps().clear();
				return;
			case ExampleLanguagePackage.EL_MODEL__BLOCKS:
				getBlocks().clear();
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
			case ExampleLanguagePackage.EL_MODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case ExampleLanguagePackage.EL_MODEL__OPS:
				return ops != null && !ops.isEmpty();
			case ExampleLanguagePackage.EL_MODEL__BLOCKS:
				return blocks != null && !blocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ELModelImpl
