package org.dummy.brms.dummy_brms.rules;

import java.util.ArrayList;
import java.util.List;

import org.drools.ruleunits.api.DataStore;
import org.codehaus.plexus.component.annotations.Component;
import org.drools.ruleunits.api.DataSource;


import org.drools.ruleunits.dsl.RuleUnitDefinition;
import org.drools.ruleunits.dsl.RulesFactory;



public class HelloWorldRule implements RuleUnitDefinition{

    private final DataStore<String> strings;
    private final List<String> results = new ArrayList<>();
    
    

    public HelloWorldRule() {
        this(DataSource.createStore());
    }

    public HelloWorldRule(DataStore<String> strings) {
        this.strings = strings;
    }

    public DataStore<String> getStrings() {
        return strings;
    }


    public List<String> getResults() {
        return results;
    }


    @Override
    public void defineRules(RulesFactory rulesFactory) {
        rulesFactory.rule()
                    .on(strings)
                    .execute(this.results, (r, s) -> r.add(s)); 
    }


}
