package br.com.santander.internetbankingtestesantander.controller;

import br.com.santander.internetbankingtestesantander.dto.ListagemTransacoesResponse;
import br.com.santander.internetbankingtestesantander.service.TransacoesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("transacoes")
public class TransacaoController {

    private final TransacoesService service;

    public TransacaoController(TransacoesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<ListagemTransacoesResponse>> obterListaTransacoes(
            @PageableDefault(size = 10, sort = {"dataTransacao"}) Pageable paginacao,
            @RequestParam String dataTransacao,
            @RequestParam String tipoOperacao) {
        return ResponseEntity.ok(service
                .obterListaTransacoes(paginacao, dataTransacao, tipoOperacao));
    }


    @GetMapping("/teste")
    public ResponseEntity<Page<ListagemTransacoesResponse>> obterTransacoes() {
        return ResponseEntity.ok(service
                .obterListaTransacoes());
    }


}
