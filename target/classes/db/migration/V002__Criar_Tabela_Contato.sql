Create table Contato(
id  BigInt not null primary key auto_increment,
descricao varchar(50),
contato varchar(50),
clienteid bigint not null
);
Alter table Contato add constraint FK_contato_cliente foreign key(clienteid) references cliente(id);
insert into Contato(contato,clienteid) values ('giuliabferreira2018@hotmail.com', 1);
insert into Contato(contato,clienteid) values ('giuliabferreira2019@gmail.com', 2);
insert into Contato(contato,clienteid) values ('giuliabferreira2020@hotmail.com', 3);
insert into Contato(contato,clienteid) values ('giuliabferreira2021@gmail.com', 4);
insert into Contato(contato,clienteid) values ('giuliabferreira2022@hotmail.com', 5);