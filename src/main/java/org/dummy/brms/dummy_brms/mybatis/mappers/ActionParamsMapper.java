package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.ActionParamsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.ActionParams;
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
public interface ActionParamsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ActionParams>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    BasicColumn[] selectList = BasicColumn.columnList(action, paramName, paramType, paramDirection);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.action_params")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActionParamsResult", value = {
        @Result(column="action", property="action", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="param_name", property="paramName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_direction", property="paramDirection", jdbcType=JdbcType.VARCHAR)
    })
    List<ActionParams> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.action_params")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ActionParamsResult")
    Optional<ActionParams> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int deleteByPrimaryKey(String action_, String paramName_) {
        return delete(c -> 
            c.where(action, isEqualTo(action_))
            .and(paramName, isEqualTo(paramName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int insert(ActionParams row) {
        return MyBatis3Utils.insert(this::insert, row, actionParams, c ->
            c.map(action).toProperty("action")
            .map(paramName).toProperty("paramName")
            .map(paramType).toProperty("paramType")
            .map(paramDirection).toProperty("paramDirection")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int insertMultiple(Collection<ActionParams> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, actionParams, c ->
            c.map(action).toProperty("action")
            .map(paramName).toProperty("paramName")
            .map(paramType).toProperty("paramType")
            .map(paramDirection).toProperty("paramDirection")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int insertSelective(ActionParams row) {
        return MyBatis3Utils.insert(this::insert, row, actionParams, c ->
            c.map(action).toPropertyWhenPresent("action", row::getAction)
            .map(paramName).toPropertyWhenPresent("paramName", row::getParamName)
            .map(paramType).toPropertyWhenPresent("paramType", row::getParamType)
            .map(paramDirection).toPropertyWhenPresent("paramDirection", row::getParamDirection)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default Optional<ActionParams> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default List<ActionParams> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default List<ActionParams> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default Optional<ActionParams> selectByPrimaryKey(String action_, String paramName_) {
        return selectOne(c ->
            c.where(action, isEqualTo(action_))
            .and(paramName, isEqualTo(paramName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, actionParams, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    static UpdateDSL<UpdateModel> updateAllColumns(ActionParams row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(action).equalTo(row::getAction)
                .set(paramName).equalTo(row::getParamName)
                .set(paramType).equalTo(row::getParamType)
                .set(paramDirection).equalTo(row::getParamDirection);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ActionParams row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(action).equalToWhenPresent(row::getAction)
                .set(paramName).equalToWhenPresent(row::getParamName)
                .set(paramType).equalToWhenPresent(row::getParamType)
                .set(paramDirection).equalToWhenPresent(row::getParamDirection);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int updateByPrimaryKey(ActionParams row) {
        return update(c ->
            c.set(paramType).equalTo(row::getParamType)
            .set(paramDirection).equalTo(row::getParamDirection)
            .where(action, isEqualTo(row::getAction))
            .and(paramName, isEqualTo(row::getParamName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7317801+01:00", comments="Source Table: dumb_brms.action_params")
    default int updateByPrimaryKeySelective(ActionParams row) {
        return update(c ->
            c.set(paramType).equalToWhenPresent(row::getParamType)
            .set(paramDirection).equalToWhenPresent(row::getParamDirection)
            .where(action, isEqualTo(row::getAction))
            .and(paramName, isEqualTo(row::getParamName))
        );
    }
}