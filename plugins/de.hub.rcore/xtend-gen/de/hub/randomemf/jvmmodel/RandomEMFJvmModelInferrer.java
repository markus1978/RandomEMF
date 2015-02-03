package de.hub.randomemf.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.hub.randomemf.jvmmodel.GenModelHelper;
import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.FeatureRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.runtime.IGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RandomEMFJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private GenModelHelper _genModelHelper;
  
  @Inject
  private TypeReferences typeReferences;
  
  protected void _infer(final Generator element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String simpleName = element.getName();
    String _xifexpression = null;
    String _package = element.getPackage();
    boolean _notEquals = (!Objects.equal(_package, null));
    if (_notEquals) {
      String _package_1 = element.getPackage();
      String _plus = (_package_1 + ".");
      _xifexpression = (_plus + simpleName);
    } else {
      _xifexpression = simpleName;
    }
    final String qualifiedName = _xifexpression;
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, qualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = RandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(IGenerator.class);
        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        EList<JvmMember> _members = it.getMembers();
        EList<ClassRule> _rules = element.getRules();
        ClassRule _get = _rules.get(0);
        EClass _eClass = _get.getEClass();
        JvmTypeReference _jvmType = RandomEMFJvmModelInferrer.this.jvmType(_eClass);
        JvmField _field = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toField(element, "model", _jvmType);
        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        EList<ClassRule> _rules_1 = element.getRules();
        ClassRule _get_1 = _rules_1.get(0);
        EClass _eClass_1 = _get_1.getEClass();
        JvmTypeReference _jvmType_1 = RandomEMFJvmModelInferrer.this.jvmType(_eClass_1);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                EList<ClassRule> _rules = element.getRules();
                ClassRule _get = _rules.get(0);
                String _name = _get.getName();
                _builder.append(_name, "");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("de.hub.randomemf.runtime.References.resolveReferences(this, model);");
                _builder.newLine();
                _builder.append("return model;");
                _builder.newLine();
              }
            };
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _jvmType_1, _function);
        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _typeRef_1 = RandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(EObject.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = RandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(EObject.class);
            JvmFormalParameter _parameter = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "proxy", _typeRef);
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (proxy == null) return null;");
                _builder.newLine();
                _builder.append("String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();");
                _builder.newLine();
                {
                  EList<ClassRule> _rules = element.getRules();
                  for(final ClassRule classRule : _rules) {
                    {
                      EList<FeatureRule> _rules_1 = classRule.getRules();
                      int _size = _rules_1.size();
                      int _minus = (_size - 1);
                      IntegerRange _upTo = new IntegerRange(0, _minus);
                      for(final Integer index : _upTo) {
                        EList<FeatureRule> _rules_2 = classRule.getRules();
                        final FeatureRule featureRule = _rules_2.get((index).intValue());
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _and = false;
                          EStructuralFeature _eFeature = featureRule.getEFeature();
                          if (!(_eFeature instanceof EReference)) {
                            _and = false;
                          } else {
                            EStructuralFeature _eFeature_1 = featureRule.getEFeature();
                            boolean _isContainment = ((EReference) _eFeature_1).isContainment();
                            boolean _not = (!_isContainment);
                            _and = _not;
                          }
                          if (_and) {
                            _builder.append("if (uri.equals(\"");
                            String _syntheticFeaturRuleExprName = RandomEMFJvmModelInferrer.this.syntheticFeaturRuleExprName(featureRule, "expr", (index).intValue());
                            _builder.append(_syntheticFeaturRuleExprName, "");
                            _builder.append("\")) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("return ");
                            String _callSyntheticFeaturRuleExpr = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "expr", (index).intValue());
                            _builder.append(_callSyntheticFeaturRuleExpr, "\t");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                  }
                }
                _builder.append("return null;");
                _builder.newLine();
              }
            };
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "resolve", _typeRef_1, _function_1);
        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
        EList<ClassRule> _rules_2 = element.getRules();
        for (final ClassRule classRule : _rules_2) {
          {
            EList<FeatureRule> _rules_3 = classRule.getRules();
            int _size = _rules_3.size();
            int _minus = (_size - 1);
            IntegerRange _upTo = new IntegerRange(0, _minus);
            for (final Integer index : _upTo) {
              {
                EList<FeatureRule> _rules_4 = classRule.getRules();
                final FeatureRule featureRule = _rules_4.get((index).intValue());
                EList<JvmMember> _members_3 = it.getMembers();
                String _syntheticFeaturRuleExprName = RandomEMFJvmModelInferrer.this.syntheticFeaturRuleExprName(featureRule, "expr", (index).intValue());
                EStructuralFeature _eFeature = featureRule.getEFeature();
                EClassifier _eType = _eFeature.getEType();
                JvmTypeReference _jvmType_2 = RandomEMFJvmModelInferrer.this.jvmType(_eType);
                final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EStructuralFeature _eFeature = featureRule.getEFeature();
                    boolean _isRef = RandomEMFJvmModelInferrer.this.isRef(_eFeature);
                    boolean _not = (!_isRef);
                    if (_not) {
                      EList<JvmFormalParameter> _params = classRule.getParams();
                      for (final JvmFormalParameter param : _params) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        String _name = param.getName();
                        JvmTypeReference _parameterType = param.getParameterType();
                        JvmFormalParameter _parameter = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      }
                    }
                    it.setVisibility(JvmVisibility.PRIVATE);
                    XExpression _expr = featureRule.getExpr();
                    RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expr);
                  }
                };
                JvmOperation _method_2 = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(featureRule, _syntheticFeaturRuleExprName, _jvmType_2, _function_2);
                RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_2);
                XExpression _multiplicityExpr = featureRule.getMultiplicityExpr();
                boolean _notEquals = (!Objects.equal(_multiplicityExpr, null));
                if (_notEquals) {
                  EList<JvmMember> _members_4 = it.getMembers();
                  String _syntheticFeaturRuleExprName_1 = RandomEMFJvmModelInferrer.this.syntheticFeaturRuleExprName(featureRule, "multiExpr", (index).intValue());
                  JvmTypeReference _typeRef_2 = RandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(Integer.class);
                  final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _params = classRule.getParams();
                      for (final JvmFormalParameter param : _params) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        String _name = param.getName();
                        JvmTypeReference _parameterType = param.getParameterType();
                        JvmFormalParameter _parameter = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                        RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      }
                      it.setVisibility(JvmVisibility.PRIVATE);
                      XExpression _multiplicityExpr = featureRule.getMultiplicityExpr();
                      RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _multiplicityExpr);
                    }
                  };
                  JvmOperation _method_3 = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(featureRule, _syntheticFeaturRuleExprName_1, _typeRef_2, _function_3);
                  RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_3);
                }
              }
            }
            EList<JvmMember> _members_3 = it.getMembers();
            String _name = classRule.getName();
            EClass _eClass_2 = classRule.getEClass();
            JvmTypeReference _jvmType_2 = RandomEMFJvmModelInferrer.this.jvmType(_eClass_2);
            final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                it.setVisibility(JvmVisibility.PRIVATE);
                EList<JvmFormalParameter> _params = classRule.getParams();
                for (final JvmFormalParameter param : _params) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  String _name = param.getName();
                  JvmTypeReference _parameterType = param.getParameterType();
                  JvmFormalParameter _parameter = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                  RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    EClass _eClass = classRule.getEClass();
                    JvmTypeReference _jvmType = RandomEMFJvmModelInferrer.this.jvmType(_eClass);
                    String _identifier = _jvmType.getIdentifier();
                    _builder.append(_identifier, "");
                    _builder.append(" result = ");
                    EClass _eClass_1 = classRule.getEClass();
                    String _eFactoryInterfaceName = RandomEMFJvmModelInferrer.this._genModelHelper.getEFactoryInterfaceName(_eClass_1);
                    _builder.append(_eFactoryInterfaceName, "");
                    _builder.append(".eINSTANCE.create");
                    EClass _eClass_2 = classRule.getEClass();
                    String _name = _eClass_2.getName();
                    String _firstUpper = StringExtensions.toFirstUpper(_name);
                    _builder.append(_firstUpper, "");
                    _builder.append("();\t\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    {
                      EList<ClassRule> _rules = element.getRules();
                      ClassRule _get = _rules.get(0);
                      boolean _equals = Objects.equal(classRule, _get);
                      if (_equals) {
                        _builder.append("model = result;");
                        _builder.newLine();
                      }
                    }
                    {
                      EList<FeatureRule> _rules_1 = classRule.getRules();
                      int _size = _rules_1.size();
                      int _minus = (_size - 1);
                      IntegerRange _upTo = new IntegerRange(0, _minus);
                      for(final Integer index : _upTo) {
                        EList<FeatureRule> _rules_2 = classRule.getRules();
                        final FeatureRule featureRule = _rules_2.get((index).intValue());
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _isIsAddRule = featureRule.isIsAddRule();
                          boolean _not = (!_isIsAddRule);
                          if (_not) {
                            _builder.append("result.eSet(result.eClass().getEStructuralFeature(");
                            EStructuralFeature _eFeature = featureRule.getEFeature();
                            int _featureID = _eFeature.getFeatureID();
                            _builder.append(_featureID, "");
                            _builder.append("), ");
                            String _generateFeatureRuleCall = RandomEMFJvmModelInferrer.this.generateFeatureRuleCall(featureRule, (index).intValue());
                            _builder.append(_generateFeatureRuleCall, "");
                            _builder.append(");\t\t");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("{");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(");
                            EStructuralFeature _eFeature_1 = featureRule.getEFeature();
                            int _featureID_1 = _eFeature_1.getFeatureID();
                            _builder.append(_featureID_1, "\t");
                            _builder.append("));");
                            _builder.newLineIfNotEmpty();
                            {
                              XExpression _multiplicityExpr = featureRule.getMultiplicityExpr();
                              boolean _equals_1 = Objects.equal(_multiplicityExpr, null);
                              if (_equals_1) {
                                _builder.append("\t");
                                _builder.append("values.add(");
                                String _generateFeatureRuleCall_1 = RandomEMFJvmModelInferrer.this.generateFeatureRuleCall(featureRule, (index).intValue());
                                _builder.append(_generateFeatureRuleCall_1, "\t");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("int iterations = ");
                                String _callSyntheticFeaturRuleExpr = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "multiExpr", (index).intValue());
                                _builder.append(_callSyntheticFeaturRuleExpr, "\t");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("for (int i = 0; i < iterations; i++) {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("values.add(");
                                String _generateFeatureRuleCall_2 = RandomEMFJvmModelInferrer.this.generateFeatureRuleCall(featureRule, (index).intValue());
                                _builder.append(_generateFeatureRuleCall_2, "\t\t");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
                            _builder.append("}");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                    _builder.append("return result;");
                    _builder.newLine();
                  }
                };
                RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
              }
            };
            JvmOperation _method_2 = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(classRule, _name, _jvmType_2, _function_2);
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_2);
          }
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public String generateFeatureRuleCall(final FeatureRule featureRule, final int index) {
    EStructuralFeature _eFeature = featureRule.getEFeature();
    boolean _isRef = this.isRef(_eFeature);
    if (_isRef) {
      EClass type = featureRule.getConcreteValueType();
      EClass _concreteValueType = featureRule.getConcreteValueType();
      boolean _equals = Objects.equal(_concreteValueType, null);
      if (_equals) {
        EStructuralFeature _eFeature_1 = featureRule.getEFeature();
        EClassifier _eType = _eFeature_1.getEType();
        type = ((EClass) _eType);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("de.hub.randomemf.runtime.References.createProxy(");
      EStructuralFeature _eFeature_2 = featureRule.getEFeature();
      EClassifier _eType_1 = _eFeature_2.getEType();
      String _eFactoryInterfaceName = this._genModelHelper.getEFactoryInterfaceName(((EClass) _eType_1));
      _builder.append(_eFactoryInterfaceName, "");
      _builder.append(".eINSTANCE.create");
      String _name = type.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder.append(_firstUpper, "");
      _builder.append("(), \"");
      String _syntheticFeaturRuleExprName = this.syntheticFeaturRuleExprName(featureRule, "expr", index);
      _builder.append(_syntheticFeaturRuleExprName, "");
      _builder.append("\")");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _callSyntheticFeaturRuleExpr = this.callSyntheticFeaturRuleExpr(featureRule, "expr", index);
      _builder_1.append(_callSyntheticFeaturRuleExpr, "");
      return _builder_1.toString();
    }
  }
  
  public JvmTypeReference jvmType(final EClassifier classifier) {
    String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(classifier);
    return this.typeReferences.getTypeForName(_javaInterfaceName, classifier, null);
  }
  
  public String callSyntheticFeaturRuleExpr(final FeatureRule rule, final String ext, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    String _syntheticFeaturRuleExprName = this.syntheticFeaturRuleExprName(rule, ext, index);
    _builder.append(_syntheticFeaturRuleExprName, "");
    _builder.append("(");
    {
      EStructuralFeature _eFeature = rule.getEFeature();
      boolean _isRef = this.isRef(_eFeature);
      boolean _not = (!_isRef);
      if (_not) {
        {
          EObject _eContainer = rule.eContainer();
          EList<JvmFormalParameter> _params = ((ClassRule) _eContainer).getParams();
          boolean _hasElements = false;
          for(final JvmFormalParameter p : _params) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name = p.getName();
            _builder.append(_name, "");
          }
        }
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public String syntheticFeaturRuleExprName(final FeatureRule rule, final String ext, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_");
    EObject _eContainer = rule.eContainer();
    String _name = ((ClassRule) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append("_");
    EStructuralFeature _eFeature = rule.getEFeature();
    String _name_1 = _eFeature.getName();
    _builder.append(_name_1, "");
    _builder.append("_");
    _builder.append(ext, "");
    _builder.append(index, "");
    return _builder.toString();
  }
  
  public boolean isRef(final EStructuralFeature feature) {
    boolean _and = false;
    if (!(feature instanceof EReference)) {
      _and = false;
    } else {
      boolean _isContainment = ((EReference) feature).isContainment();
      boolean _not = (!_isContainment);
      _and = _not;
    }
    return _and;
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Generator) {
      _infer((Generator)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
