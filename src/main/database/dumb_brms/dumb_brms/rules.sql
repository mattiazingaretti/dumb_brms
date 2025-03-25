create table dumb_brms.rules
(
    rule_id    bigint default nextval('dumb_brms.rules_id_seq'::regclass) not null
        constraint rules_pk
            primary key,
    project_id bigint
        constraint rules_projects_id_fk
            references dumb_brms.projects,
    salience   integer,
    rule_name  varchar                                                    not null,
    constraint rules_pk_2
        unique (rule_name, project_id)
);

alter table dumb_brms.rules
    owner to postgres;

