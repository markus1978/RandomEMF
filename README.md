# RandomEMF
## Synopsis
RandomEMF is a generator framework for test and benchmark input models. It is based on the eclipse modeling framework (EMF) and allows you to create model generators based on an external domain specific language (DSL). The RandomEMF language rcore can be used to describe generation rules for instances of ecore meta-model clases. RandomEMF is developed based on [xText](https://eclipse.org/Xtext/), [xTend](https://eclipse.org/xtend/), and [xBase](https://eclipse.org/Xtext/).

## Get Started
There is no formal release of RandomEMF yet. You can simply clone the repository and import all plugins (except the example plugin) to your eclipse workspace as exsiting eclipse projects. RandomEMF uses Ivy to add some external dependencies. The use the eclipse Ivy plugins [IvyDE](http://ant.apache.org/ivy/ivyde/) is required to retrieve all dependencies. You need to manually select the de.hub.rcore plugin, open the context menu, trigger Ivy/retrieve 'dependencies'. You also need to run the *src/de.hub.randomemf/GenerateRcore.mwe2* workflow to generate everything. Than you can run the framework as a new eclipse instance. In the new eclipse instance you can import the example project or simply start creating *.rcore* files in your own projects.

## Simple Example
The following is an example *.rcore* file that describes a generator for EMF's ecore language.

```
package de.hub.rcore.example

import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage
import static de.hub.randomemf.runtime.Random.*

generator RandomEcore for ecore 
    in "platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore" { 
  
  Package: EPackage ->
    name := LatinCamel(Normal(4,2)).toLowerCase
    nsPrefix := RandomID(Normal(2.5,1))
    nsURI := "http://hub.de/rcore/examples/" + self.name
    eClassifiers += Class#NegBinomial(5,0.5)
  ;
  
  Class: EClass ->
    name := LatinCamel(Normal(10,3))
    abstract := UniformBool(0.2)
    eStructuralFeatures += Feature#NegBinomial(2,0.5)
  ;
  
  alter Feature: EStructuralFeature ->
    Reference(true) | Reference(false) | Attribute#2 
  ;
  
  Reference(boolean composite):EReference ->
    name := LatinCamel(Normal(10,3)).toFirstLower
    upperBound := if (UniformBool(0.5)) -1 else 1
    ordered := UniformBool(0.2)
    containment := composite
    eType:EClass := Uniform(model.EClassifiers.filter[
      it instanceof org.eclipse.emf.ecore.EClass
    ])
  ; 
  
  Attribute:EAttribute ->
    name := LatinCamel(Normal(8,3)).toFirstLower
    upperBound := if (UniformBool(0.1)) -1 else 1
    eType:EDataType := Uniform(EcorePackage.eINSTANCE.EClassifiers.filter[
      it instanceof EDataType
    ])
  ;
}
```

## Basic rcore constructs
As you can see, rcore uses rules (similar to those in grammars, e.g. xText) to describe how instance of meta-classes are created and what they consist of. 
* Class rules have a name and reference a meta-class
  * Rules can have parameters
  * Values can be assigned to features with single mulitplicity via **:=**
  * Values can be added to features with higher multiplicity via **+=**
  * Values are described via expressions
  * **#** seperates the value expression from an expression that describes how often this value expression should be evaluated, i.e. how many values shall be added
  * Other rules can be called in expressions
  * Arbitrary xBase constructs can be used in expressions
* Alternative rules reference the most abstract meta-class of the alternatives
  * each alternative is an expression
  * after the **#** one can give a priority for the alternative the default priority is 1. Alternatives are chosen by priority, e.g. an alternative with priority 2 is twice as likely chosen as an alternative with priority 1.
* The class **de.hub.randomemf.runtim.Random** provides a series of functions to create random numbers after certain distributions and other function to generate random value such as identifiers or chosing a value from a list, etc. The randomness is generate by the [Colt](https://dst.lbl.gov/ACSSoftware/colt/) library developed by the CERN institute. During generation, we always use the same seed to gurantee repeatabilty.

## How to Use the Described Generators
RandomEMF will automatically generate a Java class for each generator. The class will have the same name and package as the generator description. The class has a default constructor or constructor with the same parameters as the generator. The class features a *generate()* and *generator(int maxCount)* method. These methods can be used to generate instances of your meta-model as described. 

## Publications

