package br.com.santander.internetbankingtestesantander.delegate;

import br.com.santander.internetbankingtestesantander.api.ClienteApiDelegate;
import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import br.com.santander.internetbankingtestesantander.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteDelegateImpl implements ClienteApiDelegate {

    private ClienteService clienteService;

    public ClienteDelegateImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public ResponseEntity<ClienteResponse> cadastrarCliente(Cliente cliente) {
         return ClienteApiDelegate.super.cadastrarCliente(cliente);
    }
}
