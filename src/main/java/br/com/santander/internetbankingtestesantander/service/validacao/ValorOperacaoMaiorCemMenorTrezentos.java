package br.com.santander.internetbankingtestesantander.service.validacao;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;
import br.com.santander.internetbankingtestesantander.model.TipoTaxa;

import java.math.BigDecimal;

public class ValorOperacaoMaiorCemMenorTrezentos extends ValidacaoTaxa{
    public ValorOperacaoMaiorCemMenorTrezentos(ValidacaoTaxa proximo) {
        super(proximo);
    }

    @Override
    public Taxa efetuarCalculo(SaqueRequest saque, Cliente cliente) {
        return new Taxa(saque.valor(), valorTaxado(saque.valor()), TipoTaxa.VALOR_MAIOR_100EVALOR_MENORIGUAL_300, true);
    }

    private BigDecimal valorTaxado(BigDecimal valor) {
        BigDecimal taxa = new BigDecimal("0.004");
        return valor.add(valor.multiply(taxa));
    }

    @Override
    public boolean deveAplicar(SaqueRequest saque, Cliente cliente) {
        return saque.valor().compareTo(new BigDecimal("100")) > 0 && saque.valor().compareTo(new BigDecimal("300")) <= 0;
    }

}