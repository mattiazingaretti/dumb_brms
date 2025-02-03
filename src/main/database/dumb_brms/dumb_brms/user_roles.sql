create table dumb_brms.user_roles
(
    user_id   bigint
        constraint user_roles_users_id_fk
            references dumb_brms.users,
    user_role varchar
        constraint user_roles_roles_role_fk
            references dumb_brms.roles
);

alter table dumb_brms.user_roles
    owner to postgres;

