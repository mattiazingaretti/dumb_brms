create table dumb_brms.projects
(
    id                bigserial
        constraint projects_pk
            primary key,
    user_id           bigint                  not null,
    project_name      varchar                 not null,
    last_update       timestamp default now() not null,
    creation_datetime timestamp default now() not null,
    constraint projects_pk_2
        unique (id, user_id)
);

alter table dumb_brms.projects
    owner to postgres;

