package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleInputDataDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleInputData;
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
public interface RuleInputDataMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleInputData>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    BasicColumn[] selectList = BasicColumn.columnList(projectId, ridClass, userId, ridDescription);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleInputDataResult", value = {
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="rid_class", property="ridClass", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="rid_description", property="ridDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<RuleInputData> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleInputDataResult")
    Optional<RuleInputData> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int deleteByPrimaryKey(Long projectId_, String ridClass_) {
        return delete(c -> 
            c.where(projectId, isEqualTo(projectId_))
            .and(ridClass, isEqualTo(ridClass_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int insert(RuleInputData row) {
        return MyBatis3Utils.insert(this::insert, row, ruleInputData, c ->
            c.map(projectId).toProperty("projectId")
            .map(ridClass).toProperty("ridClass")
            .map(userId).toProperty("userId")
            .map(ridDescription).toProperty("ridDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int insertMultiple(Collection<RuleInputData> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleInputData, c ->
            c.map(projectId).toProperty("projectId")
            .map(ridClass).toProperty("ridClass")
            .map(userId).toProperty("userId")
            .map(ridDescription).toProperty("ridDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int insertSelective(RuleInputData row) {
        return MyBatis3Utils.insert(this::insert, row, ruleInputData, c ->
            c.map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(ridClass).toPropertyWhenPresent("ridClass", row::getRidClass)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(ridDescription).toPropertyWhenPresent("ridDescription", row::getRidDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default Optional<RuleInputData> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default List<RuleInputData> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default List<RuleInputData> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default Optional<RuleInputData> selectByPrimaryKey(Long projectId_, String ridClass_) {
        return selectOne(c ->
            c.where(projectId, isEqualTo(projectId_))
            .and(ridClass, isEqualTo(ridClass_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleInputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleInputData row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalTo(row::getProjectId)
                .set(ridClass).equalTo(row::getRidClass)
                .set(userId).equalTo(row::getUserId)
                .set(ridDescription).equalTo(row::getRidDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleInputData row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalToWhenPresent(row::getProjectId)
                .set(ridClass).equalToWhenPresent(row::getRidClass)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(ridDescription).equalToWhenPresent(row::getRidDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int updateByPrimaryKey(RuleInputData row) {
        return update(c ->
            c.set(userId).equalTo(row::getUserId)
            .set(ridDescription).equalTo(row::getRidDescription)
            .where(projectId, isEqualTo(row::getProjectId))
            .and(ridClass, isEqualTo(row::getRidClass))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0704292+01:00", comments="Source Table: dumb_brms.rule_input_data")
    default int updateByPrimaryKeySelective(RuleInputData row) {
        return update(c ->
            c.set(userId).equalToWhenPresent(row::getUserId)
            .set(ridDescription).equalToWhenPresent(row::getRidDescription)
            .where(projectId, isEqualTo(row::getProjectId))
            .and(ridClass, isEqualTo(row::getRidClass))
        );
    }
}