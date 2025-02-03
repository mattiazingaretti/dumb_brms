package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CtElementsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source Table: dumb_brms.ct_elements")
    public static final CtElements ctElements = new CtElements();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source field: dumb_brms.ct_elements.group_code")
    public static final SqlColumn<String> groupCode = ctElements.groupCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source field: dumb_brms.ct_elements.element_code")
    public static final SqlColumn<String> elementCode = ctElements.elementCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source field: dumb_brms.ct_elements.element_descr")
    public static final SqlColumn<String> elementDescr = ctElements.elementDescr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source field: dumb_brms.ct_elements.filter")
    public static final SqlColumn<String> filter = ctElements.filter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source field: dumb_brms.ct_elements.last_update")
    public static final SqlColumn<Date> lastUpdate = ctElements.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T19:20:13.9405518+01:00", comments="Source Table: dumb_brms.ct_elements")
    public static final class CtElements extends AliasableSqlTable<CtElements> {
        public final SqlColumn<String> groupCode = column("group_code", JDBCType.VARCHAR);

        public final SqlColumn<String> elementCode = column("element_code", JDBCType.VARCHAR);

        public final SqlColumn<String> elementDescr = column("element_descr", JDBCType.VARCHAR);

        public final SqlColumn<String> filter = column("filter", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public CtElements() {
            super("dumb_brms.ct_elements", CtElements::new);
        }
    }
}