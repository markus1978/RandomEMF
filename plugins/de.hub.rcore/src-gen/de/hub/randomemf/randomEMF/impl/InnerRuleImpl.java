/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.InnerRule;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl#getConcreteValueType <em>Concrete Value Type</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl#isIsAddRule <em>Is Add Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InnerRuleImpl extends MinimalEObjectImpl.Container implements InnerRule
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected XExpression expr;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected XExpression number;

  /**
   * The cached value of the '{@link #getEFeature() <em>EFeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature eFeature;

  /**
   * The cached value of the '{@link #getConcreteValueType() <em>Concrete Value Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteValueType()
   * @generated
   * @ordered
   */
  protected EClass concreteValueType;

  /**
   * The default value of the '{@link #isIsAddRule() <em>Is Add Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAddRule()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ADD_RULE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAddRule() <em>Is Add Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAddRule()
   * @generated
   * @ordered
   */
  protected boolean isAddRule = IS_ADD_RULE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InnerRuleImpl()
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
    return RandomEMFPackage.Literals.INNER_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(XExpression newExpr, NotificationChain msgs)
  {
    XExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(XExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.INNER_RULE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.INNER_RULE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(XExpression newNumber, NotificationChain msgs)
  {
    XExpression oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(XExpression newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.INNER_RULE__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.INNER_RULE__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getEFeature()
  {
    if (eFeature != null && eFeature.eIsProxy())
    {
      InternalEObject oldEFeature = (InternalEObject)eFeature;
      eFeature = (EStructuralFeature)eResolveProxy(oldEFeature);
      if (eFeature != oldEFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RandomEMFPackage.INNER_RULE__EFEATURE, oldEFeature, eFeature));
      }
    }
    return eFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetEFeature()
  {
    return eFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEFeature(EStructuralFeature newEFeature)
  {
    EStructuralFeature oldEFeature = eFeature;
    eFeature = newEFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__EFEATURE, oldEFeature, eFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteValueType()
  {
    if (concreteValueType != null && concreteValueType.eIsProxy())
    {
      InternalEObject oldConcreteValueType = (InternalEObject)concreteValueType;
      concreteValueType = (EClass)eResolveProxy(oldConcreteValueType);
      if (concreteValueType != oldConcreteValueType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE, oldConcreteValueType, concreteValueType));
      }
    }
    return concreteValueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetConcreteValueType()
  {
    return concreteValueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteValueType(EClass newConcreteValueType)
  {
    EClass oldConcreteValueType = concreteValueType;
    concreteValueType = newConcreteValueType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE, oldConcreteValueType, concreteValueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAddRule()
  {
    return isAddRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAddRule(boolean newIsAddRule)
  {
    boolean oldIsAddRule = isAddRule;
    isAddRule = newIsAddRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.INNER_RULE__IS_ADD_RULE, oldIsAddRule, isAddRule));
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
      case RandomEMFPackage.INNER_RULE__EXPR:
        return basicSetExpr(null, msgs);
      case RandomEMFPackage.INNER_RULE__NUMBER:
        return basicSetNumber(null, msgs);
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
      case RandomEMFPackage.INNER_RULE__EXPR:
        return getExpr();
      case RandomEMFPackage.INNER_RULE__NUMBER:
        return getNumber();
      case RandomEMFPackage.INNER_RULE__EFEATURE:
        if (resolve) return getEFeature();
        return basicGetEFeature();
      case RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE:
        if (resolve) return getConcreteValueType();
        return basicGetConcreteValueType();
      case RandomEMFPackage.INNER_RULE__IS_ADD_RULE:
        return isIsAddRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RandomEMFPackage.INNER_RULE__EXPR:
        setExpr((XExpression)newValue);
        return;
      case RandomEMFPackage.INNER_RULE__NUMBER:
        setNumber((XExpression)newValue);
        return;
      case RandomEMFPackage.INNER_RULE__EFEATURE:
        setEFeature((EStructuralFeature)newValue);
        return;
      case RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE:
        setConcreteValueType((EClass)newValue);
        return;
      case RandomEMFPackage.INNER_RULE__IS_ADD_RULE:
        setIsAddRule((Boolean)newValue);
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
      case RandomEMFPackage.INNER_RULE__EXPR:
        setExpr((XExpression)null);
        return;
      case RandomEMFPackage.INNER_RULE__NUMBER:
        setNumber((XExpression)null);
        return;
      case RandomEMFPackage.INNER_RULE__EFEATURE:
        setEFeature((EStructuralFeature)null);
        return;
      case RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE:
        setConcreteValueType((EClass)null);
        return;
      case RandomEMFPackage.INNER_RULE__IS_ADD_RULE:
        setIsAddRule(IS_ADD_RULE_EDEFAULT);
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
      case RandomEMFPackage.INNER_RULE__EXPR:
        return expr != null;
      case RandomEMFPackage.INNER_RULE__NUMBER:
        return number != null;
      case RandomEMFPackage.INNER_RULE__EFEATURE:
        return eFeature != null;
      case RandomEMFPackage.INNER_RULE__CONCRETE_VALUE_TYPE:
        return concreteValueType != null;
      case RandomEMFPackage.INNER_RULE__IS_ADD_RULE:
        return isAddRule != IS_ADD_RULE_EDEFAULT;
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
    result.append(" (isAddRule: ");
    result.append(isAddRule);
    result.append(')');
    return result.toString();
  }

} //InnerRuleImpl
