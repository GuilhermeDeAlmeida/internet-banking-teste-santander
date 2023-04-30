package br.com.santander.internetbankingtestesantander.delegate;

import br.com.santander.internetbankingtestesantander.api.TransacoesApiDelegate;
import br.com.santander.internetbankingtestesantander.model.TransacaoResponse;
import br.com.santander.internetbankingtestesantander.service.TransacoesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransacoesDelegateImpl implements TransacoesApiDelegate {
    private final TransacoesService transacoesService;

    public TransacoesDelegateImpl(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @Override
    public ResponseEntity<TransacaoResponse> obterHistoricoTransacoes(String dataTransacoes, String tipoOperacao) {
        return ResponseEntity.ok(transacoesService.obterHistoricoTransacoes(dataTransacoes, tipoOperacao));
    }


}
