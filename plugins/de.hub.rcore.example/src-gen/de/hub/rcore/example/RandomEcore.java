package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Random;
import java.lang.Iterable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RandomEcore implements IGenerator {
  private EPackage model;
  
  private java.lang.Integer depth = 0;
  
  @java.lang.Override
  public EPackage generate() {
    Package();
    de.hub.randomemf.runtime.References.resolveReferences(this, model);
    return model;
  }
  
  public EPackage Package() {
    depth += 1;
    org.eclipse.emf.ecore.EPackage result = new Package().generate();
    depth -= 1;
    return result;
  }
  
  private class Package {
    private EPackage self;
    
    public Package() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(4, 2);
      java.lang.String _LatinCamel = Random.LatinCamel(_Normal);
      java.lang.String _lowerCase = _LatinCamel.toLowerCase();
      return _lowerCase;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.String call_1() {
      return callExpr_1();
    }
    
    public java.lang.String callExpr_1() {
      int _Normal = Random.Normal(2.5, 1);
      java.lang.String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public java.lang.String call_2() {
      return callExpr_2();
    }
    
    public java.lang.String callExpr_2() {
      java.lang.String _name = this.self.getName();
      java.lang.String _plus = ("http://hub.de/rcore/examples/" + _name);
      return _plus;
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public EClassifier call_3() {
      return callExpr_3();
    }
    
    public EClassifier callExpr_3() {
      EClass _Class = RandomEcore.this.Class();
      return _Class;
    }
    
    public java.lang.Integer number_3() {
      int _NegBinomial = Random.NegBinomial(5, 0.5);
      return java.lang.Integer.valueOf(_NegBinomial);
    }
    
    public EPackage generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
      model = self;
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("nsPrefix"), call_1());		
      self.eSet(self.eClass().getEStructuralFeature("nsURI"), call_2());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("eClassifiers"));	
      	int iterations = number_3();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_3());
      	}
      }
      return self;
    }
  }
  
  public EClass Class() {
    depth += 1;
    org.eclipse.emf.ecore.EClass result = new Class().generate();
    depth -= 1;
    return result;
  }
  
  private class Class {
    private EClass self;
    
    public Class() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(10, 3);
      java.lang.String _LatinCamel = Random.LatinCamel(_Normal);
      return _LatinCamel;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.Boolean call_1() {
      return callExpr_1();
    }
    
    public java.lang.Boolean callExpr_1() {
      boolean _UniformBool = Random.UniformBool(0.2);
      return java.lang.Boolean.valueOf(_UniformBool);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public EStructuralFeature call_2() {
      return callExpr_2();
    }
    
    public EStructuralFeature callExpr_2() {
      EStructuralFeature _Feature = RandomEcore.this.Feature();
      return _Feature;
    }
    
    public java.lang.Integer number_2() {
      int _NegBinomial = Random.NegBinomial(2, 0.5);
      return java.lang.Integer.valueOf(_NegBinomial);
    }
    
    public EClass generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("abstract"), call_1());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("eStructuralFeatures"));	
      	int iterations = number_2();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_2());
      	}
      }
      return self;
    }
  }
  
  public EStructuralFeature Feature() {
    depth += 1;
    org.eclipse.emf.ecore.EStructuralFeature result = new Feature().generate();
    depth -= 1;
    return result;
  }
  
  private class Feature {
    private EStructuralFeature self;
    
    public Feature() {
      
    }
    
    public EStructuralFeature call_0() {
      EReference _Reference = RandomEcore.this.Reference(true);
      return _Reference;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public EStructuralFeature call_1() {
      EReference _Reference = RandomEcore.this.Reference(false);
      return _Reference;
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public EStructuralFeature call_2() {
      EAttribute _Attribute = RandomEcore.this.Attribute();
      return _Attribute;
    }
    
    public java.lang.Integer number_2() {
      return java.lang.Integer.valueOf(2);
    }
    
    public EStructuralFeature generate() {
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
  
  public EReference Reference(final boolean composite) {
    depth += 1;
    org.eclipse.emf.ecore.EReference result = new Reference(composite).generate();
    depth -= 1;
    return result;
  }
  
  private class Reference {
    private EReference self;
    
    private boolean composite;
    
    public Reference(final boolean composite) {
      this.composite = composite;
    }
    
    public Reference() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(10, 3);
      java.lang.String _LatinCamel = Random.LatinCamel(_Normal);
      java.lang.String _firstLower = StringExtensions.toFirstLower(_LatinCamel);
      return _firstLower;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.Integer call_1() {
      return callExpr_1();
    }
    
    public java.lang.Integer callExpr_1() {
      int _xifexpression = (int) 0;
      boolean _UniformBool = Random.UniformBool(0.5);
      if (_UniformBool) {
        _xifexpression = (-1);
      } else {
        _xifexpression = 1;
      }
      return java.lang.Integer.valueOf(_xifexpression);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public java.lang.Boolean call_2() {
      return callExpr_2();
    }
    
    public java.lang.Boolean callExpr_2() {
      boolean _UniformBool = Random.UniformBool(0.2);
      return java.lang.Boolean.valueOf(_UniformBool);
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public java.lang.Boolean call_3() {
      return callExpr_3();
    }
    
    public java.lang.Boolean callExpr_3() {
      return java.lang.Boolean.valueOf(this.composite);
    }
    
    public java.lang.Integer number_3() {
      return 1;
    }
    
    public EClassifier call_4() {
      return callExpr_4();
    }
    
    public EClassifier callExpr_4() {
      EList<EClassifier> _eClassifiers = RandomEcore.this.model.getEClassifiers();
      final Function1<EClassifier, java.lang.Boolean> _function = new Function1<EClassifier, java.lang.Boolean>() {
        public java.lang.Boolean apply(final EClassifier it) {
          return java.lang.Boolean.valueOf((it instanceof EClass));
        }
      };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
      EClassifier _Uniform = Random.<EClassifier>Uniform(_filter);
      return _Uniform;
    }
    
    public java.lang.Integer number_4() {
      return 1;
    }
    
    public EReference generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("upperBound"), call_1());		
      self.eSet(self.eClass().getEStructuralFeature("ordered"), call_2());		
      self.eSet(self.eClass().getEStructuralFeature("containment"), call_3());		
      self.eSet(self.eClass().getEStructuralFeature("eType"), call_4());		
      return self;
    }
  }
  
  public EAttribute Attribute() {
    depth += 1;
    org.eclipse.emf.ecore.EAttribute result = new Attribute().generate();
    depth -= 1;
    return result;
  }
  
  private class Attribute {
    private EAttribute self;
    
    public Attribute() {
      
    }
    
    public java.lang.String call_0() {
      return callExpr_0();
    }
    
    public java.lang.String callExpr_0() {
      int _Normal = Random.Normal(8, 3);
      java.lang.String _LatinCamel = Random.LatinCamel(_Normal);
      java.lang.String _firstLower = StringExtensions.toFirstLower(_LatinCamel);
      return _firstLower;
    }
    
    public java.lang.Integer number_0() {
      return 1;
    }
    
    public java.lang.Integer call_1() {
      return callExpr_1();
    }
    
    public java.lang.Integer callExpr_1() {
      int _xifexpression = (int) 0;
      boolean _UniformBool = Random.UniformBool(0.1);
      if (_UniformBool) {
        _xifexpression = (-1);
      } else {
        _xifexpression = 1;
      }
      return java.lang.Integer.valueOf(_xifexpression);
    }
    
    public java.lang.Integer number_1() {
      return 1;
    }
    
    public EClassifier call_2() {
      return callExpr_2();
    }
    
    public EClassifier callExpr_2() {
      EList<EClassifier> _eClassifiers = EcorePackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier, java.lang.Boolean> _function = new Function1<EClassifier, java.lang.Boolean>() {
        public java.lang.Boolean apply(final EClassifier it) {
          return java.lang.Boolean.valueOf((it instanceof EDataType));
        }
      };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
      EClassifier _Uniform = Random.<EClassifier>Uniform(_filter);
      return _Uniform;
    }
    
    public java.lang.Integer number_2() {
      return 1;
    }
    
    public EAttribute generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
      self.eSet(self.eClass().getEStructuralFeature("name"), call_0());		
      self.eSet(self.eClass().getEStructuralFeature("upperBound"), call_1());		
      self.eSet(self.eClass().getEStructuralFeature("eType"), call_2());		
      return self;
    }
  }
  
  @java.lang.Override
  public EObject resolve(final EObject proxy, final EObject source) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("Reference_4")) {
    	Reference rule = new Reference();
    	rule.self = (org.eclipse.emf.ecore.EReference)source;
    	return rule.callExpr_4();
    }
    if (uri.equals("Attribute_2")) {
    	Attribute rule = new Attribute();
    	rule.self = (org.eclipse.emf.ecore.EAttribute)source;
    	return rule.callExpr_2();
    }
    return null;
  }
}
