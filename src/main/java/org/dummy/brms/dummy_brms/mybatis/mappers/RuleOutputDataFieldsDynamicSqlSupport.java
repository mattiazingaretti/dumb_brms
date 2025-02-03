package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleOutputDataFieldsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    public static final RuleOutputDataFields ruleOutputDataFields = new RuleOutputDataFields();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source field: dumb_brms.rule_output_data_fields.rod_field_name")
    public static final SqlColumn<String> rodFieldName = ruleOutputDataFields.rodFieldName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source field: dumb_brms.rule_output_data_fields.rod_class")
    public static final SqlColumn<String> rodClass = ruleOutputDataFields.rodClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source field: dumb_brms.rule_output_data_fields.rod_field_type")
    public static final SqlColumn<String> rodFieldType = ruleOutputDataFields.rodFieldType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source field: dumb_brms.rule_output_data_fields.project_id")
    public static final SqlColumn<Integer> projectId = ruleOutputDataFields.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T21:30:27.2749597+01:00", comments="Source Table: dumb_brms.rule_output_data_fields")
    public static final class RuleOutputDataFields extends AliasableSqlTable<RuleOutputDataFields> {
        public final SqlColumn<String> rodFieldName = column("rod_field_name", JDBCType.VARCHAR);

        public final SqlColumn<String> rodClass = column("rod_class", JDBCType.VARCHAR);

        public final SqlColumn<String> rodFieldType = column("rod_field_type", JDBCType.VARCHAR);

        public final SqlColumn<Integer> projectId = column("project_id", JDBCType.INTEGER);

        public RuleOutputDataFields() {
            super("dumb_brms.rule_output_data_fields", RuleOutputDataFields::new);
        }
    }
}