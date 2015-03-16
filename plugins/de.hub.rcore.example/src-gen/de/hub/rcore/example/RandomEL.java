package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Ocl;
import de.hub.randomemf.runtime.Random;
import de.hub.rcore.example.ELPredefinitions;
import de.hub.rcore.example.el.ELAccess;
import de.hub.rcore.example.el.ELAssignment;
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
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpCall;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ELStatement;
import de.hub.rcore.example.el.ELVariable;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class RandomEL implements IGenerator {
  private ELModel model;
  
  private java.lang.Integer depth = 0;
  
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
      ELPackage _Package = RandomEL.this.Package();
      return _Package;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(3);
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
      ELClass _Class = RandomEL.this.Class();
      return _Class;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(10);
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
      ELField _Field = RandomEL.this.Field();
      return _Field;
    }
    
    public java.lang.Integer number_1() {
      int _Content = Random.Content();
      return java.lang.Integer.valueOf(_Content);
    }
    
    public ELMethod call_2() {
      return callExpr_2();
    }
    
    public ELMethod callExpr_2() {
      ELMethod _Constructor = RandomEL.this.Constructor();
      return _Constructor;
    }
    
    public java.lang.Integer number_2() {
      int _Content = Random.Content();
      double _multiply = (_Content * 0.5);
      return java.lang.Integer.valueOf(((int) _multiply));
    }
    
    public ELMethod call_3() {
      return callExpr_3();
    }
    
    public ELMethod callExpr_3() {
      ELMethod _Method = RandomEL.this.Method();
      return _Method;
    }
    
    public java.lang.Integer number_3() {
      int _Content = Random.Content();
      double _multiply = (_Content * 1.5);
      return java.lang.Integer.valueOf(((int) _multiply));
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
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("methods"));	
      	int iterations = number_3();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_3());
      	}
      }
      return self;
    }
  }
  
  public ELMethod Constructor() {
    depth += 1;
    de.hub.rcore.example.el.ELMethod result = new Constructor().generate();
    depth -= 1;
    return result;
  }
  
  private class Constructor {
    private ELMethod self;
    
    public Constructor() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      return "new";
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELVariable call_1() {
      return callExpr_1();
    }
    
    public ELVariable callExpr_1() {
      ELVariable _Variable = RandomEL.this.Variable();
      return _Variable;
    }
    
    public java.lang.Integer number_1() {
      int _Content = Random.Content();
      double _multiply = (_Content * 0.4);
      return java.lang.Integer.valueOf(((int) _multiply));
    }
    
    public ELMethod generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELMethod();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("parameters"));	
      	int iterations = number_1();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_1());
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
      boolean _UniformBool = Random.UniformBool(0.1);
      return java.lang.Boolean.valueOf(_UniformBool);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELClass call_2() {
      return callExpr_2();
    }
    
    public ELClass callExpr_2() {
      EList<ELPackage> _packages = RandomEL.this.model.getPackages();
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
      boolean _UniformBool = Random.UniformBool(0.1);
      return java.lang.Boolean.valueOf(_UniformBool);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELClass call_2() {
      return callExpr_2();
    }
    
    public ELClass callExpr_2() {
      EList<ELPackage> _packages = RandomEL.this.model.getPackages();
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
        EList<ELPackage> _packages = RandomEL.this.model.getPackages();
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
      ELVariable _Variable = RandomEL.this.Variable();
      return _Variable;
    }
    
    public java.lang.Integer number_2() {
      int _Content = Random.Content();
      double _multiply = (_Content * 0.3);
      return java.lang.Integer.valueOf(((int) _multiply));
    }
    
    public ELBlock call_3() {
      return callExpr_3();
    }
    
    public ELBlock callExpr_3() {
      ELBlock _Block = RandomEL.this.Block();
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
      ELStatement _Statement = RandomEL.this.Statement();
      return _Statement;
    }
    
    public java.lang.Integer number_0() {
      int _Content = Random.Content();
      int _plus = (_Content + 1);
      return java.lang.Integer.valueOf(_plus);
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
  
  public ELStatement Statement() {
    depth += 1;
    de.hub.rcore.example.el.ELStatement result = new Statement().generate();
    depth -= 1;
    return result;
  }
  
  private class Statement {
    private ELStatement self;
    
    public Statement() {
      
    }
    
    public ELStatement call_0() {
      ELBlockStatement _BlockStatement = RandomEL.this.BlockStatement();
      return _BlockStatement;
    }
    
    public java.lang.Integer number_0() {
      return java.lang.Integer.valueOf(6);
    }
    
    public ELStatement call_1() {
      ELCall _MethodCall = RandomEL.this.MethodCall();
      return _MethodCall;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(((RandomEL.this.depth).intValue() * 4));
    }
    
    public ELStatement call_2() {
      ELAssignment _Assignment = RandomEL.this.Assignment();
      return _Assignment;
    }
    
    public java.lang.Integer number_2() {
      return java.lang.Integer.valueOf(((RandomEL.this.depth).intValue() * 4));
    }
    
    public ELStatement generate() {
      int sum = 0;
      sum += number_0();
      sum += number_1();
      sum += number_2();
      int draw = Random.RandomInt(sum);
      int current = 0;
      current += number_0();
      if (current >= draw) {
      	return call_0();
      }
      current += number_1();
      if (current >= draw) {
      	return call_1();
      }
      current += number_2();
      if (current >= draw) {
      	return call_2();
      }
      throw new IllegalStateException("Unreachable!");
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
      EList<ELBlockStarementKind> _blocks = RandomEL.this.model.getBlocks();
      ELBlockStarementKind _Uniform = Random.<ELBlockStarementKind>Uniform(_blocks);
      return _Uniform;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELBlock call_1() {
      return callExpr_1();
    }
    
    public ELBlock callExpr_1() {
      ELBlock _Block = RandomEL.this.Block();
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
      ELExpression _Expression = RandomEL.this.Expression();
      return _Expression;
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
  
  public ELExpression Expression() {
    depth += 1;
    de.hub.rcore.example.el.ELExpression result = new Expression().generate();
    depth -= 1;
    return result;
  }
  
  private class Expression {
    private ELExpression self;
    
    public Expression() {
      
    }
    
    public ELExpression call_0() {
      ELCall _MethodCall = RandomEL.this.MethodCall();
      return _MethodCall;
    }
    
    public java.lang.Integer number_0() {
      return java.lang.Integer.valueOf(6);
    }
    
    public ELExpression call_1() {
      ELOpCall _OpCall = RandomEL.this.OpCall();
      return _OpCall;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(4);
    }
    
    public ELExpression call_2() {
      ELLiteral _Literal = RandomEL.this.Literal();
      return _Literal;
    }
    
    public java.lang.Integer number_2() {
      return java.lang.Integer.valueOf(((int) ((RandomEL.this.depth).intValue() * 1.2)));
    }
    
    public ELExpression generate() {
      int sum = 0;
      sum += number_0();
      sum += number_1();
      sum += number_2();
      int draw = Random.RandomInt(sum);
      int current = 0;
      current += number_0();
      if (current >= draw) {
      	return call_0();
      }
      current += number_1();
      if (current >= draw) {
      	return call_1();
      }
      current += number_2();
      if (current >= draw) {
      	return call_2();
      }
      throw new IllegalStateException("Unreachable!");
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
    
    public ELLiteral call_0() {
      ELLiteral _StringLiteral = RandomEL.this.StringLiteral();
      return _StringLiteral;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELLiteral call_1() {
      ELLiteral _IntLiteral = RandomEL.this.IntLiteral();
      return _IntLiteral;
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public ELLiteral call_2() {
      ELLiteral _BoolLiteral = RandomEL.this.BoolLiteral();
      return _BoolLiteral;
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public ELLiteral generate() {
      int sum = 0;
      sum += number_0();
      sum += number_1();
      sum += number_2();
      int draw = Random.RandomInt(sum);
      int current = 0;
      current += number_0();
      if (current >= draw) {
      	return call_0();
      }
      current += number_1();
      if (current >= draw) {
      	return call_1();
      }
      current += number_2();
      if (current >= draw) {
      	return call_2();
      }
      throw new IllegalStateException("Unreachable!");
    }
  }
  
  public ELLiteral StringLiteral() {
    depth += 1;
    de.hub.rcore.example.el.ELLiteral result = new StringLiteral().generate();
    depth -= 1;
    return result;
  }
  
  private class StringLiteral {
    private ELLiteral self;
    
    public StringLiteral() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Content = Random.Content();
      java.lang.String _LoremIpsum = Random.LoremIpsum(_Content);
      return _LoremIpsum;
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
  
  public ELLiteral IntLiteral() {
    depth += 1;
    de.hub.rcore.example.el.ELLiteral result = new IntLiteral().generate();
    depth -= 1;
    return result;
  }
  
  private class IntLiteral {
    private ELLiteral self;
    
    public IntLiteral() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(10, 5);
      java.lang.String _plus = ("" + java.lang.Integer.valueOf(_Normal));
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
  
  public ELLiteral BoolLiteral() {
    depth += 1;
    de.hub.rcore.example.el.ELLiteral result = new BoolLiteral().generate();
    depth -= 1;
    return result;
  }
  
  private class BoolLiteral {
    private ELLiteral self;
    
    public BoolLiteral() {
      
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
  
  public ELOpCall OpCall() {
    depth += 1;
    de.hub.rcore.example.el.ELOpCall result = new OpCall().generate();
    depth -= 1;
    return result;
  }
  
  private class OpCall {
    private ELOpCall self;
    
    public OpCall() {
      
    }
    
    public ELOp call_0() {
      return callExpr_0();
    }
    
    public ELOp callExpr_0() {
      EList<ELOp> _ops = RandomEL.this.model.getOps();
      ELOp _Uniform = Random.<ELOp>Uniform(_ops);
      return _Uniform;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELExpression call_1() {
      return callExpr_1();
    }
    
    public ELExpression callExpr_1() {
      ELExpression _Expression = RandomEL.this.Expression();
      return _Expression;
    }
    
    public java.lang.Integer number_1() {
      ELOp _kind = this.self.getKind();
      int _operands = _kind.getOperands();
      return java.lang.Integer.valueOf(_operands);
    }
    
    public ELOpCall generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELOpCall();
      self.eSet(self.eClass().getEStructuralFeature("kind"), call_0());		
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
      EList<ELPackage> _packages = RandomEL.this.model.getPackages();
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
      ELExpression _Expression = RandomEL.this.Expression();
      return _Expression;
    }
    
    public java.lang.Integer number_1() {
      int _Content = Random.Content();
      double _multiply = (_Content * 0.3);
      return java.lang.Integer.valueOf(((int) _multiply));
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
  
  public ELAccess Access() {
    depth += 1;
    de.hub.rcore.example.el.ELAccess result = new Access().generate();
    depth -= 1;
    return result;
  }
  
  private class Access {
    private ELAccess self;
    
    public Access() {
      
    }
    
    public ELVariable call_0() {
      return de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELVariable(), "Access_0");	
    }
    
    public ELVariable callExpr_0() {
      EList<ELPackage> _packages = RandomEL.this.model.getPackages();
      final Function1<ELPackage, ArrayList<ELField>> _function = new Function1<ELPackage, ArrayList<ELField>>() {
        public ArrayList<ELField> apply(final ELPackage it) {
          EList<ELClass> _classes = it.getClasses();
          final Function1<ELClass, EList<ELField>> _function = new Function1<ELClass, EList<ELField>>() {
            public EList<ELField> apply(final ELClass it) {
              return it.getFields();
            }
          };
          return Ocl.<ELClass, ELField>collectAll(_classes, _function);
        }
      };
      ArrayList<ELField> _collectAll = Ocl.<ELPackage, ELField>collectAll(_packages, _function);
      ELField _Uniform = Random.<ELField>Uniform(_collectAll);
      return _Uniform;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELAccess generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELAccess();
      self.eSet(self.eClass().getEStructuralFeature("variable"), call_0());		
      return self;
    }
  }
  
  public ELAssignment Assignment() {
    depth += 1;
    de.hub.rcore.example.el.ELAssignment result = new Assignment().generate();
    depth -= 1;
    return result;
  }
  
  private class Assignment {
    private ELAssignment self;
    
    public Assignment() {
      
    }
    
    public ELVariable call_0() {
      return de.hub.randomemf.runtime.References.createProxy(de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELVariable(), "Assignment_0");	
    }
    
    public ELVariable callExpr_0() {
      EList<ELPackage> _packages = RandomEL.this.model.getPackages();
      final Function1<ELPackage, ArrayList<ELField>> _function = new Function1<ELPackage, ArrayList<ELField>>() {
        public ArrayList<ELField> apply(final ELPackage it) {
          EList<ELClass> _classes = it.getClasses();
          final Function1<ELClass, EList<ELField>> _function = new Function1<ELClass, EList<ELField>>() {
            public EList<ELField> apply(final ELClass it) {
              return it.getFields();
            }
          };
          return Ocl.<ELClass, ELField>collectAll(_classes, _function);
        }
      };
      ArrayList<ELField> _collectAll = Ocl.<ELPackage, ELField>collectAll(_packages, _function);
      ELField _Uniform = Random.<ELField>Uniform(_collectAll);
      return _Uniform;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public ELExpression call_1() {
      return callExpr_1();
    }
    
    public ELExpression callExpr_1() {
      ELExpression _Expression = RandomEL.this.Expression();
      return _Expression;
    }
    
    public java.lang.Integer number_1() {
      return java.lang.Integer.valueOf(1);
    }
    
    public ELAssignment generate() {
      self = de.hub.rcore.example.el.ExampleLanguageFactory.eINSTANCE.createELAssignment();
      self.eSet(self.eClass().getEStructuralFeature("assignee"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("expr"), call_1());		
      return self;
    }
  }
  
  @java.lang.Override
  public EObject resolve(final EObject proxy) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("Field_2")) {
    	return new Field().callExpr_2();
    }
    if (uri.equals("Variable_2")) {
    	return new Variable().callExpr_2();
    }
    if (uri.equals("Method_1")) {
    	return new Method().callExpr_1();
    }
    if (uri.equals("BlockStatement_0")) {
    	return new BlockStatement().callExpr_0();
    }
    if (uri.equals("OpCall_0")) {
    	return new OpCall().callExpr_0();
    }
    if (uri.equals("MethodCall_0")) {
    	return new MethodCall().callExpr_0();
    }
    if (uri.equals("Access_0")) {
    	return new Access().callExpr_0();
    }
    if (uri.equals("Assignment_0")) {
    	return new Assignment().callExpr_0();
    }
    return null;
  }
}
