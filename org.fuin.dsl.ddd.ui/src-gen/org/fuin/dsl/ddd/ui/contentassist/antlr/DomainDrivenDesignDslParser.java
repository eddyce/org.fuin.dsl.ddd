/*
* generated by Xtext
*/
package org.fuin.dsl.ddd.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;

public class DomainDrivenDesignDslParser extends AbstractContentAssistParser {
	
	@Inject
	private DomainDrivenDesignDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser createParser() {
		org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser result = new org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0(), "rule__Import__ImportedNamespaceAlternatives_1_0");
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getInternalTypeAccess().getAlternatives(), "rule__InternalType__Alternatives");
					put(grammarAccess.getAbstractVOAccess().getAlternatives(), "rule__AbstractVO__Alternatives");
					put(grammarAccess.getAbstractEntityIdAccess().getAlternatives(), "rule__AbstractEntityId__Alternatives");
					put(grammarAccess.getAbstractEntityAccess().getAlternatives(), "rule__AbstractEntity__Alternatives");
					put(grammarAccess.getAbstractMethodAccess().getAlternatives(), "rule__AbstractMethod__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0(), "rule__BooleanLiteral__ValueAlternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_1_0(), "rule__Number__Alternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives_1_1_1(), "rule__Number__Alternatives_1_1_1");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getConsistencyLevelAccess().getAlternatives(), "rule__ConsistencyLevel__Alternatives");
					put(grammarAccess.getInconsistencyDetectionAccess().getAlternatives(), "rule__InconsistencyDetection__Alternatives");
					put(grammarAccess.getInconsistencyResolutionAccess().getAlternatives(), "rule__InconsistencyResolution__Alternatives");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getExternalTypeAccess().getGroup(), "rule__ExternalType__Group__0");
					put(grammarAccess.getExternalTypeAccess().getGroup_4(), "rule__ExternalType__Group_4__0");
					put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
					put(grammarAccess.getWeakConsistencyAccess().getGroup(), "rule__WeakConsistency__Group__0");
					put(grammarAccess.getConsistencyAccess().getGroup(), "rule__Consistency__Group__0");
					put(grammarAccess.getConsistencyAccess().getGroup_3(), "rule__Consistency__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup_3(), "rule__Constraint__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup_4(), "rule__Constraint__Group_4__0");
					put(grammarAccess.getConstraintAccess().getGroup_8(), "rule__Constraint__Group_8__0");
					put(grammarAccess.getExceptionAccess().getGroup(), "rule__Exception__Group__0");
					put(grammarAccess.getExceptionAccess().getGroup_3(), "rule__Exception__Group_3__0");
					put(grammarAccess.getValueObjectAccess().getGroup(), "rule__ValueObject__Group__0");
					put(grammarAccess.getValueObjectAccess().getGroup_3(), "rule__ValueObject__Group_3__0");
					put(grammarAccess.getEntityIdAccess().getGroup(), "rule__EntityId__Group__0");
					put(grammarAccess.getEntityIdAccess().getGroup_3(), "rule__EntityId__Group_3__0");
					put(grammarAccess.getEntityIdAccess().getGroup_4(), "rule__EntityId__Group_4__0");
					put(grammarAccess.getAggregateIdAccess().getGroup(), "rule__AggregateId__Group__0");
					put(grammarAccess.getAggregateIdAccess().getGroup_3(), "rule__AggregateId__Group_3__0");
					put(grammarAccess.getAggregateIdAccess().getGroup_4(), "rule__AggregateId__Group_4__0");
					put(grammarAccess.getEnumObjectAccess().getGroup(), "rule__EnumObject__Group__0");
					put(grammarAccess.getEnumObjectAccess().getGroup_3(), "rule__EnumObject__Group_3__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup(), "rule__EnumInstance__Group__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup_3(), "rule__EnumInstance__Group_3__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup_3_2(), "rule__EnumInstance__Group_3_2__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEventAccess().getGroup_5(), "rule__Event__Group_5__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getAggregateAccess().getGroup(), "rule__Aggregate__Group__0");
					put(grammarAccess.getAggregateAccess().getGroup_3(), "rule__Aggregate__Group_3__0");
					put(grammarAccess.getConstructorAccess().getGroup(), "rule__Constructor__Group__0");
					put(grammarAccess.getConstructorAccess().getGroup_5(), "rule__Constructor__Group_5__0");
					put(grammarAccess.getConstructorAccess().getGroup_5_2(), "rule__Constructor__Group_5_2__0");
					put(grammarAccess.getReturnTypeAccess().getGroup(), "rule__ReturnType__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_6(), "rule__Method__Group_6__0");
					put(grammarAccess.getMethodAccess().getGroup_6_2(), "rule__Method__Group_6_2__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup(), "rule__TypeMetaInfo__Group__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_1(), "rule__TypeMetaInfo__Group_1__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_2(), "rule__TypeMetaInfo__Group_2__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_3(), "rule__TypeMetaInfo__Group_3__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_4(), "rule__TypeMetaInfo__Group_4__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_5(), "rule__TypeMetaInfo__Group_5__0");
					put(grammarAccess.getGenericArgsAccess().getGroup(), "rule__GenericArgs__Group__0");
					put(grammarAccess.getGenericArgsAccess().getGroup_2(), "rule__GenericArgs__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getInvariantsAccess().getGroup(), "rule__Invariants__Group__0");
					put(grammarAccess.getInvariantsAccess().getGroup_2(), "rule__Invariants__Group_2__0");
					put(grammarAccess.getPreconditionsAccess().getGroup(), "rule__Preconditions__Group__0");
					put(grammarAccess.getPreconditionsAccess().getGroup_2(), "rule__Preconditions__Group_2__0");
					put(grammarAccess.getBusinessRulesAccess().getGroup(), "rule__BusinessRules__Group__0");
					put(grammarAccess.getBusinessRulesAccess().getGroup_2(), "rule__BusinessRules__Group_2__0");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup(), "rule__OverriddenTypeMetaInfo__Group__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup(), "rule__ConstraintInstance__Group__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup_1(), "rule__ConstraintInstance__Group_1__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup_1_2(), "rule__ConstraintInstance__Group_1_2__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFQNWithWildcardAccess().getGroup(), "rule__FQNWithWildcard__Group__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup(), "rule__NumberLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_1_1(), "rule__Number__Group_1_1__0");
					put(grammarAccess.getDomainModelAccess().getContextsAssignment(), "rule__DomainModel__ContextsAssignment");
					put(grammarAccess.getContextAccess().getNameAssignment_1(), "rule__Context__NameAssignment_1");
					put(grammarAccess.getContextAccess().getNamespacesAssignment_3(), "rule__Context__NamespacesAssignment_3");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_3(), "rule__Namespace__ImportsAssignment_3");
					put(grammarAccess.getNamespaceAccess().getElementsAssignment_4(), "rule__Namespace__ElementsAssignment_4");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getExternalTypeAccess().getDocAssignment_0(), "rule__ExternalType__DocAssignment_0");
					put(grammarAccess.getExternalTypeAccess().getElementAssignment_2(), "rule__ExternalType__ElementAssignment_2");
					put(grammarAccess.getExternalTypeAccess().getNameAssignment_3(), "rule__ExternalType__NameAssignment_3");
					put(grammarAccess.getExternalTypeAccess().getGenericsAssignment_4_1(), "rule__ExternalType__GenericsAssignment_4_1");
					put(grammarAccess.getDurationAccess().getTimeAssignment_0(), "rule__Duration__TimeAssignment_0");
					put(grammarAccess.getDurationAccess().getUnitAssignment_1(), "rule__Duration__UnitAssignment_1");
					put(grammarAccess.getWeakConsistencyAccess().getAcceptableDocAssignment_0(), "rule__WeakConsistency__AcceptableDocAssignment_0");
					put(grammarAccess.getWeakConsistencyAccess().getAcceptableAssignment_2(), "rule__WeakConsistency__AcceptableAssignment_2");
					put(grammarAccess.getWeakConsistencyAccess().getDetectionDocAssignment_3(), "rule__WeakConsistency__DetectionDocAssignment_3");
					put(grammarAccess.getWeakConsistencyAccess().getDetectionAssignment_5(), "rule__WeakConsistency__DetectionAssignment_5");
					put(grammarAccess.getWeakConsistencyAccess().getResolutionDocAssignment_6(), "rule__WeakConsistency__ResolutionDocAssignment_6");
					put(grammarAccess.getWeakConsistencyAccess().getResolutionAssignment_8(), "rule__WeakConsistency__ResolutionAssignment_8");
					put(grammarAccess.getConsistencyAccess().getDocAssignment_0(), "rule__Consistency__DocAssignment_0");
					put(grammarAccess.getConsistencyAccess().getLevelAssignment_2(), "rule__Consistency__LevelAssignment_2");
					put(grammarAccess.getConsistencyAccess().getWeakConsistencyAssignment_3_1(), "rule__Consistency__WeakConsistencyAssignment_3_1");
					put(grammarAccess.getConstraintAccess().getDocAssignment_0(), "rule__Constraint__DocAssignment_0");
					put(grammarAccess.getConstraintAccess().getNameAssignment_2(), "rule__Constraint__NameAssignment_2");
					put(grammarAccess.getConstraintAccess().getInputAssignment_3_1(), "rule__Constraint__InputAssignment_3_1");
					put(grammarAccess.getConstraintAccess().getExceptionAssignment_4_1(), "rule__Constraint__ExceptionAssignment_4_1");
					put(grammarAccess.getConstraintAccess().getAttributesAssignment_6(), "rule__Constraint__AttributesAssignment_6");
					put(grammarAccess.getConstraintAccess().getConsistencyAssignment_7(), "rule__Constraint__ConsistencyAssignment_7");
					put(grammarAccess.getConstraintAccess().getMessageAssignment_8_1(), "rule__Constraint__MessageAssignment_8_1");
					put(grammarAccess.getExceptionAccess().getDocAssignment_0(), "rule__Exception__DocAssignment_0");
					put(grammarAccess.getExceptionAccess().getNameAssignment_2(), "rule__Exception__NameAssignment_2");
					put(grammarAccess.getExceptionAccess().getCidAssignment_3_1(), "rule__Exception__CidAssignment_3_1");
					put(grammarAccess.getExceptionAccess().getAttributesAssignment_5(), "rule__Exception__AttributesAssignment_5");
					put(grammarAccess.getExceptionAccess().getMessageAssignment_7(), "rule__Exception__MessageAssignment_7");
					put(grammarAccess.getValueObjectAccess().getDocAssignment_0(), "rule__ValueObject__DocAssignment_0");
					put(grammarAccess.getValueObjectAccess().getNameAssignment_2(), "rule__ValueObject__NameAssignment_2");
					put(grammarAccess.getValueObjectAccess().getBaseAssignment_3_1(), "rule__ValueObject__BaseAssignment_3_1");
					put(grammarAccess.getValueObjectAccess().getInvariantsAssignment_4(), "rule__ValueObject__InvariantsAssignment_4");
					put(grammarAccess.getValueObjectAccess().getMetaInfoAssignment_6(), "rule__ValueObject__MetaInfoAssignment_6");
					put(grammarAccess.getValueObjectAccess().getAttributesAssignment_7(), "rule__ValueObject__AttributesAssignment_7");
					put(grammarAccess.getValueObjectAccess().getConstructorsAssignment_8(), "rule__ValueObject__ConstructorsAssignment_8");
					put(grammarAccess.getValueObjectAccess().getMethodsAssignment_9(), "rule__ValueObject__MethodsAssignment_9");
					put(grammarAccess.getEntityIdAccess().getDocAssignment_0(), "rule__EntityId__DocAssignment_0");
					put(grammarAccess.getEntityIdAccess().getNameAssignment_2(), "rule__EntityId__NameAssignment_2");
					put(grammarAccess.getEntityIdAccess().getEntityAssignment_3_1(), "rule__EntityId__EntityAssignment_3_1");
					put(grammarAccess.getEntityIdAccess().getBaseAssignment_4_1(), "rule__EntityId__BaseAssignment_4_1");
					put(grammarAccess.getEntityIdAccess().getInvariantsAssignment_5(), "rule__EntityId__InvariantsAssignment_5");
					put(grammarAccess.getEntityIdAccess().getMetaInfoAssignment_7(), "rule__EntityId__MetaInfoAssignment_7");
					put(grammarAccess.getEntityIdAccess().getAttributesAssignment_8(), "rule__EntityId__AttributesAssignment_8");
					put(grammarAccess.getEntityIdAccess().getConstructorsAssignment_9(), "rule__EntityId__ConstructorsAssignment_9");
					put(grammarAccess.getEntityIdAccess().getMethodsAssignment_10(), "rule__EntityId__MethodsAssignment_10");
					put(grammarAccess.getAggregateIdAccess().getDocAssignment_0(), "rule__AggregateId__DocAssignment_0");
					put(grammarAccess.getAggregateIdAccess().getNameAssignment_2(), "rule__AggregateId__NameAssignment_2");
					put(grammarAccess.getAggregateIdAccess().getAggregateAssignment_3_1(), "rule__AggregateId__AggregateAssignment_3_1");
					put(grammarAccess.getAggregateIdAccess().getBaseAssignment_4_1(), "rule__AggregateId__BaseAssignment_4_1");
					put(grammarAccess.getAggregateIdAccess().getInvariantsAssignment_5(), "rule__AggregateId__InvariantsAssignment_5");
					put(grammarAccess.getAggregateIdAccess().getMetaInfoAssignment_7(), "rule__AggregateId__MetaInfoAssignment_7");
					put(grammarAccess.getAggregateIdAccess().getAttributesAssignment_8(), "rule__AggregateId__AttributesAssignment_8");
					put(grammarAccess.getAggregateIdAccess().getConstructorsAssignment_9(), "rule__AggregateId__ConstructorsAssignment_9");
					put(grammarAccess.getAggregateIdAccess().getMethodsAssignment_10(), "rule__AggregateId__MethodsAssignment_10");
					put(grammarAccess.getEnumObjectAccess().getDocAssignment_0(), "rule__EnumObject__DocAssignment_0");
					put(grammarAccess.getEnumObjectAccess().getNameAssignment_2(), "rule__EnumObject__NameAssignment_2");
					put(grammarAccess.getEnumObjectAccess().getBaseAssignment_3_1(), "rule__EnumObject__BaseAssignment_3_1");
					put(grammarAccess.getEnumObjectAccess().getInvariantsAssignment_4(), "rule__EnumObject__InvariantsAssignment_4");
					put(grammarAccess.getEnumObjectAccess().getMetaInfoAssignment_6(), "rule__EnumObject__MetaInfoAssignment_6");
					put(grammarAccess.getEnumObjectAccess().getAttributesAssignment_7(), "rule__EnumObject__AttributesAssignment_7");
					put(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10(), "rule__EnumObject__InstancesAssignment_10");
					put(grammarAccess.getEnumInstanceAccess().getDocAssignment_0(), "rule__EnumInstance__DocAssignment_0");
					put(grammarAccess.getEnumInstanceAccess().getDeprecatedAssignment_1(), "rule__EnumInstance__DeprecatedAssignment_1");
					put(grammarAccess.getEnumInstanceAccess().getNameAssignment_2(), "rule__EnumInstance__NameAssignment_2");
					put(grammarAccess.getEnumInstanceAccess().getParamsAssignment_3_1(), "rule__EnumInstance__ParamsAssignment_3_1");
					put(grammarAccess.getEnumInstanceAccess().getParamsAssignment_3_2_1(), "rule__EnumInstance__ParamsAssignment_3_2_1");
					put(grammarAccess.getEventAccess().getDocAssignment_0(), "rule__Event__DocAssignment_0");
					put(grammarAccess.getEventAccess().getNameAssignment_2(), "rule__Event__NameAssignment_2");
					put(grammarAccess.getEventAccess().getAttributesAssignment_4(), "rule__Event__AttributesAssignment_4");
					put(grammarAccess.getEventAccess().getMessageAssignment_5_1(), "rule__Event__MessageAssignment_5_1");
					put(grammarAccess.getEntityAccess().getDocAssignment_0(), "rule__Entity__DocAssignment_0");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getIdTypeAssignment_3_1(), "rule__Entity__IdTypeAssignment_3_1");
					put(grammarAccess.getEntityAccess().getRootAssignment_4_1(), "rule__Entity__RootAssignment_4_1");
					put(grammarAccess.getEntityAccess().getInvariantsAssignment_5(), "rule__Entity__InvariantsAssignment_5");
					put(grammarAccess.getEntityAccess().getMetaInfoAssignment_7(), "rule__Entity__MetaInfoAssignment_7");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_8(), "rule__Entity__AttributesAssignment_8");
					put(grammarAccess.getEntityAccess().getConstructorsAssignment_9(), "rule__Entity__ConstructorsAssignment_9");
					put(grammarAccess.getEntityAccess().getMethodsAssignment_10(), "rule__Entity__MethodsAssignment_10");
					put(grammarAccess.getEntityAccess().getElementsAssignment_11(), "rule__Entity__ElementsAssignment_11");
					put(grammarAccess.getAggregateAccess().getDocAssignment_0(), "rule__Aggregate__DocAssignment_0");
					put(grammarAccess.getAggregateAccess().getNameAssignment_2(), "rule__Aggregate__NameAssignment_2");
					put(grammarAccess.getAggregateAccess().getIdTypeAssignment_3_1(), "rule__Aggregate__IdTypeAssignment_3_1");
					put(grammarAccess.getAggregateAccess().getInvariantsAssignment_4(), "rule__Aggregate__InvariantsAssignment_4");
					put(grammarAccess.getAggregateAccess().getMetaInfoAssignment_6(), "rule__Aggregate__MetaInfoAssignment_6");
					put(grammarAccess.getAggregateAccess().getAttributesAssignment_7(), "rule__Aggregate__AttributesAssignment_7");
					put(grammarAccess.getAggregateAccess().getConstructorsAssignment_8(), "rule__Aggregate__ConstructorsAssignment_8");
					put(grammarAccess.getAggregateAccess().getMethodsAssignment_9(), "rule__Aggregate__MethodsAssignment_9");
					put(grammarAccess.getAggregateAccess().getElementsAssignment_10(), "rule__Aggregate__ElementsAssignment_10");
					put(grammarAccess.getConstructorAccess().getDocAssignment_0(), "rule__Constructor__DocAssignment_0");
					put(grammarAccess.getConstructorAccess().getNameAssignment_2(), "rule__Constructor__NameAssignment_2");
					put(grammarAccess.getConstructorAccess().getPreconditionsAssignment_3(), "rule__Constructor__PreconditionsAssignment_3");
					put(grammarAccess.getConstructorAccess().getBusinessRulesAssignment_4(), "rule__Constructor__BusinessRulesAssignment_4");
					put(grammarAccess.getConstructorAccess().getFiredEventsAssignment_5_1(), "rule__Constructor__FiredEventsAssignment_5_1");
					put(grammarAccess.getConstructorAccess().getFiredEventsAssignment_5_2_1(), "rule__Constructor__FiredEventsAssignment_5_2_1");
					put(grammarAccess.getConstructorAccess().getParametersAssignment_7(), "rule__Constructor__ParametersAssignment_7");
					put(grammarAccess.getConstructorAccess().getServiceAssignment_8(), "rule__Constructor__ServiceAssignment_8");
					put(grammarAccess.getConstructorAccess().getServicesAssignment_9(), "rule__Constructor__ServicesAssignment_9");
					put(grammarAccess.getConstructorAccess().getEventsAssignment_10(), "rule__Constructor__EventsAssignment_10");
					put(grammarAccess.getReturnTypeAccess().getDocAssignment_0(), "rule__ReturnType__DocAssignment_0");
					put(grammarAccess.getReturnTypeAccess().getTypeAssignment_2(), "rule__ReturnType__TypeAssignment_2");
					put(grammarAccess.getMethodAccess().getDocAssignment_0(), "rule__Method__DocAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
					put(grammarAccess.getMethodAccess().getRefMethodAssignment_3_1(), "rule__Method__RefMethodAssignment_3_1");
					put(grammarAccess.getMethodAccess().getPreconditionsAssignment_4(), "rule__Method__PreconditionsAssignment_4");
					put(grammarAccess.getMethodAccess().getBusinessRulesAssignment_5(), "rule__Method__BusinessRulesAssignment_5");
					put(grammarAccess.getMethodAccess().getFiredEventsAssignment_6_1(), "rule__Method__FiredEventsAssignment_6_1");
					put(grammarAccess.getMethodAccess().getFiredEventsAssignment_6_2_1(), "rule__Method__FiredEventsAssignment_6_2_1");
					put(grammarAccess.getMethodAccess().getParametersAssignment_8(), "rule__Method__ParametersAssignment_8");
					put(grammarAccess.getMethodAccess().getServiceAssignment_9(), "rule__Method__ServiceAssignment_9");
					put(grammarAccess.getMethodAccess().getReturnTypeAssignment_10(), "rule__Method__ReturnTypeAssignment_10");
					put(grammarAccess.getMethodAccess().getServicesAssignment_11(), "rule__Method__ServicesAssignment_11");
					put(grammarAccess.getMethodAccess().getEventsAssignment_12(), "rule__Method__EventsAssignment_12");
					put(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1(), "rule__TypeMetaInfo__SlabelAssignment_1_1");
					put(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1(), "rule__TypeMetaInfo__LabelAssignment_2_1");
					put(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1(), "rule__TypeMetaInfo__TooltipAssignment_3_1");
					put(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1(), "rule__TypeMetaInfo__PromptAssignment_4_1");
					put(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1(), "rule__TypeMetaInfo__ExamplesAssignment_5_1");
					put(grammarAccess.getGenericArgsAccess().getArgsAssignment_1(), "rule__GenericArgs__ArgsAssignment_1");
					put(grammarAccess.getGenericArgsAccess().getArgsAssignment_2_1(), "rule__GenericArgs__ArgsAssignment_2_1");
					put(grammarAccess.getAttributeAccess().getDocAssignment_0(), "rule__Attribute__DocAssignment_0");
					put(grammarAccess.getAttributeAccess().getNullableAssignment_1(), "rule__Attribute__NullableAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
					put(grammarAccess.getAttributeAccess().getGenericsAssignment_3(), "rule__Attribute__GenericsAssignment_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_4(), "rule__Attribute__NameAssignment_4");
					put(grammarAccess.getAttributeAccess().getInvariantsAssignment_5(), "rule__Attribute__InvariantsAssignment_5");
					put(grammarAccess.getAttributeAccess().getOverriddenAssignment_6(), "rule__Attribute__OverriddenAssignment_6");
					put(grammarAccess.getParameterAccess().getDocAssignment_0(), "rule__Parameter__DocAssignment_0");
					put(grammarAccess.getParameterAccess().getNullableAssignment_1(), "rule__Parameter__NullableAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getParameterAccess().getGenericsAssignment_3(), "rule__Parameter__GenericsAssignment_3");
					put(grammarAccess.getParameterAccess().getNameAssignment_4(), "rule__Parameter__NameAssignment_4");
					put(grammarAccess.getParameterAccess().getPreconditionsAssignment_5(), "rule__Parameter__PreconditionsAssignment_5");
					put(grammarAccess.getParameterAccess().getBusinessRulesAssignment_6(), "rule__Parameter__BusinessRulesAssignment_6");
					put(grammarAccess.getParameterAccess().getOverriddenAssignment_7(), "rule__Parameter__OverriddenAssignment_7");
					put(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_1(), "rule__Invariants__ConstraintInstancesAssignment_1");
					put(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_2_1(), "rule__Invariants__ConstraintInstancesAssignment_2_1");
					put(grammarAccess.getPreconditionsAccess().getConstraintInstancesAssignment_1(), "rule__Preconditions__ConstraintInstancesAssignment_1");
					put(grammarAccess.getPreconditionsAccess().getConstraintInstancesAssignment_2_1(), "rule__Preconditions__ConstraintInstancesAssignment_2_1");
					put(grammarAccess.getBusinessRulesAccess().getConstraintInstancesAssignment_1(), "rule__BusinessRules__ConstraintInstancesAssignment_1");
					put(grammarAccess.getBusinessRulesAccess().getConstraintInstancesAssignment_2_1(), "rule__BusinessRules__ConstraintInstancesAssignment_2_1");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1(), "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1");
					put(grammarAccess.getConstraintInstanceAccess().getConstraintAssignment_0(), "rule__ConstraintInstance__ConstraintAssignment_0");
					put(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_1(), "rule__ConstraintInstance__ParamsAssignment_1_1");
					put(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_2_1(), "rule__ConstraintInstance__ParamsAssignment_1_2_1");
					put(grammarAccess.getServiceAccess().getDocAssignment_0(), "rule__Service__DocAssignment_0");
					put(grammarAccess.getServiceAccess().getNameAssignment_2(), "rule__Service__NameAssignment_2");
					put(grammarAccess.getServiceAccess().getMethodsAssignment_4(), "rule__Service__MethodsAssignment_4");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1(), "rule__BooleanLiteral__ValueAssignment_1");
					put(grammarAccess.getNullLiteralAccess().getValueAssignment_1(), "rule__NullLiteral__ValueAssignment_1");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment_1(), "rule__NumberLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser typedParser = (org.fuin.dsl.ddd.ui.contentassist.antlr.internal.InternalDomainDrivenDesignDslParser) parser;
			typedParser.entryRuleDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DomainDrivenDesignDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DomainDrivenDesignDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
