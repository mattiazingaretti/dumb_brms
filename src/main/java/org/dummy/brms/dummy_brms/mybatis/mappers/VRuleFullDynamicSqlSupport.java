package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class VRuleFullDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2529505+01:00", comments="Source Table: dumb_brms.v_rule_full")
    public static final VRuleFull VRuleFull = new VRuleFull();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2529505+01:00", comments="Source field: dumb_brms.v_rule_full.rule_id_name")
    public static final SqlColumn<String> ruleIdName = VRuleFull.ruleIdName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2529505+01:00", comments="Source field: dumb_brms.v_rule_full.rule_id")
    public static final SqlColumn<Long> ruleId = VRuleFull.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source field: dumb_brms.v_rule_full.project_id")
    public static final SqlColumn<Long> projectId = VRuleFull.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source field: dumb_brms.v_rule_full.salience")
    public static final SqlColumn<Integer> salience = VRuleFull.salience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source field: dumb_brms.v_rule_full.rulename")
    public static final SqlColumn<String> rulename = VRuleFull.rulename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source field: dumb_brms.v_rule_full.conditions")
    public static final SqlColumn<Object> conditions = VRuleFull.conditions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2539496+01:00", comments="Source field: dumb_brms.v_rule_full.workflow")
    public static final SqlColumn<Object> workflow = VRuleFull.workflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T18:35:15.2529505+01:00", comments="Source Table: dumb_brms.v_rule_full")
    public static final class VRuleFull extends AliasableSqlTable<VRuleFull> {
        public final SqlColumn<String> ruleIdName = column("rule_id_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> salience = column("salience", JDBCType.INTEGER);

        public final SqlColumn<String> rulename = column("rulename", JDBCType.VARCHAR);

        public final SqlColumn<Object> conditions = column("conditions", JDBCType.OTHER);

        public final SqlColumn<Object> workflow = column("workflow", JDBCType.OTHER);

        public VRuleFull() {
            super("dumb_brms.v_rule_full", VRuleFull::new);
        }
    }
}