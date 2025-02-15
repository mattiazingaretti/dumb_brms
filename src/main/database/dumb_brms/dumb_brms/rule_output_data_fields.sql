create table dumb_brms.rule_output_data_fields
(
    rod_class      varchar not null,
    rod_field_name varchar not null,
    rod_field_type varchar not null
        constraint rule_output_data_fields_rule_data_types_data_type_fk
            references dumb_brms.rule_data_types,
    project_id     bigint  not null
        constraint rule_output_data_fields_projects_id_fk
            references dumb_brms.projects,
    constraint rule_output_data_fields_pk
        primary key (rod_field_name, rod_class, rod_field_type, project_id)
);

alter table dumb_brms.rule_output_data_fields
    owner to postgres;

