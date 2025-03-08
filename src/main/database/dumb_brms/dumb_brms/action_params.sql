create table dumb_brms.action_params
(
    action          varchar              not null
        constraint action_params_actions_action_name_fk
            references dumb_brms.actions,
    param_name      varchar              not null,
    param_type      varchar
        constraint action_params_rule_data_types_data_type_fk
            references dumb_brms.rule_data_types,
    param_direction param_direction_enum not null,
    constraint action_params_pk
        primary key (action, param_name)
);

alter table dumb_brms.action_params
    owner to postgres;

