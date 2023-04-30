package br.com.santander.internetbankingtestesantander.service;

import org.junit.jupiter.api.Test;

public class TaxaSobreSaqueServiceTest {
    /**
     * valor <= 100     isento
     * valor > 100      0.004
     * valor > 300      0.01
     * planoExlcusive   isento
     * */
//    private TaxaSobreSaqueService service;
//    private Saque saque;
//    @BeforeEach
//    public void init(){
//        this.service = service;
//        this.saque = new Saque();
//    }

    @Test
    void taxaDeveSerZeroQuandoValorSaqueMenorQueCem(){
//        service.aplicarTaxa(saque);

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
