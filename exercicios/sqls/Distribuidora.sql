DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS estoque;
DROP TABLE IF EXISTS fornecedor;
DROP TABLE IF EXISTS situacao_fornecedor;
DROP TABLE IF EXISTS mercadoria;


CREATE TABLE mercadoria (
    id serial primary key,
    nome varchar(50) not null,
    descricao varchar(100)
);

CREATE TABLE situacao_fornecedor (
    id integer primary key,
    descricao varchar(20) not null
);

CREATE TABLE fornecedor (
    id serial primary key,
    nome varchar(50) not null,
    id_situacao integer references situacao_fornecedor(id) not null
);

CREATE TABLE estoque (
    id serial primary key,
    id_mercadoria integer references mercadoria(id) not null,
    id_fornecedor integer references fornecedor(id) not null,
    quantidade integer not null default 0
);

CREATE TABLE reserva (
    id serial primary key,
    numero_compra integer Unique not null,
    id_mercadoria integer references mercadoria(id) not null,
    id_fornecedor integer references fornecedor(id) not null,
    quantidade integer not null default 0
);

-- Inserindo dados de mercadoria
INSERT INTO mercadoria (nome) VALUES ('lapis');
INSERT INTO mercadoria (nome) VALUES ('papel');
INSERT INTO mercadoria (nome) VALUES ('borracha');
INSERT INTO mercadoria (nome) VALUES ('tesoura');

-- Inserindo fornecedores
INSERT INTO situacao_fornecedor (id, descricao) VALUES (1, 'ATIVO');
INSERT INTO situacao_fornecedor (id, descricao) VALUES (2, 'INATIVO');

INSERT INTO fornecedor (nome, id_situacao) VALUES ('Jotuje', 1);
INSERT INTO fornecedor (nome, id_situacao) VALUES ('Montreal', 1);
INSERT INTO fornecedor (nome, id_situacao) VALUES ('Brasileiras', 2);
INSERT INTO fornecedor (nome, id_situacao) VALUES ('Alves', 1);

-- Inserindo estoque
INSERT INTO estoque (id_mercadoria, id_fornecedor, quantidade) VALUES (1, 2, 100);
INSERT INTO estoque (id_mercadoria, id_fornecedor, quantidade) VALUES (1, 4, 50);
INSERT INTO estoque (id_mercadoria, id_fornecedor, quantidade) VALUES (2, 2, 1000);
INSERT INTO estoque (id_mercadoria, id_fornecedor, quantidade) VALUES (3, 1, 500);
INSERT INTO estoque (id_mercadoria, id_fornecedor) VALUES (4, 1);