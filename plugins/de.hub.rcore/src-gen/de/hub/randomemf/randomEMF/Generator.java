/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getPackage <em>Package</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.Generator#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.Generator#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.Generator#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

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
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.Generator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ecore Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore Package</em>' reference.
   * @see #setEcorePackage(EPackage)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_EcorePackage()
   * @model
   * @generated
   */
  EPackage getEcorePackage();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.Generator#getEcorePackage <em>Ecore Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore Package</em>' reference.
   * @see #getEcorePackage()
   * @generated
   */
  void setEcorePackage(EPackage value);

  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link de.hub.randomemf.randomEMF.Generator#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link de.hub.randomemf.randomEMF.ClassRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see de.hub.randomemf.randomEMF.RandomEMFPackage#getGenerator_Rules()
   * @model containment="true"
   * @generated
   */
  EList<ClassRule> getRules();

} // Generator
