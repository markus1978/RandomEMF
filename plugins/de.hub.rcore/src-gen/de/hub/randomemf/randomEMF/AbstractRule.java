/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.AbstractRule#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.AbstractRule#getParams <em>Params</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.AbstractRule#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.AbstractRule#getInners <em>Inners</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAbstractRule()
 * @model
 * @generated
 */
public interface AbstractRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAbstractRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.AbstractRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAbstractRule_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParams();

  /**
   * Returns the value of the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EClass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EClass</em>' reference.
   * @see #setEClass(EClass)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAbstractRule_EClass()
   * @model
   * @generated
   */
  EClass getEClass();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.AbstractRule#getEClass <em>EClass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EClass</em>' reference.
   * @see #getEClass()
   * @generated
   */
  void setEClass(EClass value);

  /**
   * Returns the value of the '<em><b>Inners</b></em>' containment reference list.
   * The list contents are of type {@link de.hub.randomemf.randomEMF.InnerRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inners</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inners</em>' containment reference list.
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getAbstractRule_Inners()
   * @model containment="true"
   * @generated
   */
  EList<InnerRule> getInners();

} // AbstractRule
