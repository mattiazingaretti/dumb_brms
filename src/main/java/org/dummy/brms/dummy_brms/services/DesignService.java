package org.dummy.brms.dummy_brms.services;


import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.RuleInputRequestDTO;
import org.dummy.brms.dummy_brms.model.dto.RuleInputResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;

import java.util.List;

public interface DesignService {

    PostedResourceDTO postRuleInput(List<RuleInputRequestDTO> rinput, UserDTO principal);

    List<RuleInputResponseDTO> getRuleInput(Long projectId, UserDTO principal);


}
