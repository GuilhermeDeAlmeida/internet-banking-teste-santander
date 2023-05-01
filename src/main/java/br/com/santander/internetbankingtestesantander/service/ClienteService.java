package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.dto.CriacaoClienteRequest;
import br.com.santander.internetbankingtestesantander.dto.CriacaoClienteResponse;
import br.com.santander.internetbankingtestesantander.dto.ListagemClientesResponse;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    @Transactional
    public CriacaoClienteResponse cadastrarCliente(CriacaoClienteRequest clienteRequest){
        Cliente save = repository.save(new Cliente(clienteRequest));
        return new CriacaoClienteResponse(save);
    }

    public Page<ListagemClientesResponse> obterListaClientes(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemClientesResponse::new);
    }
}
