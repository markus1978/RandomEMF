package de.hub.randomemf.jvmmodel;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import javax.inject.Inject;

/**
 * This class computes an EClass' Java class name from looking up the EClass' GenModel from the {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap() EPackage to GenModel map}.
 * 
 * @author Karsten Thoms
 */
@SuppressWarnings("all")
public class GenModelHelper {
    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;
    @Inject
    private ResourceSet            resourceSet;

    public String getJavaInterfaceName(EClass eClass) {
        if (eClass == null) {
            return null;
        }
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getQualifiedInterfaceName() : null;
    }

    public String getJavaInterfaceName(EClassifier eClassifier) {
        if (eClassifier == null) {
            return null;
        }
        if (eClassifier instanceof EClass) {
            GenClass genClass = getGenClass((EClass) eClassifier);
            return genClass != null ? genClass.getQualifiedInterfaceName() : null;
        } else if (eClassifier instanceof EEnum) {
            GenEnum genEnum = getGenEnum((EEnum) eClassifier);
            return genEnum != null ? genEnum.getObjectInstanceClassName() : null;
        } else if (eClassifier instanceof EDataType) {
            GenDataType genDataType = getGenDataType((EDataType) eClassifier);
            return genDataType != null ? genDataType.getObjectInstanceClassName() : null;
        } else {
            GenClassifier genClassifier = getGenClassifier(eClassifier);
            return genClassifier != null ? genClassifier.getClassifierInstanceName() : null;
        }
    }

    public String getEPackageClassName(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getGenPackage().getQualifiedPackageInterfaceName() : null;
    }

    public String getEPackageClassifierName(EClassifier eClassifier) {
        GenClassifier genClassifier = getGenClassifier(eClassifier);
        return genClassifier != null ? genClassifier.getGenPackage().getQualifiedPackageInterfaceName() : null;
    }

    public String getEFactoryInterfaceName(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getGenPackage().getQualifiedFactoryInterfaceName() : null;
    }

    public String getEFactoryInterfaceName(EDataType dataType) {
        GenDataType genDataType = getGenDataType(dataType);
        return genDataType != null ? genDataType.getQualifiedInstanceClassName() : null;
    }

    public String getLiteralConstant(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        if (genClass == null) {
            return null;
        } else {
            return genClass.getClassifierID();
        }
    }

    public String getLiteralConstant(EStructuralFeature feature) {
        // TODO
        GenFeature genClass = getGenFeature(feature);
        if (genClass == null) {
            return null;
        } else {
            // TODO: Find appropriate method in GenFeature
            return getLiteralConstant(feature.getEContainingClass()) + "__" + genClass.getFormattedName().replace(" ", "_").toUpperCase();
        }

    }

    public String getFileExtension(EClass eClass) {
        GenPackage pck = getGenPackage(eClass);
        return pck.getFileExtension();
    }

    protected GenClass getGenClass(EClass eClass) {
        GenModel genModel = getGenModel(eClass);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClass genClass : pck.getGenClasses()) {
                EClass c = genClass.getEcoreClass();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (c.eIsProxy()) {
                    EObject eo = resolveManually(genClass, ((EClassImpl) c).eProxyURI());
                    if (eo instanceof EClass) {
                        c = (EClass) eo;
                    }
                }
                if (qualifiedNameProvider.getFullyQualifiedName(eClass).equals(qualifiedNameProvider.getFullyQualifiedName(c))) {
                    genClass.setEcoreClass(c);
                    return genClass;
                }
            }
        }
        return null;
    }

    private EObject resolveManually(GenBase genModelElement, URI proxyURI) {
        Resource genModelElementResource = genModelElement.eResource();
        String newURI = genModelElementResource.getURI().trimSegments(1) + "/" + proxyURI.lastSegment() + "#" + proxyURI.fragment();
        return genModelElementResource.getResourceSet().getEObject(URI.createURI(newURI), true);
    }

    protected GenClassifier getGenClassifier(EClassifier eClassifier) {
        GenModel genModel = getGenModel(eClassifier);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClassifier genClassifier : pck.getGenClassifiers()) {
                EClassifier c = genClassifier.getEcoreClassifier();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (qualifiedNameProvider.getFullyQualifiedName(eClassifier).equals(qualifiedNameProvider.getFullyQualifiedName(c))) {
                    return genClassifier;
                }
            }
        }
        return null;
    }

    protected GenDataType getGenDataType(EDataType eDataType) {
        GenModel genModel = getGenModel(eDataType);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenDataType genDataType : pck.getGenDataTypes()) {
                EDataType d = genDataType.getEcoreDataType();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (d.eIsProxy()) {
                    EObject eo = resolveManually(genDataType, ((EDataTypeImpl) d).eProxyURI());
                    if (eo instanceof EDataType) {
                        d = (EDataType) eo;
                    }
                }
                if (qualifiedNameProvider.getFullyQualifiedName(eDataType).equals(qualifiedNameProvider.getFullyQualifiedName(d))) {
                    genDataType.setEcoreDataType(d);
                    return genDataType;
                }
            }
        }
        return null;
    }

    protected GenEnum getGenEnum(EEnum eEnum) {
        GenModel genModel = getGenModel(eEnum);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenEnum genEnum : pck.getGenEnums()) {
                EEnum d = genEnum.getEcoreEnum();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (d.eIsProxy()) {
                    EObject eo = resolveManually(genEnum, ((EEnumImpl) d).eProxyURI());
                    if (eo instanceof EEnum) {
                        d = (EEnum) eo;
                    }
                }
                if (qualifiedNameProvider.getFullyQualifiedName(eEnum).equals(qualifiedNameProvider.getFullyQualifiedName(d))) {
                    genEnum.setEcoreEnum(d);
                    return genEnum;
                }
            }
        }
        return null;
    }

    protected GenFeature getGenFeature(EStructuralFeature feature) {
        GenClass genClass = getGenClass(feature.getEContainingClass());
        for (GenFeature f : genClass.getAllGenFeatures()) {
            EStructuralFeature ecoreFeature = f.getEcoreFeature();
            if (ecoreFeature.eIsProxy()) {
                EObject eo = resolveManually(genClass, ((EStructuralFeatureImpl) ecoreFeature).eProxyURI());
                if (eo instanceof EStructuralFeature) {
                    ecoreFeature = (EStructuralFeature) eo;
                }
            }
            if (qualifiedNameProvider.getFullyQualifiedName(feature).equals(qualifiedNameProvider.getFullyQualifiedName(ecoreFeature))) {
                f.setEcoreFeature(ecoreFeature);
                return f;
            }
        }
        return null;
    }

    protected GenPackage getGenPackage(EClass eClass) {
        GenModel genModel = getGenModel(eClass);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClass genClass : pck.getGenClasses()) {
                EClass c = genClass.getEcoreClass();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (c.eIsProxy()) {
                    EObject eo = resolveManually(genClass, ((EClassImpl) c).eProxyURI());
                    if (eo instanceof EClass) {
                        c = (EClass) eo;
                    }
                }
                if (qualifiedNameProvider.getFullyQualifiedName(eClass).equals(qualifiedNameProvider.getFullyQualifiedName(c))) {
                    pck.setEcorePackage(c.getEPackage());
                    return pck;
                }
            }
        }
        return null;
    }

    public GenModel getGenModel(EClassifier eClassifier) {
        if (eClassifier == null) {
            throw new IllegalStateException("Cannot determine interface name for EClass, since the EClass is null");
        }
        if (eClassifier.eIsProxy()) {
            throw new IllegalStateException("Cannot determine interface name for EClass, since the EClass is an unresolved proxy (" + EcoreUtil.getURI(eClassifier) + ")");
        }
        if (eClassifier.getEPackage() == null) {
            throw new IllegalStateException("EPackage of EClass '" + eClassifier + "' is null.");
        }
        URI genModelUri = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(eClassifier.getEPackage().getNsURI());
        if (genModelUri == null) {
            throw new IllegalStateException("GenModel for EPackage '" + eClassifier.getEPackage().getNsURI() + "' must be registered.");
        }
        Resource res = resourceSet.getResource(genModelUri, true);
        EcoreUtil.resolveAll(res);

        GenModel genModel = (GenModel) res.getContents().get(0);
        return genModel;
    }

}
