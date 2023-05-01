package br.com.santander.internetbankingtestesantander.repository;

import br.com.santander.internetbankingtestesantander.entity.Transacao;
import br.com.santander.internetbankingtestesantander.model.TipoOperacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    Page<Transacao> findByDataTransacaoAndTipoOperacao(Pageable pageable, LocalDate dataTransacao, TipoOperacao tipoOperacao);
}
