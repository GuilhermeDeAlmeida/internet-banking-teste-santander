package br.com.santander.internetbankingtestesantander.model;

import java.math.BigDecimal;

public class Saque {
    private BigDecimal valor;
    private Boolean planoExclusive;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean isPlanoExclusive() {
        return planoExclusive;
    }

    public void setPlanoExclusive(Boolean planoExclusive) {
        this.planoExclusive = planoExclusive;
    }
}

