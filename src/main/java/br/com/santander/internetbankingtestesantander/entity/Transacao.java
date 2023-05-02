package br.com.santander.internetbankingtestesantander.entity;


import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoOperacao;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Transacao {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long idTransacao;
    Long idCliente;
    @Enumerated(EnumType.STRING)
    TipoOperacao tipoOperacao;
    LocalDate dataTransacao;
    Boolean cobradoTaxa;
    BigDecimal valorOperacao;
    @Enumerated(EnumType.STRING)
    TipoTaxa regraAplicada;

    public Transacao() {
    }

    public Transacao(Long idCliente,
                     LocalDate dataTransacao,
                     Taxa taxa) {

        this.idCliente = idCliente;
        this.tipoOperacao = TipoOperacao.SAQUE;
        this.dataTransacao = dataTransacao;
        this.cobradoTaxa = taxa.cobradoTaxa();
        this.valorOperacao = taxa.valorComTaxa();
        this.regraAplicada = taxa.regraAplicada();
    }

    public Transacao(Long idCliente,
                     LocalDate dataTransacao,
                     BigDecimal valorOperacao) {

        this.idCliente = idCliente;
        this.tipoOperacao = TipoOperacao.DEPOSITO;
        this.dataTransacao = dataTransacao;
        this.cobradoTaxa = false;
        this.valorOperacao = valorOperacao;
        this.regraAplicada = TipoTaxa.NONE;
    }


    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public TipoTaxa getRegraAplicada() {
        return regraAplicada;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public Boolean getCobradoTaxa() {
        return cobradoTaxa;
    }

    public BigDecimal getValorOperacao() {
        return valorOperacao;
    }

}
