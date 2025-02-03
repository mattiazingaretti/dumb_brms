create table dumb_brms.roles
(
    role varchar not null
        constraint roles_pk
            primary key
);

alter table dumb_brms.roles
    owner to postgres;

