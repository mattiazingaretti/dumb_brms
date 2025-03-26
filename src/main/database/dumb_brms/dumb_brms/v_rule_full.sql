create view dumb_brms.v_rule_full
            (rule_id, project_id, rule_name, salience, id_condition, classname, condition_name_id, field, operator,
             value, flg_use_id_conditions, id_workflow, workflow_name, last_update_workflow)
as
SELECT r.rule_id,
       r.project_id,
       r.rule_name,
       r.salience,
       rc.id_condition,
       rc.classname,
       rc.condition_name_id,
       rc.field,
       rc.operator,
       rc.value,
       rc.flg_use_id_conditions,
       rw.id_workflow,
       rw.workflow_name,
       rw.last_update_workflow
FROM dumb_brms.rules r
         LEFT JOIN dumb_brms.rules_mapping rm ON r.rule_id = rm.rule_id
         LEFT JOIN dumb_brms.rule_conditions rc ON rc.id_condition = rm.id_condition
         LEFT JOIN dumb_brms.rule_workflow rw ON rm.id_workflow = rw.id_workflow AND rw.id_workflow = rm.id_workflow AND
                                                 rc.id_condition = rm.id_condition;

alter table dumb_brms.v_rule_full
    owner to postgres;

