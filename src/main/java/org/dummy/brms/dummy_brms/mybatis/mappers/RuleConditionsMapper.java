package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleConditionsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleConditions;
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
public interface RuleConditionsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleConditions>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    BasicColumn[] selectList = BasicColumn.columnList(idCondition, ruleId, conditionNameId, classname, field, operator, value, flgUseIdConditions);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleConditionsResult", value = {
        @Result(column="id_condition", property="idCondition", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT),
        @Result(column="condition_name_id", property="conditionNameId", jdbcType=JdbcType.VARCHAR),
        @Result(column="classname", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="field", property="field", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.OTHER),
        @Result(column="flg_use_id_conditions", property="flgUseIdConditions", jdbcType=JdbcType.BIT)
    })
    List<RuleConditions> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleConditionsResult")
    Optional<RuleConditions> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int deleteByPrimaryKey(Long idCondition_) {
        return delete(c -> 
            c.where(idCondition, isEqualTo(idCondition_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int insert(RuleConditions row) {
        return MyBatis3Utils.insert(this::insert, row, ruleConditions, c ->
            c.map(idCondition).toProperty("idCondition")
            .map(ruleId).toProperty("ruleId")
            .map(conditionNameId).toProperty("conditionNameId")
            .map(classname).toProperty("classname")
            .map(field).toProperty("field")
            .map(operator).toProperty("operator")
            .map(value).toProperty("value")
            .map(flgUseIdConditions).toProperty("flgUseIdConditions")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int insertMultiple(Collection<RuleConditions> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleConditions, c ->
            c.map(idCondition).toProperty("idCondition")
            .map(ruleId).toProperty("ruleId")
            .map(conditionNameId).toProperty("conditionNameId")
            .map(classname).toProperty("classname")
            .map(field).toProperty("field")
            .map(operator).toProperty("operator")
            .map(value).toProperty("value")
            .map(flgUseIdConditions).toProperty("flgUseIdConditions")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int insertSelective(RuleConditions row) {
        return MyBatis3Utils.insert(this::insert, row, ruleConditions, c ->
            c.map(idCondition).toPropertyWhenPresent("idCondition", row::getIdCondition)
            .map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(conditionNameId).toPropertyWhenPresent("conditionNameId", row::getConditionNameId)
            .map(classname).toPropertyWhenPresent("classname", row::getClassname)
            .map(field).toPropertyWhenPresent("field", row::getField)
            .map(operator).toPropertyWhenPresent("operator", row::getOperator)
            .map(value).toPropertyWhenPresent("value", row::getValue)
            .map(flgUseIdConditions).toPropertyWhenPresent("flgUseIdConditions", row::getFlgUseIdConditions)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default Optional<RuleConditions> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default List<RuleConditions> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default List<RuleConditions> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default Optional<RuleConditions> selectByPrimaryKey(Long idCondition_) {
        return selectOne(c ->
            c.where(idCondition, isEqualTo(idCondition_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleConditions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleConditions row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(idCondition).equalTo(row::getIdCondition)
                .set(ruleId).equalTo(row::getRuleId)
                .set(conditionNameId).equalTo(row::getConditionNameId)
                .set(classname).equalTo(row::getClassname)
                .set(field).equalTo(row::getField)
                .set(operator).equalTo(row::getOperator)
                .set(value).equalTo(row::getValue)
                .set(flgUseIdConditions).equalTo(row::getFlgUseIdConditions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleConditions row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(idCondition).equalToWhenPresent(row::getIdCondition)
                .set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(conditionNameId).equalToWhenPresent(row::getConditionNameId)
                .set(classname).equalToWhenPresent(row::getClassname)
                .set(field).equalToWhenPresent(row::getField)
                .set(operator).equalToWhenPresent(row::getOperator)
                .set(value).equalToWhenPresent(row::getValue)
                .set(flgUseIdConditions).equalToWhenPresent(row::getFlgUseIdConditions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int updateByPrimaryKey(RuleConditions row) {
        return update(c ->
            c.set(ruleId).equalTo(row::getRuleId)
            .set(conditionNameId).equalTo(row::getConditionNameId)
            .set(classname).equalTo(row::getClassname)
            .set(field).equalTo(row::getField)
            .set(operator).equalTo(row::getOperator)
            .set(value).equalTo(row::getValue)
            .set(flgUseIdConditions).equalTo(row::getFlgUseIdConditions)
            .where(idCondition, isEqualTo(row::getIdCondition))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8714786+01:00", comments="Source Table: dumb_brms.rule_conditions")
    default int updateByPrimaryKeySelective(RuleConditions row) {
        return update(c ->
            c.set(ruleId).equalToWhenPresent(row::getRuleId)
            .set(conditionNameId).equalToWhenPresent(row::getConditionNameId)
            .set(classname).equalToWhenPresent(row::getClassname)
            .set(field).equalToWhenPresent(row::getField)
            .set(operator).equalToWhenPresent(row::getOperator)
            .set(value).equalToWhenPresent(row::getValue)
            .set(flgUseIdConditions).equalToWhenPresent(row::getFlgUseIdConditions)
            .where(idCondition, isEqualTo(row::getIdCondition))
        );
    }
}