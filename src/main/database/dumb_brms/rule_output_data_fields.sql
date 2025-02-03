-- auto-generated definition
create table rule_output_data_fields
(
    rod_class      varchar
        constraint rule_output_data_fields_rule_output_data_rid_class_fk
            references rule_output_data,
    rod_field_name varchar not null
        constraint rule_output_data_fields_pk
            primary key,
    rod_field_type varchar not null
);

alter table rule_output_data_fields
    owner to postgres;

