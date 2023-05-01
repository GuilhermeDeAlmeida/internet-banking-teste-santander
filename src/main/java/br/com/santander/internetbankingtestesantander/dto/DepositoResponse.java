package br.com.santander.internetbankingtestesantander.dto;

import br.com.santander.internetbankingtestesantander.entity.Cliente;

import java.math.BigDecimal;

public record DepositoResponse(Long id,
                               String nome,
                               String dataNascimento,
                               String numeroConta,
                               String conta,
                               BigDecimal saldo,
                               Boolean planoExclusive) {

    public DepositoResponse(Cliente cliente){
        this(
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getDataNascimento(),
                cliente.getNumeroConta(),
                cliente.getNumeroConta(),
                cliente.getSaldo(),
                cliente.getPlanoExclusive()
        );
    }
}
