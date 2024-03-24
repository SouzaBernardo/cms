create table if not exists page
(
    id   serial primary key,
    name varchar not null
);

create table if not exists section
(
    id   serial primary key,
    name varchar not null,
    type varchar not null,
    page_id int references page(id)
);

insert into page(name) values ('pagina 1');
insert into page(name) values ('home');
insert into page(name) values ('favoritos');

insert into section(name, type, page_id) values ('s1', 'BANNER', 1);
insert into section(name, type, page_id) values ('s2', 'BANNER', 1);
insert into section(name, type, page_id) values ('s3', 'BANNER', 3);