package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.DepositoRequest;
import br.com.santander.internetbankingtestesantander.dto.DepositoResponse;
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

    public SaqueResponse sacarValor(SaqueRequest saque) {
        //buscar cliente por conta
        Cliente cliente = clienteRepository.findByNumeroConta(saque.numeroConta());
        //obter e aplicar taxa sob valor do saque
        //subtrair valor do saque em relacao ao saldo do cliente
        BigDecimal novoSaldo = cliente.getSaldo().subtract(saque.valor());
        // atualizar saldo com o resultado e salvar cliente
        cliente.setSaldo(novoSaldo);
        clienteRepository.save(cliente);

        return new SaqueResponse(cliente);
    }

    public DepositoResponse depositarValor(DepositoRequest deposito) {
        Cliente cliente = clienteRepository.findByNumeroConta(deposito.numeroConta());
        BigDecimal novoSaldo = cliente.getSaldo().add(deposito.valor());
        cliente.setSaldo(novoSaldo);
        clienteRepository.save(cliente);

        return new DepositoResponse(cliente);
    }
}
