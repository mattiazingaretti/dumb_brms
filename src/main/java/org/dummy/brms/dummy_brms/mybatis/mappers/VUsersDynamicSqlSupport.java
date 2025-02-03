package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class VUsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4417297+01:00", comments="Source Table: dumb_brms.v_users")
    public static final VUsers VUsers = new VUsers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4417297+01:00", comments="Source field: dumb_brms.v_users.id")
    public static final SqlColumn<Long> id = VUsers.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4417297+01:00", comments="Source field: dumb_brms.v_users.username")
    public static final SqlColumn<String> username = VUsers.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4417297+01:00", comments="Source field: dumb_brms.v_users.psw_hash")
    public static final SqlColumn<String> pswHash = VUsers.pswHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4432024+01:00", comments="Source field: dumb_brms.v_users.email")
    public static final SqlColumn<String> email = VUsers.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4432024+01:00", comments="Source field: dumb_brms.v_users.user_role")
    public static final SqlColumn<String> userRole = VUsers.userRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T22:51:05.4417297+01:00", comments="Source Table: dumb_brms.v_users")
    public static final class VUsers extends AliasableSqlTable<VUsers> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> pswHash = column("psw_hash", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> userRole = column("user_role", JDBCType.VARCHAR);

        public VUsers() {
            super("dumb_brms.v_users", VUsers::new);
        }
    }
}