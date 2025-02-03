package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleInputDataFieldsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputDataFields;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RuleInputDataFieldsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleInputDataFields>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    BasicColumn[] selectList = BasicColumn.columnList(ridFieldName, ridClass, ridFieldType, projectId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleInputDataFieldsResult", value = {
        @Result(column="rid_field_name", property="ridFieldName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rid_class", property="ridClass", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rid_field_type", property="ridFieldType", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT, id=true)
    })
    List<RuleInputDataFields> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleInputDataFieldsResult")
    Optional<RuleInputDataFields> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int deleteByPrimaryKey(String ridFieldName_, String ridClass_, String ridFieldType_, Long projectId_) {
        return delete(c -> 
            c.where(ridFieldName, isEqualTo(ridFieldName_))
            .and(ridClass, isEqualTo(ridClass_))
            .and(ridFieldType, isEqualTo(ridFieldType_))
            .and(projectId, isEqualTo(projectId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int insert(RuleInputDataFields row) {
        return MyBatis3Utils.insert(this::insert, row, ruleInputDataFields, c ->
            c.map(ridFieldName).toProperty("ridFieldName")
            .map(ridClass).toProperty("ridClass")
            .map(ridFieldType).toProperty("ridFieldType")
            .map(projectId).toProperty("projectId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int insertMultiple(Collection<RuleInputDataFields> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleInputDataFields, c ->
            c.map(ridFieldName).toProperty("ridFieldName")
            .map(ridClass).toProperty("ridClass")
            .map(ridFieldType).toProperty("ridFieldType")
            .map(projectId).toProperty("projectId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int insertSelective(RuleInputDataFields row) {
        return MyBatis3Utils.insert(this::insert, row, ruleInputDataFields, c ->
            c.map(ridFieldName).toPropertyWhenPresent("ridFieldName", row::getRidFieldName)
            .map(ridClass).toPropertyWhenPresent("ridClass", row::getRidClass)
            .map(ridFieldType).toPropertyWhenPresent("ridFieldType", row::getRidFieldType)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default Optional<RuleInputDataFields> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default List<RuleInputDataFields> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default List<RuleInputDataFields> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleInputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleInputDataFields row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ridFieldName).equalTo(row::getRidFieldName)
                .set(ridClass).equalTo(row::getRidClass)
                .set(ridFieldType).equalTo(row::getRidFieldType)
                .set(projectId).equalTo(row::getProjectId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.604023+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleInputDataFields row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ridFieldName).equalToWhenPresent(row::getRidFieldName)
                .set(ridClass).equalToWhenPresent(row::getRidClass)
                .set(ridFieldType).equalToWhenPresent(row::getRidFieldType)
                .set(projectId).equalToWhenPresent(row::getProjectId);
    }
}