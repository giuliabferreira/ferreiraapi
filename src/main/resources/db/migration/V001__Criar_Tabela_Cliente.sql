Create table Cliente(
id  BigInt not null primary key auto_increment,
nome VARCHAR(150)
);
insert into Cliente(nome) values ('adalberto');
insert into Cliente(nome) values ('jose');
insert into Cliente(nome) values ('rosana');
insert into Cliente(nome) values ('cleiton');
insert into Cliente(nome) values ('roberta');

Create table Contato (
id  BigInt not null primary key auto_increment,
descricao VARCHAR(300),
contato VARCHAR
);

insert into Contato