/**
 */
package de.hub.randomemf.randomEMF.impl;

import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link de.hub.randomemf.randomEMF.impl.GeneratorImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorImpl extends MinimalEObjectImpl.Container implements Generator
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportSection()
   * @generated
   * @ordered
   */
  protected XImportSection importSection;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEcorePackage() <em>Ecore Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcorePackage()
   * @generated
   * @ordered
   */
  protected EPackage ecorePackage;

  /**
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<ClassRule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneratorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RandomEMFPackage.Literals.GENERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImportSection getImportSection()
  {
    return importSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs)
  {
    XImportSection oldImportSection = importSection;
    importSection = newImportSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__IMPORT_SECTION, oldImportSection, newImportSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportSection(XImportSection newImportSection)
  {
    if (newImportSection != importSection)
    {
      NotificationChain msgs = null;
      if (importSection != null)
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.GENERATOR__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RandomEMFPackage.GENERATOR__IMPORT_SECTION, null, msgs);
      msgs = basicSetImportSection(newImportSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__IMPORT_SECTION, newImportSection, newImportSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getEcorePackage()
  {
    if (ecorePackage != null && ecorePackage.eIsProxy())
    {
      InternalEObject oldEcorePackage = (InternalEObject)ecorePackage;
      ecorePackage = (EPackage)eResolveProxy(oldEcorePackage);
      if (ecorePackage != oldEcorePackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RandomEMFPackage.GENERATOR__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
      }
    }
    return ecorePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetEcorePackage()
  {
    return ecorePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcorePackage(EPackage newEcorePackage)
  {
    EPackage oldEcorePackage = ecorePackage;
    ecorePackage = newEcorePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RandomEMFPackage.GENERATOR__IMPORT_URI, oldImportURI, importURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassRule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<ClassRule>(ClassRule.class, this, RandomEMFPackage.GENERATOR__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RandomEMFPackage.GENERATOR__IMPORT_SECTION:
        return basicSetImportSection(null, msgs);
      case RandomEMFPackage.GENERATOR__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RandomEMFPackage.GENERATOR__PACKAGE:
        return getPackage();
      case RandomEMFPackage.GENERATOR__IMPORT_SECTION:
        return getImportSection();
      case RandomEMFPackage.GENERATOR__NAME:
        return getName();
      case RandomEMFPackage.GENERATOR__ECORE_PACKAGE:
        if (resolve) return getEcorePackage();
        return basicGetEcorePackage();
      case RandomEMFPackage.GENERATOR__IMPORT_URI:
        return getImportURI();
      case RandomEMFPackage.GENERATOR__RULES:
        return getRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RandomEMFPackage.GENERATOR__PACKAGE:
        setPackage((String)newValue);
        return;
      case RandomEMFPackage.GENERATOR__IMPORT_SECTION:
        setImportSection((XImportSection)newValue);
        return;
      case RandomEMFPackage.GENERATOR__NAME:
        setName((String)newValue);
        return;
      case RandomEMFPackage.GENERATOR__ECORE_PACKAGE:
        setEcorePackage((EPackage)newValue);
        return;
      case RandomEMFPackage.GENERATOR__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case RandomEMFPackage.GENERATOR__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends ClassRule>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RandomEMFPackage.GENERATOR__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case RandomEMFPackage.GENERATOR__IMPORT_SECTION:
        setImportSection((XImportSection)null);
        return;
      case RandomEMFPackage.GENERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RandomEMFPackage.GENERATOR__ECORE_PACKAGE:
        setEcorePackage((EPackage)null);
        return;
      case RandomEMFPackage.GENERATOR__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case RandomEMFPackage.GENERATOR__RULES:
        getRules().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RandomEMFPackage.GENERATOR__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case RandomEMFPackage.GENERATOR__IMPORT_SECTION:
        return importSection != null;
      case RandomEMFPackage.GENERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RandomEMFPackage.GENERATOR__ECORE_PACKAGE:
        return ecorePackage != null;
      case RandomEMFPackage.GENERATOR__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case RandomEMFPackage.GENERATOR__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (package: ");
    result.append(package_);
    result.append(", name: ");
    result.append(name);
    result.append(", importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //GeneratorImpl
