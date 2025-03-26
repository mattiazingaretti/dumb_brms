package org.dummy.brms.dummy_brms.mybatis.ext;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.Projects;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

@Mapper
public interface ProjectsExtMapper extends CommonInsertMapper<Projects> {



    @Insert("INSERT INTO projects (id, user_id, project_name, last_update, creation_datetime) VALUES (DEFAULT, #{userId}, #{projectName}, DEFAULT,DEFAULT)")
    int customInsert(Projects project);

}
