package org.dummy.brms.dummy_brms.mybatis.mappers;

import static org.dummy.brms.dummy_brms.mybatis.mappers.RulesMappingDynamicSqlSupport.*;

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
import org.dummy.brms.dummy_brms.mybatis.pojo.RulesMapping;
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
public interface RulesMappingMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RulesMapping>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    BasicColumn[] selectList = BasicColumn.columnList(ruleId, idCondition, idWorkflow);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RulesMappingResult", value = {
        @Result(column="rule_id", property="ruleId", jdbcType=JdbcType.BIGINT),
        @Result(column="id_condition", property="idCondition", jdbcType=JdbcType.BIGINT),
        @Result(column="id_workflow", property="idWorkflow", jdbcType=JdbcType.BIGINT)
    })
    List<RulesMapping> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RulesMappingResult")
    Optional<RulesMapping> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default int insert(RulesMapping row) {
        return MyBatis3Utils.insert(this::insert, row, rulesMapping, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(idCondition).toProperty("idCondition")
            .map(idWorkflow).toProperty("idWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default int insertMultiple(Collection<RulesMapping> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, rulesMapping, c ->
            c.map(ruleId).toProperty("ruleId")
            .map(idCondition).toProperty("idCondition")
            .map(idWorkflow).toProperty("idWorkflow")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.991533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default int insertSelective(RulesMapping row) {
        return MyBatis3Utils.insert(this::insert, row, rulesMapping, c ->
            c.map(ruleId).toPropertyWhenPresent("ruleId", row::getRuleId)
            .map(idCondition).toPropertyWhenPresent("idCondition", row::getIdCondition)
            .map(idWorkflow).toPropertyWhenPresent("idWorkflow", row::getIdWorkflow)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default Optional<RulesMapping> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default List<RulesMapping> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default List<RulesMapping> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rulesMapping, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    static UpdateDSL<UpdateModel> updateAllColumns(RulesMapping row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalTo(row::getRuleId)
                .set(idCondition).equalTo(row::getIdCondition)
                .set(idWorkflow).equalTo(row::getIdWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.992533+01:00", comments="Source Table: dumb_brms.rules_mapping")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RulesMapping row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ruleId).equalToWhenPresent(row::getRuleId)
                .set(idCondition).equalToWhenPresent(row::getIdCondition)
                .set(idWorkflow).equalToWhenPresent(row::getIdWorkflow);
    }
}