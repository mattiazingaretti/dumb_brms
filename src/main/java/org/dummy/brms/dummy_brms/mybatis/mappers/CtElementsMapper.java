package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.CtElementsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.CtElements;
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
public interface CtElementsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CtElements>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    BasicColumn[] selectList = BasicColumn.columnList(groupCode, elementCode, elementDescr, filter, lastUpdate);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CtElementsResult", value = {
        @Result(column="group_code", property="groupCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="element_code", property="elementCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="element_descr", property="elementDescr", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="filter", property="filter", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CtElements> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CtElementsResult")
    Optional<CtElements> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int deleteByPrimaryKey(String groupCode_, String elementCode_, String elementDescr_) {
        return delete(c -> 
            c.where(groupCode, isEqualTo(groupCode_))
            .and(elementCode, isEqualTo(elementCode_))
            .and(elementDescr, isEqualTo(elementDescr_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int insert(CtElements row) {
        return MyBatis3Utils.insert(this::insert, row, ctElements, c ->
            c.map(groupCode).toProperty("groupCode")
            .map(elementCode).toProperty("elementCode")
            .map(elementDescr).toProperty("elementDescr")
            .map(filter).toProperty("filter")
            .map(lastUpdate).toProperty("lastUpdate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int insertMultiple(Collection<CtElements> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ctElements, c ->
            c.map(groupCode).toProperty("groupCode")
            .map(elementCode).toProperty("elementCode")
            .map(elementDescr).toProperty("elementDescr")
            .map(filter).toProperty("filter")
            .map(lastUpdate).toProperty("lastUpdate")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int insertSelective(CtElements row) {
        return MyBatis3Utils.insert(this::insert, row, ctElements, c ->
            c.map(groupCode).toPropertyWhenPresent("groupCode", row::getGroupCode)
            .map(elementCode).toPropertyWhenPresent("elementCode", row::getElementCode)
            .map(elementDescr).toPropertyWhenPresent("elementDescr", row::getElementDescr)
            .map(filter).toPropertyWhenPresent("filter", row::getFilter)
            .map(lastUpdate).toPropertyWhenPresent("lastUpdate", row::getLastUpdate)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default Optional<CtElements> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default List<CtElements> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default List<CtElements> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default Optional<CtElements> selectByPrimaryKey(String groupCode_, String elementCode_, String elementDescr_) {
        return selectOne(c ->
            c.where(groupCode, isEqualTo(groupCode_))
            .and(elementCode, isEqualTo(elementCode_))
            .and(elementDescr, isEqualTo(elementDescr_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ctElements, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    static UpdateDSL<UpdateModel> updateAllColumns(CtElements row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(groupCode).equalTo(row::getGroupCode)
                .set(elementCode).equalTo(row::getElementCode)
                .set(elementDescr).equalTo(row::getElementDescr)
                .set(filter).equalTo(row::getFilter)
                .set(lastUpdate).equalTo(row::getLastUpdate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CtElements row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(groupCode).equalToWhenPresent(row::getGroupCode)
                .set(elementCode).equalToWhenPresent(row::getElementCode)
                .set(elementDescr).equalToWhenPresent(row::getElementDescr)
                .set(filter).equalToWhenPresent(row::getFilter)
                .set(lastUpdate).equalToWhenPresent(row::getLastUpdate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int updateByPrimaryKey(CtElements row) {
        return update(c ->
            c.set(filter).equalTo(row::getFilter)
            .set(lastUpdate).equalTo(row::getLastUpdate)
            .where(groupCode, isEqualTo(row::getGroupCode))
            .and(elementCode, isEqualTo(row::getElementCode))
            .and(elementDescr, isEqualTo(row::getElementDescr))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7232698+01:00", comments="Source Table: dumb_brms.ct_elements")
    default int updateByPrimaryKeySelective(CtElements row) {
        return update(c ->
            c.set(filter).equalToWhenPresent(row::getFilter)
            .set(lastUpdate).equalToWhenPresent(row::getLastUpdate)
            .where(groupCode, isEqualTo(row::getGroupCode))
            .and(elementCode, isEqualTo(row::getElementCode))
            .and(elementDescr, isEqualTo(row::getElementDescr))
        );
    }
}