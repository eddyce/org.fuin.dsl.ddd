/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEnumInstance()
 * @model
 * @generated
 */
public interface EnumInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' attribute.
   * @see #setDoc(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEnumInstance_Doc()
   * @model
   * @generated
   */
  String getDoc();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDoc <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' attribute.
   * @see #getDoc()
   * @generated
   */
  void setDoc(String value);

  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEnumInstance_Deprecated()
   * @model
   * @generated
   */
  String getDeprecated();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see #getDeprecated()
   * @generated
   */
  void setDeprecated(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEnumInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage#getEnumInstance_Params()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getParams();

} // EnumInstance
