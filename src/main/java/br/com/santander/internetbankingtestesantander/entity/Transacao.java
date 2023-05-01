package br.com.santander.internetbankingtestesantander.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Transacao {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long idTransacao;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    Cliente cliente;
    String tipoOperacao;
    Date dataTransacao;
    Boolean cobradoTaxa;
    BigDecimal valorOperacao;
    BigDecimal saldoInicial;
    BigDecimal novoSaldo;
    String regraAplicada;

    public Transacao() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public Boolean getCobradoTaxa() {
        return cobradoTaxa;
    }

    public BigDecimal getValorOperacao() {
        return valorOperacao;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public BigDecimal getNovoSaldo() {
        return novoSaldo;
    }

    public String getRegraAplicada() {
        return regraAplicada;
    }
}
