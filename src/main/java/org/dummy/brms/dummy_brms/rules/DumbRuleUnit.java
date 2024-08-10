package org.dummy.brms.dummy_brms.rules;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.DumbRule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DumbRuleUnit implements RuleUnitDefinition{
 
    private final DataStore<DumbRule> rules; 

    private final Map<UUID,String> rulesExecutionOrder = new HashMap<>();

    private Map<UUID, DumbFact> facts;


  

    public DumbRuleUnit(){
        this.rules = DataSource.createStore();
        this.facts = new HashMap<>();
    }

    public DumbRuleUnit(DataStore<DumbRule> rules, Map<UUID, DumbFact> facts) {
        this.rules = rules;
        this.facts = facts;
    }

    
    public Map<UUID, String> getRulesExecutionOrder() {
        return rulesExecutionOrder;
    }
    
    public DataStore<DumbRule> getRules() {
        return rules;
    }
    
    public Map<UUID, DumbFact> getFacts() {
        return facts;
    }
    public void setFacts(Map<UUID, DumbFact> facts) {
        this.facts = facts;
    }
    @Override
    public void defineRules(RulesFactory rulesFactory) {
        rulesFactory.rule().on(rules).filter(r -> Arrays.stream(r.getConditions()).allMatch(cond -> {
            try {
                return cond.evaluate(this.getFacts(), cond.getFactClassName());
            } catch (DummyGenericException e) {
                e.printStackTrace();
                return false;
            }
        } )).execute(r -> {
            log.info("Executed rule :" + r.getName());
            rulesExecutionOrder.put(r.getRuleId(),r.getName());
        });
    }

}
