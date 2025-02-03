package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RuleDataTypesDynamicSqlSupport.*;
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
import org.dummy.brms.dummy_brms.mybatis.pojo.RuleDataTypes;
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
public interface RuleDataTypesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RuleDataTypes>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    BasicColumn[] selectList = BasicColumn.columnList(dataType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RuleDataTypesResult", value = {
        @Result(column="data_type", property="dataType", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<RuleDataTypes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RuleDataTypesResult")
    Optional<RuleDataTypes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int deleteByPrimaryKey(String dataType_) {
        return delete(c -> 
            c.where(dataType, isEqualTo(dataType_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int insert(RuleDataTypes row) {
        return MyBatis3Utils.insert(this::insert, row, ruleDataTypes, c ->
            c.map(dataType).toProperty("dataType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int insertMultiple(Collection<RuleDataTypes> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, ruleDataTypes, c ->
            c.map(dataType).toProperty("dataType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int insertSelective(RuleDataTypes row) {
        return MyBatis3Utils.insert(this::insert, row, ruleDataTypes, c ->
            c.map(dataType).toPropertyWhenPresent("dataType", row::getDataType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default Optional<RuleDataTypes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7738868+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default List<RuleDataTypes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7738868+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default List<RuleDataTypes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7738868+01:00", comments="Source Table: dumb_brms.rule_data_types")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ruleDataTypes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7738868+01:00", comments="Source Table: dumb_brms.rule_data_types")
    static UpdateDSL<UpdateModel> updateAllColumns(RuleDataTypes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dataType).equalTo(row::getDataType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7738868+01:00", comments="Source Table: dumb_brms.rule_data_types")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RuleDataTypes row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dataType).equalToWhenPresent(row::getDataType);
    }
}