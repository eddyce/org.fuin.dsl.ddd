package org.fuin.dsl.ddd.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.fuin.dsl.ddd.services.DomainDrivenDesignDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainDrivenDesignDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'false'", "'true'", "'namespace'", "'{'", "'}'", "'import'", "'type'", "'constraint'", "'on'", "'exception'", "'value object'", "'enum'", "'instances'", "'('", "')'", "','", "'entity'", "'aggregate'", "'constructor'", "'method'", "'ref'", "'event'", "'slabel'", "'label'", "'tooltipp'", "'prompt'", "'examples'", "'constraints'", "'invariants'", "'message'", "'.'", "'*'", "'technicalId'", "'businessKey'", "'businessName'", "'nullable'", "'null'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=8;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_DECIMAL=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalDomainDrivenDesignDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainDrivenDesignDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainDrivenDesignDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g"; }


     
     	private DomainDrivenDesignDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DomainDrivenDesignDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomainModel"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:60:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:61:1: ( ruleDomainModel EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:62:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:69:1: ruleDomainModel : ( ( rule__DomainModel__NamespaceAssignment ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:73:2: ( ( ( rule__DomainModel__NamespaceAssignment ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:74:1: ( ( rule__DomainModel__NamespaceAssignment ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:74:1: ( ( rule__DomainModel__NamespaceAssignment ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:75:1: ( rule__DomainModel__NamespaceAssignment )
            {
             before(grammarAccess.getDomainModelAccess().getNamespaceAssignment()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:76:1: ( rule__DomainModel__NamespaceAssignment )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:76:2: rule__DomainModel__NamespaceAssignment
            {
            pushFollow(FOLLOW_rule__DomainModel__NamespaceAssignment_in_ruleDomainModel94);
            rule__DomainModel__NamespaceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getNamespaceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:88:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:89:1: ( ruleNamespace EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:90:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace121);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:97:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:101:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:102:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:102:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:103:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:104:1: ( rule__Namespace__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:104:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:117:1: ( ruleImport EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:132:1: ( rule__Import__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:144:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:145:1: ( ruleAbstractElement EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:146:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement241);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:153:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:157:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:159:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:160:1: ( rule__AbstractElement__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:160:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement274);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleType"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:173:1: ( ruleType EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType301);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:188:1: ( rule__Type__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType334);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAbstractVO"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:200:1: entryRuleAbstractVO : ruleAbstractVO EOF ;
    public final void entryRuleAbstractVO() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:201:1: ( ruleAbstractVO EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:202:1: ruleAbstractVO EOF
            {
             before(grammarAccess.getAbstractVORule()); 
            pushFollow(FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO361);
            ruleAbstractVO();

            state._fsp--;

             after(grammarAccess.getAbstractVORule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractVO368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractVO"


    // $ANTLR start "ruleAbstractVO"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:209:1: ruleAbstractVO : ( ( rule__AbstractVO__Alternatives ) ) ;
    public final void ruleAbstractVO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:213:2: ( ( ( rule__AbstractVO__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:214:1: ( ( rule__AbstractVO__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:214:1: ( ( rule__AbstractVO__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:215:1: ( rule__AbstractVO__Alternatives )
            {
             before(grammarAccess.getAbstractVOAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:216:1: ( rule__AbstractVO__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:216:2: rule__AbstractVO__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractVO__Alternatives_in_ruleAbstractVO394);
            rule__AbstractVO__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractVOAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractVO"


    // $ANTLR start "entryRuleAbstractEntity"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:228:1: entryRuleAbstractEntity : ruleAbstractEntity EOF ;
    public final void entryRuleAbstractEntity() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:229:1: ( ruleAbstractEntity EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:230:1: ruleAbstractEntity EOF
            {
             before(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity421);
            ruleAbstractEntity();

            state._fsp--;

             after(grammarAccess.getAbstractEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractEntity428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:237:1: ruleAbstractEntity : ( ( rule__AbstractEntity__Alternatives ) ) ;
    public final void ruleAbstractEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:241:2: ( ( ( rule__AbstractEntity__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:242:1: ( ( rule__AbstractEntity__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:242:1: ( ( rule__AbstractEntity__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:243:1: ( rule__AbstractEntity__Alternatives )
            {
             before(grammarAccess.getAbstractEntityAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:244:1: ( rule__AbstractEntity__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:244:2: rule__AbstractEntity__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractEntity__Alternatives_in_ruleAbstractEntity454);
            rule__AbstractEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleExternalType"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:258:1: entryRuleExternalType : ruleExternalType EOF ;
    public final void entryRuleExternalType() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:259:1: ( ruleExternalType EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:260:1: ruleExternalType EOF
            {
             before(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_ruleExternalType_in_entryRuleExternalType483);
            ruleExternalType();

            state._fsp--;

             after(grammarAccess.getExternalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalType490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:267:1: ruleExternalType : ( ( rule__ExternalType__Group__0 ) ) ;
    public final void ruleExternalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:271:2: ( ( ( rule__ExternalType__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:272:1: ( ( rule__ExternalType__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:272:1: ( ( rule__ExternalType__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:273:1: ( rule__ExternalType__Group__0 )
            {
             before(grammarAccess.getExternalTypeAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:274:1: ( rule__ExternalType__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:274:2: rule__ExternalType__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalType__Group__0_in_ruleExternalType516);
            rule__ExternalType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRuleConstraint"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:286:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:287:1: ( ruleConstraint EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:288:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint543);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:295:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:299:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:300:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:300:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:301:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:302:1: ( rule__Constraint__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:302:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint576);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleValueObject"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:314:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:315:1: ( ruleValueObject EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:316:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject603);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:323:1: ruleValueObject : ( ( rule__ValueObject__Group__0 ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:327:2: ( ( ( rule__ValueObject__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:328:1: ( ( rule__ValueObject__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:328:1: ( ( rule__ValueObject__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:329:1: ( rule__ValueObject__Group__0 )
            {
             before(grammarAccess.getValueObjectAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:330:1: ( rule__ValueObject__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:330:2: rule__ValueObject__Group__0
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__0_in_ruleValueObject636);
            rule__ValueObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleEnumObject"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:342:1: entryRuleEnumObject : ruleEnumObject EOF ;
    public final void entryRuleEnumObject() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:343:1: ( ruleEnumObject EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:344:1: ruleEnumObject EOF
            {
             before(grammarAccess.getEnumObjectRule()); 
            pushFollow(FOLLOW_ruleEnumObject_in_entryRuleEnumObject663);
            ruleEnumObject();

            state._fsp--;

             after(grammarAccess.getEnumObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumObject670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumObject"


    // $ANTLR start "ruleEnumObject"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:351:1: ruleEnumObject : ( ( rule__EnumObject__Group__0 ) ) ;
    public final void ruleEnumObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:355:2: ( ( ( rule__EnumObject__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:356:1: ( ( rule__EnumObject__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:356:1: ( ( rule__EnumObject__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:357:1: ( rule__EnumObject__Group__0 )
            {
             before(grammarAccess.getEnumObjectAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:358:1: ( rule__EnumObject__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:358:2: rule__EnumObject__Group__0
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__0_in_ruleEnumObject696);
            rule__EnumObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumObject"


    // $ANTLR start "entryRuleEnumInstance"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:370:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:371:1: ( ruleEnumInstance EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:372:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance723);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumInstance"


    // $ANTLR start "ruleEnumInstance"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:379:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:383:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:384:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:384:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:385:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:386:1: ( rule__EnumInstance__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:386:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance756);
            rule__EnumInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumInstance"


    // $ANTLR start "entryRuleEntity"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:398:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:399:1: ( ruleEntity EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:400:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity783);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:407:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:411:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:412:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:412:1: ( ( rule__Entity__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:413:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:414:1: ( rule__Entity__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:414:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity816);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAggregate"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:426:1: entryRuleAggregate : ruleAggregate EOF ;
    public final void entryRuleAggregate() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:427:1: ( ruleAggregate EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:428:1: ruleAggregate EOF
            {
             before(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate843);
            ruleAggregate();

            state._fsp--;

             after(grammarAccess.getAggregateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:435:1: ruleAggregate : ( ( rule__Aggregate__Group__0 ) ) ;
    public final void ruleAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:439:2: ( ( ( rule__Aggregate__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:440:1: ( ( rule__Aggregate__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:440:1: ( ( rule__Aggregate__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:441:1: ( rule__Aggregate__Group__0 )
            {
             before(grammarAccess.getAggregateAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:442:1: ( rule__Aggregate__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:442:2: rule__Aggregate__Group__0
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__0_in_ruleAggregate876);
            rule__Aggregate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleConstructor"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:454:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:455:1: ( ruleConstructor EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:456:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor903);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:463:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:467:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:468:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:468:1: ( ( rule__Constructor__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:469:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:470:1: ( rule__Constructor__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:470:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor936);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleMethod"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:482:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:483:1: ( ruleMethod EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:484:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod963);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:491:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:495:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:496:1: ( ( rule__Method__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:496:1: ( ( rule__Method__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:497:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:498:1: ( rule__Method__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:498:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod996);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEvent"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:510:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:511:1: ( ruleEvent EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:512:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1023);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:519:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:523:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:524:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:524:1: ( ( rule__Event__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:525:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:526:1: ( rule__Event__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:526:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent1056);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTypeMetaInfo"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:538:1: entryRuleTypeMetaInfo : ruleTypeMetaInfo EOF ;
    public final void entryRuleTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:539:1: ( ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:540:1: ruleTypeMetaInfo EOF
            {
             before(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1083);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeMetaInfo"


    // $ANTLR start "ruleTypeMetaInfo"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:547:1: ruleTypeMetaInfo : ( ( rule__TypeMetaInfo__Group__0 ) ) ;
    public final void ruleTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:551:2: ( ( ( rule__TypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:552:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:552:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:553:1: ( rule__TypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:554:1: ( rule__TypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:554:2: rule__TypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo1116);
            rule__TypeMetaInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeMetaInfo"


    // $ANTLR start "entryRuleVariable"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:566:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:567:1: ( ruleVariable EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:568:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1143);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:575:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:579:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:580:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:580:1: ( ( rule__Variable__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:581:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:582:1: ( rule__Variable__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:582:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable1176);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleConstraints"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:594:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:595:1: ( ruleConstraints EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:596:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_ruleConstraints_in_entryRuleConstraints1203);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraints1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:603:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:607:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:608:1: ( ( rule__Constraints__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:608:1: ( ( rule__Constraints__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:609:1: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:610:1: ( rule__Constraints__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:610:2: rule__Constraints__Group__0
            {
            pushFollow(FOLLOW_rule__Constraints__Group__0_in_ruleConstraints1236);
            rule__Constraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:622:1: entryRuleInvariants : ruleInvariants EOF ;
    public final void entryRuleInvariants() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:623:1: ( ruleInvariants EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:624:1: ruleInvariants EOF
            {
             before(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants1263);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getInvariantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvariants"


    // $ANTLR start "ruleInvariants"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:631:1: ruleInvariants : ( ( rule__Invariants__Group__0 ) ) ;
    public final void ruleInvariants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:635:2: ( ( ( rule__Invariants__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:636:1: ( ( rule__Invariants__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:636:1: ( ( rule__Invariants__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:637:1: ( rule__Invariants__Group__0 )
            {
             before(grammarAccess.getInvariantsAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:638:1: ( rule__Invariants__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:638:2: rule__Invariants__Group__0
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0_in_ruleInvariants1296);
            rule__Invariants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:650:1: entryRuleOverriddenTypeMetaInfo : ruleOverriddenTypeMetaInfo EOF ;
    public final void entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:651:1: ( ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:652:1: ruleOverriddenTypeMetaInfo EOF
            {
             before(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo1323);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOverriddenTypeMetaInfo"


    // $ANTLR start "ruleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:659:1: ruleOverriddenTypeMetaInfo : ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) ;
    public final void ruleOverriddenTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:663:2: ( ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:664:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:664:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:665:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:666:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:666:2: rule__OverriddenTypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo1356);
            rule__OverriddenTypeMetaInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOverriddenTypeMetaInfo"


    // $ANTLR start "entryRuleMessage"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:678:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:679:1: ( ruleMessage EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:680:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1383);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:687:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:691:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:692:1: ( ( rule__Message__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:692:1: ( ( rule__Message__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:693:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:694:1: ( rule__Message__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:694:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage1416);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleConstraintCall"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:706:1: entryRuleConstraintCall : ruleConstraintCall EOF ;
    public final void entryRuleConstraintCall() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:707:1: ( ruleConstraintCall EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:708:1: ruleConstraintCall EOF
            {
             before(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall1443);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getConstraintCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintCall"


    // $ANTLR start "ruleConstraintCall"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:715:1: ruleConstraintCall : ( ( rule__ConstraintCall__Group__0 ) ) ;
    public final void ruleConstraintCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:719:2: ( ( ( rule__ConstraintCall__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:720:1: ( ( rule__ConstraintCall__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:720:1: ( ( rule__ConstraintCall__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:721:1: ( rule__ConstraintCall__Group__0 )
            {
             before(grammarAccess.getConstraintCallAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:722:1: ( rule__ConstraintCall__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:722:2: rule__ConstraintCall__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__0_in_ruleConstraintCall1476);
            rule__ConstraintCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintCall"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:734:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:735:1: ( ruleLiteral EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:736:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1503);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:743:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:747:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:748:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:748:1: ( ( rule__Literal__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:749:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:750:1: ( rule__Literal__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:750:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1536);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFQN"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:762:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:763:1: ( ruleFQN EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:764:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1563);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:771:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:775:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:776:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:776:1: ( ( rule__FQN__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:777:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:778:1: ( rule__FQN__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:778:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1596);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:790:1: entryRuleFQNWithWildcard : ruleFQNWithWildcard EOF ;
    public final void entryRuleFQNWithWildcard() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:791:1: ( ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:792:1: ruleFQNWithWildcard EOF
            {
             before(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1623);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard1630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:799:1: ruleFQNWithWildcard : ( ( rule__FQNWithWildcard__Group__0 ) ) ;
    public final void ruleFQNWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:803:2: ( ( ( rule__FQNWithWildcard__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:804:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:804:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:805:1: ( rule__FQNWithWildcard__Group__0 )
            {
             before(grammarAccess.getFQNWithWildcardAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:806:1: ( rule__FQNWithWildcard__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:806:2: rule__FQNWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1656);
            rule__FQNWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQNWithWildcard"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:818:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:819:1: ( ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:820:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1683);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1690); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:827:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:831:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:832:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:832:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:833:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:834:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:834:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral1716);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:846:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:847:1: ( ruleNullLiteral EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:848:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1743);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1750); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:855:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:859:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:860:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:860:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:861:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:862:1: ( rule__NullLiteral__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:862:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1776);
            rule__NullLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:874:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:875:1: ( ruleNumberLiteral EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:876:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1803);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:883:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:887:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:888:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:888:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:889:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:890:1: ( rule__NumberLiteral__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:890:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1836);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:902:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:903:1: ( ruleStringLiteral EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:904:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1863);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1870); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:911:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:915:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:916:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:916:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:917:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:918:1: ( rule__StringLiteral__Group__0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:918:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1896);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumber"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:930:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:934:1: ( ruleNumber EOF )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:935:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1928);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1935); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:945:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:950:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:951:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:951:1: ( ( rule__Number__Alternatives ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:952:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:953:1: ( rule__Number__Alternatives )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:953:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber1965);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Import__ImportedNamespaceAlternatives_1_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:966:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:970:1: ( ( ruleFQN ) | ( ruleFQNWithWildcard ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:971:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:971:1: ( ruleFQN )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:972:1: ruleFQN
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_02001);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:977:6: ( ruleFQNWithWildcard )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:977:6: ( ruleFQNWithWildcard )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:978:1: ruleFQNWithWildcard
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_02018);
                    ruleFQNWithWildcard();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAlternatives_1_0"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:988:1: rule__AbstractElement__Alternatives : ( ( ruleConstraint ) | ( ruleType ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:992:1: ( ( ruleConstraint ) | ( ruleType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=24 && LA2_1<=25)||(LA2_1>=30 && LA2_1<=31)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:993:1: ( ruleConstraint )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:993:1: ( ruleConstraint )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:994:1: ruleConstraint
                    {
                     before(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__AbstractElement__Alternatives2050);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:999:6: ( ruleType )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:999:6: ( ruleType )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1000:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2067);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1010:1: rule__Type__Alternatives : ( ( ruleExternalType ) | ( ruleAbstractVO ) | ( ruleAbstractEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1014:1: ( ( ruleExternalType ) | ( ruleAbstractVO ) | ( ruleAbstractEntity ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_DOC) ) {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=24 && LA3_2<=25)) ) {
                    alt3=2;
                }
                else if ( ((LA3_2>=30 && LA3_2<=31)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1015:1: ( ruleExternalType )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1015:1: ( ruleExternalType )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1016:1: ruleExternalType
                    {
                     before(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExternalType_in_rule__Type__Alternatives2099);
                    ruleExternalType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1021:6: ( ruleAbstractVO )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1021:6: ( ruleAbstractVO )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1022:1: ruleAbstractVO
                    {
                     before(grammarAccess.getTypeAccess().getAbstractVOParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractVO_in_rule__Type__Alternatives2116);
                    ruleAbstractVO();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAbstractVOParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1027:6: ( ruleAbstractEntity )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1027:6: ( ruleAbstractEntity )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1028:1: ruleAbstractEntity
                    {
                     before(grammarAccess.getTypeAccess().getAbstractEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAbstractEntity_in_rule__Type__Alternatives2133);
                    ruleAbstractEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAbstractEntityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AbstractVO__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1038:1: rule__AbstractVO__Alternatives : ( ( ruleValueObject ) | ( ruleEnumObject ) );
    public final void rule__AbstractVO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1042:1: ( ( ruleValueObject ) | ( ruleEnumObject ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else if ( (LA4_1==25) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1043:1: ( ruleValueObject )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1043:1: ( ruleValueObject )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1044:1: ruleValueObject
                    {
                     before(grammarAccess.getAbstractVOAccess().getValueObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValueObject_in_rule__AbstractVO__Alternatives2165);
                    ruleValueObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractVOAccess().getValueObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1049:6: ( ruleEnumObject )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1049:6: ( ruleEnumObject )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1050:1: ruleEnumObject
                    {
                     before(grammarAccess.getAbstractVOAccess().getEnumObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumObject_in_rule__AbstractVO__Alternatives2182);
                    ruleEnumObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractVOAccess().getEnumObjectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractVO__Alternatives"


    // $ANTLR start "rule__AbstractEntity__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1060:1: rule__AbstractEntity__Alternatives : ( ( ruleEntity ) | ( ruleAggregate ) );
    public final void rule__AbstractEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1064:1: ( ( ruleEntity ) | ( ruleAggregate ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOC) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==31) ) {
                    alt5=2;
                }
                else if ( (LA5_1==30) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1065:1: ( ruleEntity )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1065:1: ( ruleEntity )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1066:1: ruleEntity
                    {
                     before(grammarAccess.getAbstractEntityAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__AbstractEntity__Alternatives2214);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1071:6: ( ruleAggregate )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1071:6: ( ruleAggregate )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1072:1: ruleAggregate
                    {
                     before(grammarAccess.getAbstractEntityAccess().getAggregateParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAggregate_in_rule__AbstractEntity__Alternatives2231);
                    ruleAggregate();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getAggregateParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractEntity__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives_9"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1083:1: rule__Variable__Alternatives_9 : ( ( ( rule__Variable__OverriddenAssignment_9_0 )? ) | ( ';' ) );
    public final void rule__Variable__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1087:1: ( ( ( rule__Variable__OverriddenAssignment_9_0 )? ) | ( ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||(LA7_0>=RULE_ID && LA7_0<=RULE_DOC)||(LA7_0>=17 && LA7_0<=18)||LA7_0==26||(LA7_0>=32 && LA7_0<=33)||LA7_0==35||LA7_0==41||LA7_0==43||(LA7_0>=46 && LA7_0<=49)) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1088:1: ( ( rule__Variable__OverriddenAssignment_9_0 )? )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1088:1: ( ( rule__Variable__OverriddenAssignment_9_0 )? )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1089:1: ( rule__Variable__OverriddenAssignment_9_0 )?
                    {
                     before(grammarAccess.getVariableAccess().getOverriddenAssignment_9_0()); 
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1090:1: ( rule__Variable__OverriddenAssignment_9_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1090:2: rule__Variable__OverriddenAssignment_9_0
                            {
                            pushFollow(FOLLOW_rule__Variable__OverriddenAssignment_9_0_in_rule__Variable__Alternatives_92264);
                            rule__Variable__OverriddenAssignment_9_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getVariableAccess().getOverriddenAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1094:6: ( ';' )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1094:6: ( ';' )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1095:1: ';'
                    {
                     before(grammarAccess.getVariableAccess().getSemicolonKeyword_9_1()); 
                    match(input,13,FOLLOW_13_in_rule__Variable__Alternatives_92284); 
                     after(grammarAccess.getVariableAccess().getSemicolonKeyword_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives_9"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1107:1: rule__Literal__Alternatives : ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1111:1: ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 14:
            case 15:
                {
                alt8=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1112:1: ( ruleNullLiteral )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1112:1: ( ruleNullLiteral )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1113:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives2318);
                    ruleNullLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1118:6: ( ruleBooleanLiteral )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1118:6: ( ruleBooleanLiteral )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1119:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2335);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1124:6: ( ruleNumberLiteral )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1124:6: ( ruleNumberLiteral )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1125:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives2352);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1130:6: ( ruleStringLiteral )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1130:6: ( ruleStringLiteral )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1131:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2369);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_1_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1141:1: rule__BooleanLiteral__ValueAlternatives_1_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1145:1: ( ( 'false' ) | ( 'true' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1146:1: ( 'false' )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1146:1: ( 'false' )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1147:1: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_02402); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1154:6: ( 'true' )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1154:6: ( 'true' )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1155:1: 'true'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_1_02422); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1167:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1171:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_HEX) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_DECIMAL)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1172:1: ( RULE_HEX )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1172:1: ( RULE_HEX )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1173:1: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__Number__Alternatives2456); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1178:6: ( ( rule__Number__Group_1__0 ) )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1178:6: ( ( rule__Number__Group_1__0 ) )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1179:1: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1180:1: ( rule__Number__Group_1__0 )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1180:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2473);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Number__Alternatives_1_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1189:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1193:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DECIMAL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1194:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1194:1: ( RULE_INT )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1195:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02506); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1200:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1200:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1201:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02523); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives_1_1_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1211:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1215:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DECIMAL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1216:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1216:1: ( RULE_INT )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1217:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12555); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1222:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1222:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1223:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12572); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_1_1"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1235:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1239:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1240:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02602);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02605);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1247:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1251:1: ( ( 'namespace' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1252:1: ( 'namespace' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1252:1: ( 'namespace' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1253:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Namespace__Group__0__Impl2633); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1266:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1270:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1271:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12664);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12667);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1278:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1282:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1283:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1283:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1284:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1285:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1285:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2694);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1295:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1299:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1300:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22724);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22727);
            rule__Namespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1307:1: rule__Namespace__Group__2__Impl : ( '{' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1311:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1312:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1312:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1313:1: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Namespace__Group__2__Impl2755); 
             after(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1326:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1330:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1331:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32786);
            rule__Namespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32789);
            rule__Namespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1338:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__ImportsAssignment_3 )* ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1342:1: ( ( ( rule__Namespace__ImportsAssignment_3 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1343:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1343:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1344:1: ( rule__Namespace__ImportsAssignment_3 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_3()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1345:1: ( rule__Namespace__ImportsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1345:2: rule__Namespace__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2816);
            	    rule__Namespace__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Namespace__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1355:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1359:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1360:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42847);
            rule__Namespace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42850);
            rule__Namespace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4"


    // $ANTLR start "rule__Namespace__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1367:1: rule__Namespace__Group__4__Impl : ( ( rule__Namespace__ElementsAssignment_4 )* ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1371:1: ( ( ( rule__Namespace__ElementsAssignment_4 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1372:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1372:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1373:1: ( rule__Namespace__ElementsAssignment_4 )*
            {
             before(grammarAccess.getNamespaceAccess().getElementsAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1374:1: ( rule__Namespace__ElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOC||LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1374:2: rule__Namespace__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2877);
            	    rule__Namespace__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1384:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1388:1: ( rule__Namespace__Group__5__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1389:2: rule__Namespace__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52908);
            rule__Namespace__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5"


    // $ANTLR start "rule__Namespace__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1395:1: rule__Namespace__Group__5__Impl : ( '}' ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1399:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1400:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1400:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1401:1: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Namespace__Group__5__Impl2936); 
             after(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1426:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1430:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1431:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02979);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02982);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1438:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1442:1: ( ( 'import' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1443:1: ( 'import' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1443:1: ( 'import' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1444:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl3010); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1457:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1461:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1462:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13041);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13044);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1469:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1473:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1474:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1474:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1475:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1476:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3071);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1486:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1490:1: ( rule__Import__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1491:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23101);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1497:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1501:1: ( ( ';' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1502:1: ( ';' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1502:1: ( ';' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1503:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__2__Impl3129); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__ExternalType__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1522:1: rule__ExternalType__Group__0 : rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 ;
    public final void rule__ExternalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1526:1: ( rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1527:2: rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalType__Group__0__Impl_in_rule__ExternalType__Group__03166);
            rule__ExternalType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalType__Group__1_in_rule__ExternalType__Group__03169);
            rule__ExternalType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__0"


    // $ANTLR start "rule__ExternalType__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1534:1: rule__ExternalType__Group__0__Impl : ( 'type' ) ;
    public final void rule__ExternalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1538:1: ( ( 'type' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1539:1: ( 'type' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1539:1: ( 'type' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1540:1: 'type'
            {
             before(grammarAccess.getExternalTypeAccess().getTypeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ExternalType__Group__0__Impl3197); 
             after(grammarAccess.getExternalTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__0__Impl"


    // $ANTLR start "rule__ExternalType__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1553:1: rule__ExternalType__Group__1 : rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 ;
    public final void rule__ExternalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1557:1: ( rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1558:2: rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalType__Group__1__Impl_in_rule__ExternalType__Group__13228);
            rule__ExternalType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalType__Group__2_in_rule__ExternalType__Group__13231);
            rule__ExternalType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__1"


    // $ANTLR start "rule__ExternalType__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1565:1: rule__ExternalType__Group__1__Impl : ( ( rule__ExternalType__NameAssignment_1 ) ) ;
    public final void rule__ExternalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1569:1: ( ( ( rule__ExternalType__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1570:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1570:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1571:1: ( rule__ExternalType__NameAssignment_1 )
            {
             before(grammarAccess.getExternalTypeAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1572:1: ( rule__ExternalType__NameAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1572:2: rule__ExternalType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalType__NameAssignment_1_in_rule__ExternalType__Group__1__Impl3258);
            rule__ExternalType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__1__Impl"


    // $ANTLR start "rule__ExternalType__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1582:1: rule__ExternalType__Group__2 : rule__ExternalType__Group__2__Impl ;
    public final void rule__ExternalType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1586:1: ( rule__ExternalType__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1587:2: rule__ExternalType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalType__Group__2__Impl_in_rule__ExternalType__Group__23288);
            rule__ExternalType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__2"


    // $ANTLR start "rule__ExternalType__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1593:1: rule__ExternalType__Group__2__Impl : ( ';' ) ;
    public final void rule__ExternalType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1597:1: ( ( ';' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1598:1: ( ';' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1598:1: ( ';' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1599:1: ';'
            {
             before(grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ExternalType__Group__2__Impl3316); 
             after(grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1618:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1622:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1623:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03353);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03356);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1630:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__DocAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1634:1: ( ( ( rule__Constraint__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1635:1: ( ( rule__Constraint__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1635:1: ( ( rule__Constraint__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1636:1: ( rule__Constraint__DocAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1637:1: ( rule__Constraint__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1637:2: rule__Constraint__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__DocAssignment_0_in_rule__Constraint__Group__0__Impl3383);
            rule__Constraint__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1647:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1651:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1652:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13413);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13416);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1659:1: rule__Constraint__Group__1__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1663:1: ( ( 'constraint' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1664:1: ( 'constraint' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1664:1: ( 'constraint' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1665:1: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Constraint__Group__1__Impl3444); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1678:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1682:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1683:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23475);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23478);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1690:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__NameAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1694:1: ( ( ( rule__Constraint__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1695:1: ( ( rule__Constraint__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1695:1: ( ( rule__Constraint__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1696:1: ( rule__Constraint__NameAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1697:1: ( rule__Constraint__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1697:2: rule__Constraint__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__NameAssignment_2_in_rule__Constraint__Group__2__Impl3505);
            rule__Constraint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1707:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1711:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1712:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33535);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__33538);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1719:1: rule__Constraint__Group__3__Impl : ( 'on' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1723:1: ( ( 'on' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1724:1: ( 'on' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1724:1: ( 'on' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1725:1: 'on'
            {
             before(grammarAccess.getConstraintAccess().getOnKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Constraint__Group__3__Impl3566); 
             after(grammarAccess.getConstraintAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1738:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1742:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1743:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__43597);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__43600);
            rule__Constraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1750:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__TargetAssignment_4 ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1754:1: ( ( ( rule__Constraint__TargetAssignment_4 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1755:1: ( ( rule__Constraint__TargetAssignment_4 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1755:1: ( ( rule__Constraint__TargetAssignment_4 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1756:1: ( rule__Constraint__TargetAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getTargetAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1757:1: ( rule__Constraint__TargetAssignment_4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1757:2: rule__Constraint__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Constraint__TargetAssignment_4_in_rule__Constraint__Group__4__Impl3627);
            rule__Constraint__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1767:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1771:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1772:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__53657);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__53660);
            rule__Constraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1779:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__Group_5__0 )? ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1783:1: ( ( ( rule__Constraint__Group_5__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1784:1: ( ( rule__Constraint__Group_5__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1784:1: ( ( rule__Constraint__Group_5__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1785:1: ( rule__Constraint__Group_5__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1786:1: ( rule__Constraint__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1786:2: rule__Constraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__5__Impl3687);
                    rule__Constraint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1796:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1800:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1801:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__63718);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__63721);
            rule__Constraint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1808:1: rule__Constraint__Group__6__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1812:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1813:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1813:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1814:1: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Constraint__Group__6__Impl3749); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__Constraint__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1827:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1831:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1832:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__73780);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__73783);
            rule__Constraint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7"


    // $ANTLR start "rule__Constraint__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1839:1: rule__Constraint__Group__7__Impl : ( ( rule__Constraint__VariablesAssignment_7 )* ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1843:1: ( ( ( rule__Constraint__VariablesAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1844:1: ( ( rule__Constraint__VariablesAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1844:1: ( ( rule__Constraint__VariablesAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1845:1: ( rule__Constraint__VariablesAssignment_7 )*
            {
             before(grammarAccess.getConstraintAccess().getVariablesAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:1: ( rule__Constraint__VariablesAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DOC)||(LA16_0>=46 && LA16_0<=49)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1846:2: rule__Constraint__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Constraint__VariablesAssignment_7_in_rule__Constraint__Group__7__Impl3810);
            	    rule__Constraint__VariablesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getVariablesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7__Impl"


    // $ANTLR start "rule__Constraint__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1856:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl rule__Constraint__Group__9 ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1860:1: ( rule__Constraint__Group__8__Impl rule__Constraint__Group__9 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1861:2: rule__Constraint__Group__8__Impl rule__Constraint__Group__9
            {
            pushFollow(FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__83841);
            rule__Constraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__83844);
            rule__Constraint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__8"


    // $ANTLR start "rule__Constraint__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1868:1: rule__Constraint__Group__8__Impl : ( ( rule__Constraint__MessageAssignment_8 ) ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1872:1: ( ( ( rule__Constraint__MessageAssignment_8 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1873:1: ( ( rule__Constraint__MessageAssignment_8 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1873:1: ( ( rule__Constraint__MessageAssignment_8 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1874:1: ( rule__Constraint__MessageAssignment_8 )
            {
             before(grammarAccess.getConstraintAccess().getMessageAssignment_8()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1875:1: ( rule__Constraint__MessageAssignment_8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1875:2: rule__Constraint__MessageAssignment_8
            {
            pushFollow(FOLLOW_rule__Constraint__MessageAssignment_8_in_rule__Constraint__Group__8__Impl3871);
            rule__Constraint__MessageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMessageAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__8__Impl"


    // $ANTLR start "rule__Constraint__Group__9"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1885:1: rule__Constraint__Group__9 : rule__Constraint__Group__9__Impl ;
    public final void rule__Constraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1889:1: ( rule__Constraint__Group__9__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1890:2: rule__Constraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__93901);
            rule__Constraint__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__9"


    // $ANTLR start "rule__Constraint__Group__9__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1896:1: rule__Constraint__Group__9__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1900:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1901:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1901:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1902:1: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Constraint__Group__9__Impl3929); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__9__Impl"


    // $ANTLR start "rule__Constraint__Group_5__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1935:1: rule__Constraint__Group_5__0 : rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1 ;
    public final void rule__Constraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1939:1: ( rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1940:2: rule__Constraint__Group_5__0__Impl rule__Constraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group_5__0__Impl_in_rule__Constraint__Group_5__03980);
            rule__Constraint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__03983);
            rule__Constraint__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_5__0"


    // $ANTLR start "rule__Constraint__Group_5__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1947:1: rule__Constraint__Group_5__0__Impl : ( 'exception' ) ;
    public final void rule__Constraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1951:1: ( ( 'exception' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1952:1: ( 'exception' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1952:1: ( 'exception' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1953:1: 'exception'
            {
             before(grammarAccess.getConstraintAccess().getExceptionKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group_5__0__Impl4011); 
             after(grammarAccess.getConstraintAccess().getExceptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_5__0__Impl"


    // $ANTLR start "rule__Constraint__Group_5__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1966:1: rule__Constraint__Group_5__1 : rule__Constraint__Group_5__1__Impl ;
    public final void rule__Constraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1970:1: ( rule__Constraint__Group_5__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1971:2: rule__Constraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group_5__1__Impl_in_rule__Constraint__Group_5__14042);
            rule__Constraint__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_5__1"


    // $ANTLR start "rule__Constraint__Group_5__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1977:1: rule__Constraint__Group_5__1__Impl : ( ( rule__Constraint__ExceptionAssignment_5_1 ) ) ;
    public final void rule__Constraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1981:1: ( ( ( rule__Constraint__ExceptionAssignment_5_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1982:1: ( ( rule__Constraint__ExceptionAssignment_5_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1982:1: ( ( rule__Constraint__ExceptionAssignment_5_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1983:1: ( rule__Constraint__ExceptionAssignment_5_1 )
            {
             before(grammarAccess.getConstraintAccess().getExceptionAssignment_5_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1984:1: ( rule__Constraint__ExceptionAssignment_5_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1984:2: rule__Constraint__ExceptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constraint__ExceptionAssignment_5_1_in_rule__Constraint__Group_5__1__Impl4069);
            rule__Constraint__ExceptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExceptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_5__1__Impl"


    // $ANTLR start "rule__ValueObject__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:1998:1: rule__ValueObject__Group__0 : rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 ;
    public final void rule__ValueObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2002:1: ( rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2003:2: rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__0__Impl_in_rule__ValueObject__Group__04103);
            rule__ValueObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__1_in_rule__ValueObject__Group__04106);
            rule__ValueObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__0"


    // $ANTLR start "rule__ValueObject__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2010:1: rule__ValueObject__Group__0__Impl : ( ( rule__ValueObject__DocAssignment_0 ) ) ;
    public final void rule__ValueObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2014:1: ( ( ( rule__ValueObject__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2015:1: ( ( rule__ValueObject__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2015:1: ( ( rule__ValueObject__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2016:1: ( rule__ValueObject__DocAssignment_0 )
            {
             before(grammarAccess.getValueObjectAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2017:1: ( rule__ValueObject__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2017:2: rule__ValueObject__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueObject__DocAssignment_0_in_rule__ValueObject__Group__0__Impl4133);
            rule__ValueObject__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__0__Impl"


    // $ANTLR start "rule__ValueObject__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2027:1: rule__ValueObject__Group__1 : rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 ;
    public final void rule__ValueObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2031:1: ( rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2032:2: rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__1__Impl_in_rule__ValueObject__Group__14163);
            rule__ValueObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__2_in_rule__ValueObject__Group__14166);
            rule__ValueObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__1"


    // $ANTLR start "rule__ValueObject__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2039:1: rule__ValueObject__Group__1__Impl : ( 'value object' ) ;
    public final void rule__ValueObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2043:1: ( ( 'value object' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:1: ( 'value object' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2044:1: ( 'value object' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2045:1: 'value object'
            {
             before(grammarAccess.getValueObjectAccess().getValueObjectKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ValueObject__Group__1__Impl4194); 
             after(grammarAccess.getValueObjectAccess().getValueObjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__1__Impl"


    // $ANTLR start "rule__ValueObject__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2058:1: rule__ValueObject__Group__2 : rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 ;
    public final void rule__ValueObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2062:1: ( rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2063:2: rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__2__Impl_in_rule__ValueObject__Group__24225);
            rule__ValueObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__3_in_rule__ValueObject__Group__24228);
            rule__ValueObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__2"


    // $ANTLR start "rule__ValueObject__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2070:1: rule__ValueObject__Group__2__Impl : ( ( rule__ValueObject__NameAssignment_2 ) ) ;
    public final void rule__ValueObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2074:1: ( ( ( rule__ValueObject__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2075:1: ( ( rule__ValueObject__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2075:1: ( ( rule__ValueObject__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2076:1: ( rule__ValueObject__NameAssignment_2 )
            {
             before(grammarAccess.getValueObjectAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2077:1: ( rule__ValueObject__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2077:2: rule__ValueObject__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueObject__NameAssignment_2_in_rule__ValueObject__Group__2__Impl4255);
            rule__ValueObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__2__Impl"


    // $ANTLR start "rule__ValueObject__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2087:1: rule__ValueObject__Group__3 : rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 ;
    public final void rule__ValueObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2091:1: ( rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2092:2: rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__3__Impl_in_rule__ValueObject__Group__34285);
            rule__ValueObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__4_in_rule__ValueObject__Group__34288);
            rule__ValueObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__3"


    // $ANTLR start "rule__ValueObject__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2099:1: rule__ValueObject__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2103:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2104:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2104:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2105:1: '{'
            {
             before(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__ValueObject__Group__3__Impl4316); 
             after(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__3__Impl"


    // $ANTLR start "rule__ValueObject__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2118:1: rule__ValueObject__Group__4 : rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 ;
    public final void rule__ValueObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2122:1: ( rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2123:2: rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__4__Impl_in_rule__ValueObject__Group__44347);
            rule__ValueObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__5_in_rule__ValueObject__Group__44350);
            rule__ValueObject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__4"


    // $ANTLR start "rule__ValueObject__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2130:1: rule__ValueObject__Group__4__Impl : ( ( rule__ValueObject__MetaInfoAssignment_4 ) ) ;
    public final void rule__ValueObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2134:1: ( ( ( rule__ValueObject__MetaInfoAssignment_4 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2135:1: ( ( rule__ValueObject__MetaInfoAssignment_4 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2135:1: ( ( rule__ValueObject__MetaInfoAssignment_4 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2136:1: ( rule__ValueObject__MetaInfoAssignment_4 )
            {
             before(grammarAccess.getValueObjectAccess().getMetaInfoAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:1: ( rule__ValueObject__MetaInfoAssignment_4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2137:2: rule__ValueObject__MetaInfoAssignment_4
            {
            pushFollow(FOLLOW_rule__ValueObject__MetaInfoAssignment_4_in_rule__ValueObject__Group__4__Impl4377);
            rule__ValueObject__MetaInfoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getMetaInfoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__4__Impl"


    // $ANTLR start "rule__ValueObject__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2147:1: rule__ValueObject__Group__5 : rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 ;
    public final void rule__ValueObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2151:1: ( rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2152:2: rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__5__Impl_in_rule__ValueObject__Group__54407);
            rule__ValueObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__6_in_rule__ValueObject__Group__54410);
            rule__ValueObject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__5"


    // $ANTLR start "rule__ValueObject__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2159:1: rule__ValueObject__Group__5__Impl : ( ( rule__ValueObject__VariablesAssignment_5 )* ) ;
    public final void rule__ValueObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2163:1: ( ( ( rule__ValueObject__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2164:1: ( ( rule__ValueObject__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2164:1: ( ( rule__ValueObject__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2165:1: ( rule__ValueObject__VariablesAssignment_5 )*
            {
             before(grammarAccess.getValueObjectAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2166:1: ( rule__ValueObject__VariablesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOC) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID||(LA17_1>=46 && LA17_1<=49)) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==RULE_ID||(LA17_0>=46 && LA17_0<=49)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2166:2: rule__ValueObject__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ValueObject__VariablesAssignment_5_in_rule__ValueObject__Group__5__Impl4437);
            	    rule__ValueObject__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getValueObjectAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__5__Impl"


    // $ANTLR start "rule__ValueObject__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2176:1: rule__ValueObject__Group__6 : rule__ValueObject__Group__6__Impl rule__ValueObject__Group__7 ;
    public final void rule__ValueObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2180:1: ( rule__ValueObject__Group__6__Impl rule__ValueObject__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2181:2: rule__ValueObject__Group__6__Impl rule__ValueObject__Group__7
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__6__Impl_in_rule__ValueObject__Group__64468);
            rule__ValueObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__7_in_rule__ValueObject__Group__64471);
            rule__ValueObject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__6"


    // $ANTLR start "rule__ValueObject__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2188:1: rule__ValueObject__Group__6__Impl : ( ( rule__ValueObject__ConstructorsAssignment_6 )* ) ;
    public final void rule__ValueObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2192:1: ( ( ( rule__ValueObject__ConstructorsAssignment_6 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2193:1: ( ( rule__ValueObject__ConstructorsAssignment_6 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2193:1: ( ( rule__ValueObject__ConstructorsAssignment_6 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2194:1: ( rule__ValueObject__ConstructorsAssignment_6 )*
            {
             before(grammarAccess.getValueObjectAccess().getConstructorsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2195:1: ( rule__ValueObject__ConstructorsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOC) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==32) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2195:2: rule__ValueObject__ConstructorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ValueObject__ConstructorsAssignment_6_in_rule__ValueObject__Group__6__Impl4498);
            	    rule__ValueObject__ConstructorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getValueObjectAccess().getConstructorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__6__Impl"


    // $ANTLR start "rule__ValueObject__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2205:1: rule__ValueObject__Group__7 : rule__ValueObject__Group__7__Impl rule__ValueObject__Group__8 ;
    public final void rule__ValueObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2209:1: ( rule__ValueObject__Group__7__Impl rule__ValueObject__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2210:2: rule__ValueObject__Group__7__Impl rule__ValueObject__Group__8
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__7__Impl_in_rule__ValueObject__Group__74529);
            rule__ValueObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueObject__Group__8_in_rule__ValueObject__Group__74532);
            rule__ValueObject__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__7"


    // $ANTLR start "rule__ValueObject__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2217:1: rule__ValueObject__Group__7__Impl : ( ( rule__ValueObject__MethodsAssignment_7 )* ) ;
    public final void rule__ValueObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2221:1: ( ( ( rule__ValueObject__MethodsAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2222:1: ( ( rule__ValueObject__MethodsAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2222:1: ( ( rule__ValueObject__MethodsAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2223:1: ( rule__ValueObject__MethodsAssignment_7 )*
            {
             before(grammarAccess.getValueObjectAccess().getMethodsAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2224:1: ( rule__ValueObject__MethodsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOC||LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2224:2: rule__ValueObject__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__ValueObject__MethodsAssignment_7_in_rule__ValueObject__Group__7__Impl4559);
            	    rule__ValueObject__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getValueObjectAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__7__Impl"


    // $ANTLR start "rule__ValueObject__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2234:1: rule__ValueObject__Group__8 : rule__ValueObject__Group__8__Impl ;
    public final void rule__ValueObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2238:1: ( rule__ValueObject__Group__8__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2239:2: rule__ValueObject__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ValueObject__Group__8__Impl_in_rule__ValueObject__Group__84590);
            rule__ValueObject__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__8"


    // $ANTLR start "rule__ValueObject__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2245:1: rule__ValueObject__Group__8__Impl : ( '}' ) ;
    public final void rule__ValueObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2249:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2250:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2250:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2251:1: '}'
            {
             before(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__ValueObject__Group__8__Impl4618); 
             after(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Group__8__Impl"


    // $ANTLR start "rule__EnumObject__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2282:1: rule__EnumObject__Group__0 : rule__EnumObject__Group__0__Impl rule__EnumObject__Group__1 ;
    public final void rule__EnumObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2286:1: ( rule__EnumObject__Group__0__Impl rule__EnumObject__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2287:2: rule__EnumObject__Group__0__Impl rule__EnumObject__Group__1
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__0__Impl_in_rule__EnumObject__Group__04667);
            rule__EnumObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__1_in_rule__EnumObject__Group__04670);
            rule__EnumObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__0"


    // $ANTLR start "rule__EnumObject__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2294:1: rule__EnumObject__Group__0__Impl : ( ( rule__EnumObject__DocAssignment_0 ) ) ;
    public final void rule__EnumObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2298:1: ( ( ( rule__EnumObject__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2299:1: ( ( rule__EnumObject__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2299:1: ( ( rule__EnumObject__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2300:1: ( rule__EnumObject__DocAssignment_0 )
            {
             before(grammarAccess.getEnumObjectAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:1: ( rule__EnumObject__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2301:2: rule__EnumObject__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumObject__DocAssignment_0_in_rule__EnumObject__Group__0__Impl4697);
            rule__EnumObject__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumObjectAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__0__Impl"


    // $ANTLR start "rule__EnumObject__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2311:1: rule__EnumObject__Group__1 : rule__EnumObject__Group__1__Impl rule__EnumObject__Group__2 ;
    public final void rule__EnumObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2315:1: ( rule__EnumObject__Group__1__Impl rule__EnumObject__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2316:2: rule__EnumObject__Group__1__Impl rule__EnumObject__Group__2
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__1__Impl_in_rule__EnumObject__Group__14727);
            rule__EnumObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__2_in_rule__EnumObject__Group__14730);
            rule__EnumObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__1"


    // $ANTLR start "rule__EnumObject__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2323:1: rule__EnumObject__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2327:1: ( ( 'enum' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2328:1: ( 'enum' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2328:1: ( 'enum' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2329:1: 'enum'
            {
             before(grammarAccess.getEnumObjectAccess().getEnumKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__EnumObject__Group__1__Impl4758); 
             after(grammarAccess.getEnumObjectAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__1__Impl"


    // $ANTLR start "rule__EnumObject__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2342:1: rule__EnumObject__Group__2 : rule__EnumObject__Group__2__Impl rule__EnumObject__Group__3 ;
    public final void rule__EnumObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2346:1: ( rule__EnumObject__Group__2__Impl rule__EnumObject__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2347:2: rule__EnumObject__Group__2__Impl rule__EnumObject__Group__3
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__2__Impl_in_rule__EnumObject__Group__24789);
            rule__EnumObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__3_in_rule__EnumObject__Group__24792);
            rule__EnumObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__2"


    // $ANTLR start "rule__EnumObject__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2354:1: rule__EnumObject__Group__2__Impl : ( ( rule__EnumObject__NameAssignment_2 ) ) ;
    public final void rule__EnumObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2358:1: ( ( ( rule__EnumObject__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2359:1: ( ( rule__EnumObject__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2359:1: ( ( rule__EnumObject__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2360:1: ( rule__EnumObject__NameAssignment_2 )
            {
             before(grammarAccess.getEnumObjectAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2361:1: ( rule__EnumObject__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2361:2: rule__EnumObject__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumObject__NameAssignment_2_in_rule__EnumObject__Group__2__Impl4819);
            rule__EnumObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__2__Impl"


    // $ANTLR start "rule__EnumObject__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2371:1: rule__EnumObject__Group__3 : rule__EnumObject__Group__3__Impl rule__EnumObject__Group__4 ;
    public final void rule__EnumObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2375:1: ( rule__EnumObject__Group__3__Impl rule__EnumObject__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2376:2: rule__EnumObject__Group__3__Impl rule__EnumObject__Group__4
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__3__Impl_in_rule__EnumObject__Group__34849);
            rule__EnumObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__4_in_rule__EnumObject__Group__34852);
            rule__EnumObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__3"


    // $ANTLR start "rule__EnumObject__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2383:1: rule__EnumObject__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2387:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2388:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2388:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2389:1: '{'
            {
             before(grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__EnumObject__Group__3__Impl4880); 
             after(grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__3__Impl"


    // $ANTLR start "rule__EnumObject__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2402:1: rule__EnumObject__Group__4 : rule__EnumObject__Group__4__Impl rule__EnumObject__Group__5 ;
    public final void rule__EnumObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2406:1: ( rule__EnumObject__Group__4__Impl rule__EnumObject__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2407:2: rule__EnumObject__Group__4__Impl rule__EnumObject__Group__5
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__4__Impl_in_rule__EnumObject__Group__44911);
            rule__EnumObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__5_in_rule__EnumObject__Group__44914);
            rule__EnumObject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__4"


    // $ANTLR start "rule__EnumObject__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2414:1: rule__EnumObject__Group__4__Impl : ( ( rule__EnumObject__MetaInfoAssignment_4 ) ) ;
    public final void rule__EnumObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2418:1: ( ( ( rule__EnumObject__MetaInfoAssignment_4 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2419:1: ( ( rule__EnumObject__MetaInfoAssignment_4 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2419:1: ( ( rule__EnumObject__MetaInfoAssignment_4 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2420:1: ( rule__EnumObject__MetaInfoAssignment_4 )
            {
             before(grammarAccess.getEnumObjectAccess().getMetaInfoAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2421:1: ( rule__EnumObject__MetaInfoAssignment_4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2421:2: rule__EnumObject__MetaInfoAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumObject__MetaInfoAssignment_4_in_rule__EnumObject__Group__4__Impl4941);
            rule__EnumObject__MetaInfoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumObjectAccess().getMetaInfoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__4__Impl"


    // $ANTLR start "rule__EnumObject__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2431:1: rule__EnumObject__Group__5 : rule__EnumObject__Group__5__Impl rule__EnumObject__Group__6 ;
    public final void rule__EnumObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2435:1: ( rule__EnumObject__Group__5__Impl rule__EnumObject__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2436:2: rule__EnumObject__Group__5__Impl rule__EnumObject__Group__6
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__5__Impl_in_rule__EnumObject__Group__54971);
            rule__EnumObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__6_in_rule__EnumObject__Group__54974);
            rule__EnumObject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__5"


    // $ANTLR start "rule__EnumObject__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2443:1: rule__EnumObject__Group__5__Impl : ( ( rule__EnumObject__VariablesAssignment_5 )* ) ;
    public final void rule__EnumObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2447:1: ( ( ( rule__EnumObject__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2448:1: ( ( rule__EnumObject__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2448:1: ( ( rule__EnumObject__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2449:1: ( rule__EnumObject__VariablesAssignment_5 )*
            {
             before(grammarAccess.getEnumObjectAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2450:1: ( rule__EnumObject__VariablesAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DOC) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID||(LA20_1>=46 && LA20_1<=49)) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==RULE_ID||(LA20_0>=46 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2450:2: rule__EnumObject__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EnumObject__VariablesAssignment_5_in_rule__EnumObject__Group__5__Impl5001);
            	    rule__EnumObject__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEnumObjectAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__5__Impl"


    // $ANTLR start "rule__EnumObject__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2460:1: rule__EnumObject__Group__6 : rule__EnumObject__Group__6__Impl rule__EnumObject__Group__7 ;
    public final void rule__EnumObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2464:1: ( rule__EnumObject__Group__6__Impl rule__EnumObject__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2465:2: rule__EnumObject__Group__6__Impl rule__EnumObject__Group__7
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__6__Impl_in_rule__EnumObject__Group__65032);
            rule__EnumObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__7_in_rule__EnumObject__Group__65035);
            rule__EnumObject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__6"


    // $ANTLR start "rule__EnumObject__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2472:1: rule__EnumObject__Group__6__Impl : ( ( rule__EnumObject__ConstructorsAssignment_6 )* ) ;
    public final void rule__EnumObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2476:1: ( ( ( rule__EnumObject__ConstructorsAssignment_6 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2477:1: ( ( rule__EnumObject__ConstructorsAssignment_6 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2477:1: ( ( rule__EnumObject__ConstructorsAssignment_6 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2478:1: ( rule__EnumObject__ConstructorsAssignment_6 )*
            {
             before(grammarAccess.getEnumObjectAccess().getConstructorsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2479:1: ( rule__EnumObject__ConstructorsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DOC) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==32) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2479:2: rule__EnumObject__ConstructorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EnumObject__ConstructorsAssignment_6_in_rule__EnumObject__Group__6__Impl5062);
            	    rule__EnumObject__ConstructorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEnumObjectAccess().getConstructorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__6__Impl"


    // $ANTLR start "rule__EnumObject__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2489:1: rule__EnumObject__Group__7 : rule__EnumObject__Group__7__Impl rule__EnumObject__Group__8 ;
    public final void rule__EnumObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2493:1: ( rule__EnumObject__Group__7__Impl rule__EnumObject__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2494:2: rule__EnumObject__Group__7__Impl rule__EnumObject__Group__8
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__7__Impl_in_rule__EnumObject__Group__75093);
            rule__EnumObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__8_in_rule__EnumObject__Group__75096);
            rule__EnumObject__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__7"


    // $ANTLR start "rule__EnumObject__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2501:1: rule__EnumObject__Group__7__Impl : ( ( rule__EnumObject__MethodsAssignment_7 )* ) ;
    public final void rule__EnumObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2505:1: ( ( ( rule__EnumObject__MethodsAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2506:1: ( ( rule__EnumObject__MethodsAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2506:1: ( ( rule__EnumObject__MethodsAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2507:1: ( rule__EnumObject__MethodsAssignment_7 )*
            {
             before(grammarAccess.getEnumObjectAccess().getMethodsAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2508:1: ( rule__EnumObject__MethodsAssignment_7 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2508:2: rule__EnumObject__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__EnumObject__MethodsAssignment_7_in_rule__EnumObject__Group__7__Impl5123);
            	    rule__EnumObject__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEnumObjectAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__7__Impl"


    // $ANTLR start "rule__EnumObject__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2518:1: rule__EnumObject__Group__8 : rule__EnumObject__Group__8__Impl rule__EnumObject__Group__9 ;
    public final void rule__EnumObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2522:1: ( rule__EnumObject__Group__8__Impl rule__EnumObject__Group__9 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2523:2: rule__EnumObject__Group__8__Impl rule__EnumObject__Group__9
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__8__Impl_in_rule__EnumObject__Group__85154);
            rule__EnumObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__9_in_rule__EnumObject__Group__85157);
            rule__EnumObject__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__8"


    // $ANTLR start "rule__EnumObject__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2530:1: rule__EnumObject__Group__8__Impl : ( 'instances' ) ;
    public final void rule__EnumObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2534:1: ( ( 'instances' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2535:1: ( 'instances' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2535:1: ( 'instances' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2536:1: 'instances'
            {
             before(grammarAccess.getEnumObjectAccess().getInstancesKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__EnumObject__Group__8__Impl5185); 
             after(grammarAccess.getEnumObjectAccess().getInstancesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__8__Impl"


    // $ANTLR start "rule__EnumObject__Group__9"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2549:1: rule__EnumObject__Group__9 : rule__EnumObject__Group__9__Impl rule__EnumObject__Group__10 ;
    public final void rule__EnumObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2553:1: ( rule__EnumObject__Group__9__Impl rule__EnumObject__Group__10 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2554:2: rule__EnumObject__Group__9__Impl rule__EnumObject__Group__10
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__9__Impl_in_rule__EnumObject__Group__95216);
            rule__EnumObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__10_in_rule__EnumObject__Group__95219);
            rule__EnumObject__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__9"


    // $ANTLR start "rule__EnumObject__Group__9__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2561:1: rule__EnumObject__Group__9__Impl : ( '{' ) ;
    public final void rule__EnumObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2565:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2566:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2566:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2567:1: '{'
            {
             before(grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__EnumObject__Group__9__Impl5247); 
             after(grammarAccess.getEnumObjectAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__9__Impl"


    // $ANTLR start "rule__EnumObject__Group__10"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2580:1: rule__EnumObject__Group__10 : rule__EnumObject__Group__10__Impl rule__EnumObject__Group__11 ;
    public final void rule__EnumObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2584:1: ( rule__EnumObject__Group__10__Impl rule__EnumObject__Group__11 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2585:2: rule__EnumObject__Group__10__Impl rule__EnumObject__Group__11
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__10__Impl_in_rule__EnumObject__Group__105278);
            rule__EnumObject__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__11_in_rule__EnumObject__Group__105281);
            rule__EnumObject__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__10"


    // $ANTLR start "rule__EnumObject__Group__10__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2592:1: rule__EnumObject__Group__10__Impl : ( ( ( rule__EnumObject__InstancesAssignment_10 ) ) ( ( rule__EnumObject__InstancesAssignment_10 )* ) ) ;
    public final void rule__EnumObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2596:1: ( ( ( ( rule__EnumObject__InstancesAssignment_10 ) ) ( ( rule__EnumObject__InstancesAssignment_10 )* ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2597:1: ( ( ( rule__EnumObject__InstancesAssignment_10 ) ) ( ( rule__EnumObject__InstancesAssignment_10 )* ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2597:1: ( ( ( rule__EnumObject__InstancesAssignment_10 ) ) ( ( rule__EnumObject__InstancesAssignment_10 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:1: ( ( rule__EnumObject__InstancesAssignment_10 ) ) ( ( rule__EnumObject__InstancesAssignment_10 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2598:1: ( ( rule__EnumObject__InstancesAssignment_10 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2599:1: ( rule__EnumObject__InstancesAssignment_10 )
            {
             before(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2600:1: ( rule__EnumObject__InstancesAssignment_10 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2600:2: rule__EnumObject__InstancesAssignment_10
            {
            pushFollow(FOLLOW_rule__EnumObject__InstancesAssignment_10_in_rule__EnumObject__Group__10__Impl5310);
            rule__EnumObject__InstancesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10()); 

            }

            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2603:1: ( ( rule__EnumObject__InstancesAssignment_10 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2604:1: ( rule__EnumObject__InstancesAssignment_10 )*
            {
             before(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2605:1: ( rule__EnumObject__InstancesAssignment_10 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2605:2: rule__EnumObject__InstancesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__EnumObject__InstancesAssignment_10_in_rule__EnumObject__Group__10__Impl5322);
            	    rule__EnumObject__InstancesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEnumObjectAccess().getInstancesAssignment_10()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__10__Impl"


    // $ANTLR start "rule__EnumObject__Group__11"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2616:1: rule__EnumObject__Group__11 : rule__EnumObject__Group__11__Impl rule__EnumObject__Group__12 ;
    public final void rule__EnumObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2620:1: ( rule__EnumObject__Group__11__Impl rule__EnumObject__Group__12 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2621:2: rule__EnumObject__Group__11__Impl rule__EnumObject__Group__12
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__11__Impl_in_rule__EnumObject__Group__115355);
            rule__EnumObject__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumObject__Group__12_in_rule__EnumObject__Group__115358);
            rule__EnumObject__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__11"


    // $ANTLR start "rule__EnumObject__Group__11__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2628:1: rule__EnumObject__Group__11__Impl : ( '}' ) ;
    public final void rule__EnumObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2632:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2633:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2633:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2634:1: '}'
            {
             before(grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_18_in_rule__EnumObject__Group__11__Impl5386); 
             after(grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__11__Impl"


    // $ANTLR start "rule__EnumObject__Group__12"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2647:1: rule__EnumObject__Group__12 : rule__EnumObject__Group__12__Impl ;
    public final void rule__EnumObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2651:1: ( rule__EnumObject__Group__12__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2652:2: rule__EnumObject__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__EnumObject__Group__12__Impl_in_rule__EnumObject__Group__125417);
            rule__EnumObject__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__12"


    // $ANTLR start "rule__EnumObject__Group__12__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2658:1: rule__EnumObject__Group__12__Impl : ( '}' ) ;
    public final void rule__EnumObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2662:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2663:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2663:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2664:1: '}'
            {
             before(grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_18_in_rule__EnumObject__Group__12__Impl5445); 
             after(grammarAccess.getEnumObjectAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__Group__12__Impl"


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2703:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2707:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2708:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05502);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05505);
            rule__EnumInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__0"


    // $ANTLR start "rule__EnumInstance__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2715:1: rule__EnumInstance__Group__0__Impl : ( ( rule__EnumInstance__DocAssignment_0 ) ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2719:1: ( ( ( rule__EnumInstance__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2720:1: ( ( rule__EnumInstance__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2720:1: ( ( rule__EnumInstance__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2721:1: ( rule__EnumInstance__DocAssignment_0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2722:1: ( rule__EnumInstance__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2722:2: rule__EnumInstance__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumInstance__DocAssignment_0_in_rule__EnumInstance__Group__0__Impl5532);
            rule__EnumInstance__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__0__Impl"


    // $ANTLR start "rule__EnumInstance__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2732:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2736:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2737:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15562);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15565);
            rule__EnumInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__1"


    // $ANTLR start "rule__EnumInstance__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2744:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2748:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2749:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2749:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2750:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2751:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2751:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5592);
            rule__EnumInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__1__Impl"


    // $ANTLR start "rule__EnumInstance__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2761:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2765:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2766:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25622);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25625);
            rule__EnumInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__2"


    // $ANTLR start "rule__EnumInstance__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2773:1: rule__EnumInstance__Group__2__Impl : ( ( rule__EnumInstance__Group_2__0 )? ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2777:1: ( ( ( rule__EnumInstance__Group_2__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2778:1: ( ( rule__EnumInstance__Group_2__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2778:1: ( ( rule__EnumInstance__Group_2__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2779:1: ( rule__EnumInstance__Group_2__0 )?
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2780:1: ( rule__EnumInstance__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2780:2: rule__EnumInstance__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumInstance__Group_2__0_in_rule__EnumInstance__Group__2__Impl5652);
                    rule__EnumInstance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumInstanceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__2__Impl"


    // $ANTLR start "rule__EnumInstance__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2790:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2794:1: ( rule__EnumInstance__Group__3__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2795:2: rule__EnumInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35683);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__3"


    // $ANTLR start "rule__EnumInstance__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2801:1: rule__EnumInstance__Group__3__Impl : ( ';' ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2805:1: ( ( ';' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2806:1: ( ';' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2806:1: ( ';' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2807:1: ';'
            {
             before(grammarAccess.getEnumInstanceAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__EnumInstance__Group__3__Impl5711); 
             after(grammarAccess.getEnumInstanceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__3__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2828:1: rule__EnumInstance__Group_2__0 : rule__EnumInstance__Group_2__0__Impl rule__EnumInstance__Group_2__1 ;
    public final void rule__EnumInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2832:1: ( rule__EnumInstance__Group_2__0__Impl rule__EnumInstance__Group_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2833:2: rule__EnumInstance__Group_2__0__Impl rule__EnumInstance__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2__0__Impl_in_rule__EnumInstance__Group_2__05750);
            rule__EnumInstance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_2__1_in_rule__EnumInstance__Group_2__05753);
            rule__EnumInstance__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__0"


    // $ANTLR start "rule__EnumInstance__Group_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2840:1: rule__EnumInstance__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EnumInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2844:1: ( ( '(' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2845:1: ( '(' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2845:1: ( '(' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2846:1: '('
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__EnumInstance__Group_2__0__Impl5781); 
             after(grammarAccess.getEnumInstanceAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__0__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2859:1: rule__EnumInstance__Group_2__1 : rule__EnumInstance__Group_2__1__Impl rule__EnumInstance__Group_2__2 ;
    public final void rule__EnumInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2863:1: ( rule__EnumInstance__Group_2__1__Impl rule__EnumInstance__Group_2__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2864:2: rule__EnumInstance__Group_2__1__Impl rule__EnumInstance__Group_2__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2__1__Impl_in_rule__EnumInstance__Group_2__15812);
            rule__EnumInstance__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_2__2_in_rule__EnumInstance__Group_2__15815);
            rule__EnumInstance__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__1"


    // $ANTLR start "rule__EnumInstance__Group_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2871:1: rule__EnumInstance__Group_2__1__Impl : ( ( rule__EnumInstance__ParamsAssignment_2_1 ) ) ;
    public final void rule__EnumInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2875:1: ( ( ( rule__EnumInstance__ParamsAssignment_2_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2876:1: ( ( rule__EnumInstance__ParamsAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2876:1: ( ( rule__EnumInstance__ParamsAssignment_2_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2877:1: ( rule__EnumInstance__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2878:1: ( rule__EnumInstance__ParamsAssignment_2_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2878:2: rule__EnumInstance__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ParamsAssignment_2_1_in_rule__EnumInstance__Group_2__1__Impl5842);
            rule__EnumInstance__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__1__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2888:1: rule__EnumInstance__Group_2__2 : rule__EnumInstance__Group_2__2__Impl rule__EnumInstance__Group_2__3 ;
    public final void rule__EnumInstance__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2892:1: ( rule__EnumInstance__Group_2__2__Impl rule__EnumInstance__Group_2__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2893:2: rule__EnumInstance__Group_2__2__Impl rule__EnumInstance__Group_2__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2__2__Impl_in_rule__EnumInstance__Group_2__25872);
            rule__EnumInstance__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_2__3_in_rule__EnumInstance__Group_2__25875);
            rule__EnumInstance__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__2"


    // $ANTLR start "rule__EnumInstance__Group_2__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2900:1: rule__EnumInstance__Group_2__2__Impl : ( ( rule__EnumInstance__Group_2_2__0 )* ) ;
    public final void rule__EnumInstance__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2904:1: ( ( ( rule__EnumInstance__Group_2_2__0 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2905:1: ( ( rule__EnumInstance__Group_2_2__0 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2905:1: ( ( rule__EnumInstance__Group_2_2__0 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2906:1: ( rule__EnumInstance__Group_2_2__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_2_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2907:1: ( rule__EnumInstance__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2907:2: rule__EnumInstance__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_2_2__0_in_rule__EnumInstance__Group_2__2__Impl5902);
            	    rule__EnumInstance__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEnumInstanceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__2__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2917:1: rule__EnumInstance__Group_2__3 : rule__EnumInstance__Group_2__3__Impl ;
    public final void rule__EnumInstance__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2921:1: ( rule__EnumInstance__Group_2__3__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2922:2: rule__EnumInstance__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2__3__Impl_in_rule__EnumInstance__Group_2__35933);
            rule__EnumInstance__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__3"


    // $ANTLR start "rule__EnumInstance__Group_2__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2928:1: rule__EnumInstance__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EnumInstance__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2932:1: ( ( ')' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2933:1: ( ')' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2933:1: ( ')' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2934:1: ')'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightParenthesisKeyword_2_3()); 
            match(input,28,FOLLOW_28_in_rule__EnumInstance__Group_2__3__Impl5961); 
             after(grammarAccess.getEnumInstanceAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2__3__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2955:1: rule__EnumInstance__Group_2_2__0 : rule__EnumInstance__Group_2_2__0__Impl rule__EnumInstance__Group_2_2__1 ;
    public final void rule__EnumInstance__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2959:1: ( rule__EnumInstance__Group_2_2__0__Impl rule__EnumInstance__Group_2_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2960:2: rule__EnumInstance__Group_2_2__0__Impl rule__EnumInstance__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2_2__0__Impl_in_rule__EnumInstance__Group_2_2__06000);
            rule__EnumInstance__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_2_2__1_in_rule__EnumInstance__Group_2_2__06003);
            rule__EnumInstance__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2_2__0"


    // $ANTLR start "rule__EnumInstance__Group_2_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2967:1: rule__EnumInstance__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2971:1: ( ( ',' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2972:1: ( ',' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2972:1: ( ',' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2973:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_2_2_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumInstance__Group_2_2__0__Impl6031); 
             after(grammarAccess.getEnumInstanceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2_2__0__Impl"


    // $ANTLR start "rule__EnumInstance__Group_2_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2986:1: rule__EnumInstance__Group_2_2__1 : rule__EnumInstance__Group_2_2__1__Impl ;
    public final void rule__EnumInstance__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2990:1: ( rule__EnumInstance__Group_2_2__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2991:2: rule__EnumInstance__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_2_2__1__Impl_in_rule__EnumInstance__Group_2_2__16062);
            rule__EnumInstance__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2_2__1"


    // $ANTLR start "rule__EnumInstance__Group_2_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:2997:1: rule__EnumInstance__Group_2_2__1__Impl : ( ( rule__EnumInstance__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__EnumInstance__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3001:1: ( ( ( rule__EnumInstance__ParamsAssignment_2_2_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3002:1: ( ( rule__EnumInstance__ParamsAssignment_2_2_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3002:1: ( ( rule__EnumInstance__ParamsAssignment_2_2_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3003:1: ( rule__EnumInstance__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3004:1: ( rule__EnumInstance__ParamsAssignment_2_2_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3004:2: rule__EnumInstance__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ParamsAssignment_2_2_1_in_rule__EnumInstance__Group_2_2__1__Impl6089);
            rule__EnumInstance__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_2_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3018:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3022:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3023:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06123);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06126);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3030:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__DocAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3034:1: ( ( ( rule__Entity__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3035:1: ( ( rule__Entity__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3035:1: ( ( rule__Entity__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3036:1: ( rule__Entity__DocAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3037:1: ( rule__Entity__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3037:2: rule__Entity__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__DocAssignment_0_in_rule__Entity__Group__0__Impl6153);
            rule__Entity__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3047:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3051:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3052:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16183);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16186);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3059:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3063:1: ( ( 'entity' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3064:1: ( 'entity' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3064:1: ( 'entity' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3065:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Entity__Group__1__Impl6214); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3078:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3082:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3083:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26245);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26248);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3090:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3094:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3095:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3095:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3096:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3097:1: ( rule__Entity__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3097:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl6275);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3107:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3111:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3112:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36305);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36308);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3119:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3123:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3124:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3124:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3125:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__3__Impl6336); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3138:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3142:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3143:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46367);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46370);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3150:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__MetaInfoAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3154:1: ( ( ( rule__Entity__MetaInfoAssignment_4 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3155:1: ( ( rule__Entity__MetaInfoAssignment_4 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3155:1: ( ( rule__Entity__MetaInfoAssignment_4 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3156:1: ( rule__Entity__MetaInfoAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getMetaInfoAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3157:1: ( rule__Entity__MetaInfoAssignment_4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3157:2: rule__Entity__MetaInfoAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__MetaInfoAssignment_4_in_rule__Entity__Group__4__Impl6397);
            rule__Entity__MetaInfoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getMetaInfoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3167:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3171:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3172:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56427);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__56430);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3179:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__VariablesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3183:1: ( ( ( rule__Entity__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3184:1: ( ( rule__Entity__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3184:1: ( ( rule__Entity__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3185:1: ( rule__Entity__VariablesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3186:1: ( rule__Entity__VariablesAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DOC) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID||(LA26_1>=46 && LA26_1<=49)) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==RULE_ID||(LA26_0>=46 && LA26_0<=49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3186:2: rule__Entity__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__VariablesAssignment_5_in_rule__Entity__Group__5__Impl6457);
            	    rule__Entity__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3196:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3200:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3201:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__66488);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__66491);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3208:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__ConstructorsAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3212:1: ( ( ( rule__Entity__ConstructorsAssignment_6 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3213:1: ( ( rule__Entity__ConstructorsAssignment_6 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3213:1: ( ( rule__Entity__ConstructorsAssignment_6 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3214:1: ( rule__Entity__ConstructorsAssignment_6 )*
            {
             before(grammarAccess.getEntityAccess().getConstructorsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:1: ( rule__Entity__ConstructorsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOC) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==32) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3215:2: rule__Entity__ConstructorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ConstructorsAssignment_6_in_rule__Entity__Group__6__Impl6518);
            	    rule__Entity__ConstructorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getConstructorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3225:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3229:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3230:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__76549);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__76552);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3237:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__MethodsAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3241:1: ( ( ( rule__Entity__MethodsAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3242:1: ( ( rule__Entity__MethodsAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3242:1: ( ( rule__Entity__MethodsAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3243:1: ( rule__Entity__MethodsAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getMethodsAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3244:1: ( rule__Entity__MethodsAssignment_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOC||LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3244:2: rule__Entity__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__MethodsAssignment_7_in_rule__Entity__Group__7__Impl6579);
            	    rule__Entity__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3254:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3258:1: ( rule__Entity__Group__8__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3259:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__86610);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3265:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3269:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3270:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3270:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3271:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl6638); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Aggregate__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3302:1: rule__Aggregate__Group__0 : rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1 ;
    public final void rule__Aggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3306:1: ( rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3307:2: rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__0__Impl_in_rule__Aggregate__Group__06687);
            rule__Aggregate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__1_in_rule__Aggregate__Group__06690);
            rule__Aggregate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__0"


    // $ANTLR start "rule__Aggregate__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3314:1: rule__Aggregate__Group__0__Impl : ( ( rule__Aggregate__DocAssignment_0 ) ) ;
    public final void rule__Aggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3318:1: ( ( ( rule__Aggregate__DocAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3319:1: ( ( rule__Aggregate__DocAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3319:1: ( ( rule__Aggregate__DocAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3320:1: ( rule__Aggregate__DocAssignment_0 )
            {
             before(grammarAccess.getAggregateAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3321:1: ( rule__Aggregate__DocAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3321:2: rule__Aggregate__DocAssignment_0
            {
            pushFollow(FOLLOW_rule__Aggregate__DocAssignment_0_in_rule__Aggregate__Group__0__Impl6717);
            rule__Aggregate__DocAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__0__Impl"


    // $ANTLR start "rule__Aggregate__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3331:1: rule__Aggregate__Group__1 : rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2 ;
    public final void rule__Aggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3335:1: ( rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3336:2: rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__1__Impl_in_rule__Aggregate__Group__16747);
            rule__Aggregate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__2_in_rule__Aggregate__Group__16750);
            rule__Aggregate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__1"


    // $ANTLR start "rule__Aggregate__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3343:1: rule__Aggregate__Group__1__Impl : ( 'aggregate' ) ;
    public final void rule__Aggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3347:1: ( ( 'aggregate' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3348:1: ( 'aggregate' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3348:1: ( 'aggregate' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3349:1: 'aggregate'
            {
             before(grammarAccess.getAggregateAccess().getAggregateKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Aggregate__Group__1__Impl6778); 
             after(grammarAccess.getAggregateAccess().getAggregateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__1__Impl"


    // $ANTLR start "rule__Aggregate__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3362:1: rule__Aggregate__Group__2 : rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3 ;
    public final void rule__Aggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3366:1: ( rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3367:2: rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__2__Impl_in_rule__Aggregate__Group__26809);
            rule__Aggregate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__3_in_rule__Aggregate__Group__26812);
            rule__Aggregate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__2"


    // $ANTLR start "rule__Aggregate__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3374:1: rule__Aggregate__Group__2__Impl : ( ( rule__Aggregate__NameAssignment_2 ) ) ;
    public final void rule__Aggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3378:1: ( ( ( rule__Aggregate__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3379:1: ( ( rule__Aggregate__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3379:1: ( ( rule__Aggregate__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3380:1: ( rule__Aggregate__NameAssignment_2 )
            {
             before(grammarAccess.getAggregateAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3381:1: ( rule__Aggregate__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3381:2: rule__Aggregate__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Aggregate__NameAssignment_2_in_rule__Aggregate__Group__2__Impl6839);
            rule__Aggregate__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__2__Impl"


    // $ANTLR start "rule__Aggregate__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3391:1: rule__Aggregate__Group__3 : rule__Aggregate__Group__3__Impl rule__Aggregate__Group__4 ;
    public final void rule__Aggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3395:1: ( rule__Aggregate__Group__3__Impl rule__Aggregate__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3396:2: rule__Aggregate__Group__3__Impl rule__Aggregate__Group__4
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__3__Impl_in_rule__Aggregate__Group__36869);
            rule__Aggregate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__4_in_rule__Aggregate__Group__36872);
            rule__Aggregate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__3"


    // $ANTLR start "rule__Aggregate__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3403:1: rule__Aggregate__Group__3__Impl : ( '{' ) ;
    public final void rule__Aggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3407:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3408:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3408:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3409:1: '{'
            {
             before(grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Aggregate__Group__3__Impl6900); 
             after(grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__3__Impl"


    // $ANTLR start "rule__Aggregate__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3422:1: rule__Aggregate__Group__4 : rule__Aggregate__Group__4__Impl rule__Aggregate__Group__5 ;
    public final void rule__Aggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3426:1: ( rule__Aggregate__Group__4__Impl rule__Aggregate__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3427:2: rule__Aggregate__Group__4__Impl rule__Aggregate__Group__5
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__4__Impl_in_rule__Aggregate__Group__46931);
            rule__Aggregate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__5_in_rule__Aggregate__Group__46934);
            rule__Aggregate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__4"


    // $ANTLR start "rule__Aggregate__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3434:1: rule__Aggregate__Group__4__Impl : ( ( rule__Aggregate__MetaInfoAssignment_4 ) ) ;
    public final void rule__Aggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3438:1: ( ( ( rule__Aggregate__MetaInfoAssignment_4 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3439:1: ( ( rule__Aggregate__MetaInfoAssignment_4 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3439:1: ( ( rule__Aggregate__MetaInfoAssignment_4 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3440:1: ( rule__Aggregate__MetaInfoAssignment_4 )
            {
             before(grammarAccess.getAggregateAccess().getMetaInfoAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3441:1: ( rule__Aggregate__MetaInfoAssignment_4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3441:2: rule__Aggregate__MetaInfoAssignment_4
            {
            pushFollow(FOLLOW_rule__Aggregate__MetaInfoAssignment_4_in_rule__Aggregate__Group__4__Impl6961);
            rule__Aggregate__MetaInfoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getMetaInfoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__4__Impl"


    // $ANTLR start "rule__Aggregate__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3451:1: rule__Aggregate__Group__5 : rule__Aggregate__Group__5__Impl rule__Aggregate__Group__6 ;
    public final void rule__Aggregate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3455:1: ( rule__Aggregate__Group__5__Impl rule__Aggregate__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3456:2: rule__Aggregate__Group__5__Impl rule__Aggregate__Group__6
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__5__Impl_in_rule__Aggregate__Group__56991);
            rule__Aggregate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__6_in_rule__Aggregate__Group__56994);
            rule__Aggregate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__5"


    // $ANTLR start "rule__Aggregate__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3463:1: rule__Aggregate__Group__5__Impl : ( ( rule__Aggregate__VariablesAssignment_5 )* ) ;
    public final void rule__Aggregate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3467:1: ( ( ( rule__Aggregate__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3468:1: ( ( rule__Aggregate__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3468:1: ( ( rule__Aggregate__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3469:1: ( rule__Aggregate__VariablesAssignment_5 )*
            {
             before(grammarAccess.getAggregateAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3470:1: ( rule__Aggregate__VariablesAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOC) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||(LA29_1>=46 && LA29_1<=49)) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==RULE_ID||(LA29_0>=46 && LA29_0<=49)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3470:2: rule__Aggregate__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Aggregate__VariablesAssignment_5_in_rule__Aggregate__Group__5__Impl7021);
            	    rule__Aggregate__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAggregateAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__5__Impl"


    // $ANTLR start "rule__Aggregate__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3480:1: rule__Aggregate__Group__6 : rule__Aggregate__Group__6__Impl rule__Aggregate__Group__7 ;
    public final void rule__Aggregate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3484:1: ( rule__Aggregate__Group__6__Impl rule__Aggregate__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3485:2: rule__Aggregate__Group__6__Impl rule__Aggregate__Group__7
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__6__Impl_in_rule__Aggregate__Group__67052);
            rule__Aggregate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__7_in_rule__Aggregate__Group__67055);
            rule__Aggregate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__6"


    // $ANTLR start "rule__Aggregate__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3492:1: rule__Aggregate__Group__6__Impl : ( ( rule__Aggregate__ConstructorsAssignment_6 )* ) ;
    public final void rule__Aggregate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3496:1: ( ( ( rule__Aggregate__ConstructorsAssignment_6 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3497:1: ( ( rule__Aggregate__ConstructorsAssignment_6 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3497:1: ( ( rule__Aggregate__ConstructorsAssignment_6 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3498:1: ( rule__Aggregate__ConstructorsAssignment_6 )*
            {
             before(grammarAccess.getAggregateAccess().getConstructorsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3499:1: ( rule__Aggregate__ConstructorsAssignment_6 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOC) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==32) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3499:2: rule__Aggregate__ConstructorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Aggregate__ConstructorsAssignment_6_in_rule__Aggregate__Group__6__Impl7082);
            	    rule__Aggregate__ConstructorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAggregateAccess().getConstructorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__6__Impl"


    // $ANTLR start "rule__Aggregate__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3509:1: rule__Aggregate__Group__7 : rule__Aggregate__Group__7__Impl rule__Aggregate__Group__8 ;
    public final void rule__Aggregate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3513:1: ( rule__Aggregate__Group__7__Impl rule__Aggregate__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3514:2: rule__Aggregate__Group__7__Impl rule__Aggregate__Group__8
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__7__Impl_in_rule__Aggregate__Group__77113);
            rule__Aggregate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aggregate__Group__8_in_rule__Aggregate__Group__77116);
            rule__Aggregate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__7"


    // $ANTLR start "rule__Aggregate__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3521:1: rule__Aggregate__Group__7__Impl : ( ( rule__Aggregate__MethodsAssignment_7 )* ) ;
    public final void rule__Aggregate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3525:1: ( ( ( rule__Aggregate__MethodsAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3526:1: ( ( rule__Aggregate__MethodsAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3526:1: ( ( rule__Aggregate__MethodsAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3527:1: ( rule__Aggregate__MethodsAssignment_7 )*
            {
             before(grammarAccess.getAggregateAccess().getMethodsAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3528:1: ( rule__Aggregate__MethodsAssignment_7 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOC||LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3528:2: rule__Aggregate__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Aggregate__MethodsAssignment_7_in_rule__Aggregate__Group__7__Impl7143);
            	    rule__Aggregate__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAggregateAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__7__Impl"


    // $ANTLR start "rule__Aggregate__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3538:1: rule__Aggregate__Group__8 : rule__Aggregate__Group__8__Impl ;
    public final void rule__Aggregate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3542:1: ( rule__Aggregate__Group__8__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3543:2: rule__Aggregate__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Aggregate__Group__8__Impl_in_rule__Aggregate__Group__87174);
            rule__Aggregate__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__8"


    // $ANTLR start "rule__Aggregate__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3549:1: rule__Aggregate__Group__8__Impl : ( '}' ) ;
    public final void rule__Aggregate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3553:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3554:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3555:1: '}'
            {
             before(grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Aggregate__Group__8__Impl7202); 
             after(grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__8__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3586:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3590:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3591:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__07251);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__07254);
            rule__Constructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3598:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__DocAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3602:1: ( ( ( rule__Constructor__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3603:1: ( ( rule__Constructor__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3603:1: ( ( rule__Constructor__DocAssignment_0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3604:1: ( rule__Constructor__DocAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3605:1: ( rule__Constructor__DocAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOC) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3605:2: rule__Constructor__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Constructor__DocAssignment_0_in_rule__Constructor__Group__0__Impl7281);
                    rule__Constructor__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3615:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3619:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3620:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__17312);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__17315);
            rule__Constructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3627:1: rule__Constructor__Group__1__Impl : ( 'constructor' ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3631:1: ( ( 'constructor' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3632:1: ( 'constructor' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3632:1: ( 'constructor' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3633:1: 'constructor'
            {
             before(grammarAccess.getConstructorAccess().getConstructorKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Constructor__Group__1__Impl7343); 
             after(grammarAccess.getConstructorAccess().getConstructorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3646:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3650:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3651:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__27374);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__27377);
            rule__Constructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3658:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__NameAssignment_2 ) ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3662:1: ( ( ( rule__Constructor__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3663:1: ( ( rule__Constructor__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3663:1: ( ( rule__Constructor__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3664:1: ( rule__Constructor__NameAssignment_2 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3665:1: ( rule__Constructor__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3665:2: rule__Constructor__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constructor__NameAssignment_2_in_rule__Constructor__Group__2__Impl7404);
            rule__Constructor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3675:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl rule__Constructor__Group__4 ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3679:1: ( rule__Constructor__Group__3__Impl rule__Constructor__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3680:2: rule__Constructor__Group__3__Impl rule__Constructor__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__37434);
            rule__Constructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__37437);
            rule__Constructor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3687:1: rule__Constructor__Group__3__Impl : ( '{' ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3691:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3692:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3692:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3693:1: '{'
            {
             before(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Constructor__Group__3__Impl7465); 
             after(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3706:1: rule__Constructor__Group__4 : rule__Constructor__Group__4__Impl rule__Constructor__Group__5 ;
    public final void rule__Constructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3710:1: ( rule__Constructor__Group__4__Impl rule__Constructor__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3711:2: rule__Constructor__Group__4__Impl rule__Constructor__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__47496);
            rule__Constructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__47499);
            rule__Constructor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4"


    // $ANTLR start "rule__Constructor__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3718:1: rule__Constructor__Group__4__Impl : ( ( rule__Constructor__VariablesAssignment_4 )* ) ;
    public final void rule__Constructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3722:1: ( ( ( rule__Constructor__VariablesAssignment_4 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3723:1: ( ( rule__Constructor__VariablesAssignment_4 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3723:1: ( ( rule__Constructor__VariablesAssignment_4 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3724:1: ( rule__Constructor__VariablesAssignment_4 )*
            {
             before(grammarAccess.getConstructorAccess().getVariablesAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3725:1: ( rule__Constructor__VariablesAssignment_4 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOC) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_ID||(LA33_2>=46 && LA33_2<=49)) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==RULE_ID||(LA33_0>=46 && LA33_0<=49)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3725:2: rule__Constructor__VariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__VariablesAssignment_4_in_rule__Constructor__Group__4__Impl7526);
            	    rule__Constructor__VariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4__Impl"


    // $ANTLR start "rule__Constructor__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3735:1: rule__Constructor__Group__5 : rule__Constructor__Group__5__Impl rule__Constructor__Group__6 ;
    public final void rule__Constructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3739:1: ( rule__Constructor__Group__5__Impl rule__Constructor__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3740:2: rule__Constructor__Group__5__Impl rule__Constructor__Group__6
            {
            pushFollow(FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__57557);
            rule__Constructor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__57560);
            rule__Constructor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5"


    // $ANTLR start "rule__Constructor__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3747:1: rule__Constructor__Group__5__Impl : ( ( rule__Constructor__ConstraintsAssignment_5 )? ) ;
    public final void rule__Constructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3751:1: ( ( ( rule__Constructor__ConstraintsAssignment_5 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3752:1: ( ( rule__Constructor__ConstraintsAssignment_5 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3752:1: ( ( rule__Constructor__ConstraintsAssignment_5 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3753:1: ( rule__Constructor__ConstraintsAssignment_5 )?
            {
             before(grammarAccess.getConstructorAccess().getConstraintsAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3754:1: ( rule__Constructor__ConstraintsAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3754:2: rule__Constructor__ConstraintsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Constructor__ConstraintsAssignment_5_in_rule__Constructor__Group__5__Impl7587);
                    rule__Constructor__ConstraintsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getConstraintsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5__Impl"


    // $ANTLR start "rule__Constructor__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3764:1: rule__Constructor__Group__6 : rule__Constructor__Group__6__Impl rule__Constructor__Group__7 ;
    public final void rule__Constructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3768:1: ( rule__Constructor__Group__6__Impl rule__Constructor__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3769:2: rule__Constructor__Group__6__Impl rule__Constructor__Group__7
            {
            pushFollow(FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__67618);
            rule__Constructor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__67621);
            rule__Constructor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6"


    // $ANTLR start "rule__Constructor__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3776:1: rule__Constructor__Group__6__Impl : ( ( rule__Constructor__EventsAssignment_6 )* ) ;
    public final void rule__Constructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3780:1: ( ( ( rule__Constructor__EventsAssignment_6 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3781:1: ( ( rule__Constructor__EventsAssignment_6 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3781:1: ( ( rule__Constructor__EventsAssignment_6 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3782:1: ( rule__Constructor__EventsAssignment_6 )*
            {
             before(grammarAccess.getConstructorAccess().getEventsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3783:1: ( rule__Constructor__EventsAssignment_6 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_DOC||LA35_0==35) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3783:2: rule__Constructor__EventsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__EventsAssignment_6_in_rule__Constructor__Group__6__Impl7648);
            	    rule__Constructor__EventsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getEventsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6__Impl"


    // $ANTLR start "rule__Constructor__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3793:1: rule__Constructor__Group__7 : rule__Constructor__Group__7__Impl ;
    public final void rule__Constructor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3797:1: ( rule__Constructor__Group__7__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3798:2: rule__Constructor__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__77679);
            rule__Constructor__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7"


    // $ANTLR start "rule__Constructor__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3804:1: rule__Constructor__Group__7__Impl : ( '}' ) ;
    public final void rule__Constructor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3808:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3809:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3809:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3810:1: '}'
            {
             before(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Constructor__Group__7__Impl7707); 
             after(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3839:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3843:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3844:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__07754);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__07757);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3851:1: rule__Method__Group__0__Impl : ( ( rule__Method__DocAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3855:1: ( ( ( rule__Method__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3856:1: ( ( rule__Method__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3856:1: ( ( rule__Method__DocAssignment_0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3857:1: ( rule__Method__DocAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3858:1: ( rule__Method__DocAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DOC) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3858:2: rule__Method__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__DocAssignment_0_in_rule__Method__Group__0__Impl7784);
                    rule__Method__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3868:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3872:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3873:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__17815);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__17818);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3880:1: rule__Method__Group__1__Impl : ( 'method' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3884:1: ( ( 'method' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3885:1: ( 'method' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3885:1: ( 'method' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3886:1: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Method__Group__1__Impl7846); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3899:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3903:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3904:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__27877);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__27880);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3911:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3915:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3916:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3916:1: ( ( rule__Method__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3917:1: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3918:1: ( rule__Method__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3918:2: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl7907);
            rule__Method__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3928:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3932:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3933:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__37937);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__37940);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3940:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3944:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3945:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3945:1: ( ( rule__Method__Group_3__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3946:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3947:1: ( rule__Method__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3947:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl7967);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3957:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3961:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3962:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__47998);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__48001);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3969:1: rule__Method__Group__4__Impl : ( '{' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3973:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3974:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3975:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Method__Group__4__Impl8029); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3988:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3992:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:3993:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__58060);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__58063);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4000:1: rule__Method__Group__5__Impl : ( ( rule__Method__VariablesAssignment_5 )* ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4004:1: ( ( ( rule__Method__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4005:1: ( ( rule__Method__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4005:1: ( ( rule__Method__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4006:1: ( rule__Method__VariablesAssignment_5 )*
            {
             before(grammarAccess.getMethodAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4007:1: ( rule__Method__VariablesAssignment_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_DOC) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID||(LA38_2>=46 && LA38_2<=49)) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==RULE_ID||(LA38_0>=46 && LA38_0<=49)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4007:2: rule__Method__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Method__VariablesAssignment_5_in_rule__Method__Group__5__Impl8090);
            	    rule__Method__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4017:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4021:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4022:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__68121);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__7_in_rule__Method__Group__68124);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4029:1: rule__Method__Group__6__Impl : ( ( rule__Method__ConstraintsAssignment_6 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4033:1: ( ( ( rule__Method__ConstraintsAssignment_6 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4034:1: ( ( rule__Method__ConstraintsAssignment_6 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4034:1: ( ( rule__Method__ConstraintsAssignment_6 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4035:1: ( rule__Method__ConstraintsAssignment_6 )?
            {
             before(grammarAccess.getMethodAccess().getConstraintsAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4036:1: ( rule__Method__ConstraintsAssignment_6 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4036:2: rule__Method__ConstraintsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Method__ConstraintsAssignment_6_in_rule__Method__Group__6__Impl8151);
                    rule__Method__ConstraintsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getConstraintsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4046:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4050:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4051:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__78182);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__8_in_rule__Method__Group__78185);
            rule__Method__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4058:1: rule__Method__Group__7__Impl : ( ( rule__Method__EventsAssignment_7 )* ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4062:1: ( ( ( rule__Method__EventsAssignment_7 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4063:1: ( ( rule__Method__EventsAssignment_7 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4063:1: ( ( rule__Method__EventsAssignment_7 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4064:1: ( rule__Method__EventsAssignment_7 )*
            {
             before(grammarAccess.getMethodAccess().getEventsAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4065:1: ( rule__Method__EventsAssignment_7 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_DOC||LA40_0==35) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4065:2: rule__Method__EventsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Method__EventsAssignment_7_in_rule__Method__Group__7__Impl8212);
            	    rule__Method__EventsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getEventsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4075:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4079:1: ( rule__Method__Group__8__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4080:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__88243);
            rule__Method__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4086:1: rule__Method__Group__8__Impl : ( '}' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4090:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4091:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4091:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4092:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group__8__Impl8271); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4123:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4127:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4128:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__08320);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__08323);
            rule__Method__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4135:1: rule__Method__Group_3__0__Impl : ( 'ref' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4139:1: ( ( 'ref' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4140:1: ( 'ref' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4140:1: ( 'ref' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4141:1: 'ref'
            {
             before(grammarAccess.getMethodAccess().getRefKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Method__Group_3__0__Impl8351); 
             after(grammarAccess.getMethodAccess().getRefKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4154:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4158:1: ( rule__Method__Group_3__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4159:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__18382);
            rule__Method__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4165:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__RefMethodAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4169:1: ( ( ( rule__Method__RefMethodAssignment_3_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4170:1: ( ( rule__Method__RefMethodAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4170:1: ( ( rule__Method__RefMethodAssignment_3_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4171:1: ( rule__Method__RefMethodAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getRefMethodAssignment_3_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4172:1: ( rule__Method__RefMethodAssignment_3_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4172:2: rule__Method__RefMethodAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Method__RefMethodAssignment_3_1_in_rule__Method__Group_3__1__Impl8409);
            rule__Method__RefMethodAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getRefMethodAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4186:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4190:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4191:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__08443);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__08446);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4198:1: rule__Event__Group__0__Impl : ( ( rule__Event__DocAssignment_0 )? ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4202:1: ( ( ( rule__Event__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4203:1: ( ( rule__Event__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4203:1: ( ( rule__Event__DocAssignment_0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4204:1: ( rule__Event__DocAssignment_0 )?
            {
             before(grammarAccess.getEventAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4205:1: ( rule__Event__DocAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_DOC) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4205:2: rule__Event__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Event__DocAssignment_0_in_rule__Event__Group__0__Impl8473);
                    rule__Event__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4215:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4219:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4220:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__18504);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__18507);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4227:1: rule__Event__Group__1__Impl : ( 'event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4231:1: ( ( 'event' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4232:1: ( 'event' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4232:1: ( 'event' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4233:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Event__Group__1__Impl8535); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4246:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4250:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4251:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__28566);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__28569);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4258:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4262:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4263:1: ( ( rule__Event__NameAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4264:1: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4265:1: ( rule__Event__NameAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4265:2: rule__Event__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl8596);
            rule__Event__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4275:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4279:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4280:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__38626);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__4_in_rule__Event__Group__38629);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4287:1: rule__Event__Group__3__Impl : ( '{' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4291:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4292:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4292:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4293:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Event__Group__3__Impl8657); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4306:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4310:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4311:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__48688);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__5_in_rule__Event__Group__48691);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4318:1: rule__Event__Group__4__Impl : ( ( rule__Event__VariablesAssignment_4 )* ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4322:1: ( ( ( rule__Event__VariablesAssignment_4 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4323:1: ( ( rule__Event__VariablesAssignment_4 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4323:1: ( ( rule__Event__VariablesAssignment_4 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4324:1: ( rule__Event__VariablesAssignment_4 )*
            {
             before(grammarAccess.getEventAccess().getVariablesAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4325:1: ( rule__Event__VariablesAssignment_4 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DOC)||(LA42_0>=46 && LA42_0<=49)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4325:2: rule__Event__VariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Event__VariablesAssignment_4_in_rule__Event__Group__4__Impl8718);
            	    rule__Event__VariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4335:1: rule__Event__Group__5 : rule__Event__Group__5__Impl ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4339:1: ( rule__Event__Group__5__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4340:2: rule__Event__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__58749);
            rule__Event__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4346:1: rule__Event__Group__5__Impl : ( '}' ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4350:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4351:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4351:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4352:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Event__Group__5__Impl8777); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4377:1: rule__TypeMetaInfo__Group__0 : rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 ;
    public final void rule__TypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4381:1: ( rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4382:2: rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__08820);
            rule__TypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__08823);
            rule__TypeMetaInfo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__0"


    // $ANTLR start "rule__TypeMetaInfo__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4389:1: rule__TypeMetaInfo__Group__0__Impl : ( () ) ;
    public final void rule__TypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4393:1: ( ( () ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4394:1: ( () )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4394:1: ( () )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4395:1: ()
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4396:1: ()
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4398:1: 
            {
            }

             after(grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4408:1: rule__TypeMetaInfo__Group__1 : rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 ;
    public final void rule__TypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4412:1: ( rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4413:2: rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__18881);
            rule__TypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__18884);
            rule__TypeMetaInfo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__1"


    // $ANTLR start "rule__TypeMetaInfo__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4420:1: rule__TypeMetaInfo__Group__1__Impl : ( ( rule__TypeMetaInfo__Group_1__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4424:1: ( ( ( rule__TypeMetaInfo__Group_1__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4425:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4425:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4426:1: ( rule__TypeMetaInfo__Group_1__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4427:1: ( rule__TypeMetaInfo__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4427:2: rule__TypeMetaInfo__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl8911);
                    rule__TypeMetaInfo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4437:1: rule__TypeMetaInfo__Group__2 : rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 ;
    public final void rule__TypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4441:1: ( rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4442:2: rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__28942);
            rule__TypeMetaInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__28945);
            rule__TypeMetaInfo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__2"


    // $ANTLR start "rule__TypeMetaInfo__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4449:1: rule__TypeMetaInfo__Group__2__Impl : ( ( rule__TypeMetaInfo__Group_2__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4453:1: ( ( ( rule__TypeMetaInfo__Group_2__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4454:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4454:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4455:1: ( rule__TypeMetaInfo__Group_2__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4456:1: ( rule__TypeMetaInfo__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4456:2: rule__TypeMetaInfo__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl8972);
                    rule__TypeMetaInfo__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__2__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4466:1: rule__TypeMetaInfo__Group__3 : rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 ;
    public final void rule__TypeMetaInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4470:1: ( rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4471:2: rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__39003);
            rule__TypeMetaInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__39006);
            rule__TypeMetaInfo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__3"


    // $ANTLR start "rule__TypeMetaInfo__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4478:1: rule__TypeMetaInfo__Group__3__Impl : ( ( rule__TypeMetaInfo__Group_3__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4482:1: ( ( ( rule__TypeMetaInfo__Group_3__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4483:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4483:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4484:1: ( rule__TypeMetaInfo__Group_3__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_3()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4485:1: ( rule__TypeMetaInfo__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4485:2: rule__TypeMetaInfo__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl9033);
                    rule__TypeMetaInfo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__3__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4495:1: rule__TypeMetaInfo__Group__4 : rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 ;
    public final void rule__TypeMetaInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4499:1: ( rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4500:2: rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__49064);
            rule__TypeMetaInfo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__49067);
            rule__TypeMetaInfo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__4"


    // $ANTLR start "rule__TypeMetaInfo__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4507:1: rule__TypeMetaInfo__Group__4__Impl : ( ( rule__TypeMetaInfo__Group_4__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4511:1: ( ( ( rule__TypeMetaInfo__Group_4__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4512:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4512:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4513:1: ( rule__TypeMetaInfo__Group_4__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4514:1: ( rule__TypeMetaInfo__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4514:2: rule__TypeMetaInfo__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl9094);
                    rule__TypeMetaInfo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__4__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4524:1: rule__TypeMetaInfo__Group__5 : rule__TypeMetaInfo__Group__5__Impl ;
    public final void rule__TypeMetaInfo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4528:1: ( rule__TypeMetaInfo__Group__5__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4529:2: rule__TypeMetaInfo__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__59125);
            rule__TypeMetaInfo__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__5"


    // $ANTLR start "rule__TypeMetaInfo__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4535:1: rule__TypeMetaInfo__Group__5__Impl : ( ( rule__TypeMetaInfo__Group_5__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4539:1: ( ( ( rule__TypeMetaInfo__Group_5__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4540:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4540:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4541:1: ( rule__TypeMetaInfo__Group_5__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4542:1: ( rule__TypeMetaInfo__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4542:2: rule__TypeMetaInfo__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl9152);
                    rule__TypeMetaInfo__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__5__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4564:1: rule__TypeMetaInfo__Group_1__0 : rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 ;
    public final void rule__TypeMetaInfo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4568:1: ( rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4569:2: rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__09195);
            rule__TypeMetaInfo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__09198);
            rule__TypeMetaInfo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4576:1: rule__TypeMetaInfo__Group_1__0__Impl : ( 'slabel' ) ;
    public final void rule__TypeMetaInfo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4580:1: ( ( 'slabel' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4581:1: ( 'slabel' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4581:1: ( 'slabel' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4582:1: 'slabel'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__TypeMetaInfo__Group_1__0__Impl9226); 
             after(grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4595:1: rule__TypeMetaInfo__Group_1__1 : rule__TypeMetaInfo__Group_1__1__Impl ;
    public final void rule__TypeMetaInfo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4599:1: ( rule__TypeMetaInfo__Group_1__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4600:2: rule__TypeMetaInfo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__19257);
            rule__TypeMetaInfo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4606:1: rule__TypeMetaInfo__Group_1__1__Impl : ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4610:1: ( ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4611:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4611:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4612:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4613:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4613:2: rule__TypeMetaInfo__SlabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl9284);
            rule__TypeMetaInfo__SlabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4627:1: rule__TypeMetaInfo__Group_2__0 : rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 ;
    public final void rule__TypeMetaInfo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4631:1: ( rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4632:2: rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__09318);
            rule__TypeMetaInfo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__09321);
            rule__TypeMetaInfo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4639:1: rule__TypeMetaInfo__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TypeMetaInfo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4643:1: ( ( 'label' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4644:1: ( 'label' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4644:1: ( 'label' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4645:1: 'label'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeMetaInfo__Group_2__0__Impl9349); 
             after(grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4658:1: rule__TypeMetaInfo__Group_2__1 : rule__TypeMetaInfo__Group_2__1__Impl ;
    public final void rule__TypeMetaInfo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4662:1: ( rule__TypeMetaInfo__Group_2__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4663:2: rule__TypeMetaInfo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__19380);
            rule__TypeMetaInfo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4669:1: rule__TypeMetaInfo__Group_2__1__Impl : ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4673:1: ( ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4674:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4674:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4675:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4676:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4676:2: rule__TypeMetaInfo__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl9407);
            rule__TypeMetaInfo__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4690:1: rule__TypeMetaInfo__Group_3__0 : rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 ;
    public final void rule__TypeMetaInfo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4694:1: ( rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4695:2: rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__09441);
            rule__TypeMetaInfo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__09444);
            rule__TypeMetaInfo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4702:1: rule__TypeMetaInfo__Group_3__0__Impl : ( 'tooltipp' ) ;
    public final void rule__TypeMetaInfo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4706:1: ( ( 'tooltipp' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4707:1: ( 'tooltipp' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4707:1: ( 'tooltipp' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4708:1: 'tooltipp'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltippKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__TypeMetaInfo__Group_3__0__Impl9472); 
             after(grammarAccess.getTypeMetaInfoAccess().getTooltippKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4721:1: rule__TypeMetaInfo__Group_3__1 : rule__TypeMetaInfo__Group_3__1__Impl ;
    public final void rule__TypeMetaInfo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4725:1: ( rule__TypeMetaInfo__Group_3__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4726:2: rule__TypeMetaInfo__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__19503);
            rule__TypeMetaInfo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4732:1: rule__TypeMetaInfo__Group_3__1__Impl : ( ( rule__TypeMetaInfo__TooltippAssignment_3_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4736:1: ( ( ( rule__TypeMetaInfo__TooltippAssignment_3_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4737:1: ( ( rule__TypeMetaInfo__TooltippAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4737:1: ( ( rule__TypeMetaInfo__TooltippAssignment_3_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4738:1: ( rule__TypeMetaInfo__TooltippAssignment_3_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltippAssignment_3_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4739:1: ( rule__TypeMetaInfo__TooltippAssignment_3_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4739:2: rule__TypeMetaInfo__TooltippAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__TooltippAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl9530);
            rule__TypeMetaInfo__TooltippAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getTooltippAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4753:1: rule__TypeMetaInfo__Group_4__0 : rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 ;
    public final void rule__TypeMetaInfo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4757:1: ( rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4758:2: rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__09564);
            rule__TypeMetaInfo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__09567);
            rule__TypeMetaInfo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4765:1: rule__TypeMetaInfo__Group_4__0__Impl : ( 'prompt' ) ;
    public final void rule__TypeMetaInfo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4769:1: ( ( 'prompt' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4770:1: ( 'prompt' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4770:1: ( 'prompt' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4771:1: 'prompt'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__TypeMetaInfo__Group_4__0__Impl9595); 
             after(grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4784:1: rule__TypeMetaInfo__Group_4__1 : rule__TypeMetaInfo__Group_4__1__Impl ;
    public final void rule__TypeMetaInfo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4788:1: ( rule__TypeMetaInfo__Group_4__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4789:2: rule__TypeMetaInfo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__19626);
            rule__TypeMetaInfo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4795:1: rule__TypeMetaInfo__Group_4__1__Impl : ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4799:1: ( ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4800:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4800:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4801:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4802:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4802:2: rule__TypeMetaInfo__PromptAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl9653);
            rule__TypeMetaInfo__PromptAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4816:1: rule__TypeMetaInfo__Group_5__0 : rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 ;
    public final void rule__TypeMetaInfo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4820:1: ( rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4821:2: rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__09687);
            rule__TypeMetaInfo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__09690);
            rule__TypeMetaInfo__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4828:1: rule__TypeMetaInfo__Group_5__0__Impl : ( 'examples' ) ;
    public final void rule__TypeMetaInfo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4832:1: ( ( 'examples' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4833:1: ( 'examples' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4833:1: ( 'examples' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4834:1: 'examples'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__TypeMetaInfo__Group_5__0__Impl9718); 
             after(grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4847:1: rule__TypeMetaInfo__Group_5__1 : rule__TypeMetaInfo__Group_5__1__Impl ;
    public final void rule__TypeMetaInfo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4851:1: ( rule__TypeMetaInfo__Group_5__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4852:2: rule__TypeMetaInfo__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__19749);
            rule__TypeMetaInfo__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4858:1: rule__TypeMetaInfo__Group_5__1__Impl : ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) ;
    public final void rule__TypeMetaInfo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4862:1: ( ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4863:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4863:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4864:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4865:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4865:2: rule__TypeMetaInfo__ExamplesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl9776);
            	    rule__TypeMetaInfo__ExamplesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4879:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4883:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4884:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__09811);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__09814);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4891:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DocAssignment_0 )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4895:1: ( ( ( rule__Variable__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4896:1: ( ( rule__Variable__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4896:1: ( ( rule__Variable__DocAssignment_0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4897:1: ( rule__Variable__DocAssignment_0 )?
            {
             before(grammarAccess.getVariableAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4898:1: ( rule__Variable__DocAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DOC) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4898:2: rule__Variable__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Variable__DocAssignment_0_in_rule__Variable__Group__0__Impl9841);
                    rule__Variable__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4908:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4912:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4913:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__19872);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__19875);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4920:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TechnicalIdAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4924:1: ( ( ( rule__Variable__TechnicalIdAssignment_1 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4925:1: ( ( rule__Variable__TechnicalIdAssignment_1 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4925:1: ( ( rule__Variable__TechnicalIdAssignment_1 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4926:1: ( rule__Variable__TechnicalIdAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getTechnicalIdAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4927:1: ( rule__Variable__TechnicalIdAssignment_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4927:2: rule__Variable__TechnicalIdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Variable__TechnicalIdAssignment_1_in_rule__Variable__Group__1__Impl9902);
                    rule__Variable__TechnicalIdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getTechnicalIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4937:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4941:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4942:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__29933);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__29936);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4949:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__BusinessKeyAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4953:1: ( ( ( rule__Variable__BusinessKeyAssignment_2 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4954:1: ( ( rule__Variable__BusinessKeyAssignment_2 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4954:1: ( ( rule__Variable__BusinessKeyAssignment_2 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4955:1: ( rule__Variable__BusinessKeyAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getBusinessKeyAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4956:1: ( rule__Variable__BusinessKeyAssignment_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4956:2: rule__Variable__BusinessKeyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Variable__BusinessKeyAssignment_2_in_rule__Variable__Group__2__Impl9963);
                    rule__Variable__BusinessKeyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getBusinessKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4966:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4970:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4971:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__39994);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__39997);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4978:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__BusinessNameAssignment_3 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4982:1: ( ( ( rule__Variable__BusinessNameAssignment_3 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4983:1: ( ( rule__Variable__BusinessNameAssignment_3 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4983:1: ( ( rule__Variable__BusinessNameAssignment_3 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4984:1: ( rule__Variable__BusinessNameAssignment_3 )?
            {
             before(grammarAccess.getVariableAccess().getBusinessNameAssignment_3()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4985:1: ( rule__Variable__BusinessNameAssignment_3 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4985:2: rule__Variable__BusinessNameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Variable__BusinessNameAssignment_3_in_rule__Variable__Group__3__Impl10024);
                    rule__Variable__BusinessNameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getBusinessNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4995:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:4999:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5000:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__410055);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__410058);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5007:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__NullableAssignment_4 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5011:1: ( ( ( rule__Variable__NullableAssignment_4 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5012:1: ( ( rule__Variable__NullableAssignment_4 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5012:1: ( ( rule__Variable__NullableAssignment_4 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5013:1: ( rule__Variable__NullableAssignment_4 )?
            {
             before(grammarAccess.getVariableAccess().getNullableAssignment_4()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5014:1: ( rule__Variable__NullableAssignment_4 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5014:2: rule__Variable__NullableAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Variable__NullableAssignment_4_in_rule__Variable__Group__4__Impl10085);
                    rule__Variable__NullableAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNullableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5024:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5028:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5029:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__510116);
            rule__Variable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__6_in_rule__Variable__Group__510119);
            rule__Variable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5036:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__TypeAssignment_5 ) ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5040:1: ( ( ( rule__Variable__TypeAssignment_5 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5041:1: ( ( rule__Variable__TypeAssignment_5 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5041:1: ( ( rule__Variable__TypeAssignment_5 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5042:1: ( rule__Variable__TypeAssignment_5 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_5()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5043:1: ( rule__Variable__TypeAssignment_5 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5043:2: rule__Variable__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_5_in_rule__Variable__Group__5__Impl10146);
            rule__Variable__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5053:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl rule__Variable__Group__7 ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5057:1: ( rule__Variable__Group__6__Impl rule__Variable__Group__7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5058:2: rule__Variable__Group__6__Impl rule__Variable__Group__7
            {
            pushFollow(FOLLOW_rule__Variable__Group__6__Impl_in_rule__Variable__Group__610176);
            rule__Variable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__7_in_rule__Variable__Group__610179);
            rule__Variable__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6"


    // $ANTLR start "rule__Variable__Group__6__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5065:1: rule__Variable__Group__6__Impl : ( ( rule__Variable__MultiplicityAssignment_6 )? ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5069:1: ( ( ( rule__Variable__MultiplicityAssignment_6 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5070:1: ( ( rule__Variable__MultiplicityAssignment_6 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5070:1: ( ( rule__Variable__MultiplicityAssignment_6 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5071:1: ( rule__Variable__MultiplicityAssignment_6 )?
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAssignment_6()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5072:1: ( rule__Variable__MultiplicityAssignment_6 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5072:2: rule__Variable__MultiplicityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Variable__MultiplicityAssignment_6_in_rule__Variable__Group__6__Impl10206);
                    rule__Variable__MultiplicityAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getMultiplicityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6__Impl"


    // $ANTLR start "rule__Variable__Group__7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5082:1: rule__Variable__Group__7 : rule__Variable__Group__7__Impl rule__Variable__Group__8 ;
    public final void rule__Variable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5086:1: ( rule__Variable__Group__7__Impl rule__Variable__Group__8 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5087:2: rule__Variable__Group__7__Impl rule__Variable__Group__8
            {
            pushFollow(FOLLOW_rule__Variable__Group__7__Impl_in_rule__Variable__Group__710237);
            rule__Variable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__8_in_rule__Variable__Group__710240);
            rule__Variable__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__7"


    // $ANTLR start "rule__Variable__Group__7__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5094:1: rule__Variable__Group__7__Impl : ( ( rule__Variable__NameAssignment_7 ) ) ;
    public final void rule__Variable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5098:1: ( ( ( rule__Variable__NameAssignment_7 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5099:1: ( ( rule__Variable__NameAssignment_7 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5099:1: ( ( rule__Variable__NameAssignment_7 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5100:1: ( rule__Variable__NameAssignment_7 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_7()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5101:1: ( rule__Variable__NameAssignment_7 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5101:2: rule__Variable__NameAssignment_7
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_7_in_rule__Variable__Group__7__Impl10267);
            rule__Variable__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__7__Impl"


    // $ANTLR start "rule__Variable__Group__8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5111:1: rule__Variable__Group__8 : rule__Variable__Group__8__Impl rule__Variable__Group__9 ;
    public final void rule__Variable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5115:1: ( rule__Variable__Group__8__Impl rule__Variable__Group__9 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5116:2: rule__Variable__Group__8__Impl rule__Variable__Group__9
            {
            pushFollow(FOLLOW_rule__Variable__Group__8__Impl_in_rule__Variable__Group__810297);
            rule__Variable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__9_in_rule__Variable__Group__810300);
            rule__Variable__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__8"


    // $ANTLR start "rule__Variable__Group__8__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5123:1: rule__Variable__Group__8__Impl : ( ( rule__Variable__InvariantsAssignment_8 )? ) ;
    public final void rule__Variable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5127:1: ( ( ( rule__Variable__InvariantsAssignment_8 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5128:1: ( ( rule__Variable__InvariantsAssignment_8 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5128:1: ( ( rule__Variable__InvariantsAssignment_8 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5129:1: ( rule__Variable__InvariantsAssignment_8 )?
            {
             before(grammarAccess.getVariableAccess().getInvariantsAssignment_8()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5130:1: ( rule__Variable__InvariantsAssignment_8 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5130:2: rule__Variable__InvariantsAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Variable__InvariantsAssignment_8_in_rule__Variable__Group__8__Impl10327);
                    rule__Variable__InvariantsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getInvariantsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__8__Impl"


    // $ANTLR start "rule__Variable__Group__9"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5140:1: rule__Variable__Group__9 : rule__Variable__Group__9__Impl ;
    public final void rule__Variable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5144:1: ( rule__Variable__Group__9__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5145:2: rule__Variable__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__9__Impl_in_rule__Variable__Group__910358);
            rule__Variable__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__9"


    // $ANTLR start "rule__Variable__Group__9__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5151:1: rule__Variable__Group__9__Impl : ( ( rule__Variable__Alternatives_9 ) ) ;
    public final void rule__Variable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5155:1: ( ( ( rule__Variable__Alternatives_9 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5156:1: ( ( rule__Variable__Alternatives_9 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5156:1: ( ( rule__Variable__Alternatives_9 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5157:1: ( rule__Variable__Alternatives_9 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_9()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5158:1: ( rule__Variable__Alternatives_9 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5158:2: rule__Variable__Alternatives_9
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_9_in_rule__Variable__Group__9__Impl10385);
            rule__Variable__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__9__Impl"


    // $ANTLR start "rule__Constraints__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5188:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5192:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5193:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_rule__Constraints__Group__0__Impl_in_rule__Constraints__Group__010435);
            rule__Constraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraints__Group__1_in_rule__Constraints__Group__010438);
            rule__Constraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__0"


    // $ANTLR start "rule__Constraints__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5200:1: rule__Constraints__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5204:1: ( ( 'constraints' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5205:1: ( 'constraints' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5205:1: ( 'constraints' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5206:1: 'constraints'
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Constraints__Group__0__Impl10466); 
             after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__0__Impl"


    // $ANTLR start "rule__Constraints__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5219:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl rule__Constraints__Group__2 ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5223:1: ( rule__Constraints__Group__1__Impl rule__Constraints__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5224:2: rule__Constraints__Group__1__Impl rule__Constraints__Group__2
            {
            pushFollow(FOLLOW_rule__Constraints__Group__1__Impl_in_rule__Constraints__Group__110497);
            rule__Constraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraints__Group__2_in_rule__Constraints__Group__110500);
            rule__Constraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__1"


    // $ANTLR start "rule__Constraints__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5231:1: rule__Constraints__Group__1__Impl : ( '{' ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5235:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5236:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5236:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5237:1: '{'
            {
             before(grammarAccess.getConstraintsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Constraints__Group__1__Impl10528); 
             after(grammarAccess.getConstraintsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__1__Impl"


    // $ANTLR start "rule__Constraints__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5250:1: rule__Constraints__Group__2 : rule__Constraints__Group__2__Impl rule__Constraints__Group__3 ;
    public final void rule__Constraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5254:1: ( rule__Constraints__Group__2__Impl rule__Constraints__Group__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5255:2: rule__Constraints__Group__2__Impl rule__Constraints__Group__3
            {
            pushFollow(FOLLOW_rule__Constraints__Group__2__Impl_in_rule__Constraints__Group__210559);
            rule__Constraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraints__Group__3_in_rule__Constraints__Group__210562);
            rule__Constraints__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__2"


    // $ANTLR start "rule__Constraints__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5262:1: rule__Constraints__Group__2__Impl : ( ( rule__Constraints__CallsAssignment_2 ) ) ;
    public final void rule__Constraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5266:1: ( ( ( rule__Constraints__CallsAssignment_2 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5267:1: ( ( rule__Constraints__CallsAssignment_2 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5267:1: ( ( rule__Constraints__CallsAssignment_2 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5268:1: ( rule__Constraints__CallsAssignment_2 )
            {
             before(grammarAccess.getConstraintsAccess().getCallsAssignment_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5269:1: ( rule__Constraints__CallsAssignment_2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5269:2: rule__Constraints__CallsAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraints__CallsAssignment_2_in_rule__Constraints__Group__2__Impl10589);
            rule__Constraints__CallsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getCallsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__2__Impl"


    // $ANTLR start "rule__Constraints__Group__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5279:1: rule__Constraints__Group__3 : rule__Constraints__Group__3__Impl rule__Constraints__Group__4 ;
    public final void rule__Constraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5283:1: ( rule__Constraints__Group__3__Impl rule__Constraints__Group__4 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5284:2: rule__Constraints__Group__3__Impl rule__Constraints__Group__4
            {
            pushFollow(FOLLOW_rule__Constraints__Group__3__Impl_in_rule__Constraints__Group__310619);
            rule__Constraints__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraints__Group__4_in_rule__Constraints__Group__310622);
            rule__Constraints__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__3"


    // $ANTLR start "rule__Constraints__Group__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5291:1: rule__Constraints__Group__3__Impl : ( ( rule__Constraints__Group_3__0 )* ) ;
    public final void rule__Constraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5295:1: ( ( ( rule__Constraints__Group_3__0 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5296:1: ( ( rule__Constraints__Group_3__0 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5296:1: ( ( rule__Constraints__Group_3__0 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5297:1: ( rule__Constraints__Group_3__0 )*
            {
             before(grammarAccess.getConstraintsAccess().getGroup_3()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5298:1: ( rule__Constraints__Group_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==29) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5298:2: rule__Constraints__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Constraints__Group_3__0_in_rule__Constraints__Group__3__Impl10649);
            	    rule__Constraints__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getConstraintsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__3__Impl"


    // $ANTLR start "rule__Constraints__Group__4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5308:1: rule__Constraints__Group__4 : rule__Constraints__Group__4__Impl ;
    public final void rule__Constraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5312:1: ( rule__Constraints__Group__4__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5313:2: rule__Constraints__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constraints__Group__4__Impl_in_rule__Constraints__Group__410680);
            rule__Constraints__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__4"


    // $ANTLR start "rule__Constraints__Group__4__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5319:1: rule__Constraints__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5323:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5324:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5324:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5325:1: '}'
            {
             before(grammarAccess.getConstraintsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Constraints__Group__4__Impl10708); 
             after(grammarAccess.getConstraintsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group__4__Impl"


    // $ANTLR start "rule__Constraints__Group_3__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5348:1: rule__Constraints__Group_3__0 : rule__Constraints__Group_3__0__Impl rule__Constraints__Group_3__1 ;
    public final void rule__Constraints__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5352:1: ( rule__Constraints__Group_3__0__Impl rule__Constraints__Group_3__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5353:2: rule__Constraints__Group_3__0__Impl rule__Constraints__Group_3__1
            {
            pushFollow(FOLLOW_rule__Constraints__Group_3__0__Impl_in_rule__Constraints__Group_3__010749);
            rule__Constraints__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraints__Group_3__1_in_rule__Constraints__Group_3__010752);
            rule__Constraints__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group_3__0"


    // $ANTLR start "rule__Constraints__Group_3__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5360:1: rule__Constraints__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Constraints__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5364:1: ( ( ',' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5365:1: ( ',' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5365:1: ( ',' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5366:1: ','
            {
             before(grammarAccess.getConstraintsAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Constraints__Group_3__0__Impl10780); 
             after(grammarAccess.getConstraintsAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group_3__0__Impl"


    // $ANTLR start "rule__Constraints__Group_3__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5379:1: rule__Constraints__Group_3__1 : rule__Constraints__Group_3__1__Impl ;
    public final void rule__Constraints__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5383:1: ( rule__Constraints__Group_3__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5384:2: rule__Constraints__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraints__Group_3__1__Impl_in_rule__Constraints__Group_3__110811);
            rule__Constraints__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group_3__1"


    // $ANTLR start "rule__Constraints__Group_3__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5390:1: rule__Constraints__Group_3__1__Impl : ( ( rule__Constraints__CallsAssignment_3_1 ) ) ;
    public final void rule__Constraints__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5394:1: ( ( ( rule__Constraints__CallsAssignment_3_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5395:1: ( ( rule__Constraints__CallsAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5395:1: ( ( rule__Constraints__CallsAssignment_3_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5396:1: ( rule__Constraints__CallsAssignment_3_1 )
            {
             before(grammarAccess.getConstraintsAccess().getCallsAssignment_3_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5397:1: ( rule__Constraints__CallsAssignment_3_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5397:2: rule__Constraints__CallsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Constraints__CallsAssignment_3_1_in_rule__Constraints__Group_3__1__Impl10838);
            rule__Constraints__CallsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getCallsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Group_3__1__Impl"


    // $ANTLR start "rule__Invariants__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5411:1: rule__Invariants__Group__0 : rule__Invariants__Group__0__Impl rule__Invariants__Group__1 ;
    public final void rule__Invariants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5415:1: ( rule__Invariants__Group__0__Impl rule__Invariants__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5416:2: rule__Invariants__Group__0__Impl rule__Invariants__Group__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__010872);
            rule__Invariants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__010875);
            rule__Invariants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__0"


    // $ANTLR start "rule__Invariants__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5423:1: rule__Invariants__Group__0__Impl : ( 'invariants' ) ;
    public final void rule__Invariants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5427:1: ( ( 'invariants' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5428:1: ( 'invariants' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5428:1: ( 'invariants' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5429:1: 'invariants'
            {
             before(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Invariants__Group__0__Impl10903); 
             after(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__0__Impl"


    // $ANTLR start "rule__Invariants__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5442:1: rule__Invariants__Group__1 : rule__Invariants__Group__1__Impl rule__Invariants__Group__2 ;
    public final void rule__Invariants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5446:1: ( rule__Invariants__Group__1__Impl rule__Invariants__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5447:2: rule__Invariants__Group__1__Impl rule__Invariants__Group__2
            {
            pushFollow(FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__110934);
            rule__Invariants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__110937);
            rule__Invariants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__1"


    // $ANTLR start "rule__Invariants__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5454:1: rule__Invariants__Group__1__Impl : ( ( rule__Invariants__CallsAssignment_1 ) ) ;
    public final void rule__Invariants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5458:1: ( ( ( rule__Invariants__CallsAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5459:1: ( ( rule__Invariants__CallsAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5459:1: ( ( rule__Invariants__CallsAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5460:1: ( rule__Invariants__CallsAssignment_1 )
            {
             before(grammarAccess.getInvariantsAccess().getCallsAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5461:1: ( rule__Invariants__CallsAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5461:2: rule__Invariants__CallsAssignment_1
            {
            pushFollow(FOLLOW_rule__Invariants__CallsAssignment_1_in_rule__Invariants__Group__1__Impl10964);
            rule__Invariants__CallsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getCallsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__1__Impl"


    // $ANTLR start "rule__Invariants__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5471:1: rule__Invariants__Group__2 : rule__Invariants__Group__2__Impl ;
    public final void rule__Invariants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5475:1: ( rule__Invariants__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5476:2: rule__Invariants__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__210994);
            rule__Invariants__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__2"


    // $ANTLR start "rule__Invariants__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5482:1: rule__Invariants__Group__2__Impl : ( ( rule__Invariants__Group_2__0 )* ) ;
    public final void rule__Invariants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5486:1: ( ( ( rule__Invariants__Group_2__0 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5487:1: ( ( rule__Invariants__Group_2__0 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5487:1: ( ( rule__Invariants__Group_2__0 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5488:1: ( rule__Invariants__Group_2__0 )*
            {
             before(grammarAccess.getInvariantsAccess().getGroup_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5489:1: ( rule__Invariants__Group_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==29) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5489:2: rule__Invariants__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl11021);
            	    rule__Invariants__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getInvariantsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__2__Impl"


    // $ANTLR start "rule__Invariants__Group_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5505:1: rule__Invariants__Group_2__0 : rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 ;
    public final void rule__Invariants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5509:1: ( rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5510:2: rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__011058);
            rule__Invariants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__011061);
            rule__Invariants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__0"


    // $ANTLR start "rule__Invariants__Group_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5517:1: rule__Invariants__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Invariants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5521:1: ( ( ',' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5522:1: ( ',' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5522:1: ( ',' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5523:1: ','
            {
             before(grammarAccess.getInvariantsAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Invariants__Group_2__0__Impl11089); 
             after(grammarAccess.getInvariantsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__0__Impl"


    // $ANTLR start "rule__Invariants__Group_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5536:1: rule__Invariants__Group_2__1 : rule__Invariants__Group_2__1__Impl ;
    public final void rule__Invariants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5540:1: ( rule__Invariants__Group_2__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5541:2: rule__Invariants__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__111120);
            rule__Invariants__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__1"


    // $ANTLR start "rule__Invariants__Group_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5547:1: rule__Invariants__Group_2__1__Impl : ( ( rule__Invariants__CallsAssignment_2_1 ) ) ;
    public final void rule__Invariants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5551:1: ( ( ( rule__Invariants__CallsAssignment_2_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5552:1: ( ( rule__Invariants__CallsAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5552:1: ( ( rule__Invariants__CallsAssignment_2_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5553:1: ( rule__Invariants__CallsAssignment_2_1 )
            {
             before(grammarAccess.getInvariantsAccess().getCallsAssignment_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5554:1: ( rule__Invariants__CallsAssignment_2_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5554:2: rule__Invariants__CallsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Invariants__CallsAssignment_2_1_in_rule__Invariants__Group_2__1__Impl11147);
            rule__Invariants__CallsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getCallsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__1__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5568:1: rule__OverriddenTypeMetaInfo__Group__0 : rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 ;
    public final void rule__OverriddenTypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5572:1: ( rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5573:2: rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__011181);
            rule__OverriddenTypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__011184);
            rule__OverriddenTypeMetaInfo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__0"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5580:1: rule__OverriddenTypeMetaInfo__Group__0__Impl : ( '{' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5584:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5585:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5585:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5586:1: '{'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__OverriddenTypeMetaInfo__Group__0__Impl11212); 
             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__0__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5599:1: rule__OverriddenTypeMetaInfo__Group__1 : rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 ;
    public final void rule__OverriddenTypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5603:1: ( rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5604:2: rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__111243);
            rule__OverriddenTypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__111246);
            rule__OverriddenTypeMetaInfo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__1"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5611:1: rule__OverriddenTypeMetaInfo__Group__1__Impl : ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5615:1: ( ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5616:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5616:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5617:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5618:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5618:2: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl11273);
            rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__1__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5628:1: rule__OverriddenTypeMetaInfo__Group__2 : rule__OverriddenTypeMetaInfo__Group__2__Impl ;
    public final void rule__OverriddenTypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5632:1: ( rule__OverriddenTypeMetaInfo__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5633:2: rule__OverriddenTypeMetaInfo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__211303);
            rule__OverriddenTypeMetaInfo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__2"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5639:1: rule__OverriddenTypeMetaInfo__Group__2__Impl : ( '}' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5643:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5644:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5644:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5645:1: '}'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__OverriddenTypeMetaInfo__Group__2__Impl11331); 
             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5664:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5668:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5669:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__011368);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__011371);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5676:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5680:1: ( ( 'message' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5681:1: ( 'message' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5681:1: ( 'message' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5682:1: 'message'
            {
             before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Message__Group__0__Impl11399); 
             after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5695:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5699:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5700:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__111430);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__111433);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5707:1: rule__Message__Group__1__Impl : ( ( rule__Message__TextAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5711:1: ( ( ( rule__Message__TextAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5712:1: ( ( rule__Message__TextAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5712:1: ( ( rule__Message__TextAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5713:1: ( rule__Message__TextAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getTextAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5714:1: ( rule__Message__TextAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5714:2: rule__Message__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Message__TextAssignment_1_in_rule__Message__Group__1__Impl11460);
            rule__Message__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5724:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5728:1: ( rule__Message__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5729:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__211490);
            rule__Message__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5735:1: rule__Message__Group__2__Impl : ( ( rule__Message__Group_2__0 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5739:1: ( ( ( rule__Message__Group_2__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5740:1: ( ( rule__Message__Group_2__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5740:1: ( ( rule__Message__Group_2__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5741:1: ( rule__Message__Group_2__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5742:1: ( rule__Message__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==17) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5742:2: rule__Message__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_2__0_in_rule__Message__Group__2__Impl11517);
                    rule__Message__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5758:1: rule__Message__Group_2__0 : rule__Message__Group_2__0__Impl rule__Message__Group_2__1 ;
    public final void rule__Message__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5762:1: ( rule__Message__Group_2__0__Impl rule__Message__Group_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5763:2: rule__Message__Group_2__0__Impl rule__Message__Group_2__1
            {
            pushFollow(FOLLOW_rule__Message__Group_2__0__Impl_in_rule__Message__Group_2__011554);
            rule__Message__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_2__1_in_rule__Message__Group_2__011557);
            rule__Message__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0"


    // $ANTLR start "rule__Message__Group_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5770:1: rule__Message__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Message__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5774:1: ( ( '{' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5775:1: ( '{' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5775:1: ( '{' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5776:1: '{'
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Message__Group_2__0__Impl11585); 
             after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0__Impl"


    // $ANTLR start "rule__Message__Group_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5789:1: rule__Message__Group_2__1 : rule__Message__Group_2__1__Impl rule__Message__Group_2__2 ;
    public final void rule__Message__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5793:1: ( rule__Message__Group_2__1__Impl rule__Message__Group_2__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5794:2: rule__Message__Group_2__1__Impl rule__Message__Group_2__2
            {
            pushFollow(FOLLOW_rule__Message__Group_2__1__Impl_in_rule__Message__Group_2__111616);
            rule__Message__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_2__2_in_rule__Message__Group_2__111619);
            rule__Message__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1"


    // $ANTLR start "rule__Message__Group_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5801:1: rule__Message__Group_2__1__Impl : ( ( rule__Message__VariablesAssignment_2_1 )* ) ;
    public final void rule__Message__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5805:1: ( ( ( rule__Message__VariablesAssignment_2_1 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5806:1: ( ( rule__Message__VariablesAssignment_2_1 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5806:1: ( ( rule__Message__VariablesAssignment_2_1 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5807:1: ( rule__Message__VariablesAssignment_2_1 )*
            {
             before(grammarAccess.getMessageAccess().getVariablesAssignment_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5808:1: ( rule__Message__VariablesAssignment_2_1 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_DOC)||(LA59_0>=46 && LA59_0<=49)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5808:2: rule__Message__VariablesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Message__VariablesAssignment_2_1_in_rule__Message__Group_2__1__Impl11646);
            	    rule__Message__VariablesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1__Impl"


    // $ANTLR start "rule__Message__Group_2__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5818:1: rule__Message__Group_2__2 : rule__Message__Group_2__2__Impl ;
    public final void rule__Message__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5822:1: ( rule__Message__Group_2__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5823:2: rule__Message__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_2__2__Impl_in_rule__Message__Group_2__211677);
            rule__Message__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__2"


    // $ANTLR start "rule__Message__Group_2__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5829:1: rule__Message__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Message__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5833:1: ( ( '}' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5834:1: ( '}' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5834:1: ( '}' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5835:1: '}'
            {
             before(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__Message__Group_2__2__Impl11705); 
             after(grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__2__Impl"


    // $ANTLR start "rule__ConstraintCall__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5854:1: rule__ConstraintCall__Group__0 : rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1 ;
    public final void rule__ConstraintCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5858:1: ( rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5859:2: rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__0__Impl_in_rule__ConstraintCall__Group__011742);
            rule__ConstraintCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group__1_in_rule__ConstraintCall__Group__011745);
            rule__ConstraintCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__0"


    // $ANTLR start "rule__ConstraintCall__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5866:1: rule__ConstraintCall__Group__0__Impl : ( ( rule__ConstraintCall__ConstraintAssignment_0 ) ) ;
    public final void rule__ConstraintCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5870:1: ( ( ( rule__ConstraintCall__ConstraintAssignment_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5871:1: ( ( rule__ConstraintCall__ConstraintAssignment_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5871:1: ( ( rule__ConstraintCall__ConstraintAssignment_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5872:1: ( rule__ConstraintCall__ConstraintAssignment_0 )
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintAssignment_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5873:1: ( rule__ConstraintCall__ConstraintAssignment_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5873:2: rule__ConstraintCall__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ConstraintAssignment_0_in_rule__ConstraintCall__Group__0__Impl11772);
            rule__ConstraintCall__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5883:1: rule__ConstraintCall__Group__1 : rule__ConstraintCall__Group__1__Impl ;
    public final void rule__ConstraintCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5887:1: ( rule__ConstraintCall__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5888:2: rule__ConstraintCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__1__Impl_in_rule__ConstraintCall__Group__111802);
            rule__ConstraintCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__1"


    // $ANTLR start "rule__ConstraintCall__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5894:1: rule__ConstraintCall__Group__1__Impl : ( ( rule__ConstraintCall__Group_1__0 )? ) ;
    public final void rule__ConstraintCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5898:1: ( ( ( rule__ConstraintCall__Group_1__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5899:1: ( ( rule__ConstraintCall__Group_1__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5899:1: ( ( rule__ConstraintCall__Group_1__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5900:1: ( rule__ConstraintCall__Group_1__0 )?
            {
             before(grammarAccess.getConstraintCallAccess().getGroup_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5901:1: ( rule__ConstraintCall__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5901:2: rule__ConstraintCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintCall__Group_1__0_in_rule__ConstraintCall__Group__1__Impl11829);
                    rule__ConstraintCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__1__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5915:1: rule__ConstraintCall__Group_1__0 : rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1 ;
    public final void rule__ConstraintCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5919:1: ( rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5920:2: rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__0__Impl_in_rule__ConstraintCall__Group_1__011864);
            rule__ConstraintCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__1_in_rule__ConstraintCall__Group_1__011867);
            rule__ConstraintCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__0"


    // $ANTLR start "rule__ConstraintCall__Group_1__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5927:1: rule__ConstraintCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstraintCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5931:1: ( ( '(' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5932:1: ( '(' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5932:1: ( '(' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5933:1: '('
            {
             before(grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ConstraintCall__Group_1__0__Impl11895); 
             after(grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5946:1: rule__ConstraintCall__Group_1__1 : rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2 ;
    public final void rule__ConstraintCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5950:1: ( rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5951:2: rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__1__Impl_in_rule__ConstraintCall__Group_1__111926);
            rule__ConstraintCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__2_in_rule__ConstraintCall__Group_1__111929);
            rule__ConstraintCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__1"


    // $ANTLR start "rule__ConstraintCall__Group_1__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5958:1: rule__ConstraintCall__Group_1__1__Impl : ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) ) ;
    public final void rule__ConstraintCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5962:1: ( ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5963:1: ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5963:1: ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5964:1: ( rule__ConstraintCall__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5965:1: ( rule__ConstraintCall__ParamsAssignment_1_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5965:2: rule__ConstraintCall__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ParamsAssignment_1_1_in_rule__ConstraintCall__Group_1__1__Impl11956);
            rule__ConstraintCall__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5975:1: rule__ConstraintCall__Group_1__2 : rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3 ;
    public final void rule__ConstraintCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5979:1: ( rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5980:2: rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__2__Impl_in_rule__ConstraintCall__Group_1__211986);
            rule__ConstraintCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__3_in_rule__ConstraintCall__Group_1__211989);
            rule__ConstraintCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__2"


    // $ANTLR start "rule__ConstraintCall__Group_1__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5987:1: rule__ConstraintCall__Group_1__2__Impl : ( ( rule__ConstraintCall__Group_1_2__0 )* ) ;
    public final void rule__ConstraintCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5991:1: ( ( ( rule__ConstraintCall__Group_1_2__0 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5992:1: ( ( rule__ConstraintCall__Group_1_2__0 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5992:1: ( ( rule__ConstraintCall__Group_1_2__0 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5993:1: ( rule__ConstraintCall__Group_1_2__0 )*
            {
             before(grammarAccess.getConstraintCallAccess().getGroup_1_2()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5994:1: ( rule__ConstraintCall__Group_1_2__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==29) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:5994:2: rule__ConstraintCall__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__0_in_rule__ConstraintCall__Group_1__2__Impl12016);
            	    rule__ConstraintCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getConstraintCallAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__2__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6004:1: rule__ConstraintCall__Group_1__3 : rule__ConstraintCall__Group_1__3__Impl ;
    public final void rule__ConstraintCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6008:1: ( rule__ConstraintCall__Group_1__3__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6009:2: rule__ConstraintCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__3__Impl_in_rule__ConstraintCall__Group_1__312047);
            rule__ConstraintCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__3"


    // $ANTLR start "rule__ConstraintCall__Group_1__3__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6015:1: rule__ConstraintCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstraintCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6019:1: ( ( ')' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6020:1: ( ')' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6020:1: ( ')' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6021:1: ')'
            {
             before(grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,28,FOLLOW_28_in_rule__ConstraintCall__Group_1__3__Impl12075); 
             after(grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__3__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6042:1: rule__ConstraintCall__Group_1_2__0 : rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1 ;
    public final void rule__ConstraintCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6046:1: ( rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6047:2: rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__0__Impl_in_rule__ConstraintCall__Group_1_2__012114);
            rule__ConstraintCall__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__1_in_rule__ConstraintCall__Group_1_2__012117);
            rule__ConstraintCall__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__0"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6054:1: rule__ConstraintCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstraintCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6058:1: ( ( ',' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6059:1: ( ',' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6059:1: ( ',' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6060:1: ','
            {
             before(grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__ConstraintCall__Group_1_2__0__Impl12145); 
             after(grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6073:1: rule__ConstraintCall__Group_1_2__1 : rule__ConstraintCall__Group_1_2__1__Impl ;
    public final void rule__ConstraintCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6077:1: ( rule__ConstraintCall__Group_1_2__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6078:2: rule__ConstraintCall__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__1__Impl_in_rule__ConstraintCall__Group_1_2__112176);
            rule__ConstraintCall__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__1"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6084:1: rule__ConstraintCall__Group_1_2__1__Impl : ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__ConstraintCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6088:1: ( ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6089:1: ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6089:1: ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6090:1: ( rule__ConstraintCall__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_2_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6091:1: ( rule__ConstraintCall__ParamsAssignment_1_2_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6091:2: rule__ConstraintCall__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ParamsAssignment_1_2_1_in_rule__ConstraintCall__Group_1_2__1__Impl12203);
            rule__ConstraintCall__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6105:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6109:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6110:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__012237);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__012240);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6117:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6121:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6122:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6122:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6123:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl12267); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6134:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6138:1: ( rule__FQN__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6139:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__112296);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6145:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6149:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6150:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6150:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6151:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6152:1: ( rule__FQN__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==44) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==RULE_ID) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6152:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl12323);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6166:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6170:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6171:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__012358);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__012361);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6178:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6182:1: ( ( '.' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6183:1: ( '.' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6183:1: ( '.' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6184:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__FQN__Group_1__0__Impl12389); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6197:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6201:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6202:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__112420);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6208:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6212:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6213:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6213:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6214:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl12447); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6229:1: rule__FQNWithWildcard__Group__0 : rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 ;
    public final void rule__FQNWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6233:1: ( rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6234:2: rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__012480);
            rule__FQNWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__012483);
            rule__FQNWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__0"


    // $ANTLR start "rule__FQNWithWildcard__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6241:1: rule__FQNWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6245:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6246:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6246:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6247:1: ruleFQN
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl12510);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6258:1: rule__FQNWithWildcard__Group__1 : rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 ;
    public final void rule__FQNWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6262:1: ( rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6263:2: rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__112539);
            rule__FQNWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__112542);
            rule__FQNWithWildcard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__1"


    // $ANTLR start "rule__FQNWithWildcard__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6270:1: rule__FQNWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__FQNWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6274:1: ( ( '.' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6275:1: ( '.' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6275:1: ( '.' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6276:1: '.'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__FQNWithWildcard__Group__1__Impl12570); 
             after(grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6289:1: rule__FQNWithWildcard__Group__2 : rule__FQNWithWildcard__Group__2__Impl ;
    public final void rule__FQNWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6293:1: ( rule__FQNWithWildcard__Group__2__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6294:2: rule__FQNWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__212601);
            rule__FQNWithWildcard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__2"


    // $ANTLR start "rule__FQNWithWildcard__Group__2__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6300:1: rule__FQNWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__FQNWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6304:1: ( ( '*' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6305:1: ( '*' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6305:1: ( '*' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6306:1: '*'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__FQNWithWildcard__Group__2__Impl12629); 
             after(grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6325:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6329:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6330:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__012666);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__012669);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6337:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6341:1: ( ( () ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6342:1: ( () )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6342:1: ( () )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6343:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6344:1: ()
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6346:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6356:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6360:1: ( rule__BooleanLiteral__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6361:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__112727);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6367:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6371:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6372:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6372:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6373:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6374:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6374:2: rule__BooleanLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl12754);
            rule__BooleanLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__NullLiteral__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6388:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6392:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6393:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__012788);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__012791);
            rule__NullLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0"


    // $ANTLR start "rule__NullLiteral__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6400:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6404:1: ( ( () ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6405:1: ( () )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6405:1: ( () )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6406:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6407:1: ()
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6409:1: 
            {
            }

             after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0__Impl"


    // $ANTLR start "rule__NullLiteral__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6419:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6423:1: ( rule__NullLiteral__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6424:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__112849);
            rule__NullLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1"


    // $ANTLR start "rule__NullLiteral__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6430:1: rule__NullLiteral__Group__1__Impl : ( ( rule__NullLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6434:1: ( ( ( rule__NullLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6435:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6435:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6436:1: ( rule__NullLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNullLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6437:1: ( rule__NullLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6437:2: rule__NullLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl12876);
            rule__NullLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6451:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6455:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6456:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__012910);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__012913);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6463:1: rule__NumberLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6467:1: ( ( () ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6468:1: ( () )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6468:1: ( () )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6469:1: ()
            {
             before(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6470:1: ()
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6472:1: 
            {
            }

             after(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6482:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6486:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6487:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__112971);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6493:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6497:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6498:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6498:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6499:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6500:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6500:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl12998);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6514:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6518:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6519:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013032);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013035);
            rule__StringLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6526:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6530:1: ( ( () ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6531:1: ( () )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6531:1: ( () )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6532:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6533:1: ()
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6535:1: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6545:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6549:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6550:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113093);
            rule__StringLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6556:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6560:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6561:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6561:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6562:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6563:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6563:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13120);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6577:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6581:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6582:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__013154);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__013157);
            rule__Number__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6589:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6593:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6594:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6594:1: ( ( rule__Number__Alternatives_1_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6595:1: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6596:1: ( rule__Number__Alternatives_1_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6596:2: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl13184);
            rule__Number__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6606:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6610:1: ( rule__Number__Group_1__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6611:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__113214);
            rule__Number__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6617:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6621:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6622:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6622:1: ( ( rule__Number__Group_1_1__0 )? )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6623:1: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6624:1: ( rule__Number__Group_1_1__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==44) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6624:2: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl13241);
                    rule__Number__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Number__Group_1_1__0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6638:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6642:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6643:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__013276);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__013279);
            rule__Number__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0"


    // $ANTLR start "rule__Number__Group_1_1__0__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6650:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6654:1: ( ( '.' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6655:1: ( '.' )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6655:1: ( '.' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6656:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Number__Group_1_1__0__Impl13307); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1_1__1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6669:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6673:1: ( rule__Number__Group_1_1__1__Impl )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6674:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__113338);
            rule__Number__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1"


    // $ANTLR start "rule__Number__Group_1_1__1__Impl"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6680:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6684:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6685:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6685:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6686:1: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6687:1: ( rule__Number__Alternatives_1_1_1 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6687:2: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl13365);
            rule__Number__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1__Impl"


    // $ANTLR start "rule__DomainModel__NamespaceAssignment"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6702:1: rule__DomainModel__NamespaceAssignment : ( ruleNamespace ) ;
    public final void rule__DomainModel__NamespaceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6706:1: ( ( ruleNamespace ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6707:1: ( ruleNamespace )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6707:1: ( ruleNamespace )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6708:1: ruleNamespace
            {
             before(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__DomainModel__NamespaceAssignment13404);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__NamespaceAssignment"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6717:1: rule__Namespace__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6721:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6722:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6722:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6723:1: ruleFQN
            {
             before(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_113435);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Namespace__ImportsAssignment_3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6732:1: rule__Namespace__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6736:1: ( ( ruleImport ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6737:1: ( ruleImport )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6737:1: ( ruleImport )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6738:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_313466);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ImportsAssignment_3"


    // $ANTLR start "rule__Namespace__ElementsAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6747:1: rule__Namespace__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__Namespace__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6751:1: ( ( ruleAbstractElement ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6752:1: ( ruleAbstractElement )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6752:1: ( ruleAbstractElement )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6753:1: ruleAbstractElement
            {
             before(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_413497);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ElementsAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6762:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6766:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6767:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6767:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6768:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6769:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6769:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_113528);
            rule__Import__ImportedNamespaceAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ExternalType__NameAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6778:1: rule__ExternalType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6782:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6783:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6783:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6784:1: RULE_ID
            {
             before(grammarAccess.getExternalTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalType__NameAssignment_113561); 
             after(grammarAccess.getExternalTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalType__NameAssignment_1"


    // $ANTLR start "rule__Constraint__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6793:1: rule__Constraint__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Constraint__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6797:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6798:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6798:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6799:1: RULE_DOC
            {
             before(grammarAccess.getConstraintAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Constraint__DocAssignment_013592); 
             after(grammarAccess.getConstraintAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__DocAssignment_0"


    // $ANTLR start "rule__Constraint__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6808:1: rule__Constraint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6812:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6813:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6813:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6814:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_213623); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_2"


    // $ANTLR start "rule__Constraint__TargetAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6823:1: rule__Constraint__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6827:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6828:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6828:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6829:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getTargetConstraintTargetCrossReference_4_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6830:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6831:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getTargetConstraintTargetIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__TargetAssignment_413658); 
             after(grammarAccess.getConstraintAccess().getTargetConstraintTargetIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getTargetConstraintTargetCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__TargetAssignment_4"


    // $ANTLR start "rule__Constraint__ExceptionAssignment_5_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6842:1: rule__Constraint__ExceptionAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Constraint__ExceptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6846:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6847:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6847:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6848:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getExceptionIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__ExceptionAssignment_5_113693); 
             after(grammarAccess.getConstraintAccess().getExceptionIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExceptionAssignment_5_1"


    // $ANTLR start "rule__Constraint__VariablesAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6857:1: rule__Constraint__VariablesAssignment_7 : ( ruleVariable ) ;
    public final void rule__Constraint__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6861:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6862:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6862:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6863:1: ruleVariable
            {
             before(grammarAccess.getConstraintAccess().getVariablesVariableParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Constraint__VariablesAssignment_713724);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getVariablesVariableParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__VariablesAssignment_7"


    // $ANTLR start "rule__Constraint__MessageAssignment_8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6872:1: rule__Constraint__MessageAssignment_8 : ( ruleMessage ) ;
    public final void rule__Constraint__MessageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6876:1: ( ( ruleMessage ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6877:1: ( ruleMessage )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6877:1: ( ruleMessage )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6878:1: ruleMessage
            {
             before(grammarAccess.getConstraintAccess().getMessageMessageParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Constraint__MessageAssignment_813755);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getMessageMessageParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__MessageAssignment_8"


    // $ANTLR start "rule__ValueObject__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6887:1: rule__ValueObject__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__ValueObject__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6891:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6892:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6892:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6893:1: RULE_DOC
            {
             before(grammarAccess.getValueObjectAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__ValueObject__DocAssignment_013786); 
             after(grammarAccess.getValueObjectAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__DocAssignment_0"


    // $ANTLR start "rule__ValueObject__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6902:1: rule__ValueObject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ValueObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6906:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6907:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6907:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6908:1: RULE_ID
            {
             before(grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValueObject__NameAssignment_213817); 
             after(grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__NameAssignment_2"


    // $ANTLR start "rule__ValueObject__MetaInfoAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6917:1: rule__ValueObject__MetaInfoAssignment_4 : ( ruleTypeMetaInfo ) ;
    public final void rule__ValueObject__MetaInfoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6921:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6922:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6922:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6923:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__ValueObject__MetaInfoAssignment_413848);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__MetaInfoAssignment_4"


    // $ANTLR start "rule__ValueObject__VariablesAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6932:1: rule__ValueObject__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__ValueObject__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6936:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6937:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6937:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6938:1: ruleVariable
            {
             before(grammarAccess.getValueObjectAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__ValueObject__VariablesAssignment_513879);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__VariablesAssignment_5"


    // $ANTLR start "rule__ValueObject__ConstructorsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6947:1: rule__ValueObject__ConstructorsAssignment_6 : ( ruleConstructor ) ;
    public final void rule__ValueObject__ConstructorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6951:1: ( ( ruleConstructor ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6952:1: ( ruleConstructor )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6952:1: ( ruleConstructor )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6953:1: ruleConstructor
            {
             before(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__ValueObject__ConstructorsAssignment_613910);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__ConstructorsAssignment_6"


    // $ANTLR start "rule__ValueObject__MethodsAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6962:1: rule__ValueObject__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__ValueObject__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6966:1: ( ( ruleMethod ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6967:1: ( ruleMethod )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6967:1: ( ruleMethod )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6968:1: ruleMethod
            {
             before(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__ValueObject__MethodsAssignment_713941);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__MethodsAssignment_7"


    // $ANTLR start "rule__EnumObject__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6977:1: rule__EnumObject__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumObject__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6981:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6982:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6982:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6983:1: RULE_DOC
            {
             before(grammarAccess.getEnumObjectAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__EnumObject__DocAssignment_013972); 
             after(grammarAccess.getEnumObjectAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__DocAssignment_0"


    // $ANTLR start "rule__EnumObject__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6992:1: rule__EnumObject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6996:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6997:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6997:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:6998:1: RULE_ID
            {
             before(grammarAccess.getEnumObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumObject__NameAssignment_214003); 
             after(grammarAccess.getEnumObjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__NameAssignment_2"


    // $ANTLR start "rule__EnumObject__MetaInfoAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7007:1: rule__EnumObject__MetaInfoAssignment_4 : ( ruleTypeMetaInfo ) ;
    public final void rule__EnumObject__MetaInfoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7011:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7012:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7012:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7013:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__EnumObject__MetaInfoAssignment_414034);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getEnumObjectAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__MetaInfoAssignment_4"


    // $ANTLR start "rule__EnumObject__VariablesAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7022:1: rule__EnumObject__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__EnumObject__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7026:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7027:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7027:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7028:1: ruleVariable
            {
             before(grammarAccess.getEnumObjectAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__EnumObject__VariablesAssignment_514065);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getEnumObjectAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__VariablesAssignment_5"


    // $ANTLR start "rule__EnumObject__ConstructorsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7037:1: rule__EnumObject__ConstructorsAssignment_6 : ( ruleConstructor ) ;
    public final void rule__EnumObject__ConstructorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7041:1: ( ( ruleConstructor ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7042:1: ( ruleConstructor )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7042:1: ( ruleConstructor )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7043:1: ruleConstructor
            {
             before(grammarAccess.getEnumObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__EnumObject__ConstructorsAssignment_614096);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getEnumObjectAccess().getConstructorsConstructorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__ConstructorsAssignment_6"


    // $ANTLR start "rule__EnumObject__MethodsAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7052:1: rule__EnumObject__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__EnumObject__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7056:1: ( ( ruleMethod ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7057:1: ( ruleMethod )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7057:1: ( ruleMethod )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7058:1: ruleMethod
            {
             before(grammarAccess.getEnumObjectAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__EnumObject__MethodsAssignment_714127);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getEnumObjectAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__MethodsAssignment_7"


    // $ANTLR start "rule__EnumObject__InstancesAssignment_10"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7067:1: rule__EnumObject__InstancesAssignment_10 : ( ruleEnumInstance ) ;
    public final void rule__EnumObject__InstancesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7071:1: ( ( ruleEnumInstance ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7072:1: ( ruleEnumInstance )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7072:1: ( ruleEnumInstance )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7073:1: ruleEnumInstance
            {
             before(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_rule__EnumObject__InstancesAssignment_1014158);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumObjectAccess().getInstancesEnumInstanceParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumObject__InstancesAssignment_10"


    // $ANTLR start "rule__EnumInstance__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7082:1: rule__EnumInstance__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__EnumInstance__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7086:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7087:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7087:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7088:1: RULE_DOC
            {
             before(grammarAccess.getEnumInstanceAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__EnumInstance__DocAssignment_014189); 
             after(grammarAccess.getEnumInstanceAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__DocAssignment_0"


    // $ANTLR start "rule__EnumInstance__NameAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7097:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7101:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7102:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7102:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7103:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_114220); 
             after(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__NameAssignment_1"


    // $ANTLR start "rule__EnumInstance__ParamsAssignment_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7112:1: rule__EnumInstance__ParamsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__EnumInstance__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7116:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7117:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7117:1: ( ruleLiteral )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7118:1: ruleLiteral
            {
             before(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__EnumInstance__ParamsAssignment_2_114251);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__ParamsAssignment_2_1"


    // $ANTLR start "rule__EnumInstance__ParamsAssignment_2_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7127:1: rule__EnumInstance__ParamsAssignment_2_2_1 : ( ruleLiteral ) ;
    public final void rule__EnumInstance__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7131:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7132:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7132:1: ( ruleLiteral )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7133:1: ruleLiteral
            {
             before(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__EnumInstance__ParamsAssignment_2_2_114282);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getEnumInstanceAccess().getParamsLiteralParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__Entity__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7142:1: rule__Entity__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Entity__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7146:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7147:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7147:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7148:1: RULE_DOC
            {
             before(grammarAccess.getEntityAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Entity__DocAssignment_014313); 
             after(grammarAccess.getEntityAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DocAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7157:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7161:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7162:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7162:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7163:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_214344); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__MetaInfoAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7172:1: rule__Entity__MetaInfoAssignment_4 : ( ruleTypeMetaInfo ) ;
    public final void rule__Entity__MetaInfoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7176:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7177:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7177:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7178:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__Entity__MetaInfoAssignment_414375);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__MetaInfoAssignment_4"


    // $ANTLR start "rule__Entity__VariablesAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7187:1: rule__Entity__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__Entity__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7191:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7192:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7192:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7193:1: ruleVariable
            {
             before(grammarAccess.getEntityAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Entity__VariablesAssignment_514406);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__VariablesAssignment_5"


    // $ANTLR start "rule__Entity__ConstructorsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7202:1: rule__Entity__ConstructorsAssignment_6 : ( ruleConstructor ) ;
    public final void rule__Entity__ConstructorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7206:1: ( ( ruleConstructor ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7207:1: ( ruleConstructor )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7207:1: ( ruleConstructor )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7208:1: ruleConstructor
            {
             before(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__Entity__ConstructorsAssignment_614437);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getConstructorsConstructorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ConstructorsAssignment_6"


    // $ANTLR start "rule__Entity__MethodsAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7217:1: rule__Entity__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__Entity__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7221:1: ( ( ruleMethod ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7222:1: ( ruleMethod )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7222:1: ( ruleMethod )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7223:1: ruleMethod
            {
             before(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Entity__MethodsAssignment_714468);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__MethodsAssignment_7"


    // $ANTLR start "rule__Aggregate__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7232:1: rule__Aggregate__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Aggregate__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7236:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7237:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7237:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7238:1: RULE_DOC
            {
             before(grammarAccess.getAggregateAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Aggregate__DocAssignment_014499); 
             after(grammarAccess.getAggregateAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__DocAssignment_0"


    // $ANTLR start "rule__Aggregate__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7247:1: rule__Aggregate__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Aggregate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7251:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7252:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7252:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7253:1: RULE_ID
            {
             before(grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Aggregate__NameAssignment_214530); 
             after(grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__NameAssignment_2"


    // $ANTLR start "rule__Aggregate__MetaInfoAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7262:1: rule__Aggregate__MetaInfoAssignment_4 : ( ruleTypeMetaInfo ) ;
    public final void rule__Aggregate__MetaInfoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7266:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7267:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7267:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7268:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__Aggregate__MetaInfoAssignment_414561);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getAggregateAccess().getMetaInfoTypeMetaInfoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__MetaInfoAssignment_4"


    // $ANTLR start "rule__Aggregate__VariablesAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7277:1: rule__Aggregate__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__Aggregate__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7281:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7282:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7282:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7283:1: ruleVariable
            {
             before(grammarAccess.getAggregateAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Aggregate__VariablesAssignment_514592);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAggregateAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__VariablesAssignment_5"


    // $ANTLR start "rule__Aggregate__ConstructorsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7292:1: rule__Aggregate__ConstructorsAssignment_6 : ( ruleConstructor ) ;
    public final void rule__Aggregate__ConstructorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7296:1: ( ( ruleConstructor ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7297:1: ( ruleConstructor )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7297:1: ( ruleConstructor )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7298:1: ruleConstructor
            {
             before(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__Aggregate__ConstructorsAssignment_614623);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getAggregateAccess().getConstructorsConstructorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__ConstructorsAssignment_6"


    // $ANTLR start "rule__Aggregate__MethodsAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7307:1: rule__Aggregate__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__Aggregate__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7311:1: ( ( ruleMethod ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7312:1: ( ruleMethod )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7312:1: ( ruleMethod )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7313:1: ruleMethod
            {
             before(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Aggregate__MethodsAssignment_714654);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getAggregateAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__MethodsAssignment_7"


    // $ANTLR start "rule__Constructor__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7322:1: rule__Constructor__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Constructor__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7326:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7327:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7327:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7328:1: RULE_DOC
            {
             before(grammarAccess.getConstructorAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Constructor__DocAssignment_014685); 
             after(grammarAccess.getConstructorAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__DocAssignment_0"


    // $ANTLR start "rule__Constructor__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7337:1: rule__Constructor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7341:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7342:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7342:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7343:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_214716); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__NameAssignment_2"


    // $ANTLR start "rule__Constructor__VariablesAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7352:1: rule__Constructor__VariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__Constructor__VariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7356:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7357:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7357:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7358:1: ruleVariable
            {
             before(grammarAccess.getConstructorAccess().getVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Constructor__VariablesAssignment_414747);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__VariablesAssignment_4"


    // $ANTLR start "rule__Constructor__ConstraintsAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7367:1: rule__Constructor__ConstraintsAssignment_5 : ( ruleConstraints ) ;
    public final void rule__Constructor__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7371:1: ( ( ruleConstraints ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7372:1: ( ruleConstraints )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7372:1: ( ruleConstraints )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7373:1: ruleConstraints
            {
             before(grammarAccess.getConstructorAccess().getConstraintsConstraintsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConstraints_in_rule__Constructor__ConstraintsAssignment_514778);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getConstraintsConstraintsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__ConstraintsAssignment_5"


    // $ANTLR start "rule__Constructor__EventsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7382:1: rule__Constructor__EventsAssignment_6 : ( ruleEvent ) ;
    public final void rule__Constructor__EventsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7386:1: ( ( ruleEvent ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7387:1: ( ruleEvent )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7387:1: ( ruleEvent )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7388:1: ruleEvent
            {
             before(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Constructor__EventsAssignment_614809);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getEventsEventParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__EventsAssignment_6"


    // $ANTLR start "rule__Method__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7397:1: rule__Method__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Method__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7401:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7402:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7402:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7403:1: RULE_DOC
            {
             before(grammarAccess.getMethodAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Method__DocAssignment_014840); 
             after(grammarAccess.getMethodAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__DocAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7412:1: rule__Method__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7416:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7417:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7417:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7418:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_214871); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_2"


    // $ANTLR start "rule__Method__RefMethodAssignment_3_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7427:1: rule__Method__RefMethodAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Method__RefMethodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7431:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7432:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7432:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7433:1: ( ruleFQN )
            {
             before(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7434:1: ( ruleFQN )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7435:1: ruleFQN
            {
             before(grammarAccess.getMethodAccess().getRefMethodMethodFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Method__RefMethodAssignment_3_114906);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getRefMethodMethodFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getRefMethodMethodCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__RefMethodAssignment_3_1"


    // $ANTLR start "rule__Method__VariablesAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7446:1: rule__Method__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__Method__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7450:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7451:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7451:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7452:1: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Method__VariablesAssignment_514941);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VariablesAssignment_5"


    // $ANTLR start "rule__Method__ConstraintsAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7461:1: rule__Method__ConstraintsAssignment_6 : ( ruleConstraints ) ;
    public final void rule__Method__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7465:1: ( ( ruleConstraints ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7466:1: ( ruleConstraints )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7466:1: ( ruleConstraints )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7467:1: ruleConstraints
            {
             before(grammarAccess.getMethodAccess().getConstraintsConstraintsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConstraints_in_rule__Method__ConstraintsAssignment_614972);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getConstraintsConstraintsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ConstraintsAssignment_6"


    // $ANTLR start "rule__Method__EventsAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7476:1: rule__Method__EventsAssignment_7 : ( ruleEvent ) ;
    public final void rule__Method__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7480:1: ( ( ruleEvent ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7481:1: ( ruleEvent )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7481:1: ( ruleEvent )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7482:1: ruleEvent
            {
             before(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Method__EventsAssignment_715003);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getEventsEventParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__EventsAssignment_7"


    // $ANTLR start "rule__Event__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7491:1: rule__Event__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Event__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7495:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7496:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7496:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7497:1: RULE_DOC
            {
             before(grammarAccess.getEventAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Event__DocAssignment_015034); 
             after(grammarAccess.getEventAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DocAssignment_0"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7506:1: rule__Event__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7510:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7511:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7511:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7512:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_215065); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__VariablesAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7521:1: rule__Event__VariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__Event__VariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7525:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7526:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7526:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7527:1: ruleVariable
            {
             before(grammarAccess.getEventAccess().getVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Event__VariablesAssignment_415096);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getEventAccess().getVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__VariablesAssignment_4"


    // $ANTLR start "rule__TypeMetaInfo__SlabelAssignment_1_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7536:1: rule__TypeMetaInfo__SlabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__SlabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7540:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7541:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7541:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7542:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_115127); 
             after(grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__SlabelAssignment_1_1"


    // $ANTLR start "rule__TypeMetaInfo__LabelAssignment_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7551:1: rule__TypeMetaInfo__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7555:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7556:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7556:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7557:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_115158); 
             after(grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__LabelAssignment_2_1"


    // $ANTLR start "rule__TypeMetaInfo__TooltippAssignment_3_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7566:1: rule__TypeMetaInfo__TooltippAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__TooltippAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7570:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7571:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7571:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7572:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltippSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltippAssignment_3_115189); 
             after(grammarAccess.getTypeMetaInfoAccess().getTooltippSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__TooltippAssignment_3_1"


    // $ANTLR start "rule__TypeMetaInfo__PromptAssignment_4_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7581:1: rule__TypeMetaInfo__PromptAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__PromptAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7585:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7586:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7586:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7587:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_115220); 
             after(grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__PromptAssignment_4_1"


    // $ANTLR start "rule__TypeMetaInfo__ExamplesAssignment_5_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7596:1: rule__TypeMetaInfo__ExamplesAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__ExamplesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7600:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7601:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7601:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7602:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__ExamplesAssignment_5_115251); 
             after(grammarAccess.getTypeMetaInfoAccess().getExamplesSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__ExamplesAssignment_5_1"


    // $ANTLR start "rule__Variable__DocAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7611:1: rule__Variable__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Variable__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7615:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7616:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7616:1: ( RULE_DOC )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7617:1: RULE_DOC
            {
             before(grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Variable__DocAssignment_015282); 
             after(grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__DocAssignment_0"


    // $ANTLR start "rule__Variable__TechnicalIdAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7626:1: rule__Variable__TechnicalIdAssignment_1 : ( ( 'technicalId' ) ) ;
    public final void rule__Variable__TechnicalIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7630:1: ( ( ( 'technicalId' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7631:1: ( ( 'technicalId' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7631:1: ( ( 'technicalId' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7632:1: ( 'technicalId' )
            {
             before(grammarAccess.getVariableAccess().getTechnicalIdTechnicalIdKeyword_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7633:1: ( 'technicalId' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7634:1: 'technicalId'
            {
             before(grammarAccess.getVariableAccess().getTechnicalIdTechnicalIdKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Variable__TechnicalIdAssignment_115318); 
             after(grammarAccess.getVariableAccess().getTechnicalIdTechnicalIdKeyword_1_0()); 

            }

             after(grammarAccess.getVariableAccess().getTechnicalIdTechnicalIdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TechnicalIdAssignment_1"


    // $ANTLR start "rule__Variable__BusinessKeyAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7649:1: rule__Variable__BusinessKeyAssignment_2 : ( ( 'businessKey' ) ) ;
    public final void rule__Variable__BusinessKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7653:1: ( ( ( 'businessKey' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7654:1: ( ( 'businessKey' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7654:1: ( ( 'businessKey' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7655:1: ( 'businessKey' )
            {
             before(grammarAccess.getVariableAccess().getBusinessKeyBusinessKeyKeyword_2_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7656:1: ( 'businessKey' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7657:1: 'businessKey'
            {
             before(grammarAccess.getVariableAccess().getBusinessKeyBusinessKeyKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__Variable__BusinessKeyAssignment_215362); 
             after(grammarAccess.getVariableAccess().getBusinessKeyBusinessKeyKeyword_2_0()); 

            }

             after(grammarAccess.getVariableAccess().getBusinessKeyBusinessKeyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__BusinessKeyAssignment_2"


    // $ANTLR start "rule__Variable__BusinessNameAssignment_3"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7672:1: rule__Variable__BusinessNameAssignment_3 : ( ( 'businessName' ) ) ;
    public final void rule__Variable__BusinessNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7676:1: ( ( ( 'businessName' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7677:1: ( ( 'businessName' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7677:1: ( ( 'businessName' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7678:1: ( 'businessName' )
            {
             before(grammarAccess.getVariableAccess().getBusinessNameBusinessNameKeyword_3_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7679:1: ( 'businessName' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7680:1: 'businessName'
            {
             before(grammarAccess.getVariableAccess().getBusinessNameBusinessNameKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__Variable__BusinessNameAssignment_315406); 
             after(grammarAccess.getVariableAccess().getBusinessNameBusinessNameKeyword_3_0()); 

            }

             after(grammarAccess.getVariableAccess().getBusinessNameBusinessNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__BusinessNameAssignment_3"


    // $ANTLR start "rule__Variable__NullableAssignment_4"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7695:1: rule__Variable__NullableAssignment_4 : ( ( 'nullable' ) ) ;
    public final void rule__Variable__NullableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7699:1: ( ( ( 'nullable' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7700:1: ( ( 'nullable' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7700:1: ( ( 'nullable' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7701:1: ( 'nullable' )
            {
             before(grammarAccess.getVariableAccess().getNullableNullableKeyword_4_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7702:1: ( 'nullable' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7703:1: 'nullable'
            {
             before(grammarAccess.getVariableAccess().getNullableNullableKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__Variable__NullableAssignment_415450); 
             after(grammarAccess.getVariableAccess().getNullableNullableKeyword_4_0()); 

            }

             after(grammarAccess.getVariableAccess().getNullableNullableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NullableAssignment_4"


    // $ANTLR start "rule__Variable__TypeAssignment_5"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7718:1: rule__Variable__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Variable__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7722:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7723:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7723:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7724:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_5_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7725:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7726:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getTypeTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__TypeAssignment_515493); 
             after(grammarAccess.getVariableAccess().getTypeTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_5"


    // $ANTLR start "rule__Variable__MultiplicityAssignment_6"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7737:1: rule__Variable__MultiplicityAssignment_6 : ( ( '*' ) ) ;
    public final void rule__Variable__MultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7741:1: ( ( ( '*' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7742:1: ( ( '*' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7742:1: ( ( '*' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7743:1: ( '*' )
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_6_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7744:1: ( '*' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7745:1: '*'
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_6_0()); 
            match(input,45,FOLLOW_45_in_rule__Variable__MultiplicityAssignment_615533); 
             after(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_6_0()); 

            }

             after(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__MultiplicityAssignment_6"


    // $ANTLR start "rule__Variable__NameAssignment_7"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7760:1: rule__Variable__NameAssignment_7 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7764:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7765:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7765:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7766:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_715572); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_7"


    // $ANTLR start "rule__Variable__InvariantsAssignment_8"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7775:1: rule__Variable__InvariantsAssignment_8 : ( ruleInvariants ) ;
    public final void rule__Variable__InvariantsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7779:1: ( ( ruleInvariants ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7780:1: ( ruleInvariants )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7780:1: ( ruleInvariants )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7781:1: ruleInvariants
            {
             before(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleInvariants_in_rule__Variable__InvariantsAssignment_815603);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__InvariantsAssignment_8"


    // $ANTLR start "rule__Variable__OverriddenAssignment_9_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7790:1: rule__Variable__OverriddenAssignment_9_0 : ( ruleOverriddenTypeMetaInfo ) ;
    public final void rule__Variable__OverriddenAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7794:1: ( ( ruleOverriddenTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7795:1: ( ruleOverriddenTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7795:1: ( ruleOverriddenTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7796:1: ruleOverriddenTypeMetaInfo
            {
             before(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Variable__OverriddenAssignment_9_015634);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__OverriddenAssignment_9_0"


    // $ANTLR start "rule__Constraints__CallsAssignment_2"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7805:1: rule__Constraints__CallsAssignment_2 : ( ruleConstraintCall ) ;
    public final void rule__Constraints__CallsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7809:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7810:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7810:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7811:1: ruleConstraintCall
            {
             before(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Constraints__CallsAssignment_215665);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__CallsAssignment_2"


    // $ANTLR start "rule__Constraints__CallsAssignment_3_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7820:1: rule__Constraints__CallsAssignment_3_1 : ( ruleConstraintCall ) ;
    public final void rule__Constraints__CallsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7824:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7825:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7825:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7826:1: ruleConstraintCall
            {
             before(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Constraints__CallsAssignment_3_115696);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getCallsConstraintCallParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__CallsAssignment_3_1"


    // $ANTLR start "rule__Invariants__CallsAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7835:1: rule__Invariants__CallsAssignment_1 : ( ruleConstraintCall ) ;
    public final void rule__Invariants__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7839:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7840:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7840:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7841:1: ruleConstraintCall
            {
             before(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_115727);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__CallsAssignment_1"


    // $ANTLR start "rule__Invariants__CallsAssignment_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7850:1: rule__Invariants__CallsAssignment_2_1 : ( ruleConstraintCall ) ;
    public final void rule__Invariants__CallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7854:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7855:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7855:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7856:1: ruleConstraintCall
            {
             before(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_2_115758);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__CallsAssignment_2_1"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7865:1: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 : ( ruleTypeMetaInfo ) ;
    public final void rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7869:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7870:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7870:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7871:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_115789);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1"


    // $ANTLR start "rule__Message__TextAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7880:1: rule__Message__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Message__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7884:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7885:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7885:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7886:1: RULE_STRING
            {
             before(grammarAccess.getMessageAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Message__TextAssignment_115820); 
             after(grammarAccess.getMessageAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__TextAssignment_1"


    // $ANTLR start "rule__Message__VariablesAssignment_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7895:1: rule__Message__VariablesAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__Message__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7899:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7900:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7900:1: ( ruleVariable )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7901:1: ruleVariable
            {
             before(grammarAccess.getMessageAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Message__VariablesAssignment_2_115851);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getVariablesVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__VariablesAssignment_2_1"


    // $ANTLR start "rule__ConstraintCall__ConstraintAssignment_0"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7910:1: rule__ConstraintCall__ConstraintAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintCall__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7914:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7915:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7915:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7916:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7917:1: ( RULE_ID )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7918:1: RULE_ID
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstraintCall__ConstraintAssignment_015886); 
             after(grammarAccess.getConstraintCallAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ConstraintAssignment_0"


    // $ANTLR start "rule__ConstraintCall__ParamsAssignment_1_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7929:1: rule__ConstraintCall__ParamsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintCall__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7933:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7934:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7934:1: ( ruleLiteral )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7935:1: ruleLiteral
            {
             before(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_115921);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ParamsAssignment_1_1"


    // $ANTLR start "rule__ConstraintCall__ParamsAssignment_1_2_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7944:1: rule__ConstraintCall__ParamsAssignment_1_2_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintCall__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7948:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7949:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7949:1: ( ruleLiteral )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7950:1: ruleLiteral
            {
             before(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_2_115952);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7959:1: rule__BooleanLiteral__ValueAssignment_1 : ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7963:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7964:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7964:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7965:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7966:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7966:2: rule__BooleanLiteral__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_115983);
            rule__BooleanLiteral__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__NullLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7975:1: rule__NullLiteral__ValueAssignment_1 : ( ( 'null' ) ) ;
    public final void rule__NullLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7979:1: ( ( ( 'null' ) ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7980:1: ( ( 'null' ) )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7980:1: ( ( 'null' ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7981:1: ( 'null' )
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7982:1: ( 'null' )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7983:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            match(input,50,FOLLOW_50_in_rule__NullLiteral__ValueAssignment_116021); 
             after(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 

            }

             after(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__ValueAssignment_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:7998:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8002:1: ( ( ruleNumber ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8003:1: ( ruleNumber )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8003:1: ( ruleNumber )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8004:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_116060);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8013:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8017:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8018:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8018:1: ( RULE_STRING )
            // ../org.fuin.dsl.ddd.ui/src-gen/org/fuin/dsl/ddd/ui/contentassist/antlr/internal/InternalDomainDrivenDesignDsl.g:8019:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116091); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\1\7\1\15\1\7\1\uffff\1\15\1\uffff";
    static final String DFA1_maxS =
        "\1\7\1\54\1\55\1\uffff\1\54\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\36\uffff\1\2",
            "\1\4\45\uffff\1\5",
            "",
            "\1\3\36\uffff\1\2",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "966:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__NamespaceAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_entryRuleAbstractVO361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractVO368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractVO__Alternatives_in_ruleAbstractVO394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_entryRuleAbstractEntity421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractEntity428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractEntity__Alternatives_in_ruleAbstractEntity454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_entryRuleExternalType483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__0_in_ruleExternalType516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__0_in_ruleValueObject636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_entryRuleEnumObject663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumObject670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__0_in_ruleEnumObject696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__0_in_ruleAggregate876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraints_in_entryRuleConstraints1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraints1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__0_in_ruleConstraints1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0_in_ruleInvariants1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__0_in_ruleConstraintCall1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_02018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__AbstractElement__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalType_in_rule__Type__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractVO_in_rule__Type__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractEntity_in_rule__Type__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__AbstractVO__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumObject_in_rule__AbstractVO__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__AbstractEntity__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_rule__AbstractEntity__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__OverriddenAssignment_9_0_in_rule__Variable__Alternatives_92264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Variable__Alternatives_92284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_1_02422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__Number__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_02523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02602 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Namespace__Group__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12664 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22724 = new BitSet(new long[]{0x00000000001C0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Namespace__Group__2__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32786 = new BitSet(new long[]{0x00000000001C0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2816 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42847 = new BitSet(new long[]{0x00000000001C0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2877 = new BitSet(new long[]{0x0000000000100102L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Namespace__Group__5__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02979 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13041 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__2__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__0__Impl_in_rule__ExternalType__Group__03166 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__1_in_rule__ExternalType__Group__03169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExternalType__Group__0__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__1__Impl_in_rule__ExternalType__Group__13228 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__2_in_rule__ExternalType__Group__13231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalType__NameAssignment_1_in_rule__ExternalType__Group__1__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalType__Group__2__Impl_in_rule__ExternalType__Group__23288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalType__Group__2__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__DocAssignment_0_in_rule__Constraint__Group__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constraint__Group__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23475 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__NameAssignment_2_in_rule__Constraint__Group__2__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__33538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constraint__Group__3__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__43597 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__43600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TargetAssignment_4_in_rule__Constraint__Group__4__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__53657 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__53660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0_in_rule__Constraint__Group__5__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__63718 = new BitSet(new long[]{0x0003C80000000180L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__63721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Constraint__Group__6__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__73780 = new BitSet(new long[]{0x0003C80000000180L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__73783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__VariablesAssignment_7_in_rule__Constraint__Group__7__Impl3810 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__83841 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__83844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__MessageAssignment_8_in_rule__Constraint__Group__8__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__93901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constraint__Group__9__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__0__Impl_in_rule__Constraint__Group_5__03980 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1_in_rule__Constraint__Group_5__03983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group_5__0__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group_5__1__Impl_in_rule__Constraint__Group_5__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ExceptionAssignment_5_1_in_rule__Constraint__Group_5__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__0__Impl_in_rule__ValueObject__Group__04103 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__1_in_rule__ValueObject__Group__04106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__DocAssignment_0_in_rule__ValueObject__Group__0__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__1__Impl_in_rule__ValueObject__Group__14163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__2_in_rule__ValueObject__Group__14166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ValueObject__Group__1__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__2__Impl_in_rule__ValueObject__Group__24225 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__3_in_rule__ValueObject__Group__24228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__NameAssignment_2_in_rule__ValueObject__Group__2__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__3__Impl_in_rule__ValueObject__Group__34285 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__4_in_rule__ValueObject__Group__34288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValueObject__Group__3__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__4__Impl_in_rule__ValueObject__Group__44347 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__5_in_rule__ValueObject__Group__44350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__MetaInfoAssignment_4_in_rule__ValueObject__Group__4__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__5__Impl_in_rule__ValueObject__Group__54407 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__6_in_rule__ValueObject__Group__54410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__VariablesAssignment_5_in_rule__ValueObject__Group__5__Impl4437 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__6__Impl_in_rule__ValueObject__Group__64468 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__7_in_rule__ValueObject__Group__64471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__ConstructorsAssignment_6_in_rule__ValueObject__Group__6__Impl4498 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__7__Impl_in_rule__ValueObject__Group__74529 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__8_in_rule__ValueObject__Group__74532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__MethodsAssignment_7_in_rule__ValueObject__Group__7__Impl4559 = new BitSet(new long[]{0x0000000200000102L});
    public static final BitSet FOLLOW_rule__ValueObject__Group__8__Impl_in_rule__ValueObject__Group__84590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValueObject__Group__8__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__0__Impl_in_rule__EnumObject__Group__04667 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__1_in_rule__EnumObject__Group__04670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__DocAssignment_0_in_rule__EnumObject__Group__0__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__1__Impl_in_rule__EnumObject__Group__14727 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__2_in_rule__EnumObject__Group__14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumObject__Group__1__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__2__Impl_in_rule__EnumObject__Group__24789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__3_in_rule__EnumObject__Group__24792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__NameAssignment_2_in_rule__EnumObject__Group__2__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__3__Impl_in_rule__EnumObject__Group__34849 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__4_in_rule__EnumObject__Group__34852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumObject__Group__3__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__4__Impl_in_rule__EnumObject__Group__44911 = new BitSet(new long[]{0x0003C00304000180L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__5_in_rule__EnumObject__Group__44914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__MetaInfoAssignment_4_in_rule__EnumObject__Group__4__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__5__Impl_in_rule__EnumObject__Group__54971 = new BitSet(new long[]{0x0003C00304000180L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__6_in_rule__EnumObject__Group__54974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__VariablesAssignment_5_in_rule__EnumObject__Group__5__Impl5001 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__6__Impl_in_rule__EnumObject__Group__65032 = new BitSet(new long[]{0x0003C00304000180L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__7_in_rule__EnumObject__Group__65035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__ConstructorsAssignment_6_in_rule__EnumObject__Group__6__Impl5062 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__7__Impl_in_rule__EnumObject__Group__75093 = new BitSet(new long[]{0x0003C00304000180L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__8_in_rule__EnumObject__Group__75096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__MethodsAssignment_7_in_rule__EnumObject__Group__7__Impl5123 = new BitSet(new long[]{0x0000000200000102L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__8__Impl_in_rule__EnumObject__Group__85154 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__9_in_rule__EnumObject__Group__85157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumObject__Group__8__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__9__Impl_in_rule__EnumObject__Group__95216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__10_in_rule__EnumObject__Group__95219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumObject__Group__9__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__10__Impl_in_rule__EnumObject__Group__105278 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__11_in_rule__EnumObject__Group__105281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__InstancesAssignment_10_in_rule__EnumObject__Group__10__Impl5310 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__EnumObject__InstancesAssignment_10_in_rule__EnumObject__Group__10__Impl5322 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__11__Impl_in_rule__EnumObject__Group__115355 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__12_in_rule__EnumObject__Group__115358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumObject__Group__11__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumObject__Group__12__Impl_in_rule__EnumObject__Group__125417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumObject__Group__12__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05502 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__DocAssignment_0_in_rule__EnumInstance__Group__0__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15562 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25622 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__0_in_rule__EnumInstance__Group__2__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumInstance__Group__3__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__0__Impl_in_rule__EnumInstance__Group_2__05750 = new BitSet(new long[]{0x000400000000C270L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__1_in_rule__EnumInstance__Group_2__05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumInstance__Group_2__0__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__1__Impl_in_rule__EnumInstance__Group_2__15812 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__2_in_rule__EnumInstance__Group_2__15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ParamsAssignment_2_1_in_rule__EnumInstance__Group_2__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__2__Impl_in_rule__EnumInstance__Group_2__25872 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__3_in_rule__EnumInstance__Group_2__25875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2_2__0_in_rule__EnumInstance__Group_2__2__Impl5902 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2__3__Impl_in_rule__EnumInstance__Group_2__35933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumInstance__Group_2__3__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2_2__0__Impl_in_rule__EnumInstance__Group_2_2__06000 = new BitSet(new long[]{0x000400000000C270L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2_2__1_in_rule__EnumInstance__Group_2_2__06003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumInstance__Group_2_2__0__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_2_2__1__Impl_in_rule__EnumInstance__Group_2_2__16062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ParamsAssignment_2_2_1_in_rule__EnumInstance__Group_2_2__1__Impl6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DocAssignment_0_in_rule__Entity__Group__0__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16183 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Entity__Group__1__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36305 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__3__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46367 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__MetaInfoAssignment_4_in_rule__Entity__Group__4__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56427 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__56430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__VariablesAssignment_5_in_rule__Entity__Group__5__Impl6457 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__66488 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__66491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ConstructorsAssignment_6_in_rule__Entity__Group__6__Impl6518 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__76549 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__76552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__MethodsAssignment_7_in_rule__Entity__Group__7__Impl6579 = new BitSet(new long[]{0x0000000200000102L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__86610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__0__Impl_in_rule__Aggregate__Group__06687 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__1_in_rule__Aggregate__Group__06690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__DocAssignment_0_in_rule__Aggregate__Group__0__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__1__Impl_in_rule__Aggregate__Group__16747 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__2_in_rule__Aggregate__Group__16750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Aggregate__Group__1__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__2__Impl_in_rule__Aggregate__Group__26809 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__3_in_rule__Aggregate__Group__26812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__NameAssignment_2_in_rule__Aggregate__Group__2__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__3__Impl_in_rule__Aggregate__Group__36869 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__4_in_rule__Aggregate__Group__36872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Aggregate__Group__3__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__4__Impl_in_rule__Aggregate__Group__46931 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__5_in_rule__Aggregate__Group__46934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__MetaInfoAssignment_4_in_rule__Aggregate__Group__4__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__5__Impl_in_rule__Aggregate__Group__56991 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__6_in_rule__Aggregate__Group__56994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__VariablesAssignment_5_in_rule__Aggregate__Group__5__Impl7021 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__6__Impl_in_rule__Aggregate__Group__67052 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__7_in_rule__Aggregate__Group__67055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__ConstructorsAssignment_6_in_rule__Aggregate__Group__6__Impl7082 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__7__Impl_in_rule__Aggregate__Group__77113 = new BitSet(new long[]{0x0003C00300040180L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__8_in_rule__Aggregate__Group__77116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aggregate__MethodsAssignment_7_in_rule__Aggregate__Group__7__Impl7143 = new BitSet(new long[]{0x0000000200000102L});
    public static final BitSet FOLLOW_rule__Aggregate__Group__8__Impl_in_rule__Aggregate__Group__87174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Aggregate__Group__8__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__07251 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__07254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__DocAssignment_0_in_rule__Constructor__Group__0__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__17312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__17315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Constructor__Group__1__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__27374 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__27377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__NameAssignment_2_in_rule__Constructor__Group__2__Impl7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__37434 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__37437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Constructor__Group__3__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__47496 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__47499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__VariablesAssignment_4_in_rule__Constructor__Group__4__Impl7526 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__57557 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__57560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ConstraintsAssignment_5_in_rule__Constructor__Group__5__Impl7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__67618 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__67621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__EventsAssignment_6_in_rule__Constructor__Group__6__Impl7648 = new BitSet(new long[]{0x0000000800000102L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__77679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constructor__Group__7__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__07754 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__07757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__DocAssignment_0_in_rule__Method__Group__0__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__17815 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Method__Group__1__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__27877 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__27880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__37937 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__37940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__47998 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__48001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Method__Group__4__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__58060 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__58063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__VariablesAssignment_5_in_rule__Method__Group__5__Impl8090 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__68121 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Method__Group__7_in_rule__Method__Group__68124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ConstraintsAssignment_6_in_rule__Method__Group__6__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__78182 = new BitSet(new long[]{0x0003C20800040180L});
    public static final BitSet FOLLOW_rule__Method__Group__8_in_rule__Method__Group__78185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__EventsAssignment_7_in_rule__Method__Group__7__Impl8212 = new BitSet(new long[]{0x0000000800000102L});
    public static final BitSet FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__88243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__8__Impl8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__08320 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__08323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Method__Group_3__0__Impl8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__18382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__RefMethodAssignment_3_1_in_rule__Method__Group_3__1__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__08443 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__08446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__DocAssignment_0_in_rule__Event__Group__0__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__18504 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__18507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Event__Group__1__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__28566 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__28569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__38626 = new BitSet(new long[]{0x0003C00000040180L});
    public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__38629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Event__Group__3__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__48688 = new BitSet(new long[]{0x0003C00000040180L});
    public static final BitSet FOLLOW_rule__Event__Group__5_in_rule__Event__Group__48691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__VariablesAssignment_4_in_rule__Event__Group__4__Impl8718 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__58749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Event__Group__5__Impl8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__08820 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__08823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__18881 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__18884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__28942 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__28945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__39003 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__39006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__49064 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__49067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__59125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__09195 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__09198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeMetaInfo__Group_1__0__Impl9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__19257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__09318 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__09321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeMetaInfo__Group_2__0__Impl9349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__19380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__09441 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__09444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeMetaInfo__Group_3__0__Impl9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__19503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__TooltippAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__09564 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__09567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeMetaInfo__Group_4__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__19626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__09687 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__09690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeMetaInfo__Group_5__0__Impl9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl9776 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__09811 = new BitSet(new long[]{0x0003C00000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__09814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__DocAssignment_0_in_rule__Variable__Group__0__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__19872 = new BitSet(new long[]{0x0003C00000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__19875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TechnicalIdAssignment_1_in_rule__Variable__Group__1__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__29933 = new BitSet(new long[]{0x0003C00000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__29936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__BusinessKeyAssignment_2_in_rule__Variable__Group__2__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__39994 = new BitSet(new long[]{0x0003C00000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__39997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__BusinessNameAssignment_3_in_rule__Variable__Group__3__Impl10024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__410055 = new BitSet(new long[]{0x0003C00000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__410058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NullableAssignment_4_in_rule__Variable__Group__4__Impl10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__510116 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group__6_in_rule__Variable__Group__510119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_5_in_rule__Variable__Group__5__Impl10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__6__Impl_in_rule__Variable__Group__610176 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group__7_in_rule__Variable__Group__610179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__MultiplicityAssignment_6_in_rule__Variable__Group__6__Impl10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__7__Impl_in_rule__Variable__Group__710237 = new BitSet(new long[]{0x0000040000022000L});
    public static final BitSet FOLLOW_rule__Variable__Group__8_in_rule__Variable__Group__710240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_7_in_rule__Variable__Group__7__Impl10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__8__Impl_in_rule__Variable__Group__810297 = new BitSet(new long[]{0x0000040000022000L});
    public static final BitSet FOLLOW_rule__Variable__Group__9_in_rule__Variable__Group__810300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InvariantsAssignment_8_in_rule__Variable__Group__8__Impl10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__9__Impl_in_rule__Variable__Group__910358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_9_in_rule__Variable__Group__9__Impl10385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__0__Impl_in_rule__Constraints__Group__010435 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Constraints__Group__1_in_rule__Constraints__Group__010438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Constraints__Group__0__Impl10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__1__Impl_in_rule__Constraints__Group__110497 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constraints__Group__2_in_rule__Constraints__Group__110500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Constraints__Group__1__Impl10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__2__Impl_in_rule__Constraints__Group__210559 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_rule__Constraints__Group__3_in_rule__Constraints__Group__210562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__CallsAssignment_2_in_rule__Constraints__Group__2__Impl10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__3__Impl_in_rule__Constraints__Group__310619 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_rule__Constraints__Group__4_in_rule__Constraints__Group__310622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group_3__0_in_rule__Constraints__Group__3__Impl10649 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group__4__Impl_in_rule__Constraints__Group__410680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constraints__Group__4__Impl10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group_3__0__Impl_in_rule__Constraints__Group_3__010749 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constraints__Group_3__1_in_rule__Constraints__Group_3__010752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constraints__Group_3__0__Impl10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__Group_3__1__Impl_in_rule__Constraints__Group_3__110811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraints__CallsAssignment_3_1_in_rule__Constraints__Group_3__1__Impl10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__010872 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__010875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Invariants__Group__0__Impl10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__110934 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__110937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__CallsAssignment_1_in_rule__Invariants__Group__1__Impl10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__210994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl11021 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__011058 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__011061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Invariants__Group_2__0__Impl11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__111120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__CallsAssignment_2_1_in_rule__Invariants__Group_2__1__Impl11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__011181 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__011184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OverriddenTypeMetaInfo__Group__0__Impl11212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__111243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__111246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__211303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OverriddenTypeMetaInfo__Group__2__Impl11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__011368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__011371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Message__Group__0__Impl11399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__111430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__111433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__TextAssignment_1_in_rule__Message__Group__1__Impl11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__211490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_2__0_in_rule__Message__Group__2__Impl11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_2__0__Impl_in_rule__Message__Group_2__011554 = new BitSet(new long[]{0x0003C00000040180L});
    public static final BitSet FOLLOW_rule__Message__Group_2__1_in_rule__Message__Group_2__011557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Message__Group_2__0__Impl11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_2__1__Impl_in_rule__Message__Group_2__111616 = new BitSet(new long[]{0x0003C00000040180L});
    public static final BitSet FOLLOW_rule__Message__Group_2__2_in_rule__Message__Group_2__111619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__VariablesAssignment_2_1_in_rule__Message__Group_2__1__Impl11646 = new BitSet(new long[]{0x0003C00000000182L});
    public static final BitSet FOLLOW_rule__Message__Group_2__2__Impl_in_rule__Message__Group_2__211677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group_2__2__Impl11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__0__Impl_in_rule__ConstraintCall__Group__011742 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__1_in_rule__ConstraintCall__Group__011745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ConstraintAssignment_0_in_rule__ConstraintCall__Group__0__Impl11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__1__Impl_in_rule__ConstraintCall__Group__111802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__0_in_rule__ConstraintCall__Group__1__Impl11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__0__Impl_in_rule__ConstraintCall__Group_1__011864 = new BitSet(new long[]{0x000400000000C270L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__1_in_rule__ConstraintCall__Group_1__011867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ConstraintCall__Group_1__0__Impl11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__1__Impl_in_rule__ConstraintCall__Group_1__111926 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__2_in_rule__ConstraintCall__Group_1__111929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ParamsAssignment_1_1_in_rule__ConstraintCall__Group_1__1__Impl11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__2__Impl_in_rule__ConstraintCall__Group_1__211986 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__3_in_rule__ConstraintCall__Group_1__211989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__0_in_rule__ConstraintCall__Group_1__2__Impl12016 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__3__Impl_in_rule__ConstraintCall__Group_1__312047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ConstraintCall__Group_1__3__Impl12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__0__Impl_in_rule__ConstraintCall__Group_1_2__012114 = new BitSet(new long[]{0x000400000000C270L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__1_in_rule__ConstraintCall__Group_1_2__012117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConstraintCall__Group_1_2__0__Impl12145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__1__Impl_in_rule__ConstraintCall__Group_1_2__112176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ParamsAssignment_1_2_1_in_rule__ConstraintCall__Group_1_2__1__Impl12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__012237 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__012240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__112296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl12323 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__012358 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__012361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQN__Group_1__0__Impl12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__112420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl12447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__012480 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__012483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__112539 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__112542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQNWithWildcard__Group__1__Impl12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__212601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FQNWithWildcard__Group__2__Impl12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__012666 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__012669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__112727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__012788 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__012791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__112849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl12876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__012910 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__012913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__112971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013032 = new BitSet(new long[]{0x000400000000C270L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__013154 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__013157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__113214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl13241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__013276 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__013279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Number__Group_1_1__0__Impl13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__113338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl13365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__DomainModel__NamespaceAssignment13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_113435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_313466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_413497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_113528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalType__NameAssignment_113561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Constraint__DocAssignment_013592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_213623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__TargetAssignment_413658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__ExceptionAssignment_5_113693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Constraint__VariablesAssignment_713724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Constraint__MessageAssignment_813755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__ValueObject__DocAssignment_013786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValueObject__NameAssignment_213817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__ValueObject__MetaInfoAssignment_413848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__ValueObject__VariablesAssignment_513879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__ValueObject__ConstructorsAssignment_613910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__ValueObject__MethodsAssignment_713941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__EnumObject__DocAssignment_013972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumObject__NameAssignment_214003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__EnumObject__MetaInfoAssignment_414034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__EnumObject__VariablesAssignment_514065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__EnumObject__ConstructorsAssignment_614096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__EnumObject__MethodsAssignment_714127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__EnumObject__InstancesAssignment_1014158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__EnumInstance__DocAssignment_014189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_114220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__EnumInstance__ParamsAssignment_2_114251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__EnumInstance__ParamsAssignment_2_2_114282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Entity__DocAssignment_014313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_214344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__Entity__MetaInfoAssignment_414375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Entity__VariablesAssignment_514406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Entity__ConstructorsAssignment_614437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Entity__MethodsAssignment_714468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Aggregate__DocAssignment_014499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Aggregate__NameAssignment_214530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__Aggregate__MetaInfoAssignment_414561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Aggregate__VariablesAssignment_514592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__Aggregate__ConstructorsAssignment_614623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Aggregate__MethodsAssignment_714654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Constructor__DocAssignment_014685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_214716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Constructor__VariablesAssignment_414747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraints_in_rule__Constructor__ConstraintsAssignment_514778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Constructor__EventsAssignment_614809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Method__DocAssignment_014840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_214871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Method__RefMethodAssignment_3_114906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Method__VariablesAssignment_514941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraints_in_rule__Method__ConstraintsAssignment_614972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Method__EventsAssignment_715003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Event__DocAssignment_015034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_215065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Event__VariablesAssignment_415096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_115127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_115158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltippAssignment_3_115189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_115220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__ExamplesAssignment_5_115251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Variable__DocAssignment_015282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Variable__TechnicalIdAssignment_115318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Variable__BusinessKeyAssignment_215362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Variable__BusinessNameAssignment_315406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Variable__NullableAssignment_415450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__TypeAssignment_515493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Variable__MultiplicityAssignment_615533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_715572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_rule__Variable__InvariantsAssignment_815603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Variable__OverriddenAssignment_9_015634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Constraints__CallsAssignment_215665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Constraints__CallsAssignment_3_115696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_115727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_2_115758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_115789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Message__TextAssignment_115820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Message__VariablesAssignment_2_115851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstraintCall__ConstraintAssignment_015886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_115921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_2_115952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_115983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NullLiteral__ValueAssignment_116021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_116060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116091 = new BitSet(new long[]{0x0000000000000002L});

}