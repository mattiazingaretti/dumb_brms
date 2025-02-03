create table dumb_brms.ct_elements
(
    group_code    varchar not null
        constraint ct_elements_group_codes_group_code_fk
            references dumb_brms.group_codes,
    element_code  varchar not null,
    element_descr varchar not null,
    filter        varchar,
    last_update   timestamp default now(),
    constraint ct_elements_pk
        primary key (group_code, element_code, element_descr)
);

alter table dumb_brms.ct_elements
    owner to postgres;

