package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.OutputDataTypesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.OutputDataTypes;
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
public interface OutputDataTypesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OutputDataTypes>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    BasicColumn[] selectList = BasicColumn.columnList(userId, projectId, dataTypeName, dataTypeDescr, flgDeleted);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OutputDataTypesResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="data_type_name", property="dataTypeName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="data_type_descr", property="dataTypeDescr", jdbcType=JdbcType.VARCHAR),
        @Result(column="flg_deleted", property="flgDeleted", jdbcType=JdbcType.BIT)
    })
    List<OutputDataTypes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OutputDataTypesResult")
    Optional<OutputDataTypes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int deleteByPrimaryKey(Long userId_, Long projectId_, String dataTypeName_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
            .and(projectId, isEqualTo(projectId_))
            .and(dataTypeName, isEqualTo(dataTypeName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int insert(OutputDataTypes row) {
        return MyBatis3Utils.insert(this::insert, row, outputDataTypes, c ->
            c.map(userId).toProperty("userId")
            .map(projectId).toProperty("projectId")
            .map(dataTypeName).toProperty("dataTypeName")
            .map(dataTypeDescr).toProperty("dataTypeDescr")
            .map(flgDeleted).toProperty("flgDeleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int insertMultiple(Collection<OutputDataTypes> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, outputDataTypes, c ->
            c.map(userId).toProperty("userId")
            .map(projectId).toProperty("projectId")
            .map(dataTypeName).toProperty("dataTypeName")
            .map(dataTypeDescr).toProperty("dataTypeDescr")
            .map(flgDeleted).toProperty("flgDeleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2615159+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int insertSelective(OutputDataTypes row) {
        return MyBatis3Utils.insert(this::insert, row, outputDataTypes, c ->
            c.map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(projectId).toPropertyWhenPresent("projectId", row::getProjectId)
            .map(dataTypeName).toPropertyWhenPresent("dataTypeName", row::getDataTypeName)
            .map(dataTypeDescr).toPropertyWhenPresent("dataTypeDescr", row::getDataTypeDescr)
            .map(flgDeleted).toPropertyWhenPresent("flgDeleted", row::getFlgDeleted)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default Optional<OutputDataTypes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default List<OutputDataTypes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default List<OutputDataTypes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default Optional<OutputDataTypes> selectByPrimaryKey(Long userId_, Long projectId_, String dataTypeName_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
            .and(projectId, isEqualTo(projectId_))
            .and(dataTypeName, isEqualTo(dataTypeName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, outputDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    static UpdateDSL<UpdateModel> updateAllColumns(OutputDataTypes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(row::getUserId)
                .set(projectId).equalTo(row::getProjectId)
                .set(dataTypeName).equalTo(row::getDataTypeName)
                .set(dataTypeDescr).equalTo(row::getDataTypeDescr)
                .set(flgDeleted).equalTo(row::getFlgDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OutputDataTypes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(row::getUserId)
                .set(projectId).equalToWhenPresent(row::getProjectId)
                .set(dataTypeName).equalToWhenPresent(row::getDataTypeName)
                .set(dataTypeDescr).equalToWhenPresent(row::getDataTypeDescr)
                .set(flgDeleted).equalToWhenPresent(row::getFlgDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int updateByPrimaryKey(OutputDataTypes row) {
        return update(c ->
            c.set(dataTypeDescr).equalTo(row::getDataTypeDescr)
            .set(flgDeleted).equalTo(row::getFlgDeleted)
            .where(userId, isEqualTo(row::getUserId))
            .and(projectId, isEqualTo(row::getProjectId))
            .and(dataTypeName, isEqualTo(row::getDataTypeName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2625171+01:00", comments="Source Table: dumb_brms.output_data_types")
    default int updateByPrimaryKeySelective(OutputDataTypes row) {
        return update(c ->
            c.set(dataTypeDescr).equalToWhenPresent(row::getDataTypeDescr)
            .set(flgDeleted).equalToWhenPresent(row::getFlgDeleted)
            .where(userId, isEqualTo(row::getUserId))
            .and(projectId, isEqualTo(row::getProjectId))
            .and(dataTypeName, isEqualTo(row::getDataTypeName))
        );
    }
}