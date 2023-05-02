 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        regra_aplicada)
     values(999, 999, 'SAQUE', '2023-04-28', true, 5000, 'VALOR_MAIOR_300');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        regra_aplicada)
     values(998, 998, 'SAQUE', '2023-04-27', true, 280, 'VALOR_MAIOR_100EVALOR_MENORIGUAL_300');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        regra_aplicada)
     values(997, 997, 'SAQUE', '2023-04-28', false, 6000, 'EXCLUSIVE');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        regra_aplicada)
     values(996, 996, 'SAQUE', '2023-04-28', false, 100, 'NONE');

 insert into transacao( id_transacao,
                        id_cliente,
                        tipo_operacao,
                        data_transacao,
                        cobrado_taxa,
                        valor_operacao,
                        regra_aplicada)
     values(995, 999, 'DEPOSITO', '2023-04-28', false, 5050, 'NONE');
