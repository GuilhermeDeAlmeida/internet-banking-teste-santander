package br.com.santander.internetbankingtestesantander.service.validacao;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import java.math.BigDecimal;

public class ValorOperacaoMenorIgualCem extends ValidacaoTaxa{
    public ValorOperacaoMenorIgualCem(ValidacaoTaxa proximo) {
        super(proximo);
    }

    @Override
    public Taxa efetuarCalculo(SaqueRequest saque, Cliente cliente) {
        return new Taxa(saque.valor(), saque.valor(), TipoTaxa.NONE, false);
    }

    @Override
    public boolean deveAplicar(SaqueRequest saque, Cliente cliente) {
        return saque.valor().compareTo(new BigDecimal("100")) <= 0;
    }

}

