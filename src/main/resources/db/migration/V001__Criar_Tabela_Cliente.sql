Create table Cliente(
id  BigInt not null primary key auto_increment,
nome VARCHAR(150),
contatoid bigint not null
);
Alter table CLiente add constraint FK_cliente_contato foreign key(contatoid) references contato(id);
insert into Cliente(nome,contatoid) values ('adalberto',1);
insert into Cliente(nome,contatoid) values ('jose',2);
insert into Cliente(nome,contatoid) values ('rosana',3);
insert into Cliente(nome,contatoid) values ('cleiton',4);
insert into Cliente(nome,contatoid) values ('roberta',5);



