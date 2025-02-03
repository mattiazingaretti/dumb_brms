create table dumb_brms.rule_input_data_fields
(
    rid_class      varchar not null
        constraint rule_input_data_fields_rule_input_data_rid_class_fk
            references dumb_brms.rule_input_data,
    rid_field_name varchar not null,
    rid_field_type varchar not null,
    project_id     bigint  not null
        constraint rule_input_data_fields_projects_id_fk
            references dumb_brms.projects,
    constraint rule_input_data_fields_pk
        primary key (rid_field_name, rid_class, rid_field_type, project_id)
);

alter table dumb_brms.rule_input_data_fields
    owner to postgres;

