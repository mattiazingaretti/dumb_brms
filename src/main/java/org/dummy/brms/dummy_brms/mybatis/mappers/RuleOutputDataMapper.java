package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleOutputDataDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleOutputData;
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
public interface RuleOutputDataMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleOutputData>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    BasicColumn[] selectList = BasicColumn.columnList(projectId, rodClass, userId, rodDescription);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6050211+01:00", comments="Source Table: dumb_brms.rule_output_data")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleOutputDataResult", value = {
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="rod_class", property="rodClass", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="rod_description", property="rodDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<RuleOutputData> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6050211+01:00", comments="Source Table: dumb_brms.rule_output_data")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleOutputDataResult")
    Optional<RuleOutputData> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6050211+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int deleteByPrimaryKey(Long projectId_, String rodClass_) {
        return delete(c -> 
            c.where(projectId, isEqualTo(projectId_))
            .and(rodClass, isEqualTo(rodClass_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int insert(RuleOutputData row) {
        return MyBatis3Utils.insert(this::insert, row, ruleOutputData, c ->
            c.map(projectId).toProperty("projectId")
            .map(rodClass).toProperty("rodClass")
            .map(userId).toProperty("userId")
            .map(rodDescription).toProperty("rodDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int insertMultiple(Collection<RuleOutputData> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleOutputData, c ->
            c.map(projectId).toProperty("projectId")
            .map(rodClass).toProperty("rodClass")
            .map(userId).toProperty("userId")
            .map(rodDescription).toProperty("rodDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int insertSelective(RuleOutputData row) {
        return MyBatis3Utils.insert(this::insert, row, ruleOutputData, c ->
            c.map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(rodClass).toPropertyWhenPresent("rodClass", row::getRodClass)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(rodDescription).toPropertyWhenPresent("rodDescription", row::getRodDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default Optional<RuleOutputData> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default List<RuleOutputData> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default List<RuleOutputData> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default Optional<RuleOutputData> selectByPrimaryKey(Long projectId_, String rodClass_) {
        return selectOne(c ->
            c.where(projectId, isEqualTo(projectId_))
            .and(rodClass, isEqualTo(rodClass_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleOutputData, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleOutputData row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalTo(row::getProjectId)
                .set(rodClass).equalTo(row::getRodClass)
                .set(userId).equalTo(row::getUserId)
                .set(rodDescription).equalTo(row::getRodDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleOutputData row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(projectId).equalToWhenPresent(row::getProjectId)
                .set(rodClass).equalToWhenPresent(row::getRodClass)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(rodDescription).equalToWhenPresent(row::getRodDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int updateByPrimaryKey(RuleOutputData row) {
        return update(c ->
            c.set(userId).equalTo(row::getUserId)
            .set(rodDescription).equalTo(row::getRodDescription)
            .where(projectId, isEqualTo(row::getProjectId))
            .and(rodClass, isEqualTo(row::getRodClass))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:05:09.6060213+01:00", comments="Source Table: dumb_brms.rule_output_data")
    default int updateByPrimaryKeySelective(RuleOutputData row) {
        return update(c ->
            c.set(userId).equalToWhenPresent(row::getUserId)
            .set(rodDescription).equalToWhenPresent(row::getRodDescription)
            .where(projectId, isEqualTo(row::getProjectId))
            .and(rodClass, isEqualTo(row::getRodClass))
        );
    }
}