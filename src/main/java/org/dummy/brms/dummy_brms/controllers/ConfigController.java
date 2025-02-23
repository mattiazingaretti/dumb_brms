package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.RuleActionsResponseDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/config")
@Slf4j
public class ConfigController {



    @GetMapping(value = "/getConfiguredActions/{projectId}", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public RuleActionsResponseDTO getConfiguredActions(@PathVariable Long projectId, Authentication authentication) {
        return null;
    }
}
