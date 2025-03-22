package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class VRuleFullDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    public static final VRuleFull VRuleFull = new VRuleFull();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.rule_id")
    public static final SqlColumn<Long> ruleId = VRuleFull.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.project_id")
    public static final SqlColumn<Long> projectId = VRuleFull.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.rule_name")
    public static final SqlColumn<String> ruleName = VRuleFull.ruleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.salience")
    public static final SqlColumn<Integer> salience = VRuleFull.salience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.classname")
    public static final SqlColumn<String> classname = VRuleFull.classname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.condition_name_id")
    public static final SqlColumn<String> conditionNameId = VRuleFull.conditionNameId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.field")
    public static final SqlColumn<String> field = VRuleFull.field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.operator")
    public static final SqlColumn<String> operator = VRuleFull.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.value")
    public static final SqlColumn<Object> value = VRuleFull.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.flg_use_id_conditions")
    public static final SqlColumn<Boolean> flgUseIdConditions = VRuleFull.flgUseIdConditions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.id_workflow")
    public static final SqlColumn<Long> idWorkflow = VRuleFull.idWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.workflow_name")
    public static final SqlColumn<String> workflowName = VRuleFull.workflowName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source field: dumb_brms.v_rule_full.last_update_workflow")
    public static final SqlColumn<Date> lastUpdateWorkflow = VRuleFull.lastUpdateWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.738779+01:00", comments="Source Table: dumb_brms.v_rule_full")
    public static final class VRuleFull extends AliasableSqlTable<VRuleFull> {
        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<String> ruleName = column("rule_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> salience = column("salience", JDBCType.INTEGER);

        public final SqlColumn<String> classname = column("classname", JDBCType.VARCHAR);

        public final SqlColumn<String> conditionNameId = column("condition_name_id", JDBCType.VARCHAR);

        public final SqlColumn<String> field = column("field", JDBCType.VARCHAR);

        public final SqlColumn<String> operator = column("operator", JDBCType.VARCHAR);

        public final SqlColumn<Object> value = column("value", JDBCType.OTHER);

        public final SqlColumn<Boolean> flgUseIdConditions = column("flg_use_id_conditions", JDBCType.BIT);

        public final SqlColumn<Long> idWorkflow = column("id_workflow", JDBCType.BIGINT);

        public final SqlColumn<String> workflowName = column("workflow_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdateWorkflow = column("last_update_workflow", JDBCType.TIMESTAMP);

        public VRuleFull() {
            super("dumb_brms.v_rule_full", VRuleFull::new);
        }
    }
}