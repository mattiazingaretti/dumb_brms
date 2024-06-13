package org.dummy.brms.dummy_brms.controllers;

import org.dummy.brms.dummy_brms.models.dto.ExecutionInDto;
import org.dummy.brms.dummy_brms.models.dto.ExecutionOutDto;
import org.dummy.brms.dummy_brms.services.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
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
    DroolsService droolsService;
    
    @GetMapping("/echo")
    public String echo(@RequestParam String echo){
        log.info(echo);

        return droolsService.runEchoRule(echo);
    }


    @PostMapping("/execute")
    public ExecutionOutDto execute(@RequestBody ExecutionInDto inDto){
        return droolsService.runRule(inDto);
    }
    
}
