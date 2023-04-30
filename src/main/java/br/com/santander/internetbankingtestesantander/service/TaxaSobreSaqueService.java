package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Saque;

import java.math.BigDecimal;

public class TaxaSobreSaqueService {
    /**
     * valor <= 100     isento
     * valor > 100      0.004
     * valor > 300      0.01
     * planoExlcusive   isento
     * */
    public void aplicarTaxa(Saque saque) {
        BigDecimal valorSaque = saque.getValor();
        BigDecimal taxa;
        BigDecimal cem = new BigDecimal(100);

        if(saque.isPlanoExclusive){

        }
        if(valorSaque.compareTo(cem) < 0){

        }
        if(valorSaque.compareTo(cem) > 0 && valorSaque.compareTo(trezentos) < 0){

        }
        if(valorSaque.compareTo(trezentos) > 0){

        }


    }
}
