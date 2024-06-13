package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.models.dto.ExecutionInDto;
import org.dummy.brms.dummy_brms.models.dto.ExecutionOutDto;

public interface DroolsService {
    String runEchoRule(String msg);
    

    ExecutionOutDto runRule(ExecutionInDto in);
    
}
