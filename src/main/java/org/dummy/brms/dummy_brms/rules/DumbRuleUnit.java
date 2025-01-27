package org.dummy.brms.dummy_brms.rules;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.DumbRule;
import org.dummy.brms.dummy_brms.model.mapper.ConditionFactsMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DumbRuleUnit implements RuleUnitDefinition{
 
    private final DataStore<DumbRule> rules; 

    private Map<UUID,String> rulesExecutionOrder = new HashMap<>();

    private Map<UUID, DumbFact> facts = new HashMap<>();



    public DumbRuleUnit(){
        this.rules = DataSource.createStore();
        this.facts = new HashMap<>();
        this.rulesExecutionOrder = new HashMap<>();
        this.facts.clear();
        this.rulesExecutionOrder.clear();
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
    public void onReinitialize() {
        this.facts.clear();
    }

    @Override
    public void defineRules(RulesFactory rulesFactory) {
        rulesFactory.rule().on(rules).filter(r -> Arrays.stream(r.getConditions()).allMatch(cond -> {
            try {
                List<UUID> factsMatchingConditions = cond.evaluate(this.getFacts(), cond.getFactClassName());
                ConditionFactsMap entry = new ConditionFactsMap();
                entry.setCondition(cond);
                entry.setFacts(factsMatchingConditions);
                r.setMatchingFactsIds(new ConditionFactsMap[]{entry});
                return factsMatchingConditions.size() > 0;
            } catch (DummyGenericException e) {
                e.printStackTrace();
                return false;
            }
        } )).execute(r -> {
            log.info("Executed rule :" + r.getName());
            log.info("Fact condition map :");
            for (ConditionFactsMap entry: r.getMatchingFactsIds()){
                log.info("Condition : "+entry.getCondition().toString());
                for( UUID val : entry.getFacts()){
                    log.info("Fact matched : "+this.getFacts().entrySet().stream().filter(f -> f.getKey().equals(val)).findFirst().get().getValue().toString());
                    // log.info("Fact matched : "+ val.toString());
                }
            }
            rulesExecutionOrder.put(r.getRuleId(),r.getName());
        });
    }

}
