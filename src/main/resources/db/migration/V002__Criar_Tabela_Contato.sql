Create table Contato(
id  BigInt not null primary key auto_increment,
descricao VARCHAR(300),
contato VARCHAR(300),
clienteid bigint not null
);
Alter table Contato add constraint FK_contato_cliente foreign key(clienteid) references cliente(id);
insert into Contato(contato,clienteid) values ('gabrielHsantos2018@gmail.com',1);
insert into Contato(contato,clienteid) values ('gabrielHsantos2019@gmail.com',2);
insert into Contato(contato,clienteid) values ('gabrielHsantos2020@gmail.com',3);
insert into Contato(contato,clienteid) values ('gabrielHsantos2021@gmail.com',4);
insert into Contato(contato,clienteid) values ('gabrielHsantos2022@gmail.com',5);