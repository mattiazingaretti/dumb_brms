package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.ActionsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Actions;
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
public interface ActionsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Actions>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    BasicColumn[] selectList = BasicColumn.columnList(actionName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActionsResult", value = {
        @Result(column="action_name", property="actionName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<Actions> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ActionsResult")
    Optional<Actions> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int deleteByPrimaryKey(String actionName_) {
        return delete(c -> 
            c.where(actionName, isEqualTo(actionName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int insert(Actions row) {
        return MyBatis3Utils.insert(this::insert, row, actions, c ->
            c.map(actionName).toProperty("actionName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int insertMultiple(Collection<Actions> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, actions, c ->
            c.map(actionName).toProperty("actionName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int insertSelective(Actions row) {
        return MyBatis3Utils.insert(this::insert, row, actions, c ->
            c.map(actionName).toPropertyWhenPresent("actionName", row::getActionName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default Optional<Actions> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default List<Actions> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default List<Actions> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, actions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    static UpdateDSL<UpdateModel> updateAllColumns(Actions row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(actionName).equalTo(row::getActionName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7307801+01:00", comments="Source Table: dumb_brms.actions")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Actions row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(actionName).equalToWhenPresent(row::getActionName);
    }
}