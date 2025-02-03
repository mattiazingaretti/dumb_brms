package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleInputDataFieldsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    public static final RuleInputDataFields ruleInputDataFields = new RuleInputDataFields();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source field: dumb_brms.rule_input_data_fields.rid_field_name")
    public static final SqlColumn<String> ridFieldName = ruleInputDataFields.ridFieldName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source field: dumb_brms.rule_input_data_fields.rid_class")
    public static final SqlColumn<String> ridClass = ruleInputDataFields.ridClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source field: dumb_brms.rule_input_data_fields.rid_field_type")
    public static final SqlColumn<String> ridFieldType = ruleInputDataFields.ridFieldType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source field: dumb_brms.rule_input_data_fields.project_id")
    public static final SqlColumn<Long> projectId = ruleInputDataFields.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7748877+01:00", comments="Source Table: dumb_brms.rule_input_data_fields")
    public static final class RuleInputDataFields extends AliasableSqlTable<RuleInputDataFields> {
        public final SqlColumn<String> ridFieldName = column("rid_field_name", JDBCType.VARCHAR);

        public final SqlColumn<String> ridClass = column("rid_class", JDBCType.VARCHAR);

        public final SqlColumn<String> ridFieldType = column("rid_field_type", JDBCType.VARCHAR);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public RuleInputDataFields() {
            super("dumb_brms.rule_input_data_fields", RuleInputDataFields::new);
        }
    }
}