package org.dummy.brms.dummy_brms.rules;

import java.util.ArrayList;
import java.util.List;
import static org.drools.model.Index.ConstraintType.EQUAL;


import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;
import org.dummy.brms.dummy_brms.model.Fact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DummyDbmsRule implements RuleUnitDefinition{

    private final DataStore<Fact> facts;

    // private final DataStore<Rule> rules;
    

    // private final List<Output> results = new ArrayList<>();



    
    public DummyDbmsRule(){
        this(DataSource.createStore(), DataSource.createStore());
    }

    public DummyDbmsRule(DataStore<Fact> facts ,DataStore<Rule> rules  ){
        this.facts = facts;
        this.rules = rules;
    }


    @Override
    public void defineRules(RulesFactory rulesFactory) {
        
        // rulesFactory.rule()
        //     .on(this.rules)
        //     .filter(r -> {
        //         boolean isRuleActive = true;
        //         r.getWhen().forEach((entry)->{
        //             isRuleActive =  isRuleActive && entry.evaluateCondition();
        //         });
        //         return isRuleActive;
        //     } )
        //     .join(rule -> 
        //         rule.on(facts)
        //     ).filter("className", Fact::getClassName, EQUAL,"", (r, f) -> { return r.getWhen().stream().anyMatch(c -> c.getClassName().equals(f.getClassName() ));} )
        //     .execute(results, (r,f)-> log.info("r.toString()"));
    }


    // public DataStore<Fact> getFacts() {
    //     return facts;
    // }

    // public DataStore<Rule> getRules() {
    //     return rules;
    // }





    

}
