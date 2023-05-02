package br.com.santander.internetbankingtestesantander.controller;

import br.com.santander.internetbankingtestesantander.dto.CriacaoClienteRequest;

import br.com.santander.internetbankingtestesantander.dto.CriacaoClienteResponse;
import br.com.santander.internetbankingtestesantander.dto.ListagemClientesResponse;
import br.com.santander.internetbankingtestesantander.service.ClienteService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;


@RestController
@RequestMapping("clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CriacaoClienteResponse> cadastrarCliente(
            @RequestBody @Valid CriacaoClienteRequest cliente,
            UriComponentsBuilder uriBuilder
    ){
        CriacaoClienteResponse clienteResponse = service.cadastrarCliente(cliente);
        var uri = uriBuilder.path("/clientes/{id}").buildAndExpand(clienteResponse.id()).toUri();
        return ResponseEntity.created(uri).body(clienteResponse);
    }

    @GetMapping
    public ResponseEntity<Page<ListagemClientesResponse>> obterListaClientes(@PageableDefault(sort = {"nome"}) Pageable paginacao) {
        return ResponseEntity.ok(service.obterListaClientes(paginacao));
    }


}
