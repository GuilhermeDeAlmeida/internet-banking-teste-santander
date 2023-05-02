package br.com.santander.internetbankingtestesantander.entity;


import br.com.santander.internetbankingtestesantander.dto.CriacaoClienteRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nome;
    private Boolean planoExclusive;
    private BigDecimal saldo;
    private String numeroConta;
    private String dataNascimento;

    public Cliente() {
    }

    public Cliente(CriacaoClienteRequest clienteRequest) {
        this.nome= clienteRequest.nome();
        this.planoExclusive= clienteRequest.planoExclusive();
        this.saldo= clienteRequest.saldo();
        this.numeroConta= clienteRequest.numeroConta();
        this.dataNascimento= clienteRequest.dataNascimento();
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getPlanoExclusive() {
        return planoExclusive;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

}
