package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleConditionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3252242+01:00", comments="Source Table: dumb_brms.rule_conditions")
    public static final RuleConditions ruleConditions = new RuleConditions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.id_condition")
    public static final SqlColumn<Long> idCondition = ruleConditions.idCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.rule_id")
    public static final SqlColumn<Long> ruleId = ruleConditions.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.condition_name_id")
    public static final SqlColumn<String> conditionNameId = ruleConditions.conditionNameId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.classname")
    public static final SqlColumn<String> classname = ruleConditions.classname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.field")
    public static final SqlColumn<String> field = ruleConditions.field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.operator")
    public static final SqlColumn<String> operator = ruleConditions.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.value")
    public static final SqlColumn<String> value = ruleConditions.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.flg_use_id_conditions")
    public static final SqlColumn<Boolean> flgUseIdConditions = ruleConditions.flgUseIdConditions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.selected_id_condition_field")
    public static final SqlColumn<String> selectedIdConditionField = ruleConditions.selectedIdConditionField;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.326222+01:00", comments="Source field: dumb_brms.rule_conditions.referenced_condition_name_id")
    public static final SqlColumn<String> referencedConditionNameId = ruleConditions.referencedConditionNameId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3252242+01:00", comments="Source Table: dumb_brms.rule_conditions")
    public static final class RuleConditions extends AliasableSqlTable<RuleConditions> {
        public final SqlColumn<Long> idCondition = column("id_condition", JDBCType.BIGINT);

        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<String> conditionNameId = column("condition_name_id", JDBCType.VARCHAR);

        public final SqlColumn<String> classname = column("classname", JDBCType.VARCHAR);

        public final SqlColumn<String> field = column("field", JDBCType.VARCHAR);

        public final SqlColumn<String> operator = column("operator", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("value", JDBCType.OTHER, "org.dummy.brms.dummy_brms.mybatis.handlers.JsonTypeHandler");

        public final SqlColumn<Boolean> flgUseIdConditions = column("flg_use_id_conditions", JDBCType.BIT);

        public final SqlColumn<String> selectedIdConditionField = column("selected_id_condition_field", JDBCType.VARCHAR);

        public final SqlColumn<String> referencedConditionNameId = column("referenced_condition_name_id", JDBCType.VARCHAR);

        public RuleConditions() {
            super("dumb_brms.rule_conditions", RuleConditions::new);
        }
    }
}