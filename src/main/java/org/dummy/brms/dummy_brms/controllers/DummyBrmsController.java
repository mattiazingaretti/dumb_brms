package org.dummy.brms.dummy_brms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(path = "/")
@Slf4j
public class DummyBrmsController {
    
    @GetMapping("/echo")
    public String echo(@RequestParam String echo){
        log.info(echo);
        return echo;
    }

}
