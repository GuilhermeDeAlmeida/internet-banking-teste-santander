package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.TransacaoResponse;
import org.junit.jupiter.api.Test;

public class TransacoesServiceTest {
    private TransacoesService transacoesService;
    private String dataTransacao;
    private String tipoOperacao;


    @Test
    void efetuarSaque() {
        TransacaoResponse transacoes = transacoesService.obterHistoricoTransacoes(this.dataTransacao, tipoOperacao);
    }

}
