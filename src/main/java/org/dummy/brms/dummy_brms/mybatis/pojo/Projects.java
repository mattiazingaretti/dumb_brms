package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;
import java.util.Date;

public class Projects {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.project_name")
    private String projectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.last_update")
    private Date lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.creation_datetime")
    private Date creationDatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.project_name")
    public String getProjectName() {
        return projectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.project_name")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.last_update")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.creation_datetime")
    public Date getCreationDatetime() {
        return creationDatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.771916+01:00", comments="Source field: dumb_brms.projects.creation_datetime")
    public void setCreationDatetime(Date creationDatetime) {
        this.creationDatetime = creationDatetime;
    }
}