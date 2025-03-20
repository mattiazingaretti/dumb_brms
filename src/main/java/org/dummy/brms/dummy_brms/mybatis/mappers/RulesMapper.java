package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RulesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Rules;
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
public interface RulesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Rules>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    BasicColumn[] selectList = BasicColumn.columnList(ruleId, projectId, salience, rulename, idCondition, idWorkflow);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RulesResult", value = {
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT),
        @Result(column="salience", property="salience", jdbcType=JdbcType.INTEGER),
        @Result(column="rulename", property="rulename", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_condition", property="idCondition", jdbcType=JdbcType.BIGINT),
        @Result(column="id_workflow", property="idWorkflow", jdbcType=JdbcType.BIGINT)
    })
    List<Rules> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RulesResult")
    Optional<Rules> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default int deleteByPrimaryKey(Long ruleId_) {
        return delete(c -> 
            c.where(ruleId, isEqualTo(ruleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default int insert(Rules row) {
        return MyBatis3Utils.insert(this::insert, row, rules, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(rulename).toProperty("rulename")
            .map(idCondition).toProperty("idCondition")
            .map(idWorkflow).toProperty("idWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default int insertMultiple(Collection<Rules> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, rules, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(rulename).toProperty("rulename")
            .map(idCondition).toProperty("idCondition")
            .map(idWorkflow).toProperty("idWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1012686+01:00", comments="Source Table: dumb_brms.rules")
    default int insertSelective(Rules row) {
        return MyBatis3Utils.insert(this::insert, row, rules, c ->
            c.map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(salience).toPropertyWhenPresent("salience", row::getSalience)
            .map(rulename).toPropertyWhenPresent("rulename", row::getRulename)
            .map(idCondition).toPropertyWhenPresent("idCondition", row::getIdCondition)
            .map(idWorkflow).toPropertyWhenPresent("idWorkflow", row::getIdWorkflow)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default Optional<Rules> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default List<Rules> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default List<Rules> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default Optional<Rules> selectByPrimaryKey(Long ruleId_) {
        return selectOne(c ->
            c.where(ruleId, isEqualTo(ruleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    static UpdateDSL<UpdateModel> updateAllColumns(Rules row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalTo(row::getRuleId)
                .set(projectId).equalTo(row::getProjectId)
                .set(salience).equalTo(row::getSalience)
                .set(rulename).equalTo(row::getRulename)
                .set(idCondition).equalTo(row::getIdCondition)
                .set(idWorkflow).equalTo(row::getIdWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Rules row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(projectId).equalToWhenPresent(row::getProjectId)
                .set(salience).equalToWhenPresent(row::getSalience)
                .set(rulename).equalToWhenPresent(row::getRulename)
                .set(idCondition).equalToWhenPresent(row::getIdCondition)
                .set(idWorkflow).equalToWhenPresent(row::getIdWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default int updateByPrimaryKey(Rules row) {
        return update(c ->
            c.set(projectId).equalTo(row::getProjectId)
            .set(salience).equalTo(row::getSalience)
            .set(rulename).equalTo(row::getRulename)
            .set(idCondition).equalTo(row::getIdCondition)
            .set(idWorkflow).equalTo(row::getIdWorkflow)
            .where(ruleId, isEqualTo(row::getRuleId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1022641+01:00", comments="Source Table: dumb_brms.rules")
    default int updateByPrimaryKeySelective(Rules row) {
        return update(c ->
            c.set(projectId).equalToWhenPresent(row::getProjectId)
            .set(salience).equalToWhenPresent(row::getSalience)
            .set(rulename).equalToWhenPresent(row::getRulename)
            .set(idCondition).equalToWhenPresent(row::getIdCondition)
            .set(idWorkflow).equalToWhenPresent(row::getIdWorkflow)
            .where(ruleId, isEqualTo(row::getRuleId))
        );
    }
}