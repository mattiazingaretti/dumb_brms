package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.VRuleFullDynamicSqlSupport.*;

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
import org.dummy.brms.dummy_brms.mybatis.pojo.VRuleFull;
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
public interface VRuleFullMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<VRuleFull>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    BasicColumn[] selectList = BasicColumn.columnList(ruleId, projectId, ruleName, salience, classname, conditionNameId, field, operator, value, flgUseIdConditions, idWorkflow, workflowName, lastUpdateWorkflow);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VRuleFullResult", value = {
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT),
        @Result(column="rule_name", property="ruleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="salience", property="salience", jdbcType=JdbcType.INTEGER),
        @Result(column="classname", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="condition_name_id", property="conditionNameId", jdbcType=JdbcType.VARCHAR),
        @Result(column="field", property="field", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.OTHER),
        @Result(column="flg_use_id_conditions", property="flgUseIdConditions", jdbcType=JdbcType.BIT),
        @Result(column="id_workflow", property="idWorkflow", jdbcType=JdbcType.BIGINT),
        @Result(column="workflow_name", property="workflowName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_workflow", property="lastUpdateWorkflow", jdbcType=JdbcType.TIMESTAMP)
    })
    List<VRuleFull> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VRuleFullResult")
    Optional<VRuleFull> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insert(VRuleFull row) {
        return MyBatis3Utils.insert(this::insert, row, VRuleFull, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(ruleName).toProperty("ruleName")
            .map(salience).toProperty("salience")
            .map(classname).toProperty("classname")
            .map(conditionNameId).toProperty("conditionNameId")
            .map(field).toProperty("field")
            .map(operator).toProperty("operator")
            .map(value).toProperty("value")
            .map(flgUseIdConditions).toProperty("flgUseIdConditions")
            .map(idWorkflow).toProperty("idWorkflow")
            .map(workflowName).toProperty("workflowName")
            .map(lastUpdateWorkflow).toProperty("lastUpdateWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insertMultiple(Collection<VRuleFull> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, VRuleFull, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(ruleName).toProperty("ruleName")
            .map(salience).toProperty("salience")
            .map(classname).toProperty("classname")
            .map(conditionNameId).toProperty("conditionNameId")
            .map(field).toProperty("field")
            .map(operator).toProperty("operator")
            .map(value).toProperty("value")
            .map(flgUseIdConditions).toProperty("flgUseIdConditions")
            .map(idWorkflow).toProperty("idWorkflow")
            .map(workflowName).toProperty("workflowName")
            .map(lastUpdateWorkflow).toProperty("lastUpdateWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insertSelective(VRuleFull row) {
        return MyBatis3Utils.insert(this::insert, row, VRuleFull, c ->
            c.map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(ruleName).toPropertyWhenPresent("ruleName", row::getRuleName)
            .map(salience).toPropertyWhenPresent("salience", row::getSalience)
            .map(classname).toPropertyWhenPresent("classname", row::getClassname)
            .map(conditionNameId).toPropertyWhenPresent("conditionNameId", row::getConditionNameId)
            .map(field).toPropertyWhenPresent("field", row::getField)
            .map(operator).toPropertyWhenPresent("operator", row::getOperator)
            .map(value).toPropertyWhenPresent("value", row::getValue)
            .map(flgUseIdConditions).toPropertyWhenPresent("flgUseIdConditions", row::getFlgUseIdConditions)
            .map(idWorkflow).toPropertyWhenPresent("idWorkflow", row::getIdWorkflow)
            .map(workflowName).toPropertyWhenPresent("workflowName", row::getWorkflowName)
            .map(lastUpdateWorkflow).toPropertyWhenPresent("lastUpdateWorkflow", row::getLastUpdateWorkflow)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default Optional<VRuleFull> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default List<VRuleFull> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default List<VRuleFull> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    static UpdateDSL<UpdateModel> updateAllColumns(VRuleFull row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalTo(row::getRuleId)
                .set(projectId).equalTo(row::getProjectId)
                .set(ruleName).equalTo(row::getRuleName)
                .set(salience).equalTo(row::getSalience)
                .set(classname).equalTo(row::getClassname)
                .set(conditionNameId).equalTo(row::getConditionNameId)
                .set(field).equalTo(row::getField)
                .set(operator).equalTo(row::getOperator)
                .set(value).equalTo(row::getValue)
                .set(flgUseIdConditions).equalTo(row::getFlgUseIdConditions)
                .set(idWorkflow).equalTo(row::getIdWorkflow)
                .set(workflowName).equalTo(row::getWorkflowName)
                .set(lastUpdateWorkflow).equalTo(row::getLastUpdateWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7397792+01:00", comments="Source Table: dumb_brms.v_rule_full")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VRuleFull row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(projectId).equalToWhenPresent(row::getProjectId)
                .set(ruleName).equalToWhenPresent(row::getRuleName)
                .set(salience).equalToWhenPresent(row::getSalience)
                .set(classname).equalToWhenPresent(row::getClassname)
                .set(conditionNameId).equalToWhenPresent(row::getConditionNameId)
                .set(field).equalToWhenPresent(row::getField)
                .set(operator).equalToWhenPresent(row::getOperator)
                .set(value).equalToWhenPresent(row::getValue)
                .set(flgUseIdConditions).equalToWhenPresent(row::getFlgUseIdConditions)
                .set(idWorkflow).equalToWhenPresent(row::getIdWorkflow)
                .set(workflowName).equalToWhenPresent(row::getWorkflowName)
                .set(lastUpdateWorkflow).equalToWhenPresent(row::getLastUpdateWorkflow);
    }
}