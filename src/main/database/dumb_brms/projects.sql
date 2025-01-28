create table projects
(
    id                bigint                  not null,
    user_id           bigint                  not null,
    project_name      varchar                 not null,
    last_update       timestamp default now() not null,
    creation_datetime timestamp default now() not null,
    constraint projects_pk
        primary key (id, user_id)
);

alter table projects
    owner to postgres;

