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
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public CriacaoClienteResponse cadastrarCliente(CriacaoClienteRequest clienteRequest){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(clienteRequest.dataNascimento(), formatter);
        }catch(Exception ex){
            return null;
        }

        List<Cliente> contasExistentes = repository.findByNumeroConta(clienteRequest.numeroConta());
        if(contasExistentes.size() > 0){
            return null;
        }
        Cliente save = repository.save(new Cliente(clienteRequest));
        return new CriacaoClienteResponse(save);
    }

    public Page<ListagemClientesResponse> obterListaClientes(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemClientesResponse::new);
    }
}
