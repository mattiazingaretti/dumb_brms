package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.VUsersDynamicSqlSupport.*;

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
import org.dummy.brms.dummy_brms.mybatis.pojo.VUsers;
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
public interface VUsersMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<VUsers>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, pswHash, email, userRole);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.v_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VUsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="psw_hash", property="pswHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_role", property="userRole", jdbcType=JdbcType.VARCHAR)
    })
    List<VUsers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VUsersResult")
    Optional<VUsers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default int insert(VUsers row) {
        return MyBatis3Utils.insert(this::insert, row, VUsers, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(pswHash).toProperty("pswHash")
            .map(email).toProperty("email")
            .map(userRole).toProperty("userRole")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default int insertMultiple(Collection<VUsers> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, VUsers, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(pswHash).toProperty("pswHash")
            .map(email).toProperty("email")
            .map(userRole).toProperty("userRole")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default int insertSelective(VUsers row) {
        return MyBatis3Utils.insert(this::insert, row, VUsers, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(pswHash).toPropertyWhenPresent("pswHash", row::getPswHash)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(userRole).toPropertyWhenPresent("userRole", row::getUserRole)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default Optional<VUsers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default List<VUsers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default List<VUsers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, VUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    static UpdateDSL<UpdateModel> updateAllColumns(VUsers row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername)
                .set(pswHash).equalTo(row::getPswHash)
                .set(email).equalTo(row::getEmail)
                .set(userRole).equalTo(row::getUserRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7222706+01:00", comments="Source Table: dumb_brms.v_users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VUsers row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(pswHash).equalToWhenPresent(row::getPswHash)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(userRole).equalToWhenPresent(row::getUserRole);
    }
}