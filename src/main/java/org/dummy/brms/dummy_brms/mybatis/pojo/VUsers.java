package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class VUsers {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.psw_hash")
    private String pswHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.user_role")
    private String userRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.psw_hash")
    public String getPswHash() {
        return pswHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.psw_hash")
    public void setPswHash(String pswHash) {
        this.pswHash = pswHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.user_role")
    public String getUserRole() {
        return userRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9725313+01:00", comments="Source field: dumb_brms.v_users.user_role")
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}