package org.dummy.brms.dummy_brms.model;


import java.util.UUID;

import org.dummy.brms.dummy_brms.model.conditions.Conditions;
import org.dummy.brms.dummy_brms.model.mapper.ConditionFactsMap;


import lombok.Data;

@Data
public class DumbRule {
    private UUID ruleId;
    private String name;
    private int salience;
    private Conditions[] conditions;

    private ConditionFactsMap[] matchingFactsIds;
}
