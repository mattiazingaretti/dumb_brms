-- auto-generated definition
create table rule_input_data_fields
(
    rid_class      varchar
        constraint rule_input_data_fields_rule_input_data_rid_class_fk
            references rule_input_data,
    rid_field_name varchar not null
        constraint rule_input_data_fields_pk
            primary key,
    rid_field_type varchar not null
);

alter table rule_input_data_fields
    owner to postgres;

