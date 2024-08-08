package org.dummy.brms.dummy_brms.services.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.sql.DataSource;

import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;
import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.DumbRule;
import org.dummy.brms.dummy_brms.model.dto.ExecInDTO;
import org.dummy.brms.dummy_brms.model.dto.ExecOutDTO;
import org.dummy.brms.dummy_brms.rules.DumbRuleUnit;
import org.dummy.brms.dummy_brms.services.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RuleServiceImpl implements RuleService{
    
   
    
    @Override
    public ExecOutDTO executeRules(ExecInDTO inDTO) {
                
        DumbRuleUnit ruleUnit = new DumbRuleUnit();
        //Add rules to the rule unit 
        Arrays.stream(inDTO.getRules()).forEach(r -> {
            ruleUnit.getRules().add(r);
        });
        
        //Add facts to the rule unit
        ruleUnit.setFacts(new HashMap<>());
        Arrays.stream(inDTO.getFacts()).forEach(f ->{
            ruleUnit.getFacts().put(f.getFactId(),f);
        });
        
        RuleUnitInstance<DumbRuleUnit> unitInstance = RuleUnitProvider.get().createRuleUnitInstance(ruleUnit);
        unitInstance.fire();
        ruleUnit.getRulesExecutionOrder().values().forEach(val -> log.info("In service " +val.toString()));

        return new ExecOutDTO();
    }

}
