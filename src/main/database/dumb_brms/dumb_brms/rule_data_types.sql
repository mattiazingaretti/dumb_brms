create table dumb_brms.rule_data_types
(
    data_type varchar not null
        constraint rule_data_types_pk
            primary key
);

alter table dumb_brms.rule_data_types
    owner to postgres;

