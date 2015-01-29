/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.FeatureRule#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.FeatureRule#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getFeatureRule()
 * @model
 * @generated
 */
public interface FeatureRule extends EObject
{
  /**
   * Returns the value of the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EFeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EFeature</em>' reference.
   * @see #setEFeature(EReference)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getFeatureRule_EFeature()
   * @model
   * @generated
   */
  EReference getEFeature();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.FeatureRule#getEFeature <em>EFeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EFeature</em>' reference.
   * @see #getEFeature()
   * @generated
   */
  void setEFeature(EReference value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(XExpression)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getFeatureRule_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.FeatureRule#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

} // FeatureRule
