package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RulesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Rules;
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
public interface RulesMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    BasicColumn[] selectList = BasicColumn.columnList(ruleId, projectId, salience, ruleName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source Table: dumb_brms.rules")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.ruleId")
    int insert(InsertStatementProvider<Rules> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9895335+01:00", comments="Source Table: dumb_brms.rules")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.ruleId")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<Rules> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9895335+01:00", comments="Source Table: dumb_brms.rules")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RulesResult", value = {
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT),
        @Result(column="salience", property="salience", jdbcType=JdbcType.INTEGER),
        @Result(column="rule_name", property="ruleName", jdbcType=JdbcType.VARCHAR)
    })
    List<Rules> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RulesResult")
    Optional<Rules> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int deleteByPrimaryKey(Long ruleId_) {
        return delete(c -> 
            c.where(ruleId, isEqualTo(ruleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int insert(Rules row) {
        return MyBatis3Utils.insert(this::insert, row, rules, c ->
            c.map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(ruleName).toProperty("ruleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int insertMultiple(Collection<Rules> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, rules, c ->
            c.map(projectId).toProperty("projectId")
            .map(salience).toProperty("salience")
            .map(ruleName).toProperty("ruleName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int insertSelective(Rules row) {
        return MyBatis3Utils.insert(this::insert, row, rules, c ->
            c.map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(salience).toPropertyWhenPresent("salience", row::getSalience)
            .map(ruleName).toPropertyWhenPresent("ruleName", row::getRuleName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default Optional<Rules> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default List<Rules> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default List<Rules> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default Optional<Rules> selectByPrimaryKey(Long ruleId_) {
        return selectOne(c ->
            c.where(ruleId, isEqualTo(ruleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rules, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    static UpdateDSL<UpdateModel> updateAllColumns(Rules row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalTo(row::getProjectId)
                .set(salience).equalTo(row::getSalience)
                .set(ruleName).equalTo(row::getRuleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Rules row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalToWhenPresent(row::getProjectId)
                .set(salience).equalToWhenPresent(row::getSalience)
                .set(ruleName).equalToWhenPresent(row::getRuleName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int updateByPrimaryKey(Rules row) {
        return update(c ->
            c.set(projectId).equalTo(row::getProjectId)
            .set(salience).equalTo(row::getSalience)
            .set(ruleName).equalTo(row::getRuleName)
            .where(ruleId, isEqualTo(row::getRuleId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9905345+01:00", comments="Source Table: dumb_brms.rules")
    default int updateByPrimaryKeySelective(Rules row) {
        return update(c ->
            c.set(projectId).equalToWhenPresent(row::getProjectId)
            .set(salience).equalToWhenPresent(row::getSalience)
            .set(ruleName).equalToWhenPresent(row::getRuleName)
            .where(ruleId, isEqualTo(row::getRuleId))
        );
    }
}