create table dumb_brms.actions
(
    action_name varchar not null
        constraint actions_pk
            primary key
);

alter table dumb_brms.actions
    owner to postgres;

