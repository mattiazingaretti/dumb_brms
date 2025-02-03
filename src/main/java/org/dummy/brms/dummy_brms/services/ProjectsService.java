package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;

import java.util.List;

public interface ProjectsService {

    PostedResourceDTO postProject(ProjectDTO project, UserDTO principal) throws DummyBadRequestException;

    List<ProjectResponseDTO> getProjects(UserDTO principal);
}
