package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.TransacaoResponse;
import org.springframework.stereotype.Service;

@Service
public class TransacoesService {

    public TransacaoResponse obterHistoricoTransacoes(String dataTransacoes, String tipoOperacao) {

        return new TransacaoResponse();
    }

}
