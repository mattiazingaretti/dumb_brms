package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class GroupCodesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4906167+01:00", comments="Source Table: dumb_brms.group_codes")
    public static final GroupCodes groupCodes = new GroupCodes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4906167+01:00", comments="Source field: dumb_brms.group_codes.group_code")
    public static final SqlColumn<String> groupCode = groupCodes.groupCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4906167+01:00", comments="Source field: dumb_brms.group_codes.group_code_descr")
    public static final SqlColumn<String> groupCodeDescr = groupCodes.groupCodeDescr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4906167+01:00", comments="Source Table: dumb_brms.group_codes")
    public static final class GroupCodes extends AliasableSqlTable<GroupCodes> {
        public final SqlColumn<String> groupCode = column("group_code", JDBCType.VARCHAR);

        public final SqlColumn<String> groupCodeDescr = column("group_code_descr", JDBCType.VARCHAR);

        public GroupCodes() {
            super("dumb_brms.group_codes", GroupCodes::new);
        }
    }
}