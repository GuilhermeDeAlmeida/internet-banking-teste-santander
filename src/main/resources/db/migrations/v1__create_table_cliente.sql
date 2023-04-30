create table cliente (
    id_cliente bigint not null auto_increment,
    nome varchar(50) not null,
    plano_exclusive boolean,
    saldo decimal,
    numero_conta varchar,
    data_nascimento date,
    primary key(id_cliente)
);

insert into cliente( id_cliente, nome, plano_exclusive, saldo, numero_conta, data_nascimento)
    values(1, 'Guilherme de Almeida Freitas', false, 4950, '10371301', '1996-05-10 09:00:00');
insert into cliente( id_cliente, nome, plano_exclusive, saldo, numero_conta, data_nascimento)
    values(2, 'Thiago de Almeida Freitas', false, 10000, '7817813', '1994-07-13 21:30:00');
insert into cliente( id_cliente, nome, plano_exclusive, saldo, numero_conta, data_nascimento)
    values(3, 'Maria Idaisa de Almeida', true, 10000, '178113', '1961-08-17 21:30:00');
insert into cliente( id_cliente, nome, plano_exclusive, saldo, numero_conta, data_nascimento)
    values(4, 'Bee Loo de Almeida Freitas', false, 10000, '7817813', '2010-01-08 21:30:00');