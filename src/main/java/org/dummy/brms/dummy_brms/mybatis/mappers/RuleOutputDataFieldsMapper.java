package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleOutputDataFieldsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleOutputDataFields;
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
public interface RuleOutputDataFieldsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleOutputDataFields>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    BasicColumn[] selectList = BasicColumn.columnList(rodFieldName, rodClass, rodFieldType, projectId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleOutputDataFieldsResult", value = {
        @Result(column="rod_field_name", property="rodFieldName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rod_class", property="rodClass", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rod_field_type", property="rodFieldType", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT, id=true)
    })
    List<RuleOutputDataFields> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleOutputDataFieldsResult")
    Optional<RuleOutputDataFields> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int deleteByPrimaryKey(String rodFieldName_, String rodClass_, String rodFieldType_, Long projectId_) {
        return delete(c -> 
            c.where(rodFieldName, isEqualTo(rodFieldName_))
            .and(rodClass, isEqualTo(rodClass_))
            .and(rodFieldType, isEqualTo(rodFieldType_))
            .and(projectId, isEqualTo(projectId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int insert(RuleOutputDataFields row) {
        return MyBatis3Utils.insert(this::insert, row, ruleOutputDataFields, c ->
            c.map(rodFieldName).toProperty("rodFieldName")
            .map(rodClass).toProperty("rodClass")
            .map(rodFieldType).toProperty("rodFieldType")
            .map(projectId).toProperty("projectId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int insertMultiple(Collection<RuleOutputDataFields> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleOutputDataFields, c ->
            c.map(rodFieldName).toProperty("rodFieldName")
            .map(rodClass).toProperty("rodClass")
            .map(rodFieldType).toProperty("rodFieldType")
            .map(projectId).toProperty("projectId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int insertSelective(RuleOutputDataFields row) {
        return MyBatis3Utils.insert(this::insert, row, ruleOutputDataFields, c ->
            c.map(rodFieldName).toPropertyWhenPresent("rodFieldName", row::getRodFieldName)
            .map(rodClass).toPropertyWhenPresent("rodClass", row::getRodClass)
            .map(rodFieldType).toPropertyWhenPresent("rodFieldType", row::getRodFieldType)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default Optional<RuleOutputDataFields> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default List<RuleOutputDataFields> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default List<RuleOutputDataFields> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleOutputDataFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleOutputDataFields row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rodFieldName).equalTo(row::getRodFieldName)
                .set(rodClass).equalTo(row::getRodClass)
                .set(rodFieldType).equalTo(row::getRodFieldType)
                .set(projectId).equalTo(row::getProjectId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7297747+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleOutputDataFields row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rodFieldName).equalToWhenPresent(row::getRodFieldName)
                .set(rodClass).equalToWhenPresent(row::getRodClass)
                .set(rodFieldType).equalToWhenPresent(row::getRodFieldType)
                .set(projectId).equalToWhenPresent(row::getProjectId);
    }
}