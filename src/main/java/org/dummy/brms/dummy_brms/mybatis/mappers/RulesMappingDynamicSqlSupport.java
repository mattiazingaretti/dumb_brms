package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RulesMappingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3242204+01:00", comments="Source Table: dumb_brms.rules_mapping")
    public static final RulesMapping rulesMapping = new RulesMapping();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3242204+01:00", comments="Source field: dumb_brms.rules_mapping.rule_id")
    public static final SqlColumn<Long> ruleId = rulesMapping.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3242204+01:00", comments="Source field: dumb_brms.rules_mapping.id_condition")
    public static final SqlColumn<Long> idCondition = rulesMapping.idCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3242204+01:00", comments="Source field: dumb_brms.rules_mapping.id_workflow")
    public static final SqlColumn<Long> idWorkflow = rulesMapping.idWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3242204+01:00", comments="Source Table: dumb_brms.rules_mapping")
    public static final class RulesMapping extends AliasableSqlTable<RulesMapping> {
        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<Long> idCondition = column("id_condition", JDBCType.BIGINT);

        public final SqlColumn<Long> idWorkflow = column("id_workflow", JDBCType.BIGINT);

        public RulesMapping() {
            super("dumb_brms.rules_mapping", RulesMapping::new);
        }
    }
}