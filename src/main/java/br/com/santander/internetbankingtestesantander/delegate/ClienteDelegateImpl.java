package br.com.santander.internetbankingtestesantander.delegate;

import br.com.santander.internetbankingtestesantander.api.ClientesApiDelegate;
import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import br.com.santander.internetbankingtestesantander.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteDelegateImpl implements ClientesApiDelegate {

    private ClienteService clienteService;

    public ClienteDelegateImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public ResponseEntity<ClienteResponse> cadastrarCliente(Cliente cliente) {
        return ResponseEntity.ok(clienteService.cadastrarCliente(cliente));
    }

    @Override
    public ResponseEntity<List<ClienteResponse>> obterListaClientes() {
        return ResponseEntity.ok(clienteService.obterListaClientes());
    }
}
