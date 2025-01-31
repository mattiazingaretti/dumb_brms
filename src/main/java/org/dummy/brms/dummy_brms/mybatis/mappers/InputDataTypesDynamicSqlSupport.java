package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class InputDataTypesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source Table: dumb_brms.input_data_types")
    public static final InputDataTypes inputDataTypes = new InputDataTypes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source field: dumb_brms.input_data_types.user_id")
    public static final SqlColumn<Long> userId = inputDataTypes.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source field: dumb_brms.input_data_types.project_id")
    public static final SqlColumn<Long> projectId = inputDataTypes.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source field: dumb_brms.input_data_types.data_type_name")
    public static final SqlColumn<String> dataTypeName = inputDataTypes.dataTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source field: dumb_brms.input_data_types.data_type_descr")
    public static final SqlColumn<String> dataTypeDescr = inputDataTypes.dataTypeDescr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source field: dumb_brms.input_data_types.flg_deleted")
    public static final SqlColumn<Boolean> flgDeleted = inputDataTypes.flgDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-01-31T08:57:36.4690595+01:00", comments="Source Table: dumb_brms.input_data_types")
    public static final class InputDataTypes extends AliasableSqlTable<InputDataTypes> {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<String> dataTypeName = column("data_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> dataTypeDescr = column("data_type_descr", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> flgDeleted = column("flg_deleted", JDBCType.BIT);

        public InputDataTypes() {
            super("dumb_brms.input_data_types", InputDataTypes::new);
        }
    }
}