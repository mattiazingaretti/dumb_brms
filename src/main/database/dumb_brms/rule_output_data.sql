-- auto-generated definition
create table rule_output_data
(
    user_id         bigserial
        constraint rule_output_data_users_id_fk
            references users,
    project_id      bigint
        constraint rule_output_data_projects_id_fk
            references projects,
    rod_class       varchar not null
        constraint rule_output_data_pk
            primary key,
    rod_description integer
);

alter table rule_output_data
    owner to postgres;

