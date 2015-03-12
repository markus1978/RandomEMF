/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.InnerRule#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.InnerRule#getNumber <em>Number</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.InnerRule#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.InnerRule#getConcreteValueType <em>Concrete Value Type</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.InnerRule#isIsAddRule <em>Is Add Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule()
 * @model
 * @generated
 */
public interface InnerRule extends EObject
{
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
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.InnerRule#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(XExpression)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule_Number()
   * @model containment="true"
   * @generated
   */
  XExpression getNumber();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.InnerRule#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(XExpression value);

  /**
   * Returns the value of the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EFeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EFeature</em>' reference.
   * @see #setEFeature(EStructuralFeature)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule_EFeature()
   * @model
   * @generated
   */
  EStructuralFeature getEFeature();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.InnerRule#getEFeature <em>EFeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EFeature</em>' reference.
   * @see #getEFeature()
   * @generated
   */
  void setEFeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Concrete Value Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Value Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Value Type</em>' reference.
   * @see #setConcreteValueType(EClass)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule_ConcreteValueType()
   * @model
   * @generated
   */
  EClass getConcreteValueType();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.InnerRule#getConcreteValueType <em>Concrete Value Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Value Type</em>' reference.
   * @see #getConcreteValueType()
   * @generated
   */
  void setConcreteValueType(EClass value);

  /**
   * Returns the value of the '<em><b>Is Add Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Add Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Add Rule</em>' attribute.
   * @see #setIsAddRule(boolean)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getInnerRule_IsAddRule()
   * @model
   * @generated
   */
  boolean isIsAddRule();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.InnerRule#isIsAddRule <em>Is Add Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Add Rule</em>' attribute.
   * @see #isIsAddRule()
   * @generated
   */
  void setIsAddRule(boolean value);

} // InnerRule
