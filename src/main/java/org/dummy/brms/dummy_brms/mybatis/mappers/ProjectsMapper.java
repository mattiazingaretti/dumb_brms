package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.ProjectsDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.Projects;
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
public interface ProjectsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Projects>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    BasicColumn[] selectList = BasicColumn.columnList(id, userId, projectName, lastUpdate, creationDatetime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProjectsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="creation_datetime", property="creationDatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Projects> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProjectsResult")
    Optional<Projects> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default int insert(Projects row) {
        return MyBatis3Utils.insert(this::insert, row, projects, c ->
            c.map(id).toProperty("id")
            .map(userId).toProperty("userId")
            .map(projectName).toProperty("projectName")
            .map(lastUpdate).toProperty("lastUpdate")
            .map(creationDatetime).toProperty("creationDatetime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default int insertMultiple(Collection<Projects> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, projects, c ->
            c.map(id).toProperty("id")
            .map(userId).toProperty("userId")
            .map(projectName).toProperty("projectName")
            .map(lastUpdate).toProperty("lastUpdate")
            .map(creationDatetime).toProperty("creationDatetime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default int insertSelective(Projects row) {
        return MyBatis3Utils.insert(this::insert, row, projects, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(projectName).toPropertyWhenPresent("projectName", row::getProjectName)
            .map(lastUpdate).toPropertyWhenPresent("lastUpdate", row::getLastUpdate)
            .map(creationDatetime).toPropertyWhenPresent("creationDatetime", row::getCreationDatetime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default Optional<Projects> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4916166+01:00", comments="Source Table: dumb_brms.projects")
    default List<Projects> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    default List<Projects> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    default Optional<Projects> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, projects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    static UpdateDSL<UpdateModel> updateAllColumns(Projects row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(userId).equalTo(row::getUserId)
                .set(projectName).equalTo(row::getProjectName)
                .set(lastUpdate).equalTo(row::getLastUpdate)
                .set(creationDatetime).equalTo(row::getCreationDatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Projects row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(projectName).equalToWhenPresent(row::getProjectName)
                .set(lastUpdate).equalToWhenPresent(row::getLastUpdate)
                .set(creationDatetime).equalToWhenPresent(row::getCreationDatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    default int updateByPrimaryKey(Projects row) {
        return update(c ->
            c.set(userId).equalTo(row::getUserId)
            .set(projectName).equalTo(row::getProjectName)
            .set(lastUpdate).equalTo(row::getLastUpdate)
            .set(creationDatetime).equalTo(row::getCreationDatetime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4926195+01:00", comments="Source Table: dumb_brms.projects")
    default int updateByPrimaryKeySelective(Projects row) {
        return update(c ->
            c.set(userId).equalToWhenPresent(row::getUserId)
            .set(projectName).equalToWhenPresent(row::getProjectName)
            .set(lastUpdate).equalToWhenPresent(row::getLastUpdate)
            .set(creationDatetime).equalToWhenPresent(row::getCreationDatetime)
            .where(id, isEqualTo(row::getId))
        );
    }
}