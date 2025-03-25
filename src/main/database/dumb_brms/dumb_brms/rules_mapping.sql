create table dumb_brms.rules_mapping
(
    rule_id      bigint not null
        constraint rules_mapping_rules_rule_id_fk
            references dumb_brms.rules,
    id_condition bigint
        constraint rules_mapping_rule_conditions_id_condition_fk
            references dumb_brms.rule_conditions,
    id_workflow  bigint
        constraint rules_mapping_rule_workflow_id_workflow_fk
            references dumb_brms.rule_workflow,
    constraint rules_mapping_pk
        unique (rule_id, id_workflow, id_condition)
);

alter table dumb_brms.rules_mapping
    owner to postgres;

