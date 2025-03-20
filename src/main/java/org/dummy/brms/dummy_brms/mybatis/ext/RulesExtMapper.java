package org.dummy.brms.dummy_brms.mybatis.ext;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dummy.brms.dummy_brms.model.dto.RuleDTO;
import org.dummy.brms.dummy_brms.mybatis.mappers.RulesMapper;

@Mapper
public interface RulesExtMapper extends RulesMapper {


    @Select({
            "<script>",
            "WITH inserted_rule AS (",
            "   INSERT INTO rules (project_id, salience, rulename, rule_id_name)",
            "   VALUES (#{projectId}, #{ruleDto.salience}, #{ruleDto.ruleName}, #{ruleDto.idRule})",
            "   RETURNING rule_id",
            "),",
            "inserted_conditions AS (",
            "   INSERT INTO rule_conditions (",
            "       rule_id,",
            "       condition_name_id,",
            "       classname,",
            "       field,",
            "       operator,",
            "       value,",
            "       flg_use_id_conditions",
            "   )",
            "   VALUES",
            "   <foreach item='condition' collection='ruleDto.conditions' separator=','>",
            "       (",
            "           (SELECT rule_id FROM inserted_rule),",
            "           #{condition.idCondition},",
            "           #{condition.className},",
            "           #{condition.field},",
            "           #{condition.operator},",
            "           #{condition.value}::json,",
            "           #{condition.flgUseIdCondition}",
            "       )",
            "   </foreach>",
            "   RETURNING id_condition, rule_id",
            "),",
            "inserted_workflow AS (",
            "   INSERT INTO rule_workflow (workflow_name, rule_id)",
            "   SELECT #{ruleDto.workflow.name}, rule_id FROM inserted_rule",
            "   RETURNING id_workflow, rule_id",
            ")",
            "UPDATE rules",
            "SET",
            "   id_condition = (SELECT id_condition FROM inserted_conditions WHERE rule_id = rules.rule_id LIMIT 1),",
            "   id_workflow = (SELECT id_workflow FROM inserted_workflow WHERE rule_id = rules.rule_id)",
            "WHERE rules.rule_id = (SELECT rule_id FROM inserted_rule)",
            "RETURNING rules.rule_id;",
            "</script>"
    })
    Long customInsert(@Param("ruleDto") RuleDTO ruleDto, @Param("projectId") Long projectId);


    @Update({
            "<script>",
            "WITH updated_rule AS (",
            "   UPDATE rules",
            "   SET salience = #{ruleDto.salience},",
            "       rulename = #{ruleDto.ruleName}",
            "   WHERE project_id = #{projectId}",
            "       AND rule_id_name = #{ruleDto.idRule}",
            "   RETURNING rule_id",
            "),",
            "deleted_conditions AS (",
            "   DELETE FROM rule_conditions",
            "   WHERE rule_id = (SELECT rule_id FROM updated_rule)",
            "),",
            "deleted_workflow AS (",
            "   DELETE FROM rule_workflow",
            "   WHERE rule_id = (SELECT rule_id FROM updated_rule)",
            "),",
            "inserted_conditions AS (",
            "   INSERT INTO rule_conditions (",
            "       rule_id,",
            "       condition_name_id,",
            "       classname,",
            "       field,",
            "       operator,",
            "       value,",
            "       flg_use_id_conditions",
            "   )",
            "   VALUES",
            "   <foreach item='condition' collection='ruleDto.conditions' separator=','>",
            "       (",
            "           (SELECT rule_id FROM updated_rule),",
            "           #{condition.idCondition},",
            "           #{condition.className},",
            "           #{condition.field},",
            "           #{condition.operator},",
            "           #{condition.value}::json,",
            "           #{condition.flgUseIdCondition}",
            "       )",
            "   </foreach>",
            "   RETURNING id_condition, rule_id",
            "),",
            "inserted_workflow AS (",
            "   INSERT INTO rule_workflow (workflow_name, rule_id)",
            "   SELECT #{ruleDto.workflow.name}, rule_id FROM updated_rule",
            "   RETURNING id_workflow, rule_id",
            ")",
            "UPDATE rules",
            "SET",
            "   id_condition = (SELECT id_condition FROM inserted_conditions WHERE rule_id = rules.rule_id LIMIT 1),",
            "   id_workflow = (SELECT id_workflow FROM inserted_workflow WHERE rule_id = rules.rule_id)",
            "WHERE rules.rule_id = (SELECT rule_id FROM updated_rule)",
            "RETURNING rules.rule_id;",
            "</script>"
    })
    Long customUpdate(@Param("ruleDto") RuleDTO ruleDto, @Param("projectId") Long projectId);



}
