package org.dummy.brms.dummy_brms.mybatis.pojo;

import jakarta.annotation.Generated;

public class Users {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2535184+01:00", comments="Source field: dumb_brms.users.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.psw_hash")
    private String pswHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.flg_deleted")
    private Boolean flgDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.psw_hash")
    public String getPswHash() {
        return pswHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.psw_hash")
    public void setPswHash(String pswHash) {
        this.pswHash = pswHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.flg_deleted")
    public Boolean getFlgDeleted() {
        return flgDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T14:40:05.2545165+01:00", comments="Source field: dumb_brms.users.flg_deleted")
    public void setFlgDeleted(Boolean flgDeleted) {
        this.flgDeleted = flgDeleted;
    }
}