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
           "<script>\n" +
                   "WITH inserted_rule AS (\n" +
                   "    INSERT INTO rules (project_id, salience, rulename, rule_id_name)\n" +
                   "    VALUES (#{projectId}, #{ruleDto.salience}, #{ruleDto.ruleName}, #{ruleDto.idRule})\n" +
                   "    RETURNING rule_id\n" +
                   "),\n" +
                   "inserted_conditions AS (\n" +
                   "    <if test=\"ruleDto.conditions != null and !ruleDto.conditions.isEmpty()\">\n" +
                   "        INSERT INTO rule_conditions (\n" +
                   "            rule_id,\n" +
                   "            condition_name_id,\n" +
                   "            classname,\n" +
                   "            field,\n" +
                   "            operator,\n" +
                   "            value,\n" +
                   "            flg_use_id_conditions\n" +
                   "        )\n" +
                   "        VALUES\n" +
                   "        <foreach item='condition' collection='ruleDto.conditions' separator=\",\">\n" +
                   "            (\n" +
                   "                (SELECT rule_id FROM inserted_rule),\n" +
                   "                #{condition.idCondition},\n" +
                   "                #{condition.className},\n" +
                   "                #{condition.field},\n" +
                   "                #{condition.operator},\n" +
                   "                #{condition.value}::json,\n" +
                   "                #{condition.flgUseIdCondition}\n" +
                   "            )\n" +
                   "        </foreach>\n" +
                   "        RETURNING id_condition, rule_id\n" +
                   "    </if>\n" +
                   "    <if test=\"ruleDto.conditions == null or ruleDto.conditions.isEmpty()\">\n" +
                   "        SELECT NULL AS id_condition, (SELECT rule_id FROM inserted_rule) AS rule_id\n" +
                   "    </if>\n" +
                   "),\n" +
                   "inserted_workflow AS (\n" +
                   "    <if test=\"ruleDto.workflow != null and ruleDto.workflow.name != null and ruleDto.workflow.name != ''\">\n" +
                   "        INSERT INTO rule_workflow (workflow_name, rule_id)\n" +
                   "        SELECT #{ruleDto.workflow.name}, rule_id FROM inserted_rule\n" +
                   "        RETURNING id_workflow, rule_id\n" +
                   "    </if>\n" +
                   "    <if test=\"ruleDto.workflow == null or ruleDto.workflow.name == null or ruleDto.workflow.name == ''\">\n" +
                   "        SELECT NULL AS id_workflow, (SELECT rule_id FROM inserted_rule) AS rule_id\n" +
                   "    </if>\n" +
                   ")\n" +
                   "UPDATE rules\n" +
                   "SET\n" +
                   "    id_condition = (SELECT id_condition FROM inserted_conditions WHERE rule_id = rules.rule_id LIMIT 1)::bigint ,\n" +
                   "    id_workflow = (SELECT id_workflow FROM inserted_workflow WHERE rule_id = rules.rule_id)::bigint \n" +
                   "WHERE rules.rule_id = (SELECT rule_id FROM inserted_rule)\n" +
                   "RETURNING rules.rule_id;\n" +
                   "</script>"
    })
    Long customInsert(@Param("ruleDto") RuleDTO ruleDto, @Param("projectId") Long projectId);


    @Update({
          "<script>\n" +
                  "WITH existing_rule AS (\n" +
                  "    SELECT rule_id\n" +
                  "    FROM rules\n" +
                  "    WHERE project_id = #{projectId}\n" +
                  "      AND rule_id_name = #{ruleDto.idRule}\n" +
                  "),\n" +
                  "inserted_rule AS (\n" +
                  "    INSERT INTO rules (project_id, salience, rulename, rule_id_name)\n" +
                  "    SELECT #{projectId}, #{ruleDto.salience}, #{ruleDto.ruleName}, #{ruleDto.idRule}\n" +
                  "    WHERE NOT EXISTS (SELECT 1 FROM existing_rule)\n" +
                  "    RETURNING rule_id\n" +
                  "),\n" +
                  "resolved_rule AS (\n" +
                  "    SELECT rule_id FROM existing_rule\n" +
                  "    UNION ALL\n" +
                  "    SELECT rule_id FROM inserted_rule\n" +
                  "),\n" +
                  "deleted_conditions AS (\n" +
                  "    DELETE FROM rule_conditions\n" +
                  "    WHERE rule_id = (SELECT rule_id FROM resolved_rule)\n" +
                  "),\n" +
                  "deleted_workflow AS (\n" +
                  "    DELETE FROM rule_workflow\n" +
                  "    WHERE rule_id = (SELECT rule_id FROM resolved_rule)\n" +
                  "),\n" +
                  "inserted_conditions AS (\n" +
                  "    <if test=\"ruleDto.conditions != null and !ruleDto.conditions.isEmpty()\">\n" +
                  "        INSERT INTO rule_conditions (\n" +
                  "            rule_id,\n" +
                  "            condition_name_id,\n" +
                  "            classname,\n" +
                  "            field,\n" +
                  "            operator,\n" +
                  "            value,\n" +
                  "            flg_use_id_conditions\n" +
                  "        )\n" +
                  "        VALUES\n" +
                  "        <foreach item='condition' collection='ruleDto.conditions' separator=\",\">\n" +
                  "            (\n" +
                  "                (SELECT rule_id FROM resolved_rule),\n" +
                  "                #{condition.idCondition},\n" +
                  "                #{condition.className},\n" +
                  "                #{condition.field},\n" +
                  "                #{condition.operator},\n" +
                  "                #{condition.value}::json,\n" +
                  "                #{condition.flgUseIdCondition}\n" +
                  "            )\n" +
                  "        </foreach>\n" +
                  "        RETURNING id_condition, rule_id\n" +
                  "    </if>\n" +
                  "    <if test=\"ruleDto.conditions == null or ruleDto.conditions.isEmpty()\">\n" +
                  "        SELECT NULL AS id_condition, (SELECT rule_id FROM resolved_rule) AS rule_id\n" +
                  "    </if>\n" +
                  "),\n" +
                  "inserted_workflow AS (\n" +
                  "    <if test=\"ruleDto.workflow != null and ruleDto.workflow.name != null and ruleDto.workflow.name != ''\">\n" +
                  "        INSERT INTO rule_workflow (workflow_name, rule_id)\n" +
                  "        SELECT #{ruleDto.workflow.name}, rule_id FROM resolved_rule\n" +
                  "        RETURNING id_workflow, rule_id\n" +
                  "    </if>\n" +
                  "    <if test=\"ruleDto.workflow == null or ruleDto.workflow.name == null or ruleDto.workflow.name == ''\">\n" +
                  "        SELECT NULL AS id_workflow, (SELECT rule_id FROM resolved_rule) AS rule_id\n" +
                  "    </if>\n" +
                  ")\n" +
                  "UPDATE rules\n" +
                  "SET\n" +
                  "    id_condition = (SELECT id_condition FROM inserted_conditions WHERE rule_id = rules.rule_id LIMIT 1)::bigint ,\n" +
                  "    id_workflow = (SELECT id_workflow FROM inserted_workflow WHERE rule_id = rules.rule_id)::bigint  \n" +
                  "WHERE rules.rule_id = (SELECT rule_id FROM resolved_rule)\n" +
                  "RETURNING rules.rule_id;\n" +
                  "</script>"
    })
    Long customUpdateOrInsert(@Param("ruleDto") RuleDTO ruleDto, @Param("projectId") Long projectId);



}
