/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Context;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Import;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Method;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Service;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Type;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage
 * @generated
 */
public class DomainDrivenDesignDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainDrivenDesignDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDrivenDesignDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainDrivenDesignDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainDrivenDesignDslSwitch<Adapter> modelSwitch =
    new DomainDrivenDesignDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseInternalType(InternalType object)
      {
        return createInternalTypeAdapter();
      }
      @Override
      public Adapter caseAbstractVO(AbstractVO object)
      {
        return createAbstractVOAdapter();
      }
      @Override
      public Adapter caseAbstractEntityId(AbstractEntityId object)
      {
        return createAbstractEntityIdAdapter();
      }
      @Override
      public Adapter caseAbstractEntity(AbstractEntity object)
      {
        return createAbstractEntityAdapter();
      }
      @Override
      public Adapter caseExternalType(ExternalType object)
      {
        return createExternalTypeAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseWeakConsistency(WeakConsistency object)
      {
        return createWeakConsistencyAdapter();
      }
      @Override
      public Adapter caseConsistency(Consistency object)
      {
        return createConsistencyAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseException(org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception object)
      {
        return createExceptionAdapter();
      }
      @Override
      public Adapter caseValueObject(ValueObject object)
      {
        return createValueObjectAdapter();
      }
      @Override
      public Adapter caseEntityId(EntityId object)
      {
        return createEntityIdAdapter();
      }
      @Override
      public Adapter caseAggregateId(AggregateId object)
      {
        return createAggregateIdAdapter();
      }
      @Override
      public Adapter caseEnumObject(EnumObject object)
      {
        return createEnumObjectAdapter();
      }
      @Override
      public Adapter caseEnumInstance(EnumInstance object)
      {
        return createEnumInstanceAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAggregate(Aggregate object)
      {
        return createAggregateAdapter();
      }
      @Override
      public Adapter caseAbstractMethod(AbstractMethod object)
      {
        return createAbstractMethodAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseReturnType(ReturnType object)
      {
        return createReturnTypeAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseTypeMetaInfo(TypeMetaInfo object)
      {
        return createTypeMetaInfoAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseGenericArgs(GenericArgs object)
      {
        return createGenericArgsAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseInvariants(Invariants object)
      {
        return createInvariantsAdapter();
      }
      @Override
      public Adapter casePreconditions(Preconditions object)
      {
        return createPreconditionsAdapter();
      }
      @Override
      public Adapter caseBusinessRules(BusinessRules object)
      {
        return createBusinessRulesAdapter();
      }
      @Override
      public Adapter caseOverriddenTypeMetaInfo(OverriddenTypeMetaInfo object)
      {
        return createOverriddenTypeMetaInfoAdapter();
      }
      @Override
      public Adapter caseConstraintInstance(ConstraintInstance object)
      {
        return createConstraintInstanceAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType <em>Internal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.InternalType
   * @generated
   */
  public Adapter createInternalTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO <em>Abstract VO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractVO
   * @generated
   */
  public Adapter createAbstractVOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId <em>Abstract Entity Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntityId
   * @generated
   */
  public Adapter createAbstractEntityIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity <em>Abstract Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractEntity
   * @generated
   */
  public Adapter createAbstractEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType <em>External Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ExternalType
   * @generated
   */
  public Adapter createExternalTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency <em>Weak Consistency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.WeakConsistency
   * @generated
   */
  public Adapter createWeakConsistencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency <em>Consistency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Consistency
   * @generated
   */
  public Adapter createConsistencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Exception
   * @generated
   */
  public Adapter createExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject <em>Value Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ValueObject
   * @generated
   */
  public Adapter createValueObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId <em>Entity Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EntityId
   * @generated
   */
  public Adapter createEntityIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId <em>Aggregate Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId
   * @generated
   */
  public Adapter createAggregateIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject <em>Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumObject
   * @generated
   */
  public Adapter createEnumObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.EnumInstance
   * @generated
   */
  public Adapter createEnumInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate
   * @generated
   */
  public Adapter createAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod <em>Abstract Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod
   * @generated
   */
  public Adapter createAbstractMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ReturnType
   * @generated
   */
  public Adapter createReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo <em>Type Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.TypeMetaInfo
   * @generated
   */
  public Adapter createTypeMetaInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs <em>Generic Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.GenericArgs
   * @generated
   */
  public Adapter createGenericArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants
   * @generated
   */
  public Adapter createInvariantsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Preconditions
   * @generated
   */
  public Adapter createPreconditionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules <em>Business Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.BusinessRules
   * @generated
   */
  public Adapter createBusinessRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo <em>Overridden Type Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo
   * @generated
   */
  public Adapter createOverriddenTypeMetaInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance <em>Constraint Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance
   * @generated
   */
  public Adapter createConstraintInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.fuin.dsl.ddd.domainDrivenDesignDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DomainDrivenDesignDslAdapterFactory
