package org.dummy.brms.dummy_brms.model.dto;

import java.util.Map;
import java.util.UUID;

import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.DumbRule;

import lombok.Data;

@Data
public class ExecInDTO {
    
    private Map<UUID, DumbFact> facts;
    private DumbRule[] rules;
}
