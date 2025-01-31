package org.dummy.brms.dummy_brms.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.dummy.brms.dummy_brms.mybatis.ext.ProjectsExtMapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.Projects;
import org.dummy.brms.dummy_brms.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    ProjectsExtMapper projectsExtMapper;

    @Override
    public PostedResourceDTO postProject(ProjectDTO project) throws DummyBadRequestException {
        if(project == null || project.getName() == null || project.getName().isEmpty()){
            throw new DummyBadRequestException(ErrorCode.MISSING_PROJECT_NAME);
        }

        Projects proj = new Projects();
        proj.setUserId(1L);
        proj.setProjectName(project.getName());
        projectsExtMapper.customInsert(proj);
        return PostedResourceDTO.builder()
                .msg("Project Added Succssfully")
                .success(true)
                .build();
    }
}
