package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Service
public class TaxaSobreSaqueService {
    /**
     * valor <= 100     isento
     * valor > 100      0.004
     * valor > 300      0.01
     * planoExlcusive   isento
     * */
    public Taxa aplicarTaxa(SaqueRequest saque, Cliente cliente) {
        BigDecimal taxa = new BigDecimal(BigInteger.ZERO);
        BigDecimal valor = saque.valor();
        BigDecimal cem = new BigDecimal("100");
        BigDecimal trezentos = new BigDecimal("300");
        boolean cobradoTaxa = false;
        TipoTaxa regraAplicada = TipoTaxa.NONE;

        if(valor.compareTo(cem) < 0){
            taxa = new BigDecimal(BigInteger.ZERO);
            regraAplicada = TipoTaxa.NONE;
        }
        if(valor.compareTo(cem) > 0 && saque.valor().compareTo(trezentos) < 0){
            taxa = new BigDecimal("0.004");
            cobradoTaxa = true;
            regraAplicada = TipoTaxa.VALOR_MAIOR_100EVALOR_MENORIGUAL_300;
        }
        if(valor.compareTo(trezentos) > 0){
            taxa = new BigDecimal("0.01");
            cobradoTaxa= true;
            regraAplicada = TipoTaxa.VALOR_MAIOR_300;
        }
        if(cliente.getPlanoExclusive()){
            taxa = new BigDecimal(BigInteger.ZERO);
            cobradoTaxa= false;
            regraAplicada = TipoTaxa.EXCLUSIVE;
        }

        BigDecimal valorComTaxa = saque.valor().add(saque.valor().multiply(taxa));

        return new Taxa(valor, valorComTaxa, regraAplicada, cobradoTaxa);

    }
}
