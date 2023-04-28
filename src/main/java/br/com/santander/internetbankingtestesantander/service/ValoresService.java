package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.OperacaoValorRequest;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorResponse;
import org.springframework.stereotype.Service;

@Service
public class ValoresService {

    public OperacaoValorResponse depositarValor(OperacaoValorRequest operacaoValorRequest) {
        return new OperacaoValorResponse();
    }

    public OperacaoValorResponse sacarValor(OperacaoValorRequest operacaoValorRequest) {
        return new OperacaoValorResponse();
    }
}
