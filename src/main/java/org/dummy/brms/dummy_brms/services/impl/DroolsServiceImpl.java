package org.dummy.brms.dummy_brms.services.impl;

import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;
import org.dummy.brms.dummy_brms.rules.HelloWorldRule;
import org.dummy.brms.dummy_brms.services.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.inject.Inject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DroolsServiceImpl implements DroolsService {
    
    
    @Override
    public String runRules(String echo) {
        HelloWorldRule unit = new HelloWorldRule();
        unit.getStrings().add(echo);
        

        try ( RuleUnitInstance<HelloWorldRule> instance = RuleUnitProvider.get().getRuleUnit(unit).createInstance(unit);  ) {
            instance.fire();
            unit.getResults().forEach(r -> log.info(r));
            return unit.getResults().stream().reduce((a,b)-> a.concat(b)).orElse("No result ");

        }
    }

}
