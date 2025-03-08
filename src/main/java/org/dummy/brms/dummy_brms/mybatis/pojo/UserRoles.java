package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class UserRoles {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0448348+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0478452+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    private String userRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0468334+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0478452+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0478452+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    public String getUserRole() {
        return userRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-08T18:58:52.0478452+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}