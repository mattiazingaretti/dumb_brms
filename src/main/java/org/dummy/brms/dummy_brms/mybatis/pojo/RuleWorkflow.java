package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class RuleWorkflow {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.id_workflow")
    private Long idWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.workflow_name")
    private String workflowName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.rule_id")
    private Long ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.id_workflow")
    public Long getIdWorkflow() {
        return idWorkflow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.id_workflow")
    public void setIdWorkflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.workflow_name")
    public String getWorkflowName() {
        return workflowName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.workflow_name")
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.rule_id")
    public Long getRuleId() {
        return ruleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.1042659+01:00", comments="Source field: dumb_brms.rule_workflow.rule_id")
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }
}