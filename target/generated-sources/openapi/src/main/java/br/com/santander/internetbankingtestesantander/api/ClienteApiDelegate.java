package br.com.santander.internetbankingtestesantander.api;

import br.com.santander.internetbankingtestesantander.model.Cliente;
import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
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
 * A delegate to be called by the {@link ClienteApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T15:24:37.976189-03:00[America/Sao_Paulo]")
public interface ClienteApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /cliente : Cadastrar um novo Cliente
     * Cadastrar um novo Cliente
     *
     * @param cliente Para que o cadastro seja realizado, deverá ser enviado no body do request as seguintes informações. (required)
     * @return Retornará sucesso e o cliente que foi salvo (status code 200)
     * @see ClienteApi#cadastrarCliente
     */
    default ResponseEntity<ClienteResponse> cadastrarCliente(Cliente cliente) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"numeroConta\" : \"numeroConta\", \"nome\" : \"nome\", \"id\" : 0, \"saldo\" : 6.027456183070403, \"dataNascimento\" : \"dataNascimento\", \"planoExclusive\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
