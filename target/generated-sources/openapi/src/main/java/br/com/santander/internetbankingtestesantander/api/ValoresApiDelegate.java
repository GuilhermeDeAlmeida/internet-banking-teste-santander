package br.com.santander.internetbankingtestesantander.api;

import br.com.santander.internetbankingtestesantander.model.OperacaoValorRequest;
import br.com.santander.internetbankingtestesantander.model.OperacaoValorResponse;
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
 * A delegate to be called by the {@link ValoresApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T18:51:37.779014-03:00[America/Sao_Paulo]")
public interface ValoresApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /valores/depositar : Depósito de um valor na conta de um cliente.
     * Recurso disponibilizado para depositar um valor na conta de um Cliente.
     *
     * @param operacaoValorRequest Deve ser enviado o valor a ser DEPOSITADO, e a conta do cliente onde a operação será realizada. (required)
     * @return This is description (status code 200)
     * @see ValoresApi#depositarValor
     */
    default ResponseEntity<OperacaoValorResponse> depositarValor(OperacaoValorRequest operacaoValorRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"contaCliente\" : \"contaCliente\", \"novoSaldo\" : 0.8008281904610115 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /valores/sacar : Saque de valor da conta de um cliente.
     * Recurso disponibilizado para sacar um valor da conta de um Cliente.
     *
     * @param operacaoValorRequest Deve ser enviado o valor o valor a ser SACADO, e a conta do cliente onde a operação será realizada. Sujeito a taxa administrativa definida em regra de negócio. (required)
     * @return This is description (status code 200)
     * @see ValoresApi#sacarValor
     */
    default ResponseEntity<OperacaoValorResponse> sacarValor(OperacaoValorRequest operacaoValorRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"contaCliente\" : \"contaCliente\", \"novoSaldo\" : 0.8008281904610115 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
