package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Saque;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
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
        BigDecimal cem = new BigDecimal("100");
        BigDecimal trezentos = new BigDecimal("300");

        if(saque.isPlanoExclusive()){
            taxa = new BigDecimal(BigInteger.ZERO);
        }
        if(valorSaque.compareTo(cem) < 0){
            taxa = new BigDecimal(BigInteger.ZERO);
        }
        if(valorSaque.compareTo(cem) > 0 && valorSaque.compareTo(trezentos) < 0){
            taxa = new BigDecimal("0.004");
        }
        if(valorSaque.compareTo(trezentos) > 0){
            taxa = new BigDecimal("0.01");
        }

    }
}
