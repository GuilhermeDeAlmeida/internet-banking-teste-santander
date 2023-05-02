package br.com.santander.internetbankingtestesantander.service.validacao;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClientePlanoExclusive extends ValidacaoTaxa{
    public ClientePlanoExclusive() {
        super(null);
    }

    @Override
    public Taxa efetuarCalculo(SaqueRequest saque, Cliente cliente) {
        return new Taxa(saque.valor(), saque.valor(), TipoTaxa.EXCLUSIVE, false);
    }

    @Override
    public boolean deveAplicar(SaqueRequest saque, Cliente cliente) {
        return cliente.getPlanoExclusive();
    }

}
