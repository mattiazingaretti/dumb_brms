package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RolesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Roles;
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
public interface RolesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Roles>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    BasicColumn[] selectList = BasicColumn.columnList(role);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RolesResult", value = {
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<Roles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RolesResult")
    Optional<Roles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int deleteByPrimaryKey(String role_) {
        return delete(c -> 
            c.where(role, isEqualTo(role_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int insert(Roles row) {
        return MyBatis3Utils.insert(this::insert, row, roles, c ->
            c.map(role).toProperty("role")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int insertMultiple(Collection<Roles> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, roles, c ->
            c.map(role).toProperty("role")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int insertSelective(Roles row) {
        return MyBatis3Utils.insert(this::insert, row, roles, c ->
            c.map(role).toPropertyWhenPresent("role", row::getRole)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default Optional<Roles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default List<Roles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default List<Roles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    static UpdateDSL<UpdateModel> updateAllColumns(Roles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(role).equalTo(row::getRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.855402+01:00", comments="Source Table: dumb_brms.roles")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Roles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(role).equalToWhenPresent(row::getRole);
    }
}