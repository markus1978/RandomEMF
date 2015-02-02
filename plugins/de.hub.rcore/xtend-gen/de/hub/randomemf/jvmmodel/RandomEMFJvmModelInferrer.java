package de.hub.randomemf.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.hub.randomemf.jvmmodel.GenModelHelper;
import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.FeatureRule;
import de.hub.randomemf.randomEMF.Generator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
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
    EList<String> _name = element.getName();
    String _get = _name.get(0);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _get);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<ClassRule> _rules = element.getRules();
        for (final ClassRule classRule : _rules) {
          {
            EList<FeatureRule> _rules_1 = classRule.getRules();
            int _size = _rules_1.size();
            int _minus = (_size - 1);
            IntegerRange _upTo = new IntegerRange(0, _minus);
            for (final Integer index : _upTo) {
              {
                EList<FeatureRule> _rules_2 = classRule.getRules();
                final FeatureRule featureRule = _rules_2.get((index).intValue());
                EList<JvmMember> _members = it.getMembers();
                String _syntheticFeaturRuleExprName = RandomEMFJvmModelInferrer.this.syntheticFeaturRuleExprName(featureRule, "expr", (index).intValue());
                EStructuralFeature _eFeature = featureRule.getEFeature();
                EClassifier _eType = _eFeature.getEType();
                JvmTypeReference _jvmType = RandomEMFJvmModelInferrer.this.jvmType(_eType);
                final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
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
                    XExpression _expr = featureRule.getExpr();
                    RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expr);
                  }
                };
                JvmOperation _method = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(featureRule, _syntheticFeaturRuleExprName, _jvmType, _function);
                RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
                XExpression _multiplicityExpr = featureRule.getMultiplicityExpr();
                boolean _notEquals = (!Objects.equal(_multiplicityExpr, null));
                if (_notEquals) {
                  EList<JvmMember> _members_1 = it.getMembers();
                  String _syntheticFeaturRuleExprName_1 = RandomEMFJvmModelInferrer.this.syntheticFeaturRuleExprName(featureRule, "multiExpr", (index).intValue());
                  JvmTypeReference _typeRef = RandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(Integer.class);
                  final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
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
                  JvmOperation _method_1 = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(featureRule, _syntheticFeaturRuleExprName_1, _typeRef, _function_1);
                  RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
                }
              }
            }
            EList<JvmMember> _members = it.getMembers();
            String _name = classRule.getName();
            EClass _eClass = classRule.getEClass();
            JvmTypeReference _jvmType = RandomEMFJvmModelInferrer.this.jvmType(_eClass);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
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
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    {
                      EList<FeatureRule> _rules = classRule.getRules();
                      int _size = _rules.size();
                      int _minus = (_size - 1);
                      IntegerRange _upTo = new IntegerRange(0, _minus);
                      for(final Integer index : _upTo) {
                        EList<FeatureRule> _rules_1 = classRule.getRules();
                        final FeatureRule featureRule = _rules_1.get((index).intValue());
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
                            String _callSyntheticFeaturRuleExpr = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "expr", (index).intValue());
                            _builder.append(_callSyntheticFeaturRuleExpr, "");
                            _builder.append(");\t\t");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("{\t\t\t\t\t\t\t\t");
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
                              boolean _equals = Objects.equal(_multiplicityExpr, null);
                              if (_equals) {
                                _builder.append("\t");
                                _builder.append("values.add(");
                                String _callSyntheticFeaturRuleExpr_1 = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "expr", (index).intValue());
                                _builder.append(_callSyntheticFeaturRuleExpr_1, "\t");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("int iterations = ");
                                String _callSyntheticFeaturRuleExpr_2 = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "multiExpr", (index).intValue());
                                _builder.append(_callSyntheticFeaturRuleExpr_2, "\t");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("for (int i = 0; i < iterations; i++) {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("values.add(");
                                String _callSyntheticFeaturRuleExpr_3 = RandomEMFJvmModelInferrer.this.callSyntheticFeaturRuleExpr(featureRule, "expr", (index).intValue());
                                _builder.append(_callSyntheticFeaturRuleExpr_3, "\t\t");
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
            JvmOperation _method = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(classRule, _name, _jvmType, _function);
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
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
