package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.GroupCodesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.GroupCodes;
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
public interface GroupCodesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<GroupCodes>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    BasicColumn[] selectList = BasicColumn.columnList(groupCode, groupCodeDescr);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GroupCodesResult", value = {
        @Result(column="group_code", property="groupCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="group_code_descr", property="groupCodeDescr", jdbcType=JdbcType.VARCHAR)
    })
    List<GroupCodes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GroupCodesResult")
    Optional<GroupCodes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    default int deleteByPrimaryKey(String groupCode_) {
        return delete(c -> 
            c.where(groupCode, isEqualTo(groupCode_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.087743+01:00", comments="Source Table: dumb_brms.group_codes")
    default int insert(GroupCodes row) {
        return MyBatis3Utils.insert(this::insert, row, groupCodes, c ->
            c.map(groupCode).toProperty("groupCode")
            .map(groupCodeDescr).toProperty("groupCodeDescr")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default int insertMultiple(Collection<GroupCodes> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, groupCodes, c ->
            c.map(groupCode).toProperty("groupCode")
            .map(groupCodeDescr).toProperty("groupCodeDescr")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default int insertSelective(GroupCodes row) {
        return MyBatis3Utils.insert(this::insert, row, groupCodes, c ->
            c.map(groupCode).toPropertyWhenPresent("groupCode", row::getGroupCode)
            .map(groupCodeDescr).toPropertyWhenPresent("groupCodeDescr", row::getGroupCodeDescr)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default Optional<GroupCodes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default List<GroupCodes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default List<GroupCodes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default Optional<GroupCodes> selectByPrimaryKey(String groupCode_) {
        return selectOne(c ->
            c.where(groupCode, isEqualTo(groupCode_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, groupCodes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    static UpdateDSL<UpdateModel> updateAllColumns(GroupCodes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(groupCode).equalTo(row::getGroupCode)
                .set(groupCodeDescr).equalTo(row::getGroupCodeDescr);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GroupCodes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(groupCode).equalToWhenPresent(row::getGroupCode)
                .set(groupCodeDescr).equalToWhenPresent(row::getGroupCodeDescr);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default int updateByPrimaryKey(GroupCodes row) {
        return update(c ->
            c.set(groupCodeDescr).equalTo(row::getGroupCodeDescr)
            .where(groupCode, isEqualTo(row::getGroupCode))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0887441+01:00", comments="Source Table: dumb_brms.group_codes")
    default int updateByPrimaryKeySelective(GroupCodes row) {
        return update(c ->
            c.set(groupCodeDescr).equalToWhenPresent(row::getGroupCodeDescr)
            .where(groupCode, isEqualTo(row::getGroupCode))
        );
    }
}