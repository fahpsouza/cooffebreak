create table produtos(
     id bigint not null auto_increment,
     nome varchar(100) not null unique,
     valor varchar(14) not null,
     tipo_produto varchar(100) not null,
     createdDate timestamp,
     primary key(id)
);