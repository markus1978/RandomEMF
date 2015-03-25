package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Ocl;
import de.hub.randomemf.runtime.Random;
import de.hub.rcore.example.ELPredefinitions;
import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELBlockStatement;
import de.hub.rcore.example.el.ELCall;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELExpression;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELLiteral;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELModel;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ELStatement;
import de.hub.rcore.example.el.ELVariable;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class SyntheticEL implements IGenerator {
  private ELModel model;
  
  private java.lang.Integer depth = 0;
  
  @java.lang.Override
  public ELModel generate() {
    root();
    de.hub.randomemf.runtime.References.resolveReferences(this, model);
    return model;
  }
  
  public ELModel root() {
    depth += 1;
    de.hub.rcore.example.el.ELModel result = new Root().generate();
    depth -= 1;
    return result;
  }
  
  private class Root {
    private ELModel self;
    
    public Root() {
      
    }
    
    public ELPackage call_0() {
      return callExpr_0();
    }
    
    public ELPackage callExpr_0() {
      ELPackage _pkg = ELPredefinitions.pkg(this.self);
      return _pkg;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELPackage call_1() {
      return callExpr_1();
    }
    
    public ELPackage callExpr_1() {
      ELPackage _Package = SyntheticEL.this.Package();
      return _Package;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(1);
    }
    
    public ELModel generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELModel();
      model = self;
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("packages"));	
      	int iterations = number_0();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_0());
      	}
      }
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("packages"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
      	}
      }
      return self;
    }
  }
  
  public ELPackage Package() {
    depth += 1;
    de.hub.rcore.example.el.ELPackage result = new Package().generate();
    depth -= 1;
    return result;
  }
  
  private class Package {
    private ELPackage self;
    
    public Package() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(3, 2);
      java.lang.String _ClassName = Random.ClassName(_Normal);
      java.lang.String _lowerCase = _ClassName.toLowerCase();
      return _lowerCase;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELClass call_1() {
      return callExpr_1();
    }
    
    public ELClass callExpr_1() {
      ELClass _Class = SyntheticEL.this.Class();
      return _Class;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(8);
    }
    
    public ELPackage generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELPackage();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("classes"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
      	}
      }
      return self;
    }
  }
  
  public ELClass Class() {
    depth += 1;
    de.hub.rcore.example.el.ELClass result = new Class().generate();
    depth -= 1;
    return result;
  }
  
  private class Class {
    private ELClass self;
    
    public Class() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(4, 2);
      java.lang.String _ClassName = Random.ClassName(_Normal);
      return _ClassName;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELField call_1() {
      return callExpr_1();
    }
    
    public ELField callExpr_1() {
      ELField _Field = SyntheticEL.this.Field();
      return _Field;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(3);
    }
    
    public ELMethod call_2() {
      return callExpr_2();
    }
    
    public ELMethod callExpr_2() {
      ELMethod _Method = SyntheticEL.this.Method();
      return _Method;
    }
    
    public java.lang.Integer number_2() {
      return java.lang.Integer.valueOf(6);
    }
    
    public ELClass call_3() {
      return callExpr_3();
    }
    
    public ELClass callExpr_3() {
      ELClass _Class = SyntheticEL.this.Class();
      return _Class;
    }
    
    public java.lang.Integer number_3() {
      int _xifexpression = (int) 0;
      boolean _and = false;
      if (!((SyntheticEL.this.depth).intValue() < 4)) {
        _and = false;
      } else {
        EList<ELClass> _innerClasses = this.self.getInnerClasses();
        int _size = _innerClasses.size();
        int _modulo = (_size % 3);
        boolean _equals = (_modulo == 0);
        _and = _equals;
      }
      if (_and) {
        _xifexpression = 1;
      } else {
        _xifexpression = 0;
      }
      return java.lang.Integer.valueOf(_xifexpression);
    }
    
    public ELClass generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELClass();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("fields"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
      	}
      }
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("methods"));	
      	int iterations = number_2();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_2());
      	}
      }
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("innerClasses"));	
      	int iterations = number_3();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_3());
      	}
      }
      return self;
    }
  }
  
  public ELField Field() {
    depth += 1;
    de.hub.rcore.example.el.ELField result = new Field().generate();
    depth -= 1;
    return result;
  }
  
  private class Field {
    private ELField self;
    
    public Field() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(4, 2);
      java.lang.String _VarName = Random.VarName(_Normal);
      return _VarName;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.Boolean call_1() {
      return callExpr_1();
    }
    
    public java.lang.Boolean callExpr_1() {
      return java.lang.Boolean.valueOf(false);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELClass call_2() {
      return callExpr_2();
    }
    
    public ELClass callExpr_2() {
      EList<ELPackage> _packages = SyntheticEL.this.model.getPackages();
      final Function1<ELPackage, EList<ELClass>> _function = new Function1<ELPackage, EList<ELClass>>() {
        public EList<ELClass> apply(final ELPackage it) {
          return it.getClasses();
        }
      };
      ArrayList<ELClass> _collectAll = Ocl.<ELPackage, ELClass>collectAll(_packages, _function);
      ELClass _Uniform = Random.<ELClass>Uniform(_collectAll);
      return _Uniform;
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public ELField generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELField();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("array"), call_1());		
      self.eSet(self.eClass().getEStructuralFeature("type"), call_2());		
      return self;
    }
  }
  
  public ELVariable Variable() {
    depth += 1;
    de.hub.rcore.example.el.ELVariable result = new Variable().generate();
    depth -= 1;
    return result;
  }
  
  private class Variable {
    private ELVariable self;
    
    public Variable() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(2, 1);
      java.lang.String _VarName = Random.VarName(_Normal);
      return _VarName;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.Boolean call_1() {
      return callExpr_1();
    }
    
    public java.lang.Boolean callExpr_1() {
      return java.lang.Boolean.valueOf(false);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELClass call_2() {
      return callExpr_2();
    }
    
    public ELClass callExpr_2() {
      EList<ELPackage> _packages = SyntheticEL.this.model.getPackages();
      final Function1<ELPackage, EList<ELClass>> _function = new Function1<ELPackage, EList<ELClass>>() {
        public EList<ELClass> apply(final ELPackage it) {
          return it.getClasses();
        }
      };
      ArrayList<ELClass> _collectAll = Ocl.<ELPackage, ELClass>collectAll(_packages, _function);
      ELClass _Uniform = Random.<ELClass>Uniform(_collectAll);
      return _Uniform;
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public ELVariable generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELVariable();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("array"), call_1());		
      self.eSet(self.eClass().getEStructuralFeature("type"), call_2());		
      return self;
    }
  }
  
  public ELMethod Method() {
    depth += 1;
    de.hub.rcore.example.el.ELMethod result = new Method().generate();
    depth -= 1;
    return result;
  }
  
  private class Method {
    private ELMethod self;
    
    public Method() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(5, 3);
      java.lang.String _MethodName = Random.MethodName(_Normal);
      return _MethodName;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELClass call_1() {
      return callExpr_1();
    }
    
    public ELClass callExpr_1() {
      ELClass _xifexpression = null;
      boolean _UniformBool = Random.UniformBool(0.3);
      if (_UniformBool) {
        _xifexpression = null;
      } else {
        EList<ELPackage> _packages = SyntheticEL.this.model.getPackages();
        final Function1<ELPackage, EList<ELClass>> _function = new Function1<ELPackage, EList<ELClass>>() {
          public EList<ELClass> apply(final ELPackage it) {
            return it.getClasses();
          }
        };
        ArrayList<ELClass> _collectAll = Ocl.<ELPackage, ELClass>collectAll(_packages, _function);
        _xifexpression = Random.<ELClass>Uniform(_collectAll);
      }
      return _xifexpression;
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELVariable call_2() {
      return callExpr_2();
    }
    
    public ELVariable callExpr_2() {
      ELVariable _Variable = SyntheticEL.this.Variable();
      return _Variable;
    }
    
    public java.lang.Integer number_2() {
      return java.lang.Integer.valueOf(2);
    }
    
    public ELBlock call_3() {
      return callExpr_3();
    }
    
    public ELBlock callExpr_3() {
      ELBlock _Block = SyntheticEL.this.Block();
      return _Block;
    }
    
    public java.lang.Integer number_3() {
      return 1;
    }
    
    public ELMethod generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELMethod();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("type"), call_1());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("parameters"));	
      	int iterations = number_2();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_2());
      	}
      }
      self.eSet(self.eClass().getEStructuralFeature("block"), call_3());		
      return self;
    }
  }
  
  public ELBlock Block() {
    depth += 1;
    de.hub.rcore.example.el.ELBlock result = new Block().generate();
    depth -= 1;
    return result;
  }
  
  private class Block {
    private ELBlock self;
    
    public Block() {
      
    }
    
    public ELStatement call_0() {
      return callExpr_0();
    }
    
    public ELStatement callExpr_0() {
      ELStatement _xifexpression = null;
      if (((SyntheticEL.this.depth).intValue() < 7)) {
        _xifexpression = SyntheticEL.this.BlockStatement();
      } else {
        _xifexpression = SyntheticEL.this.Literal();
      }
      return _xifexpression;
    }
    
    public java.lang.Integer number_0() {
      return java.lang.Integer.valueOf(2);
    }
    
    public ELBlock generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELBlock();
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("statements"));	
      	int iterations = number_0();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_0());
      	}
      }
      return self;
    }
  }
  
  public ELBlockStatement BlockStatement() {
    depth += 1;
    de.hub.rcore.example.el.ELBlockStatement result = new BlockStatement().generate();
    depth -= 1;
    return result;
  }
  
  private class BlockStatement {
    private ELBlockStatement self;
    
    public BlockStatement() {
      
    }
    
    public ELBlockStarementKind call_0() {
      return callExpr_0();
    }
    
    public ELBlockStarementKind callExpr_0() {
      EList<ELBlockStarementKind> _blocks = SyntheticEL.this.model.getBlocks();
      ELBlockStarementKind _get = _blocks.get(((SyntheticEL.this.depth).intValue() % 3));
      return _get;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELBlock call_1() {
      return callExpr_1();
    }
    
    public ELBlock callExpr_1() {
      ELBlock _Block = SyntheticEL.this.Block();
      return _Block;
    }
    
    public java.lang.Integer number_1() {
      ELBlockStarementKind _kind = this.self.getKind();
      int _blocks = _kind.getBlocks();
      return java.lang.Integer.valueOf(_blocks);
    }
    
    public ELExpression call_2() {
      return callExpr_2();
    }
    
    public ELExpression callExpr_2() {
      ELExpression _xifexpression = null;
      if (((SyntheticEL.this.depth).intValue() < 9)) {
        _xifexpression = SyntheticEL.this.MethodCall();
      } else {
        _xifexpression = SyntheticEL.this.Literal();
      }
      return _xifexpression;
    }
    
    public java.lang.Integer number_2() {
      ELBlockStarementKind _kind = this.self.getKind();
      int _expressions = _kind.getExpressions();
      return java.lang.Integer.valueOf(_expressions);
    }
    
    public ELBlockStatement generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELBlockStatement();
      self.eSet(self.eClass().getEStructuralFeature("kind"), call_0());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("block"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
      	}
      }
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("expressions"));	
      	int iterations = number_2();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_2());
      	}
      }
      return self;
    }
  }
  
  public ELLiteral Literal() {
    depth += 1;
    de.hub.rcore.example.el.ELLiteral result = new Literal().generate();
    depth -= 1;
    return result;
  }
  
  private class Literal {
    private ELLiteral self;
    
    public Literal() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      boolean _UniformBool = Random.UniformBool(0.5);
      java.lang.String _plus = ("" + java.lang.Boolean.valueOf(_UniformBool));
      return _plus;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELLiteral generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELLiteral();
      self.eSet(self.eClass().getEStructuralFeature("value"), call_0());		
      return self;
    }
  }
  
  public ELCall MethodCall() {
    depth += 1;
    de.hub.rcore.example.el.ELCall result = new MethodCall().generate();
    depth -= 1;
    return result;
  }
  
  private class MethodCall {
    private ELCall self;
    
    public MethodCall() {
      
    }
    
    public ELMethod call_0() {
      return de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELMethod(), "MethodCall_0");	
    }
    
    public ELMethod callExpr_0() {
      EList<ELPackage> _packages = SyntheticEL.this.model.getPackages();
      final Function1<ELPackage, ArrayList<ELMethod>> _function = new Function1<ELPackage, ArrayList<ELMethod>>() {
        public ArrayList<ELMethod> apply(final ELPackage it) {
          EList<ELClass> _classes = it.getClasses();
          final Function1<ELClass, EList<ELMethod>> _function = new Function1<ELClass, EList<ELMethod>>() {
            public EList<ELMethod> apply(final ELClass it) {
              return it.getMethods();
            }
          };
          return Ocl.<ELClass, ELMethod>collectAll(_classes, _function);
        }
      };
      ArrayList<ELMethod> _collectAll = Ocl.<ELPackage, ELMethod>collectAll(_packages, _function);
      ELMethod _Uniform = Random.<ELMethod>Uniform(_collectAll);
      return _Uniform;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELExpression call_1() {
      return callExpr_1();
    }
    
    public ELExpression callExpr_1() {
      ELExpression _xifexpression = null;
      if (((SyntheticEL.this.depth).intValue() < 9)) {
        _xifexpression = SyntheticEL.this.MethodCall();
      } else {
        _xifexpression = SyntheticEL.this.Literal();
      }
      return _xifexpression;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(2);
    }
    
    public ELCall generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELCall();
      self.eSet(self.eClass().getEStructuralFeature("callee"), call_0());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("arguments"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
      	}
      }
      return self;
    }
  }
  
  @java.lang.Override
  public EObject resolve(final EObject proxy, final EObject source) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("Field_2")) {
    	Field rule = new Field();
    	rule.self = (de.hub.rcore.example.el.ELField)source;
    	return rule.callExpr_2();
    }
    if (uri.equals("Variable_2")) {
    	Variable rule = new Variable();
    	rule.self = (de.hub.rcore.example.el.ELVariable)source;
    	return rule.callExpr_2();
    }
    if (uri.equals("Method_1")) {
    	Method rule = new Method();
    	rule.self = (de.hub.rcore.example.el.ELMethod)source;
    	return rule.callExpr_1();
    }
    if (uri.equals("BlockStatement_0")) {
    	BlockStatement rule = new BlockStatement();
    	rule.self = (de.hub.rcore.example.el.ELBlockStatement)source;
    	return rule.callExpr_0();
    }
    if (uri.equals("MethodCall_0")) {
    	MethodCall rule = new MethodCall();
    	rule.self = (de.hub.rcore.example.el.ELCall)source;
    	return rule.callExpr_0();
    }
    return null;
  }
}
