--CRIAR TABELAS

use carrinho_compra;

CREATE TABLE CATEGORIA(
    id int auto_increment primary key,
    nome VARCHAR (100)
);

create table PRODUTO(
	id int auto_increment primary key,
	nome VARCHAR (100),
	foreign key (id) references CATEGORIAS(id)
);