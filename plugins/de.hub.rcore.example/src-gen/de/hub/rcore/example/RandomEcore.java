package de.hub.rcore.example;

import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Random;
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

@SuppressWarnings("all")
public class RandomEcore implements IGenerator {
  private EPackage model;
  
  public EPackage generate() {
    ePackage();
    de.hub.randomemf.runtime.References.resolveReferences(this, model);
    return model;
  }
  
  @Override
  public EObject resolve(final EObject proxy) {
    if (proxy == null) return null;
    String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
    if (uri.equals("_eReference_eType_expr4")) {
    	return _eReference_eType_expr4();
    }
    if (uri.equals("_eAttribute_eType_expr2")) {
    	return _eAttribute_eType_expr2();
    }
    return null;
  }
  
  private String _ePackage_name_expr0() {
    int _Normal = Random.Normal(8, 3);
    String _RandomID = Random.RandomID(_Normal);
    return _RandomID;
  }
  
  private String _ePackage_nsPrefix_expr1() {
    int _Normal = Random.Normal(2.5, 1);
    String _RandomID = Random.RandomID(_Normal);
    return _RandomID;
  }
  
  private String _ePackage_nsURI_expr2() {
    int _Normal = Random.Normal(12, 5);
    String _RandomID = Random.RandomID(_Normal);
    String _plus = ("http://" + _RandomID);
    return _plus;
  }
  
  private EClassifier _ePackage_eClassifiers_expr3() {
    EClass _eClass = this.eClass();
    return _eClass;
  }
  
  private Integer _ePackage_eClassifiers_multiExpr3() {
    int _NegBinomial = Random.NegBinomial(5, 0.5);
    return Integer.valueOf(_NegBinomial);
  }
  
  private EPackage ePackage() {
    org.eclipse.emf.ecore.EPackage result = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();						
    model = result;
    result.eSet(result.eClass().getEStructuralFeature(1), _ePackage_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(3), _ePackage_nsPrefix_expr1());		
    result.eSet(result.eClass().getEStructuralFeature(2), _ePackage_nsURI_expr2());		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(5));
    	int iterations = _ePackage_eClassifiers_multiExpr3();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_ePackage_eClassifiers_expr3());
    	}
    }
    return result;
  }
  
  private String _eClass_name_expr0() {
    int _Normal = Random.Normal(10, 3);
    String _RandomID = Random.RandomID(_Normal);
    return _RandomID;
  }
  
  private Boolean _eClass_abstract_expr1() {
    boolean _UniformBool = Random.UniformBool(0.2);
    return Boolean.valueOf(_UniformBool);
  }
  
  private EStructuralFeature _eClass_eStructuralFeatures_expr2() {
    boolean _UniformBool = Random.UniformBool(0.3);
    EReference _eReference = this.eReference(_UniformBool);
    return _eReference;
  }
  
  private Integer _eClass_eStructuralFeatures_multiExpr2() {
    int _NegBinomial = Random.NegBinomial(2, 0.5);
    return Integer.valueOf(_NegBinomial);
  }
  
  private EStructuralFeature _eClass_eStructuralFeatures_expr3() {
    EAttribute _eAttribute = this.eAttribute();
    return _eAttribute;
  }
  
  private Integer _eClass_eStructuralFeatures_multiExpr3() {
    int _NegBinomial = Random.NegBinomial(3, 0.4);
    return Integer.valueOf(_NegBinomial);
  }
  
  private EClass eClass() {
    org.eclipse.emf.ecore.EClass result = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();						
    result.eSet(result.eClass().getEStructuralFeature(1), _eClass_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(8), _eClass_abstract_expr1());		
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(21));
    	int iterations = _eClass_eStructuralFeatures_multiExpr2();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_eClass_eStructuralFeatures_expr2());
    	}
    }
    {
    	org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(21));
    	int iterations = _eClass_eStructuralFeatures_multiExpr3();
    	for (int i = 0; i < iterations; i++) {
    		values.add(_eClass_eStructuralFeatures_expr3());
    	}
    }
    return result;
  }
  
  private String _eReference_name_expr0(final boolean composite) {
    int _Normal = Random.Normal(10, 3);
    String _RandomID = Random.RandomID(_Normal);
    return _RandomID;
  }
  
  private Integer _eReference_upperBound_expr1(final boolean composite) {
    int _xifexpression = (int) 0;
    boolean _UniformBool = Random.UniformBool(0.5);
    if (_UniformBool) {
      _xifexpression = (-1);
    } else {
      _xifexpression = 1;
    }
    return Integer.valueOf(_xifexpression);
  }
  
  private Boolean _eReference_ordered_expr2(final boolean composite) {
    boolean _UniformBool = Random.UniformBool(0.2);
    return Boolean.valueOf(_UniformBool);
  }
  
  private Boolean _eReference_containment_expr3(final boolean composite) {
    return Boolean.valueOf(composite);
  }
  
  private EClassifier _eReference_eType_expr4() {
    EList<EClassifier> _eClassifiers = this.model.getEClassifiers();
    final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
      public Boolean apply(final EClassifier it) {
        return Boolean.valueOf((it instanceof EClass));
      }
    };
    Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers, _function);
    EClassifier _Uniform = Random.<EClassifier>Uniform(_filter);
    return _Uniform;
  }
  
  private EReference eReference(final boolean composite) {
    org.eclipse.emf.ecore.EReference result = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference();						
    result.eSet(result.eClass().getEStructuralFeature(1), _eReference_name_expr0(composite));		
    result.eSet(result.eClass().getEStructuralFeature(5), _eReference_upperBound_expr1(composite));		
    result.eSet(result.eClass().getEStructuralFeature(2), _eReference_ordered_expr2(composite));		
    result.eSet(result.eClass().getEStructuralFeature(18), _eReference_containment_expr3(composite));		
    result.eSet(result.eClass().getEStructuralFeature(8), de.hub.randomemf.runtime.References.createProxy(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass(), "_eReference_eType_expr4"));		
    return result;
  }
  
  private String _eAttribute_name_expr0() {
    int _Normal = Random.Normal(8, 3);
    String _RandomID = Random.RandomID(_Normal);
    return _RandomID;
  }
  
  private Integer _eAttribute_upperBound_expr1() {
    int _xifexpression = (int) 0;
    boolean _UniformBool = Random.UniformBool(0.1);
    if (_UniformBool) {
      _xifexpression = (-1);
    } else {
      _xifexpression = 1;
    }
    return Integer.valueOf(_xifexpression);
  }
  
  private EClassifier _eAttribute_eType_expr2() {
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
  
  private EAttribute eAttribute() {
    org.eclipse.emf.ecore.EAttribute result = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();						
    result.eSet(result.eClass().getEStructuralFeature(1), _eAttribute_name_expr0());		
    result.eSet(result.eClass().getEStructuralFeature(5), _eAttribute_upperBound_expr1());		
    result.eSet(result.eClass().getEStructuralFeature(8), de.hub.randomemf.runtime.References.createProxy(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType(), "_eAttribute_eType_expr2"));		
    return result;
  }
}
