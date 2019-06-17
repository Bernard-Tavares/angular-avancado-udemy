CREATE Table lancamento(
    codigo BIGINT(20) primary key Auto_increment,
    descricao VARCHAR(250) NOT NULL,
    data_vencimento DATE NOT null,
    data_pagamento DATE,
    valor Decimal(10,2) NOT null,
    observacao VARCHAR(100),
    tipo VARCHAR(20) NOT NULL,
    codigo_categoria BIGINT(20) NOT NULL,
    codigo_pessoa BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
    FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)

) ENGINE=InnoDB
DEFAULT CHARSET=utf8;

INSERT INTO lancamento( descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
values ('Salário mensal', '2017-06-10', null, 6500.00, 'Distribuição de lucros', 'RECEITA', '1', '1');
INSERT INTO lancamento( descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
values ('Bahamas', '2017-02-10', null, 100.00, null, 'DESPESA', '2', '1');
INSERT INTO lancamento( descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
values ('CEMIG', '2017-01-12', '2017-02-12', 101.00, 'Geração', 'RECEITA', '3', '1');
