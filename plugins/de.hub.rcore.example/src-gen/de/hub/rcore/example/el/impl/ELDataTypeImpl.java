/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELDataType;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELNamedElement;
import de.hub.rcore.example.el.ExampleLanguagePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EL Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELDataTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELDataTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELDataTypeImpl#getSuperClases <em>Super Clases</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELDataTypeImpl#getInnerClasses <em>Inner Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELDataTypeImpl extends ELPredefinedImpl implements ELDataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ELDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExampleLanguagePackage.Literals.EL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<ELMethod>(ELMethod.class, this, ExampleLanguagePackage.EL_DATA_TYPE__METHODS);
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
			fields = new EObjectContainmentEList<ELField>(ELField.class, this, ExampleLanguagePackage.EL_DATA_TYPE__FIELDS);
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
			superClases = new EObjectResolvingEList<ELClass>(ELClass.class, this, ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES);
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
			innerClasses = new EObjectContainmentEList<ELClass>(ELClass.class, this, ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES);
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
			case ExampleLanguagePackage.EL_DATA_TYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES:
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
			case ExampleLanguagePackage.EL_DATA_TYPE__NAME:
				return getName();
			case ExampleLanguagePackage.EL_DATA_TYPE__METHODS:
				return getMethods();
			case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS:
				return getFields();
			case ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES:
				return getSuperClases();
			case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES:
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
			case ExampleLanguagePackage.EL_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends ELMethod>)newValue);
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends ELField>)newValue);
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES:
				getSuperClases().clear();
				getSuperClases().addAll((Collection<? extends ELClass>)newValue);
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES:
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
			case ExampleLanguagePackage.EL_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__METHODS:
				getMethods().clear();
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS:
				getFields().clear();
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES:
				getSuperClases().clear();
				return;
			case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES:
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
			case ExampleLanguagePackage.EL_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExampleLanguagePackage.EL_DATA_TYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES:
				return superClases != null && !superClases.isEmpty();
			case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES:
				return innerClasses != null && !innerClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ELNamedElement.class) {
			switch (derivedFeatureID) {
				case ExampleLanguagePackage.EL_DATA_TYPE__NAME: return ExampleLanguagePackage.EL_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ELClass.class) {
			switch (derivedFeatureID) {
				case ExampleLanguagePackage.EL_DATA_TYPE__METHODS: return ExampleLanguagePackage.EL_CLASS__METHODS;
				case ExampleLanguagePackage.EL_DATA_TYPE__FIELDS: return ExampleLanguagePackage.EL_CLASS__FIELDS;
				case ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES: return ExampleLanguagePackage.EL_CLASS__SUPER_CLASES;
				case ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES: return ExampleLanguagePackage.EL_CLASS__INNER_CLASSES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ELNamedElement.class) {
			switch (baseFeatureID) {
				case ExampleLanguagePackage.EL_NAMED_ELEMENT__NAME: return ExampleLanguagePackage.EL_DATA_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ELClass.class) {
			switch (baseFeatureID) {
				case ExampleLanguagePackage.EL_CLASS__METHODS: return ExampleLanguagePackage.EL_DATA_TYPE__METHODS;
				case ExampleLanguagePackage.EL_CLASS__FIELDS: return ExampleLanguagePackage.EL_DATA_TYPE__FIELDS;
				case ExampleLanguagePackage.EL_CLASS__SUPER_CLASES: return ExampleLanguagePackage.EL_DATA_TYPE__SUPER_CLASES;
				case ExampleLanguagePackage.EL_CLASS__INNER_CLASSES: return ExampleLanguagePackage.EL_DATA_TYPE__INNER_CLASSES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ELDataTypeImpl
