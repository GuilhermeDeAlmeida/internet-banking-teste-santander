package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.TransacaoResponse;
import org.springframework.stereotype.Service;

@Service
public class TransacoesService {


    /**
     * Consultar o histórico de transações de cada movimentação por Data
     * (Saque e depósito)
     * */
    public TransacaoResponse obterHistoricoTransacoes(String dataTransacoes, String tipoOperacao) {

        return new TransacaoResponse();
    }

}
