package br.com.santander.internetbankingtestesantander.rules;

import br.com.santander.internetbankingtestesantander.service.TaxaSobreSaqueService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxaSobreSaqueServiceTest {
    /**
     * valor <= 100     isento
     * valor > 100      0.004
     * valor > 300      0.01
     * planoExlcusive   isento
     * */
    private TaxaSobreSaqueService service;
    @BeforeEach
    public void init(){
        this.service = service;
    }

    @Test
    void taxaDeveSerZeroQuandoValorSaqueMenorQueCem(){

    }

    @Test
    void taxaDeveSerZeroQuandoPlanoExclusive(){

    }

    @Test
    void taxaDeveSerZeroPontoZeroQuatroQuandoValorSaqueMaiorQueCemEMenorQueTrezentos(){

    }

    @Test
    void taxaDeveSerZeroPontoUmQuandoValorSaqueMaiorQueTrezentos(){

    }
//    void taxaDeveriaSerZeroPontoZeroQuatroQuandoTaxa
}
