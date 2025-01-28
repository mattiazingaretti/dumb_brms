create table output_data_types
(
    project_id      bigint  not null,
    user_id         bigint  not null,
    data_type_name  varchar not null,
    data_type_descr varchar,
    flg_deleted     boolean default false,
    constraint output_data_types_pk
        primary key (user_id, project_id, data_type_name)
);

alter table output_data_types
    owner to postgres;

