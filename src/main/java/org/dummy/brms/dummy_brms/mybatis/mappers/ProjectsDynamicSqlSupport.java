package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ProjectsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source Table: dumb_brms.projects")
    public static final Projects projects = new Projects();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source field: dumb_brms.projects.id")
    public static final SqlColumn<Long> id = projects.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source field: dumb_brms.projects.user_id")
    public static final SqlColumn<Long> userId = projects.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source field: dumb_brms.projects.project_name")
    public static final SqlColumn<String> projectName = projects.projectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source field: dumb_brms.projects.last_update")
    public static final SqlColumn<Date> lastUpdate = projects.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8624711+01:00", comments="Source field: dumb_brms.projects.creation_datetime")
    public static final SqlColumn<Date> creationDatetime = projects.creationDatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-20T18:57:04.8613923+01:00", comments="Source Table: dumb_brms.projects")
    public static final class Projects extends AliasableSqlTable<Projects> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> projectName = column("project_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> creationDatetime = column("creation_datetime", JDBCType.TIMESTAMP);

        public Projects() {
            super("dumb_brms.projects", Projects::new);
        }
    }
}