package br.com.santander.internetbankingtestesantander.controller;

import br.com.santander.internetbankingtestesantander.dto.*;
import br.com.santander.internetbankingtestesantander.service.ValoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("operacoes")
public class OperacaoController {
    private final ValoresService service;

    public OperacaoController(ValoresService service) {
        this.service = service;
    }

    @PostMapping("/sacar")
    public ResponseEntity<SaqueResponse> sacarValorCliente(@RequestBody @Valid SaqueRequest saque) {
        SaqueResponse saqueResponse = service.sacarValor(saque);
        return ResponseEntity.ok(saqueResponse);
    }

    @PostMapping("/depositar")
    public ResponseEntity<DepositoResponse> depositarValorCliente(@RequestBody @Valid DepositoRequest deposito) {
        DepositoResponse depositoResponse = service.depositarValor(deposito);
        return ResponseEntity.ok(depositoResponse);
    }
}
