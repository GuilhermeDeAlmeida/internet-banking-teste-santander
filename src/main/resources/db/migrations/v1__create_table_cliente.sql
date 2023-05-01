create table cliente (
    id_cliente bigint not null auto_increment,
    nome varchar(50) not null,
    plano_exclusive boolean,
    saldo decimal,
    numero_conta varchar,
    data_nascimento date,
    primary key(id_cliente)
);