package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.DepositoRequest;
import br.com.santander.internetbankingtestesantander.dto.DepositoResponse;
import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.dto.SaqueResponse;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.entity.Transacao;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.repository.ClienteRepository;
import br.com.santander.internetbankingtestesantander.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ValoresService {

    private final ClienteRepository clienteRepository;
    private final TransacaoRepository transacaoRepository;
    private final TaxaSobreSaqueService taxaSobreSaqueService;


    public ValoresService(ClienteRepository clienteRepository,
                          TransacaoRepository transacaoRepository,
                          TaxaSobreSaqueService taxaSobreSaqueService) {
        this.clienteRepository = clienteRepository;
        this.transacaoRepository = transacaoRepository;
        this.taxaSobreSaqueService = taxaSobreSaqueService;
    }

    public SaqueResponse sacarValor(SaqueRequest saque) {
        List<Cliente> listaClientes = clienteRepository.findByNumeroConta(saque.numeroConta());
        Cliente cliente = listaClientes.get(0);
        Taxa taxa = taxaSobreSaqueService.aplicarTaxa(saque, cliente);
        BigDecimal novoSaldo = cliente.getSaldo().subtract(taxa.valorComTaxa());
        cliente.setSaldo(novoSaldo);
        clienteRepository.save(cliente);
        transacaoRepository.save(
            new Transacao(cliente.getIdCliente(), LocalDate.now(), taxa)
        );
        return new SaqueResponse(cliente);
    }

    public DepositoResponse depositarValor(DepositoRequest deposito) {
        Cliente cliente = clienteRepository.findByNumeroConta(deposito.numeroConta()).get(0);
        BigDecimal novoSaldo = cliente.getSaldo().add(deposito.valor());
        cliente.setSaldo(novoSaldo);
        clienteRepository.save(cliente);

        transacaoRepository.save(
                new Transacao(cliente.getIdCliente(), LocalDate.now(), deposito.valor())
        );

        return new DepositoResponse(cliente);
    }
}
