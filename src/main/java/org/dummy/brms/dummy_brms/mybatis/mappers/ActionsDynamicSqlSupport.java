package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ActionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4976829+01:00", comments="Source Table: dumb_brms.actions")
    public static final Actions actions = new Actions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4976829+01:00", comments="Source field: dumb_brms.actions.action_name")
    public static final SqlColumn<String> actionName = actions.actionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-12T17:50:35.4976829+01:00", comments="Source Table: dumb_brms.actions")
    public static final class Actions extends AliasableSqlTable<Actions> {
        public final SqlColumn<String> actionName = column("action_name", JDBCType.VARCHAR);

        public Actions() {
            super("dumb_brms.actions", Actions::new);
        }
    }
}