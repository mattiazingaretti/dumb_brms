package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.UsersDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Users;
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
public interface UsersMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Users>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, pswHash, email, flgDeleted);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="psw_hash", property="pswHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="flg_deleted", property="flgDeleted", jdbcType=JdbcType.BIT)
    })
    List<Users> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UsersResult")
    Optional<Users> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default int insert(Users row) {
        return MyBatis3Utils.insert(this::insert, row, users, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(pswHash).toProperty("pswHash")
            .map(email).toProperty("email")
            .map(flgDeleted).toProperty("flgDeleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default int insertMultiple(Collection<Users> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, users, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(pswHash).toProperty("pswHash")
            .map(email).toProperty("email")
            .map(flgDeleted).toProperty("flgDeleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default int insertSelective(Users row) {
        return MyBatis3Utils.insert(this::insert, row, users, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(pswHash).toPropertyWhenPresent("pswHash", row::getPswHash)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(flgDeleted).toPropertyWhenPresent("flgDeleted", row::getFlgDeleted)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7202703+01:00", comments="Source Table: dumb_brms.users")
    default Optional<Users> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default List<Users> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default List<Users> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default Optional<Users> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    static UpdateDSL<UpdateModel> updateAllColumns(Users row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername)
                .set(pswHash).equalTo(row::getPswHash)
                .set(email).equalTo(row::getEmail)
                .set(flgDeleted).equalTo(row::getFlgDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Users row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(pswHash).equalToWhenPresent(row::getPswHash)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(flgDeleted).equalToWhenPresent(row::getFlgDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default int updateByPrimaryKey(Users row) {
        return update(c ->
            c.set(username).equalTo(row::getUsername)
            .set(pswHash).equalTo(row::getPswHash)
            .set(email).equalTo(row::getEmail)
            .set(flgDeleted).equalTo(row::getFlgDeleted)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7212701+01:00", comments="Source Table: dumb_brms.users")
    default int updateByPrimaryKeySelective(Users row) {
        return update(c ->
            c.set(username).equalToWhenPresent(row::getUsername)
            .set(pswHash).equalToWhenPresent(row::getPswHash)
            .set(email).equalToWhenPresent(row::getEmail)
            .set(flgDeleted).equalToWhenPresent(row::getFlgDeleted)
            .where(id, isEqualTo(row::getId))
        );
    }
}