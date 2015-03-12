/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.AbstractRule;
import de.hub.randomemf.randomEMF.InnerRule;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl#getInners <em>Inners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractRuleImpl extends MinimalEObjectImpl.Container implements AbstractRule
{
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> params;

  /**
   * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEClass()
   * @generated
   * @ordered
   */
  protected EClass eClass;

  /**
   * The cached value of the '{@link #getInners() <em>Inners</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInners()
   * @generated
   * @ordered
   */
  protected EList<InnerRule> inners;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RandomEMFPackage.Literals.ABSTRACT_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.ABSTRACT_RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmFormalParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, RandomEMFPackage.ABSTRACT_RULE__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClass()
  {
    if (eClass != null && eClass.eIsProxy())
    {
      InternalEObject oldEClass = (InternalEObject)eClass;
      eClass = (EClass)eResolveProxy(oldEClass);
      if (eClass != oldEClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RandomEMFPackage.ABSTRACT_RULE__ECLASS, oldEClass, eClass));
      }
    }
    return eClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetEClass()
  {
    return eClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEClass(EClass newEClass)
  {
    EClass oldEClass = eClass;
    eClass = newEClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.ABSTRACT_RULE__ECLASS, oldEClass, eClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InnerRule> getInners()
  {
    if (inners == null)
    {
      inners = new EObjectContainmentEList<InnerRule>(InnerRule.class, this, RandomEMFPackage.ABSTRACT_RULE__INNERS);
    }
    return inners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RandomEMFPackage.ABSTRACT_RULE__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case RandomEMFPackage.ABSTRACT_RULE__INNERS:
        return ((InternalEList<?>)getInners()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RandomEMFPackage.ABSTRACT_RULE__NAME:
        return getName();
      case RandomEMFPackage.ABSTRACT_RULE__PARAMS:
        return getParams();
      case RandomEMFPackage.ABSTRACT_RULE__ECLASS:
        if (resolve) return getEClass();
        return basicGetEClass();
      case RandomEMFPackage.ABSTRACT_RULE__INNERS:
        return getInners();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RandomEMFPackage.ABSTRACT_RULE__NAME:
        setName((String)newValue);
        return;
      case RandomEMFPackage.ABSTRACT_RULE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case RandomEMFPackage.ABSTRACT_RULE__ECLASS:
        setEClass((EClass)newValue);
        return;
      case RandomEMFPackage.ABSTRACT_RULE__INNERS:
        getInners().clear();
        getInners().addAll((Collection<? extends InnerRule>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RandomEMFPackage.ABSTRACT_RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RandomEMFPackage.ABSTRACT_RULE__PARAMS:
        getParams().clear();
        return;
      case RandomEMFPackage.ABSTRACT_RULE__ECLASS:
        setEClass((EClass)null);
        return;
      case RandomEMFPackage.ABSTRACT_RULE__INNERS:
        getInners().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RandomEMFPackage.ABSTRACT_RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RandomEMFPackage.ABSTRACT_RULE__PARAMS:
        return params != null && !params.isEmpty();
      case RandomEMFPackage.ABSTRACT_RULE__ECLASS:
        return eClass != null;
      case RandomEMFPackage.ABSTRACT_RULE__INNERS:
        return inners != null && !inners.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AbstractRuleImpl
