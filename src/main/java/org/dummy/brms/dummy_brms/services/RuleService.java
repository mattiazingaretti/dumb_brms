package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.model.dto.ExecInDTO;
import org.dummy.brms.dummy_brms.model.dto.ExecOutDTO;

public interface RuleService {

    ExecOutDTO executeRules(ExecInDTO inDTO);

}
