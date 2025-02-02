create table user_roles
(
    user_id   bigint
        constraint user_roles_users_id_fk
            references users,
    user_role varchar
        constraint user_roles_roles_role_fk
            references roles
);

alter table user_roles
    owner to postgres;

