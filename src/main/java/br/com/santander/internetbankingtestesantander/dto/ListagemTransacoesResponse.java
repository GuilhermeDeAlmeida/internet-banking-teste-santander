package br.com.santander.internetbankingtestesantander.dto;

import br.com.santander.internetbankingtestesantander.entity.Transacao;

import java.math.BigDecimal;
import java.util.Date;

public record ListagemTransacoesResponse(Long idTransacao,
                                         String tipoTransacao,
                                         Date dataTransacao,
                                         Boolean cobradoTaxa,
                                         BigDecimal valorOperacao,
                                         BigDecimal saldoInicial,
                                         BigDecimal novoSaldo,
                                         String regraAplicada) {

    public ListagemTransacoesResponse(Transacao transacao){
        this(
                transacao.getIdTransacao(),
                transacao.getTipoOperacao(),
                transacao.getDataTransacao(),
                transacao.getCobradoTaxa(),
                transacao.getValorOperacao(),
                transacao.getSaldoInicial(),
                transacao.getNovoSaldo(),
                transacao.getRegraAplicada()
        );
    }
}
