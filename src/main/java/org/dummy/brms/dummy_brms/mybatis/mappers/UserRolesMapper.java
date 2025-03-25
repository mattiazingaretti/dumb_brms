package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.UserRolesDynamicSqlSupport.*;

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
import org.dummy.brms.dummy_brms.mybatis.pojo.UserRoles;
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
public interface UserRolesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UserRoles>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9665331+01:00", comments="Source Table: dumb_brms.user_roles")
    BasicColumn[] selectList = BasicColumn.columnList(userId, userRole);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9635527+01:00", comments="Source Table: dumb_brms.user_roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserRolesResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_role", property="userRole", jdbcType=JdbcType.VARCHAR)
    })
    List<UserRoles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9635527+01:00", comments="Source Table: dumb_brms.user_roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserRolesResult")
    Optional<UserRoles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9635527+01:00", comments="Source Table: dumb_brms.user_roles")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9645489+01:00", comments="Source Table: dumb_brms.user_roles")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9645489+01:00", comments="Source Table: dumb_brms.user_roles")
    default int insert(UserRoles row) {
        return MyBatis3Utils.insert(this::insert, row, userRoles, c ->
            c.map(userId).toProperty("userId")
            .map(userRole).toProperty("userRole")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9655325+01:00", comments="Source Table: dumb_brms.user_roles")
    default int insertMultiple(Collection<UserRoles> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userRoles, c ->
            c.map(userId).toProperty("userId")
            .map(userRole).toProperty("userRole")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9655325+01:00", comments="Source Table: dumb_brms.user_roles")
    default int insertSelective(UserRoles row) {
        return MyBatis3Utils.insert(this::insert, row, userRoles, c ->
            c.map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(userRole).toPropertyWhenPresent("userRole", row::getUserRole)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9665331+01:00", comments="Source Table: dumb_brms.user_roles")
    default Optional<UserRoles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9675328+01:00", comments="Source Table: dumb_brms.user_roles")
    default List<UserRoles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9675328+01:00", comments="Source Table: dumb_brms.user_roles")
    default List<UserRoles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9675328+01:00", comments="Source Table: dumb_brms.user_roles")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9675328+01:00", comments="Source Table: dumb_brms.user_roles")
    static UpdateDSL<UpdateModel> updateAllColumns(UserRoles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(row::getUserId)
                .set(userRole).equalTo(row::getUserRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9685326+01:00", comments="Source Table: dumb_brms.user_roles")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserRoles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(row::getUserId)
                .set(userRole).equalToWhenPresent(row::getUserRole);
    }
}