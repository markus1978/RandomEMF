package de.hub.randomemf.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.FeatureRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.util.GenModelHelper;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
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
  
  @Inject
  private XbaseCompiler xbaseCompiler;
  
  protected void _infer(final Generator element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    EList<String> _name = element.getName();
    String _get = _name.get(0);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _get);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<ClassRule> _rules = element.getRules();
        for (final ClassRule classRule : _rules) {
          {
            final EClass eClass = classRule.getEClass();
            final String javaInterfaceName = RandomEMFJvmModelInferrer.this._genModelHelper.getJavaInterfaceName(eClass);
            EList<JvmMember> _members = it.getMembers();
            String _name = classRule.getName();
            JvmTypeReference _typeForName = RandomEMFJvmModelInferrer.this.typeReferences.getTypeForName(javaInterfaceName, eClass, null);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  public void apply(final ITreeAppendable it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append(javaInterfaceName, "");
                    _builder.append(" result = ");
                    String _eFactoryInterfaceName = RandomEMFJvmModelInferrer.this._genModelHelper.getEFactoryInterfaceName(eClass);
                    _builder.append(_eFactoryInterfaceName, "");
                    _builder.append(".eINSTANCE.create");
                    String _name = eClass.getName();
                    String _firstUpper = StringExtensions.toFirstUpper(_name);
                    _builder.append(_firstUpper, "");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    {
                      EList<FeatureRule> _rules = classRule.getRules();
                      for(final FeatureRule featureRule : _rules) {
                        _builder.append("{");
                        _builder.newLine();
                        {
                          boolean _isIsAddRule = featureRule.isIsAddRule();
                          boolean _not = (!_isIsAddRule);
                          if (_not) {
                            _builder.append("\t");
                            _builder.append("result.eSet(result.eClass().getEStructuralFeature(");
                            EStructuralFeature _eFeature = featureRule.getEFeature();
                            int _featureID = _eFeature.getFeatureID();
                            _builder.append(_featureID, "	");
                            _builder.append("), ");
                            XExpression _expr = featureRule.getExpr();
                            EStructuralFeature _eFeature_1 = featureRule.getEFeature();
                            EClassifier _eType = _eFeature_1.getEType();
                            String _compileExpr = RandomEMFJvmModelInferrer.this.compileExpr(_expr, _eType);
                            _builder.append(_compileExpr, "	");
                            _builder.append(");\t\t");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("\t");
                            _builder.append("org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(");
                            EStructuralFeature _eFeature_2 = featureRule.getEFeature();
                            int _featureID_1 = _eFeature_2.getFeatureID();
                            _builder.append(_featureID_1, "	");
                            _builder.append("));");
                            _builder.newLineIfNotEmpty();
                            {
                              XExpression _multiplicityExpr = featureRule.getMultiplicityExpr();
                              boolean _equals = Objects.equal(_multiplicityExpr, null);
                              if (_equals) {
                                _builder.append("\t");
                                _builder.append("values.add(");
                                XExpression _expr_1 = featureRule.getExpr();
                                EStructuralFeature _eFeature_3 = featureRule.getEFeature();
                                EClassifier _eType_1 = _eFeature_3.getEType();
                                String _compileExpr_1 = RandomEMFJvmModelInferrer.this.compileExpr(_expr_1, _eType_1);
                                _builder.append(_compileExpr_1, "	");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("int iterations = ");
                                XExpression _multiplicityExpr_1 = featureRule.getMultiplicityExpr();
                                String _compileExpr_2 = RandomEMFJvmModelInferrer.this.compileExpr(_multiplicityExpr_1, Integer.class, element);
                                _builder.append(_compileExpr_2, "	");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("for (int i = 0; i < iterations; i++) {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("values.add(");
                                XExpression _expr_2 = featureRule.getExpr();
                                EStructuralFeature _eFeature_4 = featureRule.getEFeature();
                                EClassifier _eType_2 = _eFeature_4.getEType();
                                String _compileExpr_3 = RandomEMFJvmModelInferrer.this.compileExpr(_expr_2, _eType_2);
                                _builder.append(_compileExpr_3, "		");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
                          }
                        }
                        _builder.append("}");
                        _builder.newLine();
                      }
                    }
                    _builder.append("return result;");
                    _builder.newLine();
                    it.append(_builder);
                  }
                };
                RandomEMFJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
            JvmOperation _method = RandomEMFJvmModelInferrer.this._jvmTypesBuilder.toMethod(classRule, _name, _typeForName, _function);
            RandomEMFJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        }
      }
    };
    _accept.initializeLater(_function);
  }
  
  public String compileExpr(final XExpression expr, final EClassifier type) {
    FakeTreeAppendable _fakeTreeAppendable = new FakeTreeAppendable();
    final FakeTreeAppendable appendable = _fakeTreeAppendable;
    String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(type);
    JvmTypeReference _typeForName = this.typeReferences.getTypeForName(_javaInterfaceName, type, null);
    this.xbaseCompiler.compileAsJavaExpression(expr, appendable, _typeForName);
    return appendable.toString();
  }
  
  public String compileExpr(final XExpression expr, final Class clazz, final EObject context) {
    FakeTreeAppendable _fakeTreeAppendable = new FakeTreeAppendable();
    final FakeTreeAppendable appendable = _fakeTreeAppendable;
    Class<? extends RandomEMFJvmModelInferrer> _class = this.getClass();
    String _canonicalName = _class.getCanonicalName();
    JvmTypeReference _typeForName = this.typeReferences.getTypeForName(_canonicalName, context, null);
    this.xbaseCompiler.compileAsJavaExpression(expr, appendable, _typeForName);
    return appendable.toString();
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
