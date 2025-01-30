package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;

public interface ProjectsService {

    PostedResourceDTO postProject(ProjectDTO project) throws DummyBadRequestException;
}
