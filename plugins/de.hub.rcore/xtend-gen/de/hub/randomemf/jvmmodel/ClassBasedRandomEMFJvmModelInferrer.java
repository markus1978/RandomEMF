package de.hub.randomemf.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.hub.randomemf.jvmmodel.GenModelHelper;
import de.hub.randomemf.randomEMF.AbstractRule;
import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.randomEMF.InnerRule;
import de.hub.randomemf.runtime.IGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ClassBasedRandomEMFJvmModelInferrer extends AbstractModelInferrer {
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
        JvmTypeReference _typeRef = ClassBasedRandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(IGenerator.class);
        ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        EList<JvmMember> _members = it.getMembers();
        EList<AbstractRule> _rules = element.getRules();
        AbstractRule _get = _rules.get(0);
        EClass _eClass = _get.getEClass();
        JvmTypeReference _jvmType = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass);
        JvmField _field = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toField(element, "model", _jvmType);
        ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeRef_1 = ClassBasedRandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(Integer.class);
        final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("0");
              }
            };
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toField(element, "depth", _typeRef_1, _function);
        ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        EList<AbstractRule> _rules_1 = element.getRules();
        AbstractRule _get_1 = _rules_1.get(0);
        EClass _eClass_1 = _get_1.getEClass();
        JvmTypeReference _jvmType_1 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass_1);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                EList<AbstractRule> _rules = element.getRules();
                AbstractRule _get = _rules.get(0);
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
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _jvmType_1, _function_1);
        ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
        EList<AbstractRule> _rules_2 = element.getRules();
        for (final AbstractRule rule : _rules_2) {
          {
            EList<JvmMember> _members_3 = it.getMembers();
            String _name = rule.getName();
            EClass _eClass_2 = rule.getEClass();
            JvmTypeReference _jvmType_2 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass_2);
            final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _params = rule.getParams();
                for (final JvmFormalParameter param : _params) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  String _name = param.getName();
                  JvmTypeReference _parameterType = param.getParameterType();
                  JvmFormalParameter _parameter = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                  ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("depth += 1;");
                    _builder.newLine();
                    EClass _eClass = rule.getEClass();
                    JvmTypeReference _jvmType = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass);
                    String _identifier = _jvmType.getIdentifier();
                    _builder.append(_identifier, "");
                    _builder.append(" result = new ");
                    String _name = rule.getName();
                    String _firstUpper = StringExtensions.toFirstUpper(_name);
                    _builder.append(_firstUpper, "");
                    _builder.append("(");
                    {
                      EList<JvmFormalParameter> _params = rule.getParams();
                      boolean _hasElements = false;
                      for(final JvmFormalParameter p : _params) {
                        if (!_hasElements) {
                          _hasElements = true;
                        } else {
                          _builder.appendImmediate(", ", "");
                        }
                        String _name_1 = p.getName();
                        _builder.append(_name_1, "");
                      }
                    }
                    _builder.append(").generate();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("depth -= 1;");
                    _builder.newLine();
                    _builder.append("return result;");
                    _builder.newLine();
                  }
                };
                ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
              }
            };
            JvmOperation _method_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(rule, _name, _jvmType_2, _function_2);
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
            EList<JvmMember> _members_4 = it.getMembers();
            String _name_1 = rule.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
            final Procedure1<JvmGenericType> _function_3 = new Procedure1<JvmGenericType>() {
              public void apply(final JvmGenericType it) {
                it.setVisibility(JvmVisibility.PRIVATE);
                EList<JvmMember> _members = it.getMembers();
                EClass _eClass = rule.getEClass();
                JvmTypeReference _jvmType = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass);
                JvmField _field = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toField(rule, "self", _jvmType);
                ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
                EList<JvmFormalParameter> _params = rule.getParams();
                for (final JvmFormalParameter param : _params) {
                  EList<JvmMember> _members_1 = it.getMembers();
                  String _name = param.getName();
                  JvmTypeReference _parameterType = param.getParameterType();
                  JvmField _field_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toField(param, _name, _parameterType);
                  ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
                }
                EList<JvmMember> _members_2 = it.getMembers();
                final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                  public void apply(final JvmConstructor it) {
                    EList<JvmFormalParameter> _params = rule.getParams();
                    for (final JvmFormalParameter param : _params) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      String _name = param.getName();
                      JvmTypeReference _parameterType = param.getParameterType();
                      JvmFormalParameter _parameter = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                      ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    }
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        {
                          EList<JvmFormalParameter> _params = rule.getParams();
                          for(final JvmFormalParameter param : _params) {
                            _builder.append("this.");
                            String _name = param.getName();
                            _builder.append(_name, "");
                            _builder.append(" = ");
                            String _name_1 = param.getName();
                            _builder.append(_name_1, "");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    };
                    ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmConstructor _constructor = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toConstructor(rule, _function);
                ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
                EList<JvmFormalParameter> _params_1 = rule.getParams();
                boolean _isEmpty = _params_1.isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  EList<JvmMember> _members_3 = it.getMembers();
                  final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
                    public void apply(final JvmConstructor it) {
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        }
                      };
                      ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmConstructor _constructor_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toConstructor(rule, _function_1);
                  ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor_1);
                }
                for (int i = 0; (i < rule.getInners().size()); i++) {
                  {
                    EList<InnerRule> _inners = rule.getInners();
                    final InnerRule inner = _inners.get(i);
                    final int index = i;
                    EStructuralFeature _eFeature = inner.getEFeature();
                    boolean _notEquals = (!Objects.equal(_eFeature, null));
                    if (_notEquals) {
                      EList<JvmMember> _members_4 = it.getMembers();
                      EStructuralFeature _eFeature_1 = inner.getEFeature();
                      EClassifier _eType = _eFeature_1.getEType();
                      JvmTypeReference _jvmType_1 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eType);
                      final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          StringConcatenationClient _client = new StringConcatenationClient() {
                            @Override
                            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                              {
                                EStructuralFeature _eFeature = inner.getEFeature();
                                boolean _isRef = ClassBasedRandomEMFJvmModelInferrer.this.isRef(_eFeature);
                                if (_isRef) {
                                  EClass _xifexpression = null;
                                  EClass _concreteValueType = inner.getConcreteValueType();
                                  boolean _equals = Objects.equal(_concreteValueType, null);
                                  if (_equals) {
                                    EStructuralFeature _eFeature_1 = inner.getEFeature();
                                    EClassifier _eType = _eFeature_1.getEType();
                                    _xifexpression = ((EClass) _eType);
                                  } else {
                                    _xifexpression = inner.getConcreteValueType();
                                  }
                                  final EClass type = _xifexpression;
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("return de.hub.randomemf.runtime.References.createProxy(");
                                  String _eFactoryInterfaceName = ClassBasedRandomEMFJvmModelInferrer.this._genModelHelper.getEFactoryInterfaceName(type);
                                  _builder.append(_eFactoryInterfaceName, "");
                                  _builder.append(".eINSTANCE.create");
                                  String _name = type.getName();
                                  String _firstUpper = StringExtensions.toFirstUpper(_name);
                                  _builder.append(_firstUpper, "");
                                  _builder.append("(), \"");
                                  String _name_1 = rule.getName();
                                  _builder.append(_name_1, "");
                                  _builder.append("_");
                                  _builder.append(index, "");
                                  _builder.append("\");\t");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("return callExpr_");
                                  _builder.append(index, "");
                                  _builder.append("();");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          };
                          ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                        }
                      };
                      JvmOperation _method = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(inner, ("call_" + Integer.valueOf(index)), _jvmType_1, _function_2);
                      ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method);
                      EList<JvmMember> _members_5 = it.getMembers();
                      EStructuralFeature _eFeature_2 = inner.getEFeature();
                      EClassifier _eType_1 = _eFeature_2.getEType();
                      JvmTypeReference _jvmType_2 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eType_1);
                      final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          XExpression _expr = inner.getExpr();
                          ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expr);
                        }
                      };
                      JvmOperation _method_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(inner, ("callExpr_" + Integer.valueOf(i)), _jvmType_2, _function_3);
                      ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_1);
                    } else {
                      EList<JvmMember> _members_6 = it.getMembers();
                      EClass _eClass_1 = rule.getEClass();
                      JvmTypeReference _jvmType_3 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass_1);
                      final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          XExpression _expr = inner.getExpr();
                          ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expr);
                        }
                      };
                      JvmOperation _method_2 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(inner, ("call_" + Integer.valueOf(i)), _jvmType_3, _function_4);
                      ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _method_2);
                    }
                    EList<JvmMember> _members_7 = it.getMembers();
                    JvmTypeReference _typeRef = ClassBasedRandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(Integer.class);
                    final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        XExpression _number = inner.getNumber();
                        boolean _equals = Objects.equal(_number, null);
                        if (_equals) {
                          StringConcatenationClient _client = new StringConcatenationClient() {
                            @Override
                            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                              _builder.append("return 1;");
                            }
                          };
                          ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                        } else {
                          XExpression _number_1 = inner.getNumber();
                          ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _number_1);
                        }
                      }
                    };
                    JvmOperation _method_3 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(inner, ("number_" + Integer.valueOf(i)), _typeRef, _function_5);
                    ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _method_3);
                  }
                }
                EList<JvmMember> _members_4 = it.getMembers();
                EClass _eClass_1 = rule.getEClass();
                JvmTypeReference _jvmType_1 = ClassBasedRandomEMFJvmModelInferrer.this.jvmType(_eClass_1);
                final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        {
                          if ((rule instanceof ClassRule)) {
                            _builder.append("self = ");
                            EClass _eClass = ((ClassRule)rule).getEClass();
                            String _eFactoryInterfaceName = ClassBasedRandomEMFJvmModelInferrer.this._genModelHelper.getEFactoryInterfaceName(_eClass);
                            _builder.append(_eFactoryInterfaceName, "");
                            _builder.append(".eINSTANCE.create");
                            EClass _eClass_1 = ((ClassRule)rule).getEClass();
                            String _name = _eClass_1.getName();
                            String _firstUpper = StringExtensions.toFirstUpper(_name);
                            _builder.append(_firstUpper, "");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                            {
                              EObject _eContainer = ((ClassRule)rule).eContainer();
                              EList<AbstractRule> _rules = ((Generator) _eContainer).getRules();
                              AbstractRule _get = _rules.get(0);
                              boolean _equals = Objects.equal(_get, rule);
                              if (_equals) {
                                _builder.append("model = self;");
                                _builder.newLine();
                              }
                            }
                            {
                              EList<InnerRule> _inners = ((ClassRule)rule).getInners();
                              boolean _isEmpty = _inners.isEmpty();
                              boolean _not = (!_isEmpty);
                              if (_not) {
                                {
                                  EList<InnerRule> _inners_1 = ((ClassRule)rule).getInners();
                                  int _size = _inners_1.size();
                                  int _minus = (_size - 1);
                                  IntegerRange _upTo = new IntegerRange(0, _minus);
                                  for(final Integer index : _upTo) {
                                    EList<InnerRule> _inners_2 = ((ClassRule)rule).getInners();
                                    final InnerRule feature = _inners_2.get((index).intValue());
                                    _builder.newLineIfNotEmpty();
                                    {
                                      boolean _isIsAddRule = feature.isIsAddRule();
                                      boolean _not_1 = (!_isIsAddRule);
                                      if (_not_1) {
                                        _builder.append("self.eSet(self.eClass().getEStructuralFeature(");
                                        EStructuralFeature _eFeature = feature.getEFeature();
                                        int _featureID = _eFeature.getFeatureID();
                                        _builder.append(_featureID, "");
                                        _builder.append("), call_");
                                        _builder.append(index, "");
                                        _builder.append("());\t\t");
                                        _builder.newLineIfNotEmpty();
                                      } else {
                                        _builder.append("{");
                                        _builder.newLine();
                                        _builder.append("\t");
                                        _builder.append("org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature(");
                                        EStructuralFeature _eFeature_1 = feature.getEFeature();
                                        int _featureID_1 = _eFeature_1.getFeatureID();
                                        _builder.append(_featureID_1, "\t");
                                        _builder.append("));\t");
                                        _builder.newLineIfNotEmpty();
                                        _builder.append("\t");
                                        _builder.append("int iterations = number_");
                                        _builder.append(index, "\t");
                                        _builder.append("();");
                                        _builder.newLineIfNotEmpty();
                                        _builder.append("\t");
                                        _builder.append("for (int i = 0; i < iterations; i++) {");
                                        _builder.newLine();
                                        _builder.append("\t\t");
                                        _builder.append("values.add(call_");
                                        _builder.append(index, "\t\t");
                                        _builder.append("());");
                                        _builder.newLineIfNotEmpty();
                                        _builder.append("\t");
                                        _builder.append("}");
                                        _builder.newLine();
                                        _builder.append("}");
                                        _builder.newLine();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            _builder.append("return self;");
                            _builder.newLine();
                          } else {
                            _builder.append("int sum = 0;");
                            _builder.newLine();
                            {
                              EList<InnerRule> _inners_3 = rule.getInners();
                              int _size_1 = _inners_3.size();
                              int _minus_1 = (_size_1 - 1);
                              IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
                              for(final Integer index_1 : _upTo_1) {
                                _builder.append("sum += number_");
                                _builder.append(index_1, "");
                                _builder.append("();");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("int draw = Random.RandomInt(sum);");
                            _builder.newLine();
                            _builder.append("int current = 0;");
                            _builder.newLine();
                            {
                              EList<InnerRule> _inners_4 = rule.getInners();
                              int _size_2 = _inners_4.size();
                              int _minus_2 = (_size_2 - 1);
                              IntegerRange _upTo_2 = new IntegerRange(0, _minus_2);
                              for(final Integer index_2 : _upTo_2) {
                                _builder.append("current += number_");
                                _builder.append(index_2, "");
                                _builder.append("();");
                                _builder.newLineIfNotEmpty();
                                _builder.append("if (current >= draw) {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("return call_");
                                _builder.append(index_2, "\t");
                                _builder.append("();");
                                _builder.newLineIfNotEmpty();
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
                            _builder.append("throw new IllegalStateException(\"Unreachable!\");");
                            _builder.newLine();
                          }
                        }
                      }
                    };
                    ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(rule, "generate", _jvmType_1, _function_2);
                ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method);
              }
            };
            JvmGenericType _class = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toClass(rule, _firstUpper, _function_3);
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmGenericType>operator_add(_members_4, _class);
          }
        }
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _typeRef_2 = ClassBasedRandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(EObject.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = ClassBasedRandomEMFJvmModelInferrer.this._typeReferenceBuilder.typeRef(EObject.class);
            JvmFormalParameter _parameter = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "proxy", _typeRef);
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element, Override.class);
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (proxy == null) return null;");
                _builder.newLine();
                _builder.append("String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();");
                _builder.newLine();
                {
                  EList<AbstractRule> _rules = element.getRules();
                  final Function1<AbstractRule, Boolean> _function = new Function1<AbstractRule, Boolean>() {
                    public Boolean apply(final AbstractRule it) {
                      return Boolean.valueOf((it instanceof ClassRule));
                    }
                  };
                  Iterable<AbstractRule> _filter = IterableExtensions.<AbstractRule>filter(_rules, _function);
                  for(final AbstractRule rule : _filter) {
                    {
                      EList<InnerRule> _inners = rule.getInners();
                      boolean _isEmpty = _inners.isEmpty();
                      boolean _not = (!_isEmpty);
                      if (_not) {
                        {
                          EList<InnerRule> _inners_1 = rule.getInners();
                          int _size = _inners_1.size();
                          int _minus = (_size - 1);
                          IntegerRange _upTo = new IntegerRange(0, _minus);
                          for(final Integer index : _upTo) {
                            EList<InnerRule> _inners_2 = rule.getInners();
                            final InnerRule feature = _inners_2.get((index).intValue());
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _and = false;
                              EStructuralFeature _eFeature = feature.getEFeature();
                              if (!(_eFeature instanceof EReference)) {
                                _and = false;
                              } else {
                                EStructuralFeature _eFeature_1 = feature.getEFeature();
                                boolean _isContainment = ((EReference) _eFeature_1).isContainment();
                                boolean _not_1 = (!_isContainment);
                                _and = _not_1;
                              }
                              if (_and) {
                                _builder.append("if (uri.equals(\"");
                                String _name = rule.getName();
                                _builder.append(_name, "");
                                _builder.append("_");
                                _builder.append(index, "");
                                _builder.append("\")) {");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("return new ");
                                String _name_1 = rule.getName();
                                String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                                _builder.append(_firstUpper, "\t");
                                _builder.append("().callExpr_");
                                _builder.append(index, "\t");
                                _builder.append("();");
                                _builder.newLineIfNotEmpty();
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
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
            ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "resolve", _typeRef_2, _function_2);
        ClassBasedRandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public JvmTypeReference jvmType(final EClassifier classifier) {
    String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(classifier);
    return this.typeReferences.getTypeForName(_javaInterfaceName, classifier, null);
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
