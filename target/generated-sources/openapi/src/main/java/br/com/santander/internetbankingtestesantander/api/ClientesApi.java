/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package br.com.santander.internetbankingtestesantander.api;

import br.com.santander.internetbankingtestesantander.model.ClienteResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T15:24:37.976189-03:00[America/Sao_Paulo]")
@Validated
@Api(value = "clientes", description = "the clientes API")
public interface ClientesApi {

    default ClientesApiDelegate getDelegate() {
        return new ClientesApiDelegate() {};
    }

    /**
     * GET /clientes : Obter lista Clientes.
     * Obter lista de todos os Clientes cadastrados
     *
     * @return Sucesso ao obter a lista de todos os clientes cadastrados no sistema. (status code 200)
     */
    @ApiOperation(value = "Obter lista Clientes.", nickname = "obterListaClientes", notes = "Obter lista de todos os Clientes cadastrados", response = ClienteResponse.class, responseContainer = "List", tags={ "Clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao obter a lista de todos os clientes cadastrados no sistema.", response = ClienteResponse.class, responseContainer = "List") })
    @GetMapping(
        value = "/clientes",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ClienteResponse>> obterListaClientes() {
        return getDelegate().obterListaClientes();
    }

}
