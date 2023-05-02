package br.com.santander.internetbankingtestesantander.model;

import java.math.BigDecimal;

public record Taxa(
        BigDecimal valorInicial,
        BigDecimal valorComTaxa,
        TipoTaxa regraAplicada,
        Boolean cobradoTaxa) {
}
