package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source Table: dumb_brms.users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source field: dumb_brms.users.id")
    public static final SqlColumn<Long> id = users.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source field: dumb_brms.users.username")
    public static final SqlColumn<String> username = users.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source field: dumb_brms.users.psw_hash")
    public static final SqlColumn<String> pswHash = users.pswHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source field: dumb_brms.users.email")
    public static final SqlColumn<String> email = users.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source field: dumb_brms.users.flg_deleted")
    public static final SqlColumn<Boolean> flgDeleted = users.flgDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2636859+01:00", comments="Source Table: dumb_brms.users")
    public static final class Users extends AliasableSqlTable<Users> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> pswHash = column("psw_hash", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> flgDeleted = column("flg_deleted", JDBCType.BIT);

        public Users() {
            super("dumb_brms.users", Users::new);
        }
    }
}