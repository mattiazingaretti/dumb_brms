package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RuleDataTypesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    public static final RuleDataTypes ruleDataTypes = new RuleDataTypes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source field: dumb_brms.rule_data_types.data_type")
    public static final SqlColumn<String> dataType = ruleDataTypes.dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-02-03T23:41:22.7728869+01:00", comments="Source Table: dumb_brms.rule_data_types")
    public static final class RuleDataTypes extends AliasableSqlTable<RuleDataTypes> {
        public final SqlColumn<String> dataType = column("data_type", JDBCType.VARCHAR);

        public RuleDataTypes() {
            super("dumb_brms.rule_data_types", RuleDataTypes::new);
        }
    }
}