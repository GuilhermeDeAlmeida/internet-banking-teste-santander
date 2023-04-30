package br.com.santander.internetbankingtestesantander.service;

import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import org.junit.jupiter.api.Test;

public class ClienteServiceTest {
    private ClienteService clienteService;
    private Cliente cliente;

    @Test
    void cadastrarCliente() {
        ClienteResponse cliente = clienteService.cadastrarCliente(this.cliente);
    }

    @Test
    void obterListaComTodosOsClientes() {
        clienteService.obterListaClientes();
    }

}
