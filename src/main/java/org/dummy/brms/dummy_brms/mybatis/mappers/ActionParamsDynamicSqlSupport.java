package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ActionParamsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source Table: dumb_brms.action_params")
    public static final ActionParams actionParams = new ActionParams();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source field: dumb_brms.action_params.action")
    public static final SqlColumn<String> action = actionParams.action;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source field: dumb_brms.action_params.param_name")
    public static final SqlColumn<String> paramName = actionParams.paramName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source field: dumb_brms.action_params.param_type")
    public static final SqlColumn<String> paramType = actionParams.paramType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source field: dumb_brms.action_params.param_direction")
    public static final SqlColumn<String> paramDirection = actionParams.paramDirection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T12:50:23.4122388+01:00", comments="Source Table: dumb_brms.action_params")
    public static final class ActionParams extends AliasableSqlTable<ActionParams> {
        public final SqlColumn<String> action = column("action", JDBCType.VARCHAR);

        public final SqlColumn<String> paramName = column("param_name", JDBCType.VARCHAR);

        public final SqlColumn<String> paramType = column("param_type", JDBCType.VARCHAR);

        public final SqlColumn<String> paramDirection = column("param_direction", JDBCType.VARCHAR);

        public ActionParams() {
            super("dumb_brms.action_params", ActionParams::new);
        }
    }
}