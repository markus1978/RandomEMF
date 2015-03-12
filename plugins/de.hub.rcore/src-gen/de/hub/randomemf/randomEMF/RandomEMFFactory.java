/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.randomemf.randomEMF.RandomEMFPackage
 * @generated
 */
public interface RandomEMFFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RandomEMFFactory eINSTANCE = de.hub.randomemf.randomEMF.impl.RandomEMFFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generator</em>'.
   * @generated
   */
  Generator createGenerator();

  /**
   * Returns a new object of class '<em>Abstract Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Rule</em>'.
   * @generated
   */
  AbstractRule createAbstractRule();

  /**
   * Returns a new object of class '<em>Alternative Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Rule</em>'.
   * @generated
   */
  AlternativeRule createAlternativeRule();

  /**
   * Returns a new object of class '<em>Inner Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inner Rule</em>'.
   * @generated
   */
  InnerRule createInnerRule();

  /**
   * Returns a new object of class '<em>Class Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Rule</em>'.
   * @generated
   */
  ClassRule createClassRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RandomEMFPackage getRandomEMFPackage();

} //RandomEMFFactory
