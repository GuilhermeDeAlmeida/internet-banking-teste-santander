package br.com.santander.internetbankingtestesantander.delegate;

import br.com.santander.internetbankingtestesantander.api.ValoresApiDelegate;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorRequest;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorResponse;
import br.com.santander.internetbankingtestesantander.service.ValoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ValoresDelegateImpl implements ValoresApiDelegate {

    private final ValoresService valoresService;

    public ValoresDelegateImpl(ValoresService valoresService) {
        this.valoresService = valoresService;
    }

    @Override
    public ResponseEntity<OperacaoValorResponse> depositarValor(OperacaoValorRequest operacaoValorRequest) {
        return ResponseEntity.ok(valoresService.depositarValor(operacaoValorRequest));
    }

    @Override
    public ResponseEntity<OperacaoValorResponse> sacarValor(OperacaoValorRequest operacaoValorRequest) {
        return ResponseEntity.ok(valoresService.sacarValor(operacaoValorRequest));
    }
}
