/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ExampleLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELClassImpl#getSuperClases <em>Super Clases</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELClassImpl#getInnerClasses <em>Inner Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELClassImpl extends ELNamedElementImpl implements ELClass {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<ELMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ELField> fields;

	/**
	 * The cached value of the '{@link #getSuperClases() <em>Super Clases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClases()
	 * @generated
	 * @ordered
	 */
	protected EList<ELClass> superClases;

	/**
	 * The cached value of the '{@link #getInnerClasses() <em>Inner Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ELClass> innerClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<ELMethod>(ELMethod.class, this, ExampleLanguagePackage.EL_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<ELField>(ELField.class, this, ExampleLanguagePackage.EL_CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELClass> getSuperClases() {
		if (superClases == null) {
			superClases = new EObjectResolvingEList<ELClass>(ELClass.class, this, ExampleLanguagePackage.EL_CLASS__SUPER_CLASES);
		}
		return superClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELClass> getInnerClasses() {
		if (innerClasses == null) {
			innerClasses = new EObjectContainmentEList<ELClass>(ELClass.class, this, ExampleLanguagePackage.EL_CLASS__INNER_CLASSES);
		}
		return innerClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES:
				return ((InternalEList<?>)getInnerClasses()).basicRemove(otherEnd, msgs);
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
			case ExampleLanguagePackage.EL_CLASS__METHODS:
				return getMethods();
			case ExampleLanguagePackage.EL_CLASS__FIELDS:
				return getFields();
			case ExampleLanguagePackage.EL_CLASS__SUPER_CLASES:
				return getSuperClases();
			case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES:
				return getInnerClasses();
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
			case ExampleLanguagePackage.EL_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends ELMethod>)newValue);
				return;
			case ExampleLanguagePackage.EL_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends ELField>)newValue);
				return;
			case ExampleLanguagePackage.EL_CLASS__SUPER_CLASES:
				getSuperClases().clear();
				getSuperClases().addAll((Collection<? extends ELClass>)newValue);
				return;
			case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES:
				getInnerClasses().clear();
				getInnerClasses().addAll((Collection<? extends ELClass>)newValue);
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
			case ExampleLanguagePackage.EL_CLASS__METHODS:
				getMethods().clear();
				return;
			case ExampleLanguagePackage.EL_CLASS__FIELDS:
				getFields().clear();
				return;
			case ExampleLanguagePackage.EL_CLASS__SUPER_CLASES:
				getSuperClases().clear();
				return;
			case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES:
				getInnerClasses().clear();
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
			case ExampleLanguagePackage.EL_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case ExampleLanguagePackage.EL_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case ExampleLanguagePackage.EL_CLASS__SUPER_CLASES:
				return superClases != null && !superClases.isEmpty();
			case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES:
				return innerClasses != null && !innerClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ELClassImpl
