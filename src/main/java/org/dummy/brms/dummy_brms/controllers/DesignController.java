package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyGenericException;
import org.dummy.brms.dummy_brms.model.dto.*;
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

    /**
     * GET requests
     */

    @GetMapping(value = "/getRules/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<RuleDTO> getRules(@PathVariable Long projectId, Authentication authentication) throws DummyGenericException {
        return designService.getRules(projectId,(UserDTO) authentication.getPrincipal());
    }


    @GetMapping(value = "/getRuleData/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public RuleDataResponseDTO getRuleData(@PathVariable Long projectId, Authentication authentication) {
        return designService.getRuleData(projectId,(UserDTO) authentication.getPrincipal());
    }

    @GetMapping(value = "/getRuleInputData/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<RuleInputResponseDTO> getRuleInputData(@PathVariable Long projectId, Authentication authentication) {
        return designService.getRuleInput(projectId,(UserDTO) authentication.getPrincipal());
    }
    @GetMapping(value = "/getRuleOutputData/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<RuleOutputResponseDTO> getRuleOutputData(@PathVariable Long projectId, Authentication authentication) {
        return designService.getRuleOutput(projectId,(UserDTO) authentication.getPrincipal());
    }

    @GetMapping(value = "/getDataTypes", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<RuleDataTypesDTO> getDataTypes( Authentication authentication) {
        return designService.getDataTypes((UserDTO) authentication.getPrincipal());
    }

    /**
     * POST requests
     */
    @PostMapping(value = "/addRuleInputData", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public PostedResourceDTO addRuleInputData(Authentication authentication, @RequestBody List<RuleInputRequestDTO> rinput) {
        return designService.postRuleInput(rinput, (UserDTO) authentication.getPrincipal());
    }
    @PostMapping(value = "/addRuleOutputData", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public PostedResourceDTO addRuleOutputData(Authentication authentication, @RequestBody List<RuleOutputRequestDTO> rinput) {
        return designService.postRuleOutPut(rinput, (UserDTO) authentication.getPrincipal());
    }

    @PostMapping(value = "/addRuleInProject/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public PostedResourceDTO addRuleInProject(Authentication authentication, @PathVariable Long projectId, @RequestBody RuleDTO ruleDto ) throws DummyGenericException {
        return designService.postRule(ruleDto, projectId, (UserDTO) authentication.getPrincipal());
    }


}
