-- auto-generated definition
create table users
(
    id        int          not null
        primary key,
    username  varchar(20)  null,
    password  varchar(20)  null,
    firstname varchar(20)  null,
    lastname  varchar(20)  null,
    headline  varchar(50)  null,
    dob       varchar(20)  null,
    gender    varchar(10)  null,
    address   varchar(50)  null,
    phoneno   bigint       null,
    mailid    varchar(255) null,
    constraint users_username_uindex
        unique (username)
);