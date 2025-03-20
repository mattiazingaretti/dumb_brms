package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RolesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.3949741+01:00", comments="Source Table: dumb_brms.roles")
    public static final Roles roles = new Roles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.3949741+01:00", comments="Source field: dumb_brms.roles.role")
    public static final SqlColumn<String> role = roles.role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.3949741+01:00", comments="Source Table: dumb_brms.roles")
    public static final class Roles extends AliasableSqlTable<Roles> {
        public final SqlColumn<String> role = column("role", JDBCType.VARCHAR);

        public Roles() {
            super("dumb_brms.roles", Roles::new);
        }
    }
}