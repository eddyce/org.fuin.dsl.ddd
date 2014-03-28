/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getTechnicalId <em>Technical Id</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getBusinessKey <em>Business Key</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.VariableImpl#getOverridden <em>Overridden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
  /**
   * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected static final String DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected String doc = DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getTechnicalId() <em>Technical Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnicalId()
   * @generated
   * @ordered
   */
  protected static final String TECHNICAL_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTechnicalId() <em>Technical Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnicalId()
   * @generated
   * @ordered
   */
  protected String technicalId = TECHNICAL_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessKey()
   * @generated
   * @ordered
   */
  protected static final String BUSINESS_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBusinessKey() <em>Business Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessKey()
   * @generated
   * @ordered
   */
  protected String businessKey = BUSINESS_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getBusinessName() <em>Business Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessName()
   * @generated
   * @ordered
   */
  protected static final String BUSINESS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessName()
   * @generated
   * @ordered
   */
  protected String businessName = BUSINESS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected static final String NULLABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected String nullable = NULLABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLICITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected String multiplicity = MULTIPLICITY_EDEFAULT;

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
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected Invariants invariants;

  /**
   * The cached value of the '{@link #getOverridden() <em>Overridden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverridden()
   * @generated
   * @ordered
   */
  protected OverriddenTypeMetaInfo overridden;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return DomainDrivenDesignDslPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(String newDoc)
  {
    String oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTechnicalId()
  {
    return technicalId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTechnicalId(String newTechnicalId)
  {
    String oldTechnicalId = technicalId;
    technicalId = newTechnicalId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__TECHNICAL_ID, oldTechnicalId, technicalId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBusinessKey()
  {
    return businessKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusinessKey(String newBusinessKey)
  {
    String oldBusinessKey = businessKey;
    businessKey = newBusinessKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_KEY, oldBusinessKey, businessKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBusinessName()
  {
    return businessName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusinessName(String newBusinessName)
  {
    String oldBusinessName = businessName;
    businessName = newBusinessName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_NAME, oldBusinessName, businessName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(String newNullable)
  {
    String oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainDrivenDesignDslPackage.VARIABLE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(String newMultiplicity)
  {
    String oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__MULTIPLICITY, oldMultiplicity, multiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invariants getInvariants()
  {
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariants(Invariants newInvariants, NotificationChain msgs)
  {
    Invariants oldInvariants = invariants;
    invariants = newInvariants;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS, oldInvariants, newInvariants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariants(Invariants newInvariants)
  {
    if (newInvariants != invariants)
    {
      NotificationChain msgs = null;
      if (invariants != null)
        msgs = ((InternalEObject)invariants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS, null, msgs);
      if (newInvariants != null)
        msgs = ((InternalEObject)newInvariants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS, null, msgs);
      msgs = basicSetInvariants(newInvariants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS, newInvariants, newInvariants));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverriddenTypeMetaInfo getOverridden()
  {
    return overridden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverridden(OverriddenTypeMetaInfo newOverridden, NotificationChain msgs)
  {
    OverriddenTypeMetaInfo oldOverridden = overridden;
    overridden = newOverridden;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, oldOverridden, newOverridden);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverridden(OverriddenTypeMetaInfo newOverridden)
  {
    if (newOverridden != overridden)
    {
      NotificationChain msgs = null;
      if (overridden != null)
        msgs = ((InternalEObject)overridden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, null, msgs);
      if (newOverridden != null)
        msgs = ((InternalEObject)newOverridden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, null, msgs);
      msgs = basicSetOverridden(newOverridden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN, newOverridden, newOverridden));
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
      case DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS:
        return basicSetInvariants(null, msgs);
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return basicSetOverridden(null, msgs);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        return getDoc();
      case DomainDrivenDesignDslPackage.VARIABLE__TECHNICAL_ID:
        return getTechnicalId();
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_KEY:
        return getBusinessKey();
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_NAME:
        return getBusinessName();
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        return getNullable();
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DomainDrivenDesignDslPackage.VARIABLE__MULTIPLICITY:
        return getMultiplicity();
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        return getName();
      case DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS:
        return getInvariants();
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return getOverridden();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        setDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TECHNICAL_ID:
        setTechnicalId((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_KEY:
        setBusinessKey((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_NAME:
        setBusinessName((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        setNullable((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        setType((Type)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__MULTIPLICITY:
        setMultiplicity((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS:
        setInvariants((Invariants)newValue);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        setOverridden((OverriddenTypeMetaInfo)newValue);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TECHNICAL_ID:
        setTechnicalId(TECHNICAL_ID_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_KEY:
        setBusinessKey(BUSINESS_KEY_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_NAME:
        setBusinessName(BUSINESS_NAME_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        setType((Type)null);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS:
        setInvariants((Invariants)null);
        return;
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        setOverridden((OverriddenTypeMetaInfo)null);
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
      case DomainDrivenDesignDslPackage.VARIABLE__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case DomainDrivenDesignDslPackage.VARIABLE__TECHNICAL_ID:
        return TECHNICAL_ID_EDEFAULT == null ? technicalId != null : !TECHNICAL_ID_EDEFAULT.equals(technicalId);
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_KEY:
        return BUSINESS_KEY_EDEFAULT == null ? businessKey != null : !BUSINESS_KEY_EDEFAULT.equals(businessKey);
      case DomainDrivenDesignDslPackage.VARIABLE__BUSINESS_NAME:
        return BUSINESS_NAME_EDEFAULT == null ? businessName != null : !BUSINESS_NAME_EDEFAULT.equals(businessName);
      case DomainDrivenDesignDslPackage.VARIABLE__NULLABLE:
        return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
      case DomainDrivenDesignDslPackage.VARIABLE__TYPE:
        return type != null;
      case DomainDrivenDesignDslPackage.VARIABLE__MULTIPLICITY:
        return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
      case DomainDrivenDesignDslPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainDrivenDesignDslPackage.VARIABLE__INVARIANTS:
        return invariants != null;
      case DomainDrivenDesignDslPackage.VARIABLE__OVERRIDDEN:
        return overridden != null;
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
    result.append(" (doc: ");
    result.append(doc);
    result.append(", technicalId: ");
    result.append(technicalId);
    result.append(", businessKey: ");
    result.append(businessKey);
    result.append(", businessName: ");
    result.append(businessName);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(", multiplicity: ");
    result.append(multiplicity);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableImpl