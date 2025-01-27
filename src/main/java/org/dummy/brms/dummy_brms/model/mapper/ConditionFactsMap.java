package org.dummy.brms.dummy_brms.model.mapper;

import java.util.List;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.conditions.Conditions;

import lombok.Data;

@Data
public class ConditionFactsMap {
    private Conditions condition;
    private List<UUID> facts;
}
