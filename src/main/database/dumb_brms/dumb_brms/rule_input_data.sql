create table dumb_brms.rule_input_data
(
    user_id         bigserial
        constraint rule_input_data_users_id_fk
            references dumb_brms.users,
    project_id      bigint
        constraint rule_input_data_projects_id_fk
            references dumb_brms.projects,
    rid_class       varchar not null
        constraint rule_input_data_pk
            primary key,
    rid_description varchar,
    constraint rule_input_data_pk_2
        unique (project_id, rid_class)
);

alter table dumb_brms.rule_input_data
    owner to postgres;

