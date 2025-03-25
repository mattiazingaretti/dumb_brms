create table dumb_brms.rule_workflow
(
    id_workflow          bigint    default nextval('dumb_brms.rules_workflow_id_seq'::regclass) not null
        constraint rule_workflow_pk
            primary key,
    workflow_name        varchar                                                                not null,
    rule_id              bigint,
    last_update_workflow timestamp default CURRENT_TIMESTAMP,
    constraint rule_workflow_pk_2
        unique (workflow_name, rule_id)
);

alter table dumb_brms.rule_workflow
    owner to postgres;

