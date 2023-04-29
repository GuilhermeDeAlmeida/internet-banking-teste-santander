package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    /**
     * Retornar todos clientes cadastrados
     * */
    public ClienteResponse cadastrarCliente(Cliente cliente){
        return new ClienteResponse();
    }
    public List<ClienteResponse> obterListaClientes() {
        return new ArrayList<>();
    }
}
