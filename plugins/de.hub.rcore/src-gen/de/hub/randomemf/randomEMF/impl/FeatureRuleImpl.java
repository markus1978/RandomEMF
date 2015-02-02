/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.FeatureRule;
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
 * An implementation of the model object '<em><b>Feature Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl#isIsAddRule <em>Is Add Rule</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl#getMultiplicityExpr <em>Multiplicity Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureRuleImpl extends MinimalEObjectImpl.Container implements FeatureRule
{
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
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected XExpression expr;

  /**
   * The cached value of the '{@link #getMultiplicityExpr() <em>Multiplicity Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicityExpr()
   * @generated
   * @ordered
   */
  protected XExpression multiplicityExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureRuleImpl()
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
    return RandomEMFPackage.Literals.FEATURE_RULE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RandomEMFPackage.FEATURE_RULE__EFEATURE, oldEFeature, eFeature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__EFEATURE, oldEFeature, eFeature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__IS_ADD_RULE, oldIsAddRule, isAddRule));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.FEATURE_RULE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.FEATURE_RULE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getMultiplicityExpr()
  {
    return multiplicityExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicityExpr(XExpression newMultiplicityExpr, NotificationChain msgs)
  {
    XExpression oldMultiplicityExpr = multiplicityExpr;
    multiplicityExpr = newMultiplicityExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR, oldMultiplicityExpr, newMultiplicityExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicityExpr(XExpression newMultiplicityExpr)
  {
    if (newMultiplicityExpr != multiplicityExpr)
    {
      NotificationChain msgs = null;
      if (multiplicityExpr != null)
        msgs = ((InternalEObject)multiplicityExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR, null, msgs);
      if (newMultiplicityExpr != null)
        msgs = ((InternalEObject)newMultiplicityExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR, null, msgs);
      msgs = basicSetMultiplicityExpr(newMultiplicityExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR, newMultiplicityExpr, newMultiplicityExpr));
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
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return basicSetExpr(null, msgs);
      case RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR:
        return basicSetMultiplicityExpr(null, msgs);
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
      case RandomEMFPackage.FEATURE_RULE__EFEATURE:
        if (resolve) return getEFeature();
        return basicGetEFeature();
      case RandomEMFPackage.FEATURE_RULE__IS_ADD_RULE:
        return isIsAddRule();
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return getExpr();
      case RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR:
        return getMultiplicityExpr();
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
      case RandomEMFPackage.FEATURE_RULE__EFEATURE:
        setEFeature((EStructuralFeature)newValue);
        return;
      case RandomEMFPackage.FEATURE_RULE__IS_ADD_RULE:
        setIsAddRule((Boolean)newValue);
        return;
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        setExpr((XExpression)newValue);
        return;
      case RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR:
        setMultiplicityExpr((XExpression)newValue);
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
      case RandomEMFPackage.FEATURE_RULE__EFEATURE:
        setEFeature((EStructuralFeature)null);
        return;
      case RandomEMFPackage.FEATURE_RULE__IS_ADD_RULE:
        setIsAddRule(IS_ADD_RULE_EDEFAULT);
        return;
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        setExpr((XExpression)null);
        return;
      case RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR:
        setMultiplicityExpr((XExpression)null);
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
      case RandomEMFPackage.FEATURE_RULE__EFEATURE:
        return eFeature != null;
      case RandomEMFPackage.FEATURE_RULE__IS_ADD_RULE:
        return isAddRule != IS_ADD_RULE_EDEFAULT;
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return expr != null;
      case RandomEMFPackage.FEATURE_RULE__MULTIPLICITY_EXPR:
        return multiplicityExpr != null;
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

} //FeatureRuleImpl
