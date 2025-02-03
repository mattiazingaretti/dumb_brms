package org.dummy.brms.dummy_brms.mybatis.ext;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputDataFields;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

@Mapper
public interface RuleInputDataFieldsExtMapper extends CommonInsertMapper<RuleInputDataFields> {

    @Insert("INSERT INTO rule_input_data_fields (rid_class, field_name, field_type) VALUES (#{ridClass}, #{ridFieldName}, #{ridFieldType})")
    int customInsert(RuleInputDataFields ruleInputDataFields);
}
