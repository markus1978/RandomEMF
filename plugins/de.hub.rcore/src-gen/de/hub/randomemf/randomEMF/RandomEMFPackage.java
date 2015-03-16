/**
 */
package de.hub.randomemf.randomEMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.randomemf.randomEMF.RandomEMFFactory
 * @model kind="package"
 * @generated
 */
public interface RandomEMFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "randomEMF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hub.de/randomemf/RandomEMF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "randomEMF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RandomEMFPackage eINSTANCE = de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl.init();

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.GeneratorImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = 2;

  /**
   * The feature id for the '<em><b>Ecore Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__ECORE_PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__IMPORT_URI = 4;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__RULES = 5;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.AbstractRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAbstractRule()
   * @generated
   */
  int ABSTRACT_RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RULE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RULE__ECLASS = 2;

  /**
   * The feature id for the '<em><b>Inners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RULE__INNERS = 3;

  /**
   * The number of structural features of the '<em>Abstract Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.AlternativeRuleImpl <em>Alternative Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.AlternativeRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAlternativeRule()
   * @generated
   */
  int ALTERNATIVE_RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__NAME = ABSTRACT_RULE__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__PARAMS = ABSTRACT_RULE__PARAMS;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__ECLASS = ABSTRACT_RULE__ECLASS;

  /**
   * The feature id for the '<em><b>Inners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE__INNERS = ABSTRACT_RULE__INNERS;

  /**
   * The number of structural features of the '<em>Alternative Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl <em>Inner Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.InnerRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getInnerRule()
   * @generated
   */
  int INNER_RULE = 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__EXPR = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__NUMBER = 1;

  /**
   * The feature id for the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__EFEATURE = 2;

  /**
   * The feature id for the '<em><b>Concrete Value Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__CONCRETE_VALUE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Is Add Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__IS_ADD_RULE = 4;

  /**
   * The feature id for the '<em><b>Is Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE__IS_REF = 5;

  /**
   * The number of structural features of the '<em>Inner Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_RULE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.ClassRuleImpl <em>Class Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.ClassRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getClassRule()
   * @generated
   */
  int CLASS_RULE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__NAME = ABSTRACT_RULE__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__PARAMS = ABSTRACT_RULE__PARAMS;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__ECLASS = ABSTRACT_RULE__ECLASS;

  /**
   * The feature id for the '<em><b>Inners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__INNERS = ABSTRACT_RULE__INNERS;

  /**
   * The number of structural features of the '<em>Class Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see de.hub.randomemf.randomEMF.Generator
   * @generated
   */
  EClass getGenerator();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.Generator#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getPackage()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Package();

  /**
   * Returns the meta object for the containment reference '{@link de.hub.randomemf.randomEMF.Generator#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getImportSection()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_ImportSection();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.Generator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getName()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Name();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.Generator#getEcorePackage <em>Ecore Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ecore Package</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getEcorePackage()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_EcorePackage();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.Generator#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getImportURI()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link de.hub.randomemf.randomEMF.Generator#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see de.hub.randomemf.randomEMF.Generator#getRules()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_Rules();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.AbstractRule <em>Abstract Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Rule</em>'.
   * @see de.hub.randomemf.randomEMF.AbstractRule
   * @generated
   */
  EClass getAbstractRule();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.AbstractRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hub.randomemf.randomEMF.AbstractRule#getName()
   * @see #getAbstractRule()
   * @generated
   */
  EAttribute getAbstractRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hub.randomemf.randomEMF.AbstractRule#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.hub.randomemf.randomEMF.AbstractRule#getParams()
   * @see #getAbstractRule()
   * @generated
   */
  EReference getAbstractRule_Params();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.AbstractRule#getEClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EClass</em>'.
   * @see de.hub.randomemf.randomEMF.AbstractRule#getEClass()
   * @see #getAbstractRule()
   * @generated
   */
  EReference getAbstractRule_EClass();

  /**
   * Returns the meta object for the containment reference list '{@link de.hub.randomemf.randomEMF.AbstractRule#getInners <em>Inners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inners</em>'.
   * @see de.hub.randomemf.randomEMF.AbstractRule#getInners()
   * @see #getAbstractRule()
   * @generated
   */
  EReference getAbstractRule_Inners();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.AlternativeRule <em>Alternative Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Rule</em>'.
   * @see de.hub.randomemf.randomEMF.AlternativeRule
   * @generated
   */
  EClass getAlternativeRule();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.InnerRule <em>Inner Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Rule</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule
   * @generated
   */
  EClass getInnerRule();

  /**
   * Returns the meta object for the containment reference '{@link de.hub.randomemf.randomEMF.InnerRule#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#getExpr()
   * @see #getInnerRule()
   * @generated
   */
  EReference getInnerRule_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.hub.randomemf.randomEMF.InnerRule#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#getNumber()
   * @see #getInnerRule()
   * @generated
   */
  EReference getInnerRule_Number();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.InnerRule#getEFeature <em>EFeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EFeature</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#getEFeature()
   * @see #getInnerRule()
   * @generated
   */
  EReference getInnerRule_EFeature();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.InnerRule#getConcreteValueType <em>Concrete Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concrete Value Type</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#getConcreteValueType()
   * @see #getInnerRule()
   * @generated
   */
  EReference getInnerRule_ConcreteValueType();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.InnerRule#isIsAddRule <em>Is Add Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Add Rule</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#isIsAddRule()
   * @see #getInnerRule()
   * @generated
   */
  EAttribute getInnerRule_IsAddRule();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.InnerRule#isIsRef <em>Is Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ref</em>'.
   * @see de.hub.randomemf.randomEMF.InnerRule#isIsRef()
   * @see #getInnerRule()
   * @generated
   */
  EAttribute getInnerRule_IsRef();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.ClassRule <em>Class Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Rule</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule
   * @generated
   */
  EClass getClassRule();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RandomEMFFactory getRandomEMFFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.GeneratorImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getGenerator()
     * @generated
     */
    EClass GENERATOR = eINSTANCE.getGenerator();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__PACKAGE = eINSTANCE.getGenerator_Package();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__IMPORT_SECTION = eINSTANCE.getGenerator_ImportSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__NAME = eINSTANCE.getGenerator_Name();

    /**
     * The meta object literal for the '<em><b>Ecore Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__ECORE_PACKAGE = eINSTANCE.getGenerator_EcorePackage();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__IMPORT_URI = eINSTANCE.getGenerator_ImportURI();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__RULES = eINSTANCE.getGenerator_Rules();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.AbstractRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAbstractRule()
     * @generated
     */
    EClass ABSTRACT_RULE = eINSTANCE.getAbstractRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RULE__NAME = eINSTANCE.getAbstractRule_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RULE__PARAMS = eINSTANCE.getAbstractRule_Params();

    /**
     * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RULE__ECLASS = eINSTANCE.getAbstractRule_EClass();

    /**
     * The meta object literal for the '<em><b>Inners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RULE__INNERS = eINSTANCE.getAbstractRule_Inners();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.AlternativeRuleImpl <em>Alternative Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.AlternativeRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAlternativeRule()
     * @generated
     */
    EClass ALTERNATIVE_RULE = eINSTANCE.getAlternativeRule();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.InnerRuleImpl <em>Inner Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.InnerRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getInnerRule()
     * @generated
     */
    EClass INNER_RULE = eINSTANCE.getInnerRule();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_RULE__EXPR = eINSTANCE.getInnerRule_Expr();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_RULE__NUMBER = eINSTANCE.getInnerRule_Number();

    /**
     * The meta object literal for the '<em><b>EFeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_RULE__EFEATURE = eINSTANCE.getInnerRule_EFeature();

    /**
     * The meta object literal for the '<em><b>Concrete Value Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_RULE__CONCRETE_VALUE_TYPE = eINSTANCE.getInnerRule_ConcreteValueType();

    /**
     * The meta object literal for the '<em><b>Is Add Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_RULE__IS_ADD_RULE = eINSTANCE.getInnerRule_IsAddRule();

    /**
     * The meta object literal for the '<em><b>Is Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_RULE__IS_REF = eINSTANCE.getInnerRule_IsRef();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.ClassRuleImpl <em>Class Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.ClassRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getClassRule()
     * @generated
     */
    EClass CLASS_RULE = eINSTANCE.getClassRule();

  }

} //RandomEMFPackage
