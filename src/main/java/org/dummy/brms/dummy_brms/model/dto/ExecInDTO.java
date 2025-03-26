package org.dummy.brms.dummy_brms.model.dto;

import org.dummy.brms.dummy_brms.model.DumbFact;
import org.dummy.brms.dummy_brms.model.DumbRule;

import lombok.Data;

@Data
public class ExecInDTO {
    
    private DumbFact[] facts;
    private DumbRule[] rules;
}
