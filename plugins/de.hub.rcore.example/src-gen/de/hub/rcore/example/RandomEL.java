package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Random;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ELVariable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class RandomEL implements IGenerator {
  private ELPackage model;
  
  public ELPackage generate() {
    Package();
    de.hub.randomemf.runtime.References.resolveReferences(this, model);
    return model;
  }
  
  @Override
  public EObject resolve(final EObject proxy) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("_Field_type_expr2")) {
    	return _Field_type_expr2();
    }
    if (uri.equals("_Variable_type_expr2")) {
    	return _Variable_type_expr2();
    }
    if (uri.equals("_Method_type_expr1")) {
    	return _Method_type_expr1();
    }
    return null;
  }
  
  private java.lang.String _Package_name_expr0() {
    int _Normal = Random.Normal(3, 2);
    String _ClassName = Random.ClassName(_Normal);
    return _ClassName;
  }
  
  private ELClass _Package_classes_expr1() {
    ELClass _Class = this.Class();
    return _Class;
  }
  
  private Integer _Package_classes_multiExpr1() {
    return Integer.valueOf(10);
  }
  
  private ELPackage Package() {
    de.hub.rcore.example.el.ELPackage result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELPackage();						
    model = result;
    result.eSet(result.eClass().getEStructuralFeature(0), _Package_name_expr0());		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(1));
    	int iterations = _Package_classes_multiExpr1();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Package_classes_expr1());
    	}
    }
    return result;
  }
  
  private java.lang.String _Class_name_expr0() {
    int _Normal = Random.Normal(4, 2);
    String _ClassName = Random.ClassName(_Normal);
    return _ClassName;
  }
  
  private ELField _Class_fields_expr1() {
    ELField _Field = this.Field();
    return _Field;
  }
  
  private Integer _Class_fields_multiExpr1() {
    int _Content = Random.Content();
    return Integer.valueOf(_Content);
  }
  
  private ELMethod _Class_methods_expr2() {
    ELMethod _Constructor = this.Constructor();
    return _Constructor;
  }
  
  private Integer _Class_methods_multiExpr2() {
    int _Content = Random.Content();
    double _multiply = (_Content * 0.5);
    return Integer.valueOf(((int) _multiply));
  }
  
  private ELMethod _Class_methods_expr3() {
    ELMethod _Method = this.Method();
    return _Method;
  }
  
  private Integer _Class_methods_multiExpr3() {
    int _Content = Random.Content();
    double _multiply = (_Content * 1.5);
    return Integer.valueOf(((int) _multiply));
  }
  
  private ELClass Class() {
    de.hub.rcore.example.el.ELClass result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELClass();						
    result.eSet(result.eClass().getEStructuralFeature(0), _Class_name_expr0());		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(2));
    	int iterations = _Class_fields_multiExpr1();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Class_fields_expr1());
    	}
    }
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(1));
    	int iterations = _Class_methods_multiExpr2();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Class_methods_expr2());
    	}
    }
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(1));
    	int iterations = _Class_methods_multiExpr3();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Class_methods_expr3());
    	}
    }
    return result;
  }
  
  private java.lang.String _Constructor_name_expr0() {
    return "new";
  }
  
  private ELVariable _Constructor_parameters_expr1() {
    ELVariable _Variable = this.Variable();
    return _Variable;
  }
  
  private Integer _Constructor_parameters_multiExpr1() {
    int _Content = Random.Content();
    double _multiply = (_Content * 0.4);
    return Integer.valueOf(((int) _multiply));
  }
  
  private ELMethod Constructor() {
    de.hub.rcore.example.el.ELMethod result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELMethod();						
    result.eSet(result.eClass().getEStructuralFeature(0), _Constructor_name_expr0());		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(3));
    	int iterations = _Constructor_parameters_multiExpr1();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Constructor_parameters_expr1());
    	}
    }
    return result;
  }
  
  private java.lang.String _Field_name_expr0() {
    int _Normal = Random.Normal(4, 2);
    String _VarName = Random.VarName(_Normal);
    return _VarName;
  }
  
  private java.lang.Boolean _Field_array_expr1() {
    boolean _UniformBool = Random.UniformBool(0.1);
    return Boolean.valueOf(_UniformBool);
  }
  
  private ELClass _Field_type_expr2() {
    EList<ELClass> _classes = this.model.getClasses();
    ELClass _Uniform = Random.<ELClass>Uniform(_classes);
    return _Uniform;
  }
  
  private ELField Field() {
    de.hub.rcore.example.el.ELField result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELField();						
    result.eSet(result.eClass().getEStructuralFeature(0), _Field_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(2), _Field_array_expr1());		
    result.eSet(result.eClass().getEStructuralFeature(1), de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELClass(), "_Field_type_expr2"));		
    return result;
  }
  
  private java.lang.String _Variable_name_expr0() {
    int _Normal = Random.Normal(2, 1);
    String _VarName = Random.VarName(_Normal);
    return _VarName;
  }
  
  private java.lang.Boolean _Variable_array_expr1() {
    boolean _UniformBool = Random.UniformBool(0.1);
    return Boolean.valueOf(_UniformBool);
  }
  
  private ELClass _Variable_type_expr2() {
    EList<ELClass> _classes = this.model.getClasses();
    ELClass _Uniform = Random.<ELClass>Uniform(_classes);
    return _Uniform;
  }
  
  private ELVariable Variable() {
    de.hub.rcore.example.el.ELVariable result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELVariable();						
    result.eSet(result.eClass().getEStructuralFeature(0), _Variable_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(2), _Variable_array_expr1());		
    result.eSet(result.eClass().getEStructuralFeature(1), de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELClass(), "_Variable_type_expr2"));		
    return result;
  }
  
  private java.lang.String _Method_name_expr0() {
    int _Normal = Random.Normal(5, 3);
    String _MethodName = Random.MethodName(_Normal);
    return _MethodName;
  }
  
  private ELClass _Method_type_expr1() {
    ELClass _xifexpression = null;
    boolean _UniformBool = Random.UniformBool(0.3);
    if (_UniformBool) {
      _xifexpression = null;
    } else {
      EList<ELClass> _classes = this.model.getClasses();
      _xifexpression = Random.<ELClass>Uniform(_classes);
    }
    return _xifexpression;
  }
  
  private ELVariable _Method_parameters_expr2() {
    ELVariable _Variable = this.Variable();
    return _Variable;
  }
  
  private Integer _Method_parameters_multiExpr2() {
    int _Content = Random.Content();
    double _multiply = (_Content * 0.6);
    return Integer.valueOf(((int) _multiply));
  }
  
  private ELMethod Method() {
    de.hub.rcore.example.el.ELMethod result = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELMethod();						
    result.eSet(result.eClass().getEStructuralFeature(0), _Method_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(1), de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELClass(), "_Method_type_expr1"));		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(3));
    	int iterations = _Method_parameters_multiExpr2();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_Method_parameters_expr2());
    	}
    }
    return result;
  }
}
