package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleWorkflowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleWorkflow;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RuleWorkflowMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    BasicColumn[] selectList = BasicColumn.columnList(idWorkflow, workflowName, ruleId, lastUpdateWorkflow);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.idWorkflow")
    int insert(InsertStatementProvider<RuleWorkflow> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.idWorkflow")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<RuleWorkflow> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleWorkflowResult", value = {
        @Result(column="id_workflow", property="idWorkflow", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="workflow_name", property="workflowName", jdbcType=JdbcType.VARCHAR),
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT),
        @Result(column="last_update_workflow", property="lastUpdateWorkflow", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RuleWorkflow> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleWorkflowResult")
    Optional<RuleWorkflow> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int deleteByPrimaryKey(Long idWorkflow_) {
        return delete(c -> 
            c.where(idWorkflow, isEqualTo(idWorkflow_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int insert(RuleWorkflow row) {
        return MyBatis3Utils.insert(this::insert, row, ruleWorkflow, c ->
            c.map(workflowName).toProperty("workflowName")
            .map(ruleId).toProperty("ruleId")
            .map(lastUpdateWorkflow).toProperty("lastUpdateWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int insertMultiple(Collection<RuleWorkflow> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, ruleWorkflow, c ->
            c.map(workflowName).toProperty("workflowName")
            .map(ruleId).toProperty("ruleId")
            .map(lastUpdateWorkflow).toProperty("lastUpdateWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int insertSelective(RuleWorkflow row) {
        return MyBatis3Utils.insert(this::insert, row, ruleWorkflow, c ->
            c.map(workflowName).toPropertyWhenPresent("workflowName", row::getWorkflowName)
            .map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(lastUpdateWorkflow).toPropertyWhenPresent("lastUpdateWorkflow", row::getLastUpdateWorkflow)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default Optional<RuleWorkflow> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default List<RuleWorkflow> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default List<RuleWorkflow> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default Optional<RuleWorkflow> selectByPrimaryKey(Long idWorkflow_) {
        return selectOne(c ->
            c.where(idWorkflow, isEqualTo(idWorkflow_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleWorkflow, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleWorkflow row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(workflowName).equalTo(row::getWorkflowName)
                .set(ruleId).equalTo(row::getRuleId)
                .set(lastUpdateWorkflow).equalTo(row::getLastUpdateWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleWorkflow row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(workflowName).equalToWhenPresent(row::getWorkflowName)
                .set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(lastUpdateWorkflow).equalToWhenPresent(row::getLastUpdateWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int updateByPrimaryKey(RuleWorkflow row) {
        return update(c ->
            c.set(workflowName).equalTo(row::getWorkflowName)
            .set(ruleId).equalTo(row::getRuleId)
            .set(lastUpdateWorkflow).equalTo(row::getLastUpdateWorkflow)
            .where(idWorkflow, isEqualTo(row::getIdWorkflow))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7377785+01:00", comments="Source Table: dumb_brms.rule_workflow")
    default int updateByPrimaryKeySelective(RuleWorkflow row) {
        return update(c ->
            c.set(workflowName).equalToWhenPresent(row::getWorkflowName)
            .set(ruleId).equalToWhenPresent(row::getRuleId)
            .set(lastUpdateWorkflow).equalToWhenPresent(row::getLastUpdateWorkflow)
            .where(idWorkflow, isEqualTo(row::getIdWorkflow))
        );
    }
}