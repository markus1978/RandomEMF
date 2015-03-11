/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELNamedElement;
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpKind;
import de.hub.rcore.example.el.ELTypedElement;
import de.hub.rcore.example.el.ELVariable;
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
 * An implementation of the model object '<em><b>EL Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#isArray <em>Array</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link de.hub.rcore.example.el.impl.ELOpImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ELOpImpl extends ELPredefinedImpl implements ELOp {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ELClass type;

	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ELVariable> parameters;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ELVariable> localVariables;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected ELBlock block;

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
	 * The default value of the '{@link #getOperators() <em>Operators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected int operators = OPERATORS_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ELClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExampleLanguagePackage.EL_OP__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ELClass newType) {
		ELClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(boolean newArray) {
		boolean oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELVariable> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ELVariable>(ELVariable.class, this, ExampleLanguagePackage.EL_OP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELVariable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<ELVariable>(ELVariable.class, this, ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELBlock getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(ELBlock newBlock, NotificationChain msgs) {
		ELBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(ELBlock newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExampleLanguagePackage.EL_OP__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExampleLanguagePackage.EL_OP__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__BLOCK, newBlock, newBlock));
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
	public int getOperators() {
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperators(int newOperators) {
		int oldOperators = operators;
		operators = newOperators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExampleLanguagePackage.EL_OP__OPERATORS, oldOperators, operators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExampleLanguagePackage.EL_OP__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case ExampleLanguagePackage.EL_OP__BLOCK:
				return basicSetBlock(null, msgs);
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
			case ExampleLanguagePackage.EL_OP__NAME:
				return getName();
			case ExampleLanguagePackage.EL_OP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ExampleLanguagePackage.EL_OP__ARRAY:
				return isArray();
			case ExampleLanguagePackage.EL_OP__PARAMETERS:
				return getParameters();
			case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES:
				return getLocalVariables();
			case ExampleLanguagePackage.EL_OP__BLOCK:
				return getBlock();
			case ExampleLanguagePackage.EL_OP__KIND:
				return getKind();
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				return getSyntax();
			case ExampleLanguagePackage.EL_OP__OPERATORS:
				return getOperators();
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
			case ExampleLanguagePackage.EL_OP__NAME:
				setName((String)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__TYPE:
				setType((ELClass)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__ARRAY:
				setArray((Boolean)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ELVariable>)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends ELVariable>)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__BLOCK:
				setBlock((ELBlock)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__KIND:
				setKind((ELOpKind)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				setSyntax((String)newValue);
				return;
			case ExampleLanguagePackage.EL_OP__OPERATORS:
				setOperators((Integer)newValue);
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
			case ExampleLanguagePackage.EL_OP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__TYPE:
				setType((ELClass)null);
				return;
			case ExampleLanguagePackage.EL_OP__ARRAY:
				setArray(ARRAY_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__PARAMETERS:
				getParameters().clear();
				return;
			case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case ExampleLanguagePackage.EL_OP__BLOCK:
				setBlock((ELBlock)null);
				return;
			case ExampleLanguagePackage.EL_OP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				setSyntax(SYNTAX_EDEFAULT);
				return;
			case ExampleLanguagePackage.EL_OP__OPERATORS:
				setOperators(OPERATORS_EDEFAULT);
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
			case ExampleLanguagePackage.EL_OP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExampleLanguagePackage.EL_OP__TYPE:
				return type != null;
			case ExampleLanguagePackage.EL_OP__ARRAY:
				return array != ARRAY_EDEFAULT;
			case ExampleLanguagePackage.EL_OP__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case ExampleLanguagePackage.EL_OP__BLOCK:
				return block != null;
			case ExampleLanguagePackage.EL_OP__KIND:
				return kind != KIND_EDEFAULT;
			case ExampleLanguagePackage.EL_OP__SYNTAX:
				return SYNTAX_EDEFAULT == null ? syntax != null : !SYNTAX_EDEFAULT.equals(syntax);
			case ExampleLanguagePackage.EL_OP__OPERATORS:
				return operators != OPERATORS_EDEFAULT;
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
				case ExampleLanguagePackage.EL_OP__NAME: return ExampleLanguagePackage.EL_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ELTypedElement.class) {
			switch (derivedFeatureID) {
				case ExampleLanguagePackage.EL_OP__TYPE: return ExampleLanguagePackage.EL_TYPED_ELEMENT__TYPE;
				case ExampleLanguagePackage.EL_OP__ARRAY: return ExampleLanguagePackage.EL_TYPED_ELEMENT__ARRAY;
				default: return -1;
			}
		}
		if (baseClass == ELMethod.class) {
			switch (derivedFeatureID) {
				case ExampleLanguagePackage.EL_OP__PARAMETERS: return ExampleLanguagePackage.EL_METHOD__PARAMETERS;
				case ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES: return ExampleLanguagePackage.EL_METHOD__LOCAL_VARIABLES;
				case ExampleLanguagePackage.EL_OP__BLOCK: return ExampleLanguagePackage.EL_METHOD__BLOCK;
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
				case ExampleLanguagePackage.EL_NAMED_ELEMENT__NAME: return ExampleLanguagePackage.EL_OP__NAME;
				default: return -1;
			}
		}
		if (baseClass == ELTypedElement.class) {
			switch (baseFeatureID) {
				case ExampleLanguagePackage.EL_TYPED_ELEMENT__TYPE: return ExampleLanguagePackage.EL_OP__TYPE;
				case ExampleLanguagePackage.EL_TYPED_ELEMENT__ARRAY: return ExampleLanguagePackage.EL_OP__ARRAY;
				default: return -1;
			}
		}
		if (baseClass == ELMethod.class) {
			switch (baseFeatureID) {
				case ExampleLanguagePackage.EL_METHOD__PARAMETERS: return ExampleLanguagePackage.EL_OP__PARAMETERS;
				case ExampleLanguagePackage.EL_METHOD__LOCAL_VARIABLES: return ExampleLanguagePackage.EL_OP__LOCAL_VARIABLES;
				case ExampleLanguagePackage.EL_METHOD__BLOCK: return ExampleLanguagePackage.EL_OP__BLOCK;
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
		result.append(", array: ");
		result.append(array);
		result.append(", kind: ");
		result.append(kind);
		result.append(", syntax: ");
		result.append(syntax);
		result.append(", operators: ");
		result.append(operators);
		result.append(')');
		return result.toString();
	}

} //ELOpImpl
