package org.dummy.brms.dummy_brms.mybatis.ext;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputData;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

@Mapper
public interface RuleInputDataExtMapper extends CommonInsertMapper<RuleInputData> {

    @Insert("INSERT INTO rule_input_data (rid_class, user_id, project_id, rid_description) VALUES (#{ridClass}, #{userId}, #{projectId}, #{ridDescription})")
    int customInsert(RuleInputData ruleInputData);
}
