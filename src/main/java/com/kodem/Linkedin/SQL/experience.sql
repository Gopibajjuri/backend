-- auto-generated definition
create table experience
(
    id           int          not null
        primary key,
    user_id      int          null,
    title        varchar(20)  null,
    company_name varchar(100) null,
    location     varchar(50)  null,
    start        varchar(20)  null,
    stop         varchar(20)  null,
    headline     varchar(50)  null,
    constraint experience_ibfk_1
        foreign key (user_id) references users (id)
);

create index user_id
    on experience (user_id);

