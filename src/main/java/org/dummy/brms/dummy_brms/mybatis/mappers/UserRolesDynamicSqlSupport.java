package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UserRolesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0669948+01:00", comments="Source Table: dumb_brms.user_roles")
    public static final UserRoles userRoles = new UserRoles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0669948+01:00", comments="Source field: dumb_brms.user_roles.user_id")
    public static final SqlColumn<Long> userId = userRoles.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.067898+01:00", comments="Source field: dumb_brms.user_roles.user_role")
    public static final SqlColumn<String> userRole = userRoles.userRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T11:57:16.0669948+01:00", comments="Source Table: dumb_brms.user_roles")
    public static final class UserRoles extends AliasableSqlTable<UserRoles> {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> userRole = column("user_role", JDBCType.VARCHAR);

        public UserRoles() {
            super("dumb_brms.user_roles", UserRoles::new);
        }
    }
}