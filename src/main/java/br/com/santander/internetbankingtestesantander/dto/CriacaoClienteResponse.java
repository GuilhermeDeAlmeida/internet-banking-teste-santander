package br.com.santander.internetbankingtestesantander.dto;

import br.com.santander.internetbankingtestesantander.entity.Cliente;

import java.math.BigDecimal;

public record CriacaoClienteResponse(Long id,
                                     String nome,
                                     String dataNascimento,
                                     String numeroConta,
                                     BigDecimal saldo,
                                     Boolean planoExclusive) {

        public CriacaoClienteResponse(Cliente cliente){
                this(
                        cliente.getIdCliente(),
                        cliente.getNome(),
                        cliente.getDataNascimento(),
                        cliente.getNumeroConta(),
                        cliente.getSaldo(),
                        cliente.getPlanoExclusive()
                );
        }
}
