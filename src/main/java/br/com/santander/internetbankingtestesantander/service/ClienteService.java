package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public ClienteResponse cadastrarCliente(Cliente cliente){
        return new ClienteResponse();
    }
}
