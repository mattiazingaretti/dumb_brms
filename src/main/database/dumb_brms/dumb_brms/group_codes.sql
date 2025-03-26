create table dumb_brms.group_codes
(
    group_code       varchar not null
        constraint group_codes_pk
            primary key,
    group_code_descr varchar
);

alter table dumb_brms.group_codes
    owner to postgres;

