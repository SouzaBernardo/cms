create table if not exists page(
    id serail primary key,
    name varchar(255) not null
);

-- create table if not exists sections(
--     id serial primary key,
--     pageId int references page(id),
--     name text not null,
--     type text not null
-- );