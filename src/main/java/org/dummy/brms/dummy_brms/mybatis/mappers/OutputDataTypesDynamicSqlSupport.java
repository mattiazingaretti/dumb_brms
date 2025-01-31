package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OutputDataTypesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4801872+01:00", comments="Source Table: dumb_brms.output_data_types")
    public static final OutputDataTypes outputDataTypes = new OutputDataTypes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source field: dumb_brms.output_data_types.user_id")
    public static final SqlColumn<Long> userId = outputDataTypes.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source field: dumb_brms.output_data_types.project_id")
    public static final SqlColumn<Long> projectId = outputDataTypes.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source field: dumb_brms.output_data_types.data_type_name")
    public static final SqlColumn<String> dataTypeName = outputDataTypes.dataTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source field: dumb_brms.output_data_types.data_type_descr")
    public static final SqlColumn<String> dataTypeDescr = outputDataTypes.dataTypeDescr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source field: dumb_brms.output_data_types.flg_deleted")
    public static final SqlColumn<Boolean> flgDeleted = outputDataTypes.flgDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4811861+01:00", comments="Source Table: dumb_brms.output_data_types")
    public static final class OutputDataTypes extends AliasableSqlTable<OutputDataTypes> {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<String> dataTypeName = column("data_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> dataTypeDescr = column("data_type_descr", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> flgDeleted = column("flg_deleted", JDBCType.BIT);

        public OutputDataTypes() {
            super("dumb_brms.output_data_types", OutputDataTypes::new);
        }
    }
}