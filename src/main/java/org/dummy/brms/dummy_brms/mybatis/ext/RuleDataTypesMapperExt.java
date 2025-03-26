package org.dummy.brms.dummy_brms.mybatis.ext;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleDataTypes;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;

import java.util.List;

@Mapper
public interface RuleDataTypesMapperExt extends CommonCountMapper {


    @Select("SELECT data_type  FROM rule_data_types ")
    @Results(id = "RuleDataTypesResult", value = {
            @Result(column = "data_type", property = "dataType")
    })
    List<RuleDataTypes> selectAll();

}
