package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleWorkflowDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1991038+01:00", comments="Source Table: dumb_brms.rule_workflow")
    public static final RuleWorkflow ruleWorkflow = new RuleWorkflow();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1991038+01:00", comments="Source field: dumb_brms.rule_workflow.id_workflow")
    public static final SqlColumn<Long> idWorkflow = ruleWorkflow.idWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1991038+01:00", comments="Source field: dumb_brms.rule_workflow.workflow_name")
    public static final SqlColumn<String> workflowName = ruleWorkflow.workflowName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1991038+01:00", comments="Source field: dumb_brms.rule_workflow.rule_id")
    public static final SqlColumn<Long> ruleId = ruleWorkflow.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1991038+01:00", comments="Source Table: dumb_brms.rule_workflow")
    public static final class RuleWorkflow extends AliasableSqlTable<RuleWorkflow> {
        public final SqlColumn<Long> idWorkflow = column("id_workflow", JDBCType.BIGINT);

        public final SqlColumn<String> workflowName = column("workflow_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public RuleWorkflow() {
            super("dumb_brms.rule_workflow", RuleWorkflow::new);
        }
    }
}