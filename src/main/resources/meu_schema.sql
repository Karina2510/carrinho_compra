/*CRIAR TABELAS*/

use carrinho_compra;

CREATE TABLE CATEGORIA(
    id int auto_increment primary key,
    nome VARCHAR (100)
);

create table PRODUTO (
    id int auto_increment primary key,
    nome VARCHAR (100),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES CATEGORIA(id)
);