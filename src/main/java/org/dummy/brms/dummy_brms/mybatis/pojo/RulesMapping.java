package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class RulesMapping {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.rule_id")
    private Long ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_workflow")
    private Long idWorkflow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_condition")
    private Long idCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.rule_id")
    public Long getRuleId() {
        return ruleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.rule_id")
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_workflow")
    public Long getIdWorkflow() {
        return idWorkflow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_workflow")
    public void setIdWorkflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_condition")
    public Long getIdCondition() {
        return idCondition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-21T19:37:53.1961035+01:00", comments="Source field: dumb_brms.rules_mapping.id_condition")
    public void setIdCondition(Long idCondition) {
        this.idCondition = idCondition;
    }
}