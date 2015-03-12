/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RandomEMFFactoryImpl extends EFactoryImpl implements RandomEMFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RandomEMFFactory init()
  {
    try
    {
      RandomEMFFactory theRandomEMFFactory = (RandomEMFFactory)EPackage.Registry.INSTANCE.getEFactory(RandomEMFPackage.eNS_URI);
      if (theRandomEMFFactory != null)
      {
        return theRandomEMFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RandomEMFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomEMFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RandomEMFPackage.GENERATOR: return createGenerator();
      case RandomEMFPackage.ABSTRACT_RULE: return createAbstractRule();
      case RandomEMFPackage.ALTERNATIVE_RULE: return createAlternativeRule();
      case RandomEMFPackage.INNER_RULE: return createInnerRule();
      case RandomEMFPackage.CLASS_RULE: return createClassRule();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRule createAbstractRule()
  {
    AbstractRuleImpl abstractRule = new AbstractRuleImpl();
    return abstractRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeRule createAlternativeRule()
  {
    AlternativeRuleImpl alternativeRule = new AlternativeRuleImpl();
    return alternativeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerRule createInnerRule()
  {
    InnerRuleImpl innerRule = new InnerRuleImpl();
    return innerRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassRule createClassRule()
  {
    ClassRuleImpl classRule = new ClassRuleImpl();
    return classRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomEMFPackage getRandomEMFPackage()
  {
    return (RandomEMFPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RandomEMFPackage getPackage()
  {
    return RandomEMFPackage.eINSTANCE;
  }

} //RandomEMFFactoryImpl
