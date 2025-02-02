create table roles
(
    role varchar not null
        constraint roles_pk
            primary key
);

alter table roles
    owner to postgres;

