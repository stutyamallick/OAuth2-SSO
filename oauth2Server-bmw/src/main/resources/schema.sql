DROP table IF EXISTS USERS;
DROP table IF EXISTS AUTHORITIES;

CREATE TABLE USERS(
    username varchar(50) not null primary key,
    password varchar(500) not null,
    enabled boolean not null
);

CREATE TABLE AUTHORITIES(
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users (username)
);

create unique index ix_auth_username on AUTHORITIES (username, authority);