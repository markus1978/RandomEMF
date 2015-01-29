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
      case RandomEMFPackage.CLASS_RULE: return createClassRule();
      case RandomEMFPackage.FEATURE_RULE: return createFeatureRule();
      case RandomEMFPackage.ADD_RULE: return createAddRule();
      case RandomEMFPackage.SET_RULE: return createSetRule();
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
  public FeatureRule createFeatureRule()
  {
    FeatureRuleImpl featureRule = new FeatureRuleImpl();
    return featureRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddRule createAddRule()
  {
    AddRuleImpl addRule = new AddRuleImpl();
    return addRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRule createSetRule()
  {
    SetRuleImpl setRule = new SetRuleImpl();
    return setRule;
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
