package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.ActionResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.ActionWithParamsResponseDTO;
import org.dummy.brms.dummy_brms.services.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/action")
@Slf4j
public class ActionController {

    @Autowired
    ActionService actionService;

    @GetMapping(value = "/getActions", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<ActionResponseDTO> getActions() {
        return actionService.getActions();
    }

    @GetMapping(value = "/getActionsWithParams", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<ActionWithParamsResponseDTO> getActionsWithParams() {
        return actionService.getActionsWithParams();
    }


}
