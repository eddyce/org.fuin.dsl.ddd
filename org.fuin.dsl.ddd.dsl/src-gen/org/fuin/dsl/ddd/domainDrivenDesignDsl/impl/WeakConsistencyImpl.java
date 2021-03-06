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
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyDetection;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InconsistencyResolution;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Consistency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getAcceptableDoc <em>Acceptable Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getAcceptable <em>Acceptable</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getDetectionDoc <em>Detection Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getDetection <em>Detection</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getResolutionDoc <em>Resolution Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.impl.WeakConsistencyImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeakConsistencyImpl extends MinimalEObjectImpl.Container implements WeakConsistency
{
  /**
   * The default value of the '{@link #getAcceptableDoc() <em>Acceptable Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptableDoc()
   * @generated
   * @ordered
   */
  protected static final String ACCEPTABLE_DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcceptableDoc() <em>Acceptable Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptableDoc()
   * @generated
   * @ordered
   */
  protected String acceptableDoc = ACCEPTABLE_DOC_EDEFAULT;

  /**
   * The cached value of the '{@link #getAcceptable() <em>Acceptable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptable()
   * @generated
   * @ordered
   */
  protected Duration acceptable;

  /**
   * The default value of the '{@link #getDetectionDoc() <em>Detection Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetectionDoc()
   * @generated
   * @ordered
   */
  protected static final String DETECTION_DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetectionDoc() <em>Detection Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetectionDoc()
   * @generated
   * @ordered
   */
  protected String detectionDoc = DETECTION_DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getDetection() <em>Detection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetection()
   * @generated
   * @ordered
   */
  protected static final InconsistencyDetection DETECTION_EDEFAULT = InconsistencyDetection.NEVER;

  /**
   * The cached value of the '{@link #getDetection() <em>Detection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetection()
   * @generated
   * @ordered
   */
  protected InconsistencyDetection detection = DETECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getResolutionDoc() <em>Resolution Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolutionDoc()
   * @generated
   * @ordered
   */
  protected static final String RESOLUTION_DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResolutionDoc() <em>Resolution Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolutionDoc()
   * @generated
   * @ordered
   */
  protected String resolutionDoc = RESOLUTION_DOC_EDEFAULT;

  /**
   * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected static final InconsistencyResolution RESOLUTION_EDEFAULT = InconsistencyResolution.NEVER;

  /**
   * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected InconsistencyResolution resolution = RESOLUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeakConsistencyImpl()
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
    return DomainDrivenDesignDslPackage.Literals.WEAK_CONSISTENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcceptableDoc()
  {
    return acceptableDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptableDoc(String newAcceptableDoc)
  {
    String oldAcceptableDoc = acceptableDoc;
    acceptableDoc = newAcceptableDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE_DOC, oldAcceptableDoc, acceptableDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration getAcceptable()
  {
    return acceptable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptable(Duration newAcceptable, NotificationChain msgs)
  {
    Duration oldAcceptable = acceptable;
    acceptable = newAcceptable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE, oldAcceptable, newAcceptable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptable(Duration newAcceptable)
  {
    if (newAcceptable != acceptable)
    {
      NotificationChain msgs = null;
      if (acceptable != null)
        msgs = ((InternalEObject)acceptable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE, null, msgs);
      if (newAcceptable != null)
        msgs = ((InternalEObject)newAcceptable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE, null, msgs);
      msgs = basicSetAcceptable(newAcceptable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE, newAcceptable, newAcceptable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetectionDoc()
  {
    return detectionDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetectionDoc(String newDetectionDoc)
  {
    String oldDetectionDoc = detectionDoc;
    detectionDoc = newDetectionDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION_DOC, oldDetectionDoc, detectionDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InconsistencyDetection getDetection()
  {
    return detection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetection(InconsistencyDetection newDetection)
  {
    InconsistencyDetection oldDetection = detection;
    detection = newDetection == null ? DETECTION_EDEFAULT : newDetection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION, oldDetection, detection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResolutionDoc()
  {
    return resolutionDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolutionDoc(String newResolutionDoc)
  {
    String oldResolutionDoc = resolutionDoc;
    resolutionDoc = newResolutionDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION_DOC, oldResolutionDoc, resolutionDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InconsistencyResolution getResolution()
  {
    return resolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolution(InconsistencyResolution newResolution)
  {
    InconsistencyResolution oldResolution = resolution;
    resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION, oldResolution, resolution));
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
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE:
        return basicSetAcceptable(null, msgs);
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
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE_DOC:
        return getAcceptableDoc();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE:
        return getAcceptable();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION_DOC:
        return getDetectionDoc();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION:
        return getDetection();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION_DOC:
        return getResolutionDoc();
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION:
        return getResolution();
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
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE_DOC:
        setAcceptableDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE:
        setAcceptable((Duration)newValue);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION_DOC:
        setDetectionDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION:
        setDetection((InconsistencyDetection)newValue);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION_DOC:
        setResolutionDoc((String)newValue);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION:
        setResolution((InconsistencyResolution)newValue);
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
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE_DOC:
        setAcceptableDoc(ACCEPTABLE_DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE:
        setAcceptable((Duration)null);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION_DOC:
        setDetectionDoc(DETECTION_DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION:
        setDetection(DETECTION_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION_DOC:
        setResolutionDoc(RESOLUTION_DOC_EDEFAULT);
        return;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION:
        setResolution(RESOLUTION_EDEFAULT);
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
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE_DOC:
        return ACCEPTABLE_DOC_EDEFAULT == null ? acceptableDoc != null : !ACCEPTABLE_DOC_EDEFAULT.equals(acceptableDoc);
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__ACCEPTABLE:
        return acceptable != null;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION_DOC:
        return DETECTION_DOC_EDEFAULT == null ? detectionDoc != null : !DETECTION_DOC_EDEFAULT.equals(detectionDoc);
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__DETECTION:
        return detection != DETECTION_EDEFAULT;
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION_DOC:
        return RESOLUTION_DOC_EDEFAULT == null ? resolutionDoc != null : !RESOLUTION_DOC_EDEFAULT.equals(resolutionDoc);
      case DomainDrivenDesignDslPackage.WEAK_CONSISTENCY__RESOLUTION:
        return resolution != RESOLUTION_EDEFAULT;
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
    result.append(" (acceptableDoc: ");
    result.append(acceptableDoc);
    result.append(", detectionDoc: ");
    result.append(detectionDoc);
    result.append(", detection: ");
    result.append(detection);
    result.append(", resolutionDoc: ");
    result.append(resolutionDoc);
    result.append(", resolution: ");
    result.append(resolution);
    result.append(')');
    return result.toString();
  }

} //WeakConsistencyImpl
