package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.RuleInputRequestDTO;
import org.dummy.brms.dummy_brms.model.dto.RuleInputResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;
import org.dummy.brms.dummy_brms.services.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/design")
@Slf4j
public class DesignController {

    @Autowired
    DesignService designService;

    @PostMapping(value = "/addRuleInputData", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public PostedResourceDTO addRuleInputData(Authentication authentication, @RequestBody List<RuleInputRequestDTO> rinput) {
        return designService.postRuleInput(rinput, (UserDTO) authentication.getPrincipal());
    }

    @GetMapping(value = "/getRuleInputData/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<RuleInputResponseDTO> getRuleInputData(@PathVariable Long projectId, Authentication authentication) {
        return designService.getRuleInput(projectId,(UserDTO) authentication.getPrincipal());
    }
}
