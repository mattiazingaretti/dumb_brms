package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project")
@Slf4j
public class ProjectController {



    @PostMapping("/addProject")
    public void addProject(@RequestBody ProjectDTO project) {

    }

}
