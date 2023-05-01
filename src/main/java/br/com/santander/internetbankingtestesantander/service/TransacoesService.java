package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.ListagemClientesResponse;
import br.com.santander.internetbankingtestesantander.dto.ListagemTransacoesResponse;
import br.com.santander.internetbankingtestesantander.repository.TransacaoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TransacoesService {

    private final TransacaoRepository repository;

    public TransacoesService(TransacaoRepository repository) {
        this.repository = repository;
    }

    /**
     * Consultar o histórico de transações de cada movimentação por Data
     * (Saque e depósito)
     * */
    public Page<ListagemTransacoesResponse> obterListaTransacoes(Pageable paginacao, String dataTransacao, String tipoOperacao) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Page<ListagemTransacoesResponse> map = null;
        try {
            map= repository
                    .findByDataTransacaoAndTipoOperacao(paginacao, formato.parse(dataTransacao), tipoOperacao)
                    .map(ListagemTransacoesResponse::new);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    public Page<ListagemTransacoesResponse> obterListaTransacoes() {
         return repository.findAll(Pageable.ofSize(10))
                 .map(ListagemTransacoesResponse::new);
    }
}
