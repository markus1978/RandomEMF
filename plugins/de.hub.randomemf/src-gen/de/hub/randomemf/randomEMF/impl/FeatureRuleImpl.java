/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.FeatureRule;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
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
 *   <li>{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl#getExpr <em>Expr</em>}</li>
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
  protected EReference eFeature;

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
  public EReference getEFeature()
  {
    if (eFeature != null && eFeature.eIsProxy())
    {
      InternalEObject oldEFeature = (InternalEObject)eFeature;
      eFeature = (EReference)eResolveProxy(oldEFeature);
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
  public EReference basicGetEFeature()
  {
    return eFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEFeature(EReference newEFeature)
  {
    EReference oldEFeature = eFeature;
    eFeature = newEFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.FEATURE_RULE__EFEATURE, oldEFeature, eFeature));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return basicSetExpr(null, msgs);
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
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return getExpr();
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
        setEFeature((EReference)newValue);
        return;
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        setExpr((XExpression)newValue);
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
        setEFeature((EReference)null);
        return;
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        setExpr((XExpression)null);
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
      case RandomEMFPackage.FEATURE_RULE__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureRuleImpl
