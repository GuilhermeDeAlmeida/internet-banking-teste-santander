package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Saque;
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
    private Saque saqueMenorCem;
    private Saque saqueMaiorCemMenorTrezentos;
    private Saque saqueMaiorTrezentos;
    private Saque saqueExclusive;

    @BeforeEach
    public void init(){
        this.service = new TaxaSobreSaqueService();
        this.saqueMenorCem = new Saque();
        this.saqueMaiorCemMenorTrezentos = new Saque();
        this.saqueMaiorTrezentos = new Saque();
        this.saqueExclusive = new Saque();
    }

    @Test
    void taxaDeveSerZeroQuandoValorSaqueMenorQueCem(){
        service.aplicarTaxa(saqueMenorCem);
    }

    @Test
    void taxaDeveSerZeroPontoZeroQuatroQuandoValorSaqueMaiorQueCemEMenorQueTrezentos(){
        service.aplicarTaxa(saqueMaiorTrezentos);
    }

    @Test
    void taxaDeveSerZeroPontoUmQuandoValorSaqueMaiorQueTrezentos(){
        service.aplicarTaxa(saqueMaiorCemMenorTrezentos);
    }

    @Test
    void taxaDeveSerZeroQuandoPlanoExclusive(){
        service.aplicarTaxa(saqueExclusive);

    }
}
