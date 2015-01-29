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
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__IMPORT_SECTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = 1;

  /**
   * The feature id for the '<em><b>Ecore Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__ECORE_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__IMPORT_URI = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__RULES = 4;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.ClassRuleImpl <em>Class Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.ClassRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getClassRule()
   * @generated
   */
  int CLASS_RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__ECLASS = 2;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE__RULES = 3;

  /**
   * The number of structural features of the '<em>Class Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl <em>Feature Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.FeatureRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getFeatureRule()
   * @generated
   */
  int FEATURE_RULE = 2;

  /**
   * The feature id for the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_RULE__EFEATURE = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_RULE__EXPR = 1;

  /**
   * The number of structural features of the '<em>Feature Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.AddRuleImpl <em>Add Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.AddRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAddRule()
   * @generated
   */
  int ADD_RULE = 3;

  /**
   * The feature id for the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_RULE__EFEATURE = FEATURE_RULE__EFEATURE;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_RULE__EXPR = FEATURE_RULE__EXPR;

  /**
   * The feature id for the '<em><b>Multiplicity Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_RULE__MULTIPLICITY_EXPR = FEATURE_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Add Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_RULE_FEATURE_COUNT = FEATURE_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hub.randomemf.randomEMF.impl.SetRuleImpl <em>Set Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hub.randomemf.randomEMF.impl.SetRuleImpl
   * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getSetRule()
   * @generated
   */
  int SET_RULE = 4;

  /**
   * The feature id for the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_RULE__EFEATURE = FEATURE_RULE__EFEATURE;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_RULE__EXPR = FEATURE_RULE__EXPR;

  /**
   * The number of structural features of the '<em>Set Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_RULE_FEATURE_COUNT = FEATURE_RULE_FEATURE_COUNT + 0;


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
   * Returns the meta object for the attribute list '{@link de.hub.randomemf.randomEMF.Generator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
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
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.ClassRule <em>Class Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Rule</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule
   * @generated
   */
  EClass getClassRule();

  /**
   * Returns the meta object for the attribute '{@link de.hub.randomemf.randomEMF.ClassRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule#getName()
   * @see #getClassRule()
   * @generated
   */
  EAttribute getClassRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hub.randomemf.randomEMF.ClassRule#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule#getParams()
   * @see #getClassRule()
   * @generated
   */
  EReference getClassRule_Params();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.ClassRule#getEClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EClass</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule#getEClass()
   * @see #getClassRule()
   * @generated
   */
  EReference getClassRule_EClass();

  /**
   * Returns the meta object for the containment reference list '{@link de.hub.randomemf.randomEMF.ClassRule#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see de.hub.randomemf.randomEMF.ClassRule#getRules()
   * @see #getClassRule()
   * @generated
   */
  EReference getClassRule_Rules();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.FeatureRule <em>Feature Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Rule</em>'.
   * @see de.hub.randomemf.randomEMF.FeatureRule
   * @generated
   */
  EClass getFeatureRule();

  /**
   * Returns the meta object for the reference '{@link de.hub.randomemf.randomEMF.FeatureRule#getEFeature <em>EFeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EFeature</em>'.
   * @see de.hub.randomemf.randomEMF.FeatureRule#getEFeature()
   * @see #getFeatureRule()
   * @generated
   */
  EReference getFeatureRule_EFeature();

  /**
   * Returns the meta object for the containment reference '{@link de.hub.randomemf.randomEMF.FeatureRule#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.hub.randomemf.randomEMF.FeatureRule#getExpr()
   * @see #getFeatureRule()
   * @generated
   */
  EReference getFeatureRule_Expr();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.AddRule <em>Add Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Rule</em>'.
   * @see de.hub.randomemf.randomEMF.AddRule
   * @generated
   */
  EClass getAddRule();

  /**
   * Returns the meta object for the containment reference '{@link de.hub.randomemf.randomEMF.AddRule#getMultiplicityExpr <em>Multiplicity Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity Expr</em>'.
   * @see de.hub.randomemf.randomEMF.AddRule#getMultiplicityExpr()
   * @see #getAddRule()
   * @generated
   */
  EReference getAddRule_MultiplicityExpr();

  /**
   * Returns the meta object for class '{@link de.hub.randomemf.randomEMF.SetRule <em>Set Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rule</em>'.
   * @see de.hub.randomemf.randomEMF.SetRule
   * @generated
   */
  EClass getSetRule();

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
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__IMPORT_SECTION = eINSTANCE.getGenerator_ImportSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
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
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.ClassRuleImpl <em>Class Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.ClassRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getClassRule()
     * @generated
     */
    EClass CLASS_RULE = eINSTANCE.getClassRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_RULE__NAME = eINSTANCE.getClassRule_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_RULE__PARAMS = eINSTANCE.getClassRule_Params();

    /**
     * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_RULE__ECLASS = eINSTANCE.getClassRule_EClass();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_RULE__RULES = eINSTANCE.getClassRule_Rules();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.FeatureRuleImpl <em>Feature Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.FeatureRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getFeatureRule()
     * @generated
     */
    EClass FEATURE_RULE = eINSTANCE.getFeatureRule();

    /**
     * The meta object literal for the '<em><b>EFeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_RULE__EFEATURE = eINSTANCE.getFeatureRule_EFeature();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_RULE__EXPR = eINSTANCE.getFeatureRule_Expr();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.AddRuleImpl <em>Add Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.AddRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getAddRule()
     * @generated
     */
    EClass ADD_RULE = eINSTANCE.getAddRule();

    /**
     * The meta object literal for the '<em><b>Multiplicity Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_RULE__MULTIPLICITY_EXPR = eINSTANCE.getAddRule_MultiplicityExpr();

    /**
     * The meta object literal for the '{@link de.hub.randomemf.randomEMF.impl.SetRuleImpl <em>Set Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.randomemf.randomEMF.impl.SetRuleImpl
     * @see de.hub.randomemf.randomEMF.impl.RandomEMFPackageImpl#getSetRule()
     * @generated
     */
    EClass SET_RULE = eINSTANCE.getSetRule();

  }

} //RandomEMFPackage
