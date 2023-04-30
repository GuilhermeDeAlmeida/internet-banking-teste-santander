package br.com.santander.internetbankingtestesantander.api;

import br.com.santander.internetbankingtestesantander.model.TransacaoResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TransacoesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-29T22:46:19.991721-03:00[America/Sao_Paulo]")
public interface TransacoesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /transacoes/historico/{dataTransacoes} : Obter histórico de transações
     * Obter historico de transações em determinada data, para cada tipo de operação,(depósito ou saque), caso não seja preenchido será retornada resposta para ambas as operações.
     *
     * @param dataTransacoes Data em que se deseja obter as movimentações. (required)
     * @param tipoOperacao Tipo de operação a ser consultada. (optional)
     * @return Retornará uma lista de transações (status code 200)
     * @see TransacoesApi#obterHistoricoTransacoes
     */
    default ResponseEntity<TransacaoResponse> obterHistoricoTransacoes(String dataTransacoes,
        String tipoOperacao) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"listaTransacoes\" : [ { \"valor\" : 0.8008281904610115, \"conta\" : \"conta\", \"novoSaldo\" : 6.027456183070403 }, { \"valor\" : 0.8008281904610115, \"conta\" : \"conta\", \"novoSaldo\" : 6.027456183070403 } ], \"tipoMovimentacao\" : \"tipoMovimentacao\", \"dataMovimentacao\" : \"dataMovimentacao\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
