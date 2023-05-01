package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.dto.SaqueResponse;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorRequest;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorResponse;
import br.com.santander.internetbankingtestesantander.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ValoresService {

    private final ClienteRepository clienteRepository;

    private final TaxaSobreSaqueService taxaSobreSaqueService;


    public ValoresService(ClienteRepository clienteRepository,
                          TaxaSobreSaqueService taxaSobreSaqueService) {
        this.clienteRepository = clienteRepository;
        this.taxaSobreSaqueService = taxaSobreSaqueService;
    }

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


    public SaqueResponse sacarValor(SaqueRequest saque) {
        Cliente cliente = clienteRepository.findByNumeroConta(saque.numeroConta());
        BigDecimal novoSaldo = cliente.getSaldo().subtract(saque.valor());
        cliente.setSaldo(novoSaldo);
        clienteRepository.save(cliente);

        return new SaqueResponse(cliente);
    }
}
