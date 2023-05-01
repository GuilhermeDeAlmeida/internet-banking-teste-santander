 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        saldo_inicial,
                        novo_saldo,
                        regra_aplicada)
     values(1, 1, 'SAQUE', '2023-04-28', true, 5000, 10000, 4950, 'VALOR>300');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        saldo_inicial,
                        novo_saldo,
                        regra_aplicada)
     values(2, 2, 'SAQUE', '2023-04-27', true, 280, 10000, 278.88, 'VALOR>100&<=300');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        saldo_inicial,
                        novo_saldo,
                        regra_aplicada)
     values(3, 3, 'SAQUE', '2023-04-28', false, 6000, 10000, 4000, 'EXCLUSIVE');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        saldo_inicial,
                        novo_saldo,
                        regra_aplicada)
     values(4, 4, 'SAQUE', '2023-04-28', false, 100, 10000, 4000, 'NENHUM');
 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        saldo_inicial,
                        novo_saldo,
                        regra_aplicada)
     values(5, 1, 'DEPOSITO', '2023-04-28', false, 5050, 4950, 10000, 'NENHUM');
