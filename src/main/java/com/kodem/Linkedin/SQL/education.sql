-- auto-generated definition
create table education
(
    id             int           not null
        primary key,
    user_id        int           null,
    school         varchar(50)   null,
    degree         varchar(50)   null,
    field_of_study varchar(50)   null,
    start          varchar(20)   null,
    stop           varchar(50)   null,
    grade          double        null,
    activities     varchar(500)  null,
    description    varchar(1000) null,
    constraint education_ibfk_1
        foreign key (user_id) references users (id)
);

create index user_id
    on education (user_id);

