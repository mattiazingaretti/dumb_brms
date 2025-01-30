package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.dummy.brms.dummy_brms.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project")
@Slf4j
public class ProjectController {

    @Autowired
    private ProjectsService projectsService;

    @PostMapping("/addProject")
    public PostedResourceDTO addProject(@RequestBody ProjectDTO project) throws DummyBadRequestException {
        return projectsService.postProject(project);
    }

}
