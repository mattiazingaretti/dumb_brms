package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class Rules {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3182222+01:00", comments="Source field: dumb_brms.rules.rule_id")
    private Long ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3182222+01:00", comments="Source field: dumb_brms.rules.project_id")
    private Long projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.salience")
    private Integer salience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.rule_name")
    private String ruleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.is_active")
    private Boolean isActive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3182222+01:00", comments="Source field: dumb_brms.rules.rule_id")
    public Long getRuleId() {
        return ruleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3182222+01:00", comments="Source field: dumb_brms.rules.rule_id")
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.project_id")
    public Long getProjectId() {
        return projectId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.project_id")
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.salience")
    public Integer getSalience() {
        return salience;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.salience")
    public void setSalience(Integer salience) {
        this.salience = salience;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.rule_name")
    public String getRuleName() {
        return ruleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.rule_name")
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-27T15:17:00.3192243+01:00", comments="Source field: dumb_brms.rules.is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}