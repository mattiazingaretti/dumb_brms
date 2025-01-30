package org.dummy.brms.dummy_brms.mybatis.mappers;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.Projects;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.ProjectsExample.Criteria;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.ProjectsExample.Criterion;
import org.dummy.brms.dummy_brms.mybatis.pojo.dumb_brms.ProjectsExample;

public class ProjectsSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String countByExample(ProjectsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dumb_brms.projects");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String deleteByExample(ProjectsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dumb_brms.projects");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String insertSelective(Projects row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dumb_brms.projects");
        
        if (row.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (row.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (row.getProjectName() != null) {
            sql.VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getLastUpdate() != null) {
            sql.VALUES("last_update", "#{lastUpdate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreationDatetime() != null) {
            sql.VALUES("creation_datetime", "#{creationDatetime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String selectByExample(ProjectsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("project_name");
        sql.SELECT("last_update");
        sql.SELECT("creation_datetime");
        sql.FROM("dumb_brms.projects");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Projects row = (Projects) parameter.get("row");
        ProjectsExample example = (ProjectsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dumb_brms.projects");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=BIGINT}");
        }
        
        if (row.getUserId() != null) {
            sql.SET("user_id = #{row.userId,jdbcType=BIGINT}");
        }
        
        if (row.getProjectName() != null) {
            sql.SET("project_name = #{row.projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getLastUpdate() != null) {
            sql.SET("last_update = #{row.lastUpdate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreationDatetime() != null) {
            sql.SET("creation_datetime = #{row.creationDatetime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dumb_brms.projects");
        
        sql.SET("id = #{row.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{row.userId,jdbcType=BIGINT}");
        sql.SET("project_name = #{row.projectName,jdbcType=VARCHAR}");
        sql.SET("last_update = #{row.lastUpdate,jdbcType=TIMESTAMP}");
        sql.SET("creation_datetime = #{row.creationDatetime,jdbcType=TIMESTAMP}");
        
        ProjectsExample example = (ProjectsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    public String updateByPrimaryKeySelective(Projects row) {
        SQL sql = new SQL();
        sql.UPDATE("dumb_brms.projects");
        
        if (row.getProjectName() != null) {
            sql.SET("project_name = #{projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getLastUpdate() != null) {
            sql.SET("last_update = #{lastUpdate,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreationDatetime() != null) {
            sql.SET("creation_datetime = #{creationDatetime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        sql.WHERE("user_id = #{userId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dumb_brms.projects
     *
     * @mbg.generated Thu Jan 30 20:53:11 CET 2025
     */
    protected void applyWhere(SQL sql, ProjectsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}