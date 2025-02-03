create table dumb_brms.users
(
    id          bigserial
        constraint users_pk
            primary key,
    username    varchar not null,
    psw_hash    varchar not null,
    email       varchar not null
        constraint users_pk_2
            unique,
    flg_deleted boolean default false
);

alter table dumb_brms.users
    owner to postgres;

