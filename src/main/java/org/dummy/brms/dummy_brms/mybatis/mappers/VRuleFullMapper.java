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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    BasicColumn[] selectList = BasicColumn.columnList(ruleIdName, ruleId, projectId, salience, rulename, conditions, workflow);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VRuleFullResult", value = {
        @Result(column="rule_id_name", property="ruleIdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT),
        @Result(column="salience", property="salience", jdbcType=JdbcType.INTEGER),
        @Result(column="rulename", property="rulename", jdbcType=JdbcType.VARCHAR),
        @Result(column="conditions", property="conditions", jdbcType=JdbcType.OTHER),
        @Result(column="workflow", property="workflow", jdbcType=JdbcType.OTHER)
    })
    List<VRuleFull> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VRuleFullResult")
    Optional<VRuleFull> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insert(VRuleFull row) {
        return MyBatis3Utils.insert(this::insert, row, VRuleFull, c ->
            c.map(ruleIdName).toProperty("ruleIdName")
            .map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(rulename).toProperty("rulename")
            .map(conditions).toProperty("conditions")
            .map(workflow).toProperty("workflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insertMultiple(Collection<VRuleFull> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, VRuleFull, c ->
            c.map(ruleIdName).toProperty("ruleIdName")
            .map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(rulename).toProperty("rulename")
            .map(conditions).toProperty("conditions")
            .map(workflow).toProperty("workflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int insertSelective(VRuleFull row) {
        return MyBatis3Utils.insert(this::insert, row, VRuleFull, c ->
            c.map(ruleIdName).toPropertyWhenPresent("ruleIdName", row::getRuleIdName)
            .map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(salience).toPropertyWhenPresent("salience", row::getSalience)
            .map(rulename).toPropertyWhenPresent("rulename", row::getRulename)
            .map(conditions).toPropertyWhenPresent("conditions", row::getConditions)
            .map(workflow).toPropertyWhenPresent("workflow", row::getWorkflow)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default Optional<VRuleFull> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default List<VRuleFull> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default List<VRuleFull> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, VRuleFull, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    static UpdateDSL<UpdateModel> updateAllColumns(VRuleFull row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleIdName).equalTo(row::getRuleIdName)
                .set(ruleId).equalTo(row::getRuleId)
                .set(projectId).equalTo(row::getProjectId)
                .set(salience).equalTo(row::getSalience)
                .set(rulename).equalTo(row::getRulename)
                .set(conditions).equalTo(row::getConditions)
                .set(workflow).equalTo(row::getWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source Table: dumb_brms.v_rule_full")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VRuleFull row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleIdName).equalToWhenPresent(row::getRuleIdName)
                .set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(projectId).equalToWhenPresent(row::getProjectId)
                .set(salience).equalToWhenPresent(row::getSalience)
                .set(rulename).equalToWhenPresent(row::getRulename)
                .set(conditions).equalToWhenPresent(row::getConditions)
                .set(workflow).equalToWhenPresent(row::getWorkflow);
    }
}