CREATE TABLE pessoa
(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome   varchar(50) NOT NULL,
    logradouro varchar(50),
    numero int(5),
    complemento varchar(50),
    bairro varchar(50),
    cep varchar(10),
    cidade varchar(50),
    estado varchar(50),
    ativo int(1)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

insert into pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('bernard', 'rua da carioca', '150', 'rv 06', 'copacabana', '38408-208', 'Uberlandia', 'Minas Gerais', 1);
insert into pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('larissa', 'rua vigilato pereira', '120', null, 'saraiva', '38408-208', 'Uberlandia', 'Minas Gerais', 1);
insert into pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('jaderson', 'rua carajás', '720', 'apto 702', 'copacabana', '38408-208', 'Uberlandia', 'Minas Gerais', 1);