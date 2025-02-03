-- auto-generated definition
create table rule_input_data
(
    user_id         bigserial
        constraint rule_input_data_users_id_fk
            references users,
    project_id      bigint
        constraint rule_input_data_projects_id_fk
            references projects,
    rid_class       varchar not null
        constraint rule_input_data_pk
            primary key,
    rid_description integer
);

alter table rule_input_data
    owner to postgres;

