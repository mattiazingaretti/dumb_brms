create view v_users(id, username, psw_hash, email, user_role) as
SELECT u.id,
       u.username,
       u.psw_hash,
       u.email,
       ur.user_role
FROM dumb_brms.users u
         LEFT JOIN dumb_brms.user_roles ur ON u.id = ur.user_id AND u.flg_deleted = false;

alter table v_users
    owner to postgres;

