create table transacao (
    id_transacao bigint primary key not null auto_increment,
    id_cliente bigint,
    tipo_operacao varchar(50) not null,
    data_transacao date,
    cobrado_taxa boolean,
    valor_operacao decimal,
    saldo_inicial decimal,
    novo_saldo decimal,
    regra_aplicada varchar,

    foreign key(id_cliente) references cliente (id_cliente)
);
