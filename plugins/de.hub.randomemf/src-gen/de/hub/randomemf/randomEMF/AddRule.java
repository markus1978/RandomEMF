/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.AddRule#getMultiplicityExpr <em>Multiplicity Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAddRule()
 * @model
 * @generated
 */
public interface AddRule extends FeatureRule
{
  /**
   * Returns the value of the '<em><b>Multiplicity Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity Expr</em>' containment reference.
   * @see #setMultiplicityExpr(XExpression)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAddRule_MultiplicityExpr()
   * @model containment="true"
   * @generated
   */
  XExpression getMultiplicityExpr();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.AddRule#getMultiplicityExpr <em>Multiplicity Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity Expr</em>' containment reference.
   * @see #getMultiplicityExpr()
   * @generated
   */
  void setMultiplicityExpr(XExpression value);

} // AddRule
