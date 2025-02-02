package org.dummy.brms.dummy_brms.controllers;

import org.dummy.brms.dummy_brms.model.dto.ExecInDTO;
import org.dummy.brms.dummy_brms.model.dto.ExecOutDTO;
import org.dummy.brms.dummy_brms.services.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(path = "/")
@Slf4j
public class DummyBrmsController {


    @Autowired
    private RuleService ruleService;

    
    @GetMapping("/echo")
    public String echo(@RequestParam String echo){
        log.info(echo);
        return echo;
    }

    @PostMapping("/execute")
    public ExecOutDTO execute(@RequestBody ExecInDTO in) {
        return ruleService.executeRules(in);
    }


    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String moderatorAccess() {
        return "USER Board.";
    }
}
