-- auto-generated definition
create table skill
(
    id      int          not null
        primary key,
    skill   varchar(255) null,
    user_id int          null,
    constraint FKohg89pau976dm4s904dadgqhl
        foreign key (user_id) references users (id)
);

