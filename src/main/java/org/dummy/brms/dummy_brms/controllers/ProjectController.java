package org.dummy.brms.dummy_brms.controllers;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;
import org.dummy.brms.dummy_brms.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/project")
@Slf4j
public class ProjectController {

    @Autowired
    private ProjectsService projectsService;

    @PostMapping(value = "/addProject", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public PostedResourceDTO addProject(@RequestBody ProjectDTO project, Authentication authentication) throws DummyBadRequestException {
        return projectsService.postProject(project, (UserDTO) authentication.getPrincipal());
    }

    @GetMapping(value = "/getProjects", produces = "application/json")
    @PreAuthorize("hasRole('USER')")
    public List<ProjectResponseDTO> getUserProjects(Authentication authentication) {
        return projectsService.getProjects((UserDTO) authentication.getPrincipal());
    }

}
