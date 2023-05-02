package br.com.santander.internetbankingtestesantander.service.validacao;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import java.math.BigDecimal;

public class ValorOperacaoMaiorTrezentos extends ValidacaoTaxa{
    public ValorOperacaoMaiorTrezentos(ValidacaoTaxa proximo) {
        super(proximo);
    }

    @Override
    public Taxa efetuarCalculo(SaqueRequest saque, Cliente cliente) {
        return new Taxa(saque.valor(), valorTaxado(saque.valor()), TipoTaxa.VALOR_MAIOR_300, true);
    }

    private BigDecimal valorTaxado(BigDecimal valor) {
        BigDecimal taxa = new BigDecimal("0.01");
        return valor.add(valor.multiply(taxa));
    }

    @Override
    public boolean deveAplicar(SaqueRequest saque, Cliente cliente) {
        return saque.valor().compareTo(new BigDecimal("300")) > 0;
    }

}