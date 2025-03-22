package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleInputDataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7262702+01:00", comments="Source Table: dumb_brms.rule_input_data")
    public static final RuleInputData ruleInputData = new RuleInputData();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7272705+01:00", comments="Source field: dumb_brms.rule_input_data.project_id")
    public static final SqlColumn<Long> projectId = ruleInputData.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7272705+01:00", comments="Source field: dumb_brms.rule_input_data.rid_class")
    public static final SqlColumn<String> ridClass = ruleInputData.ridClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7272705+01:00", comments="Source field: dumb_brms.rule_input_data.user_id")
    public static final SqlColumn<Long> userId = ruleInputData.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7272705+01:00", comments="Source field: dumb_brms.rule_input_data.rid_description")
    public static final SqlColumn<String> ridDescription = ruleInputData.ridDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-22T21:37:14.7262702+01:00", comments="Source Table: dumb_brms.rule_input_data")
    public static final class RuleInputData extends AliasableSqlTable<RuleInputData> {
        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<String> ridClass = column("rid_class", JDBCType.VARCHAR);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> ridDescription = column("rid_description", JDBCType.VARCHAR);

        public RuleInputData() {
            super("dumb_brms.rule_input_data", RuleInputData::new);
        }
    }
}