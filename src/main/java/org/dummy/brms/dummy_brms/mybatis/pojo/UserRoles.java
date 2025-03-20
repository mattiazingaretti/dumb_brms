package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class UserRoles {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0619033+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0639915+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    private String userRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0639915+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0639915+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0639915+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    public String getUserRole() {
        return userRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0649936+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}