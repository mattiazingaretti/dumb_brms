package org.dummy.brms.dummy_brms.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.exception.DummyBadRequestException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectDTO;
import org.dummy.brms.dummy_brms.model.dto.ProjectResponseDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;
import org.dummy.brms.dummy_brms.mybatis.ext.ProjectsExtMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.ProjectsDynamicSqlSupport;
import org.dummy.brms.dummy_brms.mybatis.mappers.ProjectsMapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.Projects;
import org.dummy.brms.dummy_brms.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
@Slf4j
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    ProjectsExtMapper projectsExtMapper;
    @Autowired
    ProjectsMapper projectsMapper;

    @Override
    public PostedResourceDTO postProject(ProjectDTO project, UserDTO principal) throws DummyBadRequestException {
        if(project == null || project.getName() == null || project.getName().isEmpty()){
            throw new DummyBadRequestException(ErrorCode.MISSING_PROJECT_NAME);
        }
        Projects proj = new Projects();
        proj.setUserId(principal.getId());
        proj.setProjectName(project.getName());
        projectsExtMapper.customInsert(proj);
        return PostedResourceDTO.builder()
                .msg("Project Added Succssfully")
                .success(true)
                .build();
    }

    @Override
    public List<ProjectResponseDTO> getProjects(UserDTO principal) {
        List<ProjectResponseDTO> toRet = new LinkedList<>();
        List<Projects> projects = this.projectsMapper.select(dsl -> dsl.where( ProjectsDynamicSqlSupport.userId, isEqualTo(principal.getId())));
        projects.forEach(projects1 -> {
            toRet.add(ProjectResponseDTO.builder()
                    .id(projects1.getId())
                    .name(projects1.getProjectName())
                    .creationDate(projects1.getCreationDatetime())
                    .lastUpdate(projects1.getLastUpdate())
                    .build());
        });
        return toRet;
    }
}
