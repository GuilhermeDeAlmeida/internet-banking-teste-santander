package br.com.santander.internetbankingtestesantander.service.validacao;

import br.com.santander.internetbankingtestesantander.dto.SaqueRequest;
import br.com.santander.internetbankingtestesantander.entity.Cliente;
import br.com.santander.internetbankingtestesantander.model.Taxa;

import java.math.BigDecimal;

public abstract class ValidacaoTaxa {
    protected ValidacaoTaxa proximo;

    public ValidacaoTaxa(ValidacaoTaxa proximo) {
        this.proximo = proximo;
    }

    public Taxa calcularTaxa(SaqueRequest saque, Cliente cliente){

        if(deveAplicar(saque, cliente)){
            return efetuarCalculo(saque, cliente);
        }
        return proximo.calcularTaxa(saque, cliente);
    }

    public abstract Taxa efetuarCalculo(SaqueRequest saque, Cliente cliente);
    public abstract boolean deveAplicar(SaqueRequest saque, Cliente cliente);
}
