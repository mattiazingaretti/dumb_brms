package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleConditionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source Table: dumb_brms.rule_conditions")
    public static final RuleConditions ruleConditions = new RuleConditions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.id_condition")
    public static final SqlColumn<Long> idCondition = ruleConditions.idCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.rule_id")
    public static final SqlColumn<Long> ruleId = ruleConditions.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.condition_name_id")
    public static final SqlColumn<String> conditionNameId = ruleConditions.conditionNameId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.class")
    public static final SqlColumn<String> class = ruleConditions.class;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.field")
    public static final SqlColumn<String> field = ruleConditions.field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.operator")
    public static final SqlColumn<String> operator = ruleConditions.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.value")
    public static final SqlColumn<Object> value = ruleConditions.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source field: dumb_brms.rule_conditions.flg_use_id_conditions")
    public static final SqlColumn<Boolean> flgUseIdConditions = ruleConditions.flgUseIdConditions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1033196+01:00", comments="Source Table: dumb_brms.rule_conditions")
    public static final class RuleConditions extends AliasableSqlTable<RuleConditions> {
        public final SqlColumn<Long> idCondition = column("id_condition", JDBCType.BIGINT);

        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<String> conditionNameId = column("condition_name_id", JDBCType.VARCHAR);

        public final SqlColumn<String> class = column("class", JDBCType.VARCHAR);

        public final SqlColumn<String> field = column("field", JDBCType.VARCHAR);

        public final SqlColumn<String> operator = column("operator", JDBCType.VARCHAR);

        public final SqlColumn<Object> value = column("value", JDBCType.OTHER);

        public final SqlColumn<Boolean> flgUseIdConditions = column("flg_use_id_conditions", JDBCType.BIT);

        public RuleConditions() {
            super("dumb_brms.rule_conditions", RuleConditions::new);
        }
    }
}