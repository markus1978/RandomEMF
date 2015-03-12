package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RandomEcore implements IGenerator {
  private org.eclipse.emf.ecore.EPackage model;
  
  public org.eclipse.emf.ecore.EPackage generate() {
    ePackage();
    de.hub.randomemf.runtime.References.resolveReferences(this, model);
    return model;
  }
  
  public org.eclipse.emf.ecore.EPackage ePackage() {
    return new EPackage().generate();
  }
  
  private class EPackage {
    private org.eclipse.emf.ecore.EPackage self;
    
    public EPackage() {
      
    }
    
    public String call_0() {
      return callExpr_0();
    }
    
    public String callExpr_0() {
      int _Normal = Random.Normal(8, 3);
      String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public Integer number_0() {
      return 1;
    }
    
    public String call_1() {
      return callExpr_1();
    }
    
    public String callExpr_1() {
      int _Normal = Random.Normal(2.5, 1);
      String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public Integer number_1() {
      return 1;
    }
    
    public String call_2() {
      return callExpr_2();
    }
    
    public String callExpr_2() {
      int _Normal = Random.Normal(12, 5);
      String _RandomID = Random.RandomID(_Normal);
      String _plus = ("http://" + _RandomID);
      return _plus;
    }
    
    public Integer number_2() {
      return 1;
    }
    
    public EClassifier call_3() {
      return callExpr_3();
    }
    
    public EClassifier callExpr_3() {
      org.eclipse.emf.ecore.EClass _eClass = RandomEcore.this.eClass();
      return _eClass;
    }
    
    public Integer number_3() {
      int _NegBinomial = Random.NegBinomial(5, 0.5);
      return Integer.valueOf(_NegBinomial);
    }
    
    public org.eclipse.emf.ecore.EPackage generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
      model = self;
      self.eSet(self.eClass().getEStructuralFeature(1), call_0());		
      self.eSet(self.eClass().getEStructuralFeature(3), call_1());		
      self.eSet(self.eClass().getEStructuralFeature(2), call_2());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature(5));	
      	int iterations = number_3();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_3());
      	}
      }
      return self;
    }
  }
  
  public org.eclipse.emf.ecore.EClass eClass() {
    return new EClass().generate();
  }
  
  private class EClass {
    private org.eclipse.emf.ecore.EClass self;
    
    public EClass() {
      
    }
    
    public String call_0() {
      return callExpr_0();
    }
    
    public String callExpr_0() {
      int _Normal = Random.Normal(10, 3);
      String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public Integer number_0() {
      return 1;
    }
    
    public Boolean call_1() {
      return callExpr_1();
    }
    
    public Boolean callExpr_1() {
      boolean _UniformBool = Random.UniformBool(0.2);
      return Boolean.valueOf(_UniformBool);
    }
    
    public Integer number_1() {
      return 1;
    }
    
    public EStructuralFeature call_2() {
      return callExpr_2();
    }
    
    public EStructuralFeature callExpr_2() {
      boolean _UniformBool = Random.UniformBool(0.3);
      org.eclipse.emf.ecore.EReference _eReference = RandomEcore.this.eReference(_UniformBool);
      return _eReference;
    }
    
    public Integer number_2() {
      int _NegBinomial = Random.NegBinomial(2, 0.5);
      return Integer.valueOf(_NegBinomial);
    }
    
    public EStructuralFeature call_3() {
      return callExpr_3();
    }
    
    public EStructuralFeature callExpr_3() {
      org.eclipse.emf.ecore.EAttribute _eAttribute = RandomEcore.this.eAttribute();
      return _eAttribute;
    }
    
    public Integer number_3() {
      int _NegBinomial = Random.NegBinomial(3, 0.4);
      return Integer.valueOf(_NegBinomial);
    }
    
    public org.eclipse.emf.ecore.EClass generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
      self.eSet(self.eClass().getEStructuralFeature(1), call_0());		
      self.eSet(self.eClass().getEStructuralFeature(8), call_1());		
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature(21));	
      	int iterations = number_2();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_2());
      	}
      }
      {
      	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature(21));	
      	int iterations = number_3();
      	for (int i = 0; i < iterations; i++) {
      		values.add(call_3());
      	}
      }
      return self;
    }
  }
  
  public org.eclipse.emf.ecore.EReference eReference(final boolean composite) {
    return new EReference(composite).generate();
  }
  
  private class EReference {
    private org.eclipse.emf.ecore.EReference self;
    
    private boolean composite;
    
    public EReference(final boolean composite) {
      this.composite = composite;
    }
    
    public EReference() {
      
    }
    
    public String call_0() {
      return callExpr_0();
    }
    
    public String callExpr_0() {
      int _Normal = Random.Normal(10, 3);
      String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public Integer number_0() {
      return 1;
    }
    
    public Integer call_1() {
      return callExpr_1();
    }
    
    public Integer callExpr_1() {
      int _xifexpression = (int) 0;
      boolean _UniformBool = Random.UniformBool(0.5);
      if (_UniformBool) {
        _xifexpression = (-1);
      } else {
        _xifexpression = 1;
      }
      return Integer.valueOf(_xifexpression);
    }
    
    public Integer number_1() {
      return 1;
    }
    
    public Boolean call_2() {
      return callExpr_2();
    }
    
    public Boolean callExpr_2() {
      boolean _UniformBool = Random.UniformBool(0.2);
      return Boolean.valueOf(_UniformBool);
    }
    
    public Integer number_2() {
      return 1;
    }
    
    public Boolean call_3() {
      return callExpr_3();
    }
    
    public Boolean callExpr_3() {
      return Boolean.valueOf(this.composite);
    }
    
    public Integer number_3() {
      return 1;
    }
    
    public EClassifier call_4() {
      return de.hub.randomemf.runtime.References.createProxy(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass(), "eReference_4");	
    }
    
    public EClassifier callExpr_4() {
      EList<EClassifier> _eClassifiers = RandomEcore.this.model.getEClassifiers();
      final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier it) {
          return Boolean.valueOf((it instanceof org.eclipse.emf.ecore.EClass));
        }
      };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
      EClassifier _Uniform = Random.<EClassifier>Uniform(_filter);
      return _Uniform;
    }
    
    public Integer number_4() {
      return 1;
    }
    
    public org.eclipse.emf.ecore.EReference generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference();
      self.eSet(self.eClass().getEStructuralFeature(1), call_0());		
      self.eSet(self.eClass().getEStructuralFeature(5), call_1());		
      self.eSet(self.eClass().getEStructuralFeature(2), call_2());		
      self.eSet(self.eClass().getEStructuralFeature(18), call_3());		
      self.eSet(self.eClass().getEStructuralFeature(8), call_4());		
      return self;
    }
  }
  
  public org.eclipse.emf.ecore.EAttribute eAttribute() {
    return new EAttribute().generate();
  }
  
  private class EAttribute {
    private org.eclipse.emf.ecore.EAttribute self;
    
    public EAttribute() {
      
    }
    
    public String call_0() {
      return callExpr_0();
    }
    
    public String callExpr_0() {
      int _Normal = Random.Normal(8, 3);
      String _RandomID = Random.RandomID(_Normal);
      return _RandomID;
    }
    
    public Integer number_0() {
      return 1;
    }
    
    public Integer call_1() {
      return callExpr_1();
    }
    
    public Integer callExpr_1() {
      int _xifexpression = (int) 0;
      boolean _UniformBool = Random.UniformBool(0.1);
      if (_UniformBool) {
        _xifexpression = (-1);
      } else {
        _xifexpression = 1;
      }
      return Integer.valueOf(_xifexpression);
    }
    
    public Integer number_1() {
      return 1;
    }
    
    public EClassifier call_2() {
      return de.hub.randomemf.runtime.References.createProxy(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType(), "eAttribute_2");	
    }
    
    public EClassifier callExpr_2() {
      EList<EClassifier> _eClassifiers = EcorePackage.eINSTANCE.getEClassifiers();
      final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier it) {
          boolean _and = false;
          if (!(it instanceof EDataType)) {
            _and = false;
          } else {
            boolean _isSerializable = ((EDataType) it).isSerializable();
            _and = _isSerializable;
          }
          return Boolean.valueOf(_and);
        }
      };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
      EClassifier _Uniform = Random.<EClassifier>Uniform(_filter);
      return _Uniform;
    }
    
    public Integer number_2() {
      return 1;
    }
    
    public org.eclipse.emf.ecore.EAttribute generate() {
      self = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
      self.eSet(self.eClass().getEStructuralFeature(1), call_0());		
      self.eSet(self.eClass().getEStructuralFeature(5), call_1());		
      self.eSet(self.eClass().getEStructuralFeature(8), call_2());		
      return self;
    }
  }
  
  @Override
  public EObject resolve(final EObject proxy) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("eReference_4")) {
    	return new EReference().callExpr_4();
    }
    if (uri.equals("eAttribute_2")) {
    	return new EAttribute().callExpr_2();
    }
    return null;
  }
}
