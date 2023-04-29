package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.OperacaoValorRequest;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorResponse;
import org.springframework.stereotype.Service;

@Service
public class ValoresService {

    /**
     * Depositar um valor que aumenta o saldo de um determinado cliente
     * */
    public OperacaoValorResponse depositarValor(OperacaoValorRequest operacaoValorRequest) {
        return new OperacaoValorResponse();
    }

    /**
     * valor <= 100     isento
     * valor > 100      0.004
     * valor > 300      0.01
     * planoExlcusive   isento
     * */
    public OperacaoValorResponse sacarValor(OperacaoValorRequest operacaoValorRequest) {
        return new OperacaoValorResponse();

    }


}
