create table dumb_brms.rule_conditions
(
    id_condition          bigint default nextval('dumb_brms.rules_id_condition_seq'::regclass) not null
        constraint rule_conditions_pk
            primary key,
    rule_id               bigint,
    condition_name_id     varchar,
    classname             varchar,
    field                 varchar,
    operator              varchar,
    value                 varchar,
    flg_use_id_conditions boolean                                                              not null,
    constraint rule_conditions_pk_2
        unique (rule_id, condition_name_id)
);

alter table dumb_brms.rule_conditions
    owner to postgres;

