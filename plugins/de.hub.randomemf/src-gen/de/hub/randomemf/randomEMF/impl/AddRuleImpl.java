/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.AddRule;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.AddRuleImpl#getMultiplicityExpr <em>Multiplicity Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddRuleImpl extends FeatureRuleImpl implements AddRule
{
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
  protected AddRuleImpl()
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
    return RandomEMFPackage.Literals.ADD_RULE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR, oldMultiplicityExpr, newMultiplicityExpr);
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
        msgs = ((InternalEObject)multiplicityExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR, null, msgs);
      if (newMultiplicityExpr != null)
        msgs = ((InternalEObject)newMultiplicityExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR, null, msgs);
      msgs = basicSetMultiplicityExpr(newMultiplicityExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR, newMultiplicityExpr, newMultiplicityExpr));
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
      case RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR:
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
      case RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR:
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
      case RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR:
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
      case RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR:
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
      case RandomEMFPackage.ADD_RULE__MULTIPLICITY_EXPR:
        return multiplicityExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //AddRuleImpl
