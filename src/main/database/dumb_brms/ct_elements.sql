create table ct_elements
(
    group_code    varchar not null
        constraint ct_elements_group_codes_group_code_fk
            references group_codes,
    element_code  varchar not null,
    element_descr varchar not null,
    filter        varchar,
    last_update   timestamp default now(),
    constraint ct_elements_pk
        primary key (group_code, element_code, element_descr)
);

alter table ct_elements
    owner to postgres;

