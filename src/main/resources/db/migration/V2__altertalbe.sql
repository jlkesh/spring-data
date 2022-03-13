ALTER TABLE movie
    RENAME COLUMN release_date TO rd;

create table actor
(
    id   bigserial primary key,
    name varchar(100)
);
