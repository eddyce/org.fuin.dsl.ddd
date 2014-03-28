/**
 */
package org.fuin.dsl.ddd.domainDrivenDesignDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainDrivenDesignDslFactoryImpl extends EFactoryImpl implements DomainDrivenDesignDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainDrivenDesignDslFactory init()
  {
    try
    {
      DomainDrivenDesignDslFactory theDomainDrivenDesignDslFactory = (DomainDrivenDesignDslFactory)EPackage.Registry.INSTANCE.getEFactory(DomainDrivenDesignDslPackage.eNS_URI);
      if (theDomainDrivenDesignDslFactory != null)
      {
        return theDomainDrivenDesignDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainDrivenDesignDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDrivenDesignDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainDrivenDesignDslPackage.DOMAIN_MODEL: return createDomainModel();
      case DomainDrivenDesignDslPackage.NAMESPACE: return createNamespace();
      case DomainDrivenDesignDslPackage.IMPORT: return createImport();
      case DomainDrivenDesignDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DomainDrivenDesignDslPackage.TYPE: return createType();
      case DomainDrivenDesignDslPackage.ABSTRACT_VO: return createAbstractVO();
      case DomainDrivenDesignDslPackage.ABSTRACT_ENTITY: return createAbstractEntity();
      case DomainDrivenDesignDslPackage.CONSTRAINT_TARGET: return createConstraintTarget();
      case DomainDrivenDesignDslPackage.EXTERNAL_TYPE: return createExternalType();
      case DomainDrivenDesignDslPackage.CONSTRAINT: return createConstraint();
      case DomainDrivenDesignDslPackage.VALUE_OBJECT: return createValueObject();
      case DomainDrivenDesignDslPackage.ENUM_OBJECT: return createEnumObject();
      case DomainDrivenDesignDslPackage.ENUM_INSTANCE: return createEnumInstance();
      case DomainDrivenDesignDslPackage.ENTITY: return createEntity();
      case DomainDrivenDesignDslPackage.AGGREGATE: return createAggregate();
      case DomainDrivenDesignDslPackage.CONSTRUCTOR: return createConstructor();
      case DomainDrivenDesignDslPackage.METHOD: return createMethod();
      case DomainDrivenDesignDslPackage.EVENT: return createEvent();
      case DomainDrivenDesignDslPackage.TYPE_META_INFO: return createTypeMetaInfo();
      case DomainDrivenDesignDslPackage.VARIABLE: return createVariable();
      case DomainDrivenDesignDslPackage.CONSTRAINTS: return createConstraints();
      case DomainDrivenDesignDslPackage.INVARIANTS: return createInvariants();
      case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO: return createOverriddenTypeMetaInfo();
      case DomainDrivenDesignDslPackage.MESSAGE: return createMessage();
      case DomainDrivenDesignDslPackage.CONSTRAINT_CALL: return createConstraintCall();
      case DomainDrivenDesignDslPackage.LITERAL: return createLiteral();
      case DomainDrivenDesignDslPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case DomainDrivenDesignDslPackage.NULL_LITERAL: return createNullLiteral();
      case DomainDrivenDesignDslPackage.NUMBER_LITERAL: return createNumberLiteral();
      case DomainDrivenDesignDslPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractVO createAbstractVO()
  {
    AbstractVOImpl abstractVO = new AbstractVOImpl();
    return abstractVO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntity createAbstractEntity()
  {
    AbstractEntityImpl abstractEntity = new AbstractEntityImpl();
    return abstractEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintTarget createConstraintTarget()
  {
    ConstraintTargetImpl constraintTarget = new ConstraintTargetImpl();
    return constraintTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalType createExternalType()
  {
    ExternalTypeImpl externalType = new ExternalTypeImpl();
    return externalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueObject createValueObject()
  {
    ValueObjectImpl valueObject = new ValueObjectImpl();
    return valueObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumObject createEnumObject()
  {
    EnumObjectImpl enumObject = new EnumObjectImpl();
    return enumObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumInstance createEnumInstance()
  {
    EnumInstanceImpl enumInstance = new EnumInstanceImpl();
    return enumInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate createAggregate()
  {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMetaInfo createTypeMetaInfo()
  {
    TypeMetaInfoImpl typeMetaInfo = new TypeMetaInfoImpl();
    return typeMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraints createConstraints()
  {
    ConstraintsImpl constraints = new ConstraintsImpl();
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invariants createInvariants()
  {
    InvariantsImpl invariants = new InvariantsImpl();
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverriddenTypeMetaInfo createOverriddenTypeMetaInfo()
  {
    OverriddenTypeMetaInfoImpl overriddenTypeMetaInfo = new OverriddenTypeMetaInfoImpl();
    return overriddenTypeMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintCall createConstraintCall()
  {
    ConstraintCallImpl constraintCall = new ConstraintCallImpl();
    return constraintCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDrivenDesignDslPackage getDomainDrivenDesignDslPackage()
  {
    return (DomainDrivenDesignDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainDrivenDesignDslPackage getPackage()
  {
    return DomainDrivenDesignDslPackage.eINSTANCE;
  }

} //DomainDrivenDesignDslFactoryImpl