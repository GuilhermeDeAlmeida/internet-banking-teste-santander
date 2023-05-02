package br.com.santander.internetbankingtestesantander.dto;

import br.com.santander.internetbankingtestesantander.entity.Transacao;
import br.com.santander.internetbankingtestesantander.model.TipoOperacao;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public record ListagemTransacoesResponse(Long idTransacao,
                                         TipoOperacao tipoTransacao,
                                         LocalDate dataTransacao,
                                         Boolean cobradoTaxa,
                                         BigDecimal valorOperacao,
                                         TipoTaxa regraAplicada) {

    public ListagemTransacoesResponse(Transacao transacao){
        this(
                transacao.getIdTransacao(),
                transacao.getTipoOperacao(),
                transacao.getDataTransacao(),
                transacao.getCobradoTaxa(),
                transacao.getValorOperacao(),
                transacao.getRegraAplicada()
        );
    }
}
