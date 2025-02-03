package org.dummy.brms.dummy_brms.services;


import org.dummy.brms.dummy_brms.model.dto.*;

import java.util.List;

public interface DesignService {

    PostedResourceDTO postRuleInput(List<RuleInputRequestDTO> rinput, UserDTO principal);

    PostedResourceDTO postRuleOutPut(List<RuleOutputRequestDTO> rinput, UserDTO principal);

    List<RuleInputResponseDTO> getRuleInput(Long projectId, UserDTO principal);
    List<RuleOutputResponseDTO> getRuleOutput(Long projectId, UserDTO principal);


}
