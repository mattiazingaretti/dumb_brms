create table dumb_brms.rule_output_data
(
    user_id         bigserial
        constraint rule_output_data_users_id_fk
            references dumb_brms.users,
    project_id      bigint
        constraint rule_output_data_projects_id_fk
            references dumb_brms.projects,
    rod_class       varchar not null
        constraint rule_output_data_pk
            primary key,
    rod_description varchar,
    constraint rule_output_data_pk_2
        unique (project_id, rod_class)
);

alter table dumb_brms.rule_output_data
    owner to postgres;

