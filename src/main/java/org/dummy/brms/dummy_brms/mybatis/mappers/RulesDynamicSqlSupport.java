package org.dummy.brms.dummy_brms.mybatis.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RulesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source Table: dumb_brms.rules")
    public static final Rules rules = new Rules();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source field: dumb_brms.rules.rule_id")
    public static final SqlColumn<Long> ruleId = rules.ruleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source field: dumb_brms.rules.project_id")
    public static final SqlColumn<Long> projectId = rules.projectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source field: dumb_brms.rules.salience")
    public static final SqlColumn<Integer> salience = rules.salience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source field: dumb_brms.rules.rule_name")
    public static final SqlColumn<String> ruleName = rules.ruleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2025-03-25T18:01:57.9865325+01:00", comments="Source Table: dumb_brms.rules")
    public static final class Rules extends AliasableSqlTable<Rules> {
        public final SqlColumn<Long> ruleId = column("rule_id", JDBCType.BIGINT);

        public final SqlColumn<Long> projectId = column("project_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> salience = column("salience", JDBCType.INTEGER);

        public final SqlColumn<String> ruleName = column("rule_name", JDBCType.VARCHAR);

        public Rules() {
            super("dumb_brms.rules", Rules::new);
        }
    }
}