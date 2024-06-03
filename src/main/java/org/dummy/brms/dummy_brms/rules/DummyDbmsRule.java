package org.dummy.brms.dummy_brms.rules;

import java.util.ArrayList;
import java.util.List;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;

import org.dummy.brms.dummy_brms.models.input.Rule;
import org.dummy.brms.dummy_brms.models.input.facts.Fact;
import org.dummy.brms.dummy_brms.models.output.Output;

public class DummyDbmsRule implements RuleUnitDefinition{

    private final DataStore<Fact> facts;

    private final DataStore<Rule> rules;
    

    private final List<Output> results = new ArrayList<>();


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
        //     .on(rules)
        //     .filter(r -> r.getWhen().stream().allMatch(c ->  c.evaluateCondition() ) ) 
        //     .join(
        //         rule -> rule.on(facts) 
        //                     .filter() 
        //         ) 
        //     .filter(EQUAL, String::length) 
        //     .execute(results, (r, s, i) -> r.add("String '" + s + "' is " + i + " characters long")); 

    }




    

}
