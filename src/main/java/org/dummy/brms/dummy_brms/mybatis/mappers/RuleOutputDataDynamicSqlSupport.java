package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleOutputDataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source Table: dumb_brms.rule_output_data")
    public static final RuleOutputData ruleOutputData = new RuleOutputData();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source field: dumb_brms.rule_output_data.project_id")
    public static final SqlColumn<Long> projectId = ruleOutputData.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source field: dumb_brms.rule_output_data.rod_class")
    public static final SqlColumn<String> rodClass = ruleOutputData.rodClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source field: dumb_brms.rule_output_data.user_id")
    public static final SqlColumn<Long> userId = ruleOutputData.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source field: dumb_brms.rule_output_data.rod_description")
    public static final SqlColumn<String> rodDescription = ruleOutputData.rodDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7282706+01:00", comments="Source Table: dumb_brms.rule_output_data")
    public static final class RuleOutputData extends AliasableSqlTable<RuleOutputData> {
        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<String> rodClass = column("rod_class", JDBCType.VARCHAR);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> rodDescription = column("rod_description", JDBCType.VARCHAR);

        public RuleOutputData() {
            super("dumb_brms.rule_output_data", RuleOutputData::new);
        }
    }
}