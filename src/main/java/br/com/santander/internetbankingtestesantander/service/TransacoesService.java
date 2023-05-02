package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.ListagemClientesResponse;
import br.com.santander.internetbankingtestesantander.dto.ListagemTransacoesResponse;
import br.com.santander.internetbankingtestesantander.model.TipoOperacao;
import br.com.santander.internetbankingtestesantander.repository.TransacaoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public Page<ListagemTransacoesResponse> obterListaTransacoes(Pageable paginacao, String dataTransacao, TipoOperacao tipoOperacao) {
        Page<ListagemTransacoesResponse> map;

//        if(tipoOperacao.equals("SAQUE") || tipoOperacao.equals("DEPOSITO") )

        if(null != dataTransacao && !dataTransacao.isBlank()){
            LocalDate date = null;
            try{
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                date = LocalDate.parse(dataTransacao, formatter);
            }catch (Exception e){
                return null;
            }
            map = repository
                    .findByDataTransacaoAndTipoOperacao(paginacao, date, tipoOperacao)
                    .map(ListagemTransacoesResponse::new);
        }else{
            map = repository
                    .findByTipoOperacao(paginacao, tipoOperacao)
                    .map(ListagemTransacoesResponse::new);
        }

        return map;
    }

    public Page<ListagemTransacoesResponse> obterListaTransacoes() {
         return repository.findAll(Pageable.ofSize(10))
                 .map(ListagemTransacoesResponse::new);
    }
}
